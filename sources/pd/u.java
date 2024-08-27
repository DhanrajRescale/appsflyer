package pd;

import d2.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f30956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.l f30957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f30958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f30959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.s f30960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h7.b f30961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h7.b f30962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h7.b f30963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f30964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f30965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(g1 g1Var, b3.l lVar, l lVar2, d3 d3Var, e1.s sVar, h7.b bVar, h7.b bVar2, h7.b bVar3, g1 g1Var2, g1 g1Var3, int i10) {
        super(2);
        this.f30955a = i10;
        this.f30956b = g1Var;
        this.f30957c = lVar;
        this.f30959e = d3Var;
        this.f30960f = sVar;
        this.f30961g = bVar;
        this.f30962h = bVar2;
        this.f30963i = bVar3;
        this.f30964j = g1Var2;
        this.f30965k = g1Var3;
    }

    public final void a(t0.n nVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj = t0.m.f35080a;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f30955a;
        g1 g1Var = this.f30965k;
        e1.s sVar = this.f30960f;
        d3 d3Var = this.f30959e;
        g1 g1Var2 = this.f30964j;
        b3.l lVar2 = this.f30957c;
        g1 g1Var3 = this.f30956b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1Var3.setValue(Unit.f23355a);
                lVar2.getClass();
                lVar2.f3123a.f15909e.clear();
                lVar2.f3130c = 0;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-798026832);
                t9.c cVar = lVar2.f3129b;
                if (cVar == null) {
                    cVar = new t9.c(lVar2, 9);
                    lVar2.f3129b = cVar;
                }
                Object obj2 = cVar.f35633b;
                b3.e c10 = ((b3.l) obj2).c();
                b3.e c11 = ((b3.l) obj2).c();
                b3.e c12 = ((b3.l) obj2).c();
                b3.e c13 = ((b3.l) obj2).c();
                g1.o b10 = b3.l.b(lVar, c10, h.f30896h);
                String str = (String) g1Var2.getValue();
                rVar2.b0(112819778);
                boolean h10 = rVar2.h(d3Var);
                Object Q = rVar2.Q();
                if (!h10 && Q != obj) {
                    z10 = false;
                } else {
                    z10 = false;
                    Q = new r(d3Var, g1Var2, 0);
                    rVar2.k0(Q);
                }
                rVar2.s(z10);
                yk.j.e0(b10, str, (Function1) Q, rVar2, 0, 0);
                rVar2.b0(112834552);
                boolean h11 = rVar2.h(c10);
                Object Q2 = rVar2.Q();
                if (h11 || Q2 == obj) {
                    Q2 = new i(c10, 2);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                g1.o b11 = b3.l.b(lVar, c11, (Function1) Q2);
                e1.s sVar2 = this.f30960f;
                rVar2.b0(112847381);
                Object Q3 = rVar2.Q();
                if (Q3 == obj) {
                    Q3 = new s(sVar, 0);
                    rVar2.k0(Q3);
                }
                rVar2.s(false);
                yk.j.M(b11, sVar2, (Function1) Q3, rVar2, 432, 0);
                rVar2.b0(112857791);
                boolean h12 = rVar2.h(c11) | rVar2.h(c13);
                Object Q4 = rVar2.Q();
                if (!h12 && Q4 != obj) {
                    z11 = false;
                } else {
                    z11 = false;
                    Q4 = new t(c11, c13, 0);
                    rVar2.k0(Q4);
                }
                rVar2.s(z11);
                g1.o b12 = b3.l.b(lVar, c12, (Function1) Q4);
                String str2 = (String) g1Var2.getValue();
                h7.b bVar = this.f30961g;
                h7.b bVar2 = this.f30962h;
                h7.b bVar3 = this.f30963i;
                e1.s sVar3 = this.f30960f;
                rVar2.b0(112886313);
                Object Q5 = rVar2.Q();
                if (Q5 == obj) {
                    z12 = true;
                    Q5 = new o(sVar, 1);
                    rVar2.k0(Q5);
                } else {
                    z12 = true;
                }
                rVar2.s(false);
                yk.j.F(b12, str2, bVar, bVar2, bVar3, sVar3, (Function2) Q5, rVar2, 1806848, 0);
                float f10 = 16;
                g1.o b13 = b3.l.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f), c13, h.f30897i);
                if (sVar.size() > 0) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                rVar2.b0(112918921);
                Object Q6 = rVar2.Q();
                if (Q6 == obj) {
                    Q6 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 10, rVar2);
                }
                rVar2.s(false);
                yk.j.a0(b13, z13, false, (Function0) Q6, rVar2, 3072, 4);
                rVar2.s(false);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1Var3.setValue(Unit.f23355a);
                lVar2.getClass();
                lVar2.f3123a.f15909e.clear();
                lVar2.f3130c = 0;
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(1255487194);
                t9.c cVar2 = lVar2.f3129b;
                if (cVar2 == null) {
                    cVar2 = new t9.c(lVar2, 9);
                    lVar2.f3129b = cVar2;
                }
                Object obj3 = cVar2.f35633b;
                b3.e c14 = ((b3.l) obj3).c();
                b3.e c15 = ((b3.l) obj3).c();
                b3.e c16 = ((b3.l) obj3).c();
                b3.e c17 = ((b3.l) obj3).c();
                g1.o b14 = b3.l.b(lVar, c14, wd.d.f39020e);
                String str3 = (String) g1Var2.getValue();
                rVar4.b0(-1899152091);
                boolean h13 = rVar4.h(d3Var);
                Object Q7 = rVar4.Q();
                if (h13 || Q7 == obj) {
                    Q7 = new r(d3Var, g1Var2, 1);
                    rVar4.k0(Q7);
                }
                rVar4.s(false);
                yk.j.e0(b14, str3, (Function1) Q7, rVar4, 0, 0);
                rVar4.b0(-1899141305);
                boolean h14 = rVar4.h(c14);
                Object Q8 = rVar4.Q();
                if (h14 || Q8 == obj) {
                    Q8 = new i(c14, 3);
                    rVar4.k0(Q8);
                }
                rVar4.s(false);
                g1.o b15 = b3.l.b(lVar, c15, (Function1) Q8);
                e1.s sVar4 = this.f30960f;
                rVar4.b0(-1899129468);
                Object Q9 = rVar4.Q();
                if (Q9 == obj) {
                    Q9 = new s(sVar, 1);
                    rVar4.k0(Q9);
                }
                rVar4.s(false);
                yk.j.M(b15, sVar4, (Function1) Q9, rVar4, 432, 0);
                rVar4.b0(-1899122146);
                boolean h15 = rVar4.h(c15) | rVar4.h(c17);
                Object Q10 = rVar4.Q();
                if (h15 || Q10 == obj) {
                    Q10 = new t(c15, c17, 1);
                    rVar4.k0(Q10);
                }
                rVar4.s(false);
                g1.o b16 = b3.l.b(lVar, c16, (Function1) Q10);
                String str4 = (String) g1Var2.getValue();
                h7.b bVar4 = this.f30961g;
                h7.b bVar5 = this.f30962h;
                h7.b bVar6 = this.f30963i;
                e1.s sVar5 = this.f30960f;
                rVar4.b0(-1899095112);
                Object Q11 = rVar4.Q();
                if (Q11 == obj) {
                    Q11 = new o(sVar, 2);
                    rVar4.k0(Q11);
                }
                rVar4.s(false);
                yk.j.F(b16, str4, bVar4, bVar5, bVar6, sVar5, (Function2) Q11, rVar4, 1806848, 0);
                float f11 = 16;
                g1.o b17 = b3.l.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f11, s0.g.f34069a, f11, s0.g.f34069a, 10), 1.0f), c17, wd.d.f39021f);
                if (sVar.size() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                rVar4.b0(-1899063460);
                Object Q12 = rVar4.Q();
                if (Q12 == obj) {
                    Q12 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 13, rVar4);
                }
                rVar4.s(false);
                yk.j.a0(b17, z14, true, (Function0) Q12, rVar4, 3456, 0);
                rVar4.s(false);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30955a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
