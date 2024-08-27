package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f18799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(w.d dVar, yt.a aVar) {
        super(2, aVar);
        this.f18799b = dVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b2(this.f18799b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18798a;
        w.d dVar = this.f18799b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            Float f10 = new Float(1.0f);
            this.f18798a = 1;
            if (dVar.e(f10, this) == aVar) {
                return aVar;
            }
        }
        Float f11 = new Float(s0.g.f34069a);
        w.k0 k0Var = d2.f18832a;
        this.f18798a = 2;
        if (w.d.c(dVar, f11, k0Var, this) == aVar) {
            return aVar;
        }
        return Unit.f23355a;
    }
}
