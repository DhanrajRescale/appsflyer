package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzgc {
    private static final zzga zza = new zzgb();
    private static final zzga zzb;

    static {
        zzga zzgaVar;
        try {
            zzgaVar = (zzga) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgaVar = null;
        }
        zzb = zzgaVar;
    }

    public static zzga zza() {
        zzga zzgaVar = zzb;
        if (zzgaVar != null) {
            return zzgaVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzga zzb() {
        return zza;
    }
}
