package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzub extends zzagk implements zzahq {
    private static final zzub zzb;
    private int zzd;
    private zzaff zze = zzaff.zzb;

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zzagk.zzH(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzua zzb() {
        return (zzua) zzb.zzt();
    }

    public static zzub zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzub) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzaff zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zztz zztzVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzua(zztzVar);
                }
                return new zzub();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
