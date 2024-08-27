package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zztn extends zzagk implements zzahq {
    private static final zztn zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        zztn zztnVar = new zztn();
        zzb = zztnVar;
        zzagk.zzH(zztn.class, zztnVar);
    }

    private zztn() {
    }

    public static zztn zzb() {
        return zzb;
    }

    public static zztn zzc(zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        return (zztn) zzagk.zzx(zzb, zzaffVar, zzafxVar);
    }

    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zztl zztlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zztm(zztlVar);
                }
                return new zztn();
            }
            return zzagk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
