package v0;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import vt.t;
import vt.y;

/* loaded from: classes.dex */
public final class h implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f37653a;

    /* renamed from: b, reason: collision with root package name */
    public e f37654b;

    /* renamed from: c, reason: collision with root package name */
    public int f37655c = 0;

    public h(Object[] objArr) {
        this.f37653a = objArr;
    }

    public final void a(int i10, Object obj) {
        i(this.f37655c + 1);
        Object[] objArr = this.f37653a;
        int i11 = this.f37655c;
        if (i10 != i11) {
            t.f(objArr, i10 + 1, objArr, i10, i11);
        }
        objArr[i10] = obj;
        this.f37655c++;
    }

    public final void b(Object obj) {
        i(this.f37655c + 1);
        Object[] objArr = this.f37653a;
        int i10 = this.f37655c;
        objArr[i10] = obj;
        this.f37655c = i10 + 1;
    }

    public final void c(int i10, h hVar) {
        if (hVar.k()) {
            return;
        }
        i(this.f37655c + hVar.f37655c);
        Object[] objArr = this.f37653a;
        int i11 = this.f37655c;
        if (i10 != i11) {
            t.f(objArr, hVar.f37655c + i10, objArr, i10, i11);
        }
        t.f(hVar.f37653a, i10, objArr, 0, hVar.f37655c);
        this.f37655c += hVar.f37655c;
    }

    public final boolean d(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f37655c);
        Object[] objArr = this.f37653a;
        if (i10 != this.f37655c) {
            t.f(objArr, collection.size() + i10, objArr, i10, this.f37655c);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                objArr[i11 + i10] = obj;
                i11 = i12;
            } else {
                y.j();
                throw null;
            }
        }
        this.f37655c = collection.size() + this.f37655c;
        return true;
    }

    public final List e() {
        e eVar = this.f37654b;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f37654b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final void g() {
        Object[] objArr = this.f37653a;
        int i10 = this.f37655c;
        while (true) {
            i10--;
            if (-1 < i10) {
                objArr[i10] = null;
            } else {
                this.f37655c = 0;
                return;
            }
        }
    }

    public final boolean h(Object obj) {
        int i10 = this.f37655c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !Intrinsics.a(this.f37653a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i10) {
        Object[] objArr = this.f37653a;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f37653a = copyOf;
        }
    }

    public final int j(Object obj) {
        int i10 = this.f37655c;
        if (i10 > 0) {
            Object[] objArr = this.f37653a;
            int i11 = 0;
            while (!Intrinsics.a(obj, objArr[i11])) {
                i11++;
                if (i11 >= i10) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean k() {
        return this.f37655c == 0;
    }

    public final boolean l() {
        return this.f37655c != 0;
    }

    public final boolean m(Object obj) {
        int j10 = j(obj);
        if (j10 >= 0) {
            n(j10);
            return true;
        }
        return false;
    }

    public final Object n(int i10) {
        Object[] objArr = this.f37653a;
        Object obj = objArr[i10];
        int i11 = this.f37655c;
        if (i10 != i11 - 1) {
            t.f(objArr, i10, objArr, i10 + 1, i11);
        }
        int i12 = this.f37655c - 1;
        this.f37655c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void o(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f37655c;
            if (i11 < i12) {
                Object[] objArr = this.f37653a;
                t.f(objArr, i10, objArr, i11, i12);
            }
            int i13 = this.f37655c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f37653a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f37655c = i14;
        }
    }

    public final Object p(int i10, Object obj) {
        Object[] objArr = this.f37653a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
