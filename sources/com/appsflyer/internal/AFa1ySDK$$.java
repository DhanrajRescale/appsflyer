package com.appsflyer.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\Admin\appsflyer\classes16.dex */
class AFa1ySDK$$ extends ClassLoader {
    private static final int AFKeystoreWrapper = -2128831035;
    private static int afInfoLog = 1;
    private static final int valueOf = 16777619;

    /* renamed from: w, reason: collision with root package name */
    private static int f8396w;
    private Object AFInAppEventParameterName;
    private int[] AFInAppEventType;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8398e;
    private Map<Object, Integer> values;

    /* renamed from: v, reason: collision with root package name */
    public static final short[] f8395v = {123, -122, -83, -85, 731, 748, 697, 750, 750, 720, 742, 739, 724, 754, 712, 682, 795, 722, 746, 726, 676, 770, 771, 727, 734, 718, 741, 712, 734, 732, 719, 708, 744, 736, 738, 723, 709, 768, 719, 736, 734, 732, 700, 774, 722, 751, 733, 730, 744, 743, 720, 735, 672, 802, 739, 727, 734, 718, 741, 670, 755, 766, 752, 683, 768, 736, 726, 731, 748, 684, 774, 722, 751, 733, 694, 768, 719, 736, 734, 746, 730, 744, 743, 720, 735, 672, 802, 739, 727, 734, 718, 741, 670, 753, 764, 751, 719, 700, 766, 752, 680, 774, 722, 751, 733, 694, 768, 719, 736, 734, 746, 736, 738, 723, 700, 774, 722, 751, 733, 712, 735, 715, 741, 720, 747, 729, 730, 743, 716, 699, 774, 722, 751, 733, 750, 733, 716, 757, 711, 745, 734, 742, 720, 746, 734, 706, 754, 737, 725, 736, 719, 736, 700, 774, 722, 751, 733, 724, 754, 712, 682, 795, 722, 746, 726, 676, 754, 774, 722, 751, 733, 694, 768, 719, 736, 734, 746, 736, 738, 723, 709, 762, 726, 749, 716, 750, 740, 15292, -13826, 15292, -27722, 25136, -10449, -29911, 2668, 27492, -15848, 1557, -91, 1557, -31864, 733, 733, 733, 2258, -9381, -22792, -16451, 7735, 8050, 25675, -2375, 25442, -31638, 31864, -12569, 21401, -13750, 15216, -13750, -2474, 733, 733, 733, 733, 733};

    /* renamed from: i, reason: collision with root package name */
    public static final int f8394i = 179;

