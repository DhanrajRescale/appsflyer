package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpr extends zzagk implements zzahq {
    private static final zzpr zzb;
    private int zzd;
    private zzaff zze = zzaff.zzb;

    static {
        zzpr zzprVar = new zzpr();
        zzb = zzprVar;
        zzagk.zzH(zzpr.class, zzprVar);
    }

    private zzpr() {
    }

    public static zzpq zzb() {
        return (zzpq) zzb.zzt();
    }

    public static zzpr zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzpr) zzagk.zzx(zzb, zzaffVar, zzafxVar);
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
                    zzpp zzppVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzpq(zzppVar);
                }
                return new zzpr();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
