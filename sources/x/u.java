package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y.l3;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39723a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f39724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(float f10, n1.h0 h0Var, n1.m mVar) {
        super(1);
        this.f39724b = f10;
        this.f39725c = h0Var;
        this.f39726d = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long c10;
        int i10 = this.f39723a;
        float f10 = this.f39724b;
        Object obj2 = this.f39726d;
        Object obj3 = this.f39725c;
        switch (i10) {
            case 1:
                long longValue = ((Number) obj).longValue();
                l3 l3Var = (l3) obj3;
                if (l3Var.f40849b == Long.MIN_VALUE) {
                    l3Var.f40849b = longValue;
                }
                float f11 = l3Var.f40852e;
                w.p pVar = new w.p(f11);
                w.p pVar2 = l3.f40847f;
                if (f10 == s0.g.f34069a) {
                    c10 = l3Var.f40848a.c(new w.p(f11), pVar2, l3Var.f40850c);
                } else {
                    c10 = ku.c.c(((float) (longValue - l3Var.f40849b)) / f10);
                }
                float f12 = ((w.p) l3Var.f40848a.e(c10, pVar, pVar2, l3Var.f40850c)).f38635a;
                l3Var.f40850c = (w.p) l3Var.f40848a.f(c10, pVar, pVar2, l3Var.f40850c);
                l3Var.f40849b = longValue;
                float f13 = l3Var.f40852e - f12;
                l3Var.f40852e = f12;
                ((Function1) obj2).invoke(Float.valueOf(f13));
                return Unit.f23355a;
            default:
                c2.j0 j0Var = (c2.j0) ((p1.e) obj);
                j0Var.a();
                p1.b bVar = j0Var.f7740a.f30501b;
                long b10 = bVar.b();
                bVar.a().h();
                p1.d dVar = bVar.f30498a;
                dVar.d(f10, s0.g.f34069a);
                dVar.b(m1.c.f27233b, 45.0f);
                p1.h.r0(j0Var, (n1.h0) obj3, (n1.u) obj2);
                bVar.a().s();
                bVar.c(b10);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l3 l3Var, float f10, Function1 function1) {
        super(1);
        this.f39725c = l3Var;
        this.f39724b = f10;
        this.f39726d = function1;
    }
}
