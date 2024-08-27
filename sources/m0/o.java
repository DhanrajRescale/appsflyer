package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f26561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y yVar, yt.a aVar, hu.c cVar) {
        super(1, aVar);
        this.f26560b = yVar;
        this.f26561c = cVar;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new o(this.f26560b, aVar, this.f26561c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26559a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y yVar = this.f26560b;
            w wVar = new w(yVar, i11);
            n nVar = new n(yVar, null, this.f26561c);
            this.f26559a = 1;
            if (pp.b.n(wVar, nVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
