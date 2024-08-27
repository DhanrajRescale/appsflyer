package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrd extends zzagk implements zzahq {
    private static final zzrd zzb;
    private int zzd;
    private zzqx zze;
    private zzaff zzf;
    private zzaff zzg;

    static {
        zzrd zzrdVar = new zzrd();
        zzb = zzrdVar;
        zzagk.zzH(zzrd.class, zzrdVar);
    }

    private zzrd() {
        zzaff zzaffVar = zzaff.zzb;
        this.zzf = zzaffVar;
        this.zzg = zzaffVar;
    }

    public static zzrc zzc() {
        return (zzrc) zzb.zzt();
    }

    public static zzrd zze() {
        return zzb;
    }

    public static zzrd zzf(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzrd) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzi(zzrd zzrdVar, int i10) {
        zzrdVar.zzd = 0;
    }

    public static /* synthetic */ void zzk(zzrd zzrdVar, zzqx zzqxVar) {
        zzqxVar.getClass();
        zzrdVar.zze = zzqxVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzqx zzb() {
        zzqx zzqxVar = this.zze;
        if (zzqxVar == null) {
            return zzqx.zzd();
        }
        return zzqxVar;
    }

    public final zzaff zzg() {
        return this.zzf;
    }

    public final zzaff zzh() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzrb zzrbVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzrc(zzrbVar);
                }
                return new zzrd();
            }
            return zzagk.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
