package com.google.android.gms.internal.icing;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzga extends zzda<zzga, zzfz> implements zzef {
    private static final zzga zzi;
    private int zzb;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdg<zzfy> zzg = zzda.zzw();
    private zzfw zzh;

    static {
        zzga zzgaVar = new zzga();
        zzi = zzgaVar;
        zzda.zzq(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    @Override // com.google.android.gms.internal.icing.zzda
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzi;
                    }
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzda.zzr(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzfy.class, "zzh"});
        }
        return (byte) 1;
    }
}
