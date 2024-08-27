package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f26327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f26327b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j4(this.f26327b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26326a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f26326a = 1;
            if (this.f26327b.d(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
