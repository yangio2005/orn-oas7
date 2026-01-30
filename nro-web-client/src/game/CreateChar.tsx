import { useState } from 'react';
import { GameManager } from './GameManager';

interface CreateCharProps {
    onCancel: () => void;
}

const CreateChar: React.FC<CreateCharProps> = ({ onCancel }) => {
    const [name, setName] = useState('');
    const [gender, setGender] = useState(0); // 0: Trái Đất, 1: Namếc, 2: Xayda
    const [hair, setHair] = useState(0);

    const handleCreate = () => {
        if (name.length < 3) {
            alert('Tên phải từ 3 ký tự trở lên');
            return;
        }
        GameManager.getInstance().createCharacter(name, gender, hair);
    };

    const getRaceName = (g: number) => {
        switch (g) {
            case 0: return "Trái Đất";
            case 1: return "Namếc";
            case 2: return "Xayda";
            default: return "Unknown";
        }
    };

    return (
        <div className="create-char-container" style={{ padding: '20px', border: '1px solid #ccc', marginTop: '20px' }}>
            <h2>Tạo Nhân Vật Mới</h2>

            <div style={{ marginBottom: '10px' }}>
                <label>Tên nhân vật: </label>
                <input
                    type="text"
                    value={name}
                    onChange={(e) => setName(e.target.value)}
                    placeholder="Nhập tên..."
                />
            </div>

            <div style={{ marginBottom: '10px' }}>
                <label>Hành tinh: </label>
                <select value={gender} onChange={(e) => setGender(Number(e.target.value))}>
                    <option value={0}>Trái Đất</option>
                    <option value={1}>Namếc</option>
                    <option value={2}>Xayda</option>
                </select>
            </div>

            <div style={{ marginBottom: '10px' }}>
                <label>Kiểu tóc (Đầu): </label>
                {/* Simplified hair start based on gender? For now just numeric input or select */}
                <select value={hair} onChange={(e) => setHair(Number(e.target.value))}>
                    {/* These IDs depend on what headAvatars are available for each gender */}
                    {gender === 0 && (
                        <>
                            <option value={0}>Gohan</option>
                            <option value={1}>Krillin</option>
                            <option value={2}>Yamcha</option>
                        </>
                    )}
                    {gender === 1 && (
                        <>
                            <option value={3}>Piccolo</option>
                            <option value={4}>Ốc tiêu</option>
                            <option value={5}>Kami</option>
                        </>
                    )}
                    {gender === 2 && (
                        <>
                            <option value={6}>Cadic</option>
                            <option value={7}>Radic</option>
                            <option value={8}>Kakalot</option>
                        </>
                    )}
                </select>
            </div>

            <button onClick={handleCreate}>Tạo Nhân Vật</button>
            <button onClick={onCancel} style={{ marginLeft: '10px' }}>Quay lại</button>
        </div>
    );
};

export default CreateChar;
