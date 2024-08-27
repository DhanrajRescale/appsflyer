package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1.z zVar, a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f19192b = zVar;
        this.f19193c = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s1(this.f19192b, this.f19193c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f19191a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f19191a = 1;
            Object h10 = qu.i0.h(this.f19192b, new x1(this.f19193c, null), this);
            if (h10 != obj2) {
                h10 = Unit.f23355a;
            }
            if (h10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
