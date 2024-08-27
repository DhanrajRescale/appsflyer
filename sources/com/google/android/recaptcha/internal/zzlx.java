package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzlx extends zzgo implements zzhz {
    private static final zzlx zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzgo.zzC(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzlv zzlvVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzlw(zzlvVar);
                }
                return new zzlx();
            }
            return zzgo.zzz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
