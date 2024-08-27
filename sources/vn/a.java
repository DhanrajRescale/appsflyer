package vn;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f38180a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final v4.b f38181b = new v4.b();

    /* renamed from: c, reason: collision with root package name */
    public static final v4.a f38182c = new v4.a();

    /* renamed from: d, reason: collision with root package name */
    public static final v4.c f38183d = new v4.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f38184e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return nn.d.b(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        if (f14 >= f13) {
            return f11;
        }
        return a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, float f10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
