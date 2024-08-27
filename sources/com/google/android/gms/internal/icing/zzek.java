package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
final class zzek {
    private static final zzej zza;
    private static final zzej zzb;

    static {
        zzej zzejVar;
        try {
            zzejVar = (zzej) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzejVar = null;
        }
        zza = zzejVar;
        zzb = new zzej();
    }

    public static zzej zza() {
        return zza;
    }

    public static zzej zzb() {
        return zzb;
    }
}
