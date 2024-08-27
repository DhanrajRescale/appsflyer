package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzon extends zzagk implements zzahq {
    private static final zzon zzb;
    private int zzd;
    private zzoq zze;

    static {
        zzon zzonVar = new zzon();
        zzb = zzonVar;
        zzagk.zzH(zzon.class, zzonVar);
    }

    private zzon() {
    }

    public static zzom zzb() {
        return (zzom) zzb.zzt();
    }

    public static zzon zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzon) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzg(zzon zzonVar, zzoq zzoqVar) {
        zzoqVar.getClass();
        zzonVar.zze = zzoqVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzoq zze() {
        zzoq zzoqVar = this.zze;
        if (zzoqVar == null) {
            return zzoq.zzd();
        }
        return zzoqVar;
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
                    return new zzom(null);
                }
                return new zzon();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
