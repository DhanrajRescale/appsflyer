package s;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f34019a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f34019a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f34019a) * f11) + (f10 * 1.5f));
        }
        return f10 * 1.5f;
    }
}
