package bv;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f7323b;

    /* renamed from: a, reason: collision with root package name */
    public final m f7324a;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f7323b = separator;
    }

    public b0(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f7324a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a10 = cv.c.a(this);
        m mVar = this.f7324a;
        if (a10 == -1) {
            a10 = 0;
        } else if (a10 < mVar.d() && mVar.i(a10) == 92) {
            a10++;
        }
        int d10 = mVar.d();
        int i10 = a10;
        while (a10 < d10) {
            if (mVar.i(a10) == 47 || mVar.i(a10) == 92) {
                arrayList.add(mVar.n(i10, a10));
                i10 = a10 + 1;
            }
            a10++;
        }
        if (i10 < mVar.d()) {
            arrayList.add(mVar.n(i10, mVar.d()));
        }
        return arrayList;
    }

    public final b0 b() {
        m mVar = cv.c.f13084d;
        m mVar2 = this.f7324a;
        if (Intrinsics.a(mVar2, mVar)) {
            return null;
        }
        m mVar3 = cv.c.f13081a;
        if (Intrinsics.a(mVar2, mVar3)) {
            return null;
        }
        m prefix = cv.c.f13082b;
        if (Intrinsics.a(mVar2, prefix)) {
            return null;
        }
        m suffix = cv.c.f13085e;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int d10 = mVar2.d();
        byte[] bArr = suffix.f7368a;
        if (mVar2.l(d10 - bArr.length, suffix, bArr.length) && (mVar2.d() == 2 || mVar2.l(mVar2.d() - 3, mVar3, 1) || mVar2.l(mVar2.d() - 3, prefix, 1))) {
            return null;
        }
        int k10 = m.k(mVar2, mVar3);
        if (k10 == -1) {
            k10 = m.k(mVar2, prefix);
        }
        if (k10 == 2 && g() != null) {
            if (mVar2.d() == 3) {
                return null;
            }
            return new b0(m.o(mVar2, 0, 3, 1));
        }
        if (k10 == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (mVar2.l(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (k10 == -1 && g() != null) {
            if (mVar2.d() == 2) {
                return null;
            }
            return new b0(m.o(mVar2, 0, 2, 1));
        }
        if (k10 == -1) {
            return new b0(mVar);
        }
        if (k10 == 0) {
            return new b0(m.o(mVar2, 0, 1, 1));
        }
        return new b0(m.o(mVar2, 0, k10, 1));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, bv.j] */
    public final b0 c(b0 other) {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(other, "other");
        int a10 = cv.c.a(this);
        m mVar = this.f7324a;
        b0 b0Var2 = null;
        if (a10 == -1) {
            b0Var = null;
        } else {
            b0Var = new b0(mVar.n(0, a10));
        }
        other.getClass();
        int a11 = cv.c.a(other);
        m mVar2 = other.f7324a;
        if (a11 != -1) {
            b0Var2 = new b0(mVar2.n(0, a11));
        }
        if (Intrinsics.a(b0Var, b0Var2)) {
            ArrayList a12 = a();
            ArrayList a13 = other.a();
            int min = Math.min(a12.size(), a13.size());
            int i10 = 0;
            while (i10 < min && Intrinsics.a(a12.get(i10), a13.get(i10))) {
                i10++;
            }
            if (i10 == min && mVar.d() == mVar2.d()) {
                return gt.d.f(".", false);
            }
            if (a13.subList(i10, a13.size()).indexOf(cv.c.f13085e) == -1) {
                ?? obj = new Object();
                m c10 = cv.c.c(other);
                if (c10 == null && (c10 = cv.c.c(this)) == null) {
                    c10 = cv.c.f(f7323b);
                }
                int size = a13.size();
                for (int i11 = i10; i11 < size; i11++) {
                    obj.S(cv.c.f13085e);
                    obj.S(c10);
                }
                int size2 = a12.size();
                while (i10 < size2) {
                    obj.S((m) a12.get(i10));
                    obj.S(c10);
                    i10++;
                }
                return cv.c.d(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b0 other = (b0) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f7324a.compareTo(other.f7324a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.j] */
    public final b0 d(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ?? obj = new Object();
        obj.j0(child);
        return cv.c.b(this, cv.c.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f7324a.q());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b0) && Intrinsics.a(((b0) obj).f7324a, this.f7324a)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f7324a.q(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character g() {
        m mVar = cv.c.f13081a;
        m mVar2 = this.f7324a;
        if (m.g(mVar2, mVar) != -1 || mVar2.d() < 2 || mVar2.i(1) != 58) {
            return null;
        }
        char i10 = (char) mVar2.i(0);
        if (('a' > i10 || i10 >= '{') && ('A' > i10 || i10 >= '[')) {
            return null;
        }
        return Character.valueOf(i10);
    }

    public final int hashCode() {
        return this.f7324a.hashCode();
    }

    public final String toString() {
        return this.f7324a.q();
    }
}
