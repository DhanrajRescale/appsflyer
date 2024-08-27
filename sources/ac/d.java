package ac;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j10, long j11, w.d dVar, float f10) {
        super(1);
        this.f325a = j10;
        this.f326b = dVar;
        this.f327c = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p1.h drawTrackAndThumb = (p1.h) obj;
        Intrinsics.checkNotNullParameter(drawTrackAndThumb, "$this$Canvas");
        long j10 = this.f325a;
        float floatValue = ((Number) this.f326b.d()).floatValue();
        float c02 = drawTrackAndThumb.c0(this.f327c);
        float e10 = m1.f.e(drawTrackAndThumb.d());
        float c10 = m1.f.c(drawTrackAndThumb.d());
        Intrinsics.checkNotNullParameter(drawTrackAndThumb, "$this$drawTrackAndThumb");
        float f10 = c10 / 2;
        p1.h.A(drawTrackAndThumb, j10, 0L, t.j(e10, c10), t.a(f10, f10), null, 242);
        p1.h.T(drawTrackAndThumb, n1.t.f28173e, c02, t.g(floatValue + c02, f10), 120);
        return Unit.f23355a;
    }
}
