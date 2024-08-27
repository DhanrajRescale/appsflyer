package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzem extends zzlb implements zzmj {
    private static final zzem zza;
    private int zzd;
    private zzey zze;
    private zzer zzf;
    private boolean zzg;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        zzem zzemVar = new zzem();
        zza = zzemVar;
        zzlb.zzbO(zzem.class, zzemVar);
    }

    private zzem() {
    }

    public static zzem zzb() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzem zzemVar, String str) {
        zzemVar.zzd |= 8;
        zzemVar.zzh = str;
    }

    public final zzer zzc() {
        zzer zzerVar = this.zzf;
        if (zzerVar == null) {
            return zzer.zzb();
        }
        return zzerVar;
    }

    public final zzey zzd() {
        zzey zzeyVar = this.zze;
        if (zzeyVar == null) {
            return zzey.zzc();
        }
        return zzeyVar;
    }

    public final String zze() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzel(null);
                }
                return new zzem();
            }
            return zzlb.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
