package mo;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import d4.n1;
import d4.v0;
import d4.w0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class b {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public qo.b D;
    public qo.b E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f27859a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f27860a0;

    /* renamed from: b, reason: collision with root package name */
    public float f27861b;

    /* renamed from: b0, reason: collision with root package name */
    public float f27862b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27863c;

    /* renamed from: c0, reason: collision with root package name */
    public float f27864c0;

    /* renamed from: d, reason: collision with root package name */
    public float f27865d;

    /* renamed from: d0, reason: collision with root package name */
    public float f27866d0;

    /* renamed from: e, reason: collision with root package name */
    public float f27867e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f27868e0;

    /* renamed from: f, reason: collision with root package name */
    public int f27869f;

    /* renamed from: f0, reason: collision with root package name */
    public float f27870f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f27871g;

    /* renamed from: g0, reason: collision with root package name */
    public float f27872g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f27873h;

    /* renamed from: h0, reason: collision with root package name */
    public float f27874h0;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f27875i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f27876i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f27878j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f27880k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f27882l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f27884m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f27885n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f27886o;

    /* renamed from: p, reason: collision with root package name */
    public int f27888p;

    /* renamed from: q, reason: collision with root package name */
    public float f27890q;

    /* renamed from: r, reason: collision with root package name */
    public float f27892r;

    /* renamed from: s, reason: collision with root package name */
    public float f27893s;

    /* renamed from: t, reason: collision with root package name */
    public float f27894t;

    /* renamed from: u, reason: collision with root package name */
    public float f27895u;

    /* renamed from: v, reason: collision with root package name */
    public float f27896v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f27897w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f27898x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f27899y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f27900z;

    /* renamed from: j, reason: collision with root package name */
    public int f27877j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f27879k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f27881l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f27883m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public float f27887o0 = s0.g.f34069a;

    /* renamed from: p0, reason: collision with root package name */
    public float f27889p0 = 1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f27891q0 = 1;

    public b(View view) {
        this.f27859a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f27873h = new Rect();
        this.f27871g = new Rect();
        this.f27875i = new RectF();
        float f10 = this.f27865d;
        this.f27867e = nn.d.b(1.0f, f10, 0.5f, f10);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, float f10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return vn.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        b4.m mVar;
        WeakHashMap weakHashMap = n1.f13788a;
        boolean z10 = true;
        if (w0.d(this.f27859a) != 1) {
            z10 = false;
        }
        if (this.J) {
            if (z10) {
                mVar = b4.n.f3183d;
            } else {
                mVar = b4.n.f3182c;
            }
            return mVar.e(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        Typeface typeface;
        boolean z12;
        Layout.Alignment alignment;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (this.G == null) {
            return;
        }
        float width = this.f27873h.width();
        float width2 = this.f27871g.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = this.f27883m;
            f12 = this.f27870f0;
            this.L = 1.0f;
            typeface = this.f27897w;
        } else {
            float f13 = this.f27881l;
            float f14 = this.f27872g0;
            Typeface typeface2 = this.f27900z;
            if (Math.abs(f10 - s0.g.f34069a) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = g(this.f27881l, this.f27883m, f10, this.W) / this.f27881l;
            }
            float f15 = this.f27883m / this.f27881l;
            float f16 = width2 * f15;
            if (z10 || f16 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f15, width2);
            }
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (width > s0.g.f34069a) {
            if (this.M != f11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f27874h0 != f12) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.C != typeface) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f27876i0 != null && width != r9.getWidth()) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z13 && !z14 && !z16 && !z15 && !this.S) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.M = f11;
            this.f27874h0 = f12;
            this.C = typeface;
            this.S = false;
            if (this.L != 1.0f) {
                z18 = true;
            } else {
                z18 = false;
            }
            textPaint.setLinearText(z18);
            z12 = z17;
        } else {
            z12 = false;
        }
        if (this.H == null || z12) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.f27874h0);
            boolean b10 = b(this.G);
            this.I = b10;
            int i10 = this.n0;
            if (i10 <= 1 || (b10 && !this.f27863c)) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f27877j, b10 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.I) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.I) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            x xVar = new x(this.G, textPaint, (int) width);
            xVar.f27973l = this.F;
            xVar.f27972k = b10;
            xVar.f27966e = alignment;
            xVar.f27971j = false;
            xVar.f27967f = i10;
            float f17 = this.f27887o0;
            float f18 = this.f27889p0;
            xVar.f27968g = f17;
            xVar.f27969h = f18;
            xVar.f27970i = this.f27891q0;
            StaticLayout a10 = xVar.a();
            a10.getClass();
            this.f27876i0 = a10;
            this.H = a10.getText();
        }
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.f27875i;
            if (rectF.width() > s0.g.f34069a && rectF.height() > s0.g.f34069a) {
                TextPaint textPaint = this.T;
                textPaint.setTextSize(this.M);
                float f10 = this.f27895u;
                float f11 = this.f27896v;
                float f12 = this.L;
                if (f12 != 1.0f && !this.f27863c) {
                    canvas.scale(f12, f12, f10, f11);
                }
                if (this.n0 > 1 && ((!this.I || this.f27863c) && (!this.f27863c || this.f27861b > this.f27867e))) {
                    float lineStart = this.f27895u - this.f27876i0.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f11);
                    if (!this.f27863c) {
                        textPaint.setAlpha((int) (this.f27882l0 * alpha));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(this.N, this.O, this.P, pn.e.c(this.Q, textPaint.getAlpha()));
                        }
                        this.f27876i0.draw(canvas);
                    }
                    if (!this.f27863c) {
                        textPaint.setAlpha((int) (this.f27880k0 * alpha));
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, pn.e.c(this.Q, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.f27876i0.getLineBaseline(0);
                    CharSequence charSequence = this.f27884m0;
                    float f13 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), s0.g.f34069a, f13, textPaint);
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                    }
                    if (!this.f27863c) {
                        String trim = this.f27884m0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(this.f27876i0.getLineEnd(0), str.length()), s0.g.f34069a, f13, (Paint) textPaint);
                    }
                } else {
                    canvas.translate(f10, f11);
                    this.f27876i0.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f27883m);
        textPaint.setTypeface(this.f27897w);
        textPaint.setLetterSpacing(this.f27870f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f27899y;
            if (typeface != null) {
                this.f27898x = pn.e.r(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = pn.e.r(configuration, typeface2);
            }
            Typeface typeface3 = this.f27898x;
            if (typeface3 == null) {
                typeface3 = this.f27899y;
            }
            this.f27897w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f27900z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float f10;
        float f11;
        int i10;
        float f12;
        float b10;
        StaticLayout staticLayout;
        View view = this.f27859a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.H;
            TextPaint textPaint = this.T;
            if (charSequence != null && (staticLayout = this.f27876i0) != null) {
                this.f27884m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
            }
            CharSequence charSequence2 = this.f27884m0;
            if (charSequence2 != null) {
                this.f27878j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f27878j0 = s0.g.f34069a;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f27879k, this.I ? 1 : 0);
            int i11 = absoluteGravity & 112;
            Rect rect = this.f27873h;
            if (i11 != 48) {
                if (i11 != 80) {
                    this.f27892r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f27892r = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f27892r = rect.top;
            }
            int i12 = absoluteGravity & 8388615;
            if (i12 != 1) {
                if (i12 != 5) {
                    this.f27894t = rect.left;
                } else {
                    this.f27894t = rect.right - this.f27878j0;
                }
            } else {
                this.f27894t = rect.centerX() - (this.f27878j0 / 2.0f);
            }
            c(s0.g.f34069a, z10);
            StaticLayout staticLayout2 = this.f27876i0;
            if (staticLayout2 != null) {
                f10 = staticLayout2.getHeight();
            } else {
                f10 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f27876i0;
            if (staticLayout3 != null && this.n0 > 1) {
                f11 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.H;
                if (charSequence3 != null) {
                    f11 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f11 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f27876i0;
            if (staticLayout4 != null) {
                i10 = staticLayout4.getLineCount();
            } else {
                i10 = 0;
            }
            this.f27888p = i10;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f27877j, this.I ? 1 : 0);
            int i13 = absoluteGravity2 & 112;
            Rect rect2 = this.f27871g;
            if (i13 != 48) {
                if (i13 != 80) {
                    this.f27890q = rect2.centerY() - (f10 / 2.0f);
                } else {
                    this.f27890q = textPaint.descent() + (rect2.bottom - f10);
                }
            } else {
                this.f27890q = rect2.top;
            }
            int i14 = absoluteGravity2 & 8388615;
            if (i14 != 1) {
                if (i14 != 5) {
                    this.f27893s = rect2.left;
                } else {
                    this.f27893s = rect2.right - f11;
                }
            } else {
                this.f27893s = rect2.centerX() - (f11 / 2.0f);
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.f27861b);
            float f13 = this.f27861b;
            boolean z11 = this.f27863c;
            RectF rectF = this.f27875i;
            if (z11) {
                if (f13 < this.f27867e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f13, this.V);
                rectF.top = g(this.f27890q, this.f27892r, f13, this.V);
                rectF.right = g(rect2.right, rect.right, f13, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, f13, this.V);
            }
            if (this.f27863c) {
                if (f13 < this.f27867e) {
                    this.f27895u = this.f27893s;
                    this.f27896v = this.f27890q;
                    q(s0.g.f34069a);
                    f12 = 0.0f;
                } else {
                    this.f27895u = this.f27894t;
                    this.f27896v = this.f27892r - Math.max(0, this.f27869f);
                    q(1.0f);
                    f12 = 1.0f;
                }
            } else {
                this.f27895u = g(this.f27893s, this.f27894t, f13, this.V);
                this.f27896v = g(this.f27890q, this.f27892r, f13, this.V);
                q(f13);
                f12 = f13;
            }
            v4.b bVar = vn.a.f38181b;
            this.f27880k0 = 1.0f - g(s0.g.f34069a, 1.0f, 1.0f - f13, bVar);
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(view);
            this.f27882l0 = g(1.0f, s0.g.f34069a, f13, bVar);
            v0.k(view);
            ColorStateList colorStateList = this.f27886o;
            ColorStateList colorStateList2 = this.f27885n;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f12, f(this.f27886o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f14 = this.f27870f0;
            float f15 = this.f27872g0;
            if (f14 != f15) {
                textPaint.setLetterSpacing(g(f15, f14, f13, bVar));
            } else {
                textPaint.setLetterSpacing(f14);
            }
            this.N = g(this.f27862b0, this.X, f13, null);
            this.O = g(this.f27864c0, this.Y, f13, null);
            this.P = g(this.f27866d0, this.Z, f13, null);
            int a10 = a(f(this.f27868e0), f13, f(this.f27860a0));
            this.Q = a10;
            textPaint.setShadowLayer(this.N, this.O, this.P, a10);
            if (this.f27863c) {
                int alpha = textPaint.getAlpha();
                float f16 = this.f27867e;
                if (f13 <= f16) {
                    b10 = vn.a.b(1.0f, s0.g.f34069a, this.f27865d, f16, f13);
                } else {
                    b10 = vn.a.b(s0.g.f34069a, 1.0f, f16, 1.0f, f13);
                }
                textPaint.setAlpha((int) (b10 * alpha));
            }
            v0.k(view);
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f27886o != colorStateList || this.f27885n != colorStateList) {
            this.f27886o = colorStateList;
            this.f27885n = colorStateList;
            i(false);
        }
    }

    public final void k(int i10) {
        View view = this.f27859a;
        qo.d dVar = new qo.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f32111j;
        if (colorStateList != null) {
            this.f27886o = colorStateList;
        }
        float f10 = dVar.f32112k;
        if (f10 != s0.g.f34069a) {
            this.f27883m = f10;
        }
        ColorStateList colorStateList2 = dVar.f32102a;
        if (colorStateList2 != null) {
            this.f27860a0 = colorStateList2;
        }
        this.Y = dVar.f32106e;
        this.Z = dVar.f32107f;
        this.X = dVar.f32108g;
        this.f27870f0 = dVar.f32110i;
        qo.b bVar = this.E;
        if (bVar != null) {
            bVar.f32097d = true;
        }
        ek.u uVar = new ek.u(this, 10);
        dVar.a();
        this.E = new qo.b(uVar, dVar.f32115n);
        dVar.c(view.getContext(), this.E);
        i(false);
    }

    public final void l(int i10) {
        if (this.f27879k != i10) {
            this.f27879k = i10;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        qo.b bVar = this.E;
        if (bVar != null) {
            bVar.f32097d = true;
        }
        if (this.f27899y != typeface) {
            this.f27899y = typeface;
            Typeface r10 = pn.e.r(this.f27859a.getContext().getResources().getConfiguration(), typeface);
            this.f27898x = r10;
            if (r10 == null) {
                r10 = this.f27899y;
            }
            this.f27897w = r10;
            return true;
        }
        return false;
    }

    public final void n(int i10) {
        View view = this.f27859a;
        qo.d dVar = new qo.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f32111j;
        if (colorStateList != null) {
            this.f27885n = colorStateList;
        }
        float f10 = dVar.f32112k;
        if (f10 != s0.g.f34069a) {
            this.f27881l = f10;
        }
        ColorStateList colorStateList2 = dVar.f32102a;
        if (colorStateList2 != null) {
            this.f27868e0 = colorStateList2;
        }
        this.f27864c0 = dVar.f32106e;
        this.f27866d0 = dVar.f32107f;
        this.f27862b0 = dVar.f32108g;
        this.f27872g0 = dVar.f32110i;
        qo.b bVar = this.D;
        if (bVar != null) {
            bVar.f32097d = true;
        }
        ll.o oVar = new ll.o(this, 6);
        dVar.a();
        this.D = new qo.b(oVar, dVar.f32115n);
        dVar.c(view.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        qo.b bVar = this.D;
        if (bVar != null) {
            bVar.f32097d = true;
        }
        if (this.B != typeface) {
            this.B = typeface;
            Typeface r10 = pn.e.r(this.f27859a.getContext().getResources().getConfiguration(), typeface);
            this.A = r10;
            if (r10 == null) {
                r10 = this.B;
            }
            this.f27900z = r10;
            return true;
        }
        return false;
    }

    public final void p(float f10) {
        float f11;
        float b10;
        float E = hl.f.E(f10, s0.g.f34069a, 1.0f);
        if (E != this.f27861b) {
            this.f27861b = E;
            boolean z10 = this.f27863c;
            RectF rectF = this.f27875i;
            Rect rect = this.f27873h;
            Rect rect2 = this.f27871g;
            if (z10) {
                if (E < this.f27867e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, E, this.V);
                rectF.top = g(this.f27890q, this.f27892r, E, this.V);
                rectF.right = g(rect2.right, rect.right, E, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, E, this.V);
            }
            if (this.f27863c) {
                if (E < this.f27867e) {
                    this.f27895u = this.f27893s;
                    this.f27896v = this.f27890q;
                    q(s0.g.f34069a);
                    f11 = 0.0f;
                } else {
                    this.f27895u = this.f27894t;
                    this.f27896v = this.f27892r - Math.max(0, this.f27869f);
                    q(1.0f);
                    f11 = 1.0f;
                }
            } else {
                this.f27895u = g(this.f27893s, this.f27894t, E, this.V);
                this.f27896v = g(this.f27890q, this.f27892r, E, this.V);
                q(E);
                f11 = E;
            }
            v4.b bVar = vn.a.f38181b;
            this.f27880k0 = 1.0f - g(s0.g.f34069a, 1.0f, 1.0f - E, bVar);
            WeakHashMap weakHashMap = n1.f13788a;
            View view = this.f27859a;
            v0.k(view);
            this.f27882l0 = g(1.0f, s0.g.f34069a, E, bVar);
            v0.k(view);
            ColorStateList colorStateList = this.f27886o;
            ColorStateList colorStateList2 = this.f27885n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f11, f(this.f27886o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f12 = this.f27870f0;
            float f13 = this.f27872g0;
            if (f12 != f13) {
                textPaint.setLetterSpacing(g(f13, f12, E, bVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.N = g(this.f27862b0, this.X, E, null);
            this.O = g(this.f27864c0, this.Y, E, null);
            this.P = g(this.f27866d0, this.Z, E, null);
            int a10 = a(f(this.f27868e0), E, f(this.f27860a0));
            this.Q = a10;
            textPaint.setShadowLayer(this.N, this.O, this.P, a10);
            if (this.f27863c) {
                int alpha = textPaint.getAlpha();
                float f14 = this.f27867e;
                if (E <= f14) {
                    b10 = vn.a.b(1.0f, s0.g.f34069a, this.f27865d, f14, E);
                } else {
                    b10 = vn.a.b(s0.g.f34069a, 1.0f, f14, 1.0f, E);
                }
                textPaint.setAlpha((int) (b10 * alpha));
            }
            v0.k(view);
        }
    }

    public final void q(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = n1.f13788a;
        v0.k(this.f27859a);
    }
}
