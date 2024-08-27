package kotlin.text;

import iu.c0;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class s extends r {
    public static boolean i(String str, String suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z10) {
            return str.endsWith(suffix);
        }
        return l(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean j(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static Comparator k(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean l(int i10, int i11, int i12, String str, String other, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z10) {
            return str.regionMatches(i10, other, i11, i12);
        }
        return str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String m(int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            int i11 = 1;
            if (i10 != 1) {
                int length = str.length();
                if (length == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (length != 1) {
                    StringBuilder sb2 = new StringBuilder(str.length() * i10);
                    if (1 <= i10) {
                        while (true) {
                            sb2.append((CharSequence) str);
                            if (i11 == i10) {
                                break;
                            }
                            i11++;
                        }
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.c(sb3);
                    return sb3;
                }
                char charAt = str.charAt(0);
                char[] cArr = new char[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    cArr[i12] = charAt;
                }
                return new String(cArr);
            }
            return str.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
    }

    public static String n(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int x10 = w.x(0, str, oldValue, z10);
        if (x10 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i11 = 1;
        if (length >= 1) {
            i11 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, x10);
                sb2.append(newValue);
                i10 = x10 + length;
                if (x10 >= str.length()) {
                    break;
                }
                x10 = w.x(x10 + i11, str, oldValue, z10);
            } while (x10 > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static String o(String str, char c10, char c11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = str.replace(c10, c11);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    public static boolean q(int i10, String str, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix, i10);
        }
        return l(i10, 0, prefix.length(), str, prefix, z10);
    }

    public static boolean r(String str, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix);
        }
        return l(0, 0, prefix.length(), str, prefix, z10);
    }
}
