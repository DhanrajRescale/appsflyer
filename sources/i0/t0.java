package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.i3;

/* loaded from: classes.dex */
public final class t0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x1.z zVar, l0.v0 v0Var, yt.a aVar) {
        super(2, aVar);
        this.f19201b = zVar;
        this.f19202c = v0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t0(this.f19201b, this.f19202c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19200a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            b0 b0Var = new b0(this.f19202c, 1);
            this.f19200a = 1;
            if (i3.d(this.f19201b, null, b0Var, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
