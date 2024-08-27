package fo;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import in.i;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import mo.c0;
import mo.y;
import mo.z;
import okhttp3.HttpUrl;
import to.h;
import to.n;
import v3.j;
import v3.k;

/* loaded from: classes2.dex */
public final class d extends h implements Drawable.Callback, y {
    public static final int[] X0 = {R.attr.state_enabled};
    public static final ShapeDrawable Y0 = new ShapeDrawable(new OvalShape());
    public float A;
    public final Path A0;
    public ColorStateList B;
    public final z B0;
    public float C;
    public int C0;
    public ColorStateList D;
    public int D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public int F0;
    public Drawable G;
    public int G0;
    public ColorStateList H;
    public int H0;
    public float I;
    public boolean I0;
    public boolean J;
    public int J0;
    public int K0;
    public ColorFilter L0;
    public PorterDuffColorFilter M0;
    public ColorStateList N0;
    public PorterDuff.Mode O0;
    public int[] P0;
    public boolean Q0;
    public ColorStateList R0;
    public WeakReference S0;
    public TextUtils.TruncateAt T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public boolean X;
    public Drawable Y;
    public RippleDrawable Z;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f16181e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f16182f0;

    /* renamed from: g0, reason: collision with root package name */
    public SpannableStringBuilder f16183g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f16184h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f16185i0;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f16186j0;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f16187k0;

    /* renamed from: l0, reason: collision with root package name */
    public vn.d f16188l0;

    /* renamed from: m0, reason: collision with root package name */
    public vn.d f16189m0;
    public float n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f16190o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f16191p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f16192q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f16193r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f16194s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f16195t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f16196u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Context f16197v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Paint f16198w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f16199x;

    /* renamed from: x0, reason: collision with root package name */
    public final Paint.FontMetrics f16200x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f16201y;

    /* renamed from: y0, reason: collision with root package name */
    public final RectF f16202y0;

    /* renamed from: z, reason: collision with root package name */
    public float f16203z;

    /* renamed from: z0, reason: collision with root package name */
    public final PointF f16204z0;

