package com.google.android.gms.internal.icing;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgf extends zzda<zzgf, zzge> implements zzef {
    private static final zzgf zzg;
    private int zzb;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdg<zzgd> zzf = zzda.zzw();

    static {
        zzgf zzgfVar = new zzgf();
        zzg = zzgfVar;
        zzda.zzq(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzge zza() {
        return zzg.zzl();
    }

    public static /* synthetic */ void zzc(zzgf zzgfVar, String str) {
        zzgfVar.zzb |= 1;
        zzgfVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzgf zzgfVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzdg<zzgd> zzdgVar = zzgfVar.zzf;
        if (!zzdgVar.zza()) {
            zzgfVar.zzf = zzda.zzx(zzdgVar);
        }
        zzgfVar.zzf.add(zzgdVar);
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
                    return new zzge(zzgbVar);
                }
                return new zzgf();
            }
            return zzda.zzr(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzgd.class});
        }
        return (byte) 1;
    }
}
