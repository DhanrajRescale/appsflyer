package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzay {
    public static int zza(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }
}
