package x;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class f2 extends d2 {
    @Override // x.d2, x.b2
    public final void a(long j10, long j11, float f10) {
        boolean isNaN = Float.isNaN(f10);
        Magnifier magnifier = this.f39529a;
        if (!isNaN) {
            magnifier.setZoom(f10);
        }
        if (t0.t.e0(j11)) {
            magnifier.show(m1.c.d(j10), m1.c.e(j10), m1.c.d(j11), m1.c.e(j11));
        } else {
            magnifier.show(m1.c.d(j10), m1.c.e(j10));
        }
    }
}
