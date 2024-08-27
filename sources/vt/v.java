package vt;

import d4.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class v extends t {
    public static ArrayList A(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new p(objArr, false));
    }

    public static Set B(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(objArr.length));
                w(linkedHashSet, objArr);
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
            return singleton;
        }
        return k0.f38324a;
    }

    public static Sequence n(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return pu.m.c();
        }
        return new t1(objArr, 1);
    }

    public static boolean o(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (t(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList p(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    public static IntRange q(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new kotlin.ranges.c(0, iArr.length - 1, 1);
    }

    public static int r(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object s(int i10, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i10 >= 0 && i10 < objArr.length) {
            return objArr[i10];
        }
        return null;
    }

    public static int t(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (Intrinsics.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String u(Object[] objArr, String separator, String prefix, String postfix, int i10) {
        int i11;
        String truncated;
        if ((i10 & 1) != 0) {
            separator = ", ";
        }
        if ((i10 & 2) != 0) {
            prefix = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i10 & 4) != 0) {
            postfix = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append((CharSequence) prefix);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            kotlin.text.j.a(buffer, obj, null);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append((CharSequence) truncated);
        }
        buffer.append((CharSequence) postfix);
        String sb2 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static char v(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void w(HashSet destination, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
    }

    public static List x(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return z(iArr);
            }
            return x.a(Integer.valueOf(iArr[0]));
        }
        return i0.f38321a;
    }

    public static List y(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return A(objArr);
            }
            return x.a(objArr[0]);
        }
        return i0.f38321a;
    }

    public static ArrayList z(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }
}
