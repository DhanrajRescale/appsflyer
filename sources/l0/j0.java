package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.l3;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23776a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f23778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w.d f23779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l3 l3Var, w.d dVar, yt.a aVar) {
        super(2, aVar);
        this.f23778c = l3Var;
        this.f23779d = dVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        j0 j0Var = new j0(this.f23778c, this.f23779d, aVar);
        j0Var.f23777b = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23776a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f23777b;
            tu.j z02 = t0.t.z0(new c0.r(this.f23778c, 4));
            a0.f fVar = new a0.f(1, this.f23779d, f0Var);
            this.f23776a = 1;
            if (z02.c(fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
