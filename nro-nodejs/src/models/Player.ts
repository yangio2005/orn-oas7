export class Player {
    public id: number = -1;
    public name: string = "";
    public gender: number = 0;
    public head: number = -1;
    public body: number = -1;
    public leg: number = -1;
    public role: number = 0;

    public power: number = 0;
    public tiemNang: number = 0;
    public hp: number = 100;
    public mp: number = 100;
    public stamina: number = 1000;

    public location: {
        x: number;
        y: number;
        mapId: number;
        zoneId: number;
    } = { x: 0, y: 0, mapId: 0, zoneId: 0 };


    constructor() {

    }
}
