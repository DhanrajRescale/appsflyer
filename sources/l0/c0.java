package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23724a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f23726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f23726c = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c0 c0Var = new c0(this.f23726c, aVar);
        c0Var.f23725b = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23724a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f23725b;
            b0 b0Var = new b0(this.f23726c, null);
            this.f23724a = 1;
            if (((x1.o0) zVar).Q0(b0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
