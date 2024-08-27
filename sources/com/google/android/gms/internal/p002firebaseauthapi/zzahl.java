package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzahl {
    private static final zzahk zza;
    private static final zzahk zzb;

    static {
        zzahk zzahkVar;
        try {
            zzahkVar = (zzahk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzahkVar = null;
        }
        zza = zzahkVar;
        zzb = new zzahk();
    }

    public static zzahk zza() {
        return zza;
    }

    public static zzahk zzb() {
        return zzb;
    }
}
