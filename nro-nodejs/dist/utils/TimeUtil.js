"use strict";
// import moment from 'moment'; // Using moment or native Date
Object.defineProperty(exports, "__esModule", { value: true });
exports.TimeUtil = void 0;
class TimeUtil {
    static diffDate(d1, d2, type) {
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
    static getCurrDay() {
        return new Date().getDay();
    }
    static getCurrHour() {
        return new Date().getHours();
    }
    static getCurrMin() {
        return new Date().getMinutes();
    }
    static getTimeLeft(lastTime, secondTarget) {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0) {
            secondsLeft = 10;
        }
        return secondsLeft > 60 ? Math.floor(secondsLeft / 60) + " phút" : secondsLeft + " giây";
    }
    static getMinLeft(lastTime, secondTarget) {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0)
            secondsLeft = 0;
        return secondsLeft > 60 ? Math.floor(secondsLeft / 60) : (secondsLeft > 0 ? 1 : 0);
    }
    static getSecondLeft(lastTime, secondTarget) {
        const secondPassed = Math.floor((Date.now() - lastTime) / 1000);
        let secondsLeft = secondTarget - secondPassed;
        if (secondsLeft < 0)
            secondsLeft = 0;
        return secondsLeft;
    }
    static getTimeNow(format) {
        // Simple implementation for now, ideally use moment or date-fns for complex formatting if needed
        const now = new Date();
        return this.formatTime(now, format);
    }
    static formatTime(time, format) {
        const date = typeof time === 'number' ? new Date(time) : time;
        // Basic replacement for simple formats like "yyyy-MM-dd HH:mm:ss"
        // For full SimpleDateFormat support, we should ideally use a library like date-fns
        // Here is a simple manual implementation for common components
        const pad = (n) => n < 10 ? '0' + n : n;
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
exports.TimeUtil = TimeUtil;
TimeUtil.SECOND = 1;
TimeUtil.MINUTE = 2;
TimeUtil.HOUR = 3;
TimeUtil.DAY = 4;
TimeUtil.WEEK = 5;
TimeUtil.MONTH = 6;
TimeUtil.YEAR = 7;
