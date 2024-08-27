package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f40627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f40628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(j2 j2Var, long j10, yt.a aVar) {
        super(2, aVar);
        this.f40627b = j2Var;
        this.f40628c = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b2(this.f40627b, this.f40628c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40626a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            j2 j2Var = this.f40627b;
            d2 d2Var = j2Var.f40796a;
            x.s1 s1Var = x.s1.f39718b;
            a2 a2Var = new a2(j2Var, this.f40628c, null);
            this.f40626a = 1;
            if (d2Var.b(s1Var, a2Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
