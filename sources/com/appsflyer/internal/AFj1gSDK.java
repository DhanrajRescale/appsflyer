package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFj1gSDK {
    public static void AFInAppEventParameterName(byte[] bArr, byte b10, long j10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (((1 << i10) & j10) != 0) {
                bArr[i10] = (byte) (bArr[i10] ^ b10);
            }
        }
    }
}
