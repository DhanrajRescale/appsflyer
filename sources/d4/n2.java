package d4;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class n2 extends o2 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f13794e;

    public n2(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f13794e = windowInsetsAnimation;
    }

    @Override // d4.o2
    public final long a() {
        long durationMillis;
        durationMillis = this.f13794e.getDurationMillis();
        return durationMillis;
    }

    @Override // d4.o2
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f13794e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // d4.o2
    public final int c() {
        int typeMask;
        typeMask = this.f13794e.getTypeMask();
        return typeMask;
    }

    @Override // d4.o2
    public final void d(float f10) {
        this.f13794e.setFraction(f10);
    }
}
