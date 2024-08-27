package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1942a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o oVar, n nVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f1944c = oVar;
        this.f1945d = nVar;
        this.f1946e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        m0 m0Var = new m0(this.f1944c, this.f1945d, this.f1946e, aVar);
        m0Var.f1943b = obj;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f1942a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f1943b;
            xu.e eVar = qu.r0.f32255a;
            ru.d dVar = ((ru.d) vu.u.f38408a).f34006f;
            l0 l0Var = new l0(this.f1944c, this.f1945d, f0Var, this.f1946e, null);
            this.f1942a = 1;
            if (yk.g.e0(dVar, l0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
