package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38677a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f38679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(u1 u1Var, yt.a aVar) {
        super(2, aVar);
        this.f38679c = u1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        s1 s1Var = new s1(this.f38679c, aVar);
        s1Var.f38678b = obj;
        return s1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        qu.f0 f0Var;
        r1 r1Var;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38677a;
        if (i10 != 0) {
            if (i10 == 1) {
                f0Var = (qu.f0) this.f38678b;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            f0Var = (qu.f0) this.f38678b;
        }
        do {
            r1Var = new r1(this.f38679c, e.q(f0Var.H()));
            this.f38678b = f0Var;
            this.f38677a = 1;
        } while (dp.b.q1(getContext()).U(r1Var, this) != aVar);
        return aVar;
    }
}
