package vh;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kp.j;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f38047b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f38047b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38046a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f38046a = 1;
            if (j.K(200L, this) == aVar) {
                return aVar;
            }
        }
        this.f38047b.setValue(Boolean.TRUE);
        return Unit.f23355a;
    }
}
