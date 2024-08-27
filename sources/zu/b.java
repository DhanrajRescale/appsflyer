package zu;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class b implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return Math.abs(1.0f - f10);
    }
}
