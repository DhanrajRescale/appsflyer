package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
final class zzea {
    private static final zzdz zza;
    private static final zzdz zzb;

    static {
        zzdz zzdzVar;
        try {
            zzdzVar = (zzdz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdzVar = null;
        }
        zza = zzdzVar;
        zzb = new zzdz();
    }

    public static zzdz zza() {
        return zza;
    }

    public static zzdz zzb() {
        return zzb;
    }
}
