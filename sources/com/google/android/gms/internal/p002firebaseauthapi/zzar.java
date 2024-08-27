package com.google.android.gms.internal.p002firebaseauthapi;

import jr.h;

/* loaded from: classes2.dex */
public final class zzar {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(h.n("at index ", i11));
            }
        }
        return objArr;
    }
}
