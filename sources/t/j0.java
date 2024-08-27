package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f34871a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f34872b;

    /* renamed from: c, reason: collision with root package name */
    public int f34873c;

    public j0() {
        this(0);
    }

    public final int a(Object obj) {
        int i10 = this.f34873c * 2;
        Object[] objArr = this.f34872b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.a(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f34873c;
        int[] iArr = this.f34871a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34871a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f34872b, i10 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f34872b = copyOf2;
        }
        if (this.f34873c == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f34873c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = u.a.a(i11, i10, this.f34871a);
        if (a10 < 0) {
            return a10;
        }
        if (Intrinsics.a(obj, this.f34872b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f34871a[i12] == i10) {
            if (Intrinsics.a(obj, this.f34872b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.f34871a[i13] == i10; i13--) {
            if (Intrinsics.a(obj, this.f34872b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f34873c > 0) {
            this.f34871a = u.a.f36599a;
            this.f34872b = u.a.f36601c;
            this.f34873c = 0;
        }
        if (this.f34873c <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f34873c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = u.a.a(i10, 0, this.f34871a);
        if (a10 < 0) {
            return a10;
        }
        if (this.f34872b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f34871a[i11] == 0) {
            if (this.f34872b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f34871a[i12] == 0; i12--) {
            if (this.f34872b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j0) {
                int i10 = this.f34873c;
                if (i10 != ((j0) obj).f34873c) {
                    return false;
                }
                j0 j0Var = (j0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object f10 = f(i11);
                    Object j10 = j(i11);
                    Object obj2 = j0Var.get(f10);
                    if (j10 == null) {
                        if (obj2 != null || !j0Var.containsKey(f10)) {
                            return false;
                        }
                    } else if (!Intrinsics.a(j10, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f34873c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f34873c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f11 = f(i13);
                Object j11 = j(i13);
                Object obj3 = ((Map) obj).get(f11);
                if (j11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f11)) {
                        return false;
                    }
                } else if (!Intrinsics.a(j11, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        if (i10 >= 0 && i10 < this.f34873c) {
            return this.f34872b[i10 << 1];
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public void g(f map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.f34873c;
        b(this.f34873c + i10);
        if (this.f34873c == 0) {
            if (i10 > 0) {
                vt.t.c(0, 0, i10, map.f34871a, this.f34871a);
                vt.t.f(map.f34872b, 0, this.f34872b, 0, i10 << 1);
                this.f34873c = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(map.f(i11), map.j(i11));
        }
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f34872b[(d10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f34872b[(d10 << 1) + 1];
        }
        return obj2;
    }

    public Object h(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f34873c)) {
            Object[] objArr = this.f34872b;
            int i12 = i10 << 1;
            Object obj = objArr[i12 + 1];
            if (i11 <= 1) {
                clear();
            } else {
                int i13 = i11 - 1;
                int[] iArr = this.f34871a;
                int i14 = 8;
                if (iArr.length > 8 && i11 < iArr.length / 3) {
                    if (i11 > 8) {
                        i14 = i11 + (i11 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i14);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.f34871a = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.f34872b, i14 << 1);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                    this.f34872b = copyOf2;
                    if (i11 == this.f34873c) {
                        if (i10 > 0) {
                            vt.t.c(0, 0, i10, iArr, this.f34871a);
                            vt.t.f(objArr, 0, this.f34872b, 0, i12);
                        }
                        if (i10 < i13) {
                            int i15 = i10 + 1;
                            vt.t.c(i10, i15, i11, iArr, this.f34871a);
                            vt.t.f(objArr, i12, this.f34872b, i15 << 1, i11 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i10 < i13) {
                        int i16 = i10 + 1;
                        vt.t.c(i10, i16, i11, iArr, iArr);
                        Object[] objArr2 = this.f34872b;
                        vt.t.f(objArr2, i12, objArr2, i16 << 1, i11 << 1);
                    }
                    Object[] objArr3 = this.f34872b;
                    int i17 = i13 << 1;
                    objArr3[i17] = null;
                    objArr3[i17 + 1] = null;
                }
                if (i11 == this.f34873c) {
                    this.f34873c = i13;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public int hashCode() {
        int i10;
        int[] iArr = this.f34871a;
        Object[] objArr = this.f34872b;
        int i11 = this.f34873c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public Object i(int i10, Object obj) {
        if (i10 >= 0 && i10 < this.f34873c) {
            int i11 = (i10 << 1) + 1;
            Object[] objArr = this.f34872b;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final boolean isEmpty() {
        return this.f34873c <= 0;
    }

    public final Object j(int i10) {
        if (i10 >= 0 && i10 < this.f34873c) {
            return this.f34872b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int e10;
        int i11 = this.f34873c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (obj != null) {
            e10 = c(i10, obj);
        } else {
            e10 = e();
        }
        if (e10 >= 0) {
            int i12 = (e10 << 1) + 1;
            Object[] objArr = this.f34872b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~e10;
        int[] iArr = this.f34871a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34871a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f34872b, i14 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f34872b = copyOf2;
            if (i11 != this.f34873c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f34871a;
            int i15 = i13 + 1;
            vt.t.c(i15, i13, i11, iArr2, iArr2);
            Object[] objArr2 = this.f34872b;
            vt.t.f(objArr2, i15 << 1, objArr2, i13 << 1, this.f34873c << 1);
        }
        int i16 = this.f34873c;
        if (i11 == i16) {
            int[] iArr3 = this.f34871a;
            if (i13 < iArr3.length) {
                iArr3[i13] = i10;
                Object[] objArr3 = this.f34872b;
                int i17 = i13 << 1;
                objArr3[i17] = obj;
                objArr3[i17 + 1] = obj2;
                this.f34873c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return i(d10, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f34873c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34873c * 28);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        int i10 = this.f34873c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object f10 = f(i11);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j10 = j(i11);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public j0(int i10) {
        this.f34871a = i10 == 0 ? u.a.f36599a : new int[i10];
        this.f34872b = i10 == 0 ? u.a.f36601c : new Object[i10 << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.a(obj2, j(d10))) {
            return false;
        }
        h(d10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.a(obj2, j(d10))) {
            return false;
        }
        i(d10, obj3);
        return true;
    }
}
