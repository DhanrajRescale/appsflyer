package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.n f39558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, a0.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f39557b = kVar;
        this.f39558c = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f39557b, this.f39558c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39556a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            a0.l lVar = this.f39557b.f39602p;
            if (lVar != null) {
                a0.o oVar = new a0.o(this.f39558c);
                this.f39556a = 1;
                if (lVar.a(oVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
