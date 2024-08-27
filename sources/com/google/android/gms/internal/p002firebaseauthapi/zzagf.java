package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzagf implements zzahn {
    private static final zzagf zza = new zzagf();

    private zzagf() {
    }

    public static zzagf zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
    public final zzahm zzb(Class cls) {
        if (zzagk.class.isAssignableFrom(cls)) {
            try {
                return (zzahm) zzagk.zzv(cls.asSubclass(zzagk.class)).zzj(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
    public final boolean zzc(Class cls) {
        return zzagk.class.isAssignableFrom(cls);
    }
}
