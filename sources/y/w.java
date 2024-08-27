package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f40982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.s1 f40983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f40984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, x.s1 s1Var, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f40982b = yVar;
        this.f40983c = s1Var;
        this.f40984d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f40982b, this.f40983c, this.f40984d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40981a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y yVar = this.f40982b;
            x.w1 w1Var = yVar.f40994c;
            x xVar = yVar.f40993b;
            x.s1 s1Var = this.f40983c;
            v vVar = new v(yVar, this.f40984d, null);
            this.f40981a = 1;
            w1Var.getClass();
            if (hl.f.P(new x.v1(s1Var, w1Var, vVar, xVar, null), this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
