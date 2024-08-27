package zb;

import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f42309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f42310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f42312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m0 m0Var, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f42310b = m0Var;
        this.f42311c = str;
        this.f42312d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f42310b, this.f42311c, this.f42312d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f42309a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.j z02 = t0.t.z0(new tb.f(this.f42310b, 2));
            a0.f fVar = new a0.f(7, this.f42311c, this.f42312d);
            this.f42309a = 1;
            if (z02.c(fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