    public d(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.A = -1.0f;
        this.f16198w0 = new Paint(1);
        this.f16200x0 = new Paint.FontMetrics();
        this.f16202y0 = new RectF();
        this.f16204z0 = new PointF();
        this.A0 = new Path();
        this.K0 = 255;
        this.O0 = PorterDuff.Mode.SRC_IN;
        this.S0 = new WeakReference(null);
        k(context);
        this.f16197v0 = context;
        z zVar = new z(this);
        this.B0 = zVar;
        this.E = HttpUrl.FRAGMENT_ENCODE_SET;
        zVar.f27974a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = X0;
        setState(iArr);
        if (!Arrays.equals(this.P0, iArr)) {
            this.P0 = iArr;
            if (b0()) {
                E(getState(), iArr);
            }
        }
        this.U0 = true;
        int[] iArr2 = ro.a.f33965a;
        Y0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean C(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static d z(Context context, AttributeSet attributeSet, int i10, int i11) {
        qo.d dVar;
        int resourceId;
        d dVar2 = new d(context, attributeSet, i10, i11);
        TypedArray f10 = c0.f(dVar2.f16197v0, attributeSet, un.a.f37297h, i10, i11, new int[0]);
        dVar2.W0 = f10.hasValue(37);
        Context context2 = dVar2.f16197v0;
        ColorStateList l12 = dp.b.l1(context2, f10, 24);
        if (dVar2.f16199x != l12) {
            dVar2.f16199x = l12;
            dVar2.onStateChange(dVar2.getState());
        }
        ColorStateList l13 = dp.b.l1(context2, f10, 11);
        if (dVar2.f16201y != l13) {
            dVar2.f16201y = l13;
            dVar2.onStateChange(dVar2.getState());
        }
        float dimension = f10.getDimension(19, s0.g.f34069a);
        if (dVar2.f16203z != dimension) {
            dVar2.f16203z = dimension;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        if (f10.hasValue(12)) {
            dVar2.J(f10.getDimension(12, s0.g.f34069a));
        }
        dVar2.O(dp.b.l1(context2, f10, 22));
        dVar2.P(f10.getDimension(23, s0.g.f34069a));
        dVar2.Y(dp.b.l1(context2, f10, 36));
        CharSequence text = f10.getText(5);
        if (text == null) {
            text = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean equals = TextUtils.equals(dVar2.E, text);
        z zVar = dVar2.B0;
        if (!equals) {
            dVar2.E = text;
            zVar.f27977d = true;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        if (f10.hasValue(0) && (resourceId = f10.getResourceId(0, 0)) != 0) {
            dVar = new qo.d(context2, resourceId);
        } else {
            dVar = null;
        }
        dVar.f32112k = f10.getDimension(1, dVar.f32112k);
        zVar.b(dVar, context2);
        int i12 = f10.getInt(3, 0);
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    dVar2.T0 = TextUtils.TruncateAt.END;
                }
            } else {
                dVar2.T0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            dVar2.T0 = TextUtils.TruncateAt.START;
        }
        dVar2.N(f10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            dVar2.N(f10.getBoolean(15, false));
        }
        dVar2.K(dp.b.o1(context2, f10, 14));
        if (f10.hasValue(17)) {
            dVar2.M(dp.b.l1(context2, f10, 17));
        }
        dVar2.L(f10.getDimension(16, -1.0f));
        dVar2.V(f10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            dVar2.V(f10.getBoolean(26, false));
        }
        dVar2.Q(dp.b.o1(context2, f10, 25));
        dVar2.U(dp.b.l1(context2, f10, 30));
        dVar2.S(f10.getDimension(28, s0.g.f34069a));
        dVar2.F(f10.getBoolean(6, false));
        dVar2.I(f10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            dVar2.I(f10.getBoolean(8, false));
        }
        dVar2.G(dp.b.o1(context2, f10, 7));
        if (f10.hasValue(9)) {
            dVar2.H(dp.b.l1(context2, f10, 9));
        }
        dVar2.f16188l0 = vn.d.a(context2, f10, 39);
        dVar2.f16189m0 = vn.d.a(context2, f10, 33);
        float dimension2 = f10.getDimension(21, s0.g.f34069a);
        if (dVar2.n0 != dimension2) {
            dVar2.n0 = dimension2;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        dVar2.X(f10.getDimension(35, s0.g.f34069a));
        dVar2.W(f10.getDimension(34, s0.g.f34069a));
        float dimension3 = f10.getDimension(41, s0.g.f34069a);
        if (dVar2.f16192q0 != dimension3) {
            dVar2.f16192q0 = dimension3;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        float dimension4 = f10.getDimension(40, s0.g.f34069a);
        if (dVar2.f16193r0 != dimension4) {
            dVar2.f16193r0 = dimension4;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        dVar2.T(f10.getDimension(29, s0.g.f34069a));
        dVar2.R(f10.getDimension(27, s0.g.f34069a));
        float dimension5 = f10.getDimension(13, s0.g.f34069a);
        if (dVar2.f16196u0 != dimension5) {
            dVar2.f16196u0 = dimension5;
            dVar2.invalidateSelf();
            dVar2.D();
        }
        dVar2.V0 = f10.getDimensionPixelSize(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        f10.recycle();
        return dVar2;
    }

    public final float A() {
        if (this.W0) {
            return i();
        }
        return this.A;
    }

    public final void D() {
        c cVar = (c) this.S0.get();
        if (cVar != null) {
            Chip chip = (Chip) cVar;
            chip.c(chip.f11248q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean E(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f16199x;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.C0);
        } else {
            i10 = 0;
        }
        int d10 = d(i10);
        boolean z14 = true;
        if (this.C0 != d10) {
            this.C0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16201y;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.D0);
        } else {
            i11 = 0;
        }
        int d11 = d(i11);
        if (this.D0 != d11) {
            this.D0 = d11;
            onStateChange = true;
        }
        int b10 = u3.a.b(d11, d10);
        if (this.E0 != b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36253a.f36233c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.E0 = b10;
            n(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.F0);
        } else {
            i12 = 0;
        }
        if (this.F0 != i12) {
            this.F0 = i12;
            onStateChange = true;
        }
        if (this.R0 != null && ro.a.d(iArr)) {
            i13 = this.R0.getColorForState(iArr, this.G0);
        } else {
            i13 = 0;
        }
        if (this.G0 != i13) {
            this.G0 = i13;
            if (this.Q0) {
                onStateChange = true;
            }
        }
        qo.d dVar = this.B0.f27979f;
        if (dVar != null && (colorStateList = dVar.f32111j) != null) {
            i14 = colorStateList.getColorForState(iArr, this.H0);
        } else {
            i14 = 0;
        }
        if (this.H0 != i14) {
            this.H0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                }
                if (state[i16] == 16842912) {
                    if (this.f16184h0) {
                        z12 = true;
                    }
                } else {
                    i16++;
                }
            }
        }
        z12 = false;
        if (this.I0 != z12 && this.f16186j0 != null) {
            float x10 = x();
            this.I0 = z12;
            if (x10 != x()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        } else {
            z13 = false;
        }
        ColorStateList colorStateList5 = this.N0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.J0);
        } else {
            i15 = 0;
        }
        if (this.J0 != i15) {
            this.J0 = i15;
            ColorStateList colorStateList6 = this.N0;
            PorterDuff.Mode mode = this.O0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.M0 = porterDuffColorFilter;
        } else {
            z14 = onStateChange;
        }
        if (C(this.G)) {
            z14 |= this.G.setState(iArr);
        }
        if (C(this.f16186j0)) {
            z14 |= this.f16186j0.setState(iArr);
        }
        if (C(this.Y)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.Y.setState(iArr3);
        }
        int[] iArr4 = ro.a.f33965a;
        if (C(this.Z)) {
            z14 |= this.Z.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            D();
        }
        return z14;
    }

    public final void F(boolean z10) {
        if (this.f16184h0 != z10) {
            this.f16184h0 = z10;
            float x10 = x();
            if (!z10 && this.I0) {
                this.I0 = false;
            }
            float x11 = x();
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f16186j0 != drawable) {
            float x10 = x();
            this.f16186j0 = drawable;
            float x11 = x();
            c0(this.f16186j0);
            v(this.f16186j0);
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f16187k0 != colorStateList) {
            this.f16187k0 = colorStateList;
            if (this.f16185i0 && (drawable = this.f16186j0) != null && this.f16184h0) {
                v3.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z10) {
        if (this.f16185i0 != z10) {
            boolean Z = Z();
            this.f16185i0 = z10;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    v(this.f16186j0);
                } else {
                    c0(this.f16186j0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void J(float f10) {
        if (this.A != f10) {
            this.A = f10;
            i f11 = this.f36253a.f36231a.f();
            f11.c(f10);
            setShapeAppearanceModel(f11.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof j;
            drawable2 = drawable3;
            if (z10) {
                ((k) ((j) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float x10 = x();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.G = drawable4;
            float x11 = x();
            c0(drawable2);
            if (a0()) {
                v(this.G);
            }
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void L(float f10) {
        if (this.I != f10) {
            float x10 = x();
            this.I = f10;
            float x11 = x();
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (a0()) {
                v3.b.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.F != z10) {
            boolean a02 = a0();
            this.F = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                if (a03) {
                    v(this.G);
                } else {
                    c0(this.G);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.W0) {
                r(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.f16198w0.setStrokeWidth(f10);
            if (this.W0) {
                this.f36253a.f36241k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Y;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof j;
            drawable2 = drawable3;
            if (z10) {
                ((k) ((j) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float y10 = y();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.Y = drawable4;
            int[] iArr = ro.a.f33965a;
            this.Z = new RippleDrawable(ro.a.c(this.D), this.Y, Y0);
            float y11 = y();
            c0(drawable2);
            if (b0()) {
                v(this.Y);
            }
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void R(float f10) {
        if (this.f16195t0 != f10) {
            this.f16195t0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void S(float f10) {
        if (this.f16182f0 != f10) {
            this.f16182f0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void T(float f10) {
        if (this.f16194s0 != f10) {
            this.f16194s0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.f16181e0 != colorStateList) {
            this.f16181e0 = colorStateList;
            if (b0()) {
                v3.b.h(this.Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z10) {
        if (this.X != z10) {
            boolean b02 = b0();
            this.X = z10;
            boolean b03 = b0();
            if (b02 != b03) {
                if (b03) {
                    v(this.Y);
                } else {
                    c0(this.Y);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void W(float f10) {
        if (this.f16191p0 != f10) {
            float x10 = x();
            this.f16191p0 = f10;
            float x11 = x();
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void X(float f10) {
        if (this.f16190o0 != f10) {
            float x10 = x();
            this.f16190o0 = f10;
            float x11 = x();
            invalidateSelf();
            if (x10 != x11) {
                D();
            }
        }
    }

    public final void Y(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.Q0) {
                colorStateList2 = ro.a.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.R0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean Z() {
        return this.f16185i0 && this.f16186j0 != null && this.I0;
    }

    @Override // to.h, mo.y
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.F && this.G != null;
    }

    public final boolean b0() {
        return this.X && this.Y != null;
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        boolean z10;
        int i15;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.K0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z11 = this.W0;
            Paint paint = this.f16198w0;
            RectF rectF3 = this.f16202y0;
            if (!z11) {
                paint.setColor(this.C0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, A(), A(), paint);
            }
            if (!this.W0) {
                paint.setColor(this.D0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.L0;
                if (colorFilter == null) {
                    colorFilter = this.M0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, A(), A(), paint);
            }
            if (this.W0) {
                super.draw(canvas);
            }
            if (this.C > s0.g.f34069a && !this.W0) {
                paint.setColor(this.F0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.W0) {
                    ColorFilter colorFilter2 = this.L0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.M0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = bounds.left;
                float f11 = this.C / 2.0f;
                rectF3.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
                float f12 = this.A - (this.C / 2.0f);
                canvas.drawRoundRect(rectF3, f12, f12, paint);
            }
            paint.setColor(this.G0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.W0) {
                canvas.drawRoundRect(rectF3, A(), A(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.A0;
                n nVar = this.f36270r;
                to.g gVar = this.f36253a;
                nVar.a(gVar.f36231a, gVar.f36240j, rectF4, this.f36269q, path);
                f(canvas, paint, path, this.f36253a.f36231a, h());
            }
            if (a0()) {
                w(bounds, rectF3);
                float f13 = rectF3.left;
                float f14 = rectF3.top;
                canvas.translate(f13, f14);
                this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.G.draw(canvas);
                canvas.translate(-f13, -f14);
            }
            if (Z()) {
                w(bounds, rectF3);
                float f15 = rectF3.left;
                float f16 = rectF3.top;
                canvas.translate(f15, f16);
                this.f16186j0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f16186j0.draw(canvas);
                canvas.translate(-f15, -f16);
            }
            if (this.U0 && this.E != null) {
                PointF pointF = this.f16204z0;
                pointF.set(s0.g.f34069a, s0.g.f34069a);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.E;
                z zVar = this.B0;
                if (charSequence != null) {
                    float x10 = x() + this.n0 + this.f16192q0;
                    if (v3.c.a(this) == 0) {
                        pointF.x = bounds.left + x10;
                    } else {
                        pointF.x = bounds.right - x10;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = zVar.f27974a;
                    Paint.FontMetrics fontMetrics = this.f16200x0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.E != null) {
                    float x11 = x() + this.n0 + this.f16192q0;
                    float y10 = y() + this.f16196u0 + this.f16193r0;
                    if (v3.c.a(this) == 0) {
                        rectF3.left = bounds.left + x11;
                        rectF3.right = bounds.right - y10;
                    } else {
                        rectF3.left = bounds.left + y10;
                        rectF3.right = bounds.right - x11;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                qo.d dVar = zVar.f27979f;
                TextPaint textPaint2 = zVar.f27974a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    zVar.f27979f.e(this.f16197v0, textPaint2, zVar.f27975b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(zVar.a(this.E.toString())) > Math.round(rectF3.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.E;
                if (z10 && this.T0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.T0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f17 = pointF.x;
                float f18 = pointF.y;
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
                canvas.drawText(charSequence3, 0, length, f17, f18, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
            }
            if (b0()) {
                rectF.setEmpty();
                if (b0()) {
                    float f19 = this.f16196u0 + this.f16195t0;
                    if (v3.c.a(this) == 0) {
                        float f20 = bounds.right - f19;
                        rectF2 = rectF;
                        rectF2.right = f20;
                        rectF2.left = f20 - this.f16182f0;
                    } else {
                        rectF2 = rectF;
                        float f21 = bounds.left + f19;
                        rectF2.left = f21;
                        rectF2.right = f21 + this.f16182f0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f22 = this.f16182f0;
                    float f23 = exactCenterY - (f22 / 2.0f);
                    rectF2.top = f23;
                    rectF2.bottom = f23 + f22;
                } else {
                    rectF2 = rectF;
                }
                float f24 = rectF2.left;
                float f25 = rectF2.top;
                canvas.translate(f24, f25);
                this.Y.setBounds(i13, i13, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = ro.a.f33965a;
                this.Z.setBounds(this.Y.getBounds());
                this.Z.jumpToCurrentState();
                this.Z.draw(canvas);
                canvas.translate(-f24, -f25);
            }
            if (this.K0 < i14) {
                canvas.restoreToCount(i12);
            }
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f16203z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(y() + this.B0.a(this.E.toString()) + x() + this.n0 + this.f16192q0 + this.f16193r0 + this.f16196u0), this.V0);
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f16203z, this.A);
        }
        outline.setAlpha(this.K0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        qo.d dVar;
        ColorStateList colorStateList;
        if (!B(this.f16199x) && !B(this.f16201y) && !B(this.B) && ((!this.Q0 || !B(this.R0)) && (((dVar = this.B0.f27979f) == null || (colorStateList = dVar.f32111j) == null || !colorStateList.isStateful()) && ((!this.f16185i0 || this.f16186j0 == null || !this.f16184h0) && !C(this.G) && !C(this.f16186j0) && !B(this.N0))))) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (a0()) {
            onLayoutDirectionChanged |= v3.c.b(this.G, i10);
        }
        if (Z()) {
            onLayoutDirectionChanged |= v3.c.b(this.f16186j0, i10);
        }
        if (b0()) {
            onLayoutDirectionChanged |= v3.c.b(this.Y, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (a0()) {
            onLevelChange |= this.G.setLevel(i10);
        }
        if (Z()) {
            onLevelChange |= this.f16186j0.setLevel(i10);
        }
        if (b0()) {
            onLevelChange |= this.Y.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // to.h, android.graphics.drawable.Drawable, mo.y
    public final boolean onStateChange(int[] iArr) {
        if (this.W0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.P0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.K0 != i10) {
            this.K0 = i10;
            invalidateSelf();
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.L0 != colorFilter) {
            this.L0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.O0 != mode) {
            this.O0 = mode;
            ColorStateList colorStateList = this.N0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.M0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (a0()) {
            visible |= this.G.setVisible(z10, z11);
        }
        if (Z()) {
            visible |= this.f16186j0.setVisible(z10, z11);
        }
        if (b0()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        v3.c.b(drawable, v3.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Y) {
            if (drawable.isStateful()) {
                drawable.setState(this.P0);
            }
            v3.b.h(drawable, this.f16181e0);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            v3.b.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void w(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (a0() || Z()) {
            float f10 = this.n0 + this.f16190o0;
            if (this.I0) {
                drawable = this.f16186j0;
            } else {
                drawable = this.G;
            }
            float f11 = this.I;
            if (f11 <= s0.g.f34069a && drawable != null) {
                f11 = drawable.getIntrinsicWidth();
            }
            if (v3.c.a(this) == 0) {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + f11;
            } else {
                float f13 = rect.right - f10;
                rectF.right = f13;
                rectF.left = f13 - f11;
            }
            if (this.I0) {
                drawable2 = this.f16186j0;
            } else {
                drawable2 = this.G;
            }
            float f14 = this.I;
            if (f14 <= s0.g.f34069a && drawable2 != null) {
                f14 = (float) Math.ceil(pn.e.f(24, this.f16197v0));
                if (drawable2.getIntrinsicHeight() <= f14) {
                    f14 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f14 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f14;
        }
    }

    public final float x() {
        Drawable drawable;
        if (!a0() && !Z()) {
            return s0.g.f34069a;
        }
        float f10 = this.f16190o0;
        if (this.I0) {
            drawable = this.f16186j0;
        } else {
            drawable = this.G;
        }
        float f11 = this.I;
        if (f11 <= s0.g.f34069a && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f16191p0;
    }

    public final float y() {
        if (b0()) {
            return this.f16194s0 + this.f16182f0 + this.f16195t0;
        }
        return s0.g.f34069a;
    }
}
