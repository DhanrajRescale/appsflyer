package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40839a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f40841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f40842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f40841c = m1Var;
        this.f40842d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l1 l1Var = new l1(this.f40841c, this.f40842d, aVar);
        l1Var.f40840b = obj;
        return l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40839a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            q1 q1Var = (q1) this.f40840b;
            m1 m1Var = this.f40841c;
            m1Var.f40859b = q1Var;
            this.f40839a = 1;
            if (this.f40842d.invoke(m1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
