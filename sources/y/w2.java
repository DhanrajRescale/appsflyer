package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w2 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f40985b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40986c;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.h, yt.a, y.w2] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? hVar = new au.h(aVar);
        hVar.f40986c = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w2) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40985b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.m0 m0Var = (x1.m0) this.f40986c;
            this.f40985b = 1;
            obj = i3.e(m0Var, x1.l.f39878b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
