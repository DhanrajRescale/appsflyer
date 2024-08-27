package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zztt extends zzagk implements zzahq {
    private static final zztt zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzsu zze;

    static {
        zztt zzttVar = new zztt();
        zzb = zzttVar;
        zzagk.zzH(zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zztt zzc() {
        return zzb;
    }

    public static zztt zzd(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zztt) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public final zzsu zza() {
        zzsu zzsuVar = this.zze;
        if (zzsuVar == null) {
            return zzsu.zzc();
        }
        return zzsuVar;
    }

    public final String zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze != null;
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
                    return new zzts(null);
                }
                return new zztt();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
