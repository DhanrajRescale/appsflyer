package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f26517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.j f26518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(j3 j3Var, a0.j jVar, yt.a aVar) {
        super(2, aVar);
        this.f26517b = j3Var;
        this.f26518c = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n1(this.f26517b, this.f26518c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26516a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f26516a = 1;
            if (this.f26517b.a(this.f26518c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
