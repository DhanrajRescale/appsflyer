package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrq extends zzagk implements zzahq {
    private static final zzrq zzb;
    private int zzd;
    private zzrw zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzrq zzrqVar = new zzrq();
        zzb = zzrqVar;
        zzagk.zzH(zzrq.class, zzrqVar);
    }

    private zzrq() {
    }

    public static zzrp zzb() {
        return (zzrp) zzb.zzt();
    }

    public static zzrq zzd() {
        return zzb;
    }

    public static zzrq zze(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzrq) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzi(zzrq zzrqVar, zzrw zzrwVar) {
        zzrwVar.getClass();
        zzrqVar.zze = zzrwVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzrw zzf() {
        zzrw zzrwVar = this.zze;
        if (zzrwVar == null) {
            return zzrw.zzd();
        }
        return zzrwVar;
    }

    public final zzaff zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzro zzroVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzrp(zzroVar);
                }
                return new zzrq();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
