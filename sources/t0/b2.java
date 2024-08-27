package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34948a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f34950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f34951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(hu.c cVar, a1 a1Var, yt.a aVar) {
        super(2, aVar);
        this.f34950c = cVar;
        this.f34951d = a1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b2 b2Var = new b2(this.f34950c, this.f34951d, aVar);
        b2Var.f34949b = obj;
        return b2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34948a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f34949b;
            this.f34948a = 1;
            if (this.f34950c.b(f0Var, this.f34951d, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
