package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzait extends zzagk implements zzahq {
    private static final zzait zzb;
    private long zzd;
    private int zze;

    static {
        zzait zzaitVar = new zzait();
        zzb = zzaitVar;
        zzagk.zzH(zzait.class, zzaitVar);
    }

    private zzait() {
    }

    public static zzais zzc() {
        return (zzais) zzb.zzt();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzair zzairVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzais(zzairVar);
                }
                return new zzait();
            }
            return new zzahz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
