package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40670a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, yt.a aVar) {
        super(2, aVar);
        this.f40672c = f1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e1 e1Var = new e1(this.f40672c, aVar);
        e1Var.f40671b = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40670a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f40671b;
            d1 d1Var = new d1(this.f40672c, null);
            this.f40670a = 1;
            if (((x1.o0) zVar).Q0(d1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
