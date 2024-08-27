package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f31481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w.n f31483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, float f10, w.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f31481b = g0Var;
        this.f31482c = f10;
        this.f31483d = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e0(this.f31481b, this.f31482c, this.f31483d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31480a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w.d dVar = (w.d) this.f31481b.f31493c;
            Float f10 = new Float(this.f31482c);
            this.f31480a = 1;
            if (w.d.c(dVar, f10, this.f31483d, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