    /* renamed from: d, reason: collision with root package name */
    private char[] f8397d = {'c', 50325, 35225, 20160, 5001, 55442, 40364, 25253, 10166, 60582, 45501, 30427, 15306, 156, 50629, 35528, 20436, 5375, 55782, 40672, 25577, 10478, 60754, 45623, 30518, 15371, 341, 50724, 35595, 20502, 5383, 55906, 40817, 25603, 10503, 60952, 45848, 'c', 50325, 35225, 20160, 5001, 55442, 40364, 25253, 10166, 60582, 45501, 30427, 15306, 156, 50629, 35528, 20436, 5375, 55782, 40672, 25577, 10478, 60754, 45623, 30518, 15371, 341, 50728, 35595, 20502, 5383, 55906, 40825, 25608, 10496, 60951, 28522, 43932, 59024, 8649, 31872, 47003, 62117, 3500, 18623, 33711, 57012, 6610, 21699, 28565, 43724, 58817, 8413, 31734, 46831, 61929, 3296, 18407, 33371, 56638, 6207, 21250, 28252, 43322, 58370, 16159, 31246, 46443, 61560, 2827, 17930, 33047, 64002, 16116, 29688, 46241, 59880, 8947, 26573, 39108, 56791, 5831, 19420, 36026, 49579, 64253, 16292, 28841, 46517, 61086, 9095, 25729, 39304, 53903, 5939, 18518, 36183, 50794, 64308, 15442, 29034, 43639, 61286, 8195, 25872, 40547, 54114, 5247, 18797, 33282, 51003, 63510, 15680, 30237, 43830, 61403, 8402, 26039, 40639, 54192, 5302, 18831, 'c', 50325, 35225, 20160, 5001, 55442, 40364, 25253, 10166, 60582, 45501, 30427, 15306, 156, 50629, 35528, 20436, 5375, 55782, 40672, 25577, 10478, 60754, 45623, 30518, 15371, 341, 50732, 35595, 20502, 5383, 55906, 40824, 25612, 10500, 60957, 53878, 5760, 23436, 40149, 49564, 2695, 20409, 45232, 62883, 16051, 25512, 42190, 59871, 53897, 6096, 22749, 40385, 50922, 3059, 19701, 45564, 64251, 16199, 24610, 42275, 60958, 54080, 5159, 22814, 33283, 50962, 2167, 19812, 46616, 64275, 15374, 24845, 28413, 43531, 59143, 8286, 32023, 46604, 62258, 3131, 18728, 33336, 57123, 6213, 21844, 28162, 43867, 58454, 8522, 31329, 46968, 61566, 3447, 18032, 33740, 56489, 6568, 21141, 28619, 43175, 58773, 16008, 31641, 46332, 61935, 2716, 18330, 32900, 56706, 57274, 6988, 22080, 37145, 52304, 1867, 17013, 48508, 63599, 13183, 28260, 43266, 58387, 57157, 6684, 21777, 36877, 52006, 1599, 16697, 48176, 63287, 12939, 28142, 43247, 58322, 56972, 6637, 21714, 36815, 51934, 1467, 16555, 48091, 63197, 12743, 27843, 59476, 11426, 25006, 42743, 64446, 12453, 30107, 35474, 53121, 1169, 22922, 40684, 54269, 59563, 11762, 25343, 42979, 64712, 12753, 30423, 35806, 49369, 1381, 23040, 40705, 54332, 59746, 11778, 25404, 47137, 64816, 12885, 30534, 35903, 49458, 1582, 23339, 5674, 53980, 40912, 22665, 1472, 52955, 35813, 29932, 12799, 64239, 42996, 24722, 11651, 5845, 54156, 40065, 22941, 694, 53167, 34985, 30112, 16039, 64283, 42110, 24959, 10818, 5916, 53375, 40258, 18015, 846, 52267, 35128, 29250, 16207, 63568, 42327};
    private long unregisterClient = 6008239149324485882L;
    private long registerClient = 1553153035201526830L;
    private byte AFLogger = -68;

    private static String $$c(int i10, short s7, int i11) {
        int i12;
        int i13;
        char[] cArr;
        int i14;
        short[] sArr;
        char[] cArr2;
        int i15;
        int i16;
        int i17 = (f8396w + 52) - 1;
        afInfoLog = i17 % 128;
        if ((i17 % 2 == 0 ? 'D' : 'b') != 'b') {
            i12 = ((i10 | 50979) << 1) - (i10 ^ 50979);
            i13 = s7 + 86;
            int i18 = i11 + 13;
            sArr = f8395v;
            cArr = new char[i18];
            int i19 = (i18 & 46) + (i18 | 46);
            i14 = ((i19 | (-10)) << 1) - (i19 ^ (-10));
            if ((sArr != null ? 1 : 0) != 0) {
                cArr2 = cArr;
                r4 = 1;
                i15 = i12;
                i16 = i14;
            } else {
                r4 = 1;
                int i20 = (f8396w + 60) - 1;
                afInfoLog = i20 % 128;
                int i21 = i20 % 2;
                cArr2 = cArr;
                int i22 = i12;
                i16 = i14;
                int i23 = i13;
                int i24 = -(-i13);
                i15 = (((i22 | i24) << 1) - (i24 ^ i22)) - 733;
                i13 = i23;
            }
        } else {
            int i25 = -i10;
            i12 = (i25 ^ 50979) + ((i25 & 50979) << 1);
            i13 = (s7 | 4) + (s7 & 4);
            int i26 = (i11 & 1) + (i11 | 1);
            short[] sArr2 = f8395v;
            cArr = new char[i26];
            int i27 = i26 - 1;
            if (!(sArr2 == null)) {
                cArr2 = cArr;
                i15 = i12;
                i16 = i27;
                sArr = sArr2;
            } else {
                i14 = i27;
                sArr = sArr2;
                int i202 = (f8396w + 60) - 1;
                afInfoLog = i202 % 128;
                int i212 = i202 % 2;
                cArr2 = cArr;
                int i222 = i12;
                i16 = i14;
                int i232 = i13;
                int i242 = -(-i13);
                i15 = (((i222 | i242) << 1) - (i242 ^ i222)) - 733;
                i13 = i232;
            }
        }
        while (true) {
            int i28 = (i13 ^ (-16)) + ((i13 & (-16)) << 1);
            int i29 = ((i28 & 17) << 1) + (i28 ^ 17);
            cArr2[r4] = (char) i15;
            int i30 = r4 + 1;
            if (r4 == i16) {
                String str = new String(cArr2);
                int i31 = afInfoLog;
                int i32 = (i31 ^ 95) + ((i31 & 95) << 1);
                f8396w = i32 % 128;
                int i33 = i32 % 2;
                return str;
            }
            short s10 = sArr[i29];
            int i34 = f8396w;
            int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
            afInfoLog = i35 % 128;
            int i36 = i35 % 2;
            r4 = i30;
            int i37 = -(-s10);
            i15 = (((i15 | i37) << 1) - (i37 ^ i15)) - 733;
            i13 = i29;
        }
    }

