package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.a f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f2816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a2.a aVar, float f10, int i10, int i11, int i12, a2.a1 a1Var, int i13) {
        super(1);
        this.f2811a = aVar;
        this.f2812b = f10;
        this.f2813c = i10;
        this.f2814d = i11;
        this.f2815e = i12;
        this.f2816f = a1Var;
        this.f2817g = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        a2.z0 z0Var = (a2.z0) obj;
        boolean z10 = this.f2811a instanceof a2.p;
        a2.a1 a1Var = this.f2816f;
        int i11 = this.f2815e;
        int i12 = this.f2813c;
        float f10 = this.f2812b;
        if (z10) {
            i10 = 0;
        } else if (!w2.e.a(f10, Float.NaN)) {
            i10 = i12;
        } else {
            i10 = (this.f2814d - i11) - a1Var.f29a;
        }
        if (!z10) {
            i12 = 0;
        } else if (w2.e.a(f10, Float.NaN)) {
            i12 = (this.f2817g - i11) - a1Var.f30b;
        }
        a2.z0.g(z0Var, a1Var, i10, i12);
        return Unit.f23355a;
    }
}
