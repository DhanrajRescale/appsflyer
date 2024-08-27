package nh;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f28700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f28700b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f28700b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28699a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f28699a = 1;
            if (this.f28700b.d(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
