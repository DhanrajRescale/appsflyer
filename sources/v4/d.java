package v4;

import android.view.animation.Interpolator;
import s0.g;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37695a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37696b;

    public d(float[] fArr) {
        this.f37695a = fArr;
        this.f37696b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= g.f34069a) {
            return g.f34069a;
        }
        float[] fArr = this.f37695a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f37696b;
        float f12 = (f10 - (min * f11)) / f11;
        float f13 = fArr[min];
        return nn.d.b(fArr[min + 1], f13, f12, f13);
    }
}
