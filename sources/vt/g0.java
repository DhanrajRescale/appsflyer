package vt;

import d2.y0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lu.d;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class g0 extends f0 {
    public static /* synthetic */ void A(Iterable iterable, StringBuilder sb2, y0 y0Var, int i10) {
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        CharSequence charSequence3;
        y0 y0Var2;
        if ((i10 & 2) != 0) {
            str = ", ";
        } else {
            str = "\n";
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            charSequence = null;
        }
        if ((i10 & 8) != 0) {
            charSequence2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            charSequence2 = null;
        }
        if ((i10 & 16) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if ((i10 & 32) != 0) {
            charSequence3 = "...";
        } else {
            charSequence3 = null;
        }
        if ((i10 & 64) != 0) {
            y0Var2 = null;
        } else {
            y0Var2 = y0Var;
        }
        z(iterable, sb2, str2, charSequence, charSequence2, i12, charSequence3, y0Var2);
    }

    public static String B(Iterable iterable, String str, String str2, String str3, Function1 function1, int i10) {
        String prefix;
        String postfix;
        int i11;
        CharSequence truncated;
        Function1 function12;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i10 & 2) != 0) {
            prefix = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            prefix = str2;
        }
        if ((i10 & 4) != 0) {
            postfix = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            postfix = str3;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if ((i10 & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i10 & 32) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        z(iterable, sb2, separator, prefix, postfix, i12, truncated, function12);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static Object C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(y.f(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return nn.d.g(list, 1);
    }

    public static Comparable E(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float F(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Float G(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList H(List list, ut.d dVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(z.k(list));
        boolean z10 = false;
        for (Object obj : list) {
            boolean z11 = true;
            if (!z10 && Intrinsics.a(obj, dVar)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList I(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        d0.m(elements, arrayList2);
        return arrayList2;
    }

    public static ArrayList J(Object obj, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object K(ArrayList arrayList, d.Companion random) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            random.getClass();
            int c10 = lu.d.f25398b.c(size);
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            return arrayList.get(c10);
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if ((list instanceof Collection) && list.size() <= 1) {
            return R(list);
        }
        List T = T(list);
        Intrinsics.checkNotNullParameter(T, "<this>");
        Collections.reverse(T);
        return T;
    }

    public static List M(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return R(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Intrinsics.checkNotNullParameter(array, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return t.b(array);
        }
        List T = T(iterable);
        c0.l(T, comparator);
        return T;
    }

    public static List N(Iterable iterable, int i10) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return i0.f38321a;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return R(iterable);
                }
                if (i10 == 1) {
                    return x.a(t(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            Iterator it = iterable.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return y.i(arrayList);
        }
        throw new IllegalArgumentException(jr.h.o("Requested element count ", i10, " is less than zero.").toString());
    }

    public static byte[] O(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static void P(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static int[] Q(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List R(Iterable iterable) {
        Object next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return S(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return x.a(next);
            }
            return i0.f38321a;
        }
        return y.i(T(iterable));
    }

    public static ArrayList S(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List T(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return S((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        P(iterable, arrayList);
        return arrayList;
    }

    public static Set U(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection instanceof Collection) {
            return new LinkedHashSet(collection);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        P(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static Set V(Iterable iterable) {
        Object next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(collection.size()));
                    P(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
                return singleton;
            }
            return k0.f38324a;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        P(iterable, linkedHashSet2);
        Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 == 1) {
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                Intrinsics.checkNotNullExpressionValue(singleton2, "singleton(...)");
                return singleton2;
            }
            return linkedHashSet2;
        }
        return k0.f38324a;
    }

    public static boolean q(Iterable iterable, Object obj) {
        int i10;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            i10 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i11 >= 0) {
                        if (Intrinsics.a(obj, next)) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    } else {
                        y.j();
                        throw null;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static List r(List list, int i10) {
        ArrayList arrayList;
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return R(list);
            }
            if (list instanceof Collection) {
                int size = list.size() - i10;
                if (size <= 0) {
                    return i0.f38321a;
                }
                if (size == 1) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    if (list instanceof List) {
                        obj = C(list);
                    } else {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return x.a(obj);
                }
                arrayList = new ArrayList(size);
                if (list instanceof List) {
                    if (list instanceof RandomAccess) {
                        int size2 = list.size();
                        while (i10 < size2) {
                            arrayList.add(list.get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i11 = 0;
            for (Object obj2 : list) {
                if (i11 >= i10) {
                    arrayList.add(obj2);
                } else {
                    i11++;
                }
            }
            return y.i(arrayList);
        }
        throw new IllegalArgumentException(jr.h.o("Requested element count ", i10, " is less than zero.").toString());
    }

    public static ArrayList s(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object t(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return u((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object v(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object x(int i10, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 >= 0 && i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public static Set y(List list, List elements) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        Set U = U(list);
        Intrinsics.checkNotNullParameter(U, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (!(elements instanceof Collection)) {
            elements = R(elements);
        }
        U.retainAll(elements);
        return U;
    }

    public static final void z(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                kotlin.text.j.a(buffer, obj, function1);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }
}
