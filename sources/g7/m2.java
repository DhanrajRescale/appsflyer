package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16917a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su.g f16919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f16920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(t2 t2Var, yt.a aVar, su.g gVar) {
        super(2, aVar);
        this.f16919c = gVar;
        this.f16920d = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        m2 m2Var = new m2(this.f16920d, aVar, this.f16919c);
        m2Var.f16918b = obj;
        return m2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16917a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f16918b;
            tu.b E = el.l.E(this.f16919c);
            l2 l2Var = new l2(this.f16920d, f0Var);
            this.f16917a = 1;
            if (E.c(l2Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
