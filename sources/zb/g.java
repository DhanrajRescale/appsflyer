package zb;

import android.graphics.CornerPathEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.j0;
import vt.g0;
import vt.y;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f42266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f42267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, List list, double d10, double d11) {
        super(1);
        this.f42264a = z10;
        this.f42265b = list;
        this.f42266c = d10;
        this.f42267d = d11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        j0 R;
        p1.h Canvas = (p1.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        n1.h h10 = androidx.compose.ui.graphics.a.h();
        float e10 = m1.f.e(Canvas.d());
        List list = this.f42265b;
        float size = e10 / (list.size() - 1);
        double d10 = ((hb.f) g0.u(list)).f18169a;
        float c10 = m1.f.c(Canvas.d());
        double d11 = this.f42266c;
        double d12 = this.f42267d - d11;
        h10.f(s0.g.f34069a, c10 - ((float) (((d10 - d11) / d12) * c10)));
        double d13 = ((hb.f) g0.u(list)).f18169a;
        float c11 = m1.f.c(Canvas.d());
        int i11 = 0;
        float f10 = c11 - ((float) (((d13 - d11) / d12) * c11));
        float f11 = s0.g.f34069a;
        for (Iterator it = g0.r(list, 1).iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 >= 0) {
                float f12 = i12 * size;
                double d14 = ((hb.f) next).f18169a;
                float c12 = m1.f.c(Canvas.d());
                float f13 = size;
                float f14 = c12 - ((float) (((d14 - d11) / d12) * c12));
                float f15 = (f11 + f12) / 2;
                h10.f28138a.cubicTo(f15, f10, f15, f14, f12, f14);
                f10 = f14;
                f11 = f12;
                i11 = i12;
                size = f13;
            } else {
                y.j();
                throw null;
            }
        }
        boolean z10 = this.f42264a;
        if (!z10) {
            i10 = 1719467152;
        } else {
            i10 = 1727822972;
        }
        p1.h.C(Canvas, h10, androidx.compose.ui.graphics.a.c(i10), s0.g.f34069a, new p1.m(Canvas.c0((float) 0.5d), s0.g.f34069a, 0, 0, new n1.i(new CornerPathEffect(0.5f)), 14), 52);
        h10.e(m1.f.e(Canvas.d()), m1.f.c(Canvas.d()));
        h10.e(s0.g.f34069a, m1.f.c(Canvas.d()));
        h10.c();
        if (!z10) {
            R = kq.e.R(y.g(new n1.t(androidx.compose.ui.graphics.a.c(1717033837)), new n1.t(androidx.compose.ui.graphics.a.c(8191136))), m1.f.c(Canvas.d()), 8);
        } else {
            R = kq.e.R(y.g(new n1.t(androidx.compose.ui.graphics.a.c(1725650775)), new n1.t(androidx.compose.ui.graphics.a.c(16546940))), m1.f.c(Canvas.d()), 8);
        }
        p1.h.o0(Canvas, h10, R, s0.g.f34069a, null, 60);
        return Unit.f23355a;
    }
}
