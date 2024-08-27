package ka;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.m7;
import t0.g1;

/* loaded from: classes.dex */
public final class e0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f22775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(List list, g1 g1Var, long j10, long j11) {
        super(2);
        this.f22775a = list;
        this.f22776b = g1Var;
        this.f22777c = j10;
        this.f22778d = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        long j10;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        long j11 = this.f22778d;
        boolean z11 = 0;
        int i10 = 0;
        for (Object obj3 : this.f22775a) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String str = (String) obj3;
                g1 g1Var = this.f22776b;
                if (((Number) g1Var.getValue()).intValue() == i10) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                long j12 = n1.t.f28173e;
                g1.o g10 = androidx.compose.foundation.layout.d.g(g1.l.f16404b, 32);
                if (((Number) g1Var.getValue()).intValue() == i10) {
                    j10 = this.f22777c;
                } else {
                    j10 = j12;
                }
                g1.o e10 = androidx.compose.foundation.a.e(g10, j10, n1.s0.f28162a);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(222780468);
                boolean h10 = rVar2.h(g1Var) | rVar2.f(i10);
                Object Q = rVar2.Q();
                if (h10 || Q == t0.m.f35080a) {
                    Q = new c0(g1Var, i10);
                    rVar2.k0(Q);
                }
                rVar2.s(z11);
                m7.a(z10, (Function0) Q, e10, false, b1.d.c(767822885, new d0(str, j11, z11), rVar2), null, null, j11, j12, rVar2, 113270784, 104);
                i10 = i11;
                z11 = z11;
            } else {
                vt.y.j();
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
