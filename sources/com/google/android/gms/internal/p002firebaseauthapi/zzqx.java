package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqx extends zzagk implements zzahq {
    private static final zzqx zzb;
    private zzrg zzd;
    private zzqr zze;
    private int zzf;

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zzagk.zzH(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzb() {
        return (zzqw) zzb.zzt();
    }

    public static zzqx zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzqx zzqxVar, zzrg zzrgVar) {
        zzrgVar.getClass();
        zzqxVar.zzd = zzrgVar;
    }

    public static /* synthetic */ void zzg(zzqx zzqxVar, zzqr zzqrVar) {
        zzqrVar.getClass();
        zzqxVar.zze = zzqrVar;
    }

    public final zzqr zza() {
        zzqr zzqrVar = this.zze;
        if (zzqrVar == null) {
            return zzqr.zzc();
        }
        return zzqrVar;
    }

    public final zzrg zze() {
        zzrg zzrgVar = this.zzd;
        if (zzrgVar == null) {
            return zzrg.zzc();
        }
        return zzrgVar;
    }

    public final int zzh() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzqv zzqvVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzqw(zzqvVar);
                }
                return new zzqx();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
