package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.l3;
import t0.t1;
import w.u1;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37539a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f37541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f37542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u1 u1Var, l3 l3Var, yt.a aVar) {
        super(2, aVar);
        this.f37541c = u1Var;
        this.f37542d = l3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        k kVar = new k(this.f37541c, this.f37542d, aVar);
        kVar.f37540b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((t1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37539a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            t1 t1Var = (t1) this.f37540b;
            u1 u1Var = this.f37541c;
            tu.j z02 = t0.t.z0(new i(u1Var, 0));
            j jVar = new j(0, t1Var, u1Var, this.f37542d);
            this.f37539a = 1;
            if (z02.c(jVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
