package r0;

import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s1 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f32701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2 f32702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f32703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f32704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f32705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f32706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f32707h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f32708i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f32709j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f32710k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f32711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hu.c f32712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(long j10, Function0 function0, z2 z2Var, g1.o oVar, float f10, Function1 function1, n1.x0 x0Var, long j11, long j12, float f11, Function2 function2, qu.f0 f0Var, hu.c cVar) {
        super(3);
        this.f32700a = j10;
        this.f32701b = function0;
        this.f32702c = z2Var;
        this.f32703d = oVar;
        this.f32704e = f10;
        this.f32705f = function1;
        this.f32706g = x0Var;
        this.f32707h = j11;
        this.f32708i = j12;
        this.f32709j = f11;
        this.f32710k = function2;
        this.f32711l = f0Var;
        this.f32712m = cVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
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
        int g10 = w2.a.g(cVar.f1283b);
        long j10 = this.f32700a;
        Function0 function0 = this.f32701b;
        z2 z2Var = this.f32702c;
        if (((a3) z2Var.f32833c.f32722g.getValue()) != a3.f32324a) {
            z10 = true;
        } else {
            z10 = false;
        }
        dp.b.z0(j10, function0, z10, nVar, 0);
        String r12 = dp.b.r1(R.string.m3c_bottom_sheet_pane_title, nVar);
        g1.o a10 = androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.s(this.f32703d, s0.g.f34069a, this.f32704e, 1), 1.0f), g1.a.f16380b);
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1482644208);
        boolean h10 = rVar2.h(r12);
        Object Q = rVar2.Q();
        Object obj4 = t0.m.f35080a;
        if (h10 || Q == obj4) {
            Q = new u(r12, 2);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        g1.o a11 = h2.l.a(a10, false, (Function1) Q);
        rVar2.b0(-1482644143);
        boolean h11 = rVar2.h(z2Var);
        Object Q2 = rVar2.Q();
        if (h11 || Q2 == obj4) {
            Q2 = new o1(z2Var, 0);
            rVar2.k0(Q2);
        }
        rVar2.s(false);
        g1.o p10 = androidx.compose.foundation.layout.a.p(a11, (Function1) Q2);
        rVar2.b0(-1482643839);
        boolean h12 = rVar2.h(z2Var);
        Object Q3 = rVar2.Q();
        y.g1 g1Var = y.g1.f40723a;
        Function1 function1 = this.f32705f;
        if (h12 || Q3 == obj4) {
            float f10 = y2.f32820a;
            Q3 = new w2(z2Var, function1);
            rVar2.k0(Q3);
        }
        rVar2.s(false);
        g1.o a12 = androidx.compose.ui.input.nestedscroll.a.a(p10, (w1.a) Q3, null);
        t tVar = z2Var.f32833c;
        q qVar = tVar.f32720e;
        boolean c10 = z2Var.c();
        if (tVar.f32726k.getValue() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        rVar2.b0(-1482643097);
        boolean h13 = rVar2.h(function1);
        Object Q4 = rVar2.Q();
        if (h13 || Q4 == obj4) {
            Q4 = new y.s1(1, function1, null);
            rVar2.k0(Q4);
        }
        rVar2.s(false);
        c3.a(androidx.compose.ui.layout.a.l(y.t0.c(a12, qVar, g1Var, c10, null, z11, (hu.c) Q4, false, 168), new c2(z2Var, g10)), this.f32706g, this.f32707h, this.f32708i, this.f32709j, s0.g.f34069a, null, b1.d.b(rVar2, 1096570852, new m0.z(this.f32710k, this.f32702c, this.f32701b, this.f32711l, this.f32712m, 1)), rVar2, 12582912, 96);
        return Unit.f23355a;
    }
}
