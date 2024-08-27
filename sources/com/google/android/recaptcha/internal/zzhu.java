package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzhu {
    private static final zzht zza;
    private static final zzht zzb;

    static {
        zzht zzhtVar;
        try {
            zzhtVar = (zzht) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhtVar = null;
        }
        zza = zzhtVar;
        zzb = new zzht();
    }

    public static zzht zza() {
        return zza;
    }

    public static zzht zzb() {
        return zzb;
    }
}
