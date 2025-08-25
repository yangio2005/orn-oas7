import main.a;

public class aj {
  int a;
  
  int b;
  
  int c;
  
  int d;
  
  int e;
  
  int f;
  
  int g;
  
  int h;
  
  int i;
  
  int j;
  
  float k;
  
  long l;
  
  long m;
  
  boolean n;
  
  int[] o;
  
  int[] p;
  
  public aj(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.i = 0;
    this.j = 16711680;
    this.l = 0L;
    this.m = 150L;
    this.n = true;
    this.o = new int[2];
    this.p = new int[2];
    this.g = paramInt2;
    this.d = paramInt1;
    this.k = 1.0F;
    this.c = paramInt3;
    this.h = paramInt4;
    this.a = a.A;
    this.b = a.B;
    this.l = System.currentTimeMillis();
    for (paramInt3 = 0; paramInt3 < 2; paramInt3++) {
      this.o[paramInt3] = paramInt1;
      this.p[paramInt3] = paramInt2;
    } 
    this.j = paramInt5;
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    paramen.a(paramInt3);
    paramen.d(paramInt1, paramInt2, 1, 2);
  }
  
  public aj() {}
  
  public static void a(y paramy) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : B
    //   4: lookupswitch default -> 6616, -128 -> 336, -127 -> 2333, -126 -> 2338, -125 -> 4976, -124 -> 4068, -123 -> 3450, -122 -> 2424, -121 -> 3272, -120 -> 3252, -119 -> 3480, -117 -> 3494, -116 -> 3548, -115 -> 3568, -113 -> 3603, -111 -> 3654, -110 -> 5125, -106 -> 5266, -105 -> 5317, -103 -> 5373, -102 -> 5842, -101 -> 5886, -100 -> 5961, -89 -> 1890, 31 -> 1629, 42 -> 1910, 48 -> 1599, 51 -> 2167, 52 -> 1953, 93 -> 5245, 100 -> 3292, 101 -> 2893, 102 -> 2498, 113 -> 1509, 114 -> 1478, 121 -> 4028, 122 -> 3983, 123 -> 3839, 124 -> 3777, 125 -> 3727, 127 -> 540
    //   336: aload_0
    //   337: astore #71
    //   339: aload #71
    //   341: invokevirtual c : ()Ljava/io/DataInputStream;
    //   344: invokevirtual readByte : ()B
    //   347: istore #72
    //   349: aload #71
    //   351: invokevirtual c : ()Ljava/io/DataInputStream;
    //   354: invokevirtual readInt : ()I
    //   357: dup
    //   358: istore #73
    //   360: invokestatic e : ()Laf;
    //   363: getfield J : I
    //   366: if_icmpne -> 377
    //   369: invokestatic e : ()Laf;
    //   372: astore #74
    //   374: goto -> 384
    //   377: iload #73
    //   379: invokestatic b : (I)Laf;
    //   382: astore #74
    //   384: iload #72
    //   386: ifne -> 474
    //   389: aload #71
    //   391: invokevirtual c : ()Ljava/io/DataInputStream;
    //   394: invokevirtual readShort : ()S
    //   397: istore #75
    //   399: aload #71
    //   401: invokevirtual c : ()Ljava/io/DataInputStream;
    //   404: invokevirtual readByte : ()B
    //   407: istore #76
    //   409: aload #71
    //   411: invokevirtual c : ()Ljava/io/DataInputStream;
    //   414: invokevirtual readByte : ()B
    //   417: istore #77
    //   419: aload #71
    //   421: invokevirtual c : ()Ljava/io/DataInputStream;
    //   424: invokevirtual readShort : ()S
    //   427: istore #78
    //   429: aload #71
    //   431: invokevirtual c : ()Ljava/io/DataInputStream;
    //   434: invokevirtual readByte : ()B
    //   437: istore #79
    //   439: aload #74
    //   441: ifnonnull -> 447
    //   444: goto -> 6618
    //   447: aload #74
    //   449: new ea
    //   452: dup
    //   453: iload #75
    //   455: aload #74
    //   457: iload #76
    //   459: iload #77
    //   461: iload #78
    //   463: iload #79
    //   465: invokespecial <init> : (ILaf;IIIB)V
    //   468: invokevirtual a : (Lea;)V
    //   471: goto -> 6618
    //   474: iload #72
    //   476: iconst_1
    //   477: if_icmpne -> 509
    //   480: aload #71
    //   482: invokevirtual c : ()Ljava/io/DataInputStream;
    //   485: invokevirtual readShort : ()S
    //   488: istore #75
    //   490: aload #74
    //   492: ifnonnull -> 498
    //   495: goto -> 6618
    //   498: aload #74
    //   500: iconst_0
    //   501: iload #75
    //   503: invokevirtual b : (II)V
    //   506: goto -> 6618
    //   509: iload #72
    //   511: iconst_2
    //   512: if_icmpne -> 539
    //   515: aload #74
    //   517: ifnonnull -> 523
    //   520: goto -> 6618
    //   523: aload #74
    //   525: iconst_m1
    //   526: iconst_0
    //   527: invokevirtual b : (II)V
    //   530: goto -> 6618
    //   533: dup
    //   534: astore #72
    //   536: invokevirtual printStackTrace : ()V
    //   539: return
    //   540: aload_0
    //   541: astore #71
    //   543: aload #71
    //   545: invokevirtual c : ()Ljava/io/DataInputStream;
    //   548: invokevirtual readByte : ()B
    //   551: dup
    //   552: istore #72
    //   554: ifne -> 1112
    //   557: invokestatic a : ()Laq;
    //   560: pop
    //   561: new el
    //   564: dup
    //   565: ldc ''
    //   567: invokespecial <init> : (Ljava/lang/String;)V
    //   570: astore #73
    //   572: aload #71
    //   574: invokevirtual c : ()Ljava/io/DataInputStream;
    //   577: invokevirtual readShort : ()S
    //   580: istore #74
    //   582: iconst_0
    //   583: istore #75
    //   585: iconst_0
    //   586: istore #76
    //   588: goto -> 1090
    //   591: new ef
    //   594: dup
    //   595: invokespecial <init> : ()V
    //   598: astore #77
    //   600: aload #71
    //   602: invokevirtual c : ()Ljava/io/DataInputStream;
    //   605: invokevirtual readShort : ()S
    //   608: istore #78
    //   610: iload #76
    //   612: iconst_1
    //   613: iadd
    //   614: istore #79
    //   616: aload #71
    //   618: invokevirtual c : ()Ljava/io/DataInputStream;
    //   621: invokevirtual readShort : ()S
    //   624: istore #80
    //   626: aload #71
    //   628: invokevirtual c : ()Ljava/io/DataInputStream;
    //   631: invokevirtual readByte : ()B
    //   634: istore #81
    //   636: aload #71
    //   638: invokevirtual c : ()Ljava/io/DataInputStream;
    //   641: invokevirtual readByte : ()B
    //   644: istore #82
    //   646: aload #71
    //   648: invokevirtual c : ()Ljava/io/DataInputStream;
    //   651: invokevirtual readByte : ()B
    //   654: istore #83
    //   656: iconst_m1
    //   657: istore #84
    //   659: aconst_null
    //   660: astore #85
    //   662: aload #71
    //   664: invokevirtual c : ()Ljava/io/DataInputStream;
    //   667: invokevirtual readByte : ()B
    //   670: dup
    //   671: istore #86
    //   673: ifne -> 689
    //   676: aload #71
    //   678: invokevirtual c : ()Ljava/io/DataInputStream;
    //   681: invokevirtual readShort : ()S
    //   684: istore #84
    //   686: goto -> 785
    //   689: aload #71
    //   691: invokevirtual c : ()Ljava/io/DataInputStream;
    //   694: invokevirtual readShort : ()S
    //   697: istore #87
    //   699: aload #71
    //   701: invokevirtual c : ()Ljava/io/DataInputStream;
    //   704: invokevirtual readShort : ()S
    //   707: istore #88
    //   709: aload #71
    //   711: invokevirtual c : ()Ljava/io/DataInputStream;
    //   714: invokevirtual readShort : ()S
    //   717: istore #89
    //   719: aload #71
    //   721: invokevirtual c : ()Ljava/io/DataInputStream;
    //   724: invokevirtual readShort : ()S
    //   727: istore #90
    //   729: iload #87
    //   731: iload #88
    //   733: iload #89
    //   735: iload #90
    //   737: istore #99
    //   739: istore #98
    //   741: istore #97
    //   743: istore #96
    //   745: new af
    //   748: dup
    //   749: invokespecial <init> : ()V
    //   752: dup
    //   753: astore #100
    //   755: iload #96
    //   757: putfield bU : I
    //   760: aload #100
    //   762: iload #97
    //   764: putfield bW : I
    //   767: aload #100
    //   769: iload #98
    //   771: putfield bV : I
    //   774: aload #100
    //   776: iload #99
    //   778: putfield bX : I
    //   781: aload #100
    //   783: astore #85
    //   785: aload #71
    //   787: invokevirtual c : ()Ljava/io/DataInputStream;
    //   790: invokevirtual readUTF : ()Ljava/lang/String;
    //   793: astore #87
    //   795: aload #71
    //   797: invokevirtual c : ()Ljava/io/DataInputStream;
    //   800: invokevirtual readUTF : ()Ljava/lang/String;
    //   803: astore #88
    //   805: aload #71
    //   807: invokevirtual c : ()Ljava/io/DataInputStream;
    //   810: invokevirtual readByte : ()B
    //   813: istore #89
    //   815: aload #71
    //   817: invokevirtual c : ()Ljava/io/DataInputStream;
    //   820: invokevirtual readByte : ()B
    //   823: istore #90
    //   825: aload #71
    //   827: invokevirtual c : ()Ljava/io/DataInputStream;
    //   830: invokevirtual readByte : ()B
    //   833: istore #91
    //   835: aconst_null
    //   836: astore #92
    //   838: iload #91
    //   840: ifeq -> 910
    //   843: iload #91
    //   845: anewarray ee
    //   848: astore #92
    //   850: iconst_0
    //   851: istore #93
    //   853: goto -> 902
    //   856: invokestatic a : ()Lac;
    //   859: pop
    //   860: aload #71
    //   862: invokestatic b : (Ly;)Lee;
    //   865: astore #94
    //   867: aload #71
    //   869: invokevirtual c : ()Ljava/io/DataInputStream;
    //   872: invokevirtual readByte : ()B
    //   875: istore #95
    //   877: aload #94
    //   879: ifnull -> 899
    //   882: aload #92
    //   884: iload #93
    //   886: aload #94
    //   888: aastore
    //   889: aload #92
    //   891: iload #93
    //   893: aaload
    //   894: iload #95
    //   896: putfield b : B
    //   899: iinc #93, 1
    //   902: iload #93
    //   904: aload #92
    //   906: arraylength
    //   907: if_icmplt -> 856
    //   910: aload #77
    //   912: iload #78
    //   914: iload #79
    //   916: iload #80
    //   918: iload #81
    //   920: iload #86
    //   922: iload #84
    //   924: aload #87
    //   926: aload #88
    //   928: aload #85
    //   930: aload #92
    //   932: astore #106
    //   934: astore #105
    //   936: astore #104
    //   938: astore #103
    //   940: istore #102
    //   942: istore #101
    //   944: istore #100
    //   946: istore #99
    //   948: istore #98
    //   950: istore #97
    //   952: dup
    //   953: astore #96
    //   955: iload #97
    //   957: putfield e : I
    //   960: aload #96
    //   962: iload #98
    //   964: putfield f : I
    //   967: aload #96
    //   969: iload #99
    //   971: putfield g : I
    //   974: aload #96
    //   976: iload #100
    //   978: putfield a : B
    //   981: aload #96
    //   983: iload #101
    //   985: putfield d : B
    //   988: iload #102
    //   990: iconst_m1
    //   991: if_icmpeq -> 1016
    //   994: aload #96
    //   996: new aa
    //   999: dup
    //   1000: invokespecial <init> : ()V
    //   1003: putfield m : Laa;
    //   1006: aload #96
    //   1008: getfield m : Laa;
    //   1011: iload #102
    //   1013: putfield C : I
    //   1016: aload #96
    //   1018: aload #103
    //   1020: putfield h : Ljava/lang/String;
    //   1023: aload #96
    //   1025: aload #104
    //   1027: putfield i : Ljava/lang/String;
    //   1030: aload #96
    //   1032: aload #105
    //   1034: putfield l : Laf;
    //   1037: aload #96
    //   1039: aload #106
    //   1041: putfield n : [Lee;
    //   1044: aload #96
    //   1046: invokevirtual a : ()V
    //   1049: aload #77
    //   1051: iload #89
    //   1053: invokevirtual a : (B)V
    //   1056: aload #77
    //   1058: iload #90
    //   1060: invokevirtual b : (B)V
    //   1063: aload #77
    //   1065: iload #82
    //   1067: iload #83
    //   1069: invokevirtual a : (BB)V
    //   1072: aload #73
    //   1074: aload #77
    //   1076: invokevirtual addElement : (Ljava/lang/Object;)V
    //   1079: iload #89
    //   1081: ifle -> 1087
    //   1084: iinc #75, 1
    //   1087: iinc #76, 1
    //   1090: iload #76
    //   1092: iload #74
    //   1094: if_icmplt -> 591
    //   1097: invokestatic a : ()Laq;
    //   1100: aload #73
    //   1102: iload #75
    //   1104: iload #74
    //   1106: invokevirtual a : (Lel;II)V
    //   1109: goto -> 6618
    //   1112: iload #72
    //   1114: iconst_1
    //   1115: if_icmpne -> 1168
    //   1118: aload #71
    //   1120: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1123: invokevirtual readShort : ()S
    //   1126: istore #73
    //   1128: aload #71
    //   1130: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1133: invokevirtual readByte : ()B
    //   1136: istore #74
    //   1138: getstatic aq.f : Lel;
    //   1141: iload #73
    //   1143: invokestatic a : (Lel;I)Lef;
    //   1146: ifnull -> 1162
    //   1149: getstatic aq.f : Lel;
    //   1152: iload #73
    //   1154: invokestatic a : (Lel;I)Lef;
    //   1157: iload #74
    //   1159: invokevirtual b : (B)V
    //   1162: invokestatic e : ()V
    //   1165: goto -> 6618
    //   1168: iload #72
    //   1170: iconst_2
    //   1171: if_icmpne -> 1300
    //   1174: aload #71
    //   1176: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1179: invokevirtual readShort : ()S
    //   1182: istore #73
    //   1184: aload #71
    //   1186: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1189: invokevirtual readByte : ()B
    //   1192: istore #74
    //   1194: iconst_0
    //   1195: istore #75
    //   1197: iconst_0
    //   1198: istore #76
    //   1200: goto -> 1251
    //   1203: getstatic aq.f : Lel;
    //   1206: iload #76
    //   1208: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1211: checkcast ef
    //   1214: dup
    //   1215: astore #77
    //   1217: ifnull -> 1248
    //   1220: aload #77
    //   1222: getfield e : I
    //   1225: iload #73
    //   1227: if_icmpne -> 1237
    //   1230: aload #77
    //   1232: iload #74
    //   1234: invokevirtual a : (B)V
    //   1237: aload #77
    //   1239: getfield j : B
    //   1242: ifle -> 1248
    //   1245: iinc #75, 1
    //   1248: iinc #76, 1
    //   1251: iload #76
    //   1253: getstatic aq.f : Lel;
    //   1256: invokevirtual size : ()I
    //   1259: if_icmplt -> 1203
    //   1262: iload #75
    //   1264: getstatic aq.f : Lel;
    //   1267: invokevirtual size : ()I
    //   1270: invokestatic a : (II)V
    //   1273: getstatic aq.g : Lel;
    //   1276: iload #73
    //   1278: invokestatic a : (Lel;I)Lef;
    //   1281: ifnull -> 1477
    //   1284: getstatic aq.g : Lel;
    //   1287: iload #73
    //   1289: invokestatic a : (Lel;I)Lef;
    //   1292: iload #74
    //   1294: invokevirtual a : (B)V
    //   1297: goto -> 6618
    //   1300: iload #72
    //   1302: iconst_3
    //   1303: if_icmpne -> 1391
    //   1306: aload #71
    //   1308: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1311: invokevirtual readShort : ()S
    //   1314: istore #73
    //   1316: aload #71
    //   1318: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1321: invokevirtual readByte : ()B
    //   1324: istore #74
    //   1326: aload #71
    //   1328: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1331: invokevirtual readByte : ()B
    //   1334: istore #75
    //   1336: getstatic aq.f : Lel;
    //   1339: iload #73
    //   1341: invokestatic a : (Lel;I)Lef;
    //   1344: ifnull -> 1362
    //   1347: getstatic aq.f : Lel;
    //   1350: iload #73
    //   1352: invokestatic a : (Lel;I)Lef;
    //   1355: iload #74
    //   1357: iload #75
    //   1359: invokevirtual a : (BB)V
    //   1362: getstatic aq.g : Lel;
    //   1365: iload #73
    //   1367: invokestatic a : (Lel;I)Lef;
    //   1370: ifnull -> 1477
    //   1373: getstatic aq.g : Lel;
    //   1376: iload #73
    //   1378: invokestatic a : (Lel;I)Lef;
    //   1381: iload #74
    //   1383: iload #75
    //   1385: invokevirtual a : (BB)V
    //   1388: goto -> 6618
    //   1391: iload #72
    //   1393: iconst_4
    //   1394: if_icmpne -> 1477
    //   1397: aload #71
    //   1399: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1402: invokevirtual readInt : ()I
    //   1405: istore #73
    //   1407: aload #71
    //   1409: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1412: invokevirtual readShort : ()S
    //   1415: istore #74
    //   1417: iload #73
    //   1419: invokestatic e : ()Laf;
    //   1422: getfield J : I
    //   1425: if_icmpne -> 1436
    //   1428: invokestatic e : ()Laf;
    //   1431: astore #75
    //   1433: goto -> 1443
    //   1436: iload #73
    //   1438: invokestatic b : (I)Laf;
    //   1441: astore #75
    //   1443: aload #75
    //   1445: ifnull -> 1477
    //   1448: aload #75
    //   1450: iload #74
    //   1452: putfield cV : S
    //   1455: aload #75
    //   1457: aload #71
    //   1459: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1462: invokevirtual readByte : ()B
    //   1465: putfield cY : S
    //   1468: goto -> 6618
    //   1471: dup
    //   1472: astore #72
    //   1474: invokevirtual printStackTrace : ()V
    //   1477: return
    //   1478: aload_0
    //   1479: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1482: invokevirtual readUTF : ()Ljava/lang/String;
    //   1485: pop
    //   1486: aload_0
    //   1487: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1490: invokevirtual readByte : ()B
    //   1493: putstatic l.e : B
    //   1496: aload_0
    //   1497: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1500: invokevirtual readByte : ()B
    //   1503: putstatic l.f : B
    //   1506: return
    //   1507: pop
    //   1508: return
    //   1509: iconst_0
    //   1510: istore_1
    //   1511: iconst_0
    //   1512: istore_2
    //   1513: iconst_0
    //   1514: istore_3
    //   1515: iconst_0
    //   1516: istore #4
    //   1518: iconst_0
    //   1519: istore #5
    //   1521: iconst_m1
    //   1522: istore #6
    //   1524: aload_0
    //   1525: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1528: invokevirtual readByte : ()B
    //   1531: istore_1
    //   1532: aload_0
    //   1533: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1536: invokevirtual readByte : ()B
    //   1539: istore_2
    //   1540: aload_0
    //   1541: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1544: invokevirtual readShort : ()S
    //   1547: istore_3
    //   1548: aload_0
    //   1549: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1552: invokevirtual readShort : ()S
    //   1555: istore #4
    //   1557: aload_0
    //   1558: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1561: invokevirtual readShort : ()S
    //   1564: istore #5
    //   1566: aload_0
    //   1567: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1570: invokevirtual readShort : ()S
    //   1573: istore #6
    //   1575: goto -> 1579
    //   1578: pop
    //   1579: new ea
    //   1582: dup
    //   1583: iload_3
    //   1584: iload #4
    //   1586: iload #5
    //   1588: iload_2
    //   1589: iload_1
    //   1590: iload #6
    //   1592: invokespecial <init> : (IIIIII)V
    //   1595: invokestatic a : (Lea;)V
    //   1598: return
    //   1599: aload_0
    //   1600: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1603: invokevirtual readByte : ()B
    //   1606: dup
    //   1607: istore_0
    //   1608: iconst_0
    //   1609: invokestatic a : (IZ)V
    //   1612: invokestatic e : ()V
    //   1615: invokestatic a : ()Lbr;
    //   1618: invokevirtual e : ()V
    //   1621: invokestatic h : ()V
    //   1624: iconst_1
    //   1625: putstatic bs.m : Z
    //   1628: return
    //   1629: aload_0
    //   1630: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1633: invokevirtual readInt : ()I
    //   1636: istore_1
    //   1637: aload_0
    //   1638: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1641: invokevirtual readByte : ()B
    //   1644: dup
    //   1645: istore_2
    //   1646: iconst_1
    //   1647: if_icmpne -> 1845
    //   1650: aload_0
    //   1651: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1654: invokevirtual readShort : ()S
    //   1657: istore_2
    //   1658: iconst_m1
    //   1659: istore_3
    //   1660: aconst_null
    //   1661: astore #4
    //   1663: iconst_0
    //   1664: istore #5
    //   1666: iconst_0
    //   1667: istore #6
    //   1669: aload_0
    //   1670: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1673: invokevirtual readByte : ()B
    //   1676: dup
    //   1677: istore_3
    //   1678: ifle -> 1745
    //   1681: aload_0
    //   1682: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1685: invokevirtual readByte : ()B
    //   1688: dup
    //   1689: istore #7
    //   1691: newarray int
    //   1693: astore #4
    //   1695: iconst_0
    //   1696: istore #8
    //   1698: goto -> 1716
    //   1701: aload #4
    //   1703: iload #8
    //   1705: aload_0
    //   1706: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1709: invokevirtual readByte : ()B
    //   1712: iastore
    //   1713: iinc #8, 1
    //   1716: iload #8
    //   1718: iload #7
    //   1720: if_icmplt -> 1701
    //   1723: aload_0
    //   1724: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1727: invokevirtual readShort : ()S
    //   1730: istore #5
    //   1732: aload_0
    //   1733: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1736: invokevirtual readShort : ()S
    //   1739: istore #6
    //   1741: goto -> 1745
    //   1744: pop
    //   1745: iload_1
    //   1746: invokestatic e : ()Laf;
    //   1749: getfield J : I
    //   1752: if_icmpne -> 1799
    //   1755: invokestatic e : ()Laf;
    //   1758: new dk
    //   1761: dup
    //   1762: invokespecial <init> : ()V
    //   1765: putfield v : Ldk;
    //   1768: invokestatic e : ()Laf;
    //   1771: getfield v : Ldk;
    //   1774: iload_2
    //   1775: putfield a : S
    //   1778: iload_3
    //   1779: ifle -> 6618
    //   1782: invokestatic e : ()Laf;
    //   1785: getfield v : Ldk;
    //   1788: iload_3
    //   1789: aload #4
    //   1791: iload #5
    //   1793: iload #6
    //   1795: invokevirtual a : (I[III)V
    //   1798: return
    //   1799: iload_1
    //   1800: invokestatic b : (I)Laf;
    //   1803: dup
    //   1804: astore #7
    //   1806: new dk
    //   1809: dup
    //   1810: invokespecial <init> : ()V
    //   1813: putfield v : Ldk;
    //   1816: aload #7
    //   1818: getfield v : Ldk;
    //   1821: iload_2
    //   1822: putfield a : S
    //   1825: iload_3
    //   1826: ifle -> 6618
    //   1829: aload #7
    //   1831: getfield v : Ldk;
    //   1834: iload_3
    //   1835: aload #4
    //   1837: iload #5
    //   1839: iload #6
    //   1841: invokevirtual a : (I[III)V
    //   1844: return
    //   1845: iload_1
    //   1846: invokestatic e : ()Laf;
    //   1849: getfield J : I
    //   1852: if_icmpne -> 1872
    //   1855: invokestatic e : ()Laf;
    //   1858: getfield v : Ldk;
    //   1861: invokevirtual a : ()V
    //   1864: invokestatic e : ()Laf;
    //   1867: aconst_null
    //   1868: putfield v : Ldk;
    //   1871: return
    //   1872: iload_1
    //   1873: invokestatic b : (I)Laf;
    //   1876: dup
    //   1877: astore_2
    //   1878: getfield v : Ldk;
    //   1881: invokevirtual a : ()V
    //   1884: aload_2
    //   1885: aconst_null
    //   1886: putfield v : Ldk;
    //   1889: return
    //   1890: aload_0
    //   1891: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1894: invokevirtual readByte : ()B
    //   1897: iconst_1
    //   1898: if_icmpne -> 1905
    //   1901: iconst_1
    //   1902: goto -> 1906
    //   1905: iconst_0
    //   1906: putstatic main/a.an : Z
    //   1909: return
    //   1910: invokestatic h : ()V
    //   1913: iconst_0
    //   1914: putstatic x.c : Z
    //   1917: iconst_0
    //   1918: putstatic af.bI : Z
    //   1921: aload_0
    //   1922: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1925: invokevirtual readByte : ()B
    //   1928: istore_2
    //   1929: getstatic main/a.J : Lbi;
    //   1932: ifnonnull -> 1946
    //   1935: new bi
    //   1938: dup
    //   1939: iload_2
    //   1940: invokespecial <init> : (B)V
    //   1943: putstatic main/a.J : Lbi;
    //   1946: getstatic main/a.J : Lbi;
    //   1949: invokevirtual b : ()V
    //   1952: return
    //   1953: aload_0
    //   1954: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1957: invokevirtual readByte : ()B
    //   1960: dup
    //   1961: istore_3
    //   1962: iconst_1
    //   1963: if_icmpne -> 2062
    //   1966: aload_0
    //   1967: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1970: invokevirtual readInt : ()I
    //   1973: dup
    //   1974: istore #4
    //   1976: invokestatic e : ()Laf;
    //   1979: getfield J : I
    //   1982: if_icmpne -> 2021
    //   1985: invokestatic e : ()Laf;
    //   1988: iconst_1
    //   1989: invokevirtual c : (Z)V
    //   1992: invokestatic e : ()Laf;
    //   1995: aload_0
    //   1996: invokevirtual c : ()Ljava/io/DataInputStream;
    //   1999: invokevirtual readShort : ()S
    //   2002: putfield B : I
    //   2005: invokestatic e : ()Laf;
    //   2008: aload_0
    //   2009: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2012: invokevirtual readShort : ()S
    //   2015: putfield C : I
    //   2018: goto -> 2062
    //   2021: iload #4
    //   2023: invokestatic b : (I)Laf;
    //   2026: dup
    //   2027: astore #5
    //   2029: ifnull -> 2062
    //   2032: aload #5
    //   2034: iconst_1
    //   2035: invokevirtual c : (Z)V
    //   2038: aload #5
    //   2040: aload_0
    //   2041: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2044: invokevirtual readShort : ()S
    //   2047: putfield B : I
    //   2050: aload #5
    //   2052: aload_0
    //   2053: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2056: invokevirtual readShort : ()S
    //   2059: putfield C : I
    //   2062: iload_3
    //   2063: ifne -> 2112
    //   2066: aload_0
    //   2067: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2070: invokevirtual readInt : ()I
    //   2073: dup
    //   2074: istore #4
    //   2076: invokestatic e : ()Laf;
    //   2079: getfield J : I
    //   2082: if_icmpne -> 2095
    //   2085: invokestatic e : ()Laf;
    //   2088: iconst_0
    //   2089: invokevirtual c : (Z)V
    //   2092: goto -> 2112
    //   2095: iload #4
    //   2097: invokestatic b : (I)Laf;
    //   2100: dup
    //   2101: astore #5
    //   2103: ifnull -> 2112
    //   2106: aload #5
    //   2108: iconst_0
    //   2109: invokevirtual c : (Z)V
    //   2112: iload_3
    //   2113: iconst_2
    //   2114: if_icmpne -> 2151
    //   2117: aload_0
    //   2118: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2121: invokevirtual readInt : ()I
    //   2124: istore #4
    //   2126: aload_0
    //   2127: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2130: invokevirtual readInt : ()I
    //   2133: istore #5
    //   2135: iload #4
    //   2137: invokestatic b : (I)Laf;
    //   2140: checkcast al
    //   2143: dup
    //   2144: astore #6
    //   2146: iload #5
    //   2148: invokevirtual c : (I)V
    //   2151: iload_3
    //   2152: iconst_3
    //   2153: if_icmpne -> 6618
    //   2156: aload_0
    //   2157: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2160: invokevirtual readByte : ()B
    //   2163: putstatic p.bW : B
    //   2166: return
    //   2167: aload_0
    //   2168: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2171: invokevirtual readInt : ()I
    //   2174: dup
    //   2175: istore #4
    //   2177: invokestatic b : (I)Laf;
    //   2180: checkcast al
    //   2183: astore #5
    //   2185: aload_0
    //   2186: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2189: invokevirtual readByte : ()B
    //   2192: istore #6
    //   2194: aload_0
    //   2195: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2198: invokevirtual readShort : ()S
    //   2201: istore #7
    //   2203: aload_0
    //   2204: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2207: invokevirtual readShort : ()S
    //   2210: istore #8
    //   2212: aload_0
    //   2213: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2216: invokevirtual readByte : ()B
    //   2219: dup
    //   2220: istore_1
    //   2221: anewarray af
    //   2224: astore_2
    //   2225: iload_1
    //   2226: newarray long
    //   2228: astore_3
    //   2229: iconst_0
    //   2230: istore #4
    //   2232: goto -> 2313
    //   2235: aload_0
    //   2236: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2239: invokevirtual readInt : ()I
    //   2242: istore #9
    //   2244: new java/lang/StringBuffer
    //   2247: dup
    //   2248: ldc 'char ID='
    //   2250: invokespecial <init> : (Ljava/lang/String;)V
    //   2253: iload #9
    //   2255: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2258: invokevirtual toString : ()Ljava/lang/String;
    //   2261: invokestatic c : (Ljava/lang/String;)V
    //   2264: aload_2
    //   2265: iload #4
    //   2267: aconst_null
    //   2268: aastore
    //   2269: iload #9
    //   2271: invokestatic e : ()Laf;
    //   2274: getfield J : I
    //   2277: if_icmpeq -> 2292
    //   2280: aload_2
    //   2281: iload #4
    //   2283: iload #9
    //   2285: invokestatic b : (I)Laf;
    //   2288: aastore
    //   2289: goto -> 2299
    //   2292: aload_2
    //   2293: iload #4
    //   2295: invokestatic e : ()Laf;
    //   2298: aastore
    //   2299: aload_3
    //   2300: iload #4
    //   2302: aload_0
    //   2303: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2306: invokevirtual readLong : ()J
    //   2309: lastore
    //   2310: iinc #4, 1
    //   2313: iload #4
    //   2315: iload_1
    //   2316: if_icmplt -> 2235
    //   2319: aload #5
    //   2321: iload #6
    //   2323: iload #7
    //   2325: iload #8
    //   2327: aload_2
    //   2328: aload_3
    //   2329: invokevirtual a : (BSS[Laf;[J)V
    //   2332: return
    //   2333: aload_0
    //   2334: invokestatic b : (Ly;)V
    //   2337: return
    //   2338: aload_0
    //   2339: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2342: invokevirtual readByte : ()B
    //   2345: istore #4
    //   2347: new java/lang/StringBuffer
    //   2350: dup
    //   2351: ldc 'type quay= '
    //   2353: invokespecial <init> : (Ljava/lang/String;)V
    //   2356: iload #4
    //   2358: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2361: invokevirtual toString : ()Ljava/lang/String;
    //   2364: invokestatic c : (Ljava/lang/String;)V
    //   2367: iload #4
    //   2369: iconst_1
    //   2370: if_icmpne -> 2405
    //   2373: aload_0
    //   2374: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2377: invokevirtual readByte : ()B
    //   2380: pop
    //   2381: aload_0
    //   2382: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2385: invokevirtual readUTF : ()Ljava/lang/String;
    //   2388: astore_1
    //   2389: aload_0
    //   2390: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2393: invokevirtual readUTF : ()Ljava/lang/String;
    //   2396: astore_2
    //   2397: invokestatic j : ()Lp;
    //   2400: aload_1
    //   2401: aload_2
    //   2402: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   2405: iload #4
    //   2407: ifne -> 6618
    //   2410: invokestatic j : ()Lp;
    //   2413: aload_0
    //   2414: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2417: invokevirtual readUTF : ()Ljava/lang/String;
    //   2420: invokevirtual b : (Ljava/lang/String;)V
    //   2423: return
    //   2424: aload_0
    //   2425: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2428: invokevirtual readShort : ()S
    //   2431: dup
    //   2432: istore #9
    //   2434: invokestatic a : (S)Ldo;
    //   2437: astore_1
    //   2438: aload_0
    //   2439: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2442: invokevirtual readByte : ()B
    //   2445: istore_2
    //   2446: aload_1
    //   2447: iload_2
    //   2448: newarray int
    //   2450: putfield dj : [I
    //   2453: iconst_0
    //   2454: istore_3
    //   2455: goto -> 2474
    //   2458: aload_1
    //   2459: getfield dj : [I
    //   2462: iload_3
    //   2463: aload_0
    //   2464: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2467: invokevirtual readShort : ()S
    //   2470: iastore
    //   2471: iinc #3, 1
    //   2474: iload_3
    //   2475: iload_2
    //   2476: if_icmplt -> 2458
    //   2479: aload_1
    //   2480: aload_0
    //   2481: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2484: invokevirtual readByte : ()B
    //   2487: aload_0
    //   2488: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2491: invokevirtual readInt : ()I
    //   2494: invokevirtual a : (BI)V
    //   2497: return
    //   2498: aload_0
    //   2499: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2502: invokevirtual readByte : ()B
    //   2505: dup
    //   2506: istore_3
    //   2507: ifeq -> 2526
    //   2510: iload_3
    //   2511: iconst_1
    //   2512: if_icmpeq -> 2526
    //   2515: iload_3
    //   2516: iconst_2
    //   2517: if_icmpeq -> 2526
    //   2520: iload_3
    //   2521: bipush #6
    //   2523: if_icmpne -> 2676
    //   2526: invokestatic x : ()Ld;
    //   2529: dup
    //   2530: astore_1
    //   2531: ifnonnull -> 2535
    //   2534: return
    //   2535: iload_3
    //   2536: bipush #6
    //   2538: if_icmpne -> 2574
    //   2541: aload_1
    //   2542: aload_1
    //   2543: aload_1
    //   2544: aload_1
    //   2545: aload_1
    //   2546: aload_1
    //   2547: sipush #-1000
    //   2550: dup_x1
    //   2551: putfield u : I
    //   2554: dup_x1
    //   2555: putfield t : I
    //   2558: dup_x1
    //   2559: putfield b : I
    //   2562: dup_x1
    //   2563: putfield a : I
    //   2566: dup_x1
    //   2567: putfield n : I
    //   2570: putfield m : I
    //   2573: return
    //   2574: aload_0
    //   2575: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2578: invokevirtual readByte : ()B
    //   2581: dup
    //   2582: istore_2
    //   2583: anewarray af
    //   2586: astore #27
    //   2588: iload_2
    //   2589: newarray long
    //   2591: astore #28
    //   2593: iconst_0
    //   2594: istore #29
    //   2596: goto -> 2661
    //   2599: aload_0
    //   2600: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2603: invokevirtual readInt : ()I
    //   2606: istore #30
    //   2608: aload #27
    //   2610: iload #29
    //   2612: aconst_null
    //   2613: aastore
    //   2614: iload #30
    //   2616: invokestatic e : ()Laf;
    //   2619: getfield J : I
    //   2622: if_icmpeq -> 2638
    //   2625: aload #27
    //   2627: iload #29
    //   2629: iload #30
    //   2631: invokestatic b : (I)Laf;
    //   2634: aastore
    //   2635: goto -> 2646
    //   2638: aload #27
    //   2640: iload #29
    //   2642: invokestatic e : ()Laf;
    //   2645: aastore
    //   2646: aload #28
    //   2648: iload #29
    //   2650: aload_0
    //   2651: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2654: invokevirtual readLong : ()J
    //   2657: lastore
    //   2658: iinc #29, 1
    //   2661: iload #29
    //   2663: iload_2
    //   2664: if_icmplt -> 2599
    //   2667: aload_1
    //   2668: aload #27
    //   2670: aload #28
    //   2672: iload_3
    //   2673: invokevirtual a : ([Laf;[JB)V
    //   2676: iload_3
    //   2677: iconst_3
    //   2678: if_icmpeq -> 2697
    //   2681: iload_3
    //   2682: iconst_4
    //   2683: if_icmpeq -> 2697
    //   2686: iload_3
    //   2687: iconst_5
    //   2688: if_icmpeq -> 2697
    //   2691: iload_3
    //   2692: bipush #7
    //   2694: if_icmpne -> 2875
    //   2697: invokestatic y : ()Lan;
    //   2700: dup
    //   2701: astore_1
    //   2702: ifnonnull -> 2706
    //   2705: return
    //   2706: iload_3
    //   2707: bipush #7
    //   2709: if_icmpne -> 2745
    //   2712: aload_1
    //   2713: aload_1
    //   2714: aload_1
    //   2715: aload_1
    //   2716: aload_1
    //   2717: aload_1
    //   2718: sipush #-1000
    //   2721: dup_x1
    //   2722: putfield u : I
    //   2725: dup_x1
    //   2726: putfield t : I
    //   2729: dup_x1
    //   2730: putfield b : I
    //   2733: dup_x1
    //   2734: putfield a : I
    //   2737: dup_x1
    //   2738: putfield n : I
    //   2741: putfield m : I
    //   2744: return
    //   2745: iload_3
    //   2746: iconst_3
    //   2747: if_icmpeq -> 2755
    //   2750: iload_3
    //   2751: iconst_4
    //   2752: if_icmpne -> 2857
    //   2755: aload_0
    //   2756: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2759: invokevirtual readByte : ()B
    //   2762: dup
    //   2763: istore_2
    //   2764: anewarray af
    //   2767: astore #27
    //   2769: iload_2
    //   2770: newarray long
    //   2772: astore #28
    //   2774: iconst_0
    //   2775: istore #29
    //   2777: goto -> 2842
    //   2780: aload_0
    //   2781: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2784: invokevirtual readInt : ()I
    //   2787: istore #30
    //   2789: aload #27
    //   2791: iload #29
    //   2793: aconst_null
    //   2794: aastore
    //   2795: iload #30
    //   2797: invokestatic e : ()Laf;
    //   2800: getfield J : I
    //   2803: if_icmpeq -> 2819
    //   2806: aload #27
    //   2808: iload #29
    //   2810: iload #30
    //   2812: invokestatic b : (I)Laf;
    //   2815: aastore
    //   2816: goto -> 2827
    //   2819: aload #27
    //   2821: iload #29
    //   2823: invokestatic e : ()Laf;
    //   2826: aastore
    //   2827: aload #28
    //   2829: iload #29
    //   2831: aload_0
    //   2832: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2835: invokevirtual readLong : ()J
    //   2838: lastore
    //   2839: iinc #29, 1
    //   2842: iload #29
    //   2844: iload_2
    //   2845: if_icmplt -> 2780
    //   2848: aload_1
    //   2849: aload #27
    //   2851: aload #28
    //   2853: iload_3
    //   2854: invokevirtual a : ([Laf;[JB)V
    //   2857: iload_3
    //   2858: iconst_5
    //   2859: if_icmpne -> 2875
    //   2862: aload_0
    //   2863: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2866: invokevirtual readShort : ()S
    //   2869: istore_2
    //   2870: aload_1
    //   2871: iload_2
    //   2872: invokevirtual b : (S)V
    //   2875: iload_3
    //   2876: bipush #9
    //   2878: if_icmple -> 6618
    //   2881: iload_3
    //   2882: bipush #30
    //   2884: if_icmpge -> 6618
    //   2887: aload_0
    //   2888: iload_3
    //   2889: invokestatic a : (Ly;I)V
    //   2892: return
    //   2893: ldc 'big boss--------------------------------------------------'
    //   2895: invokestatic c : (Ljava/lang/String;)V
    //   2898: invokestatic w : ()Lcc;
    //   2901: dup
    //   2902: astore_1
    //   2903: ifnonnull -> 2907
    //   2906: return
    //   2907: aload_0
    //   2908: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2911: invokevirtual readByte : ()B
    //   2914: dup
    //   2915: istore_2
    //   2916: ifeq -> 2939
    //   2919: iload_2
    //   2920: iconst_1
    //   2921: if_icmpeq -> 2939
    //   2924: iload_2
    //   2925: iconst_2
    //   2926: if_icmpeq -> 2939
    //   2929: iload_2
    //   2930: iconst_4
    //   2931: if_icmpeq -> 2939
    //   2934: iload_2
    //   2935: iconst_3
    //   2936: if_icmpne -> 3120
    //   2939: iload_2
    //   2940: iconst_3
    //   2941: if_icmpne -> 2978
    //   2944: aload_1
    //   2945: aload_1
    //   2946: aload_0
    //   2947: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2950: invokevirtual readShort : ()S
    //   2953: dup_x1
    //   2954: putfield t : I
    //   2957: putfield a : I
    //   2960: aload_1
    //   2961: aload_0
    //   2962: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2965: invokevirtual readShort : ()S
    //   2968: putfield u : I
    //   2971: aload_1
    //   2972: invokevirtual D : ()V
    //   2975: goto -> 3120
    //   2978: aload_0
    //   2979: invokevirtual c : ()Ljava/io/DataInputStream;
    //   2982: invokevirtual readByte : ()B
    //   2985: istore #27
    //   2987: new java/lang/StringBuffer
    //   2990: dup
    //   2991: ldc 'CHUONG nChar= '
    //   2993: invokespecial <init> : (Ljava/lang/String;)V
    //   2996: iload #27
    //   2998: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3001: invokevirtual toString : ()Ljava/lang/String;
    //   3004: invokestatic c : (Ljava/lang/String;)V
    //   3007: iload #27
    //   3009: anewarray af
    //   3012: astore #28
    //   3014: iload #27
    //   3016: newarray long
    //   3018: astore #29
    //   3020: iconst_0
    //   3021: istore #30
    //   3023: goto -> 3104
    //   3026: aload_0
    //   3027: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3030: invokevirtual readInt : ()I
    //   3033: istore_3
    //   3034: new java/lang/StringBuffer
    //   3037: dup
    //   3038: ldc 'char ID='
    //   3040: invokespecial <init> : (Ljava/lang/String;)V
    //   3043: iload_3
    //   3044: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3047: invokevirtual toString : ()Ljava/lang/String;
    //   3050: invokestatic c : (Ljava/lang/String;)V
    //   3053: aload #28
    //   3055: iload #30
    //   3057: aconst_null
    //   3058: aastore
    //   3059: iload_3
    //   3060: invokestatic e : ()Laf;
    //   3063: getfield J : I
    //   3066: if_icmpeq -> 3081
    //   3069: aload #28
    //   3071: iload #30
    //   3073: iload_3
    //   3074: invokestatic b : (I)Laf;
    //   3077: aastore
    //   3078: goto -> 3089
    //   3081: aload #28
    //   3083: iload #30
    //   3085: invokestatic e : ()Laf;
    //   3088: aastore
    //   3089: aload #29
    //   3091: iload #30
    //   3093: aload_0
    //   3094: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3097: invokevirtual readLong : ()J
    //   3100: lastore
    //   3101: iinc #30, 1
    //   3104: iload #30
    //   3106: iload #27
    //   3108: if_icmplt -> 3026
    //   3111: aload_1
    //   3112: aload #28
    //   3114: aload #29
    //   3116: iload_2
    //   3117: invokevirtual a : ([Laf;[JB)V
    //   3120: iload_2
    //   3121: iconst_5
    //   3122: if_icmpne -> 3135
    //   3125: aload_1
    //   3126: iconst_1
    //   3127: putfield b : Z
    //   3130: aload_1
    //   3131: iconst_2
    //   3132: putfield p : I
    //   3135: iload_2
    //   3136: bipush #6
    //   3138: if_icmpne -> 3167
    //   3141: aload_1
    //   3142: invokevirtual C : ()V
    //   3145: aload_1
    //   3146: aload_0
    //   3147: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3150: invokevirtual readShort : ()S
    //   3153: putfield m : I
    //   3156: aload_1
    //   3157: aload_0
    //   3158: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3161: invokevirtual readShort : ()S
    //   3164: putfield n : I
    //   3167: iload_2
    //   3168: bipush #7
    //   3170: if_icmpne -> 3180
    //   3173: aload_1
    //   3174: aconst_null
    //   3175: aconst_null
    //   3176: iload_2
    //   3177: invokevirtual a : ([Laf;[JB)V
    //   3180: iload_2
    //   3181: bipush #8
    //   3183: if_icmpne -> 3218
    //   3186: aload_1
    //   3187: aload_1
    //   3188: aload_0
    //   3189: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3192: invokevirtual readShort : ()S
    //   3195: dup_x1
    //   3196: putfield t : I
    //   3199: putfield a : I
    //   3202: aload_1
    //   3203: aload_0
    //   3204: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3207: invokevirtual readShort : ()S
    //   3210: putfield u : I
    //   3213: aload_1
    //   3214: iconst_2
    //   3215: putfield p : I
    //   3218: iload_2
    //   3219: bipush #9
    //   3221: if_icmpne -> 6618
    //   3224: aload_1
    //   3225: aload_1
    //   3226: aload_1
    //   3227: aload_1
    //   3228: aload_1
    //   3229: sipush #-1000
    //   3232: dup_x1
    //   3233: putfield u : I
    //   3236: dup_x1
    //   3237: putfield t : I
    //   3240: dup_x1
    //   3241: putfield a : I
    //   3244: dup_x1
    //   3245: putfield n : I
    //   3248: putfield m : I
    //   3251: return
    //   3252: invokestatic d : ()J
    //   3255: dup2
    //   3256: lstore #27
    //   3258: getstatic bt.b : J
    //   3261: lsub
    //   3262: putstatic bt.d : J
    //   3265: invokestatic a : ()Lbt;
    //   3268: invokevirtual d : ()V
    //   3271: return
    //   3272: invokestatic d : ()J
    //   3275: dup2
    //   3276: lstore #29
    //   3278: getstatic bt.c : J
    //   3281: lsub
    //   3282: putstatic bt.e : J
    //   3285: invokestatic a : ()Lbt;
    //   3288: invokevirtual e : ()V
    //   3291: return
    //   3292: aload_0
    //   3293: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3296: invokevirtual readByte : ()B
    //   3299: istore_3
    //   3300: aload_0
    //   3301: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3304: invokevirtual readByte : ()B
    //   3307: istore_1
    //   3308: aconst_null
    //   3309: astore_2
    //   3310: iload_3
    //   3311: ifne -> 3323
    //   3314: invokestatic e : ()Laf;
    //   3317: getfield aH : [Lh;
    //   3320: iload_1
    //   3321: aaload
    //   3322: astore_2
    //   3323: iload_3
    //   3324: iconst_1
    //   3325: if_icmpne -> 3337
    //   3328: invokestatic e : ()Laf;
    //   3331: getfield aF : [Lh;
    //   3334: iload_1
    //   3335: aaload
    //   3336: astore_2
    //   3337: aload_0
    //   3338: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3341: invokevirtual readShort : ()S
    //   3344: dup
    //   3345: istore_1
    //   3346: iconst_m1
    //   3347: if_icmpeq -> 6618
    //   3350: aload_2
    //   3351: iload_1
    //   3352: invokestatic a : (S)Ldd;
    //   3355: putfield b : Ldd;
    //   3358: aload_2
    //   3359: aload_0
    //   3360: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3363: invokevirtual readInt : ()I
    //   3366: putfield h : I
    //   3369: aload_0
    //   3370: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3373: invokevirtual readUTF : ()Ljava/lang/String;
    //   3376: pop
    //   3377: aload_0
    //   3378: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3381: invokevirtual readUTF : ()Ljava/lang/String;
    //   3384: pop
    //   3385: aload_0
    //   3386: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3389: invokevirtual readByte : ()B
    //   3392: dup
    //   3393: istore_1
    //   3394: ifeq -> 3442
    //   3397: aload_2
    //   3398: iload_1
    //   3399: anewarray ee
    //   3402: putfield a : [Lee;
    //   3405: iconst_0
    //   3406: istore_1
    //   3407: goto -> 3433
    //   3410: invokestatic a : ()Lac;
    //   3413: pop
    //   3414: aload_0
    //   3415: invokestatic b : (Ly;)Lee;
    //   3418: dup
    //   3419: astore_3
    //   3420: ifnull -> 3430
    //   3423: aload_2
    //   3424: getfield a : [Lee;
    //   3427: iload_1
    //   3428: aload_3
    //   3429: aastore
    //   3430: iinc #1, 1
    //   3433: iload_1
    //   3434: aload_2
    //   3435: getfield a : [Lee;
    //   3438: arraylength
    //   3439: if_icmplt -> 3410
    //   3442: aload_2
    //   3443: getfield h : I
    //   3446: ifgt -> 6618
    //   3449: return
    //   3450: aload_0
    //   3451: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3454: invokevirtual readInt : ()I
    //   3457: dup
    //   3458: istore_1
    //   3459: invokestatic b : (I)Laf;
    //   3462: ifnull -> 6618
    //   3465: iload_1
    //   3466: invokestatic b : (I)Laf;
    //   3469: aload_0
    //   3470: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3473: invokevirtual readByte : ()B
    //   3476: putfield cS : I
    //   3479: return
    //   3480: invokestatic e : ()Laf;
    //   3483: aload_0
    //   3484: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3487: invokevirtual readInt : ()I
    //   3490: putfield w : I
    //   3493: return
    //   3494: invokestatic j : ()Lp;
    //   3497: iconst_0
    //   3498: putfield bU : I
    //   3501: invokestatic j : ()Lp;
    //   3504: aload_0
    //   3505: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3508: invokevirtual readByte : ()B
    //   3511: putfield bS : B
    //   3514: invokestatic j : ()Lp;
    //   3517: getfield bS : B
    //   3520: bipush #100
    //   3522: if_icmpne -> 3532
    //   3525: invokestatic j : ()Lp;
    //   3528: iconst_1
    //   3529: putfield bT : Z
    //   3532: invokestatic j : ()Lp;
    //   3535: getfield bS : B
    //   3538: bipush #101
    //   3540: if_icmpne -> 6618
    //   3543: iconst_1
    //   3544: putstatic do.di : Z
    //   3547: return
    //   3548: aload_0
    //   3549: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3552: invokevirtual readByte : ()B
    //   3555: iconst_1
    //   3556: if_icmpne -> 3563
    //   3559: iconst_1
    //   3560: goto -> 3564
    //   3563: iconst_0
    //   3564: putstatic p.bk : Z
    //   3567: return
    //   3568: invokestatic e : ()Laf;
    //   3571: aload_0
    //   3572: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3575: invokevirtual readUTF : ()Ljava/lang/String;
    //   3578: aload_0
    //   3579: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3582: invokevirtual readShort : ()S
    //   3585: aload_0
    //   3586: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3589: invokevirtual readShort : ()S
    //   3592: aload_0
    //   3593: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3596: invokevirtual readShort : ()S
    //   3599: invokevirtual a : (Ljava/lang/String;SSS)V
    //   3602: return
    //   3603: bipush #10
    //   3605: newarray byte
    //   3607: astore_1
    //   3608: iconst_0
    //   3609: istore_3
    //   3610: goto -> 3626
    //   3613: aload_1
    //   3614: iload_3
    //   3615: aload_0
    //   3616: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3619: invokevirtual readByte : ()B
    //   3622: bastore
    //   3623: iinc #3, 1
    //   3626: iload_3
    //   3627: bipush #10
    //   3629: if_icmplt -> 3613
    //   3632: invokestatic j : ()Lp;
    //   3635: aload_1
    //   3636: invokevirtual b : ([B)V
    //   3639: invokestatic j : ()Lp;
    //   3642: aload_1
    //   3643: invokevirtual a : ([B)V
    //   3646: invokestatic j : ()Lp;
    //   3649: aload_1
    //   3650: invokevirtual c : ([B)V
    //   3653: return
    //   3654: aload_0
    //   3655: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3658: invokevirtual readShort : ()S
    //   3661: istore_3
    //   3662: new el
    //   3665: dup
    //   3666: ldc ''
    //   3668: invokespecial <init> : (Ljava/lang/String;)V
    //   3671: putstatic u.b : Lel;
    //   3674: iconst_0
    //   3675: istore_1
    //   3676: goto -> 3715
    //   3679: aload_0
    //   3680: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3683: invokevirtual readUTF : ()Ljava/lang/String;
    //   3686: astore_2
    //   3687: aload_0
    //   3688: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3691: invokevirtual readByte : ()B
    //   3694: istore #4
    //   3696: getstatic u.b : Lel;
    //   3699: new u
    //   3702: dup
    //   3703: aload_2
    //   3704: iload #4
    //   3706: invokespecial <init> : (Ljava/lang/String;B)V
    //   3709: invokevirtual addElement : (Ljava/lang/Object;)V
    //   3712: iinc #1, 1
    //   3715: iload_1
    //   3716: iload_3
    //   3717: if_icmplt -> 3679
    //   3720: invokestatic a : ()V
    //   3723: invokestatic b : ()V
    //   3726: return
    //   3727: aload_0
    //   3728: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3731: invokevirtual readByte : ()B
    //   3734: istore_1
    //   3735: aload_0
    //   3736: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3739: invokevirtual readInt : ()I
    //   3742: dup
    //   3743: istore_2
    //   3744: invokestatic e : ()Laf;
    //   3747: getfield J : I
    //   3750: if_icmpne -> 3761
    //   3753: invokestatic e : ()Laf;
    //   3756: iload_1
    //   3757: invokevirtual b : (B)V
    //   3760: return
    //   3761: iload_2
    //   3762: invokestatic b : (I)Laf;
    //   3765: ifnull -> 6618
    //   3768: iload_2
    //   3769: invokestatic b : (I)Laf;
    //   3772: iload_1
    //   3773: invokevirtual b : (B)V
    //   3776: return
    //   3777: aload_0
    //   3778: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3781: invokevirtual readShort : ()S
    //   3784: istore #4
    //   3786: aload_0
    //   3787: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3790: invokevirtual readUTF : ()Ljava/lang/String;
    //   3793: astore_0
    //   3794: new java/lang/StringBuffer
    //   3797: dup
    //   3798: ldc 'noi chuyen = '
    //   3800: invokespecial <init> : (Ljava/lang/String;)V
    //   3803: aload_0
    //   3804: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3807: ldc 'npc ID= '
    //   3809: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3812: iload #4
    //   3814: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3817: invokevirtual toString : ()Ljava/lang/String;
    //   3820: invokestatic c : (Ljava/lang/String;)V
    //   3823: iload #4
    //   3825: invokestatic a : (S)Ldo;
    //   3828: dup
    //   3829: astore_1
    //   3830: ifnull -> 6618
    //   3833: aload_1
    //   3834: aload_0
    //   3835: invokevirtual a : (Ljava/lang/String;)V
    //   3838: return
    //   3839: aload_0
    //   3840: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3843: invokevirtual readInt : ()I
    //   3846: istore_1
    //   3847: aload_0
    //   3848: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3851: invokevirtual readShort : ()S
    //   3854: istore_2
    //   3855: aload_0
    //   3856: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3859: invokevirtual readShort : ()S
    //   3862: istore_3
    //   3863: aload_0
    //   3864: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3867: invokevirtual readByte : ()B
    //   3870: istore_0
    //   3871: new java/lang/StringBuffer
    //   3874: dup
    //   3875: ldc 'SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= '
    //   3877: invokespecial <init> : (Ljava/lang/String;)V
    //   3880: iload_2
    //   3881: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3884: ldc ' y= '
    //   3886: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3889: iload_3
    //   3890: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3893: ldc 'chaPos= '
    //   3895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3898: iload_1
    //   3899: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3902: ldc 'type Pos= '
    //   3904: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3907: iload_0
    //   3908: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3911: invokevirtual toString : ()Ljava/lang/String;
    //   3914: invokestatic c : (Ljava/lang/String;)V
    //   3917: aconst_null
    //   3918: astore #4
    //   3920: iload_1
    //   3921: invokestatic e : ()Laf;
    //   3924: getfield J : I
    //   3927: if_icmpne -> 3938
    //   3930: invokestatic e : ()Laf;
    //   3933: astore #4
    //   3935: goto -> 3951
    //   3938: iload_1
    //   3939: invokestatic b : (I)Laf;
    //   3942: ifnull -> 3951
    //   3945: iload_1
    //   3946: invokestatic b : (I)Laf;
    //   3949: astore #4
    //   3951: aload #4
    //   3953: ifnull -> 6618
    //   3956: iload_0
    //   3957: ifne -> 3965
    //   3960: bipush #60
    //   3962: goto -> 3968
    //   3965: sipush #173
    //   3968: aload #4
    //   3970: iconst_1
    //   3971: invokestatic a : (ILaf;I)V
    //   3974: aload #4
    //   3976: iload_2
    //   3977: iload_3
    //   3978: iload_0
    //   3979: invokevirtual a : (SSB)V
    //   3982: return
    //   3983: aload_0
    //   3984: invokevirtual c : ()Ljava/io/DataInputStream;
    //   3987: invokevirtual readShort : ()S
    //   3990: istore_0
    //   3991: new java/lang/StringBuffer
    //   3994: dup
    //   3995: ldc 'second login = '
    //   3997: invokespecial <init> : (Ljava/lang/String;)V
    //   4000: iload_0
    //   4001: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4004: invokevirtual toString : ()Ljava/lang/String;
    //   4007: invokestatic c : (Ljava/lang/String;)V
    //   4010: iload_0
    //   4011: putstatic x.k : S
    //   4014: invokestatic currentTimeMillis : ()J
    //   4017: dup2
    //   4018: putstatic x.l : J
    //   4021: putstatic x.m : J
    //   4024: invokestatic h : ()V
    //   4027: return
    //   4028: aload_0
    //   4029: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4032: invokevirtual readUTF : ()Ljava/lang/String;
    //   4035: putstatic l.g : Ljava/lang/String;
    //   4038: aload_0
    //   4039: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4042: invokevirtual readUTF : ()Ljava/lang/String;
    //   4045: pop
    //   4046: new java/lang/StringBuffer
    //   4049: dup
    //   4050: ldc 'SHOW AD public ID= '
    //   4052: invokespecial <init> : (Ljava/lang/String;)V
    //   4055: getstatic l.g : Ljava/lang/String;
    //   4058: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4061: invokevirtual toString : ()Ljava/lang/String;
    //   4064: invokestatic c : (Ljava/lang/String;)V
    //   4067: return
    //   4068: aload_0
    //   4069: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4072: invokevirtual readByte : ()B
    //   4075: istore_1
    //   4076: aload_0
    //   4077: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4080: invokevirtual readByte : ()B
    //   4083: dup
    //   4084: istore_2
    //   4085: ifne -> 4761
    //   4088: iload_1
    //   4089: iconst_2
    //   4090: if_icmpne -> 4134
    //   4093: aload_0
    //   4094: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4097: invokevirtual readInt : ()I
    //   4100: dup
    //   4101: istore_3
    //   4102: invokestatic e : ()Laf;
    //   4105: getfield J : I
    //   4108: if_icmpne -> 4120
    //   4111: invokestatic e : ()Laf;
    //   4114: invokevirtual S : ()V
    //   4117: goto -> 4134
    //   4120: iload_3
    //   4121: invokestatic b : (I)Laf;
    //   4124: ifnull -> 4134
    //   4127: iload_3
    //   4128: invokestatic b : (I)Laf;
    //   4131: invokevirtual S : ()V
    //   4134: aload_0
    //   4135: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4138: invokevirtual readUnsignedByte : ()I
    //   4141: istore_3
    //   4142: aload_0
    //   4143: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4146: invokevirtual readInt : ()I
    //   4149: istore #4
    //   4151: new java/lang/StringBuffer
    //   4154: dup
    //   4155: ldc 'playerID= '
    //   4157: invokespecial <init> : (Ljava/lang/String;)V
    //   4160: iload #4
    //   4162: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4165: ldc ' skillID= '
    //   4167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4170: iload_3
    //   4171: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4174: invokevirtual toString : ()Ljava/lang/String;
    //   4177: invokestatic c : (Ljava/lang/String;)V
    //   4180: iload_3
    //   4181: bipush #32
    //   4183: if_icmpne -> 4354
    //   4186: iload_1
    //   4187: iconst_1
    //   4188: if_icmpne -> 4318
    //   4191: aload_0
    //   4192: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4195: invokevirtual readInt : ()I
    //   4198: istore #5
    //   4200: iload #4
    //   4202: invokestatic e : ()Laf;
    //   4205: getfield J : I
    //   4208: if_icmpne -> 4232
    //   4211: invokestatic e : ()Laf;
    //   4214: iload_3
    //   4215: putfield cI : I
    //   4218: iload #5
    //   4220: invokestatic b : (I)Laf;
    //   4223: invokestatic e : ()Laf;
    //   4226: invokevirtual b : (Laf;)V
    //   4229: goto -> 4354
    //   4232: iload #4
    //   4234: invokestatic b : (I)Laf;
    //   4237: ifnull -> 4276
    //   4240: iload #5
    //   4242: invokestatic e : ()Laf;
    //   4245: getfield J : I
    //   4248: if_icmpeq -> 4276
    //   4251: iload #4
    //   4253: invokestatic b : (I)Laf;
    //   4256: iload_3
    //   4257: putfield cI : I
    //   4260: iload #5
    //   4262: invokestatic b : (I)Laf;
    //   4265: iload #4
    //   4267: invokestatic b : (I)Laf;
    //   4270: invokevirtual b : (Laf;)V
    //   4273: goto -> 4354
    //   4276: iload #4
    //   4278: invokestatic b : (I)Laf;
    //   4281: ifnull -> 4354
    //   4284: iload #5
    //   4286: invokestatic e : ()Laf;
    //   4289: getfield J : I
    //   4292: if_icmpne -> 4354
    //   4295: iload #4
    //   4297: invokestatic b : (I)Laf;
    //   4300: iload_3
    //   4301: putfield cI : I
    //   4304: invokestatic e : ()Laf;
    //   4307: iload #4
    //   4309: invokestatic b : (I)Laf;
    //   4312: invokevirtual b : (Laf;)V
    //   4315: goto -> 4354
    //   4318: iload #4
    //   4320: invokestatic e : ()Laf;
    //   4323: getfield J : I
    //   4326: if_icmpne -> 4338
    //   4329: invokestatic e : ()Laf;
    //   4332: invokevirtual P : ()V
    //   4335: goto -> 4354
    //   4338: iload #4
    //   4340: invokestatic b : (I)Laf;
    //   4343: ifnull -> 4354
    //   4346: iload #4
    //   4348: invokestatic b : (I)Laf;
    //   4351: invokevirtual P : ()V
    //   4354: iload_3
    //   4355: bipush #33
    //   4357: if_icmpne -> 4442
    //   4360: iload_1
    //   4361: iconst_1
    //   4362: if_icmpne -> 4406
    //   4365: iload #4
    //   4367: invokestatic e : ()Laf;
    //   4370: getfield J : I
    //   4373: if_icmpne -> 4386
    //   4376: invokestatic e : ()Laf;
    //   4379: iconst_1
    //   4380: putfield cK : Z
    //   4383: goto -> 4442
    //   4386: iload #4
    //   4388: invokestatic b : (I)Laf;
    //   4391: ifnull -> 4442
    //   4394: iload #4
    //   4396: invokestatic b : (I)Laf;
    //   4399: iconst_1
    //   4400: putfield cK : Z
    //   4403: goto -> 4442
    //   4406: iload #4
    //   4408: invokestatic e : ()Laf;
    //   4411: getfield J : I
    //   4414: if_icmpne -> 4426
    //   4417: invokestatic e : ()Laf;
    //   4420: invokevirtual Q : ()V
    //   4423: goto -> 4442
    //   4426: iload #4
    //   4428: invokestatic b : (I)Laf;
    //   4431: ifnull -> 4442
    //   4434: iload #4
    //   4436: invokestatic b : (I)Laf;
    //   4439: invokevirtual Q : ()V
    //   4442: iload_3
    //   4443: bipush #39
    //   4445: if_icmpne -> 4530
    //   4448: iload_1
    //   4449: iconst_1
    //   4450: if_icmpne -> 4494
    //   4453: iload #4
    //   4455: invokestatic e : ()Laf;
    //   4458: getfield J : I
    //   4461: if_icmpne -> 4474
    //   4464: invokestatic e : ()Laf;
    //   4467: iconst_1
    //   4468: putfield cN : Z
    //   4471: goto -> 4530
    //   4474: iload #4
    //   4476: invokestatic b : (I)Laf;
    //   4479: ifnull -> 4530
    //   4482: iload #4
    //   4484: invokestatic b : (I)Laf;
    //   4487: iconst_1
    //   4488: putfield cN : Z
    //   4491: goto -> 4530
    //   4494: iload #4
    //   4496: invokestatic e : ()Laf;
    //   4499: getfield J : I
    //   4502: if_icmpne -> 4514
    //   4505: invokestatic e : ()Laf;
    //   4508: invokevirtual T : ()V
    //   4511: goto -> 4530
    //   4514: iload #4
    //   4516: invokestatic b : (I)Laf;
    //   4519: ifnull -> 4530
    //   4522: iload #4
    //   4524: invokestatic b : (I)Laf;
    //   4527: invokevirtual T : ()V
    //   4530: iload_3
    //   4531: bipush #40
    //   4533: if_icmpne -> 4618
    //   4536: iload_1
    //   4537: iconst_1
    //   4538: if_icmpne -> 4582
    //   4541: iload #4
    //   4543: invokestatic e : ()Laf;
    //   4546: getfield J : I
    //   4549: if_icmpne -> 4562
    //   4552: invokestatic e : ()Laf;
    //   4555: iconst_1
    //   4556: putfield cO : Z
    //   4559: goto -> 4618
    //   4562: iload #4
    //   4564: invokestatic b : (I)Laf;
    //   4567: ifnull -> 4618
    //   4570: iload #4
    //   4572: invokestatic b : (I)Laf;
    //   4575: iconst_1
    //   4576: putfield cO : Z
    //   4579: goto -> 4618
    //   4582: iload #4
    //   4584: invokestatic e : ()Laf;
    //   4587: getfield J : I
    //   4590: if_icmpne -> 4602
    //   4593: invokestatic e : ()Laf;
    //   4596: invokevirtual R : ()V
    //   4599: goto -> 4618
    //   4602: iload #4
    //   4604: invokestatic b : (I)Laf;
    //   4607: ifnull -> 4618
    //   4610: iload #4
    //   4612: invokestatic b : (I)Laf;
    //   4615: invokevirtual R : ()V
    //   4618: iload_3
    //   4619: bipush #41
    //   4621: if_icmpne -> 4706
    //   4624: iload_1
    //   4625: iconst_1
    //   4626: if_icmpne -> 4670
    //   4629: iload #4
    //   4631: invokestatic e : ()Laf;
    //   4634: getfield J : I
    //   4637: if_icmpne -> 4650
    //   4640: invokestatic e : ()Laf;
    //   4643: iconst_1
    //   4644: putfield cQ : Z
    //   4647: goto -> 4706
    //   4650: iload #4
    //   4652: invokestatic b : (I)Laf;
    //   4655: ifnull -> 4706
    //   4658: iload #4
    //   4660: invokestatic b : (I)Laf;
    //   4663: iconst_1
    //   4664: putfield cQ : Z
    //   4667: goto -> 4706
    //   4670: iload #4
    //   4672: invokestatic e : ()Laf;
    //   4675: getfield J : I
    //   4678: if_icmpne -> 4690
    //   4681: invokestatic e : ()Laf;
    //   4684: invokevirtual V : ()V
    //   4687: goto -> 4706
    //   4690: iload #4
    //   4692: invokestatic b : (I)Laf;
    //   4695: ifnull -> 4706
    //   4698: iload #4
    //   4700: invokestatic b : (I)Laf;
    //   4703: invokevirtual V : ()V
    //   4706: iload_3
    //   4707: bipush #42
    //   4709: if_icmpne -> 4761
    //   4712: iload_1
    //   4713: iconst_1
    //   4714: if_icmpne -> 4738
    //   4717: iload #4
    //   4719: invokestatic e : ()Laf;
    //   4722: getfield J : I
    //   4725: if_icmpne -> 4761
    //   4728: invokestatic e : ()Laf;
    //   4731: iconst_1
    //   4732: putfield cR : Z
    //   4735: goto -> 4761
    //   4738: iload #4
    //   4740: invokestatic e : ()Laf;
    //   4743: getfield J : I
    //   4746: if_icmpne -> 4761
    //   4749: invokestatic e : ()Laf;
    //   4752: iconst_0
    //   4753: putfield cR : Z
    //   4756: ldc 'tra ve huy chieu 2'
    //   4758: invokestatic c : (Ljava/lang/String;)V
    //   4761: iload_2
    //   4762: iconst_1
    //   4763: if_icmpne -> 6618
    //   4766: aload_0
    //   4767: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4770: invokevirtual readUnsignedByte : ()I
    //   4773: istore_3
    //   4774: aload_0
    //   4775: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4778: invokevirtual readByte : ()B
    //   4781: istore #4
    //   4783: new java/lang/StringBuffer
    //   4786: dup
    //   4787: ldc 'modbHoldID= '
    //   4789: invokespecial <init> : (Ljava/lang/String;)V
    //   4792: iload #4
    //   4794: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4797: ldc ' skillID= '
    //   4799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4802: iload_3
    //   4803: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4806: ldc 'eff ID= '
    //   4808: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4811: iload_1
    //   4812: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4815: invokevirtual toString : ()Ljava/lang/String;
    //   4818: invokestatic c : (Ljava/lang/String;)V
    //   4821: iload_3
    //   4822: bipush #32
    //   4824: if_icmpne -> 4915
    //   4827: iload_1
    //   4828: iconst_1
    //   4829: if_icmpne -> 4907
    //   4832: aload_0
    //   4833: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4836: invokevirtual readInt : ()I
    //   4839: dup
    //   4840: istore #5
    //   4842: invokestatic e : ()Laf;
    //   4845: getfield J : I
    //   4848: if_icmpne -> 4874
    //   4851: iload #4
    //   4853: invokestatic a : (B)Laa;
    //   4856: iload_3
    //   4857: putfield j : I
    //   4860: invokestatic e : ()Laf;
    //   4863: iload #4
    //   4865: invokestatic a : (B)Laa;
    //   4868: invokevirtual a : (Laa;)V
    //   4871: goto -> 4915
    //   4874: iload #5
    //   4876: invokestatic b : (I)Laf;
    //   4879: ifnull -> 4915
    //   4882: iload #4
    //   4884: invokestatic a : (B)Laa;
    //   4887: iload_3
    //   4888: putfield j : I
    //   4891: iload #5
    //   4893: invokestatic b : (I)Laf;
    //   4896: iload #4
    //   4898: invokestatic a : (B)Laa;
    //   4901: invokevirtual a : (Laa;)V
    //   4904: goto -> 4915
    //   4907: iload #4
    //   4909: invokestatic a : (B)Laa;
    //   4912: invokevirtual r : ()V
    //   4915: iload_3
    //   4916: bipush #40
    //   4918: if_icmpne -> 4946
    //   4921: iload_1
    //   4922: iconst_1
    //   4923: if_icmpne -> 4938
    //   4926: iload #4
    //   4928: invokestatic a : (B)Laa;
    //   4931: iconst_1
    //   4932: putfield ab : Z
    //   4935: goto -> 4946
    //   4938: iload #4
    //   4940: invokestatic a : (B)Laa;
    //   4943: invokevirtual s : ()V
    //   4946: iload_3
    //   4947: bipush #41
    //   4949: if_icmpne -> 6618
    //   4952: iload_1
    //   4953: iconst_1
    //   4954: if_icmpne -> 4967
    //   4957: iload #4
    //   4959: invokestatic a : (B)Laa;
    //   4962: iconst_1
    //   4963: putfield ac : Z
    //   4966: return
    //   4967: iload #4
    //   4969: invokestatic a : (B)Laa;
    //   4972: invokevirtual t : ()V
    //   4975: return
    //   4976: invokestatic b : ()Lcq;
    //   4979: iconst_0
    //   4980: putfield b : Z
    //   4983: aload_0
    //   4984: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4987: invokevirtual readUTF : ()Ljava/lang/String;
    //   4990: astore_3
    //   4991: new java/lang/StringBuffer
    //   4994: dup
    //   4995: ldc 'titile= '
    //   4997: invokespecial <init> : (Ljava/lang/String;)V
    //   5000: aload_3
    //   5001: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5004: invokevirtual toString : ()Ljava/lang/String;
    //   5007: invokestatic c : (Ljava/lang/String;)V
    //   5010: aload_0
    //   5011: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5014: invokevirtual readByte : ()B
    //   5017: istore #4
    //   5019: invokestatic a : ()Ler;
    //   5022: iload #4
    //   5024: aload_3
    //   5025: invokevirtual a : (ILjava/lang/String;)V
    //   5028: iconst_0
    //   5029: istore #5
    //   5031: goto -> 5117
    //   5034: invokestatic a : ()Ler;
    //   5037: getfield a : [Lcd;
    //   5040: iload #5
    //   5042: aaload
    //   5043: aload_0
    //   5044: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5047: invokevirtual readUTF : ()Ljava/lang/String;
    //   5050: putfield i : Ljava/lang/String;
    //   5053: aload_0
    //   5054: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5057: invokevirtual readByte : ()B
    //   5060: dup
    //   5061: istore_1
    //   5062: ifne -> 5078
    //   5065: invokestatic a : ()Ler;
    //   5068: getfield a : [Lcd;
    //   5071: iload #5
    //   5073: aaload
    //   5074: iconst_1
    //   5075: invokevirtual c : (I)V
    //   5078: iload_1
    //   5079: iconst_1
    //   5080: if_icmpne -> 5096
    //   5083: invokestatic a : ()Ler;
    //   5086: getfield a : [Lcd;
    //   5089: iload #5
    //   5091: aaload
    //   5092: iconst_0
    //   5093: invokevirtual c : (I)V
    //   5096: iload_1
    //   5097: iconst_2
    //   5098: if_icmpne -> 5114
    //   5101: invokestatic a : ()Ler;
    //   5104: getfield a : [Lcd;
    //   5107: iload #5
    //   5109: aaload
    //   5110: iconst_2
    //   5111: invokevirtual c : (I)V
    //   5114: iinc #5, 1
    //   5117: iload #5
    //   5119: iload #4
    //   5121: if_icmplt -> 5034
    //   5124: return
    //   5125: aload_0
    //   5126: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5129: invokevirtual readByte : ()B
    //   5132: dup
    //   5133: istore #5
    //   5135: iconst_1
    //   5136: if_icmpne -> 5190
    //   5139: aload_0
    //   5140: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5143: invokevirtual readInt : ()I
    //   5146: istore_1
    //   5147: new java/lang/StringBuffer
    //   5150: dup
    //   5151: iload_1
    //   5152: invokestatic valueOf : (I)Ljava/lang/String;
    //   5155: invokespecial <init> : (Ljava/lang/String;)V
    //   5158: invokevirtual toString : ()Ljava/lang/String;
    //   5161: invokestatic b : (Ljava/lang/String;)[B
    //   5164: dup
    //   5165: astore_2
    //   5166: ifnonnull -> 5181
    //   5169: invokestatic a : ()Lbt;
    //   5172: iconst_1
    //   5173: iconst_m1
    //   5174: aconst_null
    //   5175: invokevirtual a : (BI[B)V
    //   5178: goto -> 5190
    //   5181: invokestatic a : ()Lbt;
    //   5184: iconst_1
    //   5185: iload_1
    //   5186: aload_2
    //   5187: invokevirtual a : (BI[B)V
    //   5190: iload #5
    //   5192: ifne -> 6618
    //   5195: aload_0
    //   5196: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5199: invokevirtual readInt : ()I
    //   5202: istore_1
    //   5203: aload_0
    //   5204: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5207: invokevirtual readShort : ()S
    //   5210: dup
    //   5211: istore_2
    //   5212: newarray byte
    //   5214: astore_3
    //   5215: aload_0
    //   5216: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5219: aload_3
    //   5220: iconst_0
    //   5221: iload_2
    //   5222: invokevirtual read : ([BII)I
    //   5225: pop
    //   5226: new java/lang/StringBuffer
    //   5229: dup
    //   5230: iload_1
    //   5231: invokestatic valueOf : (I)Ljava/lang/String;
    //   5234: invokespecial <init> : (Ljava/lang/String;)V
    //   5237: invokevirtual toString : ()Ljava/lang/String;
    //   5240: aload_3
    //   5241: invokestatic a : (Ljava/lang/String;[B)V
    //   5244: return
    //   5245: aload_0
    //   5246: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5249: invokevirtual readUTF : ()Ljava/lang/String;
    //   5252: dup
    //   5253: astore_1
    //   5254: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   5257: astore_1
    //   5258: invokestatic j : ()Lp;
    //   5261: aload_1
    //   5262: invokevirtual a : (Ljava/lang/String;)V
    //   5265: return
    //   5266: aload_0
    //   5267: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5270: invokevirtual readShort : ()S
    //   5273: istore_2
    //   5274: aload_0
    //   5275: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5278: invokevirtual readShort : ()S
    //   5281: istore_3
    //   5282: iload_2
    //   5283: invokestatic a : (I)Z
    //   5286: ifeq -> 5299
    //   5289: iload_2
    //   5290: invokestatic c : (I)Lcy;
    //   5293: iload_3
    //   5294: iconst_0
    //   5295: invokevirtual a : (IZ)V
    //   5298: return
    //   5299: new cy
    //   5302: dup
    //   5303: iload_2
    //   5304: iload_3
    //   5305: invokespecial <init> : (SI)V
    //   5308: astore_1
    //   5309: getstatic af.br : Ljava/util/Vector;
    //   5312: aload_1
    //   5313: invokevirtual addElement : (Ljava/lang/Object;)V
    //   5316: return
    //   5317: invokestatic a : ()Lau;
    //   5320: iconst_0
    //   5321: putfield b : S
    //   5324: invokestatic a : ()Lau;
    //   5327: aload_0
    //   5328: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5331: invokevirtual readShort : ()S
    //   5334: putfield c : S
    //   5337: invokestatic a : ()Lau;
    //   5340: invokestatic a : ()Lau;
    //   5343: invokestatic currentTimeMillis : ()J
    //   5346: dup2_x1
    //   5347: putfield e : J
    //   5350: putfield d : J
    //   5353: invokestatic a : ()Lau;
    //   5356: aload_0
    //   5357: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5360: invokevirtual readByte : ()B
    //   5363: putfield a : B
    //   5366: invokestatic a : ()Lau;
    //   5369: invokevirtual b : ()V
    //   5372: return
    //   5373: aload_0
    //   5374: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5377: invokevirtual readByte : ()B
    //   5380: istore_1
    //   5381: new java/lang/StringBuffer
    //   5384: dup
    //   5385: ldc 'server gui ve actionFlag = '
    //   5387: invokespecial <init> : (Ljava/lang/String;)V
    //   5390: iload_1
    //   5391: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5394: invokevirtual toString : ()Ljava/lang/String;
    //   5397: invokestatic c : (Ljava/lang/String;)V
    //   5400: iload_1
    //   5401: ifne -> 5553
    //   5404: getstatic main/a.G : Lg;
    //   5407: getfield Y : Lel;
    //   5410: invokevirtual removeAllElements : ()V
    //   5413: aload_0
    //   5414: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5417: invokevirtual readByte : ()B
    //   5420: istore_1
    //   5421: iconst_0
    //   5422: istore_2
    //   5423: goto -> 5535
    //   5426: new h
    //   5429: dup
    //   5430: invokespecial <init> : ()V
    //   5433: astore_3
    //   5434: aload_0
    //   5435: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5438: invokevirtual readShort : ()S
    //   5441: dup
    //   5442: istore #4
    //   5444: iconst_m1
    //   5445: if_icmpeq -> 5522
    //   5448: aload_3
    //   5449: iload #4
    //   5451: invokestatic a : (S)Ldd;
    //   5454: putfield b : Ldd;
    //   5457: aload_0
    //   5458: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5461: invokevirtual readByte : ()B
    //   5464: dup
    //   5465: istore #5
    //   5467: iconst_m1
    //   5468: if_icmpeq -> 5522
    //   5471: aload_3
    //   5472: iload #5
    //   5474: anewarray ee
    //   5477: putfield a : [Lee;
    //   5480: iconst_0
    //   5481: istore #6
    //   5483: goto -> 5512
    //   5486: invokestatic a : ()Lac;
    //   5489: pop
    //   5490: aload_0
    //   5491: invokestatic b : (Ly;)Lee;
    //   5494: dup
    //   5495: astore #64
    //   5497: ifnull -> 5509
    //   5500: aload_3
    //   5501: getfield a : [Lee;
    //   5504: iload #6
    //   5506: aload #64
    //   5508: aastore
    //   5509: iinc #6, 1
    //   5512: iload #6
    //   5514: aload_3
    //   5515: getfield a : [Lee;
    //   5518: arraylength
    //   5519: if_icmplt -> 5486
    //   5522: getstatic main/a.G : Lg;
    //   5525: getfield Y : Lel;
    //   5528: aload_3
    //   5529: invokevirtual addElement : (Ljava/lang/Object;)V
    //   5532: iinc #2, 1
    //   5535: iload_2
    //   5536: iload_1
    //   5537: if_icmplt -> 5426
    //   5540: getstatic main/a.G : Lg;
    //   5543: invokevirtual h : ()V
    //   5546: getstatic main/a.G : Lg;
    //   5549: invokevirtual s : ()V
    //   5552: return
    //   5553: iload_1
    //   5554: iconst_1
    //   5555: if_icmpne -> 5647
    //   5558: aload_0
    //   5559: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5562: invokevirtual readInt : ()I
    //   5565: istore_1
    //   5566: aload_0
    //   5567: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5570: invokevirtual readByte : ()B
    //   5573: istore_2
    //   5574: new java/lang/StringBuffer
    //   5577: dup
    //   5578: ldc '---------------actionFlag1:  '
    //   5580: invokespecial <init> : (Ljava/lang/String;)V
    //   5583: iload_1
    //   5584: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5587: ldc ' : '
    //   5589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5592: iload_2
    //   5593: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5596: invokevirtual toString : ()Ljava/lang/String;
    //   5599: invokestatic c : (Ljava/lang/String;)V
    //   5602: iload_1
    //   5603: invokestatic e : ()Laf;
    //   5606: getfield J : I
    //   5609: if_icmpne -> 5622
    //   5612: invokestatic e : ()Laf;
    //   5615: iload_2
    //   5616: putfield by : B
    //   5619: goto -> 5637
    //   5622: iload_1
    //   5623: invokestatic b : (I)Laf;
    //   5626: ifnull -> 5637
    //   5629: iload_1
    //   5630: invokestatic b : (I)Laf;
    //   5633: iload_2
    //   5634: putfield by : B
    //   5637: invokestatic j : ()Lp;
    //   5640: pop
    //   5641: iload_1
    //   5642: iload_2
    //   5643: invokestatic a : (IB)V
    //   5646: return
    //   5647: iload_1
    //   5648: iconst_2
    //   5649: if_icmpne -> 6618
    //   5652: aload_0
    //   5653: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5656: invokevirtual readByte : ()B
    //   5659: istore_1
    //   5660: aload_0
    //   5661: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5664: invokevirtual readShort : ()S
    //   5667: istore_2
    //   5668: new ep
    //   5671: dup
    //   5672: invokespecial <init> : ()V
    //   5675: dup
    //   5676: astore_3
    //   5677: iload_1
    //   5678: putfield a : B
    //   5681: aload_3
    //   5682: iload_2
    //   5683: putfield b : I
    //   5686: getstatic p.H : Lel;
    //   5689: aload_3
    //   5690: invokevirtual addElement : (Ljava/lang/Object;)V
    //   5693: iconst_0
    //   5694: istore #4
    //   5696: goto -> 5761
    //   5699: getstatic p.H : Lel;
    //   5702: iload #4
    //   5704: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   5707: checkcast ep
    //   5710: astore #5
    //   5712: new java/lang/StringBuffer
    //   5715: dup
    //   5716: ldc 'i: '
    //   5718: invokespecial <init> : (Ljava/lang/String;)V
    //   5721: iload #4
    //   5723: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5726: ldc '  cflag: '
    //   5728: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5731: aload #5
    //   5733: getfield a : B
    //   5736: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5739: ldc '   IDimageFlag: '
    //   5741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5744: aload #5
    //   5746: getfield b : I
    //   5749: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5752: invokevirtual toString : ()Ljava/lang/String;
    //   5755: invokestatic c : (Ljava/lang/String;)V
    //   5758: iinc #4, 1
    //   5761: iload #4
    //   5763: getstatic p.H : Lel;
    //   5766: invokevirtual size : ()I
    //   5769: if_icmplt -> 5699
    //   5772: iconst_0
    //   5773: istore #4
    //   5775: goto -> 5813
    //   5778: getstatic p.D : Lel;
    //   5781: iload #4
    //   5783: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   5786: checkcast af
    //   5789: dup
    //   5790: astore #5
    //   5792: ifnull -> 5810
    //   5795: aload #5
    //   5797: getfield by : B
    //   5800: iload_1
    //   5801: if_icmpne -> 5810
    //   5804: aload #5
    //   5806: iload_2
    //   5807: putfield bz : I
    //   5810: iinc #4, 1
    //   5813: iload #4
    //   5815: getstatic p.D : Lel;
    //   5818: invokevirtual size : ()I
    //   5821: if_icmplt -> 5778
    //   5824: invokestatic e : ()Laf;
    //   5827: getfield by : B
    //   5830: iload_1
    //   5831: if_icmpne -> 6618
    //   5834: invokestatic e : ()Laf;
    //   5837: iload_2
    //   5838: putfield bz : I
    //   5841: return
    //   5842: aload_0
    //   5843: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5846: invokevirtual readByte : ()B
    //   5849: dup
    //   5850: istore_1
    //   5851: ifeq -> 6618
    //   5854: iload_1
    //   5855: iconst_1
    //   5856: if_icmpne -> 6618
    //   5859: getstatic main/a.I : Lx;
    //   5862: iconst_0
    //   5863: putfield n : Z
    //   5866: invokestatic a : ()Lbt;
    //   5869: ldc 'acc'
    //   5871: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   5874: ldc 'pass'
    //   5876: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   5879: ldc '2.4.6'
    //   5881: iconst_0
    //   5882: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V
    //   5885: return
    //   5886: getstatic main/a.I : Lx;
    //   5889: ifnonnull -> 5902
    //   5892: new x
    //   5895: dup
    //   5896: invokespecial <init> : ()V
    //   5899: putstatic main/a.I : Lx;
    //   5902: getstatic main/a.I : Lx;
    //   5905: iconst_1
    //   5906: putfield n : Z
    //   5909: invokestatic b : ()V
    //   5912: aload_0
    //   5913: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5916: invokevirtual readUTF : ()Ljava/lang/String;
    //   5919: astore_2
    //   5920: new java/lang/StringBuffer
    //   5923: dup
    //   5924: ldc 'userAo'
    //   5926: invokespecial <init> : (Ljava/lang/String;)V
    //   5929: getstatic bs.n : I
    //   5932: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5935: invokevirtual toString : ()Ljava/lang/String;
    //   5938: aload_2
    //   5939: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   5942: invokestatic a : ()Lbt;
    //   5945: invokevirtual c : ()V
    //   5948: invokestatic a : ()Lbt;
    //   5951: aload_2
    //   5952: ldc ''
    //   5954: ldc '2.4.6'
    //   5956: iconst_1
    //   5957: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V
    //   5960: return
    //   5961: invokestatic c : ()V
    //   5964: iconst_0
    //   5965: istore_3
    //   5966: getstatic main/a.A : I
    //   5969: iconst_2
    //   5970: getstatic g.ab : I
    //   5973: imul
    //   5974: if_icmple -> 5979
    //   5977: iconst_1
    //   5978: istore_3
    //   5979: aload_0
    //   5980: invokevirtual c : ()Ljava/io/DataInputStream;
    //   5983: invokevirtual readByte : ()B
    //   5986: dup
    //   5987: istore #4
    //   5989: iflt -> 6618
    //   5992: new java/lang/StringBuffer
    //   5995: dup
    //   5996: ldc 't Indxe= '
    //   5998: invokespecial <init> : (Ljava/lang/String;)V
    //   6001: iload #4
    //   6003: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   6006: invokevirtual toString : ()Ljava/lang/String;
    //   6009: invokestatic c : (Ljava/lang/String;)V
    //   6012: getstatic main/a.G : Lg;
    //   6015: getfield K : [I
    //   6018: iload #4
    //   6020: aload_0
    //   6021: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6024: invokevirtual readByte : ()B
    //   6027: iastore
    //   6028: getstatic main/a.G : Lg;
    //   6031: getfield L : [I
    //   6034: iload #4
    //   6036: aload_0
    //   6037: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6040: invokevirtual readByte : ()B
    //   6043: iastore
    //   6044: new java/lang/StringBuffer
    //   6047: dup
    //   6048: ldc 'max page= '
    //   6050: invokespecial <init> : (Ljava/lang/String;)V
    //   6053: getstatic main/a.G : Lg;
    //   6056: getfield K : [I
    //   6059: iload #4
    //   6061: iaload
    //   6062: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   6065: ldc ' curr page= '
    //   6067: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   6070: getstatic main/a.G : Lg;
    //   6073: getfield L : [I
    //   6076: iload #4
    //   6078: iaload
    //   6079: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   6082: invokevirtual toString : ()Ljava/lang/String;
    //   6085: invokestatic c : (Ljava/lang/String;)V
    //   6088: aload_0
    //   6089: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6092: invokevirtual readUnsignedByte : ()I
    //   6095: istore #5
    //   6097: invokestatic e : ()Laf;
    //   6100: getfield aJ : [[Lh;
    //   6103: iload #4
    //   6105: iload #5
    //   6107: anewarray h
    //   6110: aastore
    //   6111: getstatic aw.er : Ljava/lang/String;
    //   6114: putstatic g.ar : Ljava/lang/String;
    //   6117: iconst_0
    //   6118: istore #6
    //   6120: goto -> 6579
    //   6123: aload_0
    //   6124: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6127: invokevirtual readShort : ()S
    //   6130: dup
    //   6131: istore #64
    //   6133: iconst_m1
    //   6134: if_icmpeq -> 6576
    //   6137: invokestatic e : ()Laf;
    //   6140: getfield aJ : [[Lh;
    //   6143: iload #4
    //   6145: aaload
    //   6146: iload #6
    //   6148: new h
    //   6151: dup
    //   6152: invokespecial <init> : ()V
    //   6155: aastore
    //   6156: invokestatic e : ()Laf;
    //   6159: getfield aJ : [[Lh;
    //   6162: iload #4
    //   6164: aaload
    //   6165: iload #6
    //   6167: aaload
    //   6168: iload #64
    //   6170: invokestatic a : (S)Ldd;
    //   6173: putfield b : Ldd;
    //   6176: invokestatic e : ()Laf;
    //   6179: getfield aJ : [[Lh;
    //   6182: iload #4
    //   6184: aaload
    //   6185: iload #6
    //   6187: aaload
    //   6188: aload_0
    //   6189: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6192: invokevirtual readShort : ()S
    //   6195: putfield d : I
    //   6198: invokestatic e : ()Laf;
    //   6201: getfield aJ : [[Lh;
    //   6204: iload #4
    //   6206: aaload
    //   6207: iload #6
    //   6209: aaload
    //   6210: aload_0
    //   6211: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6214: invokevirtual readInt : ()I
    //   6217: putfield n : I
    //   6220: invokestatic e : ()Laf;
    //   6223: getfield aJ : [[Lh;
    //   6226: iload #4
    //   6228: aaload
    //   6229: iload #6
    //   6231: aaload
    //   6232: aload_0
    //   6233: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6236: invokevirtual readInt : ()I
    //   6239: putfield p : I
    //   6242: invokestatic e : ()Laf;
    //   6245: getfield aJ : [[Lh;
    //   6248: iload #4
    //   6250: aaload
    //   6251: iload #6
    //   6253: aaload
    //   6254: aload_0
    //   6255: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6258: invokevirtual readByte : ()B
    //   6261: putfield v : B
    //   6264: invokestatic e : ()Laf;
    //   6267: getfield aJ : [[Lh;
    //   6270: iload #4
    //   6272: aaload
    //   6273: iload #6
    //   6275: aaload
    //   6276: aload_0
    //   6277: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6280: invokevirtual readInt : ()I
    //   6283: putfield h : I
    //   6286: invokestatic e : ()Laf;
    //   6289: getfield aJ : [[Lh;
    //   6292: iload #4
    //   6294: aaload
    //   6295: iload #6
    //   6297: aaload
    //   6298: aload_0
    //   6299: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6302: invokevirtual readByte : ()B
    //   6305: putfield B : B
    //   6308: aload_0
    //   6309: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6312: invokevirtual readByte : ()B
    //   6315: dup
    //   6316: istore #65
    //   6318: iconst_m1
    //   6319: if_icmpeq -> 6439
    //   6322: invokestatic e : ()Laf;
    //   6325: getfield aJ : [[Lh;
    //   6328: iload #4
    //   6330: aaload
    //   6331: iload #6
    //   6333: aaload
    //   6334: iload #65
    //   6336: anewarray ee
    //   6339: putfield a : [Lee;
    //   6342: iconst_0
    //   6343: istore #66
    //   6345: goto -> 6418
    //   6348: invokestatic a : ()Lac;
    //   6351: pop
    //   6352: aload_0
    //   6353: invokestatic b : (Ly;)Lee;
    //   6356: dup
    //   6357: astore #67
    //   6359: ifnull -> 6415
    //   6362: invokestatic e : ()Laf;
    //   6365: getfield aJ : [[Lh;
    //   6368: iload #4
    //   6370: aaload
    //   6371: iload #6
    //   6373: aaload
    //   6374: getfield a : [Lee;
    //   6377: iload #66
    //   6379: aload #67
    //   6381: aastore
    //   6382: invokestatic e : ()Laf;
    //   6385: getfield aJ : [[Lh;
    //   6388: iload #4
    //   6390: aaload
    //   6391: iload #6
    //   6393: aaload
    //   6394: getstatic main/a.G : Lg;
    //   6397: invokestatic e : ()Laf;
    //   6400: getfield aJ : [[Lh;
    //   6403: iload #4
    //   6405: aaload
    //   6406: iload #6
    //   6408: aaload
    //   6409: invokevirtual a : (Lh;)I
    //   6412: putfield A : I
    //   6415: iinc #66, 1
    //   6418: iload #66
    //   6420: invokestatic e : ()Laf;
    //   6423: getfield aJ : [[Lh;
    //   6426: iload #4
    //   6428: aaload
    //   6429: iload #6
    //   6431: aaload
    //   6432: getfield a : [Lee;
    //   6435: arraylength
    //   6436: if_icmplt -> 6348
    //   6439: aload_0
    //   6440: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6443: invokevirtual readByte : ()B
    //   6446: dup
    //   6447: istore #66
    //   6449: iconst_1
    //   6450: if_icmpne -> 6512
    //   6453: aload_0
    //   6454: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6457: invokevirtual readShort : ()S
    //   6460: istore #67
    //   6462: aload_0
    //   6463: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6466: invokevirtual readShort : ()S
    //   6469: istore #68
    //   6471: aload_0
    //   6472: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6475: invokevirtual readShort : ()S
    //   6478: istore #69
    //   6480: aload_0
    //   6481: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6484: invokevirtual readShort : ()S
    //   6487: istore #70
    //   6489: invokestatic e : ()Laf;
    //   6492: getfield aJ : [[Lh;
    //   6495: iload #4
    //   6497: aaload
    //   6498: iload #6
    //   6500: aaload
    //   6501: iload #67
    //   6503: iload #68
    //   6505: iload #69
    //   6507: iload #70
    //   6509: invokevirtual a : (IIII)V
    //   6512: getstatic main/GameMidlet.e : I
    //   6515: sipush #237
    //   6518: if_icmplt -> 6576
    //   6521: invokestatic e : ()Laf;
    //   6524: getfield aJ : [[Lh;
    //   6527: iload #4
    //   6529: aaload
    //   6530: iload #6
    //   6532: aaload
    //   6533: aload_0
    //   6534: invokevirtual c : ()Ljava/io/DataInputStream;
    //   6537: invokevirtual readUTF : ()Ljava/lang/String;
    //   6540: putfield H : Ljava/lang/String;
    //   6543: new java/lang/StringBuffer
    //   6546: dup
    //   6547: ldc 'nguoi ki gui  '
    //   6549: invokespecial <init> : (Ljava/lang/String;)V
    //   6552: invokestatic e : ()Laf;
    //   6555: getfield aJ : [[Lh;
    //   6558: iload #4
    //   6560: aaload
    //   6561: iload #6
    //   6563: aaload
    //   6564: getfield H : Ljava/lang/String;
    //   6567: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   6570: invokevirtual toString : ()Ljava/lang/String;
    //   6573: invokestatic b : (Ljava/lang/String;)V
    //   6576: iinc #6, 1
    //   6579: iload #6
    //   6581: iload #5
    //   6583: if_icmplt -> 6123
    //   6586: iload_3
    //   6587: ifeq -> 6596
    //   6590: getstatic main/a.H : Lg;
    //   6593: invokevirtual e : ()V
    //   6596: getstatic main/a.G : Lg;
    //   6599: invokevirtual y : ()V
    //   6602: getstatic main/a.G : Lg;
    //   6605: getstatic main/a.G : Lg;
    //   6608: iconst_0
    //   6609: dup_x1
    //   6610: putfield f : I
    //   6613: putfield g : I
    //   6616: return
    //   6617: pop
    //   6618: return
    // Exception table:
    //   from	to	target	type
    //   0	2534	6617	java/lang/Exception
    //   339	444	533	java/lang/Exception
    //   447	495	533	java/lang/Exception
    //   498	520	533	java/lang/Exception
    //   523	530	533	java/lang/Exception
    //   543	1468	1471	java/lang/Exception
    //   1478	1506	1507	java/lang/Exception
    //   1524	1575	1578	java/lang/Exception
    //   1669	1741	1744	java/lang/Exception
    //   2535	2573	6617	java/lang/Exception
    //   2574	2705	6617	java/lang/Exception
    //   2706	2744	6617	java/lang/Exception
    //   2745	2906	6617	java/lang/Exception
    //   2907	6616	6617	java/lang/Exception
  }
  
  private static void b(y paramy) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()Ljava/io/DataInputStream;
    //   4: invokevirtual readByte : ()B
    //   7: dup
    //   8: istore_1
    //   9: ifne -> 82
    //   12: aload_0
    //   13: invokevirtual c : ()Ljava/io/DataInputStream;
    //   16: invokevirtual readByte : ()B
    //   19: dup
    //   20: istore_1
    //   21: newarray short
    //   23: astore_2
    //   24: iconst_0
    //   25: istore_3
    //   26: goto -> 42
    //   29: aload_2
    //   30: iload_3
    //   31: aload_0
    //   32: invokevirtual c : ()Ljava/io/DataInputStream;
    //   35: invokevirtual readShort : ()S
    //   38: sastore
    //   39: iinc #3, 1
    //   42: iload_3
    //   43: iload_1
    //   44: if_icmplt -> 29
    //   47: aload_0
    //   48: invokevirtual c : ()Ljava/io/DataInputStream;
    //   51: invokevirtual readByte : ()B
    //   54: istore_3
    //   55: aload_0
    //   56: invokevirtual c : ()Ljava/io/DataInputStream;
    //   59: invokevirtual readInt : ()I
    //   62: istore_1
    //   63: aload_0
    //   64: invokevirtual c : ()Ljava/io/DataInputStream;
    //   67: invokevirtual readShort : ()S
    //   70: istore_0
    //   71: invokestatic a : ()Lar;
    //   74: aload_2
    //   75: iload_3
    //   76: iload_1
    //   77: iload_0
    //   78: invokevirtual a : ([SBIS)V
    //   81: return
    //   82: iload_1
    //   83: iconst_1
    //   84: if_icmpne -> 135
    //   87: aload_0
    //   88: invokevirtual c : ()Ljava/io/DataInputStream;
    //   91: invokevirtual readByte : ()B
    //   94: dup
    //   95: istore_1
    //   96: newarray short
    //   98: astore_2
    //   99: iconst_0
    //   100: istore_3
    //   101: goto -> 117
    //   104: aload_2
    //   105: iload_3
    //   106: aload_0
    //   107: invokevirtual c : ()Ljava/io/DataInputStream;
    //   110: invokevirtual readShort : ()S
    //   113: sastore
    //   114: iinc #3, 1
    //   117: iload_3
    //   118: iload_1
    //   119: if_icmplt -> 104
    //   122: invokestatic a : ()Lar;
    //   125: aload_2
    //   126: invokevirtual a : ([S)V
    //   129: return
    //   130: dup
    //   131: astore_1
    //   132: invokevirtual printStackTrace : ()V
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   0	129	130	java/io/IOException
  }
  
  private static void a(y paramy, int paramInt) {
    try {
      byte b;
      cl cl;
      if ((cl = aa.a(b = paramy.c().readByte())) == null)
        return; 
      if (paramInt == 10) {
        short s1 = paramy.c().readShort();
        short s2 = paramy.c().readShort();
        cl.a(s1, s2);
      } 
      if (paramInt >= 11 && paramInt <= 20) {
        byte b1;
        af[] arrayOfAf = new af[b1 = paramy.c().readByte()];
        long[] arrayOfLong = new long[b1];
        byte b2;
        for (b2 = 0; b2 < b1; b2++) {
          int i = paramy.c().readInt();
          arrayOfAf[b2] = null;
          if (i != (af.e()).J) {
            arrayOfAf[b2] = p.b(i);
          } else {
            arrayOfAf[b2] = af.e();
          } 
          arrayOfLong[b2] = paramy.c().readLong();
        } 
        b2 = paramy.c().readByte();
        cl.a(arrayOfAf, arrayOfLong, (byte)(paramInt - 10), b2);
      } 
      if (paramInt == 21) {
        cl.a = paramy.c().readShort();
        cl.b = paramy.c().readShort();
        cl.C();
      } 
      if (paramInt == 23) {
        cl.D();
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */