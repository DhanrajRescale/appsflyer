package pg;

import e0.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f31023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j0 j0Var, int i10, yt.a aVar) {
        super(2, aVar);
        this.f31023b = j0Var;
        this.f31024c = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f31023b, this.f31024c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31022a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f31022a = 1;
            if (j0.q(this.f31023b, this.f31024c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
