package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c6 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d6 f26001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(d6 d6Var, int i10, yt.a aVar) {
        super(2, aVar);
        this.f26001b = d6Var;
        this.f26002c = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c6(this.f26001b, this.f26002c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c6) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26000a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x.o2 o2Var = this.f26001b.f26051a;
            w.x1 x1Var = z7.f27225b;
            this.f26000a = 1;
            if (o2Var.f(this.f26002c, x1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
