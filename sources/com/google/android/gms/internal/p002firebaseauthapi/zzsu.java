package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzsu extends zzagk implements zzahq {
    private static final zzsu zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzaff zze = zzaff.zzb;
    private int zzf;

    static {
        zzsu zzsuVar = new zzsu();
        zzb = zzsuVar;
        zzagk.zzH(zzsu.class, zzsuVar);
    }

    private zzsu() {
    }

    public static zzst zza() {
        return (zzst) zzb.zzt();
    }

    public static /* synthetic */ zzsu zzb() {
        return zzb;
    }

    public static zzsu zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzsu zzsuVar, String str) {
        str.getClass();
        zzsuVar.zzd = str;
    }

    public static /* synthetic */ void zzh(zzsu zzsuVar, zzaff zzaffVar) {
        zzsuVar.zze = zzaffVar;
    }

    public static /* synthetic */ void zzi(zzsu zzsuVar, zztv zztvVar) {
        zzsuVar.zzf = zztvVar.zza();
    }

    public final zztv zzd() {
        zztv zzb2 = zztv.zzb(this.zzf);
        if (zzb2 == null) {
            return zztv.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzaff zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzss zzssVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzst(zzssVar);
                }
                return new zzsu();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
