package x1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f39896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, yt.a aVar) {
        super(2, aVar);
        this.f39896b = o0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n0(this.f39896b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39895a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            o0 o0Var = this.f39896b;
            Function2 function2 = o0Var.f39898n;
            this.f39895a = 1;
            if (function2.invoke(o0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
