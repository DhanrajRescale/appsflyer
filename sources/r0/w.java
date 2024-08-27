package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f32783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f32784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f32787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f32788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f32789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, g1.o oVar, float f10, float f11, n1.x0 x0Var, long j10, int i10, int i11) {
        super(2);
        this.f32783a = xVar;
        this.f32784b = oVar;
        this.f32785c = f10;
        this.f32786d = f11;
        this.f32787e = x0Var;
        this.f32788f = j10;
        this.f32789g = i10;
        this.f32790h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f32783a.a(this.f32784b, this.f32785c, this.f32786d, this.f32787e, this.f32788f, (t0.n) obj, t0.t.H0(this.f32789g | 1), this.f32790h);
        return Unit.f23355a;
    }
}
