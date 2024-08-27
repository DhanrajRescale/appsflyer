package com.google.android.gms.internal.icing;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgd extends zzda<zzgd, zzgc> implements zzef {
    private static final zzgd zzg;
    private int zzb;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzgh zzf;

    static {
        zzgd zzgdVar = new zzgd();
        zzg = zzgdVar;
        zzda.zzq(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgc zza() {
        return zzg.zzl();
    }

    public static /* synthetic */ void zzc(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzb |= 1;
        zzgdVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzgd zzgdVar, zzgh zzghVar) {
        zzghVar.getClass();
        zzgdVar.zzf = zzghVar;
        zzgdVar.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.icing.zzda
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgb zzgbVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzg;
                    }
                    return new zzgc(zzgbVar);
                }
                return new zzgd();
            }
            return zzda.zzr(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
