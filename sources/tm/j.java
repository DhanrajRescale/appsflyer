package tm;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class j extends a {
    public final int O;
    public final boolean G = true;
    public boolean H = true;
    public boolean I = false;
    public int J = -7829368;
    public float K = 1.0f;
    public final float L = 10.0f;
    public final float M = 10.0f;
    public final int N = 1;
    public final float P = Float.POSITIVE_INFINITY;

    public j(int i10) {
        this.O = i10;
        this.f36182c = s0.g.f34069a;
    }

    @Override // tm.a
    public final void b(float f10, float f11) {
        float f12;
        float f13;
        if (Math.abs(f11 - f10) == s0.g.f34069a) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        float abs = Math.abs(f11 - f10);
        if (this.B) {
            f12 = this.E;
        } else {
            f12 = f10 - ((abs / 100.0f) * this.M);
        }
        this.E = f12;
        if (this.C) {
            f13 = this.D;
        } else {
            f13 = f11 + ((abs / 100.0f) * this.L);
        }
        this.D = f13;
        this.F = Math.abs(f12 - f13);
    }

    public final float f(Paint paint) {
        paint.setTextSize(this.f36183d);
        String c10 = c();
        DisplayMetrics displayMetrics = cn.h.f8264a;
        float measureText = (this.f36181b * 2.0f) + ((int) paint.measureText(c10));
        float f10 = this.P;
        if (f10 > s0.g.f34069a && f10 != Float.POSITIVE_INFINITY) {
            f10 = cn.h.c(f10);
        }
        if (f10 <= 0.0d) {
            f10 = measureText;
        }
        return Math.max(s0.g.f34069a, Math.min(measureText, f10));
    }
}
