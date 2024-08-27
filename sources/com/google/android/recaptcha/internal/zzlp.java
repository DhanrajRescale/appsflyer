package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzlp extends zzgo implements zzhz {
    private static final zzlp zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzlp zzlpVar = new zzlp();
        zzb = zzlpVar;
        zzgo.zzC(zzlp.class, zzlpVar);
    }

    private zzlp() {
    }

    public static zzlp zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzln zzlnVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzlo(zzlnVar);
                }
                return new zzlp();
            }
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final List zzi() {
        return this.zzd;
    }
}
