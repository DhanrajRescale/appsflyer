package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzey extends zzlb implements zzmj {
    private static final zzey zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzli zzh = zzlb.zzbH();

    static {
        zzey zzeyVar = new zzey();
        zza = zzeyVar;
        zzlb.zzbO(zzey.class, zzeyVar);
    }

    private zzey() {
    }

    public static zzey zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int zza2 = zzex.zza(this.zze);
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
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzeu(null);
                }
                return new zzey();
            }
            return zzlb.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", zzew.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
