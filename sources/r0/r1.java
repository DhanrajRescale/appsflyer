package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(z2 z2Var, yt.a aVar) {
        super(2, aVar);
        this.f32692b = z2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r1(this.f32692b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32691a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f32691a = 1;
            if (this.f32692b.d(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
