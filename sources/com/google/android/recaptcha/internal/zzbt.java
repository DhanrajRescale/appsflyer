package com.google.android.recaptcha.internal;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.v;

/* loaded from: classes2.dex */
public final class zzbt implements zzby {

    @NotNull
    public static final zzbt zza = new zzbt();

    private zzbt() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        String B;
        String str;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(",", "separator");
                    Intrinsics.checkNotNullParameter("[", "prefix");
                    Intrinsics.checkNotNullParameter("]", "postfix");
                    Intrinsics.checkNotNullParameter("...", "truncated");
                    StringBuilder buffer = new StringBuilder();
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(buffer, "buffer");
                    Intrinsics.checkNotNullParameter(",", "separator");
                    Intrinsics.checkNotNullParameter("[", "prefix");
                    Intrinsics.checkNotNullParameter("]", "postfix");
                    Intrinsics.checkNotNullParameter("...", "truncated");
                    buffer.append((CharSequence) "[");
                    int length = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = iArr[i11];
                        int i14 = i12 + 1;
                        if (i14 > 1) {
                            buffer.append((CharSequence) ",");
                        }
                        buffer.append((CharSequence) String.valueOf(i13));
                        i11++;
                        i12 = i14;
                    }
                    buffer.append((CharSequence) "]");
                    B = buffer.toString();
                    Intrinsics.checkNotNullExpressionValue(B, "toString(...)");
                } else {
                    if (obj instanceof byte[]) {
                        str = new String((byte[]) obj, Charsets.UTF_8);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        StringBuilder buffer2 = new StringBuilder();
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        Intrinsics.checkNotNullParameter(buffer2, "buffer");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        buffer2.append((CharSequence) "[");
                        int length2 = jArr.length;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < length2) {
                            long j10 = jArr[i15];
                            int i17 = i16 + 1;
                            if (i17 > 1) {
                                buffer2.append((CharSequence) ",");
                            }
                            buffer2.append((CharSequence) String.valueOf(j10));
                            i15++;
                            i16 = i17;
                        }
                        buffer2.append((CharSequence) "]");
                        B = buffer2.toString();
                        Intrinsics.checkNotNullExpressionValue(B, "toString(...)");
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        Intrinsics.checkNotNullParameter(sArr, "<this>");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        StringBuilder buffer3 = new StringBuilder();
                        Intrinsics.checkNotNullParameter(sArr, "<this>");
                        Intrinsics.checkNotNullParameter(buffer3, "buffer");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        buffer3.append((CharSequence) "[");
                        int length3 = sArr.length;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < length3) {
                            short s7 = sArr[i18];
                            int i20 = i19 + 1;
                            if (i20 > 1) {
                                buffer3.append((CharSequence) ",");
                            }
                            buffer3.append((CharSequence) String.valueOf((int) s7));
                            i18++;
                            i19 = i20;
                        }
                        buffer3.append((CharSequence) "]");
                        B = buffer3.toString();
                        Intrinsics.checkNotNullExpressionValue(B, "toString(...)");
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        Intrinsics.checkNotNullParameter(fArr, "<this>");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        StringBuilder buffer4 = new StringBuilder();
                        Intrinsics.checkNotNullParameter(fArr, "<this>");
                        Intrinsics.checkNotNullParameter(buffer4, "buffer");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        buffer4.append((CharSequence) "[");
                        int length4 = fArr.length;
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < length4) {
                            float f10 = fArr[i21];
                            int i23 = i22 + 1;
                            if (i23 > 1) {
                                buffer4.append((CharSequence) ",");
                            }
                            buffer4.append((CharSequence) String.valueOf(f10));
                            i21++;
                            i22 = i23;
                        }
                        buffer4.append((CharSequence) "]");
                        B = buffer4.toString();
                        Intrinsics.checkNotNullExpressionValue(B, "toString(...)");
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        Intrinsics.checkNotNullParameter(dArr, "<this>");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        StringBuilder buffer5 = new StringBuilder();
                        Intrinsics.checkNotNullParameter(dArr, "<this>");
                        Intrinsics.checkNotNullParameter(buffer5, "buffer");
                        Intrinsics.checkNotNullParameter(",", "separator");
                        Intrinsics.checkNotNullParameter("[", "prefix");
                        Intrinsics.checkNotNullParameter("]", "postfix");
                        Intrinsics.checkNotNullParameter("...", "truncated");
                        buffer5.append((CharSequence) "[");
                        int length5 = dArr.length;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < length5) {
                            double d10 = dArr[i24];
                            int i26 = i25 + 1;
                            if (i26 > 1) {
                                buffer5.append((CharSequence) ",");
                            }
                            buffer5.append((CharSequence) String.valueOf(d10));
                            i24++;
                            i25 = i26;
                        }
                        buffer5.append((CharSequence) "]");
                        B = buffer5.toString();
                        Intrinsics.checkNotNullExpressionValue(B, "toString(...)");
                    } else if (obj instanceof char[]) {
                        str = new String((char[]) obj);
                    } else if (obj instanceof Object[]) {
                        B = v.u((Object[]) obj, ",", "[", "]", 56);
                    } else if (obj instanceof Collection) {
                        B = g0.B((Iterable) obj, ",", "[", "]", null, 56);
                    } else {
                        throw new zzt(4, 5, null);
                    }
                    B = str;
                }
                zzblVar.zzc().zzf(i10, B);
                return;
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
