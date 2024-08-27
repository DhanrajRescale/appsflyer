package o1;

/* loaded from: classes.dex */
public final class l extends d {
    @Override // o1.d
    public final float a(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // o1.d
    public final float b(int i10) {
        if (i10 == 0) {
            return s0.g.f34069a;
        }
        return -128.0f;
    }

    @Override // o1.d
    public final long d(float f10, float f11, float f12) {
        float f13;
        float f14;
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        if (f16 > 0.20689656f) {
            f13 = f16 * f16 * f16;
        } else {
            f13 = (f16 - 0.13793103f) * 0.12841855f;
        }
        if (f15 > 0.20689656f) {
            f14 = f15 * f15 * f15;
        } else {
            f14 = (f15 - 0.13793103f) * 0.12841855f;
        }
        float[] fArr = k.f29411e;
        float f17 = f13 * fArr[0];
        float f18 = f14 * fArr[1];
        return (Float.floatToRawIntBits(f18) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // o1.d
    public final float e(float f10, float f11, float f12) {
        float f13;
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f14 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        if (f14 > 0.20689656f) {
            f13 = f14 * f14 * f14;
        } else {
            f13 = 0.12841855f * (f14 - 0.13793103f);
        }
        return f13 * k.f29411e[2];
    }

    @Override // o1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float f14;
        float f15;
        float f16;
        float[] fArr = k.f29411e;
        float f17 = f10 / fArr[0];
        float f18 = f11 / fArr[1];
        float f19 = f12 / fArr[2];
        if (f17 > 0.008856452f) {
            f14 = (float) Math.cbrt(f17);
        } else {
            f14 = (f17 * 7.787037f) + 0.13793103f;
        }
        if (f18 > 0.008856452f) {
            f15 = (float) Math.cbrt(f18);
        } else {
            f15 = (f18 * 7.787037f) + 0.13793103f;
        }
        if (f19 > 0.008856452f) {
            f16 = (float) Math.cbrt(f19);
        } else {
            f16 = (f19 * 7.787037f) + 0.13793103f;
        }
        float f20 = (116.0f * f15) - 16.0f;
        float f21 = (f14 - f15) * 500.0f;
        float f22 = (f15 - f16) * 200.0f;
        if (f20 < s0.g.f34069a) {
            f20 = 0.0f;
        }
        if (f20 > 100.0f) {
            f20 = 100.0f;
        }
        if (f21 < -128.0f) {
            f21 = -128.0f;
        }
        float f23 = 128.0f;
        if (f21 > 128.0f) {
            f21 = 128.0f;
        }
        if (f22 < -128.0f) {
            f22 = -128.0f;
        }
        if (f22 <= 128.0f) {
            f23 = f22;
        }
        return androidx.compose.ui.graphics.a.b(f20, f21, f23, f13, dVar);
    }
}
