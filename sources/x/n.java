package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39639a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f39641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, yt.a aVar) {
        super(2, aVar);
        this.f39641c = pVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n nVar = new n(this.f39641c, aVar);
        nVar.f39640b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39639a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f39640b;
            m mVar = new m(this.f39641c, null);
            this.f39639a = 1;
            if (qu.i0.h(zVar, mVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
