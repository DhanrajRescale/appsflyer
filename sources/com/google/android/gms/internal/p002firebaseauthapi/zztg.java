package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zztg extends zzagk implements zzahq {
    private static final zztg zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zztg zztgVar = new zztg();
        zzb = zztgVar;
        zzagk.zzH(zztg.class, zztgVar);
    }

    private zztg() {
    }

    public static zztf zzb() {
        return (zztf) zzb.zzt();
    }

    public static /* synthetic */ void zzd(zztg zztgVar, String str) {
        str.getClass();
        zztgVar.zzd = str;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zztf(null);
                }
                return new zztg();
            }
            return zzagk.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
