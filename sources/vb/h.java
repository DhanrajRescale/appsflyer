package vb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f37883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f37884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1 g1Var, g1 g1Var2, yt.a aVar, boolean z10) {
        super(2, aVar);
        this.f37882b = z10;
        this.f37883c = g1Var;
        this.f37884d = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f37883c, this.f37884d, aVar, this.f37882b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37881a;
        g1 g1Var = this.f37883c;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            if (((o) g1Var.getValue()) == o.f37928b) {
                g1Var.setValue(o.f37929c);
                this.f37881a = 1;
                if (kp.j.K(5000L, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f23355a;
        }
        g1Var.setValue(o.f37927a);
        this.f37884d.setValue(Boolean.valueOf(this.f37882b));
        return Unit.f23355a;
    }
}
