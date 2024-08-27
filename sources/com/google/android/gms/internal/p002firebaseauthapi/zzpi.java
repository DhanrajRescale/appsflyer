package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpi extends zzagk implements zzahq {
    private static final zzpi zzb;
    private int zzd;
    private zzpo zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzpi zzpiVar = new zzpi();
        zzb = zzpiVar;
        zzagk.zzH(zzpi.class, zzpiVar);
    }

    private zzpi() {
    }

    public static zzph zzb() {
        return (zzph) zzb.zzt();
    }

    public static zzpi zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzpi) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzh(zzpi zzpiVar, zzpo zzpoVar) {
        zzpoVar.getClass();
        zzpiVar.zze = zzpoVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzpo zze() {
        zzpo zzpoVar = this.zze;
        if (zzpoVar == null) {
            return zzpo.zzd();
        }
        return zzpoVar;
    }

    public final zzaff zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzpg zzpgVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzph(zzpgVar);
                }
                return new zzpi();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
