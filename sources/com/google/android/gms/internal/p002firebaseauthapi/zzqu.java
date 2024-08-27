package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqu extends zzagk implements zzahq {
    private static final zzqu zzb;
    private zzqx zzd;

    static {
        zzqu zzquVar = new zzqu();
        zzb = zzquVar;
        zzagk.zzH(zzqu.class, zzquVar);
    }

    private zzqu() {
    }

    public static zzqt zza() {
        return (zzqt) zzb.zzt();
    }

    public static zzqu zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzqu) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zze(zzqu zzquVar, zzqx zzqxVar) {
        zzqxVar.getClass();
        zzquVar.zzd = zzqxVar;
    }

    public final zzqx zzd() {
        zzqx zzqxVar = this.zzd;
        if (zzqxVar == null) {
            return zzqx.zzd();
        }
        return zzqxVar;
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
                    return new zzqt(null);
                }
                return new zzqu();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
