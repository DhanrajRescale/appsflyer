package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.LogSubCategory;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 1;
    private static int values;

    static {
        values();
        View.combineMeasuredStates(0, 0);
        int i10 = AFKeystoreWrapper + 95;
        values = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NonNull
    private static AFh1dSDK AFInAppEventType(@NonNull AFi1zSDK aFi1zSDK, String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        AFh1bSDK aFh1bSDK;
        boolean z10 = true;
        if (str == null) {
            if (aFi1zSDK.AFInAppEventType != AFh1iSDK.DEFAULT) {
                z10 = false;
            }
            return new AFh1dSDK(z10, AFh1bSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{155612361, -264507320, -480867464, 640943933, 125938683, -1285380429, -1310089634, -24116072, -1426973647, 61852708, -883492046, 633032705, -461693357, -1167246624, -991432257, -903948349, 112336305, 226747336, 1063402250, -701101021, 1164970240, -2019838721, -1456121518, -1109521690, -591345139, 1400474182, -20382683, 1268870639, -616322629, -1950372554, 1580005321, -26712274}, 64 - View.combineMeasuredStates(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1zSDK.AFInAppEventType == AFh1iSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            str3 = intern;
        }
        boolean equals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFi1zSDK.values, LogSubCategory.LifeCycle.ANDROID, "v1", str4).equals(str);
        if (equals) {
            aFh1bSDK = AFh1bSDK.SUCCESS;
        } else {
            aFh1bSDK = AFh1bSDK.FAILURE;
        }
        return new AFh1dSDK(equals, aFh1bSDK);
    }

    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        int i10 = AFKeystoreWrapper + 23;
        values = i10 % 128;
        int i11 = i10 % 2;
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, HttpUrl.FRAGMENT_ENCODE_SET}), str);
        if (AFKeystoreWrapper2.length() < 12) {
            int i12 = values + 123;
            AFKeystoreWrapper = i12 % 128;
            if (i12 % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            throw null;
        }
        return AFKeystoreWrapper2.substring(0, 12);
    }

    private static void a(int[] iArr, int i10, Object[] objArr) {
        int length;
        int[] iArr2;
        int i11;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFInAppEventParameterName;
        if (iArr3 != null) {
            int i12 = $10 + 59;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i14 = 0; i14 < length2; i14++) {
                int i15 = $11 + 81;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                iArr4[i14] = (int) (iArr3[i14] ^ (-7136628868752028300L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFInAppEventParameterName;
        if (iArr6 != null) {
            int i17 = $10 + 89;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i11 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i11 = 0;
            }
            while (i11 < length) {
                iArr2[i11] = (int) (iArr6[i11] ^ (-7136628868752028300L));
                i11++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFj1iSDK.values = 0;
        while (true) {
            int i18 = aFj1iSDK.values;
            if (i18 < iArr.length) {
                int i19 = iArr[i18];
                char c10 = (char) (i19 >> 16);
                cArr[0] = c10;
                char c11 = (char) i19;
                cArr[1] = c11;
                char c12 = (char) (iArr[i18 + 1] >> 16);
                cArr[2] = c12;
                char c13 = (char) iArr[i18 + 1];
                cArr[3] = c13;
                aFj1iSDK.AFInAppEventParameterName = (c10 << 16) + c11;
                aFj1iSDK.AFKeystoreWrapper = (c12 << 16) + c13;
                AFj1iSDK.valueOf(iArr5);
                for (int i20 = 0; i20 < 16; i20++) {
                    int i21 = aFj1iSDK.AFInAppEventParameterName ^ iArr5[i20];
                    aFj1iSDK.AFInAppEventParameterName = i21;
                    int values2 = AFj1iSDK.values(i21) ^ aFj1iSDK.AFKeystoreWrapper;
                    int i22 = aFj1iSDK.AFInAppEventParameterName;
                    aFj1iSDK.AFInAppEventParameterName = values2;
                    aFj1iSDK.AFKeystoreWrapper = i22;
                }
                int i23 = aFj1iSDK.AFInAppEventParameterName;
                int i24 = aFj1iSDK.AFKeystoreWrapper;
                int i25 = i23 ^ iArr5[16];
                aFj1iSDK.AFKeystoreWrapper = i25;
                int i26 = i24 ^ iArr5[17];
                aFj1iSDK.AFInAppEventParameterName = i26;
                cArr[0] = (char) (i26 >>> 16);
                cArr[1] = (char) i26;
                cArr[2] = (char) (i25 >>> 16);
                cArr[3] = (char) i25;
                AFj1iSDK.valueOf(iArr5);
                int i27 = aFj1iSDK.values;
                cArr2[i27 * 2] = cArr[0];
                cArr2[(i27 * 2) + 1] = cArr[1];
                cArr2[(i27 * 2) + 2] = cArr[2];
                cArr2[(i27 * 2) + 3] = cArr[3];
                aFj1iSDK.values = i27 + 2;
            } else {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
        }
    }

    public static void values() {
        AFInAppEventParameterName = new int[]{1213806282, 1275305172, -814371242, -760648375, -213905805, -2014879378, 1244466732, -783583104, 268932788, 1857211705, 829810270, -537596973, -732745973, -1113432519, 703870563, 652249806, -382230026, -703903398};
    }

    @NonNull
    public final AFh1dSDK valueOf(@NonNull AFi1zSDK aFi1zSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i10 = AFKeystoreWrapper;
        int i11 = i10 + 49;
        values = i11 % 128;
        int i12 = i11 % 2;
        if (aFi1zSDK != null && str2 != null) {
            int i13 = i10 + 19;
            values = i13 % 128;
            int i14 = i13 % 2;
            if (str3 != null) {
                return AFInAppEventType(aFi1zSDK, str, str2, str3);
            }
        }
        return new AFh1dSDK(false, AFh1bSDK.INTERNAL_ERROR);
    }
}
