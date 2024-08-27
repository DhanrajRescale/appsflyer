package d2;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class l1 implements j3 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f13498a;

    public l1(ViewConfiguration viewConfiguration) {
        this.f13498a = viewConfiguration;
    }

    @Override // d2.j3
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // d2.j3
    public final void b() {
    }

    @Override // d2.j3
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // d2.j3
    public final float e() {
        return this.f13498a.getScaledMaximumFlingVelocity();
    }

    @Override // d2.j3
    public final float f() {
        return this.f13498a.getScaledTouchSlop();
    }
}
