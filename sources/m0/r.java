package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.d f26702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, Object obj, hu.d dVar, yt.a aVar) {
        super(1, aVar);
        this.f26700b = yVar;
        this.f26701c = obj;
        this.f26702d = dVar;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new r(this.f26700b, this.f26701c, this.f26702d, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26699a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Object obj2 = this.f26701c;
            y yVar = this.f26700b;
            yVar.i(obj2);
            w wVar = new w(yVar, 2);
            q qVar = new q(this.f26702d, yVar, null);
            this.f26699a = 1;
            if (pp.b.n(wVar, qVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
