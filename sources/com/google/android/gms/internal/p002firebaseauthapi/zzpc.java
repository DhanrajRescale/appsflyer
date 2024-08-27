package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpc extends zzagk implements zzahq {
    private static final zzpc zzb;
    private zzpf zzd;
    private int zze;

    static {
        zzpc zzpcVar = new zzpc();
        zzb = zzpcVar;
        zzagk.zzH(zzpc.class, zzpcVar);
    }

    private zzpc() {
    }

    public static zzpb zzb() {
        return (zzpb) zzb.zzt();
    }

    public static zzpc zzd() {
        return zzb;
    }

    public static zzpc zze(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzpc) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzg(zzpc zzpcVar, zzpf zzpfVar) {
        zzpfVar.getClass();
        zzpcVar.zzd = zzpfVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzpf zzf() {
        zzpf zzpfVar = this.zzd;
        if (zzpfVar == null) {
            return zzpf.zzd();
        }
        return zzpfVar;
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
                    return new zzpb(null);
                }
                return new zzpc();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
