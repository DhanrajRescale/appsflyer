package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.f f17058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.h f17059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tu.f fVar, q.h hVar, yt.a aVar) {
        super(2, aVar);
        this.f17058b = fVar;
        this.f17059c = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f17058b, this.f17059c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17057a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x xVar = new x(this.f17058b, 6);
            s sVar = new s(this.f17059c);
            this.f17057a = 1;
            if (xVar.c(sVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
