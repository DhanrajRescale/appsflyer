package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su.g f16799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f16800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(su.g gVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f16799b = gVar;
        this.f16800c = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g4(this.f16799b, this.f16800c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16798a;
        su.g gVar = this.f16799b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                f4 f4Var = new f4(gVar, this.f16800c, null);
                this.f16798a = 1;
                if (hl.f.P(f4Var, this) == aVar) {
                    return aVar;
                }
            }
            gVar.k(null);
        } catch (Throwable th2) {
            gVar.k(th2);
        }
        return Unit.f23355a;
    }
}
