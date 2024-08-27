package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f2832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f2834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, int i10, a2.a1 a1Var, int i11, a2.o0 o0Var) {
        super(1);
        this.f2830a = c2Var;
        this.f2831b = i10;
        this.f2832c = a1Var;
        this.f2833d = i11;
        this.f2834e = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function2 function2 = this.f2830a.f2845p;
        a2.a1 a1Var = this.f2832c;
        a2.z0.f((a2.z0) obj, a1Var, ((w2.h) function2.invoke(new w2.j(hl.f.k(this.f2831b - a1Var.f29a, this.f2833d - a1Var.f30b)), this.f2834e.getLayoutDirection())).f38793a);
        return Unit.f23355a;
    }
}
