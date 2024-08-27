package i0;

import d2.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19014a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q1 q1Var, l1.o oVar, boolean z10, l0.v0 v0Var, p2.v vVar) {
        super(1);
        this.f19016c = q1Var;
        this.f19017d = oVar;
        this.f19015b = z10;
        this.f19018e = v0Var;
        this.f19019f = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3 d3Var;
        int i10 = this.f19014a;
        boolean z10 = this.f19015b;
        Object obj2 = this.f19019f;
        Object obj3 = this.f19018e;
        Object obj4 = this.f19017d;
        Object obj5 = this.f19016c;
        switch (i10) {
            case 0:
                long j10 = ((m1.c) obj).f27237a;
                q1 q1Var = (q1) obj5;
                l1.o oVar = (l1.o) obj4;
                boolean z11 = !z10;
                if (!q1Var.b()) {
                    oVar.a(l1.h.f23896e);
                } else if (z11 && (d3Var = q1Var.f19136c) != null) {
                    ((d2.u1) d3Var).b();
                }
                if (q1Var.b()) {
                    if (q1Var.a() != a1.f18783b) {
                        s2 d10 = q1Var.d();
                        if (d10 != null) {
                            int a10 = ((p2.v) obj2).a(d10.b(j10, true));
                            q1Var.f19153t.invoke(p2.c0.a(q1Var.f19137d.f30578a, null, d2.w0.b(a10, a10), 5));
                            if (q1Var.f19134a.f19292a.f20699a.length() > 0) {
                                q1Var.f19144k.setValue(a1.f18784c);
                            }
                        }
                    } else {
                        ((l0.v0) obj3).g(new m1.c(j10));
                    }
                }
                return Unit.f23355a;
            default:
                androidx.navigation.n entry = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((iu.v) obj5).f20556a = true;
                ((iu.v) obj4).f20556a = true;
                ((androidx.navigation.t) obj3).s(entry, z10, (vt.q) obj2);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(iu.v vVar, iu.v vVar2, androidx.navigation.t tVar, boolean z10, vt.q qVar) {
        super(1);
        this.f19016c = vVar;
        this.f19017d = vVar2;
        this.f19018e = tVar;
        this.f19015b = z10;
        this.f19019f = qVar;
    }
}
