package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzgh implements zzhw {
    private static final zzgh zza = new zzgh();

    private zzgh() {
    }

    public static zzgh zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzhw
    public final zzhv zzb(Class cls) {
        if (zzgo.class.isAssignableFrom(cls)) {
            try {
                return (zzhv) zzgo.zzr(cls.asSubclass(zzgo.class)).zzh(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzhw
    public final boolean zzc(Class cls) {
        return zzgo.class.isAssignableFrom(cls);
    }
}
