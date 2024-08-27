package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.i0;
import vt.v;

/* loaded from: classes2.dex */
public final class zzcr {

    @NotNull
    public static final zzcr zza = new zzcr();

    @NotNull
    private static List zzb = i0.f38321a;

    private zzcr() {
    }

    public static final void acx(@NotNull int[] iArr) {
        zzb(iArr);
    }

    public static final int zza(@NotNull int[] iArr) {
        Iterator it = g0.I(v.x(iArr), zzb).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final void zzb(@NotNull int[] iArr) {
        zzb = v.x(iArr);
    }
}
