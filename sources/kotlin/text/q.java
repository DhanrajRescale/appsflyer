package kotlin.text;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class q extends p {
    public static BigDecimal d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (!i.f23417b.c(str)) {
                return null;
            }
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (!i.f23417b.c(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (!i.f23417b.c(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
