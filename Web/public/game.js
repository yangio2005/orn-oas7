const socket = io();

socket.on('connect', () => {
    console.log('Đã kết nối tới server!', socket.id);
});

class GameScene extends Phaser.Scene {
    constructor() {
        super('GameScene');
        this.player = null; // Initialize player property
        this.playerSpeed = 5; // Define player speed

        // Joystick properties
        this.joystickBase = null;
        this.joystickThumb = null;
        this.joystickPointerId = -1; // To track the specific pointer touching the joystick
        this.joystickActive = false;
        this.joystickCenter = new Phaser.Math.Vector2();
        this.joystickRadius = 80;
    }

    preload() {
        // Nơi để tải tài nguyên game (hình ảnh, âm thanh)
        this.load.image('player', 'assets/player.png');
    }

    create() {
        // Nơi để vẽ các đối tượng game ban đầu
        this.player = this.physics.add.image(400, 300, 'player');

        // Conditional display for joystick or keyboard
        if (this.sys.game.device.input.touch) {
            this.joystickCenter.set(150, 450); // Example position

            this.joystickBase = this.add.circle(this.joystickCenter.x, this.joystickCenter.y, this.joystickRadius, 0x888888, 0.5)
                .setInteractive()
                .setScrollFactor(0);

            this.joystickThumb = this.add.circle(this.joystickCenter.x, this.joystickCenter.y, this.joystickRadius / 2, 0xcccccc, 0.8)
                .setScrollFactor(0);

            this.input.on('pointerdown', this.onJoystickDown, this);
            this.input.on('pointerup', this.onJoystickUp, this);
            this.input.on('pointermove', this.onJoystickMove, this);
        } else {
            // Keep keyboard controls for non-touch devices
            this.cursors = this.input.keyboard.createCursorKeys();
        }
    }

    onJoystickDown(pointer) {
        if (this.joystickBase.getBounds().contains(pointer.x, pointer.y)) {
            this.joystickActive = true;
            this.joystickPointerId = pointer.id;
            this.joystickThumb.x = pointer.x;
            this.joystickThumb.y = pointer.y;
            console.log('Joystick active');
        }
    }

    onJoystickUp(pointer) {
        if (pointer.id === this.joystickPointerId) {
            this.joystickActive = false;
            this.joystickPointerId = -1;
            this.joystickThumb.setPosition(this.joystickCenter.x, this.joystickCenter.y);
            console.log('Joystick inactive');
        }
    }

    onJoystickMove(pointer) {
        if (this.joystickActive && pointer.id === this.joystickPointerId) {
            let distance = Phaser.Math.Distance.Between(this.joystickCenter.x, this.joystickCenter.y, pointer.x, pointer.y);
            let angle = Phaser.Math.Angle.Between(this.joystickCenter.x, this.joystickCenter.y, pointer.x, pointer.y);

            if (distance > this.joystickRadius) {
                pointer.x = this.joystickCenter.x + Math.cos(angle) * this.joystickRadius;
                pointer.y = this.joystickCenter.y + Math.sin(angle) * this.joystickRadius;
            }

            this.joystickThumb.x = pointer.x;
            this.joystickThumb.y = pointer.y;
            console.log('Joystick move:', distance, angle);
        }
    }

    update() {
        // Vòng lặp game, được gọi liên tục
        if (this.joystickActive) {
            let angle = Phaser.Math.Angle.Between(this.joystickCenter.x, this.joystickCenter.y, this.joystickThumb.x, this.joystickThumb.y);
            let distance = Phaser.Math.Distance.Between(this.joystickCenter.x, this.joystickCenter.y, this.joystickThumb.x, this.joystickThumb.y);
            let speed = this.playerSpeed * (distance / this.joystickRadius); // Scale speed by distance from center

            this.player.x += Math.cos(angle) * speed;
            this.player.y += Math.sin(angle) * speed;
        } else if (this.cursors) { // Check if cursors exist (keyboard enabled)
            if (this.cursors.left.isDown) {
                this.player.x -= this.playerSpeed;
            } else if (this.cursors.right.isDown) {
                this.player.x += this.playerSpeed;
            }

            if (this.cursors.up.isDown) {
                this.player.y -= this.playerSpeed;
            } else if (this.cursors.down.isDown) {
                this.player.y += this.playerSpeed;
            }
        }
    }
}

const config = {
    type: Phaser.AUTO,
    width: 800,
    height: 600,
    backgroundColor: '#ADD8E6',
    physics: {
        default: 'arcade',
        arcade: {
            gravity: { y: 0 }
        }
    },
    scale: { // Added scale configuration
        mode: Phaser.Scale.FIT,
        autoCenter: Phaser.Scale.CENTER_BOTH,
        orientation: Phaser.Scale.LANDSCAPE
    },
    scene: [GameScene]
};

const game = new Phaser.Game(config);