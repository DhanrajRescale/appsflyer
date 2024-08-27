package qm;

import android.animation.TimeInterpolator;

/* loaded from: classes2.dex */
public final class b implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32091a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11;
        float f12;
        float f13;
        switch (this.f32091a) {
            case 10:
                return f10;
            case 17:
                return 1.0f - c.f32094c.getInterpolation(1.0f - f10);
            case 18:
                if (f10 < 0.36363637f) {
                    return 7.5625f * f10 * f10;
                }
                if (f10 < 0.72727275f) {
                    float f14 = f10 - 0.54545456f;
                    f11 = 7.5625f * f14 * f14;
                    f12 = 0.75f;
                } else if (f10 < 0.90909094f) {
                    float f15 = f10 - 0.8181818f;
                    f11 = 7.5625f * f15 * f15;
                    f12 = 0.9375f;
                } else {
                    float f16 = f10 - 0.95454544f;
                    f11 = 7.5625f * f16 * f16;
                    f12 = 0.984375f;
                }
                return f11 + f12;
            default:
                float f17 = f10 * 2.0f;
                if (f17 < 1.0f) {
                    f13 = 0.5f * f17;
                } else {
                    float f18 = f17 - 1.0f;
                    f13 = ((f18 - 2.0f) * f18) - 1.0f;
                    f17 = -0.5f;
                }
                return f13 * f17;
        }
    }
}
