package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2.a f26753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f26755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(boolean z10, i2.a aVar, g1.o oVar, k1 k1Var, int i10) {
        super(2);
        this.f26752a = z10;
        this.f26753b = aVar;
        this.f26754c = oVar;
        this.f26755d = k1Var;
        this.f26756e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u0.b(this.f26752a, this.f26753b, this.f26754c, this.f26755d, (t0.n) obj, t0.t.H0(this.f26756e | 1));
        return Unit.f23355a;
    }
}
