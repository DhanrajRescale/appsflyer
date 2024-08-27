package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40944a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1.z f40946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f40947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f40948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f40949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(x1.z zVar, hu.c cVar, Function1 function1, k1 k1Var, yt.a aVar) {
        super(2, aVar);
        this.f40946c = zVar;
        this.f40947d = cVar;
        this.f40948e = function1;
        this.f40949f = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        s2 s2Var = new s2(this.f40946c, this.f40947d, this.f40948e, this.f40949f, aVar);
        s2Var.f40945b = obj;
        return s2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40944a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            r2 r2Var = new r2((qu.f0) this.f40945b, this.f40947d, this.f40948e, this.f40949f, null);
            this.f40944a = 1;
            if (qu.i0.h(this.f40946c, r2Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
