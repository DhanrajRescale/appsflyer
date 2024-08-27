package uh;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1.m;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37193a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p1.h Canvas = (p1.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        n1.h h10 = androidx.compose.ui.graphics.a.h();
        float f10 = 2;
        h10.f(m1.f.e(Canvas.d()) / f10, s0.g.f34069a);
        h10.e(m1.f.e(Canvas.d()), m1.f.c(Canvas.d()));
        h10.e(s0.g.f34069a, m1.f.c(Canvas.d()));
        h10.c();
        p1.h.C(Canvas, h10, androidx.compose.ui.graphics.a.d(4279900698L), s0.g.f34069a, null, 60);
        n1.h h11 = androidx.compose.ui.graphics.a.h();
        float f11 = 1;
        h11.f(s0.g.f34069a, m1.f.c(Canvas.d()) - Canvas.c0(f11));
        h11.e(m1.f.e(Canvas.d()) / f10, s0.g.f34069a);
        h11.c();
        float f12 = (float) 1.5d;
        p1.h.C(Canvas, h11, androidx.compose.ui.graphics.a.d(4288914339L), s0.g.f34069a, new m(Canvas.c0(f12), s0.g.f34069a, 0, 0, null, 30), 52);
        n1.h h12 = androidx.compose.ui.graphics.a.h();
        h12.f(m1.f.e(Canvas.d()), m1.f.c(Canvas.d()) - Canvas.c0(f11));
        h12.e(m1.f.e(Canvas.d()) / f10, s0.g.f34069a);
        h12.c();
        p1.h.C(Canvas, h12, androidx.compose.ui.graphics.a.d(4288914339L), s0.g.f34069a, new m(Canvas.c0(f12), s0.g.f34069a, 0, 0, null, 30), 52);
        n1.h h13 = androidx.compose.ui.graphics.a.h();
        h13.f(s0.g.f34069a, m1.f.c(Canvas.d()));
        h13.e(m1.f.e(Canvas.d()), m1.f.c(Canvas.d()));
        p1.h.C(Canvas, h13, androidx.compose.ui.graphics.a.d(4279900698L), s0.g.f34069a, new m(Canvas.c0(f11), s0.g.f34069a, 0, 0, null, 30), 52);
        return Unit.f23355a;
    }
}
