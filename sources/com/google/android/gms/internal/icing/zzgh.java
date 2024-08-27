package com.google.android.gms.internal.icing;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgh extends zzda<zzgh, zzgg> implements zzef {
    private static final zzgh zzj;
    private int zzb;
    private boolean zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzg;
    private double zzh;
    private zzgf zzi;

    static {
        zzgh zzghVar = new zzgh();
        zzj = zzghVar;
        zzda.zzq(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public static zzgg zza() {
        return zzj.zzl();
    }

    public static /* synthetic */ void zzc(zzgh zzghVar, boolean z10) {
        zzghVar.zzb |= 1;
        zzghVar.zze = z10;
    }

    public static /* synthetic */ void zzd(zzgh zzghVar, String str) {
        str.getClass();
        zzghVar.zzb |= 2;
        zzghVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzgh zzghVar, zzgf zzgfVar) {
        zzgfVar.getClass();
        zzghVar.zzi = zzgfVar;
        zzghVar.zzb |= 16;
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
                        return zzj;
                    }
                    return new zzgg(zzgbVar);
                }
                return new zzgh();
            }
            return zzda.zzr(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
