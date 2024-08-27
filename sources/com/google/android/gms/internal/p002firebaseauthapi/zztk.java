package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zztk extends zzagk implements zzahq {
    private static final zztk zzb;
    private int zzd;
    private zztn zze;

    static {
        zztk zztkVar = new zztk();
        zzb = zztkVar;
        zzagk.zzH(zztk.class, zztkVar);
    }

    private zztk() {
    }

    public static zztj zzb() {
        return (zztj) zzb.zzt();
    }

    public static zztk zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zztk) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzg(zztk zztkVar, zztn zztnVar) {
        zztnVar.getClass();
        zztkVar.zze = zztnVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zztn zze() {
        zztn zztnVar = this.zze;
        if (zztnVar == null) {
            return zztn.zzb();
        }
        return zztnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzti zztiVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zztj(zztiVar);
                }
                return new zztk();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
