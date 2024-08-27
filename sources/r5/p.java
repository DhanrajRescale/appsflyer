package r5;

import b5.g1;
import b5.h1;
import b5.i1;

/* loaded from: classes.dex */
public final class p extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f33257e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f33258c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33259d;

    public p(i1 i1Var, Object obj, Object obj2) {
        super(i1Var);
        this.f33258c = obj;
        this.f33259d = obj2;
    }

    @Override // r5.l, b5.i1
    public final int b(Object obj) {
        Object obj2;
        if (f33257e.equals(obj) && (obj2 = this.f33259d) != null) {
            obj = obj2;
        }
        return this.f33206b.b(obj);
    }

    @Override // r5.l, b5.i1
    public final g1 g(int i10, g1 g1Var, boolean z10) {
        this.f33206b.g(i10, g1Var, z10);
        if (e5.x.a(g1Var.f3317b, this.f33259d) && z10) {
            g1Var.f3317b = f33257e;
        }
        return g1Var;
    }

    @Override // r5.l, b5.i1
    public final Object m(int i10) {
        Object m10 = this.f33206b.m(i10);
        if (e5.x.a(m10, this.f33259d)) {
            return f33257e;
        }
        return m10;
    }

    @Override // r5.l, b5.i1
    public final h1 n(int i10, h1 h1Var, long j10) {
        this.f33206b.n(i10, h1Var, j10);
        if (e5.x.a(h1Var.f3332a, this.f33258c)) {
            h1Var.f3332a = h1.f3323r;
        }
        return h1Var;
    }
}
