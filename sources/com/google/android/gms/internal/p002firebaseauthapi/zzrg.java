package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrg extends zzagk implements zzahq {
    private static final zzrg zzb;
    private int zzd;
    private int zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzrg zzrgVar = new zzrg();
        zzb = zzrgVar;
        zzagk.zzH(zzrg.class, zzrgVar);
    }

    private zzrg() {
    }

    public static zzrf zza() {
        return (zzrf) zzb.zzt();
    }

    public static zzrg zzc() {
        return zzb;
    }

    public final zzaff zzd() {
        return this.zzf;
    }

    public final int zzf() {
        int i10 = this.zzd;
        int i11 = i10 != 0 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzg() {
        int zzb2 = zzrn.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzre zzreVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzrf(zzreVar);
                }
                return new zzrg();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
