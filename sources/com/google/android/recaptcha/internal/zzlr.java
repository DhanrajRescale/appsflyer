package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzlr extends zzgo implements zzhz {
    private static final zzlr zzb;
    private zzlp zzd;
    private zzlp zze;

    static {
        zzlr zzlrVar = new zzlr();
        zzb = zzlrVar;
        zzgo.zzC(zzlr.class, zzlrVar);
    }

    private zzlr() {
    }

    public static zzlr zzj(InputStream inputStream) throws IOException {
        return (zzlr) zzgo.zzt(zzb, inputStream);
    }

    public final zzlp zzf() {
        zzlp zzlpVar = this.zzd;
        if (zzlpVar == null) {
            return zzlp.zzg();
        }
        return zzlpVar;
    }

    public final zzlp zzg() {
        zzlp zzlpVar = this.zze;
        if (zzlpVar == null) {
            return zzlp.zzg();
        }
        return zzlpVar;
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
                    return new zzlq(null);
                }
                return new zzlr();
            }
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
