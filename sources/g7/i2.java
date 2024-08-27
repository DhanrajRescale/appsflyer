package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f16830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su.g f16831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(t2 t2Var, yt.a aVar, su.g gVar) {
        super(2, aVar);
        this.f16830b = t2Var;
        this.f16831c = gVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i2(this.f16830b, aVar, this.f16831c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16829a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.f fVar = this.f16830b.f17067d;
            d2.y3 y3Var = new d2.y3(this.f16831c, 2);
            this.f16829a = 1;
            if (fVar.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
