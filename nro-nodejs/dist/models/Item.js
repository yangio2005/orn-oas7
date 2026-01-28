"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ItemOption = exports.Item = void 0;
class Item {
    constructor() {
        this.id = -1;
        this.templateId = -1;
        this.quantity = 1;
        this.info = "";
        this.content = "";
        this.options = [];
        this.createTime = Date.now();
    }
    isNull() {
        return this.id === -1 && this.templateId === -1;
    }
}
exports.Item = Item;
class ItemOption {
    constructor(optionTemplateId, param) {
        this.optionTemplateId = optionTemplateId;
        this.param = param;
    }
    getOptionString() {
        // Todo: Map template to string
        return "";
    }
}
exports.ItemOption = ItemOption;
