package uh;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kp.j;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f37197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f37198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f37197b = function0;
        this.f37198c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f37197b, this.f37198c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37196a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            if (((Boolean) this.f37198c.getValue()).booleanValue()) {
                this.f37196a = 1;
                if (j.K(5000L, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f23355a;
        }
        this.f37197b.mo2invoke();
        return Unit.f23355a;
    }
}
