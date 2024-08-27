package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26509a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f26511c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f26512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y yVar, yt.a aVar, hu.c cVar) {
        super(2, aVar);
        this.f26511c = cVar;
        this.f26512d = yVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n nVar = new n(this.f26512d, aVar, this.f26511c);
        nVar.f26510b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((y3) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26509a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y3 y3Var = (y3) this.f26510b;
            s sVar = this.f26512d.f27127n;
            this.f26509a = 1;
            if (this.f26511c.b(sVar, y3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
