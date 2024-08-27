package com.google.android.gms.internal.icing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class zzbp {
    public static <T> T zza(@NullableDecl T t10) {
        if (t10 != null) {
            return t10;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzbq(sb2.toString());
    }
}
