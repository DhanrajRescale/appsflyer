package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4 f13423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(i4 i4Var, yt.a aVar) {
        super(2, aVar);
        this.f13423b = i4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g4(this.f13423b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f13422a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            a0 a0Var = this.f13423b.f13460a;
            this.f13422a = 1;
            Object a10 = a0Var.f13322n.a(this);
            if (a10 != aVar) {
                a10 = Unit.f23355a;
            }
            if (a10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
