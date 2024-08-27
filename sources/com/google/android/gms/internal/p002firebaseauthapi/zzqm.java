package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqm extends zzagk implements zzahq {
    private static final zzqm zzb;

    static {
        zzqm zzqmVar = new zzqm();
        zzb = zzqmVar;
        zzagk.zzH(zzqm.class, zzqmVar);
    }

    private zzqm() {
    }

    public static zzqm zzb() {
        return zzb;
    }

    public static zzqm zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zzqm) zzagk.zzx(zzb, zzaffVar, zzafxVar);
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
                    return new zzql(null);
                }
                return new zzqm();
            }
            return zzagk.zzE(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
