package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaga {
    private static final zzafy zza = new zzafz();
    private static final zzafy zzb;

    static {
        zzafy zzafyVar;
        try {
            zzafyVar = (zzafy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzafyVar = null;
        }
        zzb = zzafyVar;
    }

    public static zzafy zza() {
        zzafy zzafyVar = zzb;
        if (zzafyVar != null) {
            return zzafyVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzafy zzb() {
        return zza;
    }
}
