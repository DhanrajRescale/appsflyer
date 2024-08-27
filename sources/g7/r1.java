package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17030a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f17032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(x1 x1Var, yt.a aVar) {
        super(2, aVar);
        this.f17032c = x1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        r1 r1Var = new r1(this.f17032c, aVar);
        r1Var.f17031b = obj;
        return r1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((j4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17030a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            j4 j4Var = (j4) this.f17031b;
            x1 x1Var = this.f17032c;
            tu.r rVar = new tu.r(new n1(null, null), (tu.f) x1Var.f17122d.f36362c);
            o1 operation = new o1(null, x1Var, null);
            Object obj2 = r0.f17029a;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            Intrinsics.checkNotNullParameter(operation, "operation");
            tu.f a10 = r0.a(new x(new tu.j((Function2) new o0(null, rVar, operation, null)), 5), new y(null, x1Var, 0 == true ? 1 : 0, i11));
            q1 q1Var = new q1(j4Var, 0);
            this.f17030a = 1;
            if (a10.c(q1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
