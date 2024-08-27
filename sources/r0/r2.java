package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f32694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, int i10, yt.a aVar) {
        super(2, aVar);
        this.f32694b = s2Var;
        this.f32695c = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r2(this.f32694b, this.f32695c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32693a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x.o2 o2Var = this.f32694b.f32713a;
            w.x1 x1Var = k3.f32525b;
            this.f32693a = 1;
            if (o2Var.f(this.f32695c, x1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
