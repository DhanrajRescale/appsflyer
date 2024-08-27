package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16998a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f17000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2.y3 f17001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(hu.c cVar, d2.y3 y3Var, yt.a aVar) {
        super(2, aVar);
        this.f17000c = cVar;
        this.f17001d = y3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p0 p0Var = new p0(this.f17000c, this.f17001d, aVar);
        p0Var.f16999b = obj;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create(obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16998a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Object obj2 = this.f16999b;
            this.f16998a = 1;
            if (this.f17000c.b(this.f17001d, obj2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
