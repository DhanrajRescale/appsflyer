package x;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class d2 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f39529a;

    public d2(Magnifier magnifier) {
        this.f39529a = magnifier;
    }

    @Override // x.b2
    public void a(long j10, long j11, float f10) {
        this.f39529a.show(m1.c.d(j10), m1.c.e(j10));
    }

    public final void b() {
        this.f39529a.dismiss();
    }

    public final long c() {
        Magnifier magnifier = this.f39529a;
        return hl.f.k(magnifier.getWidth(), magnifier.getHeight());
    }

    public final void d() {
        this.f39529a.update();
    }
}
