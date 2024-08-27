package g7;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u3 extends v3 implements Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f17086a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17087b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17088c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17089d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17090e;

    static {
        new u3(vt.i0.f38321a, null, null, 0, 0);
    }

    public u3(List data, Integer num, Integer num2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17086a = data;
        this.f17087b = num;
        this.f17088c = num2;
        this.f17089d = i10;
        this.f17090e = i11;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
        }
        if (i11 != Integer.MIN_VALUE && i11 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.a(this.f17086a, u3Var.f17086a) && Intrinsics.a(this.f17087b, u3Var.f17087b) && Intrinsics.a(this.f17088c, u3Var.f17088c) && this.f17089d == u3Var.f17089d && this.f17090e == u3Var.f17090e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f17086a.hashCode() * 31;
        int i10 = 0;
        Object obj = this.f17087b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        Object obj2 = this.f17088c;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return Integer.hashCode(this.f17090e) + da.e.f(this.f17089d, (i11 + i10) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f17086a.listIterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f17086a;
        sb2.append(list.size());
        sb2.append("\n                    |   first Item: ");
        sb2.append(vt.g0.w(list));
        sb2.append("\n                    |   last Item: ");
        sb2.append(vt.g0.D(list));
        sb2.append("\n                    |   nextKey: ");
        sb2.append(this.f17088c);
        sb2.append("\n                    |   prevKey: ");
        sb2.append(this.f17087b);
        sb2.append("\n                    |   itemsBefore: ");
        sb2.append(this.f17089d);
        sb2.append("\n                    |   itemsAfter: ");
        sb2.append(this.f17090e);
        sb2.append("\n                    |) ");
        return kotlin.text.l.c(sb2.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(List data, Integer num, Integer num2) {
        this(data, num, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
