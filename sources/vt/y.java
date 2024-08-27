package vt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class y extends x {
    public static ArrayList c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new p(elements, true));
    }

    public static int d(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size2 = arrayList.size();
        int i10 = 0;
        if (size >= 0) {
            if (size <= size2) {
                int i11 = size - 1;
                while (i10 <= i11) {
                    int i12 = (i10 + i11) >>> 1;
                    int a10 = xt.a.a((Comparable) arrayList.get(i12), comparable);
                    if (a10 < 0) {
                        i10 = i12 + 1;
                    } else if (a10 > 0) {
                        i11 = i12 - 1;
                    } else {
                        return i12;
                    }
                }
                return -(i10 + 1);
            }
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    public static IntRange e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new kotlin.ranges.c(0, collection.size() - 1, 1);
    }

    public static int f(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            return t.b(elements);
        }
        return i0.f38321a;
    }

    public static ArrayList h(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new p(elements, true));
    }

    public static final List i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return x.a(list.get(0));
            }
            return list;
        }
        return i0.f38321a;
    }

    public static void j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
