package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzot extends zzagk implements zzahq {
    private static final zzot zzb;
    private int zzd;
    private zzoz zze;
    private zzrq zzf;

    static {
        zzot zzotVar = new zzot();
        zzb = zzotVar;
        zzagk.zzH(zzot.class, zzotVar);
    }

    private zzot() {
    }

    public static zzos zzb() {
        return (zzos) zzb.zzt();
    }

    public static zzot zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzot) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzh(zzot zzotVar, zzoz zzozVar) {
        zzozVar.getClass();
        zzotVar.zze = zzozVar;
    }

    public static /* synthetic */ void zzi(zzot zzotVar, zzrq zzrqVar) {
        zzrqVar.getClass();
        zzotVar.zzf = zzrqVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzoz zze() {
        zzoz zzozVar = this.zze;
        if (zzozVar == null) {
            return zzoz.zzd();
        }
        return zzozVar;
    }

    public final zzrq zzf() {
        zzrq zzrqVar = this.zzf;
        if (zzrqVar == null) {
            return zzrq.zzd();
        }
        return zzrqVar;
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
                    return new zzos(null);
                }
                return new zzot();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
