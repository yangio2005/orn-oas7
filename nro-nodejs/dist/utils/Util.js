"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Util = void 0;
const crypto_1 = __importDefault(require("crypto"));
class Util {
    static nextInt(a, b) {
        if (b === undefined) {
            return Math.floor(Math.random() * a);
        }
        return a + Math.floor(Math.random() * (b - a + 1));
    }
    static getFormatNumber(hp) {
        return new Intl.NumberFormat('vi-VN').format(Math.floor(hp));
    }
    static numberToMoney(power) {
        const formatter = new Intl.NumberFormat('vi-VN', { maximumFractionDigits: 1 });
        if (power >= 1000000000) {
            return formatter.format(power / 1000000000) + " Tỷ";
        }
        else if (power >= 1000000) {
            return formatter.format(power / 1000000) + " Tr";
        }
        else if (power >= 1000) {
            return formatter.format(power / 1000) + " k";
        }
        else {
            return formatter.format(power);
        }
    }
    static msToTime(ms) {
        ms = ms - Date.now();
        if (ms < 0)
            ms = 0;
        let ss = Math.floor(ms / 1000);
        let mm = Math.floor(ss / 60);
        ss = ss % 60;
        let hh = Math.floor(mm / 60);
        mm = mm % 60;
        if (hh !== 0) {
            return `${hh} giờ, ${mm} phút, ${ss} giây`;
        }
        else if (mm !== 0) {
            return `${mm} phút, ${ss} giây`;
        }
        else if (ss !== 0) {
            return `${ss} giây`;
        }
        else {
            return "Hết hạn";
        }
    }
    static powerToString(power) {
        return this.numberToMoney(power);
    }
    static getDistance(x1, y1, x2, y2) {
        return Math.floor(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
    static md5(pass) {
        return crypto_1.default.createHash('md5').update(pass).digest('hex').toUpperCase();
    }
    static removeAccent(str) {
        return str.normalize("NFD").replace(/[\u0300-\u036f]/g, "")
            .replace(/đ/g, "d").replace(/Đ/g, "D");
    }
    static generateRandomText(len) {
        const chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        let sb = "";
        for (let i = 0; i < len; i++) {
            sb += chars.charAt(Math.floor(Math.random() * chars.length));
        }
        return sb;
    }
    static contains(arr, key) {
        return arr.includes(key);
    }
    static setTimeout(callback, delay) {
        setTimeout(callback, delay);
    }
    static currentTimeSec() {
        return Math.floor(Date.now() / 1000);
    }
    static isTrue(ratio, typeRatio) {
        let num = Util.nextInt(typeRatio);
        return num < ratio;
    }
}
exports.Util = Util;
