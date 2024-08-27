package com.appsflyer.internal;

import java.util.Map;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public class AFc1fSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    public static final Map<Integer, Object> afDebugLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    private static long getCurrency;
    private static byte[] getLevel;
    private static int getPrice;
    private static byte[] getPurchaseToken;
    private static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005f -> B:6:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r0 = com.appsflyer.internal.AFc1fSDK.$10
            r1 = r0 & 45
            r2 = r0 | 45
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r2
            int r1 = r1 % 2
            int r8 = -r8
            r1 = r8 & 36
            r8 = r8 | 36
            int r1 = r1 + r8
            int r9 = r9 + 41
            int r8 = -r10
            r10 = r8 & 950(0x3b6, float:1.331E-42)
            r8 = r8 | 950(0x3b6, float:1.331E-42)
            int r10 = r10 + r8
            byte[] r8 = com.appsflyer.internal.AFc1fSDK.$$a
            byte[] r2 = new byte[r1]
            int r3 = ~r1
            int r1 = r1 << 1
            int r3 = r3 + r1
            r1 = 0
            if (r8 != 0) goto L3f
            int r0 = r0 + 63
            int r4 = r0 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L3d
            int r4 = r4 + 13
            int r0 = r4 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r0
            int r4 = r4 % 2
            r0 = r10
            r4 = r3
            r3 = r2
            r2 = r1
            goto L79
        L3d:
            r8 = 0
            throw r8
        L3f:
            r0 = r1
        L40:
            byte r4 = (byte) r9
            r2[r0] = r4
            if (r0 != r3) goto L5f
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2, r1)
            int r9 = com.appsflyer.internal.AFc1fSDK.$11
            r10 = r9 ^ 45
            r9 = r9 & 45
            int r9 = r9 << 1
            int r10 = r10 + r9
            int r9 = r10 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r9
            int r10 = r10 % 2
            if (r10 == 0) goto L5e
            r9 = 51
            int r9 = r9 / r1
        L5e:
            return r8
        L5f:
            int r0 = r0 + 1
            r4 = r8[r10]
            int r5 = com.appsflyer.internal.AFc1fSDK.$10
            r6 = r5 ^ 9
            r5 = r5 & 9
            int r5 = r5 << 1
            int r6 = r6 + r5
            int r5 = r6 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r5
            int r6 = r6 % 2
            r7 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r7
        L79:
            r5 = r10 ^ r9
            r9 = r9 & r10
            int r9 = r9 << 1
            int r5 = r5 + r9
            int r10 = r0 + 1
            int r9 = r5 + 1
            int r0 = com.appsflyer.internal.AFc1fSDK.$11
            int r0 = r0 + 103
            int r5 = r0 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r5
            int r0 = r0 % 2
            r0 = r2
            r2 = r3
            r3 = r4
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.$$c(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:811)(1:(1:918)(1:(1:920)(13:921|813|814|815|816|817|(2:(6:820|821|822|(1:824)(1:828)|825|826)(2:832|833)|827)|834|835|(3:904|905|906)(2:837|(3:894|895|896)(14:(3:882|883|884)(9:840|841|843|844|845|846|847|848|849)|829|830|831|212|213|214|(2:216|(7:218|219|220|221|(5:225|226|227|228|229)|223|224)(4:235|(6:237|238|226|227|228|229)|223|224))|239|240|241|242|243|244))|885|886|849)))|812|813|814|815|816|817|(0)|834|835|(0)(0)|885|886|849) */
    /* JADX WARN: Can't wrap try/catch for region: R(43:1|2|3|(1:5)(1:1012)|6|7|8|(33:10|11|(31:1002|1003|(31:15|16|(1:18)(1:999)|19|(26:994|995|22|(1:(1:25)(3:26|27|28))|(5:37|38|39|40|41)|(4:56|57|58|59)|67|68|69|70|71|(1:73)(1:991)|74|(1:78)(1:990)|79|80|(1:82)(1:988)|83|84|(1:86)(1:987)|87|88|89|(2:91|(3:93|(24:95|96|97|98|(11:100|(6:102|103|104|105|106|107)(1:975)|940|941|942|943|944|945|946|947|949)(1:976)|109|(13:799|800|801|802|803|804|805|806|807|808|(14:(1:811)(1:(1:918)(1:(1:920)(13:921|813|814|815|816|817|(2:(6:820|821|822|(1:824)(1:828)|825|826)(2:832|833)|827)|834|835|(3:904|905|906)(2:837|(3:894|895|896)(14:(3:882|883|884)(9:840|841|843|844|845|846|847|848|849)|829|830|831|212|213|214|(2:216|(7:218|219|220|221|(5:225|226|227|228|229)|223|224)(4:235|(6:237|238|226|227|228|229)|223|224))|239|240|241|242|243|244))|885|886|849)))|812|813|814|815|816|817|(0)|834|835|(0)(0)|885|886|849)|922|923)(1:111)|112|113|114|116|117|118|119|120|121|122|123|124|125|126|127|128|(12:129|130|131|132|133|134|(11:136|(1:138)(1:741)|139|140|141|142|143|144|145|146|147)(11:742|743|744|745|746|747|748|749|750|751|752)|148|149|150|(2:152|(50:154|155|(1:157)(1:525)|(1:159)(1:524)|160|161|162|163|(3:165|166|167)|265|266|267|268|(14:270|271|272|273|274|275|276|277|278|279|280|281|(4:283|284|285|286)(0)|296)|509|510|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328|(4:330|331|332|333))(3:529|530|531))(52:532|533|534|535|536|537|538|539|540|541|542|(3:543|544|(5:546|547|548|549|(9:551|552|553|554|555|556|557|558|559)(1:573))(1:701))|574|575|576|577|578|579|580|582|583|584|585|586|587|588|589|590|591|592|593|594|595|596|597|598|599|600|601|602|603|604|605|606|607|608|609|(3:611|(3:617|618|620)(3:613|614|615)|616)|635|636|637|(2:639|(1:641)(3:642|643|644)))|(14:415|416|417|418|419|420|421|422|423|424|425|(1:427)|428|(20:349|350|351|352|353|354|355|356|357|358|359|360|361|362|363|364|365|366|367|368)(3:398|399|400))(8:341|342|343|344|345|346|347|(0)(0))))(2:980|981)|230)(2:982|983))|984|985)|21|22|(0)|(0)|(4:56|57|58|59)|67|68|69|70|71|(0)(0)|74|(14:76|78|79|80|(0)(0)|83|84|(0)(0)|87|88|89|(0)|984|985)|990|79|80|(0)(0)|83|84|(0)(0)|87|88|89|(0)|984|985)|1001|(0)|21|22|(0)|(0)|(0)|67|68|69|70|71|(0)(0)|74|(0)|990|79|80|(0)(0)|83|84|(0)(0)|87|88|89|(0)|984|985)|13|(0)|1001|(0)|21|22|(0)|(0)|(0)|67|68|69|70|71|(0)(0)|74|(0)|990|79|80|(0)(0)|83|84|(0)(0)|87|88|89|(0)|984|985)|1006|1007|11|(0)|13|(0)|1001|(0)|21|22|(0)|(0)|(0)|67|68|69|70|71|(0)(0)|74|(0)|990|79|80|(0)(0)|83|84|(0)(0)|87|88|89|(0)|984|985|(2:(1:245)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03a0, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c((byte) (-r2[342(0x156, float:4.79E-43)]), (byte) (-r2[120(0x78, float:1.68E-43)]), r11)).getMethod($$c(r2[222(0xde, float:3.11E-43)], r2[33], (short) 181), null).invoke(r13, null)).booleanValue() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0753, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:993:0x0326, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x17b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1482  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a9 A[Catch: Exception -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #105 {Exception -> 0x004a, blocks: (B:3:0x0020, B:5:0x0038, B:26:0x0163, B:31:0x1884, B:33:0x188b, B:35:0x188c, B:37:0x01a9, B:44:0x1870, B:46:0x1877, B:47:0x1878, B:50:0x187a, B:52:0x1881, B:53:0x1882, B:57:0x022a, B:63:0x0276, B:65:0x027c, B:66:0x027d, B:67:0x027e, B:70:0x02c2, B:80:0x0303, B:83:0x030c, B:88:0x0323, B:93:0x033f, B:218:0x17c1, B:221:0x17c6, B:227:0x17d5, B:230:0x1853, B:235:0x17d0, B:241:0x17ec, B:248:0x182f, B:250:0x1835, B:251:0x1836, B:243:0x17ff, B:244:0x182c, B:41:0x01f5, B:59:0x023d, B:39:0x01bb, B:28:0x0183), top: B:2:0x0020, inners: #2, #33, #36, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x15ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:904:0x051a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:988:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:991:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:994:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v133, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v166, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v160, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v195 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r5v206, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v226, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v237, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v246, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v208 */
    /* JADX WARN: Type inference failed for: r7v209 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r7v213 */
    /* JADX WARN: Type inference failed for: r7v215 */
    /* JADX WARN: Type inference failed for: r7v221 */
    /* JADX WARN: Type inference failed for: r7v229, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v234 */
    /* JADX WARN: Type inference failed for: r7v235 */
    /* JADX WARN: Type inference failed for: r7v241, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v250, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v261, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v274 */
    /* JADX WARN: Type inference failed for: r7v281 */
    /* JADX WARN: Type inference failed for: r7v326 */
    /* JADX WARN: Type inference failed for: r7v328 */
    /* JADX WARN: Type inference failed for: r9v153, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v220 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v99 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        /*
            Method dump skipped, instructions count: 6324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.<clinit>():void");
    }

    private AFc1fSDK() {
    }

    public static int AFInAppEventType(int i10) {
        int i11 = $11;
        int i12 = i11 + 69;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = AFLogger$LogLevel;
        int i13 = i11 + 67;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c(r7[113], r7[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r7[36], (byte) (-$$a[342]), (short) 405), Integer.TYPE).invoke(obj, Integer.valueOf(i10))).intValue();
            int i15 = $10 + 87;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            return intValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        int i10;
        int i11 = $11;
        int i12 = (i11 ^ 43) + ((i11 & 43) << 1);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            byte[] bArr = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr, 0, 968);
            $$a = bArr;
            i10 = 12074;
        } else {
            byte[] bArr2 = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr2, 0, 968);
            $$a = bArr2;
            i10 = 143;
        }
        $$b = i10;
    }

    public static int valueOf(Object obj) {
        int i10 = $11;
        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
        $10 = i11 % 128;
        int i12 = i11 % 2;
        Object obj2 = AFLogger$LogLevel;
        int i13 = (i10 & 87) + (i10 | 87);
        $10 = i13 % 128;
        int i14 = i13 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c(r0[113], r0[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r0[5], (byte) (-$$a[342]), (short) 576), Object.class).invoke(obj2, obj)).intValue();
            int i15 = $11;
            int i16 = (i15 & 87) + (i15 | 87);
            $10 = i16 % 128;
            int i17 = i16 % 2;
            return intValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object valueOf(int i10, int i11, char c10) {
        int i12 = $11;
        int i13 = i12 + 81;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        Object obj = AFLogger$LogLevel;
        int i15 = i12 + 115;
        int i16 = i15 % 128;
        $10 = i16;
        int i17 = i15 % 2;
        int i18 = (i16 & 77) + (i16 | 77);
        $11 = i18 % 128;
        int i19 = i18 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[113], bArr[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails);
            String $$c = $$c(bArr[5], (byte) (-bArr[342]), (short) 576);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i20 = $11 + 107;
            $10 = i20 % 128;
            if (i20 % 2 == 0) {
                return invoke;
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
}
