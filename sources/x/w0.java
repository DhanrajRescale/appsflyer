package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f39762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, yt.a aVar) {
        super(2, aVar);
        this.f39762b = x0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w0(this.f39762b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39761a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            f0.f fVar = this.f39762b.f39773t;
            this.f39761a = 1;
            if (fVar.a(null, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
