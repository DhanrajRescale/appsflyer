package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zztq extends zzagk implements zzahq {
    private static final zztq zzb;
    private int zzd;
    private zztt zze;

    static {
        zztq zztqVar = new zztq();
        zzb = zztqVar;
        zzagk.zzH(zztq.class, zztqVar);
    }

    private zztq() {
    }

    public static zztp zzb() {
        return (zztp) zzb.zzt();
    }

    public static zztq zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zztq) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public static /* synthetic */ void zzg(zztq zztqVar, zztt zzttVar) {
        zzttVar.getClass();
        zztqVar.zze = zzttVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zztt zze() {
        zztt zzttVar = this.zze;
        if (zzttVar == null) {
            return zztt.zzc();
        }
        return zzttVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzto zztoVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zztp(zztoVar);
                }
                return new zztq();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
