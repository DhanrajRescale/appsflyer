package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f40914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f40915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, float f10, yt.a aVar) {
        super(2, aVar);
        this.f40914b = t1Var;
        this.f40915c = f10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r1(this.f40914b, this.f40915c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40913a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            j2 j2Var = this.f40914b.f40958p;
            this.f40913a = 1;
            if (j2Var.c(this.f40915c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
