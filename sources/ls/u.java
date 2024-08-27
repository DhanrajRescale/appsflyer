package ls;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class u implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return ((float) (-(Math.cos(f10 * 12.0f) * Math.pow(2.718281828459045d, (-8.0f) * f10)))) + 1.0f;
    }
}
