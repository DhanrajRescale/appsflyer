package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public u2 f17033a;

    /* renamed from: b, reason: collision with root package name */
    public yu.d f17034b;

    /* renamed from: c, reason: collision with root package name */
    public t2 f17035c;

    /* renamed from: d, reason: collision with root package name */
    public int f17036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f17037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, yt.a aVar) {
        super(2, aVar);
        this.f17037e = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r2(this.f17037e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        u2 u2Var;
        yu.d dVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17036d;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ut.n.b(obj);
                        return Unit.f23355a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t2Var = this.f17035c;
                dVar = this.f17034b;
                u2Var = this.f17033a;
                ut.n.b(obj);
            } else {
                ut.n.b(obj);
                t2Var = this.f17037e;
                u2Var = t2Var.f17073j;
                yu.d dVar2 = u2Var.f17084a;
                this.f17033a = u2Var;
                this.f17034b = dVar2;
                this.f17035c = t2Var;
                this.f17036d = 1;
                if (dVar2.b(null, this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            }
            y2 y2Var = u2Var.f17085b;
            tu.r rVar = new tu.r(new x2(y2Var, null), el.l.E(y2Var.f17144i));
            dVar.a(null);
            b1 b1Var = b1.f16664b;
            this.f17033a = null;
            this.f17034b = null;
            this.f17035c = null;
            this.f17036d = 2;
            if (t2.a(t2Var, rVar, b1Var, this) == aVar) {
                return aVar;
            }
            return Unit.f23355a;
        } catch (Throwable th2) {
            dVar.a(null);
            throw th2;
        }
    }
}
