package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqr extends zzagk implements zzahq {
    private static final zzqr zzb;
    private zzsu zzd;

    static {
        zzqr zzqrVar = new zzqr();
        zzb = zzqrVar;
        zzagk.zzH(zzqr.class, zzqrVar);
    }

    private zzqr() {
    }

    public static zzqq zza() {
        return (zzqq) zzb.zzt();
    }

    public static zzqr zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzqr zzqrVar, zzsu zzsuVar) {
        zzsuVar.getClass();
        zzqrVar.zzd = zzsuVar;
    }

    public final zzsu zzd() {
        zzsu zzsuVar = this.zzd;
        if (zzsuVar == null) {
            return zzsu.zzc();
        }
        return zzsuVar;
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
                    return new zzqq(null);
                }
                return new zzqr();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
