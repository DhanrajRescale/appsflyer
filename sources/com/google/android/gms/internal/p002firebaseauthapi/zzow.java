package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzow extends zzagk implements zzahq {
    private static final zzow zzb;
    private zzpc zzd;
    private zzrt zze;

    static {
        zzow zzowVar = new zzow();
        zzb = zzowVar;
        zzagk.zzH(zzow.class, zzowVar);
    }

    private zzow() {
    }

    public static zzov zza() {
        return (zzov) zzb.zzt();
    }

    public static zzow zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzow) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzf(zzow zzowVar, zzpc zzpcVar) {
        zzpcVar.getClass();
        zzowVar.zzd = zzpcVar;
    }

    public static /* synthetic */ void zzg(zzow zzowVar, zzrt zzrtVar) {
        zzrtVar.getClass();
        zzowVar.zze = zzrtVar;
    }

    public final zzpc zzd() {
        zzpc zzpcVar = this.zzd;
        if (zzpcVar == null) {
            return zzpc.zzd();
        }
        return zzpcVar;
    }

    public final zzrt zze() {
        zzrt zzrtVar = this.zze;
        if (zzrtVar == null) {
            return zzrt.zzd();
        }
        return zzrtVar;
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
                    return new zzov(null);
                }
                return new zzow();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
