import { useRef, useEffect } from 'react';

const GameScreen = () => {
    const canvasRef = useRef<HTMLCanvasElement>(null);

    useEffect(() => {
        const canvas = canvasRef.current;
        if (!canvas) return;

        const ctx = canvas.getContext('2d');
        if (!ctx) return;

        // Resize canvas to full window
        const resize = () => {
            canvas.width = window.innerWidth;
            canvas.height = window.innerHeight;
        };
        window.addEventListener('resize', resize);
        resize();

        // Game Loop
        let animationFrameId: number;

        const render = () => {
            // Clear screen
            ctx.fillStyle = '#87CEEB'; // Sky blue background
            ctx.fillRect(0, 0, canvas.width, canvas.height);

            // Draw Ground (Demo)
            ctx.fillStyle = '#8B4513'; // SaddleBrown
            ctx.fillRect(0, canvas.height - 100, canvas.width, 100);

            // Draw "Assets" if available (Demo)
            // Try to load a known image from the copied assets
            // e.g. /assets/img_by_name/x1/panel.png

            // Draw Player (Placeholder)
            ctx.fillStyle = 'red';
            ctx.fillRect(canvas.width / 2 - 25, canvas.height - 150, 50, 50);
            ctx.fillStyle = 'white';
            ctx.font = '16px Arial';
            ctx.fillText("Player", canvas.width / 2 - 20, canvas.height - 160);

            animationFrameId = window.requestAnimationFrame(render);
        };

        render();

        return () => {
            window.removeEventListener('resize', resize);
            window.cancelAnimationFrame(animationFrameId);
        };
    }, []);

    return <canvas ref={canvasRef} style={{ display: 'block' }} />;
};

export default GameScreen;
