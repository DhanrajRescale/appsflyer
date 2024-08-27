package d2;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.i1 f13708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2 f13709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(tu.i1 i1Var, i2 i2Var, yt.a aVar) {
        super(2, aVar);
        this.f13708b = i1Var;
        this.f13709c = i2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z3(this.f13708b, this.f13709c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((z3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f13707a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            y3 y3Var = new y3(this.f13709c, 0);
            this.f13707a = 1;
            if (this.f13708b.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
