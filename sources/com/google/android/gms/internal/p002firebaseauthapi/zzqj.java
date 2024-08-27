package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqj extends zzagk implements zzahq {
    private static final zzqj zzb;
    private int zzd;
    private zzaff zze = zzaff.zzb;

    static {
        zzqj zzqjVar = new zzqj();
        zzb = zzqjVar;
        zzagk.zzH(zzqj.class, zzqjVar);
    }

    private zzqj() {
    }

    public static zzqi zzb() {
        return (zzqi) zzb.zzt();
    }

    public static zzqj zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzqj) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzaff zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzqh zzqhVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzqi(zzqhVar);
                }
                return new zzqj();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
