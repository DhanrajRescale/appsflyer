package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzfd extends zzlb implements zzmj {
    private static final zzfd zza;
    private int zzd;
    private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzfd zzfdVar = new zzfd();
        zza = zzfdVar;
        zzlb.zzbO(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    public static /* synthetic */ void zzd(zzfd zzfdVar, String str) {
        str.getClass();
        zzfdVar.zzd |= 1;
        zzfdVar.zze = str;
    }

    public final int zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzez zzezVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfc(zzezVar);
                }
                return new zzfd();
            }
            return zzlb.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
