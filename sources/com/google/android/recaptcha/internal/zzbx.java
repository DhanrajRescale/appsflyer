package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import ut.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbx {
    @NotNull
    public static String zza(zzby zzbyVar, @NotNull String str, byte b10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            s.Companion companion = s.INSTANCE;
            sb2.append((char) (charAt ^ b10));
        }
        return sb2.toString();
    }

    public static void zzb(zzby zzbyVar, int i10, int i11) throws zzt {
        if (i10 == i11) {
        } else {
            throw new zzt(4, 24, null);
        }
    }
}
