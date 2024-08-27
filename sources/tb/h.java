package tb;

import c0.a0;
import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f35707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m0 m0Var, yt.a aVar) {
        super(2, aVar);
        this.f35707b = m0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f35707b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35706a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m0 m0Var = this.f35707b;
            int i11 = ((a0) m0Var.g()).f7450m;
            this.f35706a = 1;
            if (m0.i(m0Var, i11, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
