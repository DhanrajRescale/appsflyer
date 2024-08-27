package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public enum zzso implements zzagm {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final zzagn zzg = new zzagn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsn
    };
    private final int zzi;

    zzso(int i10) {
        this.zzi = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
