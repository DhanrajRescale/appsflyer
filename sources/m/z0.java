package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f25812a;

    /* renamed from: b, reason: collision with root package name */
    public o3 f25813b;

    /* renamed from: c, reason: collision with root package name */
    public o3 f25814c;

    /* renamed from: d, reason: collision with root package name */
    public o3 f25815d;

    /* renamed from: e, reason: collision with root package name */
    public o3 f25816e;

    /* renamed from: f, reason: collision with root package name */
    public o3 f25817f;

    /* renamed from: g, reason: collision with root package name */
    public o3 f25818g;

    /* renamed from: h, reason: collision with root package name */
    public o3 f25819h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f25820i;

    /* renamed from: j, reason: collision with root package name */
    public int f25821j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f25822k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f25823l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25824m;

    public z0(TextView textView) {
        this.f25812a = textView;
        this.f25820i = new i1(textView);
    }

    public static o3 c(Context context, x xVar, int i10) {
        ColorStateList h10;
        synchronized (xVar) {
            h10 = xVar.f25797a.h(i10, context);
        }
        if (h10 != null) {
            o3 o3Var = new o3(0);
            o3Var.f25671c = true;
            o3Var.f25672d = h10;
            return o3Var;
        }
        return null;
    }

    public final void a(Drawable drawable, o3 o3Var) {
        if (drawable != null && o3Var != null) {
            x.e(drawable, o3Var, this.f25812a.getDrawableState());
        }
    }

    public final void b() {
        o3 o3Var = this.f25813b;
        TextView textView = this.f25812a;
        if (o3Var != null || this.f25814c != null || this.f25815d != null || this.f25816e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f25813b);
            a(compoundDrawables[1], this.f25814c);
            a(compoundDrawables[2], this.f25815d);
            a(compoundDrawables[3], this.f25816e);
        }
        if (this.f25817f != null || this.f25818g != null) {
            Drawable[] a10 = v0.a(textView);
            a(a10[0], this.f25817f);
            a(a10[2], this.f25818g);
        }
    }

    public final ColorStateList d() {
        o3 o3Var = this.f25819h;
        if (o3Var != null) {
            return (ColorStateList) o3Var.f25672d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        o3 o3Var = this.f25819h;
        if (o3Var != null) {
            return (PorterDuff.Mode) o3Var.f25673e;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i11;
        int i12;
        int resourceId;
        TextView textView = this.f25812a;
        Context context = textView.getContext();
        x a10 = x.a();
        int[] iArr = g.a.f16356h;
        h.c N = h.c.N(context, attributeSet, iArr, i10);
        d4.n1.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) N.f17584c, i10);
        int C = N.C(0, -1);
        if (N.H(3)) {
            this.f25813b = c(context, a10, N.C(3, 0));
        }
        if (N.H(1)) {
            this.f25814c = c(context, a10, N.C(1, 0));
        }
        if (N.H(4)) {
            this.f25815d = c(context, a10, N.C(4, 0));
        }
        if (N.H(2)) {
            this.f25816e = c(context, a10, N.C(2, 0));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (N.H(5)) {
            this.f25817f = c(context, a10, N.C(5, 0));
        }
        if (N.H(6)) {
            this.f25818g = c(context, a10, N.C(6, 0));
        }
        N.R();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = g.a.f16372x;
        if (C != -1) {
            h.c cVar = new h.c(context, context.obtainStyledAttributes(C, iArr2));
            if (!z12 && cVar.H(14)) {
                z10 = cVar.q(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            m(context, cVar);
            if (cVar.H(15)) {
                str = cVar.D(15);
            } else {
                str = null;
            }
            if (i13 >= 26 && cVar.H(13)) {
                str2 = cVar.D(13);
            } else {
                str2 = null;
            }
            cVar.R();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        h.c cVar2 = new h.c(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z12 && cVar2.H(14)) {
            z10 = cVar2.q(14, false);
            z11 = true;
        }
        if (cVar2.H(15)) {
            str = cVar2.D(15);
        }
        if (i13 >= 26 && cVar2.H(13)) {
            str2 = cVar2.D(13);
        }
        String str3 = str2;
        if (i13 >= 28 && cVar2.H(0) && cVar2.u(0, -1) == 0) {
            textView.setTextSize(0, s0.g.f34069a);
        }
        m(context, cVar2);
        cVar2.R();
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f25823l;
        if (typeface != null) {
            if (this.f25822k == -1) {
                textView.setTypeface(typeface, this.f25821j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            x0.d(textView, str3);
        }
        if (str != null) {
            w0.b(textView, w0.a(str));
        }
        int[] iArr3 = g.a.f16357i;
        i1 i1Var = this.f25820i;
        Context context2 = i1Var.f25556j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = i1Var.f25555i;
        d4.n1.m(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            i1Var.f25547a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f12 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr4[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                i1Var.f25552f = i1.b(iArr4);
                i1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (i1Var.j()) {
            if (i1Var.f25547a == 1) {
                if (!i1Var.f25553g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i12 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i12 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    i1Var.k(f11, f12, f10);
                }
                i1Var.h();
            }
        } else {
            i1Var.f25547a = 0;
        }
        if (d4.f25514b && i1Var.f25547a != 0) {
            int[] iArr5 = i1Var.f25552f;
            if (iArr5.length > 0) {
                if (x0.a(textView) != -1.0f) {
                    x0.b(textView, Math.round(i1Var.f25550d), Math.round(i1Var.f25551e), Math.round(i1Var.f25549c), 0);
                } else {
                    x0.c(textView, iArr5, 0);
                }
            }
        }
        h.c cVar3 = new h.c(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int C2 = cVar3.C(8, -1);
        if (C2 != -1) {
            drawable = a10.b(context, C2);
        } else {
            drawable = null;
        }
        int C3 = cVar3.C(13, -1);
        if (C3 != -1) {
            drawable2 = a10.b(context, C3);
        } else {
            drawable2 = null;
        }
        int C4 = cVar3.C(9, -1);
        if (C4 != -1) {
            drawable3 = a10.b(context, C4);
        } else {
            drawable3 = null;
        }
        int C5 = cVar3.C(6, -1);
        if (C5 != -1) {
            drawable4 = a10.b(context, C5);
        } else {
            drawable4 = null;
        }
        int C6 = cVar3.C(10, -1);
        if (C6 != -1) {
            drawable5 = a10.b(context, C6);
        } else {
            drawable5 = null;
        }
        int C7 = cVar3.C(7, -1);
        if (C7 != -1) {
            drawable6 = a10.b(context, C7);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = v0.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    v0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = v0.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            v0.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (cVar3.H(11)) {
            h4.r.f(textView, cVar3.r(11));
        }
        if (cVar3.H(12)) {
            i11 = -1;
            h4.r.g(textView, q1.c(cVar3.z(12, -1), null));
        } else {
            i11 = -1;
        }
        int u10 = cVar3.u(15, i11);
        int u11 = cVar3.u(18, i11);
        int u12 = cVar3.u(19, i11);
        cVar3.R();
        if (u10 != i11) {
            qu.i0.I(textView, u10);
        }
        if (u11 != i11) {
            qu.i0.J(textView, u11);
        }
        if (u12 != i11) {
            qu.i0.k(u12);
            if (u12 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(u12 - r1, 1.0f);
            }
        }
    }

    public final void g(int i10, Context context) {
        String D;
        h.c cVar = new h.c(context, context.obtainStyledAttributes(i10, g.a.f16372x));
        boolean H = cVar.H(14);
        TextView textView = this.f25812a;
        if (H) {
            textView.setAllCaps(cVar.q(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (cVar.H(0) && cVar.u(0, -1) == 0) {
            textView.setTextSize(0, s0.g.f34069a);
        }
        m(context, cVar);
        if (i11 >= 26 && cVar.H(13) && (D = cVar.D(13)) != null) {
            x0.d(textView, D);
        }
        cVar.R();
        Typeface typeface = this.f25823l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f25821j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        i1 i1Var = this.f25820i;
        if (i1Var.j()) {
            DisplayMetrics displayMetrics = i1Var.f25556j.getResources().getDisplayMetrics();
            i1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (i1Var.h()) {
                i1Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        i1 i1Var = this.f25820i;
        if (i1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = i1Var.f25556j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                i1Var.f25552f = i1.b(iArr2);
                if (!i1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                i1Var.f25553g = false;
            }
            if (i1Var.h()) {
                i1Var.a();
            }
        }
    }

    public final void j(int i10) {
        i1 i1Var = this.f25820i;
        if (i1Var.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = i1Var.f25556j.getResources().getDisplayMetrics();
                    i1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (i1Var.h()) {
                        i1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(jr.h.n("Unknown auto-size text type: ", i10));
            }
            i1Var.f25547a = 0;
            i1Var.f25550d = -1.0f;
            i1Var.f25551e = -1.0f;
            i1Var.f25549c = -1.0f;
            i1Var.f25552f = new int[0];
            i1Var.f25548b = false;
        }
    }

    public final void k(ColorStateList colorStateList) {
        boolean z10 = false;
        if (this.f25819h == null) {
            this.f25819h = new o3(0);
        }
        o3 o3Var = this.f25819h;
        o3Var.f25672d = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        }
        o3Var.f25671c = z10;
        this.f25813b = o3Var;
        this.f25814c = o3Var;
        this.f25815d = o3Var;
        this.f25816e = o3Var;
        this.f25817f = o3Var;
        this.f25818g = o3Var;
    }

    public final void l(PorterDuff.Mode mode) {
        boolean z10 = false;
        if (this.f25819h == null) {
            this.f25819h = new o3(0);
        }
        o3 o3Var = this.f25819h;
        o3Var.f25673e = mode;
        if (mode != null) {
            z10 = true;
        }
        o3Var.f25670b = z10;
        this.f25813b = o3Var;
        this.f25814c = o3Var;
        this.f25815d = o3Var;
        this.f25816e = o3Var;
        this.f25817f = o3Var;
        this.f25818g = o3Var;
    }

    public final void m(Context context, h.c cVar) {
        String D;
        boolean z10;
        boolean z11;
        this.f25821j = cVar.z(2, this.f25821j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int z12 = cVar.z(11, -1);
            this.f25822k = z12;
            if (z12 != -1) {
                this.f25821j &= 2;
            }
        }
        int i11 = 10;
        boolean z13 = false;
        if (!cVar.H(10) && !cVar.H(12)) {
            if (cVar.H(1)) {
                this.f25824m = false;
                int z14 = cVar.z(1, 1);
                if (z14 != 1) {
                    if (z14 != 2) {
                        if (z14 == 3) {
                            this.f25823l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f25823l = Typeface.SERIF;
                    return;
                }
                this.f25823l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f25823l = null;
        if (cVar.H(12)) {
            i11 = 12;
        }
        int i12 = this.f25822k;
        int i13 = this.f25821j;
        if (!context.isRestricted()) {
            try {
                Typeface y10 = cVar.y(i11, this.f25821j, new t0(this, i12, i13, new WeakReference(this.f25812a)));
                if (y10 != null) {
                    if (i10 >= 28 && this.f25822k != -1) {
                        Typeface create = Typeface.create(y10, 0);
                        int i14 = this.f25822k;
                        if ((this.f25821j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f25823l = y0.a(create, i14, z11);
                    } else {
                        this.f25823l = y10;
                    }
                }
                if (this.f25823l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25824m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f25823l == null && (D = cVar.D(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f25822k != -1) {
                Typeface create2 = Typeface.create(D, 0);
                int i15 = this.f25822k;
                if ((this.f25821j & 2) != 0) {
                    z13 = true;
                }
                this.f25823l = y0.a(create2, i15, z13);
                return;
            }
            this.f25823l = Typeface.create(D, this.f25821j);
        }
    }
}
