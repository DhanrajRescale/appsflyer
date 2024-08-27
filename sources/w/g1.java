package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        super(1);
        this.f38498a = i10;
        this.f38499b = obj;
        this.f38500c = obj2;
    }

    public final t0.n0 a(t0.o0 o0Var) {
        int i10 = this.f38498a;
        Object obj = this.f38500c;
        Object obj2 = this.f38499b;
        switch (i10) {
            case 1:
                q0 q0Var = (q0) obj2;
                l0 l0Var = (l0) obj;
                q0Var.f38643a.b(l0Var);
                q0Var.f38644b.setValue(Boolean.TRUE);
                return new s0(0, q0Var, l0Var);
            case 2:
                u1 u1Var = (u1) obj2;
                u1 u1Var2 = (u1) obj;
                u1Var.f38695i.add(u1Var2);
                return new s0(1, u1Var, u1Var2);
            case 3:
                return new s0(2, (u1) obj2, (o1) obj);
            default:
                u1 u1Var3 = (u1) obj2;
                q1 q1Var = (q1) obj;
                u1Var3.f38694h.add(q1Var);
                return new s0(3, u1Var3, q1Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38498a) {
            case 0:
                m mVar = (m) obj;
                ((Function2) this.f38499b).invoke(mVar.f38600e.getValue(), ((y1) this.f38500c).f38735b.invoke(mVar.f38601f));
                return Unit.f23355a;
            case 1:
                return a((t0.o0) obj);
            case 2:
                return a((t0.o0) obj);
            case 3:
                return a((t0.o0) obj);
            default:
                return a((t0.o0) obj);
        }
    }
}
