package ib;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f19816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f19816b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f19816b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19815a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f19815a = 1;
            if (this.f19816b.d(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
