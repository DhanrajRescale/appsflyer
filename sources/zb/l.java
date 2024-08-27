package zb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f42285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f42286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f42288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f42289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f42290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f42291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, long j10, long j11) {
        super(1);
        this.f42283a = f10;
        this.f42284b = f11;
        this.f42285c = f12;
        this.f42286d = f14;
        this.f42287e = z10;
        this.f42288f = z11;
        this.f42289g = f15;
        this.f42290h = j10;
        this.f42291i = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long d10;
        p1.h Canvas = (p1.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float e10 = m1.f.e(Canvas.d());
        float c10 = m1.f.c(Canvas.d());
        float f10 = this.f42283a;
        float f11 = f10 + this.f42284b;
        float f12 = e10 * this.f42285c;
        float f13 = e10 * this.f42286d;
        int i10 = 0;
        for (int i11 = (int) (e10 / f11); i10 < i11; i11 = i11) {
            float f14 = i10 * f11;
            float f15 = f14 + f10;
            boolean z10 = true;
            boolean z11 = this.f42287e;
            boolean z12 = this.f42288f;
            if (!z11 ? f14 > this.f42289g * e10 : !z12 ? f14 < f13 : f14 < f12) {
                z10 = false;
            }
            if (z10 && !z12) {
                d10 = this.f42290h;
            } else if (z10 && z12) {
                d10 = this.f42291i;
            } else {
                d10 = androidx.compose.ui.graphics.a.d(4292138196L);
            }
            float f16 = c10 / 2;
            p1.h.v0(Canvas, d10, t0.t.g(f14, f16), t0.t.g(f15, f16), c10, 0, 496);
            i10++;
        }
        return Unit.f23355a;
    }
}
