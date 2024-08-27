package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzmb extends zzgo implements zzhz {
    private static final zzmb zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        zzmb zzmbVar = new zzmb();
        zzb = zzmbVar;
        zzgo.zzC(zzmb.class, zzmbVar);
    }

    private zzmb() {
    }

    public static zzma zzf() {
        return (zzma) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzmb zzmbVar, String str) {
        str.getClass();
        zzmbVar.zzd = str;
    }

    public static /* synthetic */ void zzj(zzmb zzmbVar, String str) {
        str.getClass();
        zzmbVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
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
                    return new zzma(null);
                }
                return new zzmb();
            }
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
