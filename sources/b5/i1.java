package b5;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class i1 implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f3357a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b5.f1] */
    static {
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, g1 g1Var, h1 h1Var, int i11, boolean z10) {
        int i12 = g(i10, g1Var, false).f3318c;
        if (n(i12, h1Var, 0L).f3347p == i10) {
            int e10 = e(i12, i11, z10);
            if (e10 == -1) {
                return -1;
            }
            return n(e10, h1Var, 0L).f3346o;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z10)) {
                        return a(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == c(z10)) {
            return -1;
        }
        return i10 + 1;
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (i1Var.p() != p() || i1Var.i() != i()) {
            return false;
        }
        h1 h1Var = new h1();
        g1 g1Var = new g1();
        h1 h1Var2 = new h1();
        g1 g1Var2 = new g1();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, h1Var, 0L).equals(i1Var.n(i10, h1Var2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, g1Var, true).equals(i1Var.g(i11, g1Var2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != i1Var.a(true) || (c10 = c(true)) != i1Var.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != i1Var.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public final g1 f(int i10, g1 g1Var) {
        return g(i10, g1Var, false);
    }

    public abstract g1 g(int i10, g1 g1Var, boolean z10);

    public g1 h(Object obj, g1 g1Var) {
        return g(b(obj), g1Var, true);
    }

    public final int hashCode() {
        h1 h1Var = new h1();
        g1 g1Var = new g1();
        int p10 = p() + 217;
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, h1Var, 0L).hashCode();
        }
        int i11 = i() + (p10 * 31);
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, g1Var, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            i11 = (i11 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(h1 h1Var, g1 g1Var, int i10, long j10) {
        Pair k10 = k(h1Var, g1Var, i10, j10, 0L);
        k10.getClass();
        return k10;
    }

    public final Pair k(h1 h1Var, g1 g1Var, int i10, long j10, long j11) {
        yk.j.G0(i10, p());
        n(i10, h1Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = h1Var.f3344m;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = h1Var.f3346o;
        g(i11, g1Var, false);
        while (i11 < h1Var.f3347p && g1Var.f3320e != j10) {
            int i12 = i11 + 1;
            if (g(i12, g1Var, false).f3320e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, g1Var, true);
        long j12 = j10 - g1Var.f3320e;
        long j13 = g1Var.f3319d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = g1Var.f3317b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z10)) {
                        return c(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == a(z10)) {
            return -1;
        }
        return i10 - 1;
    }

    public abstract Object m(int i10);

    public abstract h1 n(int i10, h1 h1Var, long j10);

    public final void o(int i10, h1 h1Var) {
        n(i10, h1Var, 0L);
    }

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }
}
