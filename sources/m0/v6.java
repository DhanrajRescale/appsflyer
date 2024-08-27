package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v6 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f26970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f26971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f26973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.d0 f26974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(g1.o oVar, n1.x0 x0Var, long j10, float f10, x.d0 d0Var, float f11, Function2 function2, int i10) {
        super(2);
        this.f26969a = i10;
        this.f26970b = oVar;
        this.f26971c = x0Var;
        this.f26972d = j10;
        this.f26973e = f10;
        this.f26974f = d0Var;
        this.f26975g = f11;
        this.f26976h = function2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [au.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [au.i, kotlin.jvm.functions.Function2] */
    public final void a(t0.n nVar, int i10) {
        g1.g gVar = g1.a.f16379a;
        float f10 = this.f26973e;
        long j10 = this.f26972d;
        int i11 = this.f26969a;
        Function2 function2 = this.f26976h;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                g1.o a10 = x1.h0.a(h2.l.a(pp.b.o(this.f26970b, this.f26971c, pp.b.p(j10, (t2) rVar2.m(u2.f26875a), f10, rVar2), this.f26974f, this.f26975g), false, l.f26436i), Unit.f23355a, new au.i(2, null));
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(gVar, true, rVar2, 48);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(a10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, c10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    v.e.w(rVar2, j11, rVar2, 0, 2058660585);
                    function2.invoke(rVar2, 0);
                    rVar2.s(false);
                    rVar2.s(true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.r rVar4 = (t0.r) nVar;
                g1.o a11 = x1.h0.a(h2.l.a(r0.c3.c(this.f26970b, this.f26971c, r0.c3.d(j10, f10, nVar), this.f26974f, ((w2.b) rVar4.m(d2.s1.f13620e)).c0(this.f26975g)), false, r0.d0.f32365h), Unit.f23355a, new au.i(2, null));
                rVar4.b0(733328855);
                b0.v c11 = b0.s.c(gVar, true, rVar4, 48);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                t0.r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j12 = androidx.compose.ui.layout.a.j(a11);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, c11, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar2);
                    }
                    v.e.w(rVar4, j12, rVar4, 0, 2058660585);
                    function2.invoke(rVar4, 0);
                    rVar4.s(false);
                    rVar4.s(true);
                    rVar4.s(false);
                    rVar4.s(false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26969a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
