package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26095a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f26097c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e3 e3Var = new e3(this.f26097c, aVar);
        e3Var.f26096b = obj;
        return e3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e3) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26095a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f26096b;
            d3 d3Var = new d3(this.f26097c, null);
            this.f26095a = 1;
            if (qu.i0.h(zVar, d3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
