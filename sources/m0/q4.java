package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26676a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f26678c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q4 q4Var = new q4(this.f26678c, aVar);
        q4Var.f26677b = obj;
        return q4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q4) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26676a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f26677b;
            h2 h2Var = new h2(this.f26678c, 1);
            this.f26676a = 1;
            if (y.i3.d(zVar, null, h2Var, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
