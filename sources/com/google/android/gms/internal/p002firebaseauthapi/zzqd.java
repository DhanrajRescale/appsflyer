package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqd extends zzagk implements zzahq {
    private static final zzqd zzb;
    private int zzd;
    private zzaff zze = zzaff.zzb;

    static {
        zzqd zzqdVar = new zzqd();
        zzb = zzqdVar;
        zzagk.zzH(zzqd.class, zzqdVar);
    }

    private zzqd() {
    }

    public static zzqc zzb() {
        return (zzqc) zzb.zzt();
    }

    public static zzqd zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzqd) zzagk.zzx(zzb, zzaffVar, zzafxVar);
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
                    zzqb zzqbVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzqc(zzqbVar);
                }
                return new zzqd();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
