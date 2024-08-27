package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z6 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f27219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f27220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f27221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f27222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f27223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(y yVar, t0.l3 l3Var, t0.l3 l3Var2, t0.g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f27220b = yVar;
        this.f27221c = l3Var;
        this.f27222d = l3Var2;
        this.f27223e = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z6(this.f27220b, this.f27221c, this.f27222d, this.f27223e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z6) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f27219a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.j z02 = t0.t.z0(new w(this.f27220b, 5));
            y6 y6Var = new y6(this.f27221c, this.f27222d, this.f27223e, null);
            this.f27219a = 1;
            if (el.l.B(z02, y6Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
