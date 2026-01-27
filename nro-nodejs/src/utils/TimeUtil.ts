
// import moment from 'moment'; // Using moment or native Date

export class TimeUtil {
    public static readonly SECOND = 1;
    public static readonly MINUTE = 2;
    public static readonly HOUR = 3;
    public static readonly DAY = 4;
    public static readonly WEEK = 5;
    public static readonly MONTH = 6;
    public static readonly YEAR = 7;

    public static diffDate(d1: Date, d2: Date, type: number): number {
        const timeDiff = Math.abs(d1.getTime() - d2.getTime());
        switch (type) {
            case this.SECOND:
                return Math.floor(timeDiff / 1000);
            case this.MINUTE:
                return Math.floor(timeDiff / (60 * 1000) % 60);
            case this.HOUR:
                return Math.floor(timeDiff / (60 * 60 * 1000) % 24);
            case this.DAY:
                return Math.floor(timeDiff / (24 * 60 * 60 * 1000));
            case this.WEEK:
                return Math.floor(timeDiff / (7 * 24 * 60 * 60 * 1000));
            case this.MONTH:
                return Math.floor(timeDiff / (30 * 24 * 60 * 60 * 1000));
            case this.YEAR:
                return Math.floor(timeDiff / (365 * 24 * 60 * 60 * 1000));
            default:
                return 0;
        }
    }

    public static getCurrDay(): number {
        return new Date().getDay();
    }

    public static getCurrHour(): number {
        return new Date().getHours();
    }

    public static getCurrMin(): number {
        return new Date().getMinutes();
    }

    public static getTimeLeft(lastTime: number, secondTarget: number): string {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0) {
            secondsLeft = 10;
        }
        return secondsLeft > 60 ? Math.floor(secondsLeft / 60) + " phút" : secondsLeft + " giây";
    }

    public static getMinLeft(lastTime: number, secondTarget: number): number {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0) secondsLeft = 0;
        return secondsLeft > 60 ? Math.floor(secondsLeft / 60) : (secondsLeft > 0 ? 1 : 0);
    }

    public static getSecondLeft(lastTime: number, secondTarget: number): number {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0) secondsLeft = 0;
        return secondsLeft;
    }

    public static getTimeNow(format: string): string {
        // Simple implementation for now, ideally use moment or date-fns for complex formatting if needed
        const now = new Date();
        return this.formatTime(now, format);
    }

    public static formatTime(time: Date | number, format: string): string {
        const date = typeof time === 'number' ? new Date(time) : time;
        // Basic replacement for simple formats like "yyyy-MM-dd HH:mm:ss"
        // For full SimpleDateFormat support, we should ideally use a library like date-fns
        // Here is a simple manual implementation for common components

        const pad = (n: number) => n < 10 ? '0' + n : n;

        let str = format;
        str = str.replace('yyyy', date.getFullYear().toString());
        str = str.replace('MM', pad(date.getMonth() + 1).toString());
        str = str.replace('dd', pad(date.getDate()).toString());
        str = str.replace('HH', pad(date.getHours()).toString());
        str = str.replace('mm', pad(date.getMinutes()).toString());
        str = str.replace('ss', pad(date.getSeconds()).toString());

        return str;
    }
}
