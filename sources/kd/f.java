package kd;

import au.i;
import c0.r;
import el.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.l3;
import t0.t;
import tb.v;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f23086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f23087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l3 l3Var, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f23086b = l3Var;
        this.f23087c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f23086b, this.f23087c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23085a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            tu.f J = l.J(t.z0(new r(this.f23086b, 11)));
            v vVar = new v(this.f23087c, 1);
            this.f23085a = 1;
            if (J.c(vVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
