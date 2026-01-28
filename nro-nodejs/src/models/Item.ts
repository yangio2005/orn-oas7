
export class Item {
    public id: number = -1;
    public templateId: number = -1;
    public quantity: number = 1;
    public info: string = "";
    public content: string = "";
    public options: ItemOption[] = [];
    public createTime: number = Date.now();

    constructor() {
    }

    public isNull(): boolean {
        return this.id === -1 && this.templateId === -1;
    }
}

export class ItemOption {
    public optionTemplateId: number;
    public param: number;

    constructor(optionTemplateId: number, param: number) {
        this.optionTemplateId = optionTemplateId;
        this.param = param;
    }

    public getOptionString(): string {
        // Todo: Map template to string
        return "";
    }
}
