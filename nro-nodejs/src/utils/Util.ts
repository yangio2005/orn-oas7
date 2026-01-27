
import crypto from 'crypto';

export class Util {
    public static nextInt(from: number, to: number): number;
    public static nextInt(max: number): number;
    public static nextInt(a: number, b?: number): number {
        if (b === undefined) {
            return Math.floor(Math.random() * a);
        }
        return a + Math.floor(Math.random() * (b - a + 1));
    }

    public static getFormatNumber(hp: number): string {
        return new Intl.NumberFormat('vi-VN').format(Math.floor(hp));
    }

    public static numberToMoney(power: number): string {
        const formatter = new Intl.NumberFormat('vi-VN', { maximumFractionDigits: 1 });
        if (power >= 1000000000) {
            return formatter.format(power / 1000000000) + " Tỷ";
        } else if (power >= 1000000) {
            return formatter.format(power / 1000000) + " Tr";
        } else if (power >= 1000) {
            return formatter.format(power / 1000) + " k";
        } else {
            return formatter.format(power);
        }
    }

    public static msToTime(ms: number): string {
        ms = ms - Date.now();
        if (ms < 0) ms = 0;
        let ss = Math.floor(ms / 1000);
        let mm = Math.floor(ss / 60);
        ss = ss % 60;
        let hh = Math.floor(mm / 60);
        mm = mm % 60;

        if (hh !== 0) {
            return `${hh} giờ, ${mm} phút, ${ss} giây`;
        } else if (mm !== 0) {
            return `${mm} phút, ${ss} giây`;
        } else if (ss !== 0) {
            return `${ss} giây`;
        } else {
            return "Hết hạn";
        }
    }

    public static powerToString(power: number): string {
        return this.numberToMoney(power);
    }

    public static getDistance(x1: number, y1: number, x2: number, y2: number): number {
        return Math.floor(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }

    public static md5(pass: string): string {
        return crypto.createHash('md5').update(pass).digest('hex').toUpperCase();
    }

    public static removeAccent(str: string): string {
        return str.normalize("NFD").replace(/[\u0300-\u036f]/g, "")
            .replace(/đ/g, "d").replace(/Đ/g, "D");
    }

    public static generateRandomText(len: number): string {
        const chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        let sb = "";
        for (let i = 0; i < len; i++) {
            sb += chars.charAt(Math.floor(Math.random() * chars.length));
        }
        return sb;
    }

    public static contains(arr: string[], key: string): boolean {
        return arr.includes(key);
    }

    public static setTimeout(callback: () => void, delay: number): void {
        setTimeout(callback, delay);
    }

    public static currentTimeSec(): number {
        return Math.floor(Date.now() / 1000);
    }

    public static isTrue(ratio: number, typeRatio: number): boolean {
        let num = Util.nextInt(typeRatio);
        return num < ratio;
    }

    // TODO: Port game logic specific methods (ItemMap, Player, Mob) once models are defined
    // public static ItemMap manhTS(...)
    // public static ItemMap ratiDTL(...)
    // public static checkDo(...)
}
