package x;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends g1.n implements c2.s {

    /* renamed from: n, reason: collision with root package name */
    public long f39753n;

    /* renamed from: o, reason: collision with root package name */
    public n1.p f39754o;

    /* renamed from: p, reason: collision with root package name */
    public float f39755p;

    /* renamed from: q, reason: collision with root package name */
    public n1.x0 f39756q;

    /* renamed from: r, reason: collision with root package name */
    public m1.f f39757r;

    /* renamed from: s, reason: collision with root package name */
    public w2.k f39758s;

    /* renamed from: t, reason: collision with root package name */
    public n1.o0 f39759t;

    /* renamed from: u, reason: collision with root package name */
    public n1.x0 f39760u;

    @Override // c2.s
    public final void e(p1.e eVar) {
        n1.o0 d10;
        if (this.f39756q == n1.s0.f28162a) {
            if (!n1.t.d(this.f39753n, n1.t.f28177i)) {
                p1.h.U(eVar, this.f39753n, 0L, 0L, s0.g.f34069a, null, 0, 126);
            }
            n1.p pVar = this.f39754o;
            if (pVar != null) {
                p1.h.S(eVar, pVar, 0L, 0L, this.f39755p, null, 118);
            }
        } else {
            c2.j0 j0Var = (c2.j0) eVar;
            boolean a10 = m1.f.a(j0Var.f7740a.d(), this.f39757r);
            p1.c cVar = j0Var.f7740a;
            if (a10 && j0Var.getLayoutDirection() == this.f39758s && Intrinsics.a(this.f39760u, this.f39756q)) {
                d10 = this.f39759t;
                Intrinsics.c(d10);
            } else {
                d10 = this.f39756q.d(cVar.d(), j0Var.getLayoutDirection(), eVar);
            }
            if (!n1.t.d(this.f39753n, n1.t.f28177i)) {
                androidx.compose.ui.graphics.a.p(eVar, d10, this.f39753n);
            }
            n1.p pVar2 = this.f39754o;
            if (pVar2 != null) {
                androidx.compose.ui.graphics.a.o(eVar, d10, pVar2, this.f39755p);
            }
            this.f39759t = d10;
            this.f39757r = new m1.f(cVar.d());
            this.f39758s = j0Var.getLayoutDirection();
            this.f39760u = this.f39756q;
        }
        ((c2.j0) eVar).a();
    }
}
