package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37428a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f37430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, yt.a aVar) {
        super(2, aVar);
        this.f37430c = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e eVar = new e(this.f37430c, aVar);
        eVar.f37429b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((su.n) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37428a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            su.n nVar = (su.n) this.f37429b;
            this.f37428a = 1;
            if (this.f37430c.h(nVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
