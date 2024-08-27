package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqg extends zzagk implements zzahq {
    private static final zzqg zzb;
    private int zzd;
    private int zze;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zzagk.zzH(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    public static zzqf zzb() {
        return (zzqf) zzb.zzt();
    }

    public static zzqg zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzqg) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzqf(null);
                }
                return new zzqg();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
