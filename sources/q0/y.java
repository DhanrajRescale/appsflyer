package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.w0;

/* loaded from: classes.dex */
public final class y extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31553a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f31555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, yt.a aVar) {
        super(2, aVar);
        this.f31555c = zVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        y yVar = new y(this.f31555c, aVar);
        yVar.f31554b = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31553a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f31554b;
            z zVar = this.f31555c;
            w0 w0Var = ((a0.l) zVar.f31556n).f16a;
            a0.f fVar = new a0.f(3, zVar, f0Var);
            this.f31553a = 1;
            w0Var.getClass();
            if (w0.n(w0Var, fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
