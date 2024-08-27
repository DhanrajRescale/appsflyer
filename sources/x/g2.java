package x;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class g2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f39567a = new Object();

    @Override // x.c2
    public final boolean a() {
        return true;
    }

    @Override // x.c2
    public final b2 b(View view, boolean z10, long j10, float f10, float f11, boolean z11, w2.b bVar, float f12) {
        if (z10) {
            return new d2(new Magnifier(view));
        }
        long s02 = bVar.s0(j10);
        float c02 = bVar.c0(f10);
        float c03 = bVar.c0(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (s02 != 9205357640488583168L) {
            builder.setSize(ku.c.b(m1.f.e(s02)), ku.c.b(m1.f.c(s02)));
        }
        if (!Float.isNaN(c02)) {
            builder.setCornerRadius(c02);
        }
        if (!Float.isNaN(c03)) {
            builder.setElevation(c03);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new d2(builder.build());
    }
}
