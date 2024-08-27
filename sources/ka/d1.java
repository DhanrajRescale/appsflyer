package ka;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.m7;
import t0.g1;

/* loaded from: classes.dex */
public final class d1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f22767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22769c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f22770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(List list, g1 g1Var, long j10, Function1 function1, long j11) {
        super(2);
        this.f22767a = list;
        this.f22768b = g1Var;
        this.f22769c = j10;
        this.f22770d = function1;
        this.f22771e = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        long j10;
        t0.n nVar = (t0.n) obj;
        int i10 = 2;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        long j11 = this.f22771e;
        int i11 = 0;
        for (Object obj3 : this.f22767a) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                String str = (String) obj3;
                g1 g1Var = this.f22768b;
                if (((Number) g1Var.getValue()).intValue() == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long j12 = n1.t.f28173e;
                g1.o g10 = androidx.compose.foundation.layout.d.g(g1.l.f16404b, 32);
                if (((Number) g1Var.getValue()).intValue() == i11) {
                    j10 = this.f22769c;
                } else {
                    j10 = j12;
                }
                g1.o e10 = androidx.compose.foundation.a.e(g10, j10, n1.s0.f28162a);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-207370662);
                boolean f10 = rVar2.f(i11);
                Object Q = rVar2.Q();
                to.e eVar = t0.m.f35080a;
                if (f10 || Q == eVar) {
                    Q = new l1.i(i11, i10);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                g1.o a10 = h2.l.a(e10, false, (Function1) Q);
                rVar2.b0(-207401621);
                Function1 function1 = this.f22770d;
                boolean h10 = rVar2.h(function1) | rVar2.f(i11);
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == eVar) {
                    Q2 = new c1(function1, i11, g1Var, 0);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                m7.a(z10, (Function0) Q2, a10, false, b1.d.c(2009826382, new d0(str, j11, 1), rVar2), null, null, j11, j12, rVar2, 113270784, 104);
                i11 = i12;
                j11 = j11;
                i10 = 2;
            } else {
                vt.y.j();
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
