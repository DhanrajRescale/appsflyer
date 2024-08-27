package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class y extends x {
    public static String Y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return a0(length, str);
    }

    public static char Z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(w.w(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String a0(int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(0, i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(jr.h.o("Requested character count ", i10, " is less than zero.").toString());
    }

    public static String b0(int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(length - i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(jr.h.o("Requested character count ", i10, " is less than zero.").toString());
    }
}
