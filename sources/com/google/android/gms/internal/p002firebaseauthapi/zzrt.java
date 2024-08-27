package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzrt extends zzagk implements zzahq {
    private static final zzrt zzb;
    private zzrw zzd;
    private int zze;
    private int zzf;

    static {
        zzrt zzrtVar = new zzrt();
        zzb = zzrtVar;
        zzagk.zzH(zzrt.class, zzrtVar);
    }

    private zzrt() {
    }

    public static zzrs zzb() {
        return (zzrs) zzb.zzt();
    }

    public static zzrt zzd() {
        return zzb;
    }

    public static zzrt zze(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzrt) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzg(zzrt zzrtVar, zzrw zzrwVar) {
        zzrwVar.getClass();
        zzrtVar.zzd = zzrwVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzrw zzf() {
        zzrw zzrwVar = this.zzd;
        if (zzrwVar == null) {
            return zzrw.zzd();
        }
        return zzrwVar;
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
                    return new zzrs(null);
                }
                return new zzrt();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
