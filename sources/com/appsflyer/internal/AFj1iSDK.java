package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1iSDK {
    public int AFInAppEventParameterName;
    public int AFKeystoreWrapper;
    public int values;

    public static void valueOf(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    public static int values(int i10) {
        int[][] iArr = AFj1nSDK.AFInAppEventType.valueOf;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
