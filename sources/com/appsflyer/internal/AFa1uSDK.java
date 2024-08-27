package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public class AFa1uSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    private static Object afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    public static final Map<Integer, Object> afRDLog;
    private static byte[] getLevel;
    private static long getProductId;
    private static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0055 -> B:4:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            int r0 = com.appsflyer.internal.AFa1uSDK.$11
            r1 = r0 | 105(0x69, float:1.47E-43)
            int r1 = r1 << 1
            r0 = r0 ^ 105(0x69, float:1.47E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.$10 = r0
            int r1 = r1 % 2
            int r9 = r9 + 41
            byte[] r1 = com.appsflyer.internal.AFa1uSDK.$$a
            r2 = r11 & (-79)
            r11 = r11 | (-79)
            int r2 = r2 + r11
            r11 = r2 | 80
            int r11 = r11 << 1
            r2 = r2 ^ 80
            int r11 = r11 - r2
            r2 = r10 | 4
            int r2 = r2 << 1
            r10 = r10 ^ 4
            int r2 = r2 - r10
            byte[] r10 = new byte[r11]
            int r11 = r11 + (-1)
            r3 = 0
            if (r1 != 0) goto L49
            r9 = r0 & 9
            r0 = r0 | 9
            int r9 = r9 + r0
            int r0 = r9 % 128
            com.appsflyer.internal.AFa1uSDK.$11 = r0
            int r9 = r9 % 2
            r9 = r0 ^ 67
            r0 = r0 & 67
            int r0 = r0 << 1
            int r9 = r9 + r0
            int r0 = r9 % 128
            com.appsflyer.internal.AFa1uSDK.$10 = r0
            int r9 = r9 % 2
            r9 = r11
            r4 = r2
            r0 = r3
            goto L6c
        L49:
            r0 = r3
        L4a:
            byte r4 = (byte) r9
            r10[r0] = r4
            if (r0 != r11) goto L55
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10, r3)
            return r9
        L55:
            r4 = r1[r2]
            int r0 = r0 + 1
            int r5 = com.appsflyer.internal.AFa1uSDK.$10
            r6 = r5 & 97
            r5 = r5 | 97
            int r6 = r6 + r5
            int r5 = r6 % 128
            com.appsflyer.internal.AFa1uSDK.$11 = r5
            int r6 = r6 % 2
            r7 = r11
            r11 = r9
            r9 = r7
            r8 = r4
            r4 = r2
            r2 = r8
        L6c:
            int r2 = -r2
            r5 = r11 | r2
            int r5 = r5 << 1
            r11 = r11 ^ r2
            int r11 = r5 - r11
            int r4 = r4 + 55
            r2 = r4 ^ (-54)
            r4 = r4 & (-54)
            int r4 = r4 << 1
            int r2 = r2 + r4
            r7 = r11
            r11 = r9
            r9 = r7
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.$$c(int, int, int):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:800)(1:(1:916)(14:(1:918)(1:919)|802|803|804|805|806|807|(3:809|(6:811|812|813|(5:815|816|(1:818)(1:822)|819|820)|823|824)(0)|821)|826|827|(3:898|899|900)(2:829|(3:888|889|890)(13:(4:832|833|834|835)(10:846|847|848|849|850|851|852|853|854|838)|928|911|104|105|106|(0)|130|131|132|133|134|135))|836|837|838))|801|802|803|804|805|806|807|(0)|826|827|(0)(0)|836|837|838) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:990|991|(32:986|987|(0)|13|14|(0)|16|17|(0)|(0)(0)|(0)|47|48|49|50|51|(0)(0)|54|(0)|956|59|60|61|(0)(0)|64|(0)(0)|67|68|69|(0)|950|951)|11|(0)|13|14|(0)|16|17|(0)|(0)(0)|(0)|47|48|49|50|51|(0)(0)|54|(0)|956|59|60|61|(0)(0)|64|(0)(0)|67|68|69|(0)|950|951) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x1733, code lost:
    
        r5 = com.appsflyer.internal.AFa1uSDK.$11;
        r7 = (r5 & 31) + (r5 | 31);
        com.appsflyer.internal.AFa1uSDK.$10 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x1740, code lost:
    
        if ((r7 % 2) != 0) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x1747, code lost:
    
        r7 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x1748, code lost:
    
        if (r26[r3] != false) goto L1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x1762, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x1756, code lost:
    
        com.appsflyer.internal.AFa1uSDK.afErrorLogForExcManagerOnly = null;
        com.appsflyer.internal.AFa1uSDK.AFPurchaseDetails = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x175a, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x1753, code lost:
    
        if (r26[r3] != false) goto L1002;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0354, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r29[10], r6, r29[35])).getMethod($$c((byte) (-com.appsflyer.internal.AFa1uSDK.$$a[436(0x1b4, float:6.11E-43)]), (short) 725, r29[2]), null).invoke(r12, null)).booleanValue() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x04a8, code lost:
    
        if (r26 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0720, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x0721, code lost:
    
        r36 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x0725, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x0726, code lost:
    
        r38 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:959:0x0302, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0088, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x1733  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x12d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x12ff A[Catch: all -> 0x0de9, TRY_ENTER, TRY_LEAVE, TryCatch #72 {all -> 0x0de9, blocks: (B:514:0x0f1a, B:518:0x0f22, B:520:0x0f28, B:521:0x0f29, B:530:0x0f32, B:532:0x0f38, B:533:0x0f39, B:592:0x0dc3, B:597:0x0de5, B:600:0x0dee, B:602:0x0df5, B:603:0x0df6, B:606:0x0df8, B:608:0x0dff, B:609:0x0e00, B:612:0x0e02, B:614:0x0e09, B:615:0x0e0a, B:205:0x0fba, B:230:0x10bd, B:232:0x10c3, B:233:0x10c4, B:432:0x10cb, B:433:0x10d0, B:408:0x117d, B:410:0x1183, B:411:0x1184, B:271:0x12e2, B:292:0x12ff, B:416:0x1140, B:418:0x1146, B:419:0x1147, B:596:0x0dc9, B:591:0x0d96, B:588:0x0d64), top: B:204:0x0fba, inners: #75, #81, #90 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x13cd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x141f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x155c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x1303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1655 A[Catch: all -> 0x152a, TryCatch #9 {all -> 0x152a, blocks: (B:317:0x1514, B:321:0x1535, B:323:0x153b, B:324:0x153c, B:330:0x153e, B:332:0x1547, B:333:0x1548, B:336:0x154a, B:338:0x1553, B:339:0x1554, B:348:0x155c, B:276:0x15a0, B:284:0x1603, B:286:0x1609, B:287:0x160a, B:389:0x160c, B:391:0x1617, B:392:0x1618, B:397:0x1625, B:399:0x162b, B:400:0x162c, B:423:0x162e, B:425:0x1639, B:426:0x163a, B:437:0x163c, B:439:0x1647, B:440:0x1648, B:445:0x164f, B:447:0x1655, B:448:0x1656, B:459:0x1658, B:461:0x1663, B:462:0x1664, B:683:0x1666, B:685:0x1673, B:686:0x1674, B:724:0x168d, B:726:0x1693, B:727:0x1694, B:739:0x16b6, B:741:0x16bc, B:742:0x16bd, B:751:0x16bf, B:753:0x16ce, B:754:0x16cf, B:762:0x16e4, B:764:0x16ea, B:765:0x16eb, B:771:0x16ed, B:773:0x16fc, B:774:0x16fd, B:780:0x1711, B:782:0x1717, B:783:0x1718, B:244:0x10e0, B:209:0x0ffb, B:309:0x14b6, B:307:0x1479, B:197:0x0f4e, B:191:0x0a12, B:179:0x0847, B:164:0x07b9, B:278:0x15d1, B:279:0x1600, B:262:0x11fb), top: B:316:0x1514, inners: #11, #20, #22, #26, #33, #37, #65, #74, #89, #94 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1656 A[Catch: all -> 0x152a, TryCatch #9 {all -> 0x152a, blocks: (B:317:0x1514, B:321:0x1535, B:323:0x153b, B:324:0x153c, B:330:0x153e, B:332:0x1547, B:333:0x1548, B:336:0x154a, B:338:0x1553, B:339:0x1554, B:348:0x155c, B:276:0x15a0, B:284:0x1603, B:286:0x1609, B:287:0x160a, B:389:0x160c, B:391:0x1617, B:392:0x1618, B:397:0x1625, B:399:0x162b, B:400:0x162c, B:423:0x162e, B:425:0x1639, B:426:0x163a, B:437:0x163c, B:439:0x1647, B:440:0x1648, B:445:0x164f, B:447:0x1655, B:448:0x1656, B:459:0x1658, B:461:0x1663, B:462:0x1664, B:683:0x1666, B:685:0x1673, B:686:0x1674, B:724:0x168d, B:726:0x1693, B:727:0x1694, B:739:0x16b6, B:741:0x16bc, B:742:0x16bd, B:751:0x16bf, B:753:0x16ce, B:754:0x16cf, B:762:0x16e4, B:764:0x16ea, B:765:0x16eb, B:771:0x16ed, B:773:0x16fc, B:774:0x16fd, B:780:0x1711, B:782:0x1717, B:783:0x1718, B:244:0x10e0, B:209:0x0ffb, B:309:0x14b6, B:307:0x1479, B:197:0x0f4e, B:191:0x0a12, B:179:0x0847, B:164:0x07b9, B:278:0x15d1, B:279:0x1600, B:262:0x11fb), top: B:316:0x1514, inners: #11, #20, #22, #26, #33, #37, #65, #74, #89, #94 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x1693 A[Catch: all -> 0x152a, TryCatch #9 {all -> 0x152a, blocks: (B:317:0x1514, B:321:0x1535, B:323:0x153b, B:324:0x153c, B:330:0x153e, B:332:0x1547, B:333:0x1548, B:336:0x154a, B:338:0x1553, B:339:0x1554, B:348:0x155c, B:276:0x15a0, B:284:0x1603, B:286:0x1609, B:287:0x160a, B:389:0x160c, B:391:0x1617, B:392:0x1618, B:397:0x1625, B:399:0x162b, B:400:0x162c, B:423:0x162e, B:425:0x1639, B:426:0x163a, B:437:0x163c, B:439:0x1647, B:440:0x1648, B:445:0x164f, B:447:0x1655, B:448:0x1656, B:459:0x1658, B:461:0x1663, B:462:0x1664, B:683:0x1666, B:685:0x1673, B:686:0x1674, B:724:0x168d, B:726:0x1693, B:727:0x1694, B:739:0x16b6, B:741:0x16bc, B:742:0x16bd, B:751:0x16bf, B:753:0x16ce, B:754:0x16cf, B:762:0x16e4, B:764:0x16ea, B:765:0x16eb, B:771:0x16ed, B:773:0x16fc, B:774:0x16fd, B:780:0x1711, B:782:0x1717, B:783:0x1718, B:244:0x10e0, B:209:0x0ffb, B:309:0x14b6, B:307:0x1479, B:197:0x0f4e, B:191:0x0a12, B:179:0x0847, B:164:0x07b9, B:278:0x15d1, B:279:0x1600, B:262:0x11fb), top: B:316:0x1514, inners: #11, #20, #22, #26, #33, #37, #65, #74, #89, #94 }] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1694 A[Catch: all -> 0x152a, TryCatch #9 {all -> 0x152a, blocks: (B:317:0x1514, B:321:0x1535, B:323:0x153b, B:324:0x153c, B:330:0x153e, B:332:0x1547, B:333:0x1548, B:336:0x154a, B:338:0x1553, B:339:0x1554, B:348:0x155c, B:276:0x15a0, B:284:0x1603, B:286:0x1609, B:287:0x160a, B:389:0x160c, B:391:0x1617, B:392:0x1618, B:397:0x1625, B:399:0x162b, B:400:0x162c, B:423:0x162e, B:425:0x1639, B:426:0x163a, B:437:0x163c, B:439:0x1647, B:440:0x1648, B:445:0x164f, B:447:0x1655, B:448:0x1656, B:459:0x1658, B:461:0x1663, B:462:0x1664, B:683:0x1666, B:685:0x1673, B:686:0x1674, B:724:0x168d, B:726:0x1693, B:727:0x1694, B:739:0x16b6, B:741:0x16bc, B:742:0x16bd, B:751:0x16bf, B:753:0x16ce, B:754:0x16cf, B:762:0x16e4, B:764:0x16ea, B:765:0x16eb, B:771:0x16ed, B:773:0x16fc, B:774:0x16fd, B:780:0x1711, B:782:0x1717, B:783:0x1718, B:244:0x10e0, B:209:0x0ffb, B:309:0x14b6, B:307:0x1479, B:197:0x0f4e, B:191:0x0a12, B:179:0x0847, B:164:0x07b9, B:278:0x15d1, B:279:0x1600, B:262:0x11fb), top: B:316:0x1514, inners: #11, #20, #22, #26, #33, #37, #65, #74, #89, #94 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x17bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x04eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x0186 A[Catch: Exception -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #103 {Exception -> 0x0047, blocks: (B:3:0x001d, B:5:0x0036, B:21:0x0137, B:26:0x180a, B:28:0x1811, B:30:0x1812, B:36:0x0201, B:43:0x0253, B:45:0x0259, B:46:0x025a, B:47:0x025b, B:50:0x029d, B:60:0x02e1, B:64:0x02f4, B:68:0x02ff, B:73:0x030b, B:110:0x1742, B:113:0x1747, B:119:0x1756, B:77:0x17d8, B:126:0x1751, B:132:0x176f, B:139:0x17b4, B:141:0x17ba, B:142:0x17bb, B:960:0x0186, B:967:0x17f6, B:969:0x17fd, B:970:0x17fe, B:973:0x1800, B:975:0x1807, B:976:0x1808, B:39:0x021e, B:134:0x1782, B:135:0x17b1, B:964:0x01ce, B:962:0x0197, B:23:0x0159), top: B:2:0x001d, inners: #30, #58, #79, #87, #93 }] */
    /* JADX WARN: Removed duplicated region for block: B:977:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:982:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:986:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v188, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v87, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v11 */
    /* JADX WARN: Type inference failed for: r44v12 */
    /* JADX WARN: Type inference failed for: r44v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v21 */
    /* JADX WARN: Type inference failed for: r44v22 */
    /* JADX WARN: Type inference failed for: r44v24 */
    /* JADX WARN: Type inference failed for: r44v27, types: [int] */
    /* JADX WARN: Type inference failed for: r44v28 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v31 */
    /* JADX WARN: Type inference failed for: r44v32 */
    /* JADX WARN: Type inference failed for: r44v33 */
    /* JADX WARN: Type inference failed for: r44v34 */
    /* JADX WARN: Type inference failed for: r44v35 */
    /* JADX WARN: Type inference failed for: r44v4 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r5v142, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        /*
            Method dump skipped, instructions count: 6206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.<clinit>():void");
    }

    private AFa1uSDK() {
    }

    public static int AFInAppEventType(Object obj) {
        int i10 = $11;
        int i11 = (i10 & 123) + (i10 | 123);
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        int i12 = i10 + 31;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r0[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r0[345], (short) 294, r0[13]), Object.class).invoke(obj2, obj)).intValue();
            int i14 = $11;
            int i15 = (i14 ^ 7) + ((i14 & 7) << 1);
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        int i10 = $11;
        int i11 = ((i10 | 61) << 1) - (i10 ^ 61);
        $10 = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = new byte[1003];
        System.arraycopy("t9\u0007\u001b\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ô)ç\u0005ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ú\u000b\u000bûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u000eñ\"í\u0004ý\u0015á\u0002óÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0015õ÷\u0010ò\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003öô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûå0¸&\u000fù'\u0000\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¸&\u000fù'\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¼\"\u000fù'\u00ad\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 1003);
        $$a = bArr;
        $$b = 60;
        int i13 = $10;
        int i14 = (i13 ^ 17) + ((i13 & 17) << 1);
        $11 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 69 / 0;
        }
    }

    public static int values(int i10) {
        int i11 = $11;
        int i12 = ((i11 | 101) << 1) - (i11 ^ 101);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = afErrorLogForExcManagerOnly;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r9[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c((byte) 77, (short) 519, r9[65]), Integer.TYPE).invoke(obj, Integer.valueOf(i10))).intValue();
            int i13 = $11;
            int i14 = ((i13 | 53) << 1) - (i13 ^ 53);
            $10 = i14 % 128;
            if (i14 % 2 == 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object values(char c10, int i10, int i11) {
        int i12 = $11;
        int i13 = ((i12 | 31) << 1) - (i12 ^ 31);
        int i14 = i13 % 128;
        $10 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        Object obj = afErrorLogForExcManagerOnly;
        int i15 = i14 + 87;
        int i16 = i15 % 128;
        $11 = i16;
        int i17 = i15 % 2;
        int i18 = i16 + 107;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        try {
            Object[] objArr = {Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[436]), (short) 808, bArr[309]), true, (ClassLoader) AFPurchaseDetails);
            byte b10 = bArr[345];
            String $$c = $$c(b10, (short) 343, b10);
            Class<?> cls2 = Integer.TYPE;
            return cls.getMethod($$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
