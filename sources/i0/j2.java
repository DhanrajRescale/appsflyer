package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t0.g1 f18998a;

    /* renamed from: b, reason: collision with root package name */
    public int f18999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f19002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(t0.g1 g1Var, boolean z10, a0.l lVar, yt.a aVar) {
        super(2, aVar);
        this.f19000c = g1Var;
        this.f19001d = z10;
        this.f19002e = lVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j2(this.f19000c, this.f19001d, this.f19002e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        t0.g1 g1Var;
        a0.j mVar;
        t0.g1 g1Var2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18999b;
        if (i10 != 0) {
            if (i10 == 1) {
                g1Var2 = this.f18998a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            g1Var = this.f19000c;
            a0.n nVar = (a0.n) g1Var.getValue();
            if (nVar != null) {
                if (this.f19001d) {
                    mVar = new a0.o(nVar);
                } else {
                    mVar = new a0.m(nVar);
                }
                a0.l lVar = this.f19002e;
                if (lVar != null) {
                    this.f18998a = g1Var;
                    this.f18999b = 1;
                    if (lVar.a(mVar, this) == aVar) {
                        return aVar;
                    }
                    g1Var2 = g1Var;
                }
                g1Var.setValue(null);
            }
            return Unit.f23355a;
        }
        g1Var = g1Var2;
        g1Var.setValue(null);
        return Unit.f23355a;
    }
}
