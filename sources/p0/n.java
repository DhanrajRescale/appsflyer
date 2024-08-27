package p0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import x.w1;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, float f10, yt.a aVar) {
        super(2, aVar);
        this.f30478b = oVar;
        this.f30479c = f10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f30478b, this.f30479c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30477a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            o oVar = this.f30478b;
            w1 w1Var = oVar.f30488i;
            m mVar = new m(oVar, this.f30479c, null);
            this.f30477a = 1;
            if (w1.b(w1Var, mVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
