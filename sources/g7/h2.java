package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f16809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j4 f16810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(t2 t2Var, j4 j4Var, yt.a aVar) {
        super(2, aVar);
        this.f16809b = t2Var;
        this.f16810c = j4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h2(this.f16809b, this.f16810c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16808a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.b E = el.l.E(this.f16809b.f17072i);
            t1 t1Var = new t1(this.f16810c, 1);
            this.f16808a = 1;
            if (E.c(t1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
