package n2;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o2.j;
import o2.k;
import vt.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f28230a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f28231b;

    /* renamed from: c, reason: collision with root package name */
    public int f28232c;

    public final Object a(Object obj) {
        int b10;
        if (obj == null) {
            b10 = c();
        } else {
            b10 = b(obj.hashCode(), obj);
        }
        if (b10 >= 0) {
            return this.f28231b[(b10 << 1) + 1];
        }
        return null;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f28232c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = a.a(i11, i10, this.f28230a);
        if (a10 < 0) {
            return a10;
        }
        if (Intrinsics.a(obj, this.f28231b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f28230a[i12] == i10) {
            if (Intrinsics.a(obj, this.f28231b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.f28230a[i13] == i10; i13--) {
            if (Intrinsics.a(obj, this.f28231b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c() {
        int i10 = this.f28232c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = a.a(i10, 0, this.f28230a);
        if (a10 < 0) {
            return a10;
        }
        if (this.f28231b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f28230a[i11] == 0) {
            if (this.f28231b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f28230a[i12] == 0; i12--) {
            if (this.f28231b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object d(k kVar, j jVar) {
        int hashCode;
        int b10;
        int i10 = this.f28232c;
        if (kVar == null) {
            b10 = c();
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
            b10 = b(hashCode, kVar);
        }
        if (b10 >= 0) {
            int i11 = (b10 << 1) + 1;
            Object[] objArr = this.f28231b;
            Object obj = objArr[i11];
            objArr[i11] = jVar;
            return obj;
        }
        int i12 = ~b10;
        int[] iArr = this.f28230a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f28230a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f28231b, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f28231b = copyOf2;
            if (i10 != this.f28232c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f28230a;
            int i14 = i12 + 1;
            t.c(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f28231b;
            t.f(objArr2, i14 << 1, objArr2, i12 << 1, this.f28232c << 1);
        }
        int i15 = this.f28232c;
        if (i10 == i15) {
            int[] iArr3 = this.f28230a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.f28231b;
                int i16 = i12 << 1;
                objArr3[i16] = kVar;
                objArr3[i16 + 1] = jVar;
                this.f28232c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        int b10;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f28232c;
                if (i10 != cVar.f28232c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr = this.f28231b;
                    int i12 = i11 << 1;
                    Object obj2 = objArr[i12];
                    Object obj3 = objArr[i12 + 1];
                    Object a10 = cVar.a(obj2);
                    if (obj3 == null) {
                        if (a10 == null) {
                            if (obj2 == null) {
                                b10 = cVar.c();
                            } else {
                                b10 = cVar.b(obj2.hashCode(), obj2);
                            }
                            if (b10 >= 0) {
                            }
                        }
                        return false;
                    }
                    if (!Intrinsics.a(obj3, a10)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f28232c != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f28232c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object[] objArr2 = this.f28231b;
                int i15 = i14 << 1;
                Object obj4 = objArr2[i15];
                Object obj5 = objArr2[i15 + 1];
                Object obj6 = ((Map) obj).get(obj4);
                if (obj5 == null) {
                    if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                        return false;
                    }
                } else if (!Intrinsics.a(obj5, obj6)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int[] iArr = this.f28230a;
        Object[] objArr = this.f28231b;
        int i11 = this.f28232c;
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

    public final String toString() {
        int i10 = this.f28232c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        int i11 = this.f28232c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f28231b[i13];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f28231b[i13 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        return sb2.toString();
    }
}
