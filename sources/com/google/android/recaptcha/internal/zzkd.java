package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzkd extends zzgo implements zzhz {
    private static final zzkd zzb;
    private zzgv zzd = zzgo.zzw();
    private zzfw zze;

    static {
        zzkd zzkdVar = new zzkd();
        zzb = zzkdVar;
        zzgo.zzC(zzkd.class, zzkdVar);
    }

    private zzkd() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzkc(null);
                }
                return new zzkd();
            }
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\f\r\u0002\u0000\u0001\u0000\f\u001b\r\t", new Object[]{"zzd", zzlm.class, "zze"});
        }
        return (byte) 1;
    }
}
