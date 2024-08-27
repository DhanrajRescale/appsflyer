package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f40870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(k1 k1Var, yt.a aVar) {
        super(2, aVar);
        this.f40870b = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n2(this.f40870b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40869a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f40869a = 1;
            if (this.f40870b.a(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
