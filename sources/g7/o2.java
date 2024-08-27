package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.d f16976a;

    /* renamed from: b, reason: collision with root package name */
    public tu.g f16977b;

    /* renamed from: c, reason: collision with root package name */
    public int f16978c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f16980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(t2 t2Var, yt.a aVar) {
        super(2, aVar);
        this.f16980e = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        o2 o2Var = new o2(this.f16980e, aVar);
        o2Var.f16979d = obj;
        return o2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o2) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        tu.g gVar;
        u2 u2Var;
        yu.d dVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16978c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ut.n.b(obj);
                        return Unit.f23355a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = this.f16977b;
                dVar = this.f16976a;
                u2Var = (u2) this.f16979d;
                ut.n.b(obj);
            } else {
                ut.n.b(obj);
                gVar = (tu.g) this.f16979d;
                u2Var = this.f16980e.f17073j;
                yu.d dVar2 = u2Var.f17084a;
                this.f16979d = u2Var;
                this.f16976a = dVar2;
                this.f16977b = gVar;
                this.f16978c = 1;
                if (dVar2.b(null, this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            }
            a1 X = u2Var.f17085b.f17147l.X();
            dVar.a(null);
            h1 h1Var = new h1(X, null);
            this.f16979d = null;
            this.f16976a = null;
            this.f16977b = null;
            this.f16978c = 2;
            if (gVar.a(h1Var, this) == aVar) {
                return aVar;
            }
            return Unit.f23355a;
        } catch (Throwable th2) {
            dVar.a(null);
            throw th2;
        }
    }
}
