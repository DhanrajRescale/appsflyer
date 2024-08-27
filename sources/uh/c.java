package uh;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kp.j;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f37195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f37195b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f37195b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37194a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f37194a = 1;
            if (j.K(3000L, this) == aVar) {
                return aVar;
            }
        }
        this.f37195b.setValue(Boolean.FALSE);
        return Unit.f23355a;
    }
}
