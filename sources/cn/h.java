package cn;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f8264a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f8265b = 50;

    /* renamed from: c, reason: collision with root package name */
    public static int f8266c = 8000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f8267d;

    /* renamed from: e, reason: collision with root package name */
    public static final Rect f8268e;

    /* renamed from: f, reason: collision with root package name */
    public static final Paint.FontMetrics f8269f;

    /* renamed from: g, reason: collision with root package name */
    public static final Rect f8270g;

    /* renamed from: h, reason: collision with root package name */
    public static final vm.b f8271h;

    /* renamed from: i, reason: collision with root package name */
    public static final Rect f8272i;

    /* renamed from: j, reason: collision with root package name */
    public static final Paint.FontMetrics f8273j;

    static {
        Double.longBitsToDouble(1L);
        f8267d = Float.intBitsToFloat(1);
        f8268e = new Rect();
        f8269f = new Paint.FontMetrics();
        f8270g = new Rect();
        f8271h = new vm.b(1);
        new Rect();
        f8272i = new Rect();
        f8273j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f8268e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static b b(Paint paint, String str) {
        b b10 = b.b(s0.g.f34069a, s0.g.f34069a);
        Rect rect = f8270g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        b10.f8241b = rect.width();
        b10.f8242c = rect.height();
        return b10;
    }

    public static float c(float f10) {
        DisplayMetrics displayMetrics = f8264a;
        if (displayMetrics == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f10;
        }
        return f10 * displayMetrics.density;
    }

    public static float d(double d10) {
        double d11;
        if (!Double.isInfinite(d10) && !Double.isNaN(d10) && d10 != 0.0d) {
            if (d10 < 0.0d) {
                d11 = -d10;
            } else {
                d11 = d10;
            }
            float pow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d11))));
            return ((float) Math.round(d10 * pow)) / pow;
        }
        return s0.g.f34069a;
    }
}
