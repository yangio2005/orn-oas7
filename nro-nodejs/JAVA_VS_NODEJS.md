# So sánh Java vs Node.js - NRO Server

## 📋 Message Flow Comparison

### Java Flow (Đúng):

```
Client Connect
    ↓
CMD -27: Send Key
    ↓
CMD -29 (NOT_LOGIN)
    ├─ Sub 0: LOGIN
    │   └─ session.login(username, password)
    └─ Sub 2: CLIENT_TYPE
        └─ setClientType()
    
Login Success
    ↓
CMD -28 (NOT_MAP)
    ├─ Sub 2: CREATE_CHAR ← TẠO NHÂN VẬT Ở ĐÂY!
    │   └─ createChar(session, msg)
    ├─ Sub 6: UPDATE_MAP
    ├─ Sub 7: UPDATE_SKILL
    ├─ Sub 8: UPDATE_ITEM
    └─ Sub 13: CLIENT_OK
        └─ Load player vào map
```

### Node.js Flow (Hiện tại - SAI):

```
Client Connect
    ↓
CMD -27: Send Key ✅
    ↓
CMD -29 (NOT_LOGIN)
    ├─ Sub 0: LOGIN ✅
    ├─ Sub 1: CREATE_CHAR ❌ SAI! Không có trong Java!
    └─ Sub 2: CLIENT_TYPE ✅

❌ THIẾU: CMD -28 (NOT_MAP) handler!
```

---

## 🔧 Cần Fix:

### 1. **Xóa CREATE_CHAR khỏi `messageNotLogin`**
```typescript
// Controller.ts - messageNotLogin
case 0: // LOGIN ✅
case 2: // CLIENT_TYPE ✅
case 1: // CREATE_CHAR ❌ XÓA DÒNG NÀY!
```

### 2. **Thêm `messageNotMap` handler**
```typescript
// Controller.ts - onMessage
case Cmd.NOT_MAP: // -28
    this.messageNotMap(session, msg);
    break;
```

### 3. **Implement `messageNotMap`**
```typescript
private messageNotMap(session: Session, msg: Message): void {
    const cmd = msg.reader.readByte();
    switch (cmd) {
        case 2: // CREATE_CHAR
            const name = msg.reader.readString();
            const gender = msg.reader.readByte();
            const head = msg.reader.readByte();
            AuthService.getInstance().createCharacter(session, name, gender, head);
            break;
        case 6: // UPDATE_MAP
        case 7: // UPDATE_SKILL
        case 8: // UPDATE_ITEM
        case 13: // CLIENT_OK
            // TODO: Implement
            break;
    }
}
```

### 4. **Fix `sendInfo` sequence**
Theo Java code (line 781-850):

```typescript
public sendInfo(session: Session): void {
    const player = session.player;
    
    // -82 set tile map
    DataGame.sendTileSetInfo(session);
    
    // 112 my info intrinsic
    // TODO: IntrinsicService.sendInfoIntrinsic(player);
    
    // -42 my point
    Service.getInstance().point(player);
    
    // 40 task
    // TODO: TaskService.sendTaskMain(player);
    
    // -22 reset all (clear map)
    Service.getInstance().clearMap(player);
    
    // -53 my clan
    // TODO: ClanService.sendMyClan(player);
    
    // -69 max stamina
    // TODO: PlayerService.sendMaxStamina(player);
    
    // -68 cur stamina
    // TODO: PlayerService.sendCurrentStamina(player);
    
    // -107 have pet
    Service.getInstance().sendHavePet(player);
    
    // -119 top rank
    // TODO: Send top rank
    
    // -50 notify tab
    // TODO: ServerNotify.sendNotifyTab(player);
    
    // -24 join map - QUAN TRỌNG!
    player.zone.load_Me_To_Another(player);
    player.zone.mapInfo(player);
}
```

---

## 📊 Command Reference

| CMD | Java | Node.js | Status |
|-----|------|---------|--------|
| -27 | Send Key | ✅ | OK |
| -29 | NOT_LOGIN | ✅ | OK |
| -28 | NOT_MAP | ❌ | THIẾU! |
| -82 | Tile Set Info | ✅ | OK |
| -31 | Item BG Data | ✅ | OK |
| 112 | Intrinsic Info | ❌ | TODO |
| -42 | Player Point | ❌ | TODO |
| 40 | Task | ❌ | TODO |
| -22 | Clear Map | ❌ | TODO |
| -53 | Clan Info | ❌ | TODO |
| -69 | Max Stamina | ❌ | TODO |
| -68 | Cur Stamina | ❌ | TODO |
| -107 | Have Pet | ❌ | TODO |
| -119 | Top Rank | ❌ | TODO |
| -50 | Notify Tab | ❌ | TODO |
| -24 | Join Map | ❌ | TODO |

---

## 🎯 Priority Fix Order:

1. ✅ **HIGH**: Add CMD -28 (NOT_MAP) handler
2. ✅ **HIGH**: Move CREATE_CHAR to messageNotMap
3. ✅ **MEDIUM**: Implement basic sendInfo sequence
4. 🔄 **LOW**: Implement all TODO services

---

## 📝 Java Code Reference:

### MySession.java (line 135-215):
- Login flow
- Send version game
- Send data item BG
- Call Controller.sendInfo()

### Controller.java:
- Line 619-645: `messageNotLogin`
- Line 647-699: `messageNotMap` ← QUAN TRỌNG!
- Line 729-774: `createChar`
- Line 781-850: `sendInfo` ← FULL SEQUENCE!

---

## ✅ Action Items:

- [ ] Remove CREATE_CHAR from messageNotLogin (case 1)
- [ ] Add NOT_MAP handler in Controller.onMessage
- [ ] Implement messageNotMap method
- [ ] Move createCharacter logic to messageNotMap
- [ ] Complete sendInfo sequence
- [ ] Test with real client
