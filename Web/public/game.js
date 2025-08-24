const socket = io();

socket.on('connect', () => {
    console.log('Đã kết nối tới server!', socket.id);
});

class GameScene extends Phaser.Scene {
    constructor() {
        super('GameScene');
    }

    preload() {
        // Nơi để tải tài nguyên game (hình ảnh, âm thanh)
    }

    create() {
        // Nơi để vẽ các đối tượng game ban đầu
        this.add.text(400, 300, 'Hello Phaser!', { fontSize: '32px', fill: '#ffffff' }).setOrigin(0.5, 0.5);
    }

    update() {
        // Vòng lặp game, được gọi liên tục
    }
}

const config = {
    type: Phaser.AUTO,
    width: 800,
    height: 600,
    backgroundColor: '#000000',
    scene: [GameScene]
};

const game = new Phaser.Game(config);