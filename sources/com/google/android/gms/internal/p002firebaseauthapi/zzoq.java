package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzoq extends zzagk implements zzahq {
    private static final zzoq zzb;
    private int zzd;

    static {
        zzoq zzoqVar = new zzoq();
        zzb = zzoqVar;
        zzagk.zzH(zzoq.class, zzoqVar);
    }

    private zzoq() {
    }

    public static zzop zzb() {
        return (zzop) zzb.zzt();
    }

    public static zzoq zzd() {
        return zzb;
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
                    return new zzop(null);
                }
                return new zzoq();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
