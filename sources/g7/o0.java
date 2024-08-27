package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.z f16965a;

    /* renamed from: b, reason: collision with root package name */
    public int f16966b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tu.f f16969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.c f16970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Object obj, tu.f fVar, hu.c cVar, yt.a aVar) {
        super(2, aVar);
        this.f16968d = obj;
        this.f16969e = fVar;
        this.f16970f = cVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        o0 o0Var = new o0(this.f16968d, this.f16969e, this.f16970f, aVar);
        o0Var.f16967c = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        iu.z zVar;
        tu.g gVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16966b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = this.f16965a;
            gVar = (tu.g) this.f16967c;
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            tu.g gVar2 = (tu.g) this.f16967c;
            zVar = new iu.z();
            Object obj2 = this.f16968d;
            zVar.f20560a = obj2;
            this.f16967c = gVar2;
            this.f16965a = zVar;
            this.f16966b = 1;
            if (gVar2.a(obj2, this) == aVar) {
                return aVar;
            }
            gVar = gVar2;
        }
        n0 n0Var = new n0(zVar, this.f16970f, gVar);
        this.f16967c = null;
        this.f16965a = null;
        this.f16966b = 2;
        if (this.f16969e.c(n0Var, this) == aVar) {
            return aVar;
        }
        return Unit.f23355a;
    }
}
