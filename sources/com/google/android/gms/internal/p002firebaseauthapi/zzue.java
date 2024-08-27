package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzue extends zzagk implements zzahq {
    private static final zzue zzb;
    private int zzd;

    static {
        zzue zzueVar = new zzue();
        zzb = zzueVar;
        zzagk.zzH(zzue.class, zzueVar);
    }

    private zzue() {
    }

    public static zzue zzb() {
        return zzb;
    }

    public static zzue zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzue) zzagk.zzx(zzb, zzaffVar, zzafxVar);
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
                    return new zzud(null);
                }
                return new zzue();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
