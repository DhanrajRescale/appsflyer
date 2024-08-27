package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f31472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.n f31473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, d dVar, a0.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f31471b = qVar;
        this.f31472c = dVar;
        this.f31473d = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f31471b, this.f31472c, this.f31473d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31470a;
        a0.n nVar = this.f31473d;
        d dVar = this.f31472c;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                q qVar = this.f31471b;
                this.f31470a = 1;
                if (qVar.a(this) == aVar) {
                    return aVar;
                }
            }
            dVar.f31477u.i(nVar);
            c2.g.s(dVar);
            return Unit.f23355a;
        } catch (Throwable th2) {
            dVar.f31477u.i(nVar);
            c2.g.s(dVar);
            throw th2;
        }
    }
}
