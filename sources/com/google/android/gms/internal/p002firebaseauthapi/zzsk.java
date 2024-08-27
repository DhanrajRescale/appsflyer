package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzsk extends zzagk implements zzahq {
    private static final zzsk zzb;
    private int zzd;
    private zzse zze;
    private zzaff zzf = zzaff.zzb;

    static {
        zzsk zzskVar = new zzsk();
        zzb = zzskVar;
        zzagk.zzH(zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zzsj zzc() {
        return (zzsj) zzb.zzt();
    }

    public static zzsk zze() {
        return zzb;
    }

    public static zzsk zzf(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzsk) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzi(zzsk zzskVar, zzse zzseVar) {
        zzseVar.getClass();
        zzskVar.zze = zzseVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzse zzb() {
        zzse zzseVar = this.zze;
        if (zzseVar == null) {
            return zzse.zzc();
        }
        return zzseVar;
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
                    zzsi zzsiVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzsj(zzsiVar);
                }
                return new zzsk();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
