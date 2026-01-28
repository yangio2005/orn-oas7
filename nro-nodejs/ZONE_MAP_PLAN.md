# 🎯 NEXT STEP: Implement Zone & Map System

## ❌ Vấn đề hiện tại:
Player login thành công nhưng **KHÔNG VÀO ĐƯỢC MAP** vì:
- Chưa có Zone system
- Chưa có Map system  
- Chưa gọi `player.zone.load_Me_To_Another(player)`
- Chưa gọi `player.zone.mapInfo(player)`

## ✅ Giải pháp:

### Phase 1: Create Basic Zone & Map Models

#### 1. Create `src/models/map/Zone.ts`
**Port từ**: `Zone.java` (706 lines)

**Core methods cần implement**:
```typescript
class Zone {
    map: Map;
    zoneId: number;
    maxPlayer: number;
    players: Player[] = [];
    mobs: Mob[] = [];
    items: ItemMap[] = [];
    
    // CRITICAL METHODS:
    addPlayer(player: Player): void
    removePlayer(player: Player): void
    load_Me_To_Another(player: Player): void  // Line 431-454
    load_Another_To_Me(player: Player): void  // Line 456-476
    mapInfo(player: Player): void             // Line 588-691 ⭐ QUAN TRỌNG NHẤT!
}
```

#### 2. Create `src/models/map/Map.ts`
**Cần có**:
```typescript
class Map {
    mapId: number;
    mapName: string;
    planetId: number;
    tileId: number;
    bgId: number;
    type: number;
    bgType: number;
    zones: Zone[] = [];
    wayPoints: WayPoint[] = [];
}
```

#### 3. Create `src/models/map/WayPoint.ts`
```typescript
class WayPoint {
    minX: number;
    minY: number;
    maxX: number;
    maxY: number;
    isEnter: boolean;
    isOffline: boolean;
    name: string;
}
```

### Phase 2: Update Player Model

```typescript
// src/models/Player.ts
class Player {
    // ... existing fields
    zone: Zone | null = null;
    location: {
        x: number;
        y: number;
    } = { x: 0, y: 0 };
}
```

### Phase 3: Update Controller.sendInfo()

```typescript
// src/server/Controller.ts - sendInfo()
public sendInfo(session: Session): void {
    const player = session.player;
    if (!player) return;

    try {
        // -82 set tile map
        DataGame.sendTileSetInfo(session);

        // ... other info ...

        // ⭐ CRITICAL: Load player vào map
        if (player.zone) {
            player.zone.load_Me_To_Another(player);
            player.zone.mapInfo(player);
        }

        Logger.info(`Player ${player.name} logged in successfully`);
    } catch (e) {
        Logger.error("Error in sendInfo: " + e);
    }
}
```

### Phase 4: Initialize Player Zone on Login

```typescript
// src/services/AuthService.ts - login()
const player = await PlayerDAO.getPlayerByAccountId(accountId);

// Initialize player zone
const MapService = await import("../services/MapService");
const map = MapService.getInstance().getMapById(player.mapId || 0);
if (map) {
    player.zone = map.zones[0]; // Default zone 0
    player.zone.addPlayer(player);
}
```

---

## 📊 Implementation Priority:

### HIGH (Cần ngay):
1. ✅ Zone.ts - Basic structure
2. ✅ Map.ts - Basic structure
3. ✅ Zone.mapInfo() - Send map data to client
4. ✅ Zone.load_Me_To_Another() - Show player to others
5. ✅ Update Controller.sendInfo() - Call zone methods

### MEDIUM (Sau đó):
6. ⏳ Mob.ts - Mob model
7. ⏳ ItemMap.ts - Item on map model
8. ⏳ Zone.load_Another_To_Me() - Load other players
9. ⏳ MapService.ts - Manage all maps

### LOW (Cuối cùng):
10. ⏳ Zone.update() - Update loop
11. ⏳ Zone.pickItem() - Pick item logic
12. ⏳ Full mob/item system

---

## 🎯 Minimal Implementation (Để player vào được map):

```typescript
// Zone.ts - MINIMAL
export class Zone {
    map: any;
    zoneId: number;
    players: any[] = [];

    constructor(map: any, zoneId: number) {
        this.map = map;
        this.zoneId = zoneId;
    }

    addPlayer(player: any): void {
        if (!this.players.includes(player)) {
            this.players.push(player);
        }
    }

    load_Me_To_Another(player: any): void {
        // Send player info to other players in zone
        // TODO: Implement
    }

    mapInfo(player: any): void {
        const msg = new Message(-24);
        try {
            msg.writer.writeByte(this.map.mapId);
            msg.writer.writeByte(this.map.planetId || 0);
            msg.writer.writeByte(this.map.tileId || 0);
            msg.writer.writeByte(this.map.bgId || 0);
            msg.writer.writeByte(this.map.type || 0);
            msg.writer.writeUTF(this.map.mapName || "");
            msg.writer.writeByte(this.zoneId);
            
            msg.writer.writeShort(player.location?.x || 0);
            msg.writer.writeShort(player.location?.y || 0);
            
            // Waypoints (empty for now)
            msg.writer.writeByte(0);
            
            // Mobs (empty for now)
            msg.writer.writeByte(0);
            msg.writer.writeByte(0);
            
            // NPCs (empty for now)
            msg.writer.writeByte(0);
            
            // Items (empty for now)
            msg.writer.writeByte(0);
            
            // BG item (empty)
            msg.writer.writeShort(0);
            
            // Eff item (empty)
            msg.writer.writeShort(0);
            
            msg.writer.writeByte(this.map.bgType || 0);
            msg.writer.writeByte(0); // space ship
            msg.writer.writeByte(0);
            
            player.session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error sending mapInfo: " + e);
        }
    }
}
```

---

## 🚀 Action Plan:

**Bạn muốn tôi:**
1. **Implement MINIMAL** - Tạo Zone/Map tối thiểu để player vào được map
2. **Implement FULL** - Port toàn bộ Zone.java sang TypeScript
3. **Khác** - Đề xuất khác

Chọn nào? Tôi khuyến nghị **MINIMAL** để test nhanh! 🎯
