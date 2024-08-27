package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import g1.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import n1.b1;
import n1.c;
import n1.d;
import n1.e;
import n1.f;
import n1.g0;
import n1.h;
import n1.h0;
import n1.i0;
import n1.k;
import n1.l;
import n1.l0;
import n1.m0;
import n1.n0;
import n1.o0;
import n1.p;
import n1.p0;
import n1.s0;
import n1.x0;
import o1.m;
import o1.n;
import o1.r;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import s0.g;
import ut.t;

/* loaded from: classes.dex */
public abstract class a {
    public static final PorterDuff.Mode A(int i10) {
        if (s0.b(i10, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (s0.b(i10, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (s0.b(i10, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (s0.b(i10, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (s0.b(i10, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (s0.b(i10, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (s0.b(i10, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if (s0.b(i10, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (s0.b(i10, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (s0.b(i10, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (s0.b(i10, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (s0.b(i10, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if (s0.b(i10, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if (s0.b(i10, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if (s0.b(i10, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (s0.b(i10, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if (s0.b(i10, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (s0.b(i10, 13)) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final c a(e eVar) {
        Canvas canvas = d.f28127a;
        c cVar = new c();
        cVar.f28123a = new Canvas(m(eVar));
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(float r22, float r23, float r24, float r25, o1.d r26) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.a.b(float, float, float, float, o1.d):long");
    }

    public static final long c(int i10) {
        long j10 = i10;
        t.Companion companion = t.INSTANCE;
        long j11 = j10 << 32;
        int i11 = n1.t.f28178j;
        return j11;
    }

    public static final long d(long j10) {
        long j11 = j10 << 32;
        t.Companion companion = t.INSTANCE;
        int i10 = n1.t.f28178j;
        return j11;
    }

    public static long e(int i10, int i11, int i12) {
        return c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static e f(int i10, int i11, int i12) {
        Bitmap createBitmap;
        r rVar = o1.e.f29380c;
        Bitmap.Config z10 = z(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = k.b(i10, i11, i12, true, rVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, z10);
            createBitmap.setHasAlpha(true);
        }
        return new e(createBitmap);
    }

    public static final f g() {
        return new f(new Paint(7));
    }

    public static final h h() {
        return new h(new Path());
    }

    public static final long i(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = b1.f28121c;
        return floatToRawIntBits;
    }

    public static final long j(float f10, float f11, float f12, float f13, o1.d dVar) {
        int i10;
        int i11;
        int i12;
        short s7;
        int i13;
        int i14;
        int i15;
        int i16;
        short s10;
        int i17;
        int i18;
        short s11;
        if (dVar.c()) {
            t.Companion companion = t.INSTANCE;
            long j10 = ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f))) << 32;
            int i19 = n1.t.f28178j;
            return j10;
        }
        int i20 = Build.VERSION.SDK_INT;
        int i21 = 0;
        if (i20 >= 26) {
            s7 = l.a(f10);
        } else {
            int floatToRawIntBits = Float.floatToRawIntBits(f10);
            int i22 = floatToRawIntBits >>> 31;
            int i23 = (floatToRawIntBits >>> 23) & 255;
            int i24 = floatToRawIntBits & 8388607;
            if (i23 == 255) {
                if (i24 != 0) {
                    i13 = 512;
                } else {
                    i13 = 0;
                }
                i11 = i13;
                i10 = 31;
            } else {
                i10 = i23 - 112;
                if (i10 >= 31) {
                    i11 = 0;
                    i10 = 49;
                } else if (i10 <= 0) {
                    if (i10 >= -10) {
                        int i25 = (i24 | 8388608) >> (1 - i10);
                        if ((i25 & 4096) != 0) {
                            i25 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i11 = i25 >> 13;
                        i10 = 0;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                } else {
                    i11 = i24 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i12 = (((i10 << 10) | i11) + 1) | (i22 << 15);
                        s7 = (short) i12;
                    }
                }
            }
            i12 = (i10 << 10) | (i22 << 15) | i11;
            s7 = (short) i12;
        }
        if (i20 >= 26) {
            s10 = l.a(f11);
        } else {
            int floatToRawIntBits2 = Float.floatToRawIntBits(f11);
            int i26 = floatToRawIntBits2 >>> 31;
            int i27 = (floatToRawIntBits2 >>> 23) & 255;
            int i28 = floatToRawIntBits2 & 8388607;
            if (i27 == 255) {
                if (i28 != 0) {
                    i15 = 512;
                } else {
                    i15 = 0;
                }
                i14 = 31;
            } else {
                i14 = i27 - 112;
                if (i14 >= 31) {
                    i15 = 0;
                    i14 = 49;
                } else if (i14 <= 0) {
                    if (i14 >= -10) {
                        int i29 = (i28 | 8388608) >> (1 - i14);
                        if ((i29 & 4096) != 0) {
                            i29 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i15 = i29 >> 13;
                        i14 = 0;
                    } else {
                        i15 = 0;
                        i14 = 0;
                    }
                } else {
                    int i30 = i28 >> 13;
                    if ((floatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i14 << 10) | i30) + 1) | (i26 << 15);
                        s10 = (short) i16;
                    } else {
                        i15 = i30;
                    }
                }
            }
            i16 = i15 | (i14 << 10) | (i26 << 15);
            s10 = (short) i16;
        }
        if (i20 >= 26) {
            s11 = l.a(f12);
        } else {
            int floatToRawIntBits3 = Float.floatToRawIntBits(f12);
            int i31 = floatToRawIntBits3 >>> 31;
            int i32 = (floatToRawIntBits3 >>> 23) & 255;
            int i33 = 8388607 & floatToRawIntBits3;
            if (i32 == 255) {
                if (i33 != 0) {
                    i21 = 512;
                }
                i17 = i21;
                i21 = 31;
            } else {
                int i34 = i32 - 112;
                if (i34 >= 31) {
                    i17 = 0;
                    i21 = 49;
                } else if (i34 <= 0) {
                    if (i34 >= -10) {
                        int i35 = (i33 | 8388608) >> (1 - i34);
                        if ((i35 & 4096) != 0) {
                            i35 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i17 = i35 >> 13;
                    } else {
                        i17 = 0;
                    }
                } else {
                    int i36 = i33 >> 13;
                    if ((floatToRawIntBits3 & 4096) != 0) {
                        i18 = (((i34 << 10) | i36) + 1) | (i31 << 15);
                        s11 = (short) i18;
                    } else {
                        i17 = i36;
                        i21 = i34;
                    }
                }
            }
            i18 = i17 | (i31 << 15) | (i21 << 10);
            s11 = (short) i18;
        }
        long max = ((s11 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s10 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((int) ((Math.max(g.f34069a, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (dVar.f29377c & 63);
        t.Companion companion2 = t.INSTANCE;
        int i37 = n1.t.f28178j;
        return max;
    }

    public static final float k(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final Path.Direction l(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 == 1) {
                    return Path.Direction.CW;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Path.Direction.CCW;
        }
        throw null;
    }

    public static final Bitmap m(h0 h0Var) {
        if (h0Var instanceof e) {
            return ((e) h0Var).f28128a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long n(long j10, long j11) {
        float f10;
        float f11;
        long b10 = n1.t.b(j10, n1.t.g(j11));
        float e10 = n1.t.e(j11);
        float e11 = n1.t.e(b10);
        float f12 = 1.0f - e11;
        float f13 = (e10 * f12) + e11;
        float i10 = n1.t.i(b10);
        float i11 = n1.t.i(j11);
        float f14 = g.f34069a;
        if (f13 == g.f34069a) {
            f10 = 0.0f;
        } else {
            f10 = (((i11 * e10) * f12) + (i10 * e11)) / f13;
        }
        float h10 = n1.t.h(b10);
        float h11 = n1.t.h(j11);
        if (f13 == g.f34069a) {
            f11 = 0.0f;
        } else {
            f11 = (((h11 * e10) * f12) + (h10 * e11)) / f13;
        }
        float f15 = n1.t.f(b10);
        float f16 = n1.t.f(j11);
        if (f13 != g.f34069a) {
            f14 = (((f16 * e10) * f12) + (f15 * e11)) / f13;
        }
        return j(f10, f11, f14, f13, n1.t.g(j11));
    }

    public static void o(p1.h hVar, o0 o0Var, p pVar, float f10) {
        p0 p0Var;
        p1.k kVar = p1.k.f30509a;
        p1.h.S.getClass();
        int i10 = p1.g.f30507b;
        if (o0Var instanceof m0) {
            m1.d dVar = ((m0) o0Var).f28155a;
            hVar.t0(pVar, t0.t.g(dVar.f27239a, dVar.f27240b), t0.t.j(dVar.c(), dVar.b()), f10, kVar, null, i10);
            return;
        }
        if (o0Var instanceof n0) {
            n0 n0Var = (n0) o0Var;
            p0Var = n0Var.f28158b;
            if (p0Var == null) {
                m1.e eVar = n0Var.f28157a;
                float b10 = m1.a.b(eVar.f27250h);
                hVar.e0(pVar, t0.t.g(eVar.f27243a, eVar.f27244b), t0.t.j(eVar.b(), eVar.a()), t0.t.a(b10, b10), f10, kVar, null, i10);
                return;
            }
        } else if (o0Var instanceof l0) {
            p0Var = ((l0) o0Var).f28152a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        hVar.k0(p0Var, pVar, f10, kVar, null, i10);
    }

    public static void p(p1.h hVar, o0 o0Var, long j10) {
        p0 p0Var;
        p1.k kVar = p1.k.f30509a;
        p1.h.S.getClass();
        int i10 = p1.g.f30507b;
        if (o0Var instanceof m0) {
            m1.d dVar = ((m0) o0Var).f28155a;
            hVar.w(j10, t0.t.g(dVar.f27239a, dVar.f27240b), t0.t.j(dVar.c(), dVar.b()), 1.0f, kVar, null, i10);
            return;
        }
        if (o0Var instanceof n0) {
            n0 n0Var = (n0) o0Var;
            p0Var = n0Var.f28158b;
            if (p0Var == null) {
                m1.e eVar = n0Var.f28157a;
                float b10 = m1.a.b(eVar.f27250h);
                hVar.B(j10, t0.t.g(eVar.f27243a, eVar.f27244b), t0.t.j(eVar.b(), eVar.a()), t0.t.a(b10, b10), kVar, 1.0f, null, i10);
                return;
            }
        } else if (o0Var instanceof l0) {
            p0Var = ((l0) o0Var).f28152a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        hVar.s(p0Var, j10, 1.0f, kVar, null, i10);
    }

    public static final o q(o oVar, Function1 function1) {
        return oVar.g(new BlockGraphicsLayerElement(function1));
    }

    public static o r(o oVar, float f10, float f11, float f12, float f13, float f14, x0 x0Var, boolean z10, int i10) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        long j10;
        x0 x0Var2;
        boolean z11;
        long j11;
        long j12;
        if ((i10 & 1) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f10;
        }
        if ((i10 & 2) != 0) {
            f16 = 1.0f;
        } else {
            f16 = f11;
        }
        if ((i10 & 4) != 0) {
            f17 = 1.0f;
        } else {
            f17 = f12;
        }
        if ((i10 & 32) != 0) {
            f18 = 0.0f;
        } else {
            f18 = f13;
        }
        if ((i10 & 256) != 0) {
            f19 = 0.0f;
        } else {
            f19 = f14;
        }
        if ((i10 & 512) != 0) {
            f20 = 8.0f;
        } else {
            f20 = 0.0f;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            j10 = b1.f28120b;
        } else {
            j10 = 0;
        }
        if ((i10 & 2048) != 0) {
            x0Var2 = s0.f28162a;
        } else {
            x0Var2 = x0Var;
        }
        if ((i10 & 4096) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            j11 = g0.f28137a;
        } else {
            j11 = 0;
        }
        if ((i10 & 32768) != 0) {
            j12 = g0.f28137a;
        } else {
            j12 = 0;
        }
        return oVar.g(new GraphicsLayerElement(f15, f16, f17, g.f34069a, g.f34069a, f18, g.f34069a, g.f34069a, f19, f20, j10, x0Var2, z11, j11, j12, 0));
    }

    public static final long s(long j10, long j11, float f10) {
        m mVar = o1.e.f29397t;
        long b10 = n1.t.b(j10, mVar);
        long b11 = n1.t.b(j11, mVar);
        float e10 = n1.t.e(b10);
        float i10 = n1.t.i(b10);
        float h10 = n1.t.h(b10);
        float f11 = n1.t.f(b10);
        float e11 = n1.t.e(b11);
        return n1.t.b(j(hl.f.z0(i10, n1.t.i(b11), f10), hl.f.z0(h10, n1.t.h(b11), f10), hl.f.z0(f11, n1.t.f(b11), f10), hl.f.z0(e10, e11, f10), mVar), n1.t.g(j11));
    }

    public static final float t(long j10) {
        o1.d g10 = n1.t.g(j10);
        if (o1.c.a(g10.f29376b, o1.c.f29370a)) {
            double i10 = n1.t.i(j10);
            n nVar = ((r) g10).f29437p;
            double h10 = nVar.h(i10);
            float h11 = (float) ((nVar.h(n1.t.f(j10)) * 0.0722d) + (nVar.h(n1.t.h(j10)) * 0.7152d) + (h10 * 0.2126d));
            if (h11 < g.f34069a) {
                h11 = 0.0f;
            }
            if (h11 > 1.0f) {
                return 1.0f;
            }
            return h11;
        }
        throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) o1.c.b(g10.f29376b)));
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final BlendMode w(int i10) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (s0.b(i10, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (s0.b(i10, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (s0.b(i10, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (s0.b(i10, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (s0.b(i10, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (s0.b(i10, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (s0.b(i10, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (s0.b(i10, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (s0.b(i10, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (s0.b(i10, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (s0.b(i10, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (s0.b(i10, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (s0.b(i10, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (s0.b(i10, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (s0.b(i10, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (s0.b(i10, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (s0.b(i10, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (s0.b(i10, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (s0.b(i10, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (s0.b(i10, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (s0.b(i10, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (s0.b(i10, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (s0.b(i10, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (s0.b(i10, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (s0.b(i10, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (s0.b(i10, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (s0.b(i10, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (s0.b(i10, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (s0.b(i10, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final RectF x(m1.d dVar) {
        return new RectF(dVar.f27239a, dVar.f27240b, dVar.f27241c, dVar.f27242d);
    }

    public static final int y(long j10) {
        float[] fArr = o1.e.f29378a;
        long b10 = n1.t.b(j10, o1.e.f29380c) >>> 32;
        t.Companion companion = t.INSTANCE;
        return (int) b10;
    }

    public static final Bitmap.Config z(int i10) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i0.a(i10, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i0.a(i10, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i0.a(i10, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i0.a(i10, 3)) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i11 >= 26 && i0.a(i10, 4)) {
            config = Bitmap.Config.HARDWARE;
            return config;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
