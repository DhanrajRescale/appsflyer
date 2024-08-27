package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zznf {
    public static final zznf zza = new zznf("SHA1");
    public static final zznf zzb = new zznf("SHA224");
    public static final zznf zzc = new zznf("SHA256");
    public static final zznf zzd = new zznf("SHA384");
    public static final zznf zze = new zznf("SHA512");
    private final String zzf;

    private zznf(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
