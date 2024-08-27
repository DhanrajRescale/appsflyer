package m0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        super(0);
        this.f27072a = i10;
        this.f27073b = obj;
        this.f27074c = obj2;
    }

    public final void a() {
        t0.x1 x1Var;
        t0.y1 y1Var;
        int i10 = this.f27072a;
        Object obj = this.f27074c;
        Object obj2 = this.f27073b;
        switch (i10) {
            case 0:
                y yVar = (y) obj2;
                s sVar = yVar.f27127n;
                float c10 = yVar.d().c(obj);
                if (!Float.isNaN(c10)) {
                    y yVar2 = sVar.f26751a;
                    yVar2.f27123j.j(c10);
                    yVar2.f27124k.j(s0.g.f34069a);
                    yVar.i(null);
                }
                yVar.h(obj);
                return;
            case 3:
                ((w4) obj2).f27021c = (w2.b) obj;
                return;
            default:
                a3.a.u(obj2);
                g3 g3Var = (g3) obj;
                if (!Intrinsics.a(null, g3Var.f26199a)) {
                    ArrayList arrayList = g3Var.f26200b;
                    a3.a.u(obj2);
                    vt.d0.p(arrayList, new h6(1));
                    t0.w1 w1Var = g3Var.f26201c;
                    if (w1Var != null && (y1Var = (x1Var = (t0.x1) w1Var).f35243b) != null) {
                        y1Var.d(x1Var, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f27072a;
        Object obj = this.f27074c;
        Object obj2 = this.f27073b;
        switch (i10) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                p2 p2Var = (p2) obj2;
                if (((Boolean) p2Var.f26627a.f27117d.invoke(q2.f26666a)).booleanValue()) {
                    yk.g.H((qu.f0) obj, null, null, new d2(p2Var, null), 3);
                }
                return Boolean.TRUE;
            case 2:
                return new p2((q2) obj2, (Function1) obj);
            case 3:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
