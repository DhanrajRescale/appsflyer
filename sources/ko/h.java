package ko;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class h implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public FloatEvaluator f23320a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        float floatValue = this.f23320a.evaluate(f10, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = s0.g.f34069a;
        }
        return Float.valueOf(floatValue);
    }
}
