package k1;

import c2.l1;
import g1.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.t;
import x.y0;

/* loaded from: classes.dex */
public final class c extends n implements b, l1, a {

    /* renamed from: n, reason: collision with root package name */
    public final d f21890n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21891o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f21892p;

    public c(d dVar, Function1 function1) {
        this.f21890n = dVar;
        this.f21892p = function1;
        dVar.f21893a = this;
    }

    @Override // c2.s
    public final void K() {
        Q0();
    }

    public final void Q0() {
        this.f21891o = false;
        this.f21890n.f21894b = null;
        c2.g.s(this);
    }

    @Override // k1.a
    public final w2.b b() {
        return c2.g.y(this).f1417r;
    }

    @Override // k1.a
    public final long d() {
        return hl.f.i1(c2.g.x(this, 128).f31c);
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        boolean z10 = this.f21891o;
        d dVar = this.f21890n;
        if (!z10) {
            dVar.f21894b = null;
            c2.g.w(this, new y0(9, this, dVar));
            if (dVar.f21894b != null) {
                this.f21891o = true;
            } else {
                t.D0("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
        }
        g gVar = dVar.f21894b;
        Intrinsics.c(gVar);
        gVar.f21896a.invoke(eVar);
    }

    @Override // k1.a
    public final w2.k getLayoutDirection() {
        return c2.g.y(this).f1418s;
    }

    @Override // c2.l1
    public final void j0() {
        Q0();
    }
}
