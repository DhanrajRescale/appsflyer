package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzoz extends zzagk implements zzahq {
    private static final zzoz zzb;
    private int zzd;
    private zzpf zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzoz zzozVar = new zzoz();
        zzb = zzozVar;
        zzagk.zzH(zzoz.class, zzozVar);
    }

    private zzoz() {
    }

    public static zzoy zzb() {
        return (zzoy) zzb.zzt();
    }

    public static zzoz zzd() {
        return zzb;
    }

    public static zzoz zze(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzoz) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzi(zzoz zzozVar, zzpf zzpfVar) {
        zzpfVar.getClass();
        zzozVar.zze = zzpfVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzpf zzf() {
        zzpf zzpfVar = this.zze;
        if (zzpfVar == null) {
            return zzpf.zzd();
        }
        return zzpfVar;
    }

    public final zzaff zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzox zzoxVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzoy(zzoxVar);
                }
                return new zzoz();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
