package e0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f14706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x1.z zVar, j0 j0Var, yt.a aVar) {
        super(2, aVar);
        this.f14706b = zVar;
        this.f14707c = j0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f14706b, this.f14707c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14705a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            h hVar = new h(this.f14707c, null);
            this.f14705a = 1;
            if (qu.i0.h(this.f14706b, hVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