    static {
        int i10 = 0 + 41;
        afInfoLog = i10 % 128;
        int i11 = i10 % 2;
    }

    AFa1ySDK$$(Object obj, boolean z10) {
        try {
            super((ClassLoader) Class.class.getMethod($$c(50876, (short) 62, (byte) 13), null).invoke(AFa1ySDK$$.class, null));
            this.values = new HashMap();
            this.AFInAppEventParameterName = obj;
            String $$c = $$c(0, (short) 182, (byte) 39);
            int[] iArr = new int[$$c.length() / 2];
            this.AFInAppEventType = iArr;
            if (iArr.length > 0) {
                short s7 = (short) 7;
                try {
                    int longValue = (int) ((Long) Class.forName($$c(50873, s7, (byte) (s7 | 8))).getMethod($$c(50869, (short) 137, (byte) 7), null).invoke(null, null)).longValue();
                    int hashCode = obj.hashCode();
                    int i10 = (hashCode | longValue) & ((longValue & hashCode) ^ (-1));
                    int charAt = $$c.charAt(0) << 16;
                    char charAt2 = $$c.charAt(1);
                    int i11 = (charAt & charAt2) | (charAt ^ charAt2);
                    iArr[0] = ((i10 ^ (-1)) & i11) | ((i11 ^ (-1)) & i10);
                    int i12 = 1;
                    while (true) {
                        int[] iArr2 = this.AFInAppEventType;
                        if (i12 >= iArr2.length) {
                            break;
                        }
                        int i13 = i12 * 2;
                        iArr2[i12] = iArr2[(i12 ^ (-1)) + ((i12 & (-1)) << 1)] ^ ($$c.charAt(i13 + 1) | ($$c.charAt(i13) << 16));
                        i12 = ((i12 | 1) << 1) - (i12 ^ 1);
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            this.f8398e = z10;
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        r0 = (short) 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bf, code lost:
    
        throw new java.lang.IllegalArgumentException($$c(50910, r0, (byte) (r0 & 11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = java.lang.Class.forName($$c(50873, (short) 152, (byte) 20));
        r2 = com.appsflyer.internal.AFa1ySDK$$.f8394i;
        r2 = (r2 & 50692) | (r2 ^ 50692);
        r7 = false;
        r1 = r1.getDeclaredMethod($$c(r2, (short) (r2 & 472), (byte) 8), java.lang.String.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        r1 = r1.invoke(r9, r10, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = com.appsflyer.internal.AFa1ySDK$$.afInfoLog;
        r2 = (r10 ^ 3) + ((r10 & 3) << 1);
        com.appsflyer.internal.AFa1ySDK$$.f8396w = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r7 == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r10 = (r4 == true ? 1 : 0).length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        throw new java.lang.IllegalArgumentException($$c(50910, (short) 114, (byte) 4) + r10 + $$c(50938, (short) 42, (byte) 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r10 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r10 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized java.lang.Object AFKeystoreWrapper(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK$$.AFKeystoreWrapper(java.lang.String):java.lang.Object");
    }

    public int AFInAppEventType(Object obj) {
        Class<?> cls;
        try {
            Class cls2 = (Class) obj;
            String name = cls2.getName();
            Integer num = this.values.get(Integer.valueOf(name.hashCode()));
            if ((num == null ? '0' : ';') == '0') {
                num = this.values.get(name);
                int i10 = f8396w;
                int i11 = ((i10 | 15) << 1) - (i10 ^ 15);
                afInfoLog = i11 % 128;
                int i12 = i11 % 2;
            }
            Object[] objArr = null;
            byte b10 = 0;
            if ((num == null ? '\b' : 'T') != 'T') {
                int i13 = afInfoLog;
                int i14 = (i13 & 11) + (i13 | 11);
                f8396w = i14 % 128;
                int i15 = i14 % 2;
                this.values.clear();
                this.AFInAppEventParameterName = null;
            }
            if (this.f8398e) {
                int i16 = afInfoLog;
                int i17 = (i16 & 21) + (i16 | 21);
                f8396w = i17 % 128;
                int i18 = i17 % 2;
                int AFInAppEventParameterName = AFInAppEventParameterName(cls2);
                int intValue = num.intValue();
                if (!((((AFInAppEventParameterName & (intValue ^ (-1))) | ((AFInAppEventParameterName ^ (-1)) & intValue)) & 268435456) != 0)) {
                    int i19 = f8396w;
                    int i20 = (i19 & 55) + (i19 | 55);
                    afInfoLog = i20 % 128;
                    if (!(i20 % 2 != 0)) {
                        (b10 == true ? 1 : 0).hashCode();
                    }
                    int i21 = (f8396w + 32) - 1;
                    afInfoLog = i21 % 128;
                    int i22 = i21 % 2;
                    try {
                        if (Class.class.getMethod($$c(50876, (short) 62, (byte) 13), null).invoke(cls2, null) == this.AFInAppEventParameterName) {
                            int i23 = f8396w;
                            int i24 = ((i23 | 35) << 1) - (i23 ^ 35);
                            afInfoLog = i24 % 128;
                            int i25 = i24 % 2;
                            valueOf(obj);
                            int i26 = (afInfoLog + 70) - 1;
                            f8396w = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
            }
            int intValue2 = num.intValue();
            int AFInAppEventParameterName2 = AFInAppEventParameterName(cls2);
            int i28 = this.AFInAppEventType[(((intValue2 ^ (-1)) & AFInAppEventParameterName2) | ((AFInAppEventParameterName2 ^ (-1)) & intValue2)) & 268435455];
            if (!(this.f8398e)) {
                int i29 = f8396w + 35;
                afInfoLog = i29 % 128;
                int i30 = i29 % 2;
                int i31 = afInfoLog;
                int i32 = ((i31 | 5) << 1) - (i31 ^ 5);
                f8396w = i32 % 128;
                try {
                    cls = (i32 % 2 != 0 ? '^' : (char) 16) != 16 ? Class.class.getMethod($$c(50876, (short) 57, (byte) 51), null).invoke(cls2, null).getClass() : Class.class.getMethod($$c(50876, (short) 62, (byte) 13), null).invoke(cls2, null).getClass();
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } else {
                int i33 = afInfoLog;
                int i34 = ((i33 | 115) << 1) - (i33 ^ 115);
                f8396w = i34 % 128;
                int i35 = i34 % 2;
                cls = getClass();
                int i36 = (f8396w + 92) - 1;
                afInfoLog = i36 % 128;
                int i37 = i36 % 2;
            }
            int AFInAppEventParameterName3 = AFInAppEventParameterName(cls);
            int i38 = (i28 | AFInAppEventParameterName3) & ((i28 & AFInAppEventParameterName3) ^ (-1));
            int hashCode = cls2.hashCode();
            int i39 = (i38 | hashCode) & ((i38 & hashCode) ^ (-1));
            int i40 = f8396w + 19;
            afInfoLog = i40 % 128;
            if (i40 % 2 != 0) {
                return i39;
            }
            int length = objArr.length;
            return i39;
        } catch (Exception e10) {
            e10.printStackTrace();
            throw new RuntimeException(e10);
        }
    }

    public int values(int i10) {
        int i11 = afInfoLog;
        int i12 = (i11 & 25) + (i11 | 25);
        f8396w = i12 % 128;
        if ((i12 % 2 != 0 ? 'W' : '\n') != 'W') {
            int[] iArr = this.AFInAppEventType;
            return iArr[i10 % iArr.length];
        }
        int[] iArr2 = this.AFInAppEventType;
        int i13 = -(-iArr2.length);
        return iArr2[((i10 | i13) << 1) - (i10 ^ i13)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if ((r6 != null ? 23 : 'Y') != 23) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011f, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0122, code lost:
    
        if (r13 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
    
        r13 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0129, code lost:
    
        if (r13 == 'C') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012b, code lost:
    
        r12 = java.lang.Class.forName($$c(50873, r1, r3)).getDeclaredMethod($$c(50865, (short) 118, (byte) 11), java.lang.Class.class);
        r12.setAccessible(true);
        r12.invoke(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0154, code lost:
    
        r12 = com.appsflyer.internal.AFa1ySDK$$.afInfoLog;
        r13 = ((r12 | 123) << 1) - (r12 ^ 123);
        com.appsflyer.internal.AFa1ySDK$$.f8396w = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        r13 = 'C';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r1 = java.lang.Class.forName($$c(50873, r1, r3));
        r3 = com.appsflyer.internal.AFa1ySDK$$.f8394i;
        r3 = (r3 & 50692) | (r3 ^ 50692);
        r1 = r1.getDeclaredMethod($$c(r3, (short) (r3 & 472), (byte) 8), java.lang.String.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        r3 = com.appsflyer.internal.AFa1ySDK$$.f8396w;
        r4 = ((r3 | 29) << 1) - (r3 ^ 29);
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r4 % 128;
        r4 = r4 % 2;
        r3 = com.appsflyer.internal.AFa1ySDK$$.f8396w + 89;
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r5 = (short) (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        r5 = (java.lang.Class) r1.invoke(com.appsflyer.internal.AFa1ySDK$$.class.getMethod($$c(50876, r5, (byte) (r5 & 8)), null).invoke(r11, null), r12, java.lang.Boolean.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        r12 = com.appsflyer.internal.AFa1ySDK$$.f8396w;
        r13 = (r12 ^ 77) + ((r12 & 77) << 1);
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0116, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        r13 = r12.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if ((r6 == null) != false) goto L42;
     */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Class<?> loadClass(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK$$.loadClass(java.lang.String, boolean):java.lang.Class");
    }

    @Override // java.lang.ClassLoader
    protected Class findClass(String str) throws ClassNotFoundException {
        Object obj;
        int i10 = f8396w + 91;
        afInfoLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (!(this.f8398e)) {
                int i12 = f8394i;
                int i13 = (i12 & 50700) | (i12 ^ 50700);
                byte b10 = (byte) 20;
                Class<?> cls = Class.forName($$c(i13, (short) (i13 & 106), b10));
                int i14 = f8394i;
                int i15 = (i14 & 50692) | (i14 ^ 50692);
                Method declaredMethod = cls.getDeclaredMethod($$c(i15, (short) (i15 & 472), (byte) 8), String.class, Class.forName($$c(50873, (short) 152, b10)));
                declaredMethod.setAccessible(true);
                obj = declaredMethod.invoke(this.AFInAppEventParameterName, str, this);
                int i16 = (afInfoLog + 52) - 1;
                f8396w = i16 % 128;
                int i17 = i16 % 2;
            } else {
                int i18 = f8396w;
                int i19 = ((i18 | 63) << 1) - (i18 ^ 63);
                afInfoLog = i19 % 128;
                int i20 = i19 % 2;
                int i21 = f8394i;
                short s7 = (short) 106;
                Method declaredMethod2 = Class.forName($$c((i21 & 50700) | (i21 ^ 50700), (short) 75, (byte) 31)).getDeclaredMethod($$c(50877, s7, (byte) (s7 & 28)), String.class);
                declaredMethod2.setAccessible(true);
                try {
                    obj = declaredMethod2.invoke(this.AFInAppEventParameterName, str);
                } catch (InvocationTargetException e10) {
                    try {
                        throw ((Exception) e10.getCause());
                    } catch (ClassNotFoundException unused) {
                        obj = null;
                    }
                }
            }
            if ((obj == null ? 'U' : 'c') != 'c') {
                int i22 = afInfoLog;
                int i23 = (i22 & 47) + (i22 | 47);
                f8396w = i23 % 128;
                if (!(i23 % 2 != 0)) {
                    return null;
                }
                int i24 = 88 / 0;
                return null;
            }
            valueOf(obj);
            Class cls2 = (Class) obj;
            int i25 = f8396w;
            int i26 = ((i25 | 51) << 1) - (i25 ^ 51);
            afInfoLog = i26 % 128;
            int i27 = i26 % 2;
            return cls2;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r4 = com.appsflyer.internal.AFa1ySDK$$.f8396w + 85;
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r4 % 128;
        r4 = r4 % 2;
        r4 = (com.appsflyer.internal.AFa1ySDK$$.f8396w + 78) - 1;
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
    
        r1 = java.lang.Class.class.getMethod($$c(50876, (short) 62, (byte) 13), null).invoke(com.appsflyer.internal.AFa1ySDK$$.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r4 = (com.appsflyer.internal.AFa1ySDK$$.afInfoLog + 100) - 1;
        com.appsflyer.internal.AFa1ySDK$$.f8396w = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        r0 = r9.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        if ((r8.f8398e ? 'P' : '\f') != 'P') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r1) != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r1 = com.appsflyer.internal.AFa1ySDK$$.f8396w;
        r4 = (r1 & 107) + (r1 | 107);
        com.appsflyer.internal.AFa1ySDK$$.afInfoLog = r4 % 128;
        r4 = r4 % 2;
        r1 = r8.AFInAppEventParameterName;
     */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.String findLibrary(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK$$.findLibrary(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if ((r1 != null) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:10:0x0018, B:17:0x005e, B:21:0x0073, B:22:0x0081, B:27:0x00a0, B:32:0x00b6, B:33:0x00d8, B:36:0x00f6, B:43:0x003a, B:44:0x003b, B:51:0x0103, B:52:0x010b, B:13:0x0030), top: B:2:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void valueOf(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK$$.valueOf(java.lang.Object):void");
    }

    private Method values(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        int i10 = f8396w;
        int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
        afInfoLog = i11 % 128;
        try {
            if ((i11 % 2 == 0 ? (char) 14 : (char) 0) != 0) {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                Object obj = null;
                obj.hashCode();
                return declaredMethod;
            }
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                throw e10;
            }
            Method values = values(superclass, str, clsArr);
            int i12 = f8396w;
            int i13 = (i12 & 65) + (i12 | 65);
            afInfoLog = i13 % 128;
            if ((i13 % 2 == 0 ? 'G' : 'D') == 'D') {
                return values;
            }
            int i14 = 45 / 0;
            return values;
        }
    }

    private int AFInAppEventParameterName(Object obj) {
        int i10 = f8396w;
        int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
        afInfoLog = i11 % 128;
        int i12 = i11 % 2;
        try {
            byte[] bytes = ((Class) obj).getName().getBytes($$c(50894, (short) 24, (byte) 4));
            int i13 = AFKeystoreWrapper;
            int length = bytes.length;
            int i14 = 0;
            while (true) {
                if (!(i14 < length)) {
                    return i13;
                }
                int i15 = f8396w;
                int i16 = (i15 ^ 71) + ((i15 & 71) << 1);
                afInfoLog = i16 % 128;
                int i17 = i16 % 2;
                byte b10 = bytes[i14];
                i13 = ((i13 | b10) & ((i13 & b10) ^ (-1))) * valueOf;
                i14 = ((i14 | 1) << 1) - (i14 ^ 1);
                int i18 = (afInfoLog + 84) - 1;
                f8396w = i18 % 128;
                int i19 = i18 % 2;
            }
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public InputStream valueOf(InputStream inputStream, int i10, byte[] bArr, int i11) throws IOException {
        int length;
        byte[] bArr2;
        int i12;
        int i13 = afInfoLog + 37;
        f8396w = i13 % 128;
        if ((i13 % 2 != 0 ? '`' : (char) 6) != 6) {
            length = bArr.length;
            bArr2 = new byte[length];
            i12 = 1;
        } else {
            length = bArr.length;
            bArr2 = new byte[length];
            i12 = 0;
        }
        try {
            Object[] objArr = {bArr, 0, bArr2, Integer.valueOf(i12), Integer.valueOf(length)};
            short s7 = (short) 7;
            Class.forName($$c(50873, s7, (byte) ((s7 ^ 8) | (s7 & 8)))).getMethod($$c(50882, (short) (f8394i & 965), (byte) 8), Object.class, Integer.TYPE, Object.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr);
            AFj1gSDK.AFInAppEventParameterName(bArr2, this.AFLogger, this.registerClient);
            AFj1pSDK aFj1pSDK = new AFj1pSDK(inputStream, i10, bArr2, AFj1hSDK.AFInAppEventType(i11));
            int i14 = f8396w;
            int i15 = (i14 & 13) + (i14 | 13);
            afInfoLog = i15 % 128;
            int i16 = i15 % 2;
            return aFj1pSDK;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public Object AFInAppEventParameterName(char c10, int i10, int i11) {
        int i12;
        AFj1kSDK aFj1kSDK = new AFj1kSDK();
        long[] jArr = new long[i10];
        aFj1kSDK.AFInAppEventType = 0;
        int i13 = afInfoLog;
        int i14 = (i13 & 19) + (i13 | 19);
        f8396w = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            if ((aFj1kSDK.AFInAppEventType < i10 ? '_' : 'Y') == 'Y') {
                break;
            }
            int i16 = f8396w;
            int i17 = (i16 & 123) + (i16 | 123);
            afInfoLog = i17 % 128;
            int i18 = i17 % 2;
            int i19 = aFj1kSDK.AFInAppEventType;
            char[] cArr = this.f8397d;
            int i20 = -(-aFj1kSDK.AFInAppEventType);
            jArr[i19] = (cArr[(i11 ^ i20) + ((i20 & i11) << 1)] ^ (aFj1kSDK.AFInAppEventType * this.unregisterClient)) ^ c10;
            aFj1kSDK.AFInAppEventType++;
        }
        char[] cArr2 = new char[i10];
        aFj1kSDK.AFInAppEventType = 0;
        int i21 = f8396w;
        int i22 = (i21 & 15) + (i21 | 15);
        afInfoLog = i22 % 128;
        int i23 = i22 % 2;
        while (true) {
            if (!(aFj1kSDK.AFInAppEventType < i10)) {
                break;
            }
            int i24 = f8396w;
            int i25 = (i24 ^ 123) + ((i24 & 123) << 1);
            afInfoLog = i25 % 128;
            if (!(i25 % 2 == 0)) {
                cArr2[aFj1kSDK.AFInAppEventType] = (char) jArr[aFj1kSDK.AFInAppEventType];
                i12 = aFj1kSDK.AFInAppEventType + 1;
            } else {
                cArr2[aFj1kSDK.AFInAppEventType] = (char) jArr[aFj1kSDK.AFInAppEventType];
                i12 = aFj1kSDK.AFInAppEventType % 0;
            }
            aFj1kSDK.AFInAppEventType = i12;
        }
        Object AFKeystoreWrapper2 = AFKeystoreWrapper(new String(cArr2));
        int i26 = f8396w;
        int i27 = (i26 & 61) + (i26 | 61);
        afInfoLog = i27 % 128;
        if (!(i27 % 2 == 0)) {
            return AFKeystoreWrapper2;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return AFKeystoreWrapper2;
    }
}
