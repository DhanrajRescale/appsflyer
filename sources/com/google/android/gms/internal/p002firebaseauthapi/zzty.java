package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

@Deprecated
/* loaded from: classes2.dex */
public final class zzty extends zzagk implements zzahq {
    private static final zzty zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzagp zze = zzagk.zzA();

    static {
        zzty zztyVar = new zzty();
        zzb = zztyVar;
        zzagk.zzH(zzty.class, zztyVar);
    }

    private zzty() {
    }

    public static zzty zzb() {
        return zzb;
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
                    return new zztx(null);
                }
                return new zzty();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzsx.class});
        }
        return (byte) 1;
    }
}
