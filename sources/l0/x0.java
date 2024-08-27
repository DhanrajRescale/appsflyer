package l0;

import i0.a2;
import i0.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23865a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f23867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f23867c = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        x0 x0Var = new x0(this.f23867c, aVar);
        x0Var.f23866b = obj;
        return x0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f23865a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f23866b;
            this.f23865a = 1;
            Object P = hl.f.P(new u1(zVar, this.f23867c, null), this);
            if (P != obj2) {
                P = Unit.f23355a;
            }
            if (P == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
