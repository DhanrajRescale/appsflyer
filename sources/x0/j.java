package x0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import vt.t;
import vt.v;

/* loaded from: classes.dex */
public final class j extends c implements w0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f39818c = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f39819b;

    public j(Object[] objArr) {
        this.f39819b = objArr;
        int length = objArr.length;
    }

    @Override // w0.c
    public final w0.c a(b bVar) {
        Object[] objArr = this.f39819b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, size)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f39818c;
        }
        return new j(t.j(0, length, objArr2));
    }

    @Override // java.util.List, w0.c
    public final w0.c add(int i10, Object obj) {
        Object[] objArr = this.f39819b;
        al.d.W(i10, objArr.length);
        if (i10 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            t.h(objArr, objArr2, 0, i10, 6);
            t.f(objArr, i10 + 1, objArr2, i10, objArr.length);
            objArr2[i10] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        t.f(objArr, i10 + 1, copyOf, i10, objArr.length - 1);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArr.length + 1, 0, copyOf, objArr3);
    }

    @Override // x0.c, java.util.Collection, java.util.List, w0.c
    public final w0.c addAll(Collection collection) {
        Object[] objArr = this.f39819b;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new j(copyOf);
        }
        f l10 = l();
        l10.addAll(collection);
        return l10.g();
    }

    @Override // vt.b
    public final int b() {
        return this.f39819b.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        al.d.U(i10, b());
        return this.f39819b[i10];
    }

    @Override // vt.d, java.util.List
    public final int indexOf(Object obj) {
        return v.t(this.f39819b, obj);
    }

    @Override // w0.c
    public final w0.c j(int i10) {
        Object[] objArr = this.f39819b;
        al.d.U(i10, objArr.length);
        if (objArr.length == 1) {
            return f39818c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        t.f(objArr, i10, copyOf, i10 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // w0.c
    public final f l() {
        return new f(this, null, this.f39819b, 0);
    }

    @Override // vt.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f39819b;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (Intrinsics.a(obj, objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // vt.d, java.util.List
    public final ListIterator listIterator(int i10) {
        al.d.W(i10, b());
        return new d(this.f39819b, i10, b());
    }

    @Override // vt.d, java.util.List
    public final w0.c set(int i10, Object obj) {
        al.d.U(i10, b());
        Object[] objArr = this.f39819b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i10] = obj;
        return new j(copyOf);
    }

    @Override // java.util.Collection, java.util.List, w0.c
    public final w0.c add(Object obj) {
        Object[] objArr = this.f39819b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = obj;
            return new j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr.length + 1, 0, objArr, objArr2);
    }
}
