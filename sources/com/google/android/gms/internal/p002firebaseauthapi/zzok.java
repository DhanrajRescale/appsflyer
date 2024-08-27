package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzok extends zzagk implements zzahq {
    private static final zzok zzb;
    private int zzd;
    private zzaff zze = zzaff.zzb;
    private zzoq zzf;

    static {
        zzok zzokVar = new zzok();
        zzb = zzokVar;
        zzagk.zzH(zzok.class, zzokVar);
    }

    private zzok() {
    }

    public static zzoj zzb() {
        return (zzoj) zzb.zzt();
    }

    public static zzok zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzok) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzi(zzok zzokVar, zzoq zzoqVar) {
        zzoqVar.getClass();
        zzokVar.zzf = zzoqVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzoq zze() {
        zzoq zzoqVar = this.zzf;
        if (zzoqVar == null) {
            return zzoq.zzd();
        }
        return zzoqVar;
    }

    public final zzaff zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzoi zzoiVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzoj(zzoiVar);
                }
                return new zzok();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
