package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f2999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.l0 f3000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f3001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f3004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a2.a1 a1Var, a2.l0 l0Var, a2.o0 o0Var, int i10, int i11, v vVar) {
        super(1);
        this.f2999a = a1Var;
        this.f3000b = l0Var;
        this.f3001c = o0Var;
        this.f3002d = i10;
        this.f3003e = i11;
        this.f3004f = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s.b((a2.z0) obj, this.f2999a, this.f3000b, this.f3001c.getLayoutDirection(), this.f3002d, this.f3003e, this.f3004f.f3021a);
        return Unit.f23355a;
    }
}
