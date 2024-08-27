package zb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public g1 f42313a;

    /* renamed from: b, reason: collision with root package name */
    public int f42314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f42315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f42316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g1 g1Var, g1 g1Var2, yt.a aVar) {
        super(2, aVar);
        this.f42315c = g1Var;
        this.f42316d = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f42315c, this.f42316d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        g1 g1Var;
        g1 g1Var2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f42314b;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                g1Var2 = this.f42313a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            boolean booleanValue = ((Boolean) this.f42315c.getValue()).booleanValue();
            g1Var = this.f42316d;
            if (booleanValue) {
                this.f42313a = g1Var;
                this.f42314b = 1;
                if (kp.j.K(500L, this) == aVar) {
                    return aVar;
                }
                g1Var2 = g1Var;
            } else {
                z10 = false;
                g1Var.setValue(Boolean.valueOf(z10));
                return Unit.f23355a;
            }
        }
        g1Var = g1Var2;
        g1Var.setValue(Boolean.valueOf(z10));
        return Unit.f23355a;
    }
}
