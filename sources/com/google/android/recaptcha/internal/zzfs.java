package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzfs extends zzgo implements zzhz {
    private static final zzfs zzb;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzgv zze = zzii.zze();
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzez zzj = zzez.zzb;
    private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        zzfs zzfsVar = new zzfs();
        zzb = zzfsVar;
        zzgo.zzC(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        byte b10;
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            } else {
                                b10 = 1;
                            }
                            this.zzl = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfp(null);
                }
                return new zzfs();
            }
            return new zzij(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzfr.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
