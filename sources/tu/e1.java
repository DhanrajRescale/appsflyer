package tu;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36433a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f36435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, yt.a aVar) {
        super(2, aVar);
        this.f36435c = i1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e1 e1Var = new e1(this.f36435c, aVar);
        e1Var.f36434b = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((e1) create((g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f36433a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            int i11 = 10;
            a0.f fVar = new a0.f(i11, new iu.v(), (g) this.f36434b);
            this.f36433a = 1;
            if (this.f36435c.c(fVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
