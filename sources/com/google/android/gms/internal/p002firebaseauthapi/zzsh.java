package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzsh extends zzagk implements zzahq {
    private static final zzsh zzb;
    private int zzd;
    private zzsk zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zzagk.zzH(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zzsg zzb() {
        return (zzsg) zzb.zzt();
    }

    public static zzsh zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzsh) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzh(zzsh zzshVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzshVar.zze = zzskVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzsk zze() {
        zzsk zzskVar = this.zze;
        if (zzskVar == null) {
            return zzsk.zze();
        }
        return zzskVar;
    }

    public final zzaff zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzsf zzsfVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzsg(zzsfVar);
                }
                return new zzsh();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean zzk() {
        return this.zze != null;
    }
}
