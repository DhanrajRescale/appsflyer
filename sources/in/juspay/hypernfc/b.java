package in.juspay.hypernfc;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float lambda$createRingAnimator$0;
        lambda$createRingAnimator$0 = Wave.lambda$createRingAnimator$0(f10);
        return lambda$createRingAnimator$0;
    }
}
