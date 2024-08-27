package m0;

import androidx.compose.foundation.layout.FillElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n4 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f26525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f26526c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f26527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26531h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f26532i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f26533j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(boolean z10, w4 w4Var, qu.f0 f0Var, n1.x0 x0Var, long j10, long j11, float f10, Function2 function2, long j12, hu.c cVar) {
        super(3);
        this.f26524a = z10;
        this.f26525b = w4Var;
        this.f26526c = f0Var;
        this.f26527d = x0Var;
        this.f26528e = j10;
        this.f26529f = j11;
        this.f26530g = f10;
        this.f26531h = function2;
        this.f26532i = j12;
        this.f26533j = cVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        g1.o oVar;
        boolean z11;
        int i10;
        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((t0.r) nVar).h(cVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 19) == 18) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        float g10 = w2.a.g(cVar.f1283b);
        g1.o oVar2 = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        long j10 = this.f26532i;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        int i11 = 0;
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        Function0 function0 = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(fillElement);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(function0);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar);
            }
            nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
            this.f26531h.invoke(rVar2, 0);
            rVar2.b0(-1295116908);
            w4 w4Var = this.f26525b;
            boolean j12 = rVar2.j(w4Var);
            qu.f0 f0Var = this.f26526c;
            boolean j13 = j12 | rVar2.j(f0Var);
            Object Q = rVar2.Q();
            Object obj4 = t0.m.f35080a;
            if (j13 || Q == obj4) {
                Q = new h4(i11, w4Var, f0Var);
                rVar2.k0(Q);
            }
            Function0 function02 = (Function0) Q;
            rVar2.s(false);
            Object value = w4Var.f27020b.f27121h.getValue();
            x4 x4Var = x4.f27081a;
            if (value != x4Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            v4.b(j10, function02, z10, rVar2, 0);
            v.e.y(rVar2, false, true, false, false);
            g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.s(androidx.compose.foundation.layout.b.f1281a.a(oVar2, g1.a.f16380b), s0.g.f34069a, v4.f26947c, 1), 1.0f);
            rVar2.b0(1241535654);
            y.g1 g1Var = y.g1.f40723a;
            boolean z12 = this.f26524a;
            if (z12) {
                rVar2.b0(1241535757);
                y yVar = w4Var.f27020b;
                boolean h10 = rVar2.h(yVar);
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == obj4) {
                    Q2 = new f4(yVar, g1Var);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                oVar = androidx.compose.ui.input.nestedscroll.a.a(oVar2, (w1.a) Q2, null);
            } else {
                oVar = oVar2;
            }
            rVar2.s(false);
            g1.o g11 = e10.g(oVar);
            rVar2.b0(1241536216);
            boolean j14 = rVar2.j(w4Var);
            Object Q3 = rVar2.Q();
            if (j14 || Q3 == obj4) {
                Q3 = new i4(w4Var, i11);
                rVar2.k0(Q3);
            }
            rVar2.s(false);
            g1.o p10 = androidx.compose.foundation.layout.a.p(g11, (Function1) Q3);
            y yVar2 = w4Var.f27020b;
            if (z12 && yVar2.f27120g.getValue() != x4Var) {
                z11 = true;
            } else {
                z11 = false;
            }
            g1.o l10 = androidx.compose.ui.layout.a.l(pp.b.r(p10, yVar2, g1Var, z11, false, 56), new s4(w4Var, g10));
            rVar2.b0(1241536869);
            if (z12) {
                rVar2.b0(1241536940);
                boolean j15 = rVar2.j(w4Var) | rVar2.j(f0Var);
                Object Q4 = rVar2.Q();
                if (j15 || Q4 == obj4) {
                    Q4 = new m4(i11, w4Var, f0Var);
                    rVar2.k0(Q4);
                }
                rVar2.s(false);
                oVar2 = h2.l.a(oVar2, false, (Function1) Q4);
            }
            rVar2.s(false);
            pp.b.j(l10.g(oVar2), this.f26527d, this.f26528e, this.f26529f, null, this.f26530g, b1.d.b(rVar2, 1552994302, new h0(this.f26533j, 2)), rVar2, 1572864, 16);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
