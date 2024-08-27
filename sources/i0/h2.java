package i0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h2 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f18945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f18947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.v f18950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b3 f18951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f18952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18953i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(q1 q1Var, l0.v0 v0Var, p2.c0 c0Var, boolean z10, boolean z11, p2.v vVar, b3 b3Var, h0 h0Var, int i10) {
        super(3);
        this.f18945a = q1Var;
        this.f18946b = v0Var;
        this.f18947c = c0Var;
        this.f18948d = z10;
        this.f18949e = z11;
        this.f18950f = vVar;
        this.f18951g = b3Var;
        this.f18952h = h0Var;
        this.f18953i = i10;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        Object g10 = v.e.g(rVar, 851809892, -1205063114);
        to.e eVar = t0.m.f35080a;
        if (g10 == eVar) {
            g10 = new Object();
            rVar.k0(g10);
        }
        l0.a1 a1Var = (l0.a1) g10;
        Object h10 = v.e.h(rVar, false, -1205063050);
        if (h10 == eVar) {
            h10 = new Object();
            rVar.k0(h10);
        }
        rVar.s(false);
        f2 f2Var = new f2(this.f18945a, this.f18946b, this.f18947c, this.f18948d, this.f18949e, a1Var, this.f18950f, this.f18951g, (w0) h10, this.f18952h, this.f18953i);
        rVar.b0(-1205062570);
        boolean j10 = rVar.j(f2Var);
        Object Q = rVar.Q();
        if (!j10 && Q != eVar) {
            z10 = false;
        } else {
            z10 = false;
            Q = new g2(f2Var, 0);
            rVar.k0(Q);
        }
        rVar.s(z10);
        g1.o c10 = androidx.compose.ui.input.key.a.c((Function1) ((ou.c) Q));
        rVar.s(z10);
        return c10;
    }
}
