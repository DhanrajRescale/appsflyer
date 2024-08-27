package com.appsflyer.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\Admin\appsflyer\classes13.dex */
class AFc1eSDK$$ extends ClassLoader {
    private static final int afErrorLog = 16777619;
    private static final int afRDLog = -2128831035;
    private static int getPrice = 1;
    private static int getPurchaseType;
    private final boolean afDebugLog;
    private Object afVerboseLog;
    private int[] afWarnLog;
    private Map<Object, Integer> force;
    public static final short[] afErrorLogForExcManagerOnly = {83, 115, -2, -112, 582, 565, 616, 563, 563, 593, 571, 574, 589, 559, 601, 631, 518, 591, 567, 587, 637, 543, 542, 586, 579, 595, 572, 601, 579, 581, 594, 605, 569, 577, 575, 590, 604, 545, 594, 577, 579, 581, 613, 539, 591, 562, 580, 583, 569, 570, 593, 578, 641, 511, 574, 586, 579, 595, 572, 643, 558, 547, 561, 630, 545, 577, 587, 582, 565, 629, 539, 591, 562, 580, 619, 545, 594, 577, 579, 567, 583, 569, 570, 593, 578, 641, 511, 574, 586, 579, 595, 572, 643, 560, 549, 562, 594, 613, 547, 561, 633, 539, 591, 562, 580, 619, 545, 594, 577, 579, 567, 577, 575, 590, 613, 539, 591, 562, 580, 601, 578, 598, 572, 593, 566, 584, 583, 570, 597, 614, 539, 591, 562, 580, 593, 567, 579, 607, 559, 576, 588, 577, 594, 577, 613, 539, 591, 562, 580, 589, 559, 601, 631, 518, 591, 567, 587, 637, 559, 539, 591, 562, 580, 619, 545, 594, 577, 579, 567, -5203, -13053, -27928, -3070, 8875, -26629, 16958, 14332, -10695, -961, 2875, -31440, 23030, -25949, -5770, 14117, -20066, 30561, 580, -16169, -30280, 31440, -30280, -7356, -14550, 15710, -14550, 577, 575, 590, 604, 551, 587, 564, 597, 563, 573};
    public static final int getCurrency = 228;
    private char[] afLogForce = {'c', 44532, 23387, 2303, 46605, 25719, 4562, 48974, 27838, 6687, 51319, 30156, 9014, 53489, 32275, 11387, 55748, 34606, 13460, 58095, 36989, 15835, 60284, 39084, 18126, 62528, 41359, 20286, 64679, 43723, 22625, 1505, 45905, 24779, 3748, 48129, 27125, 3761, 41766, 21897, 1581, 47327, 27301, 7936, 45468, 25196, 5325, 50853, 31518, 11748, 56867, 28865, 8873, 55062, 35324, 14918, 60477, 40623, 13065, 58798, 38526, 18460, 64146, 44893, 16876, 62069, 42009, 22195, 2867, 48515, 28185, 'v', 45779, 26407, 6545, 52113, 31753, 11915, 49968, 30152, 10120, 55346, 35494, 16172, 53652, 33778, 13386, 59040, 39685, 27892, 49507, 14284, 25704, 55962, 2272, 32069, 54233, ')', 30344, 42208, 6491, 20385, 48230, 4740, 16620, 46419, 60345, 22531, 36472, 64746, 20812, 34795, 62523, 10841, 39127, 52504, 9135, 36912, 50780, 13558, 26998, 57286, 3157, 25138, 53406, 'c', 44532, 23387, 2303, 46605, 25719, 4562, 48974, 27838, 6687, 51319, 30156, 9014, 53489, 32275, 11387, 55748, 34606, 13460, 58095, 36989, 15835, 60284, 39084, 18126, 62535, 41359, 20278, 64679, 43723, 22625, 1505, 45906, 24770, 3759, 48128, 27128};
    private long AFPurchaseDetails = -2294044182445118053L;
    private long getLevel = 8988216609147426122L;
    private int AFLogger$LogLevel = 2;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:17:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, short r10) {
        /*
            int r0 = com.appsflyer.internal.AFc1eSDK$$.getPurchaseType
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1eSDK$$.getPrice = r1
            int r0 = r0 % 2
            r0 = r8 ^ 4
            r8 = r8 & 4
            r1 = 1
            int r8 = r8 << r1
            int r0 = r0 + r8
            short[] r8 = com.appsflyer.internal.AFc1eSDK$$.afErrorLogForExcManagerOnly
            r2 = r10 | 1
            int r2 = r2 << r1
            r10 = r10 ^ r1
            int r2 = r2 - r10
            r10 = 60616(0xecc8, float:8.4941E-41)
            int r10 = r10 - r9
            char[] r9 = new char[r2]
            r3 = 0
            if (r8 != 0) goto L23
            r4 = 0
            goto L24
        L23:
            r4 = 1
        L24:
            if (r4 == r1) goto L55
            int r10 = com.appsflyer.internal.AFc1eSDK$$.getPrice
            r4 = r10 ^ 37
            r10 = r10 & 37
            int r10 = r10 << r1
            int r4 = r4 + r10
            int r10 = r4 % 128
            com.appsflyer.internal.AFc1eSDK$$.getPurchaseType = r10
            int r4 = r4 % 2
            r10 = 58
            if (r4 == 0) goto L3b
            r4 = 58
            goto L3d
        L3b:
            r4 = 64
        L3d:
            if (r4 == r10) goto L40
            goto L44
        L40:
            r10 = 0
            r10.hashCode()     // Catch: java.lang.Throwable -> L53
        L44:
            int r10 = com.appsflyer.internal.AFc1eSDK$$.getPrice
            int r10 = r10 + 60
            int r10 = r10 - r1
            int r4 = r10 % 128
            com.appsflyer.internal.AFc1eSDK$$.getPurchaseType = r4
            int r10 = r10 % 2
            r10 = r0
            r3 = r2
            r5 = 0
            goto L6d
        L53:
            r8 = move-exception
            throw r8
        L55:
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            char r4 = (char) r0
            r5 = r3 & 1
            r6 = r3 | 1
            int r5 = r5 + r6
            r9[r3] = r4
            if (r5 != r2) goto L68
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
            return r8
        L68:
            short r3 = r8[r10]
            r7 = r3
            r3 = r2
            r2 = r7
        L6d:
            int r2 = -r2
            r4 = r0 | r2
            int r4 = r4 << r1
            r0 = r0 ^ r2
            int r4 = r4 - r0
            r0 = r4 ^ 580(0x244, float:8.13E-43)
            r2 = r4 & 580(0x244, float:8.13E-43)
            int r2 = r2 << r1
            int r0 = r0 + r2
            r2 = r10 ^ 1
            r10 = r10 & r1
            int r10 = r10 << r1
            int r10 = r10 + r2
            int r2 = com.appsflyer.internal.AFc1eSDK$$.getPrice
            int r2 = r2 + 89
            int r4 = r2 % 128
            com.appsflyer.internal.AFc1eSDK$$.getPurchaseType = r4
            int r2 = r2 % 2
            r2 = r3
            r3 = r5
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1eSDK$$.$$c(int, int, short):java.lang.String");
    }

    static {
        int i10 = (0 ^ 113) + ((0 & 113) << 1);
        getPrice = i10 % 128;
        int i11 = i10 % 2;
    }

    AFc1eSDK$$(Object obj, boolean z10) {
        try {
            super((ClassLoader) Class.class.getMethod($$c((short) 63, 60513, (byte) 13), null).invoke(AFc1eSDK$$.class, null));
            this.force = new HashMap();
            this.afVerboseLog = obj;
            String $$c = $$c((short) 165, 0, (byte) 27);
            int[] iArr = new int[$$c.length() / 2];
            this.afWarnLog = iArr;
            if (iArr.length > 0) {
                short s7 = (short) 8;
                try {
                    int hashCode = obj.hashCode() ^ ((int) ((Long) Class.forName($$c(s7, 60502 | s7, (byte) 15)).getMethod($$c((short) 130, 60506, (byte) 7), null).invoke(null, null)).longValue());
                    int charAt = ($$c.charAt(0) << 16) | $$c.charAt(1);
                    iArr[0] = (hashCode | charAt) & ((hashCode & charAt) ^ (-1));
                    int i10 = 1;
                    while (true) {
                        int[] iArr2 = this.afWarnLog;
                        if (i10 >= iArr2.length) {
                            break;
                        }
                        int i11 = iArr2[(i10 ^ (-1)) + ((i10 & (-1)) << 1)];
                        int i12 = i10 * 2;
                        int charAt2 = $$c.charAt(i12) << 16;
                        char charAt3 = $$c.charAt((i12 + 2) - 1);
                        int i13 = (charAt3 & charAt2) | (charAt2 ^ charAt3);
                        iArr2[i10] = (i11 | i13) & ((i11 & i13) ^ (-1));
                        int i14 = ((i10 | 45) << 1) - (i10 ^ 45);
                        i10 = ((i14 | (-44)) << 1) - (i14 ^ (-44));
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            this.afDebugLog = z10;
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    synchronized Object values(String str) {
        Object invoke;
        int i10 = getPurchaseType;
        int i11 = (i10 & 75) + (i10 | 75);
        getPrice = i11 % 128;
        int i12 = i11 % 2;
        try {
            if (str == null) {
                throw new IllegalArgumentException($$c((short) 23, 60547, (byte) (-afErrorLogForExcManagerOnly[2])));
            }
            Method declaredMethod = Class.forName($$c((short) 145, 60510, (byte) 20)).getDeclaredMethod($$c((short) 137, 60508, (byte) 8), String.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(this, str, Boolean.FALSE);
            if (invoke == null) {
                throw new IllegalArgumentException($$c(afErrorLogForExcManagerOnly[1], 60547, (byte) (getCurrency & 31)) + str + $$c((short) 43, 60575, (byte) 0));
            }
            int i13 = getPrice + 101;
            getPurchaseType = i13 % 128;
            int i14 = i13 % 2;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
        return invoke;
    }

    public int AFInAppEventParameterName(Object obj) {
        Class<?> cls;
        Integer num;
        try {
            Class cls2 = (Class) obj;
            String name = cls2.getName();
            Integer num2 = this.force.get(Integer.valueOf(name.hashCode()));
            Object[] objArr = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            if (!(num2 != null)) {
                int i10 = getPurchaseType;
                int i11 = ((i10 | 81) << 1) - (i10 ^ 81);
                getPrice = i11 % 128;
                if ((i11 % 2 == 0 ? (char) 19 : (char) 17) != 19) {
                    num = this.force.get(name);
                } else {
                    num = this.force.get(name);
                    (b10 == true ? 1 : 0).hashCode();
                }
                num2 = num;
            }
            if ((num2 == null ? (char) 4 : 'C') == 4) {
                int i12 = getPrice;
                int i13 = ((i12 | 115) << 1) - (i12 ^ 115);
                getPurchaseType = i13 % 128;
                int i14 = i13 % 2;
                this.force.clear();
                this.afVerboseLog = null;
            }
            if (this.afDebugLog) {
                int values = values(cls2);
                int intValue = num2.intValue();
                if (!((((values & (intValue ^ (-1))) | ((values ^ (-1)) & intValue)) & 268435456) != 0)) {
                    int i15 = (getPrice + 34) - 1;
                    getPurchaseType = i15 % 128;
                    if ((i15 % 2 != 0 ? (char) 7 : '@') == 7) {
                        (b12 == true ? 1 : 0).hashCode();
                    }
                    int i16 = getPurchaseType;
                    int i17 = ((i16 | 11) << 1) - (i16 ^ 11);
                    getPrice = i17 % 128;
                    int i18 = i17 % 2;
                    try {
                        if (Class.class.getMethod($$c((short) 63, 60513, (byte) 13), null).invoke(cls2, null) == this.afVerboseLog) {
                            int i19 = getPurchaseType;
                            int i20 = (i19 ^ 85) + ((i19 & 85) << 1);
                            getPrice = i20 % 128;
                            if ((i20 % 2 == 0 ? 'N' : '\t') != 'N') {
                                AFKeystoreWrapper(obj);
                            } else {
                                AFKeystoreWrapper(obj);
                                int length = (b11 == true ? 1 : 0).length;
                            }
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
            int intValue2 = num2.intValue();
            int values2 = values(cls2);
            int i21 = this.afWarnLog[(((intValue2 ^ (-1)) & values2) | ((values2 ^ (-1)) & intValue2)) & 268435455];
            if (!(this.afDebugLog)) {
                int i22 = getPrice;
                int i23 = (i22 ^ 111) + ((i22 & 111) << 1);
                getPurchaseType = i23 % 128;
                int i24 = i23 % 2;
                try {
                    cls = Class.class.getMethod($$c((short) 63, 60513, (byte) 13), null).invoke(cls2, null).getClass();
                    int i25 = getPurchaseType + 15;
                    getPrice = i25 % 128;
                    int i26 = i25 % 2;
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } else {
                int i27 = getPrice;
                int i28 = (i27 & 99) + (i27 | 99);
                getPurchaseType = i28 % 128;
                if (i28 % 2 == 0) {
                    cls = getClass();
                } else {
                    cls = getClass();
                    int length2 = objArr.length;
                }
            }
            int values3 = i21 ^ values(cls);
            int hashCode = cls2.hashCode();
            return (values3 | hashCode) & ((values3 & hashCode) ^ (-1));
        } catch (Exception e10) {
            e10.printStackTrace();
            throw new RuntimeException(e10);
        }
    }

    public int AFKeystoreWrapper(int i10) {
        int i11 = getPurchaseType;
        int i12 = (i11 & 47) + (i11 | 47);
        getPrice = i12 % 128;
        int i13 = i12 % 2;
        int[] iArr = this.afWarnLog;
        int i14 = iArr[i10 % iArr.length];
        int i15 = getPrice + 79;
        getPurchaseType = i15 % 128;
        int i16 = i15 % 2;
        return i14;
    }

    @Override // java.lang.ClassLoader
    protected Class<?> loadClass(String str, boolean z10) {
        Object obj;
        short s7 = (short) 145;
        byte b10 = (byte) 20;
        try {
            Method declaredMethod = Class.forName($$c(s7, 60510, b10)).getDeclaredMethod($$c((short) 29, 60514, (byte) 14), String.class);
            declaredMethod.setAccessible(true);
            if (!(!this.afDebugLog)) {
                int i10 = getPrice;
                int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
                getPurchaseType = i11 % 128;
                if (i11 % 2 != 0) {
                    obj = this.afVerboseLog;
                    int i12 = 30 / 0;
                } else {
                    obj = this.afVerboseLog;
                }
            } else {
                int i13 = (getPurchaseType + 14) - 1;
                getPrice = i13 % 128;
                int i14 = i13 % 2;
                obj = this;
            }
            Class<?> cls = (Class) declaredMethod.invoke(obj, str);
            if (!(cls != null)) {
                int i15 = getPurchaseType;
                int i16 = ((i15 | 25) << 1) - (i15 ^ 25);
                getPrice = i16 % 128;
                int i17 = i16 % 2;
                cls = findClass(str);
                if (cls != null) {
                    int i18 = getPurchaseType;
                    int i19 = ((i18 | 7) << 1) - (i18 ^ 7);
                    getPrice = i19 % 128;
                    int i20 = i19 % 2;
                    if (z10) {
                        int i21 = getPrice;
                        int i22 = (i21 & 115) + (i21 | 115);
                        getPurchaseType = i22 % 128;
                        int i23 = i22 % 2;
                        Method declaredMethod2 = Class.forName($$c(s7, 60510, b10)).getDeclaredMethod($$c((short) 119, 60502, (byte) 11), Class.class);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(this, cls);
                        int i24 = getPrice + 115;
                        getPurchaseType = i24 % 128;
                        int i25 = i24 % 2;
                    }
                } else {
                    Method declaredMethod3 = Class.forName($$c(s7, 60510, b10)).getDeclaredMethod($$c((short) 137, 60508, (byte) 8), String.class, Boolean.TYPE);
                    declaredMethod3.setAccessible(true);
                    int i26 = getPurchaseType;
                    int i27 = (i26 & 99) + (i26 | 99);
                    getPrice = i27 % 128;
                    try {
                        if (i27 % 2 != 0) {
                            short s10 = (short) 0;
                            cls = (Class) declaredMethod3.invoke(AFc1eSDK$$.class.getMethod($$c(s10, 60513 | s10, (byte) 8), null).invoke(this, null), str, Boolean.valueOf(z10));
                        } else {
                            short s11 = (short) 1;
                            cls = (Class) declaredMethod3.invoke(AFc1eSDK$$.class.getMethod($$c(s11, (60513 & (s11 ^ (-1))) | ((-60514) & s11), (byte) 104), null).invoke(this, null), Boolean.valueOf(z10), str);
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
            return cls;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.lang.ClassLoader
    protected Class findClass(String str) throws ClassNotFoundException {
        Object invoke;
        int i10 = getPurchaseType;
        int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
        getPrice = i11 % 128;
        int i12 = i11 % 2;
        try {
            Object[] objArr = null;
            if (this.afDebugLog) {
                int i13 = getPurchaseType;
                int i14 = ((i13 | 119) << 1) - (i13 ^ 119);
                getPrice = i14 % 128;
                int i15 = i14 % 2;
                Method declaredMethod = Class.forName($$c((short) 76, 60516, (byte) 31)).getDeclaredMethod($$c((short) 107, 60514, (byte) 8), String.class);
                declaredMethod.setAccessible(true);
                try {
                    invoke = declaredMethod.invoke(this.afVerboseLog, str);
                    int i16 = getPurchaseType + 9;
                    getPrice = i16 % 128;
                    int i17 = i16 % 2;
                } catch (InvocationTargetException e10) {
                    try {
                        throw ((Exception) e10.getCause());
                    } catch (ClassNotFoundException unused) {
                        invoke = null;
                    }
                }
            } else {
                Method declaredMethod2 = Class.forName($$c((short) 43, 60516, (byte) 20)).getDeclaredMethod($$c((short) 137, 60508, (byte) 8), String.class, Class.forName($$c((short) 145, 60510, (byte) 20)));
                declaredMethod2.setAccessible(true);
                invoke = declaredMethod2.invoke(this.afVerboseLog, str, this);
                int i18 = getPrice;
                int i19 = (i18 ^ 11) + ((i18 & 11) << 1);
                getPurchaseType = i19 % 128;
                int i20 = i19 % 2;
            }
            if ((invoke == null ? '*' : (char) 30) == 30) {
                AFKeystoreWrapper(invoke);
                return (Class) invoke;
            }
            int i21 = (getPrice + 126) - 1;
            getPurchaseType = i21 % 128;
            if (!(i21 % 2 != 0)) {
                return null;
            }
            int length = objArr.length;
            return null;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.lang.ClassLoader
    protected String findLibrary(String str) {
        Object invoke;
        int i10 = getPurchaseType;
        int i11 = (i10 ^ 99) + ((i10 & 99) << 1);
        getPrice = i11 % 128;
        int i12 = i11 % 2;
        if (!(!this.afDebugLog)) {
            int i13 = getPurchaseType;
            int i14 = (i13 & 21) + (i13 | 21);
            getPrice = i14 % 128;
            if (i14 % 2 == 0) {
                invoke = this.afVerboseLog;
                int i15 = 8 / 0;
            } else {
                invoke = this.afVerboseLog;
            }
            int i16 = (getPurchaseType + 14) - 1;
            getPrice = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = getPurchaseType + 31;
            getPrice = i18 % 128;
            int i19 = i18 % 2;
            try {
                invoke = Class.class.getMethod($$c((short) 63, 60513, (byte) 13), null).invoke(AFc1eSDK$$.class, null);
                int i20 = getPurchaseType;
                int i21 = (i20 & 105) + (i20 | 105);
                getPrice = i21 % 128;
                int i22 = i21 % 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        try {
            Method valueOf = valueOf(invoke.getClass(), $$c((short) (getCurrency & 976), 60514, (byte) 10), new Class[]{String.class});
            valueOf.setAccessible(true);
            return (String) valueOf.invoke(invoke, str);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x005f, code lost:
    
        if ((r3 == null ? 'T' : '.') != 'T') goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void AFKeystoreWrapper(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1eSDK$$.AFKeystoreWrapper(java.lang.Object):void");
    }

    private Method valueOf(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        Method declaredMethod;
        int i10 = getPrice;
        int i11 = ((i10 | 21) << 1) - (i10 ^ 21);
        getPurchaseType = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
                Object obj = null;
                obj.hashCode();
            } else {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            }
            return declaredMethod;
        } catch (NoSuchMethodException e10) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return valueOf(superclass, str, clsArr);
            }
            throw e10;
        }
    }

    private int values(Object obj) {
        byte[] bytes;
        int length;
        int i10 = getPurchaseType;
        int i11 = (i10 ^ 77) + ((i10 & 77) << 1);
        getPrice = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        int i12 = afRDLog;
        try {
            if (!z10) {
                bytes = ((Class) obj).getName().getBytes($$c((short) 25, 60531, (byte) (getCurrency & 31)));
                length = bytes.length;
            } else {
                String name = ((Class) obj).getName();
                int i13 = getCurrency;
                bytes = name.getBytes($$c((short) 42, 60531, (byte) ((i13 | 115) & ((i13 & 115) ^ (-1)))));
                length = bytes.length;
            }
            int i14 = 0;
            while (true) {
                if (!(i14 < length)) {
                    break;
                }
                int i15 = getPrice;
                int i16 = (i15 ^ 75) + ((i15 & 75) << 1);
                getPurchaseType = i16 % 128;
                if ((i16 % 2 != 0 ? (char) 6 : '\t') != 6) {
                    byte b10 = bytes[i14];
                    i12 = (((i12 ^ (-1)) & b10) | ((b10 ^ (-1)) & i12)) * afErrorLog;
                    i14 = ((i14 | 1) << 1) - (i14 ^ 1);
                } else {
                    i12 = ((i12 & bytes[i14]) - 16777618) - 1;
                    i14 = (i14 + 107) - 1;
                }
            }
            int i17 = getPurchaseType;
            int i18 = (i17 & 115) + (i17 | 115);
            getPrice = i18 % 128;
            if (!(i18 % 2 == 0)) {
                return i12;
            }
            Object obj2 = null;
            obj2.hashCode();
            return i12;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public InputStream values(InputStream inputStream, int i10, byte[] bArr, int i11) throws IOException {
        long j10 = this.getLevel;
        int i12 = (int) (j10 >>> 32);
        int i13 = i11 ^ (-1);
        int i14 = (int) j10;
        AFj1lSDK aFj1lSDK = new AFj1lSDK(inputStream, new int[]{((i12 ^ (-1)) & i11) | (i12 & i13), (i11 & (i14 ^ (-1))) | (i14 & i13)}, bArr, this.AFLogger$LogLevel, false, i10);
        int i15 = getPurchaseType;
        int i16 = (i15 ^ 21) + ((i15 & 21) << 1);
        getPrice = i16 % 128;
        int i17 = i16 % 2;
        return aFj1lSDK;
    }

    public Object AFInAppEventParameterName(int i10, int i11, char c10) {
        AFj1kSDK aFj1kSDK = new AFj1kSDK();
        long[] jArr = new long[i10];
        aFj1kSDK.AFInAppEventType = 0;
        int i12 = getPurchaseType + 123;
        getPrice = i12 % 128;
        int i13 = i12 % 2;
        while (true) {
            if ((aFj1kSDK.AFInAppEventType < i10 ? '=' : 'W') != '=') {
                break;
            }
            int i14 = getPurchaseType;
            int i15 = ((i14 | 119) << 1) - (i14 ^ 119);
            getPrice = i15 % 128;
            int i16 = i15 % 2;
            jArr[aFj1kSDK.AFInAppEventType] = (this.afLogForce[aFj1kSDK.AFInAppEventType + i11] ^ (aFj1kSDK.AFInAppEventType * this.AFPurchaseDetails)) ^ c10;
            aFj1kSDK.AFInAppEventType++;
        }
        char[] cArr = new char[i10];
        aFj1kSDK.AFInAppEventType = 0;
        int i17 = getPurchaseType;
        int i18 = (i17 ^ 43) + ((i17 & 43) << 1);
        getPrice = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            if (aFj1kSDK.AFInAppEventType >= i10) {
                return values(new String(cArr));
            }
            int i20 = (getPrice + 44) - 1;
            getPurchaseType = i20 % 128;
            int i21 = i20 % 2;
            cArr[aFj1kSDK.AFInAppEventType] = (char) jArr[aFj1kSDK.AFInAppEventType];
            aFj1kSDK.AFInAppEventType++;
            int i22 = getPrice + 11;
            getPurchaseType = i22 % 128;
            int i23 = i22 % 2;
        }
    }
}
