package t3;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f35291a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35292b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35293c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35294d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35295e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35296f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f35291a = f10;
        this.f35292b = f11;
        this.f35293c = f12;
        this.f35294d = f13;
        this.f35295e = f14;
        this.f35296f = f15;
    }

    public static a a(int i10) {
        float f10;
        q qVar = q.f35327k;
        float d10 = b.d(Color.red(i10));
        float d11 = b.d(Color.green(i10));
        float d12 = b.d(Color.blue(i10));
        float[][] fArr = b.f35300d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * d12) + (fArr2[1] * d11) + (fArr2[0] * d10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * d12) + (fArr3[1] * d11) + (fArr3[0] * d10);
        float[] fArr4 = fArr[2];
        float f13 = (d12 * fArr4[2]) + (d11 * fArr4[1]) + (d10 * fArr4[0]);
        float[][] fArr5 = b.f35297a;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = (fArr7[2] * f13) + (fArr7[1] * f12) + (fArr7[0] * f11);
        float[] fArr8 = fArr5[2];
        float f16 = (f13 * fArr8[2]) + (f12 * fArr8[1]) + (f11 * fArr8[0]);
        float[] fArr9 = qVar.f35334g;
        float f17 = fArr9[0] * f14;
        float f18 = fArr9[1] * f15;
        float f19 = fArr9[2] * f16;
        float abs = Math.abs(f17);
        float f20 = qVar.f35335h;
        float pow = (float) Math.pow((abs * f20) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f18) * f20) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f19) * f20) / 100.0d, 0.42d);
        float signum = ((Math.signum(f17) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d13 = signum3;
        float f21 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d13)) / 11.0f;
        float f22 = ((float) ((signum + signum2) - (d13 * 2.0d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = ((21.0f * signum3) + ((signum * 20.0f) + f23)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (atan2 < s0.g.f34069a) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float f28 = f25 * qVar.f35329b;
        float f29 = qVar.f35328a;
        float f30 = qVar.f35331d;
        float pow4 = ((float) Math.pow(f28 / f29, qVar.f35337j * f30)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f31 = f29 + 4.0f;
        if (f26 < 20.14d) {
            f10 = 360.0f + f26;
        } else {
            f10 = f26;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, qVar.f35333f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.f35332e) * qVar.f35330c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f32 = qVar.f35336i * pow5;
        Math.sqrt((r3 * f30) / f31);
        float f33 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f32 * 0.0228f) + 1.0f)) * 43.85965f;
        double d14 = f27;
        return new a(f26, pow5, pow4, f33, log * ((float) Math.cos(d14)), log * ((float) Math.sin(d14)));
    }

    public static a b(float f10, float f11, float f12) {
        q qVar = q.f35327k;
        float f13 = qVar.f35331d;
        Math.sqrt(f10 / 100.0d);
        float f14 = qVar.f35328a + 4.0f;
        float f15 = qVar.f35336i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * qVar.f35331d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(q qVar) {
        float f10;
        float f11 = this.f35292b;
        double d10 = f11;
        float f12 = this.f35293c;
        if (d10 != 0.0d) {
            double d11 = f12;
            if (d11 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d11 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, qVar.f35333f), 0.73d), 1.1111111111111112d);
                double d12 = (this.f35291a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = qVar.f35328a * ((float) Math.pow(f12 / 100.0d, (1.0d / qVar.f35331d) / qVar.f35337j));
                float f13 = cos * 3846.1538f * qVar.f35332e * qVar.f35330c;
                float f14 = pow2 / qVar.f35329b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f13 * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19)));
                float signum = Math.signum(f19);
                float f22 = 100.0f / qVar.f35335h;
                float pow3 = signum * f22 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum3 = Math.signum(f21) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float[] fArr = qVar.f35334g;
                float f23 = pow3 / fArr[0];
                float f24 = signum2 / fArr[1];
                float f25 = signum3 / fArr[2];
                float[][] fArr2 = b.f35298b;
                float[] fArr3 = fArr2[0];
                float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr2[2];
                return u3.a.a(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
            }
        }
        f10 = s0.g.f34069a;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, qVar.f35333f), 0.73d), 1.1111111111111112d);
        double d122 = (this.f35291a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = qVar.f35328a * ((float) Math.pow(f12 / 100.0d, (1.0d / qVar.f35331d) / qVar.f35337j));
        float f132 = cos3 * 3846.1538f * qVar.f35332e * qVar.f35330c;
        float f142 = pow22 / qVar.f35329b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f152 = (((0.305f + f142) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f132 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192)));
        float signum4 = Math.signum(f192);
        float f222 = 100.0f / qVar.f35335h;
        float pow32 = signum4 * f222 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum32 = Math.signum(f212) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float[] fArr6 = qVar.f35334g;
        float f232 = pow32 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float f252 = signum32 / fArr6[2];
        float[][] fArr22 = b.f35298b;
        float[] fArr32 = fArr22[0];
        float f262 = (fArr32[2] * f252) + (fArr32[1] * f242) + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = (fArr42[2] * f252) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr22[2];
        return u3.a.a(f262, f272, (f252 * fArr52[2]) + (f242 * fArr52[1]) + (f232 * fArr52[0]));
    }
}
