package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzra extends zzagk implements zzahq {
    private static final zzra zzb;
    private int zzd;
    private zzrd zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzra zzraVar = new zzra();
        zzb = zzraVar;
        zzagk.zzH(zzra.class, zzraVar);
    }

    private zzra() {
    }

    public static zzqz zzb() {
        return (zzqz) zzb.zzt();
    }

    public static zzra zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzra) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzh(zzra zzraVar, zzrd zzrdVar) {
        zzrdVar.getClass();
        zzraVar.zze = zzrdVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzrd zze() {
        zzrd zzrdVar = this.zze;
        if (zzrdVar == null) {
            return zzrd.zze();
        }
        return zzrdVar;
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
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzqz(null);
                }
                return new zzra();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
