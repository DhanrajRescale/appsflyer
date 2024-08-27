package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpu extends zzagk implements zzahq {
    private static final zzpu zzb;
    private int zzd;
    private int zze;

    static {
        zzpu zzpuVar = new zzpu();
        zzb = zzpuVar;
        zzagk.zzH(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    public static zzpt zzb() {
        return (zzpt) zzb.zzt();
    }

    public static zzpu zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzpu) zzagk.zzx(zzb, zzaffVar, zzafxVar);
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
                    return new zzpt(null);
                }
                return new zzpu();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
