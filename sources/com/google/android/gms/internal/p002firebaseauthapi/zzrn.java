package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrn {
    private static final zzagn zza = new zzrm();

    public static int zza(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzb(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 7;
        }
        return 6;
    }
}
