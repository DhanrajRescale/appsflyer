package m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f27110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f27111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f27112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(Function2 function2, Function2 function22, hu.c cVar, int i10) {
        super(2);
        this.f27109a = i10;
        this.f27110b = function2;
        this.f27111c = function22;
        this.f27112d = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        Object obj3;
        int i10;
        a2.n0 n0;
        int i11 = this.f27109a;
        int i12 = 0;
        Function2 function2 = this.f27110b;
        switch (i11) {
            case 0:
                a2.k1 k1Var = (a2.k1) obj;
                long j10 = ((w2.a) obj2).f38776a;
                int h10 = w2.a.h(j10);
                List k10 = k1Var.k(a8.f25890a, function2);
                int size = k10.size();
                int i13 = h10 / size;
                ArrayList arrayList2 = new ArrayList(k10.size());
                int i14 = 0;
                for (int size2 = k10.size(); i14 < size2; size2 = size2) {
                    ArrayList arrayList3 = arrayList2;
                    i14 = nn.d.d((a2.l0) k10.get(i14), w2.a.a(j10, i13, i13, 0, 0, 12), arrayList3, i14, 1);
                    arrayList2 = arrayList3;
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4.isEmpty()) {
                    obj3 = null;
                    arrayList = arrayList4;
                } else {
                    arrayList = arrayList4;
                    obj3 = arrayList.get(0);
                    int i15 = ((a2.a1) obj3).f30b;
                    int f10 = vt.y.f(arrayList);
                    int i16 = 1;
                    if (1 <= f10) {
                        while (true) {
                            Object obj4 = arrayList.get(i16);
                            int i17 = ((a2.a1) obj4).f30b;
                            if (i15 < i17) {
                                obj3 = obj4;
                                i15 = i17;
                            }
                            if (i16 != f10) {
                                i16++;
                            }
                        }
                    }
                }
                a2.a1 a1Var = (a2.a1) obj3;
                if (a1Var != null) {
                    i10 = a1Var.f30b;
                } else {
                    i10 = 0;
                }
                ArrayList arrayList5 = new ArrayList(size);
                while (i12 < size) {
                    arrayList5.add(new n7(k1Var.N(i13) * i12, k1Var.N(i13)));
                    i12++;
                }
                n0 = k1Var.n0(h10, i10, vt.p0.d(), new w7(arrayList, k1Var, this.f27111c, i13, j10, i10, this.f27112d, arrayList5, h10));
                return n0;
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                g1.o e10 = androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-400687226);
                boolean j11 = rVar2.j(function2);
                Function2 function22 = this.f27111c;
                boolean j12 = j11 | rVar2.j(function22);
                hu.c cVar = this.f27112d;
                boolean j13 = j12 | rVar2.j(cVar);
                Object Q = rVar2.Q();
                if (j13 || Q == t0.m.f35080a) {
                    Q = new x7(function2, function22, cVar, i12);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                a2.g1.b(e10, (Function2) Q, rVar2, 6, 0);
                return Unit.f23355a;
        }
    }
}
