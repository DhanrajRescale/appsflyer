package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzsb extends zzagk implements zzahq {
    private static final zzsb zzb;
    private zzse zzd;

    static {
        zzsb zzsbVar = new zzsb();
        zzb = zzsbVar;
        zzagk.zzH(zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    public static zzsa zza() {
        return (zzsa) zzb.zzt();
    }

    public static zzsb zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzsb) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zze(zzsb zzsbVar, zzse zzseVar) {
        zzseVar.getClass();
        zzsbVar.zzd = zzseVar;
    }

    public final zzse zzd() {
        zzse zzseVar = this.zzd;
        if (zzseVar == null) {
            return zzse.zzc();
        }
        return zzseVar;
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
                    return new zzsa(null);
                }
                return new zzsb();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
