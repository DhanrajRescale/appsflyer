package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpl extends zzagk implements zzahq {
    private static final zzpl zzb;
    private zzpo zzd;
    private int zze;

    static {
        zzpl zzplVar = new zzpl();
        zzb = zzplVar;
        zzagk.zzH(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    public static zzpk zzb() {
        return (zzpk) zzb.zzt();
    }

    public static zzpl zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzpl) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzf(zzpl zzplVar, zzpo zzpoVar) {
        zzpoVar.getClass();
        zzplVar.zzd = zzpoVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzpo zze() {
        zzpo zzpoVar = this.zzd;
        if (zzpoVar == null) {
            return zzpo.zzd();
        }
        return zzpoVar;
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
                    return new zzpk(null);
                }
                return new zzpl();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
