package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16769a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su.g f16771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f16772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(su.g gVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f16771c = gVar;
        this.f16772d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        f4 f4Var = new f4(this.f16771c, this.f16772d, aVar);
        f4Var.f16770b = obj;
        return f4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16769a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            j4 j4Var = new j4((qu.f0) this.f16770b, this.f16771c);
            this.f16769a = 1;
            if (this.f16772d.invoke(j4Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
