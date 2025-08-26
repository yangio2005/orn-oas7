import mysql.connector
import json

def clean_json_string(s):
    # Aggressively remove all backslashes and double quotes
    s = s.replace('\\', '').replace('"', '')
    
    # Attempt to parse as a list of lists of shorts
    try:
        parsed_data = json.loads(s)
        # Ensure it's a list of lists, even if it was a single list
        if isinstance(parsed_data, list) and all(isinstance(x, list) for x in parsed_data):
            return json.dumps(parsed_data)
        elif isinstance(parsed_data, list): # It's a single list, wrap it
            return json.dumps([parsed_data])
        else: # Not a list, return original for now
            return s
    except json.JSONDecodeError:
        # If it's still not valid JSON after aggressive cleaning,
        # try to force it into a list of lists format
        # This is a very aggressive heuristic and might lose data if the format is truly unexpected
        if s.startswith('[') and s.endswith(']'):
            # Assume it's a single list that needs to be wrapped
            return f'[[{s}]]';
        else:
            # If it doesn't even look like a list, wrap it as a single element in a list of lists
            return f'[[{s}]]';

def main():
    db_config = {
        'host': '127.0.0.1',
        'user': 'root',
        'password': 'admin1234',
        'database': 'real_data'
    }

    try:
        cnx = mysql.connector.connect(**db_config)
        cursor = cnx.cursor()

        # 1. Read all id and data from nr_part table
        cursor.execute("SELECT id, data FROM nr_part")
        rows = cursor.fetchall()

        updates = []
        for row in rows:
            item_id, raw_data = row
            if raw_data is None:
                continue

            cleaned_data = raw_data
            try:
                # Try to parse directly
                json.loads(cleaned_data)
            except json.JSONDecodeError:
                # If direct parse fails, try aggressive cleaning
                print(f"Debug: Raw data for ID {item_id}: {raw_data}")
                cleaned_data = clean_json_string(raw_data)
                print(f"Debug: Cleaned data (after aggressive replace) for ID {item_id}: {cleaned_data}")
                try:
                    json.loads(cleaned_data)
                except json.JSONDecodeError:
                    print(f"Warning: Could not clean and parse data for ID {item_id}: {raw_data}")
                    continue
            
            # Ensure the data is a valid JSON string for short[][]
            # The C# code expects short[][], so the JSON should be [[...],[...]]
            # If it's just [...], it needs to be wrapped again.
            if cleaned_data and not cleaned_data.startswith('[[') and cleaned_data.startswith('['):
                # This is a heuristic: if it starts with a single [ and is not already [[, wrap it
                cleaned_data = f'[{cleaned_data}]';

            updates.append((cleaned_data, item_id))

        # 3. Update the nr_part table with the cleaned data
        if updates:
            update_query = "UPDATE nr_part SET data = %s WHERE id = %s"
            cursor.executemany(update_query, updates)
            cnx.commit()
            print(f"Successfully updated {len(updates)} rows in nr_part table.")
        else:
            print("No updates needed for nr_part table.")

    except mysql.connector.Error as err:
        print(f"Error: {err}")
    finally:
        if 'cnx' in locals() and cnx.is_connected():
            cursor.close()
            cnx.close()

if __name__ == "__main__":
    main()
