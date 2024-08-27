package m0;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.c f26863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(float f10, Function2 function2, Function2 function22, Object obj, int i10, hu.c cVar, int i11) {
        super(2);
        this.f26858a = i11;
        this.f26859b = f10;
        this.f26860c = function2;
        this.f26861d = function22;
        this.f26864g = obj;
        this.f26862e = i10;
        this.f26863f = cVar;
    }

    public final a2.n0 a(a2.k1 k1Var, long j10) {
        a2.n0 n0;
        a2.n0 n02;
        int i10 = this.f26858a;
        Object obj = this.f26864g;
        Function2 function2 = this.f26860c;
        float f10 = this.f26859b;
        switch (i10) {
            case 0:
                int m02 = k1Var.m0(z7.f27224a);
                int m03 = k1Var.m0(f10);
                long a10 = w2.a.a(j10, m02, 0, 0, 0, 14);
                List k10 = k1Var.k(a8.f25890a, function2);
                ArrayList arrayList = new ArrayList(k10.size());
                int size = k10.size();
                for (int i11 = 0; i11 < size; i11 = nn.d.d((a2.l0) k10.get(i11), a10, arrayList, i11, 1)) {
                }
                iu.x xVar = new iu.x();
                xVar.f20558a = m03 * 2;
                iu.x xVar2 = new iu.x();
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    a2.a1 a1Var = (a2.a1) arrayList.get(i12);
                    xVar.f20558a += a1Var.f29a;
                    xVar2.f20558a = Math.max(xVar2.f20558a, a1Var.f30b);
                }
                n0 = k1Var.n0(xVar.f20558a, xVar2.f20558a, vt.p0.d(), new s7(m03, arrayList, k1Var, this.f26861d, (d6) obj, this.f26862e, j10, xVar, xVar2, this.f26863f));
                return n0;
            default:
                int m04 = k1Var.m0(r0.k3.f32524a);
                int m05 = k1Var.m0(f10);
                List k11 = k1Var.k(r0.l3.f32565a, function2);
                Integer num = 0;
                int size3 = k11.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((a2.l0) k11.get(i13)).e(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
                }
                int intValue = num.intValue();
                long a11 = w2.a.a(j10, m04, 0, intValue, intValue, 2);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size4 = k11.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    a2.l0 l0Var = (a2.l0) k11.get(i14);
                    a2.a1 E = l0Var.E(a11);
                    float N = k1Var.N(Math.min(l0Var.D(E.f30b), E.f29a)) - (r0.d3.f32376a * 2);
                    arrayList2.add(E);
                    arrayList3.add(new w2.e(N));
                }
                Integer valueOf = Integer.valueOf(m05 * 2);
                int size5 = arrayList2.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    valueOf = Integer.valueOf(valueOf.intValue() + ((a2.a1) arrayList2.get(i15)).f29a);
                }
                int intValue2 = valueOf.intValue();
                n02 = k1Var.n0(intValue2, intValue, vt.p0.d(), new r0.i3(m05, arrayList2, k1Var, this.f26861d, (r0.s2) obj, this.f26862e, arrayList3, j10, intValue2, intValue, this.f26863f));
                return n02;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26858a) {
            case 0:
                return a((a2.k1) obj, ((w2.a) obj2).f38776a);
            case 1:
                return a((a2.k1) obj, ((w2.a) obj2).f38776a);
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                Object g10 = v.e.g(rVar2, 773894976, -492369756);
                Object obj3 = t0.m.f35080a;
                if (g10 == obj3) {
                    g10 = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar2), rVar2);
                }
                rVar2.s(false);
                qu.f0 f0Var = ((t0.d0) g10).f34970a;
                rVar2.s(false);
                rVar2.b0(121290627);
                x.o2 o2Var = (x.o2) this.f26864g;
                boolean h10 = rVar2.h(o2Var) | rVar2.h(f0Var);
                Object Q = rVar2.Q();
                if (h10 || Q == obj3) {
                    Q = new r0.s2(o2Var, f0Var);
                    rVar2.k0(Q);
                }
                Object obj4 = (r0.s2) Q;
                rVar2.s(false);
                g1.o c10 = androidx.compose.ui.draw.a.c(h2.l.a(androidx.compose.foundation.a.n(androidx.compose.foundation.layout.d.u(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), g1.a.f16382d, 2), o2Var), false, g0.a.f16375a));
                rVar2.b0(121291080);
                boolean e10 = rVar2.e(this.f26859b) | rVar2.h(this.f26860c) | rVar2.h(this.f26861d) | rVar2.h(this.f26863f) | rVar2.j(obj4) | rVar2.f(this.f26862e);
                float f10 = this.f26859b;
                Function2 function2 = this.f26860c;
                Function2 function22 = this.f26861d;
                int i10 = this.f26862e;
                hu.c cVar = this.f26863f;
                Object Q2 = rVar2.Q();
                if (e10 || Q2 == obj3) {
                    Q2 = new t7(f10, function2, function22, obj4, i10, cVar, 1);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                a2.g1.b(c10, (Function2) Q2, rVar2, 0, 0);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(x.o2 o2Var, float f10, Function2 function2, Function2 function22, hu.c cVar, int i10) {
        super(2);
        this.f26858a = 2;
        this.f26864g = o2Var;
        this.f26859b = f10;
        this.f26860c = function2;
        this.f26861d = function22;
        this.f26863f = cVar;
        this.f26862e = i10;
    }
}
