package tb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.l3;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f35796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f35797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l3 l3Var, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f35796b = l3Var;
        this.f35797c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f35796b, this.f35797c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35795a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.f J = el.l.J(t0.t.z0(new c0.r(this.f35796b, 10)));
            v vVar = new v(this.f35797c, 0);
            this.f35795a = 1;
            if (J.c(vVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
