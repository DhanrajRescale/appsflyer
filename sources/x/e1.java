package x;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class e1 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f39541a;

    /* renamed from: b, reason: collision with root package name */
    public float f39542b;

    public e1(Context context) {
        super(context);
        this.f39541a = yk.j.n(context).f38779a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f39542b = s0.g.f34069a;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f39542b = s0.g.f34069a;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f39542b = s0.g.f34069a;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f39542b = s0.g.f34069a;
        super.onPull(f10);
    }
}
