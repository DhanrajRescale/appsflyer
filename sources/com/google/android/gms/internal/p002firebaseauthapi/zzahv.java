package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzahv {
    private static final zzahu zza;
    private static final zzahu zzb;

    static {
        zzahu zzahuVar;
        try {
            zzahuVar = (zzahu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzahuVar = null;
        }
        zza = zzahuVar;
        zzb = new zzahu();
    }

    public static zzahu zza() {
        return zza;
    }

    public static zzahu zzb() {
        return zzb;
    }
}
