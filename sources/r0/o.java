package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f32619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f32620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.d f32622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Object obj, hu.d dVar, yt.a aVar) {
        super(1, aVar);
        this.f32620b = tVar;
        this.f32621c = obj;
        this.f32622d = dVar;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new o(this.f32620b, this.f32621c, this.f32622d, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32619a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Object obj2 = this.f32621c;
            t tVar = this.f32620b;
            tVar.i(obj2);
            r rVar = new r(tVar, 2);
            n nVar = new n(this.f32622d, tVar, null);
            this.f32619a = 1;
            if (al.d.J(rVar, nVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
