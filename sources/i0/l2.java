package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.l3;
import y.i3;

/* loaded from: classes.dex */
public final class l2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19043a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f19045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f19047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f19048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(qu.f0 f0Var, t0.g1 g1Var, a0.l lVar, l3 l3Var, yt.a aVar) {
        super(2, aVar);
        this.f19045c = f0Var;
        this.f19046d = g1Var;
        this.f19047e = lVar;
        this.f19048f = l3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l2 l2Var = new l2(this.f19045c, this.f19046d, this.f19047e, this.f19048f, aVar);
        l2Var.f19044b = obj;
        return l2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f19043a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f19044b;
            k2 k2Var = new k2(this.f19045c, this.f19046d, this.f19047e, null);
            v.x xVar = new v.x(this.f19048f, 2);
            this.f19043a = 1;
            y.o0 o0Var = i3.f40778a;
            Object P = hl.f.P(new y.s2(zVar, k2Var, xVar, new y.k1(zVar), null), this);
            if (P != obj2) {
                P = Unit.f23355a;
            }
            if (P == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
