package com.google.android.gms.internal.icing;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzap extends zzda<zzap, zzao> implements zzef {
    private static final zzap zzh;
    private int zzb;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzg;

    static {
        zzap zzapVar = new zzap();
        zzh = zzapVar;
        zzda.zzq(zzap.class, zzapVar);
    }

    private zzap() {
    }

    public static zzao zza() {
        return zzh.zzl();
    }

    public static /* synthetic */ zzap zzb() {
        return zzh;
    }

    public static /* synthetic */ void zzc(zzap zzapVar, String str) {
        str.getClass();
        zzapVar.zzb |= 1;
        zzapVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzap zzapVar, String str) {
        str.getClass();
        zzapVar.zzb |= 2;
        zzapVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzap zzapVar, int i10) {
        zzapVar.zzb |= 4;
        zzapVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.icing.zzda
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzam zzamVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzao(zzamVar);
                }
                return new zzap();
            }
            return zzda.zzr(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
