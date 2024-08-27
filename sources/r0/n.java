package r0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32596a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.d f32598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f32599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hu.d dVar, t tVar, yt.a aVar) {
        super(2, aVar);
        this.f32598c = dVar;
        this.f32599d = tVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n nVar = new n(this.f32598c, this.f32599d, aVar);
        nVar.f32597b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((Pair) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32596a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Pair pair = (Pair) this.f32597b;
            f1 f1Var = (f1) pair.f23353a;
            p pVar = this.f32599d.f32728m;
            this.f32596a = 1;
            if (this.f32598c.g(pVar, f1Var, pair.f23354b, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
