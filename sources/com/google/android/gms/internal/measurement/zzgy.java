package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgy extends zzlb implements zzmj {
    private static final zzgy zza;
    private int zzd;
    private int zze;
    private zzli zzf = zzlb.zzbH();
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzi;
    private double zzj;

    static {
        zzgy zzgyVar = new zzgy();
        zza = zzgyVar;
        zzlb.zzbO(zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public final double zza() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final List zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 4) != 0;
    }

    public final int zzj() {
        int zza2 = zzgx.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgn zzgnVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgu(zzgnVar);
                }
                return new zzgy();
            }
            return zzlb.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", zzgw.zza, "zzf", zzgy.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
