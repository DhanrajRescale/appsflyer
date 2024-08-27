package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40892a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f40894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w.n f40895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu.w f40896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(float f10, w.n nVar, iu.w wVar, yt.a aVar) {
        super(2, aVar);
        this.f40894c = f10;
        this.f40895d = nVar;
        this.f40896e = wVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p1 p1Var = new p1(this.f40894c, this.f40895d, this.f40896e, aVar);
        p1Var.f40893b = obj;
        return p1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40892a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            q1 q1Var = (q1) this.f40893b;
            float f10 = this.f40894c;
            w.n nVar = this.f40895d;
            o1 o1Var = new o1(this.f40896e, q1Var, 0);
            this.f40892a = 1;
            if (w.e.e(s0.g.f34069a, f10, nVar, o1Var, this, 4) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
