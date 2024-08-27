package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vt.z;

/* loaded from: classes2.dex */
public class w extends s {
    public static /* synthetic */ int A(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return x(i10, charSequence, str, z10);
    }

    public static final int B(int i10, CharSequence charSequence, boolean z10, char[] chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(vt.v.v(chars), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int w10 = w(charSequence);
        if (i10 > w10) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i10);
            for (char c10 : chars) {
                if (a.a(c10, charAt, z10)) {
                    return i10;
                }
            }
            if (i10 != w10) {
                i10++;
            } else {
                return -1;
            }
        }
    }

    public static boolean C(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int D(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = w(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] chars = {c10};
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(vt.v.v(chars), i10);
            }
            int w10 = w(charSequence);
            if (i10 > w10) {
                i10 = w10;
            }
            while (-1 < i10) {
                if (a.a(chars[0], charSequence.charAt(i10), false)) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static int E(String str, String string, int i10) {
        int i11;
        if ((i10 & 2) != 0) {
            i11 = w(str);
        } else {
            i11 = 0;
        }
        int i12 = i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(str instanceof String)) {
            return y(str, string, i12, 0, false, true);
        }
        return str.lastIndexOf(string, i12);
    }

    public static final List F(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String[] delimiters = {"\r\n", "\n", "\r"};
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return pu.p.i(pu.p.g(I(charSequence, delimiters, false, 0), new v(charSequence)));
    }

    public static String G(String str, int i10) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i10);
                sb2.append((CharSequence) str);
                int length = i10 - str.length();
                int i11 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append(' ');
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(jr.h.o("Desired length ", i10, " is less than zero."));
    }

    public static String H(String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (8 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(8);
            int length = 8 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static c I(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        M(i10);
        return new c(charSequence, 0, i10, new u(vt.t.b(strArr), z10));
    }

    public static final boolean J(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!a.a(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String K(String prefix, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (Q(str, prefix)) {
            String substring = str.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static StringBuilder L(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void M(int i10) {
        if (i10 >= 0) {
        } else {
            throw new IllegalArgumentException(jr.h.n("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static final List N(int i10, CharSequence charSequence, String str, boolean z10) {
        boolean z11;
        M(i10);
        int i11 = 0;
        int x10 = x(0, charSequence, str, z10);
        if (x10 != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = 10;
            if (z11 && i10 <= 10) {
                i12 = i10;
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, x10).toString());
                i11 = str.length() + x10;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                x10 = x(i11, charSequence, str, z10);
            } while (x10 != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return vt.x.a(charSequence.toString());
    }

    public static List O(CharSequence charSequence, char[] delimiters) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        int i10 = 1;
        if (delimiters.length == 1) {
            return N(0, charSequence, String.valueOf(delimiters[0]), false);
        }
        M(0);
        c cVar = new c(charSequence, 0, 0, new t(delimiters, false));
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        vt.u uVar = new vt.u(cVar, i10);
        ArrayList arrayList = new ArrayList(z.k(uVar));
        Iterator it = uVar.iterator();
        while (it.hasNext()) {
            arrayList.add(R(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static List P(CharSequence charSequence, String[] delimiters, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        int i12 = 1;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return N(i10, charSequence, str, false);
            }
        }
        c I = I(charSequence, delimiters, false, i10);
        Intrinsics.checkNotNullParameter(I, "<this>");
        vt.u uVar = new vt.u(I, i12);
        ArrayList arrayList = new ArrayList(z.k(uVar));
        Iterator it = uVar.iterator();
        while (it.hasNext()) {
            arrayList.add(R(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean Q(CharSequence charSequence, String prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (charSequence instanceof String) {
            return s.r((String) charSequence, prefix, false);
        }
        return J(charSequence, 0, prefix, 0, prefix.length(), false);
    }

    public static final String R(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(Integer.valueOf(range.f23381a).intValue(), Integer.valueOf(range.f23382b).intValue() + 1).toString();
    }

    public static String S(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int A = A(missingDelimiterValue, delimiter, 0, false, 6);
        if (A != -1) {
            String substring = missingDelimiterValue.substring(delimiter.length() + A, missingDelimiterValue.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String T(char c10, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int D = D(str, c10, 0, 6);
        if (D != -1) {
            String substring = str.substring(D + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String U(String missingDelimiterValue, char c10) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int z10 = z(missingDelimiterValue, c10, 0, false, 6);
        if (z10 != -1) {
            String substring = missingDelimiterValue.substring(0, z10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String V(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int A = A(missingDelimiterValue, delimiter, 0, false, 6);
        if (A != -1) {
            String substring = missingDelimiterValue.substring(0, A);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String W(String missingDelimiterValue, char c10) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int D = D(missingDelimiterValue, c10, 0, 6);
        if (D != -1) {
            String substring = missingDelimiterValue.substring(0, D);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static CharSequence X(CharSequence charSequence) {
        int i10;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean b10 = CharsKt.b(charSequence.charAt(i10));
            if (!z10) {
                if (!b10) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else {
                if (!b10) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static boolean s(CharSequence charSequence, String other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (A(charSequence, other, 0, z10, 2) < 0) {
                return false;
            }
        } else if (y(charSequence, other, 0, charSequence.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean t(CharSequence charSequence, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (z(charSequence, c10, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean u(CharSequence charSequence, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() <= 0 || !a.a(charSequence.charAt(w(charSequence)), c10, false)) {
            return false;
        }
        return true;
    }

    public static boolean v(CharSequence charSequence, String suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (charSequence instanceof String) {
            return s.i((String) charSequence, suffix, false);
        }
        return J(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final int w(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int x(int i10, CharSequence charSequence, String string, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        return y(charSequence, string, i10, charSequence.length(), z10, false);
    }

    public static final int y(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.c cVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            cVar = new kotlin.ranges.c(i10, i11, 1);
        } else {
            int w10 = w(charSequence);
            if (i10 > w10) {
                i10 = w10;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            kotlin.ranges.c.INSTANCE.getClass();
            cVar = new kotlin.ranges.c(i10, i11, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = cVar.f23383c;
        int i13 = cVar.f23382b;
        int i14 = cVar.f23381a;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (!s.l(0, i14, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i14 != i13) {
                        i14 += i12;
                    }
                }
                return i14;
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            while (!J(charSequence2, 0, charSequence, i14, charSequence2.length(), z10)) {
                if (i14 != i13) {
                    i14 += i12;
                }
            }
            return i14;
        }
        return -1;
    }

    public static int z(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return B(i10, charSequence, z10, new char[]{c10});
    }
}
