package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ap.a;
import b4.o;
import com.google.android.material.internal.CheckableImageButton;
import d4.e1;
import d4.n1;
import d4.q;
import d4.v0;
import d4.w0;
import d4.y0;
import h.c;
import in.i;
import iu.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.q1;
import m.v2;
import mo.b;
import mo.c0;
import nn.d;
import okhttp3.HttpUrl;
import pn.e;
import r3.k;
import s0.g;
import t7.s;
import to.h;
import to.l;
import zo.p;
import zo.r;
import zo.t;
import zo.u;
import zo.v;
import zo.w;
import zo.x;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] P0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public boolean A;
    public int A0;
    public CharSequence B;
    public int B0;
    public boolean C;
    public ColorStateList C0;
    public h D;
    public int D0;
    public h E;
    public int E0;
    public StateListDrawable F;
    public int F0;
    public boolean G;
    public int G0;
    public h H;
    public int H0;
    public h I;
    public boolean I0;
    public l J;
    public final b J0;
    public boolean K0;
    public boolean L0;
    public ValueAnimator M0;
    public boolean N0;
    public boolean O0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f11479a;

    /* renamed from: b, reason: collision with root package name */
    public final t f11480b;

    /* renamed from: c, reason: collision with root package name */
    public final zo.l f11481c;

    /* renamed from: d, reason: collision with root package name */
    public EditText f11482d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f11483e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11484e0;

    /* renamed from: f, reason: collision with root package name */
    public int f11485f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f11486f0;

    /* renamed from: g, reason: collision with root package name */
    public int f11487g;

    /* renamed from: g0, reason: collision with root package name */
    public int f11488g0;

    /* renamed from: h, reason: collision with root package name */
    public int f11489h;

    /* renamed from: h0, reason: collision with root package name */
    public int f11490h0;

    /* renamed from: i, reason: collision with root package name */
    public int f11491i;

    /* renamed from: i0, reason: collision with root package name */
    public int f11492i0;

    /* renamed from: j, reason: collision with root package name */
    public final p f11493j;

    /* renamed from: j0, reason: collision with root package name */
    public int f11494j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11495k;

    /* renamed from: k0, reason: collision with root package name */
    public int f11496k0;

    /* renamed from: l, reason: collision with root package name */
    public int f11497l;

    /* renamed from: l0, reason: collision with root package name */
    public int f11498l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11499m;

    /* renamed from: m0, reason: collision with root package name */
    public int f11500m0;

    /* renamed from: n, reason: collision with root package name */
    public w f11501n;
    public final Rect n0;

    /* renamed from: o, reason: collision with root package name */
    public AppCompatTextView f11502o;

    /* renamed from: o0, reason: collision with root package name */
    public final Rect f11503o0;

    /* renamed from: p, reason: collision with root package name */
    public int f11504p;

    /* renamed from: p0, reason: collision with root package name */
    public final RectF f11505p0;

    /* renamed from: q, reason: collision with root package name */
    public int f11506q;

    /* renamed from: q0, reason: collision with root package name */
    public Typeface f11507q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f11508r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorDrawable f11509r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11510s;

    /* renamed from: s0, reason: collision with root package name */
    public int f11511s0;

    /* renamed from: t, reason: collision with root package name */
    public AppCompatTextView f11512t;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f11513t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f11514u;

    /* renamed from: u0, reason: collision with root package name */
    public ColorDrawable f11515u0;

    /* renamed from: v, reason: collision with root package name */
    public int f11516v;

    /* renamed from: v0, reason: collision with root package name */
    public int f11517v0;

    /* renamed from: w, reason: collision with root package name */
    public t7.h f11518w;

    /* renamed from: w0, reason: collision with root package name */
    public Drawable f11519w0;

    /* renamed from: x, reason: collision with root package name */
    public t7.h f11520x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f11521x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f11522y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f11523y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f11524z;

    /* renamed from: z0, reason: collision with root package name */
    public int f11525z0;

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.assetgro.stockgro.prod.R.attr.textInputStyle, 2132083702), attributeSet, com.assetgro.stockgro.prod.R.attr.textInputStyle);
        this.f11485f = -1;
        this.f11487g = -1;
        this.f11489h = -1;
        this.f11491i = -1;
        this.f11493j = new p(this);
        this.f11501n = new i5.w(18);
        this.n0 = new Rect();
        this.f11503o0 = new Rect();
        this.f11505p0 = new RectF();
        this.f11513t0 = new LinkedHashSet();
        b bVar = new b(this);
        this.J0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11479a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = vn.a.f38180a;
        bVar.W = linearInterpolator;
        bVar.i(false);
        bVar.V = linearInterpolator;
        bVar.i(false);
        bVar.l(8388659);
        c g10 = c0.g(context2, attributeSet, un.a.W, com.assetgro.stockgro.prod.R.attr.textInputStyle, 2132083702, 22, 20, 38, 43, 47);
        t tVar = new t(this, g10);
        this.f11480b = tVar;
        this.A = g10.q(46, true);
        setHint(g10.F(4));
        this.L0 = g10.q(45, true);
        this.K0 = g10.q(40, true);
        if (g10.H(6)) {
            setMinEms(g10.z(6, -1));
        } else if (g10.H(3)) {
            setMinWidth(g10.u(3, -1));
        }
        if (g10.H(5)) {
            setMaxEms(g10.z(5, -1));
        } else if (g10.H(2)) {
            setMaxWidth(g10.u(2, -1));
        }
        this.J = l.c(context2, attributeSet, com.assetgro.stockgro.prod.R.attr.textInputStyle, 2132083702).a();
        this.f11486f0 = context2.getResources().getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f11490h0 = g10.t(9, 0);
        this.f11494j0 = g10.u(16, context2.getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f11496k0 = g10.u(17, context2.getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f11492i0 = this.f11494j0;
        float dimension = ((TypedArray) g10.f17584c).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) g10.f17584c).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) g10.f17584c).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) g10.f17584c).getDimension(11, -1.0f);
        i f10 = this.J.f();
        if (dimension >= g.f34069a) {
            f10.f20166e = new to.a(dimension);
        }
        if (dimension2 >= g.f34069a) {
            f10.f20167f = new to.a(dimension2);
        }
        if (dimension3 >= g.f34069a) {
            f10.f20168g = new to.a(dimension3);
        }
        if (dimension4 >= g.f34069a) {
            f10.f20169h = new to.a(dimension4);
        }
        this.J = f10.a();
        ColorStateList m12 = dp.b.m1(context2, g10, 7);
        if (m12 != null) {
            int defaultColor = m12.getDefaultColor();
            this.D0 = defaultColor;
            this.f11500m0 = defaultColor;
            if (m12.isStateful()) {
                this.E0 = m12.getColorForState(new int[]{-16842910}, -1);
                this.F0 = m12.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.G0 = m12.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.F0 = this.D0;
                ColorStateList colorStateList = k.getColorStateList(context2, com.assetgro.stockgro.prod.R.color.mtrl_filled_background_color);
                this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f11500m0 = 0;
            this.D0 = 0;
            this.E0 = 0;
            this.F0 = 0;
            this.G0 = 0;
        }
        if (g10.H(1)) {
            ColorStateList r10 = g10.r(1);
            this.f11523y0 = r10;
            this.f11521x0 = r10;
        }
        ColorStateList m13 = dp.b.m1(context2, g10, 14);
        this.B0 = ((TypedArray) g10.f17584c).getColor(14, 0);
        this.f11525z0 = k.getColor(context2, com.assetgro.stockgro.prod.R.color.mtrl_textinput_default_box_stroke_color);
        this.H0 = k.getColor(context2, com.assetgro.stockgro.prod.R.color.mtrl_textinput_disabled_color);
        this.A0 = k.getColor(context2, com.assetgro.stockgro.prod.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m13 != null) {
            setBoxStrokeColorStateList(m13);
        }
        if (g10.H(15)) {
            setBoxStrokeErrorColor(dp.b.m1(context2, g10, 15));
        }
        if (g10.C(47, -1) != -1) {
            setHintTextAppearance(g10.C(47, 0));
        }
        int C = g10.C(38, 0);
        CharSequence F = g10.F(33);
        int z10 = g10.z(32, 1);
        boolean q10 = g10.q(34, false);
        int C2 = g10.C(43, 0);
        boolean q11 = g10.q(42, false);
        CharSequence F2 = g10.F(41);
        int C3 = g10.C(55, 0);
        CharSequence F3 = g10.F(54);
        boolean q12 = g10.q(18, false);
        setCounterMaxLength(g10.z(19, -1));
        this.f11506q = g10.C(22, 0);
        this.f11504p = g10.C(20, 0);
        setBoxBackgroundMode(g10.z(8, 0));
        setErrorContentDescription(F);
        setErrorAccessibilityLiveRegion(z10);
        setCounterOverflowTextAppearance(this.f11504p);
        setHelperTextTextAppearance(C2);
        setErrorTextAppearance(C);
        setCounterTextAppearance(this.f11506q);
        setPlaceholderText(F3);
        setPlaceholderTextAppearance(C3);
        if (g10.H(39)) {
            setErrorTextColor(g10.r(39));
        }
        if (g10.H(44)) {
            setHelperTextColor(g10.r(44));
        }
        if (g10.H(48)) {
            setHintTextColor(g10.r(48));
        }
        if (g10.H(23)) {
            setCounterTextColor(g10.r(23));
        }
        if (g10.H(21)) {
            setCounterOverflowTextColor(g10.r(21));
        }
        if (g10.H(56)) {
            setPlaceholderTextColor(g10.r(56));
        }
        zo.l lVar = new zo.l(this, g10);
        this.f11481c = lVar;
        boolean q13 = g10.q(0, true);
        g10.R();
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(this, 2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            e1.m(this, 1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(q13);
        setHelperTextEnabled(q11);
        setErrorEnabled(q10);
        setCounterEnabled(q12);
        setHelperText(F2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f11482d;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int k10 = e.k(this.f11482d, com.assetgro.stockgro.prod.R.attr.colorControlHighlight);
            int i10 = this.f11488g0;
            int[][] iArr = P0;
            if (i10 == 2) {
                Context context = getContext();
                h hVar = this.D;
                int j10 = e.j(context, com.assetgro.stockgro.prod.R.attr.colorSurface, "TextInputLayout");
                h hVar2 = new h(hVar.f36253a.f36231a);
                int p10 = e.p(k10, 0.1f, j10);
                hVar2.n(new ColorStateList(iArr, new int[]{p10, 0}));
                hVar2.setTint(j10);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{p10, j10});
                h hVar3 = new h(hVar.f36253a.f36231a);
                hVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
            }
            if (i10 == 1) {
                h hVar4 = this.D;
                int i11 = this.f11500m0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{e.p(k10, 0.1f, i11), i11}), hVar4, hVar4);
            }
            return null;
        }
        return this.D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.F.addState(new int[0], f(false));
        }
        return this.F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E == null) {
            this.E = f(true);
        }
        return this.E;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f11482d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f11482d = editText;
            int i10 = this.f11485f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f11489h);
            }
            int i11 = this.f11487g;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f11491i);
            }
            this.G = false;
            i();
            setTextInputAccessibilityDelegate(new v(this));
            Typeface typeface = this.f11482d.getTypeface();
            b bVar = this.J0;
            boolean m10 = bVar.m(typeface);
            boolean o10 = bVar.o(typeface);
            if (m10 || o10) {
                bVar.i(false);
            }
            float textSize = this.f11482d.getTextSize();
            if (bVar.f27881l != textSize) {
                bVar.f27881l = textSize;
                bVar.i(false);
            }
            float letterSpacing = this.f11482d.getLetterSpacing();
            if (bVar.f27872g0 != letterSpacing) {
                bVar.f27872g0 = letterSpacing;
                bVar.i(false);
            }
            int gravity = this.f11482d.getGravity();
            bVar.l((gravity & (-113)) | 48);
            if (bVar.f27877j != gravity) {
                bVar.f27877j = gravity;
                bVar.i(false);
            }
            this.f11482d.addTextChangedListener(new v2(this, 9));
            if (this.f11521x0 == null) {
                this.f11521x0 = this.f11482d.getHintTextColors();
            }
            if (this.A) {
                if (TextUtils.isEmpty(this.B)) {
                    CharSequence hint = this.f11482d.getHint();
                    this.f11483e = hint;
                    setHint(hint);
                    this.f11482d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f11502o != null) {
                n(this.f11482d.getText());
            }
            q();
            this.f11493j.b();
            this.f11480b.bringToFront();
            zo.l lVar = this.f11481c;
            lVar.bringToFront();
            Iterator it = this.f11513t0.iterator();
            while (it.hasNext()) {
                ((zo.k) it.next()).a(this);
            }
            lVar.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.B)) {
            this.B = charSequence;
            b bVar = this.J0;
            if (charSequence == null || !TextUtils.equals(bVar.G, charSequence)) {
                bVar.G = charSequence;
                bVar.H = null;
                Bitmap bitmap = bVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.K = null;
                }
                bVar.i(false);
            }
            if (!this.I0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f11510s == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f11512t;
            if (appCompatTextView != null) {
                this.f11479a.addView(appCompatTextView);
                this.f11512t.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f11512t;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f11512t = null;
        }
        this.f11510s = z10;
    }

    public final void a(float f10) {
        b bVar = this.J0;
        if (bVar.f27861b == f10) {
            return;
        }
        if (this.M0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.M0 = valueAnimator;
            valueAnimator.setInterpolator(dp.b.F1(getContext(), com.assetgro.stockgro.prod.R.attr.motionEasingEmphasizedInterpolator, vn.a.f38181b));
            this.M0.setDuration(dp.b.E1(getContext(), com.assetgro.stockgro.prod.R.attr.motionDurationMedium4, 167));
            this.M0.addUpdateListener(new j9.w(this, 7));
        }
        this.M0.setFloatValues(bVar.f27861b, f10);
        this.M0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f11479a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        ColorStateList valueOf;
        int i10;
        int i11;
        h hVar = this.D;
        if (hVar == null) {
            return;
        }
        l lVar = hVar.f36253a.f36231a;
        l lVar2 = this.J;
        if (lVar != lVar2) {
            hVar.setShapeAppearanceModel(lVar2);
        }
        if (this.f11488g0 == 2 && (i10 = this.f11492i0) > -1 && (i11 = this.f11498l0) != 0) {
            h hVar2 = this.D;
            hVar2.f36253a.f36241k = i10;
            hVar2.invalidateSelf();
            hVar2.r(ColorStateList.valueOf(i11));
        }
        int i12 = this.f11500m0;
        if (this.f11488g0 == 1) {
            i12 = u3.a.b(this.f11500m0, e.i(getContext(), com.assetgro.stockgro.prod.R.attr.colorSurface, 0));
        }
        this.f11500m0 = i12;
        this.D.n(ColorStateList.valueOf(i12));
        h hVar3 = this.H;
        if (hVar3 != null && this.I != null) {
            if (this.f11492i0 > -1 && this.f11498l0 != 0) {
                if (this.f11482d.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f11525z0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f11498l0);
                }
                hVar3.n(valueOf);
                this.I.n(ColorStateList.valueOf(this.f11498l0));
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float e10;
        if (!this.A) {
            return 0;
        }
        int i10 = this.f11488g0;
        b bVar = this.J0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            e10 = bVar.e() / 2.0f;
        } else {
            e10 = bVar.e();
        }
        return (int) e10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t7.p, t7.h] */
    public final t7.h d() {
        ?? pVar = new t7.p();
        pVar.f35475x = 3;
        pVar.f35505c = dp.b.E1(getContext(), com.assetgro.stockgro.prod.R.attr.motionDurationShort2, 87);
        pVar.f35506d = dp.b.F1(getContext(), com.assetgro.stockgro.prod.R.attr.motionEasingLinearInterpolator, vn.a.f38180a);
        return pVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f11482d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f11483e != null) {
            boolean z10 = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f11482d.setHint(this.f11483e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f11482d.setHint(hint);
                this.C = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f11479a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f11482d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.O0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.O0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar;
        super.draw(canvas);
        boolean z10 = this.A;
        b bVar = this.J0;
        if (z10) {
            bVar.d(canvas);
        }
        if (this.I != null && (hVar = this.H) != null) {
            hVar.draw(canvas);
            if (this.f11482d.isFocused()) {
                Rect bounds = this.I.getBounds();
                Rect bounds2 = this.H.getBounds();
                float f10 = bVar.f27861b;
                int centerX = bounds2.centerX();
                bounds.left = vn.a.c(centerX, f10, bounds2.left);
                bounds.right = vn.a.c(centerX, f10, bounds2.right);
                this.I.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.N0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.N0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            mo.b r3 = r4.J0
            if (r3 == 0) goto L2f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.f27886o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f27885n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.i(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f11482d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = d4.n1.f13788a
            boolean r3 = d4.y0.c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.t(r0, r2)
        L47:
            r4.q()
            r4.w()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.N0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof zo.g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, to.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, vl.b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, vl.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, vl.b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, vl.b] */
    public final h f(boolean z10) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = g.f34069a;
        if (z10) {
            f10 = dimensionPixelOffset2;
        }
        EditText editText = this.f11482d;
        if (editText instanceof r) {
            dimensionPixelOffset = ((r) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        to.e d12 = dp.b.d1();
        to.e d13 = dp.b.d1();
        to.e d14 = dp.b.d1();
        to.e d15 = dp.b.d1();
        to.a aVar = new to.a(f10);
        to.a aVar2 = new to.a(f10);
        to.a aVar3 = new to.a(dimensionPixelOffset2);
        to.a aVar4 = new to.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f36279a = obj;
        obj5.f36280b = obj2;
        obj5.f36281c = obj3;
        obj5.f36282d = obj4;
        obj5.f36283e = aVar;
        obj5.f36284f = aVar2;
        obj5.f36285g = aVar4;
        obj5.f36286h = aVar3;
        obj5.f36287i = d12;
        obj5.f36288j = d13;
        obj5.f36289k = d14;
        obj5.f36290l = d15;
        Context context = getContext();
        Paint paint = h.f36252w;
        int j10 = e.j(context, com.assetgro.stockgro.prod.R.attr.colorSurface, h.class.getSimpleName());
        h hVar = new h();
        hVar.k(context);
        hVar.n(ColorStateList.valueOf(j10));
        hVar.m(dimensionPixelOffset);
        hVar.setShapeAppearanceModel(obj5);
        to.g gVar = hVar.f36253a;
        if (gVar.f36238h == null) {
            gVar.f36238h = new Rect();
        }
        hVar.f36253a.f36238h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f11482d.getCompoundPaddingLeft() + i10;
        if (getPrefixText() != null && !z10) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11482d;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    @NonNull
    public h getBoxBackground() {
        int i10 = this.f11488g0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.D;
    }

    public int getBoxBackgroundColor() {
        return this.f11500m0;
    }

    public int getBoxBackgroundMode() {
        return this.f11488g0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f11490h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean o10 = e.o(this);
        RectF rectF = this.f11505p0;
        if (o10) {
            return this.J.f36286h.a(rectF);
        }
        return this.J.f36285g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean o10 = e.o(this);
        RectF rectF = this.f11505p0;
        if (o10) {
            return this.J.f36285g.a(rectF);
        }
        return this.J.f36286h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean o10 = e.o(this);
        RectF rectF = this.f11505p0;
        if (o10) {
            return this.J.f36283e.a(rectF);
        }
        return this.J.f36284f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean o10 = e.o(this);
        RectF rectF = this.f11505p0;
        if (o10) {
            return this.J.f36284f.a(rectF);
        }
        return this.J.f36283e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.B0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.C0;
    }

    public int getBoxStrokeWidth() {
        return this.f11494j0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f11496k0;
    }

    public int getCounterMaxLength() {
        return this.f11497l;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f11495k && this.f11499m && (appCompatTextView = this.f11502o) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f11524z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f11522y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f11521x0;
    }

    public EditText getEditText() {
        return this.f11482d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f11481c.f42621g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f11481c.f42621g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f11481c.f42627m;
    }

    public int getEndIconMode() {
        return this.f11481c.f42623i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f11481c.f42628n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f11481c.f42621g;
    }

    public CharSequence getError() {
        p pVar = this.f11493j;
        if (pVar.f42663q) {
            return pVar.f42662p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f11493j.f42666t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f11493j.f42665s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f11493j.f42664r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f11481c.f42617c.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f11493j;
        if (pVar.f42670x) {
            return pVar.f42669w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f11493j.f42671y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.J0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.J0;
        return bVar.f(bVar.f27886o);
    }

    public ColorStateList getHintTextColor() {
        return this.f11523y0;
    }

    @NonNull
    public w getLengthCounter() {
        return this.f11501n;
    }

    public int getMaxEms() {
        return this.f11487g;
    }

    public int getMaxWidth() {
        return this.f11491i;
    }

    public int getMinEms() {
        return this.f11485f;
    }

    public int getMinWidth() {
        return this.f11489h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11481c.f42621g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11481c.f42621g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f11510s) {
            return this.f11508r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f11516v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f11514u;
    }

    public CharSequence getPrefixText() {
        return this.f11480b.f42688c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f11480b.f42687b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f11480b.f42687b;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f11480b.f42689d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f11480b.f42689d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f11480b.f42692g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f11480b.f42693h;
    }

    public CharSequence getSuffixText() {
        return this.f11481c.f42630p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f11481c.f42631q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f11481c.f42631q;
    }

    public Typeface getTypeface() {
        return this.f11507q0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f11482d.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f11488g0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.A && !(this.D instanceof zo.g)) {
                        l lVar = this.J;
                        int i11 = zo.g.f42595y;
                        if (lVar == null) {
                            lVar = new l();
                        }
                        this.D = new zo.g(new zo.e(lVar, new RectF()));
                    } else {
                        this.D = new h(this.J);
                    }
                    this.H = null;
                    this.I = null;
                } else {
                    throw new IllegalArgumentException(d.m(new StringBuilder(), this.f11488g0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.D = new h(this.J);
                this.H = new h();
                this.I = new h();
            }
        } else {
            this.D = null;
            this.H = null;
            this.I = null;
        }
        r();
        w();
        if (this.f11488g0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f11490h0 = getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (dp.b.t1(getContext())) {
                this.f11490h0 = getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f11482d != null && this.f11488g0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f11482d;
                WeakHashMap weakHashMap = n1.f13788a;
                w0.k(editText, w0.f(editText), getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_filled_edittext_font_2_0_padding_top), w0.e(this.f11482d), getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (dp.b.t1(getContext())) {
                EditText editText2 = this.f11482d;
                WeakHashMap weakHashMap2 = n1.f13788a;
                w0.k(editText2, w0.f(editText2), getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_filled_edittext_font_1_3_padding_top), w0.e(this.f11482d), getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f11488g0 != 0) {
            s();
        }
        EditText editText3 = this.f11482d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f11488g0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f11482d.getWidth();
        int gravity = this.f11482d.getGravity();
        b bVar = this.J0;
        boolean b10 = bVar.b(bVar.G);
        bVar.I = b10;
        Rect rect = bVar.f27873h;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f10 = rect.right;
                    f11 = bVar.f27878j0;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
            } else if (b10) {
                i11 = rect.left;
                f12 = i11;
            } else {
                f10 = rect.right;
                f11 = bVar.f27878j0;
            }
            float max = Math.max(f12, rect.left);
            rectF = this.f11505p0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (bVar.I) {
                        i10 = rect.right;
                        f13 = i10;
                    } else {
                        f13 = bVar.f27878j0 + max;
                    }
                } else if (bVar.I) {
                    f13 = max + bVar.f27878j0;
                } else {
                    i10 = rect.right;
                    f13 = i10;
                }
            } else {
                f13 = (width / 2.0f) + (bVar.f27878j0 / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = bVar.e() + rect.top;
            if (rectF.width() <= g.f34069a && rectF.height() > g.f34069a) {
                float f14 = rectF.left;
                float f15 = this.f11486f0;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f11492i0);
                zo.g gVar = (zo.g) this.D;
                gVar.getClass();
                gVar.v(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f10 = width / 2.0f;
        f11 = bVar.f27878j0 / 2.0f;
        f12 = f10 - f11;
        float max2 = Math.max(f12, rect.left);
        rectF = this.f11505p0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (bVar.f27878j0 / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = bVar.e() + rect.top;
        if (rectF.width() <= g.f34069a) {
        }
    }

    public final void l(TextView textView, int i10) {
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132083271);
        textView.setTextColor(k.getColor(getContext(), com.assetgro.stockgro.prod.R.color.design_error));
    }

    public final boolean m() {
        p pVar = this.f11493j;
        if (pVar.f42661o == 1 && pVar.f42664r != null && !TextUtils.isEmpty(pVar.f42662p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        b4.c cVar;
        ((i5.w) this.f11501n).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z11 = this.f11499m;
        int i12 = this.f11497l;
        String str = null;
        if (i12 == -1) {
            this.f11502o.setText(String.valueOf(i10));
            this.f11502o.setContentDescription(null);
            this.f11499m = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11499m = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f11502o;
            int i13 = this.f11497l;
            if (this.f11499m) {
                i11 = com.assetgro.stockgro.prod.R.string.character_counter_overflowed_content_description;
            } else {
                i11 = com.assetgro.stockgro.prod.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z11 != this.f11499m) {
                o();
            }
            String str2 = b4.c.f3165d;
            Locale locale = Locale.getDefault();
            int i14 = b4.p.f3184a;
            if (o.a(locale) == 1) {
                cVar = b4.c.f3168g;
            } else {
                cVar = b4.c.f3167f;
            }
            AppCompatTextView appCompatTextView2 = this.f11502o;
            String string = getContext().getString(com.assetgro.stockgro.prod.R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f11497l));
            if (string == null) {
                cVar.getClass();
            } else {
                str = cVar.c(string, cVar.f3171c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f11482d != null && z11 != this.f11499m) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f11502o;
        if (appCompatTextView != null) {
            if (this.f11499m) {
                i10 = this.f11504p;
            } else {
                i10 = this.f11506q;
            }
            l(appCompatTextView, i10);
            if (!this.f11499m && (colorStateList2 = this.f11522y) != null) {
                this.f11502o.setTextColor(colorStateList2);
            }
            if (this.f11499m && (colorStateList = this.f11524z) != null) {
                this.f11502o.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.J0.h(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f11482d;
        if (editText != null) {
            ThreadLocal threadLocal = mo.c.f27901a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.n0;
            rect.set(0, 0, width, height);
            mo.c.b(this, editText, rect);
            h hVar = this.H;
            if (hVar != null) {
                int i14 = rect.bottom;
                hVar.setBounds(rect.left, i14 - this.f11494j0, rect.right, i14);
            }
            h hVar2 = this.I;
            if (hVar2 != null) {
                int i15 = rect.bottom;
                hVar2.setBounds(rect.left, i15 - this.f11496k0, rect.right, i15);
            }
            if (this.A) {
                float textSize = this.f11482d.getTextSize();
                b bVar = this.J0;
                if (bVar.f27881l != textSize) {
                    bVar.f27881l = textSize;
                    bVar.i(false);
                }
                int gravity = this.f11482d.getGravity();
                bVar.l((gravity & (-113)) | 48);
                if (bVar.f27877j != gravity) {
                    bVar.f27877j = gravity;
                    bVar.i(false);
                }
                if (this.f11482d != null) {
                    boolean o10 = e.o(this);
                    int i16 = rect.bottom;
                    Rect rect2 = this.f11503o0;
                    rect2.bottom = i16;
                    int i17 = this.f11488g0;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            rect2.left = g(rect.left, o10);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, o10);
                        } else {
                            rect2.left = this.f11482d.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f11482d.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, o10);
                        rect2.top = rect.top + this.f11490h0;
                        rect2.right = h(rect.right, o10);
                    }
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = bVar.f27873h;
                    if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                        rect3.set(i18, i19, i20, i21);
                        bVar.S = true;
                    }
                    if (this.f11482d != null) {
                        TextPaint textPaint = bVar.U;
                        textPaint.setTextSize(bVar.f27881l);
                        textPaint.setTypeface(bVar.f27900z);
                        textPaint.setLetterSpacing(bVar.f27872g0);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f11482d.getCompoundPaddingLeft() + rect.left;
                        if (this.f11488g0 == 1 && this.f11482d.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f10 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f11482d.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f11482d.getCompoundPaddingRight();
                        if (this.f11488g0 == 1 && this.f11482d.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect2.top + f10);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f11482d.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i22 = rect2.left;
                        int i23 = rect2.top;
                        int i24 = rect2.right;
                        Rect rect4 = bVar.f27871g;
                        if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                            rect4.set(i22, i23, i24, compoundPaddingBottom);
                            bVar.S = true;
                        }
                        bVar.i(false);
                        if (e() && !this.I0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f11482d;
        int i12 = 1;
        zo.l lVar = this.f11481c;
        boolean z10 = false;
        if (editText2 != null && this.f11482d.getMeasuredHeight() < (max = Math.max(lVar.getMeasuredHeight(), this.f11480b.getMeasuredHeight()))) {
            this.f11482d.setMinimumHeight(max);
            z10 = true;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f11482d.post(new u(this, i12));
        }
        if (this.f11512t != null && (editText = this.f11482d) != null) {
            this.f11512t.setGravity(editText.getGravity());
            this.f11512t.setPadding(this.f11482d.getCompoundPaddingLeft(), this.f11482d.getCompoundPaddingTop(), this.f11482d.getCompoundPaddingRight(), this.f11482d.getCompoundPaddingBottom());
        }
        lVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f22040a);
        setError(xVar.f42699c);
        if (xVar.f42700d) {
            post(new u(this, 0));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, to.l] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f11484e0) {
            to.c cVar = this.J.f36283e;
            RectF rectF = this.f11505p0;
            float a10 = cVar.a(rectF);
            float a11 = this.J.f36284f.a(rectF);
            float a12 = this.J.f36286h.a(rectF);
            float a13 = this.J.f36285g.a(rectF);
            l lVar = this.J;
            vl.b bVar = lVar.f36279a;
            vl.b bVar2 = lVar.f36280b;
            vl.b bVar3 = lVar.f36282d;
            vl.b bVar4 = lVar.f36281c;
            to.e d12 = dp.b.d1();
            to.e d13 = dp.b.d1();
            to.e d14 = dp.b.d1();
            to.e d15 = dp.b.d1();
            i.b(bVar2);
            i.b(bVar);
            i.b(bVar4);
            i.b(bVar3);
            to.a aVar = new to.a(a11);
            to.a aVar2 = new to.a(a10);
            to.a aVar3 = new to.a(a13);
            to.a aVar4 = new to.a(a12);
            ?? obj = new Object();
            obj.f36279a = bVar2;
            obj.f36280b = bVar;
            obj.f36281c = bVar3;
            obj.f36282d = bVar4;
            obj.f36283e = aVar;
            obj.f36284f = aVar2;
            obj.f36285g = aVar4;
            obj.f36286h = aVar3;
            obj.f36287i = d12;
            obj.f36288j = d13;
            obj.f36289k = d14;
            obj.f36290l = d15;
            this.f11484e0 = z10;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, zo.x, k4.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? bVar = new k4.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f42699c = getError();
        }
        zo.l lVar = this.f11481c;
        if (lVar.f42623i != 0 && lVar.f42621g.isChecked()) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.f42700d = z10;
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f11482d;
        if (editText == null || this.f11488g0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = q1.f25681a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(m.x.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f11499m && (appCompatTextView = this.f11502o) != null) {
            mutate.setColorFilter(m.x.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f11482d.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f11482d;
        if (editText != null && this.D != null) {
            if ((this.G || editText.getBackground() == null) && this.f11488g0 != 0) {
                EditText editText2 = this.f11482d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap weakHashMap = n1.f13788a;
                v0.q(editText2, editTextBoxBackground);
                this.G = true;
            }
        }
    }

    public final void s() {
        if (this.f11488g0 != 1) {
            FrameLayout frameLayout = this.f11479a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f11500m0 != i10) {
            this.f11500m0 = i10;
            this.D0 = i10;
            this.F0 = i10;
            this.G0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(k.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.D0 = defaultColor;
        this.f11500m0 = defaultColor;
        this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f11488g0) {
            return;
        }
        this.f11488g0 = i10;
        if (this.f11482d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f11490h0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        i f10 = this.J.f();
        to.c cVar = this.J.f36283e;
        vl.b c12 = dp.b.c1(i10);
        f10.f20162a = c12;
        i.b(c12);
        f10.f20166e = cVar;
        to.c cVar2 = this.J.f36284f;
        vl.b c13 = dp.b.c1(i10);
        f10.f20163b = c13;
        i.b(c13);
        f10.f20167f = cVar2;
        to.c cVar3 = this.J.f36286h;
        vl.b c14 = dp.b.c1(i10);
        f10.f20165d = c14;
        i.b(c14);
        f10.f20169h = cVar3;
        to.c cVar4 = this.J.f36285g;
        vl.b c15 = dp.b.c1(i10);
        f10.f20164c = c15;
        i.b(c15);
        f10.f20168g = cVar4;
        this.J = f10.a();
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            w();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f11525z0 = colorStateList.getDefaultColor();
            this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.B0 != colorStateList.getDefaultColor()) {
            this.B0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f11494j0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f11496k0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f11495k != z10) {
            Editable editable = null;
            p pVar = this.f11493j;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f11502o = appCompatTextView;
                appCompatTextView.setId(com.assetgro.stockgro.prod.R.id.textinput_counter);
                Typeface typeface = this.f11507q0;
                if (typeface != null) {
                    this.f11502o.setTypeface(typeface);
                }
                this.f11502o.setMaxLines(1);
                pVar.a(this.f11502o, 2);
                q.h((ViewGroup.MarginLayoutParams) this.f11502o.getLayoutParams(), getResources().getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f11502o != null) {
                    EditText editText = this.f11482d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                pVar.g(this.f11502o, 2);
                this.f11502o = null;
            }
            this.f11495k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.f11497l != i10) {
            if (i10 > 0) {
                this.f11497l = i10;
            } else {
                this.f11497l = -1;
            }
            if (this.f11495k && this.f11502o != null) {
                EditText editText = this.f11482d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f11504p != i10) {
            this.f11504p = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f11524z != colorStateList) {
            this.f11524z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f11506q != i10) {
            this.f11506q = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f11522y != colorStateList) {
            this.f11522y = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f11521x0 = colorStateList;
        this.f11523y0 = colorStateList;
        if (this.f11482d != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f11481c.f42621g.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f11481c.f42621g.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        zo.l lVar = this.f11481c;
        CharSequence text = i10 != 0 ? lVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = lVar.f42621g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        zo.l lVar = this.f11481c;
        Drawable m10 = i10 != 0 ? j.m(lVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = lVar.f42621g;
        checkableImageButton.setImageDrawable(m10);
        if (m10 != null) {
            ColorStateList colorStateList = lVar.f42625k;
            PorterDuff.Mode mode = lVar.f42626l;
            TextInputLayout textInputLayout = lVar.f42615a;
            e.b(textInputLayout, checkableImageButton, colorStateList, mode);
            e.t(textInputLayout, checkableImageButton, lVar.f42625k);
        }
    }

    public void setEndIconMinSize(int i10) {
        zo.l lVar = this.f11481c;
        if (i10 >= 0) {
            if (i10 != lVar.f42627m) {
                lVar.f42627m = i10;
                CheckableImageButton checkableImageButton = lVar.f42621g;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = lVar.f42617c;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        lVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f11481c.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        zo.l lVar = this.f11481c;
        View.OnLongClickListener onLongClickListener = lVar.f42629o;
        CheckableImageButton checkableImageButton = lVar.f42621g;
        checkableImageButton.setOnClickListener(onClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        zo.l lVar = this.f11481c;
        lVar.f42629o = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f42621g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        zo.l lVar = this.f11481c;
        lVar.f42628n = scaleType;
        lVar.f42621g.setScaleType(scaleType);
        lVar.f42617c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        zo.l lVar = this.f11481c;
        if (lVar.f42625k != colorStateList) {
            lVar.f42625k = colorStateList;
            e.b(lVar.f42615a, lVar.f42621g, colorStateList, lVar.f42626l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        zo.l lVar = this.f11481c;
        if (lVar.f42626l != mode) {
            lVar.f42626l = mode;
            e.b(lVar.f42615a, lVar.f42621g, lVar.f42625k, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f11481c.g(z10);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f11493j;
        if (!pVar.f42663q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            pVar.c();
            pVar.f42662p = charSequence;
            pVar.f42664r.setText(charSequence);
            int i10 = pVar.f42660n;
            if (i10 != 1) {
                pVar.f42661o = 1;
            }
            pVar.i(i10, pVar.f42661o, pVar.h(pVar.f42664r, charSequence));
            return;
        }
        pVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        p pVar = this.f11493j;
        pVar.f42666t = i10;
        AppCompatTextView appCompatTextView = pVar.f42664r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            y0.f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f11493j;
        pVar.f42665s = charSequence;
        AppCompatTextView appCompatTextView = pVar.f42664r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        p pVar = this.f11493j;
        if (pVar.f42663q != z10) {
            pVar.c();
            TextInputLayout textInputLayout = pVar.f42654h;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f42653g, null);
                pVar.f42664r = appCompatTextView;
                appCompatTextView.setId(com.assetgro.stockgro.prod.R.id.textinput_error);
                pVar.f42664r.setTextAlignment(5);
                Typeface typeface = pVar.B;
                if (typeface != null) {
                    pVar.f42664r.setTypeface(typeface);
                }
                int i10 = pVar.f42667u;
                pVar.f42667u = i10;
                AppCompatTextView appCompatTextView2 = pVar.f42664r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = pVar.f42668v;
                pVar.f42668v = colorStateList;
                AppCompatTextView appCompatTextView3 = pVar.f42664r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = pVar.f42665s;
                pVar.f42665s = charSequence;
                AppCompatTextView appCompatTextView4 = pVar.f42664r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i11 = pVar.f42666t;
                pVar.f42666t = i11;
                AppCompatTextView appCompatTextView5 = pVar.f42664r;
                if (appCompatTextView5 != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    y0.f(appCompatTextView5, i11);
                }
                pVar.f42664r.setVisibility(4);
                pVar.a(pVar.f42664r, 0);
            } else {
                pVar.f();
                pVar.g(pVar.f42664r, 0);
                pVar.f42664r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            pVar.f42663q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        zo.l lVar = this.f11481c;
        lVar.h(i10 != 0 ? j.m(lVar.getContext(), i10) : null);
        e.t(lVar.f42615a, lVar.f42617c, lVar.f42618d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        zo.l lVar = this.f11481c;
        CheckableImageButton checkableImageButton = lVar.f42617c;
        View.OnLongClickListener onLongClickListener = lVar.f42620f;
        checkableImageButton.setOnClickListener(onClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        zo.l lVar = this.f11481c;
        lVar.f42620f = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f42617c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        zo.l lVar = this.f11481c;
        if (lVar.f42618d != colorStateList) {
            lVar.f42618d = colorStateList;
            e.b(lVar.f42615a, lVar.f42617c, colorStateList, lVar.f42619e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        zo.l lVar = this.f11481c;
        if (lVar.f42619e != mode) {
            lVar.f42619e = mode;
            e.b(lVar.f42615a, lVar.f42617c, lVar.f42618d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        p pVar = this.f11493j;
        pVar.f42667u = i10;
        AppCompatTextView appCompatTextView = pVar.f42664r;
        if (appCompatTextView != null) {
            pVar.f42654h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f11493j;
        pVar.f42668v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f42664r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.K0 != z10) {
            this.K0 = z10;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f11493j;
        if (isEmpty) {
            if (pVar.f42670x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f42670x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f42669w = charSequence;
        pVar.f42671y.setText(charSequence);
        int i10 = pVar.f42660n;
        if (i10 != 2) {
            pVar.f42661o = 2;
        }
        pVar.i(i10, pVar.f42661o, pVar.h(pVar.f42671y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f11493j;
        pVar.A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f42671y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        p pVar = this.f11493j;
        if (pVar.f42670x != z10) {
            pVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f42653g, null);
                pVar.f42671y = appCompatTextView;
                appCompatTextView.setId(com.assetgro.stockgro.prod.R.id.textinput_helper_text);
                pVar.f42671y.setTextAlignment(5);
                Typeface typeface = pVar.B;
                if (typeface != null) {
                    pVar.f42671y.setTypeface(typeface);
                }
                pVar.f42671y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = pVar.f42671y;
                WeakHashMap weakHashMap = n1.f13788a;
                y0.f(appCompatTextView2, 1);
                int i10 = pVar.f42672z;
                pVar.f42672z = i10;
                AppCompatTextView appCompatTextView3 = pVar.f42671y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = pVar.A;
                pVar.A = colorStateList;
                AppCompatTextView appCompatTextView4 = pVar.f42671y;
                if (appCompatTextView4 != null && colorStateList != null) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                pVar.a(pVar.f42671y, 1);
                pVar.f42671y.setAccessibilityDelegate(new zo.o(pVar));
            } else {
                pVar.c();
                int i11 = pVar.f42660n;
                if (i11 == 2) {
                    pVar.f42661o = 0;
                }
                pVar.i(i11, pVar.f42661o, pVar.h(pVar.f42671y, HttpUrl.FRAGMENT_ENCODE_SET));
                pVar.g(pVar.f42671y, 1);
                pVar.f42671y = null;
                TextInputLayout textInputLayout = pVar.f42654h;
                textInputLayout.q();
                textInputLayout.w();
            }
            pVar.f42670x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        p pVar = this.f11493j;
        pVar.f42672z = i10;
        AppCompatTextView appCompatTextView = pVar.f42671y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.L0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            if (!z10) {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f11482d.getHint())) {
                    this.f11482d.setHint(this.B);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f11482d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f11482d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f11482d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.J0;
        bVar.k(i10);
        this.f11523y0 = bVar.f27886o;
        if (this.f11482d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f11523y0 != colorStateList) {
            if (this.f11521x0 == null) {
                b bVar = this.J0;
                if (bVar.f27886o != colorStateList) {
                    bVar.f27886o = colorStateList;
                    bVar.i(false);
                }
            }
            this.f11523y0 = colorStateList;
            if (this.f11482d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull w wVar) {
        this.f11501n = wVar;
    }

    public void setMaxEms(int i10) {
        this.f11487g = i10;
        EditText editText = this.f11482d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f11491i = i10;
        EditText editText = this.f11482d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f11485f = i10;
        EditText editText = this.f11482d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f11489h = i10;
        EditText editText = this.f11482d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        zo.l lVar = this.f11481c;
        lVar.f42621g.setContentDescription(i10 != 0 ? lVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        zo.l lVar = this.f11481c;
        lVar.f42621g.setImageDrawable(i10 != 0 ? j.m(lVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        zo.l lVar = this.f11481c;
        if (z10 && lVar.f42623i != 1) {
            lVar.f(1);
        } else if (!z10) {
            lVar.f(0);
        } else {
            lVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        zo.l lVar = this.f11481c;
        lVar.f42625k = colorStateList;
        e.b(lVar.f42615a, lVar.f42621g, colorStateList, lVar.f42626l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        zo.l lVar = this.f11481c;
        lVar.f42626l = mode;
        e.b(lVar.f42615a, lVar.f42621g, lVar.f42625k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f11512t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f11512t = appCompatTextView;
            appCompatTextView.setId(com.assetgro.stockgro.prod.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f11512t;
            WeakHashMap weakHashMap = n1.f13788a;
            v0.s(appCompatTextView2, 2);
            t7.h d10 = d();
            this.f11518w = d10;
            d10.f35504b = 67L;
            this.f11520x = d();
            setPlaceholderTextAppearance(this.f11516v);
            setPlaceholderTextColor(this.f11514u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f11510s) {
                setPlaceholderTextEnabled(true);
            }
            this.f11508r = charSequence;
        }
        EditText editText = this.f11482d;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f11516v = i10;
        AppCompatTextView appCompatTextView = this.f11512t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f11514u != colorStateList) {
            this.f11514u = colorStateList;
            AppCompatTextView appCompatTextView = this.f11512t;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        t tVar = this.f11480b;
        tVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        tVar.f42688c = charSequence2;
        tVar.f42687b.setText(charSequence);
        tVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f11480b.f42687b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11480b.f42687b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull l lVar) {
        h hVar = this.D;
        if (hVar != null && hVar.f36253a.f36231a != lVar) {
            this.J = lVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f11480b.f42689d.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11480b.f42689d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? j.m(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        t tVar = this.f11480b;
        if (i10 >= 0) {
            if (i10 != tVar.f42692g) {
                tVar.f42692g = i10;
                CheckableImageButton checkableImageButton = tVar.f42689d;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        tVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f11480b;
        View.OnLongClickListener onLongClickListener = tVar.f42694i;
        CheckableImageButton checkableImageButton = tVar.f42689d;
        checkableImageButton.setOnClickListener(onClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f11480b;
        tVar.f42694i = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f42689d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        t tVar = this.f11480b;
        tVar.f42693h = scaleType;
        tVar.f42689d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f11480b;
        if (tVar.f42690e != colorStateList) {
            tVar.f42690e = colorStateList;
            e.b(tVar.f42686a, tVar.f42689d, colorStateList, tVar.f42691f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f11480b;
        if (tVar.f42691f != mode) {
            tVar.f42691f = mode;
            e.b(tVar.f42686a, tVar.f42689d, tVar.f42690e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f11480b.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        zo.l lVar = this.f11481c;
        lVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        lVar.f42630p = charSequence2;
        lVar.f42631q.setText(charSequence);
        lVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f11481c.f42631q.setTextAppearance(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11481c.f42631q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.f11482d;
        if (editText != null) {
            n1.n(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f11507q0) {
            this.f11507q0 = typeface;
            b bVar = this.J0;
            boolean m10 = bVar.m(typeface);
            boolean o10 = bVar.o(typeface);
            if (m10 || o10) {
                bVar.i(false);
            }
            p pVar = this.f11493j;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                AppCompatTextView appCompatTextView = pVar.f42664r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.f42671y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f11502o;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f11482d;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f11482d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.f11521x0;
        b bVar = this.J0;
        if (colorStateList3 != null) {
            bVar.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f11521x0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.H0);
            } else {
                i10 = this.H0;
            }
            bVar.j(ColorStateList.valueOf(i10));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f11493j.f42664r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.j(colorStateList2);
        } else if (this.f11499m && (appCompatTextView = this.f11502o) != null) {
            bVar.j(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f11523y0) != null && bVar.f27886o != colorStateList) {
            bVar.f27886o = colorStateList;
            bVar.i(false);
        }
        zo.l lVar = this.f11481c;
        t tVar = this.f11480b;
        if (!z12 && this.K0 && (!isEnabled() || !z13)) {
            if (z11 || !this.I0) {
                ValueAnimator valueAnimator = this.M0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.M0.cancel();
                }
                if (z10 && this.L0) {
                    a(g.f34069a);
                } else {
                    bVar.p(g.f34069a);
                }
                if (e() && (!((zo.g) this.D).f42596x.f42594v.isEmpty()) && e()) {
                    ((zo.g) this.D).v(g.f34069a, g.f34069a, g.f34069a, g.f34069a);
                }
                this.I0 = true;
                AppCompatTextView appCompatTextView3 = this.f11512t;
                if (appCompatTextView3 != null && this.f11510s) {
                    appCompatTextView3.setText((CharSequence) null);
                    s.a(this.f11479a, this.f11520x);
                    this.f11512t.setVisibility(4);
                }
                tVar.f42695j = true;
                tVar.d();
                lVar.f42632r = true;
                lVar.m();
                return;
            }
            return;
        }
        if (z11 || this.I0) {
            ValueAnimator valueAnimator2 = this.M0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M0.cancel();
            }
            if (z10 && this.L0) {
                a(1.0f);
            } else {
                bVar.p(1.0f);
            }
            this.I0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f11482d;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            u(editable);
            tVar.f42695j = false;
            tVar.d();
            lVar.f42632r = false;
            lVar.m();
        }
    }

    public final void u(Editable editable) {
        ((i5.w) this.f11501n).getClass();
        FrameLayout frameLayout = this.f11479a;
        if ((editable == null || editable.length() == 0) && !this.I0) {
            if (this.f11512t != null && this.f11510s && !TextUtils.isEmpty(this.f11508r)) {
                this.f11512t.setText(this.f11508r);
                s.a(frameLayout, this.f11518w);
                this.f11512t.setVisibility(0);
                this.f11512t.bringToFront();
                announceForAccessibility(this.f11508r);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f11512t;
        if (appCompatTextView != null && this.f11510s) {
            appCompatTextView.setText((CharSequence) null);
            s.a(frameLayout, this.f11520x);
            this.f11512t.setVisibility(4);
        }
    }

    public final void v(boolean z10, boolean z11) {
        int defaultColor = this.C0.getDefaultColor();
        int colorForState = this.C0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.C0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f11498l0 = colorForState2;
        } else if (z11) {
            this.f11498l0 = colorForState;
        } else {
            this.f11498l0 = defaultColor;
        }
    }

    public final void w() {
        boolean z10;
        boolean z11;
        AppCompatTextView appCompatTextView;
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        EditText editText;
        EditText editText2;
        if (this.D != null && this.f11488g0 != 0) {
            boolean z12 = false;
            if (!isFocused() && ((editText2 = this.f11482d) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!isHovered() && ((editText = this.f11482d) == null || !editText.isHovered())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (m() || (this.f11502o != null && this.f11499m)) {
                z12 = true;
            }
            if (!isEnabled()) {
                this.f11498l0 = this.H0;
            } else if (m()) {
                if (this.C0 != null) {
                    v(z10, z11);
                } else {
                    this.f11498l0 = getErrorCurrentTextColors();
                }
            } else if (this.f11499m && (appCompatTextView = this.f11502o) != null) {
                if (this.C0 != null) {
                    v(z10, z11);
                } else {
                    this.f11498l0 = appCompatTextView.getCurrentTextColor();
                }
            } else if (z10) {
                this.f11498l0 = this.B0;
            } else if (z11) {
                this.f11498l0 = this.A0;
            } else {
                this.f11498l0 = this.f11525z0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Context context = getContext();
                TypedValue u10 = e.u(com.assetgro.stockgro.prod.R.attr.colorControlActivated, context);
                ColorStateList colorStateList = null;
                if (u10 != null) {
                    int i10 = u10.resourceId;
                    if (i10 != 0) {
                        colorStateList = k.getColorStateList(context, i10);
                    } else {
                        int i11 = u10.data;
                        if (i11 != 0) {
                            colorStateList = ColorStateList.valueOf(i11);
                        }
                    }
                }
                EditText editText3 = this.f11482d;
                if (editText3 != null) {
                    textCursorDrawable = editText3.getTextCursorDrawable();
                    if (textCursorDrawable != null && colorStateList != null) {
                        textCursorDrawable2 = this.f11482d.getTextCursorDrawable();
                        if (z12) {
                            ColorStateList colorStateList2 = this.C0;
                            if (colorStateList2 == null) {
                                colorStateList2 = ColorStateList.valueOf(this.f11498l0);
                            }
                            colorStateList = colorStateList2;
                        }
                        v3.b.h(textCursorDrawable2, colorStateList);
                    }
                }
            }
            zo.l lVar = this.f11481c;
            lVar.k();
            CheckableImageButton checkableImageButton = lVar.f42617c;
            ColorStateList colorStateList3 = lVar.f42618d;
            TextInputLayout textInputLayout = lVar.f42615a;
            e.t(textInputLayout, checkableImageButton, colorStateList3);
            ColorStateList colorStateList4 = lVar.f42625k;
            CheckableImageButton checkableImageButton2 = lVar.f42621g;
            e.t(textInputLayout, checkableImageButton2, colorStateList4);
            if (lVar.b() instanceof zo.i) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    v3.b.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    e.b(textInputLayout, checkableImageButton2, lVar.f42625k, lVar.f42626l);
                }
            }
            t tVar = this.f11480b;
            e.t(tVar.f42686a, tVar.f42689d, tVar.f42690e);
            if (this.f11488g0 == 2) {
                int i12 = this.f11492i0;
                if (z10 && isEnabled()) {
                    this.f11492i0 = this.f11496k0;
                } else {
                    this.f11492i0 = this.f11494j0;
                }
                if (this.f11492i0 != i12 && e() && !this.I0) {
                    if (e()) {
                        ((zo.g) this.D).v(g.f34069a, g.f34069a, g.f34069a, g.f34069a);
                    }
                    j();
                }
            }
            if (this.f11488g0 == 1) {
                if (!isEnabled()) {
                    this.f11500m0 = this.E0;
                } else if (z11 && !z10) {
                    this.f11500m0 = this.G0;
                } else if (z10) {
                    this.f11500m0 = this.F0;
                } else {
                    this.f11500m0 = this.D0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f11480b.a(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f11481c.f42621g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f11481c.f42621g.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f11481c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11481c.f42621g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        zo.l lVar = this.f11481c;
        CheckableImageButton checkableImageButton = lVar.f42621g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = lVar.f42625k;
            PorterDuff.Mode mode = lVar.f42626l;
            TextInputLayout textInputLayout = lVar.f42615a;
            e.b(textInputLayout, checkableImageButton, colorStateList, mode);
            e.t(textInputLayout, checkableImageButton, lVar.f42625k);
        }
    }
}
