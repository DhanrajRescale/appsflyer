package o1;

/* loaded from: classes.dex */
public final class u extends d {
    @Override // o1.d
    public final float a(int i10) {
        return 2.0f;
    }

    @Override // o1.d
    public final float b(int i10) {
        return -2.0f;
    }

    @Override // o1.d
    public final long d(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f13 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 <= 2.0f) {
            f13 = f11;
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
    }

    @Override // o1.d
    public final float e(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // o1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f14 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 <= 2.0f) {
            f14 = f12;
        }
        return androidx.compose.ui.graphics.a.b(f10, f11, f14, f13, dVar);
    }
}
