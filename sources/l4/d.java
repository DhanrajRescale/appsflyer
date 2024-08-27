package l4;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23953a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f23953a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 1:
                return f10 * f10 * f10 * f10 * f10;
            case 2:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            case 3:
                float f13 = f10 - 1.0f;
                return (f13 * f13 * f13 * f13 * f13) + 1.0f;
            default:
                float f14 = f10 - 1.0f;
                return (f14 * f14 * f14 * f14 * f14) + 1.0f;
        }
    }
}
