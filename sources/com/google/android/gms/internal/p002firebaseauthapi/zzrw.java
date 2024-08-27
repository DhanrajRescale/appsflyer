package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrw extends zzagk implements zzahq {
    private static final zzrw zzb;
    private int zzd;
    private int zze;

    static {
        zzrw zzrwVar = new zzrw();
        zzb = zzrwVar;
        zzagk.zzH(zzrw.class, zzrwVar);
    }

    private zzrw() {
    }

    public static zzrv zzb() {
        return (zzrv) zzb.zzt();
    }

    public static zzrw zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzf() {
        int zzb2 = zzrn.zzb(this.zzd);
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
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzrv(null);
                }
                return new zzrw();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
