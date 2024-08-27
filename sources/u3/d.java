package u3;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public char f36708a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f36709b;

    public d(char c10, float[] fArr) {
        this.f36708a = c10;
        this.f36709b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d10;
        double d11;
        boolean z12;
        double radians = Math.toRadians(f16);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = (d13 * sin) + (d12 * cos);
        double d15 = d12;
        double d16 = f14;
        double d17 = d14 / d16;
        double d18 = f15;
        double d19 = ((d13 * cos) + ((-f10) * sin)) / d18;
        double d20 = d13;
        double d21 = f13;
        double d22 = ((d21 * sin) + (f12 * cos)) / d16;
        double d23 = ((d21 * cos) + ((-f12) * sin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d28);
            float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d24 * sqrt2;
        double d31 = sqrt2 * d25;
        if (z10 == z11) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double atan2 = Math.atan2(d19 - d11, d17 - d10);
        double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
        if (atan22 >= 0.0d) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * cos) - (d33 * sin);
        double d35 = (d33 * cos) + (d32 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d36 = -d16;
        double d37 = d36 * cos2;
        double d38 = d18 * sin2;
        double d39 = (d37 * sin3) - (d38 * cos3);
        double d40 = d36 * sin2;
        double d41 = d18 * cos2;
        double d42 = (cos3 * d41) + (sin3 * d40);
        double d43 = d41;
        double d44 = atan22 / ceil;
        int i10 = 0;
        while (i10 < ceil) {
            double d45 = atan2 + d44;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d44;
            double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
            double d48 = d43;
            double d49 = d34;
            double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
            double d51 = (d37 * sin4) - (d38 * cos4);
            double d52 = (cos4 * d48) + (sin4 * d40);
            double d53 = d45 - atan2;
            double tan = Math.tan(d53 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(s0.g.f34069a, s0.g.f34069a);
            path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
            i10++;
            atan2 = d45;
            d40 = d40;
            cos2 = cos2;
            ceil = ceil;
            d42 = d52;
            d16 = d16;
            d39 = d51;
            d15 = d47;
            d20 = d50;
            d34 = d49;
            d44 = d46;
            d43 = d48;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int i10;
        int i11;
        char c10;
        d dVar;
        int i12;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        boolean z13;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i13 = 6;
        float[] fArr = new float[6];
        char c11 = 'm';
        int i14 = 0;
        char c12 = 'm';
        int i15 = 0;
        while (i15 < dVarArr.length) {
            d dVar2 = dVarArr[i15];
            char c13 = dVar2.f36708a;
            float f22 = fArr[i14];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    break;
            }
            i10 = 2;
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i16 = i14;
            while (true) {
                float[] fArr2 = dVar2.f36709b;
                if (i16 < fArr2.length) {
                    if (c13 != 'A') {
                        if (c13 != 'C') {
                            if (c13 != 'H') {
                                if (c13 != 'Q') {
                                    if (c13 != 'V') {
                                        if (c13 != 'a') {
                                            if (c13 != 'c') {
                                                if (c13 != 'h') {
                                                    if (c13 != 'q') {
                                                        if (c13 != 'v') {
                                                            if (c13 != 'L') {
                                                                if (c13 != 'M') {
                                                                    if (c13 != 'S') {
                                                                        if (c13 != 'T') {
                                                                            if (c13 != 'l') {
                                                                                if (c13 != c11) {
                                                                                    if (c13 != 's') {
                                                                                        if (c13 != 't') {
                                                                                            i11 = i16;
                                                                                        } else {
                                                                                            if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                                f21 = s0.g.f34069a;
                                                                                                f20 = s0.g.f34069a;
                                                                                            } else {
                                                                                                f20 = f30 - f24;
                                                                                                f21 = f31 - f25;
                                                                                            }
                                                                                            int i17 = i16 + 1;
                                                                                            path.rQuadTo(f20, f21, fArr2[i16], fArr2[i17]);
                                                                                            float f32 = f20 + f30;
                                                                                            float f33 = f21 + f31;
                                                                                            f30 += fArr2[i16];
                                                                                            f31 += fArr2[i17];
                                                                                            f25 = f33;
                                                                                            i11 = i16;
                                                                                            c10 = c13;
                                                                                            dVar = dVar2;
                                                                                            i12 = i15;
                                                                                            f24 = f32;
                                                                                        }
                                                                                    } else {
                                                                                        if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                            f18 = s0.g.f34069a;
                                                                                            f19 = s0.g.f34069a;
                                                                                        } else {
                                                                                            float f34 = f30 - f24;
                                                                                            f18 = f31 - f25;
                                                                                            f19 = f34;
                                                                                        }
                                                                                        int i18 = i16 + 1;
                                                                                        int i19 = i16 + 2;
                                                                                        int i20 = i16 + 3;
                                                                                        i11 = i16;
                                                                                        float f35 = f31;
                                                                                        float f36 = f30;
                                                                                        path.rCubicTo(f19, f18, fArr2[i16], fArr2[i18], fArr2[i19], fArr2[i20]);
                                                                                        f12 = f36 + fArr2[i11];
                                                                                        f13 = f35 + fArr2[i18];
                                                                                        f14 = fArr2[i19] + f36;
                                                                                        f15 = fArr2[i20] + f35;
                                                                                    }
                                                                                } else {
                                                                                    i11 = i16;
                                                                                    float f37 = fArr2[i11];
                                                                                    f30 += f37;
                                                                                    float f38 = fArr2[i11 + 1];
                                                                                    f31 += f38;
                                                                                    if (i11 > 0) {
                                                                                        path.rLineTo(f37, f38);
                                                                                    } else {
                                                                                        path.rMoveTo(f37, f38);
                                                                                        f29 = f31;
                                                                                        f28 = f30;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                int i21 = i11 + 1;
                                                                                path.rLineTo(fArr2[i11], fArr2[i21]);
                                                                                f30 += fArr2[i11];
                                                                                f31 += fArr2[i21];
                                                                            }
                                                                        } else {
                                                                            i11 = i16;
                                                                            float f39 = f31;
                                                                            float f40 = f30;
                                                                            if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                f12 = f40;
                                                                                f13 = f39;
                                                                            } else {
                                                                                f12 = (f40 * 2.0f) - f24;
                                                                                f13 = (f39 * 2.0f) - f25;
                                                                            }
                                                                            int i22 = i11 + 1;
                                                                            path.quadTo(f12, f13, fArr2[i11], fArr2[i22]);
                                                                            f14 = fArr2[i11];
                                                                            f15 = fArr2[i22];
                                                                        }
                                                                    } else {
                                                                        i11 = i16;
                                                                        float f41 = f31;
                                                                        float f42 = f30;
                                                                        if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                            f16 = f41;
                                                                            f17 = f42;
                                                                        } else {
                                                                            f16 = (f41 * 2.0f) - f25;
                                                                            f17 = (f42 * 2.0f) - f24;
                                                                        }
                                                                        int i23 = i11 + 1;
                                                                        int i24 = i11 + 2;
                                                                        int i25 = i11 + 3;
                                                                        path.cubicTo(f17, f16, fArr2[i11], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                                        float f43 = fArr2[i11];
                                                                        float f44 = fArr2[i23];
                                                                        f30 = fArr2[i24];
                                                                        f31 = fArr2[i25];
                                                                        f24 = f43;
                                                                        f25 = f44;
                                                                    }
                                                                } else {
                                                                    i11 = i16;
                                                                    f30 = fArr2[i11];
                                                                    f31 = fArr2[i11 + 1];
                                                                    if (i11 > 0) {
                                                                        path.lineTo(f30, f31);
                                                                    } else {
                                                                        path.moveTo(f30, f31);
                                                                        f29 = f31;
                                                                        f28 = f30;
                                                                    }
                                                                }
                                                            } else {
                                                                i11 = i16;
                                                                int i26 = i11 + 1;
                                                                path.lineTo(fArr2[i11], fArr2[i26]);
                                                                f30 = fArr2[i11];
                                                                f31 = fArr2[i26];
                                                            }
                                                        } else {
                                                            i11 = i16;
                                                            path.rLineTo(s0.g.f34069a, fArr2[i11]);
                                                            f31 += fArr2[i11];
                                                        }
                                                    } else {
                                                        i11 = i16;
                                                        float f45 = f31;
                                                        float f46 = f30;
                                                        int i27 = i11 + 1;
                                                        int i28 = i11 + 2;
                                                        int i29 = i11 + 3;
                                                        path.rQuadTo(fArr2[i11], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                        float f47 = f46 + fArr2[i11];
                                                        float f48 = fArr2[i27] + f45;
                                                        float f49 = fArr2[i28] + f46;
                                                        f31 = f45 + fArr2[i29];
                                                        f25 = f48;
                                                        f24 = f47;
                                                        c10 = c13;
                                                        dVar = dVar2;
                                                        i12 = i15;
                                                        f30 = f49;
                                                    }
                                                } else {
                                                    i11 = i16;
                                                    path.rLineTo(fArr2[i11], s0.g.f34069a);
                                                    f30 += fArr2[i11];
                                                }
                                                c10 = c13;
                                                dVar = dVar2;
                                                i12 = i15;
                                            } else {
                                                i11 = i16;
                                                float f50 = f31;
                                                float f51 = f30;
                                                int i30 = i11 + 2;
                                                int i31 = i11 + 3;
                                                int i32 = i11 + 4;
                                                int i33 = i11 + 5;
                                                path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                                f12 = f51 + fArr2[i30];
                                                f13 = f50 + fArr2[i31];
                                                f14 = fArr2[i32] + f51;
                                                f15 = fArr2[i33] + f50;
                                            }
                                            f25 = f13;
                                            f24 = f12;
                                            c10 = c13;
                                            dVar = dVar2;
                                            i12 = i15;
                                            f30 = f14;
                                            f31 = f15;
                                        } else {
                                            i11 = i16;
                                            float f52 = f31;
                                            float f53 = f30;
                                            int i34 = i11 + 5;
                                            float f54 = fArr2[i34] + f53;
                                            int i35 = i11 + 6;
                                            float f55 = fArr2[i35] + f52;
                                            float f56 = fArr2[i11];
                                            float f57 = fArr2[i11 + 1];
                                            float f58 = fArr2[i11 + 2];
                                            if (fArr2[i11 + 3] != s0.g.f34069a) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (fArr2[i11 + 4] != s0.g.f34069a) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            c10 = c13;
                                            dVar = dVar2;
                                            i12 = i15;
                                            a(path, f53, f52, f54, f55, f56, f57, f58, z12, z13);
                                            f30 = f53 + fArr2[i34];
                                            f31 = f52 + fArr2[i35];
                                        }
                                    } else {
                                        i11 = i16;
                                        c10 = c13;
                                        dVar = dVar2;
                                        i12 = i15;
                                        path.lineTo(f30, fArr2[i11]);
                                        f31 = fArr2[i11];
                                    }
                                } else {
                                    i11 = i16;
                                    c10 = c13;
                                    dVar = dVar2;
                                    i12 = i15;
                                    int i36 = i11 + 1;
                                    int i37 = i11 + 2;
                                    int i38 = i11 + 3;
                                    path.quadTo(fArr2[i11], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f10 = fArr2[i11];
                                    f11 = fArr2[i36];
                                    f30 = fArr2[i37];
                                    f31 = fArr2[i38];
                                }
                            } else {
                                i11 = i16;
                                c10 = c13;
                                dVar = dVar2;
                                i12 = i15;
                                path.lineTo(fArr2[i11], f31);
                                f30 = fArr2[i11];
                            }
                            i16 = i11 + i10;
                            dVar2 = dVar;
                            c12 = c10;
                            c13 = c12;
                            i15 = i12;
                            c11 = 'm';
                            i14 = 0;
                        } else {
                            i11 = i16;
                            c10 = c13;
                            dVar = dVar2;
                            i12 = i15;
                            int i39 = i11 + 2;
                            int i40 = i11 + 3;
                            int i41 = i11 + 4;
                            int i42 = i11 + 5;
                            path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                            f30 = fArr2[i41];
                            f31 = fArr2[i42];
                            f10 = fArr2[i39];
                            f11 = fArr2[i40];
                        }
                        f24 = f10;
                        f25 = f11;
                        i16 = i11 + i10;
                        dVar2 = dVar;
                        c12 = c10;
                        c13 = c12;
                        i15 = i12;
                        c11 = 'm';
                        i14 = 0;
                    } else {
                        i11 = i16;
                        float f59 = f31;
                        float f60 = f30;
                        c10 = c13;
                        dVar = dVar2;
                        i12 = i15;
                        int i43 = i11 + 5;
                        float f61 = fArr2[i43];
                        int i44 = i11 + 6;
                        float f62 = fArr2[i44];
                        float f63 = fArr2[i11];
                        float f64 = fArr2[i11 + 1];
                        float f65 = fArr2[i11 + 2];
                        if (fArr2[i11 + 3] != s0.g.f34069a) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (fArr2[i11 + 4] != s0.g.f34069a) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a(path, f60, f59, f61, f62, f63, f64, f65, z10, z11);
                        f30 = fArr2[i43];
                        f31 = fArr2[i44];
                    }
                    f25 = f31;
                    f24 = f30;
                    i16 = i11 + i10;
                    dVar2 = dVar;
                    c12 = c10;
                    c13 = c12;
                    i15 = i12;
                    c11 = 'm';
                    i14 = 0;
                }
            }
            int i45 = i15;
            int i46 = i14;
            fArr[i46] = f30;
            fArr[1] = f31;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f28;
            fArr[5] = f29;
            i15 = i45 + 1;
            i14 = i46;
            c12 = dVarArr[i45].f36708a;
            i13 = 6;
            c11 = 'm';
        }
    }

    public d(d dVar) {
        this.f36708a = dVar.f36708a;
        float[] fArr = dVar.f36709b;
        this.f36709b = yk.j.M0(fArr, fArr.length);
    }
}
