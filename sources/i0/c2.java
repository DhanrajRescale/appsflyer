package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f18814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(w.d dVar, yt.a aVar) {
        super(2, aVar);
        this.f18814b = dVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c2(this.f18814b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18813a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y0 y0Var = y0.f19255a;
            b2 b2Var = new b2(this.f18814b, null);
            this.f18813a = 1;
            if (yk.g.e0(y0Var, b2Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
