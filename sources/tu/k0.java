package tu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36484a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f36486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f36487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f fVar, p0 p0Var, Object obj, yt.a aVar) {
        super(2, aVar);
        this.f36486c = fVar;
        this.f36487d = p0Var;
        this.f36488e = obj;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        k0 k0Var = new k0(this.f36486c, this.f36487d, this.f36488e, aVar);
        k0Var.f36485b = obj;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((z0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f36484a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            int ordinal = ((z0) this.f36485b).ordinal();
            p0 p0Var = this.f36487d;
            if (ordinal != 0) {
                if (ordinal == 2) {
                    kp.g gVar = x0.f36585a;
                    Object obj2 = this.f36488e;
                    if (obj2 == gVar) {
                        p0Var.d();
                    } else {
                        p0Var.f(obj2);
                    }
                }
            } else {
                this.f36484a = 1;
                if (this.f36486c.c(p0Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
