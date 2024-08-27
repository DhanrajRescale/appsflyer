package o1;

/* loaded from: classes.dex */
public final class m extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f29412d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f29413e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f29414f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f29415g;

    static {
        float[] k02 = t0.t.k0(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, t0.t.B(b.f29368b.f29369a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f29412d = k02;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f29413e = fArr;
        f29414f = t0.t.X(k02);
        f29415g = t0.t.X(fArr);
    }

    @Override // o1.d
    public final float a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // o1.d
    public final float b(int i10) {
        if (i10 == 0) {
            return s0.g.f34069a;
        }
        return -0.5f;
    }

    @Override // o1.d
    public final long d(float f10, float f11, float f12) {
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f29415g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f29414f;
        float f20 = (fArr2[6] * f19) + (fArr2[3] * f18) + (fArr2[0] * f17);
        float f21 = (fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17);
        return (Float.floatToRawIntBits(f21) & 4294967295L) | (Float.floatToRawIntBits(f20) << 32);
    }

    @Override // o1.d
    public final float e(float f10, float f11, float f12) {
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f29415g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f29414f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // o1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float[] fArr = f29412d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float Y = hl.f.Y(f14);
        float Y2 = hl.f.Y(f15);
        float Y3 = hl.f.Y(f16);
        float[] fArr2 = f29413e;
        return androidx.compose.ui.graphics.a.b((fArr2[6] * Y3) + (fArr2[3] * Y2) + (fArr2[0] * Y), (fArr2[7] * Y3) + (fArr2[4] * Y2) + (fArr2[1] * Y), (fArr2[8] * Y3) + (fArr2[5] * Y2) + (fArr2[2] * Y), f13, dVar);
    }
}
