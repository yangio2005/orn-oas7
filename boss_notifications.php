<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boss Notifications</title>
    <style>
        body {
            font-family: 'Courier New', Courier, monospace;
            background-color: #1a1a1a;
            color: #00ff00;
            margin: 20px;
            overflow-x: hidden;
        }
        .terminal {
            background-color: #000;
            border: 1px solid #00ff00;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 255, 0, 0.5);
            max-width: 800px;
            margin: 0 auto;
        }
        .terminal-header {
            color: #00ffff;
            margin-bottom: 15px;
            text-align: center;
            font-size: 1.2em;
        }
        .notification-item {
            margin-bottom: 10px;
            border-bottom: 1px dashed #008800;
            padding-bottom: 8px;
        }
        .notification-item:last-child {
            border-bottom: none;
            margin-bottom: 0;
            padding-bottom: 0;
        }
        .timestamp {
            color: #ffff00;
            font-size: 0.9em;
            margin-right: 10px;
        }
        .boss-name {
            color: #ff00ff;
            font-weight: bold;
        }
        .map-name {
            color: #00aaff;
        }
        .status {
            color: #ff8800;
            font-style: italic;
        }
        .details {
            color: #00ff00;
            white-space: pre-wrap; /* Preserve whitespace and wrap text */
            word-wrap: break-word; /* Break long words */
        }
        .no-notifications {
            text-align: center;
            color: #ff0000;
        }
    </style>
</head>
<body>
    <div class="terminal">
        <div class="terminal-header">Boss Notification Log</div>
        <?php
        $servername = "localhost";
        $username = "root";
        $password = ""; // Empty password
        $dbname = "mobi";

        // Create connection
        $conn = new mysqli($servername, $username, $password, $dbname);

        // Check connection
        if ($conn->connect_error) {
            die("<div class='no-notifications'>Connection failed: " . $conn->connect_error . "</div>");
        }

        $sql = "SELECT boss_name, map_name, notification_time, status, details FROM boss_notifications ORDER BY notification_time DESC LIMIT 50";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // Output data of each row
            while($row = $result->fetch_assoc()) {
                echo "<div class='notification-item'>";
                echo "<span class='timestamp'>" . $row["notification_time"] . "</span>";
                echo "<span class='boss-name'>" . htmlspecialchars($row["boss_name"]) . "</span> ";
                echo "<span class='map-name'>(" . htmlspecialchars($row["map_name"]) . ")</span> ";
                echo "<span class='status'>[" . htmlspecialchars($row["status"]) . "]</span><br>";
                echo "<div class='details'>" . htmlspecialchars($row["details"]) . "</div>";
                echo "</div>";
            }
        } else {
            echo "<div class='no-notifications'>No boss notifications found.</div>";
        }
        $conn->close();
        ?>
    </div>
</body>
</html>