package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f26288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.l f26290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.j1 f26291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f26293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f26294g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(g1.o oVar, boolean z10, a0.l lVar, x.j1 j1Var, boolean z11, Function0 function0, hu.c cVar) {
        super(2);
        this.f26288a = oVar;
        this.f26289b = z10;
        this.f26290c = lVar;
        this.f26291d = j1Var;
        this.f26292e = z11;
        this.f26293f = function0;
        this.f26294g = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        boolean z10 = this.f26289b;
        boolean z11 = this.f26292e;
        g1.o e10 = androidx.compose.foundation.layout.d.e(d2.w0.s(this.f26288a, androidx.compose.foundation.a.l(z11, this.f26290c, this.f26291d, new androidx.compose.foundation.selection.a(z10, z11, new h2.g(4), this.f26293f, 0))), 1.0f);
        g1.e eVar = g1.a.f16392n;
        b0.g gVar = b0.n.f2939e;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        b0.l1 a10 = b0.y.a(gVar, eVar, rVar2, 54);
        rVar2.b0(-1323940314);
        int i10 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(e10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, a10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar2, i10, iVar);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            this.f26294g.b(b0.a0.f2818a, rVar2, 6);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
