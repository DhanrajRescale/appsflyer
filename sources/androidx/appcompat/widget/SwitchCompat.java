package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import d4.n1;
import d4.r0;
import d4.y0;
import iu.j;
import java.util.WeakHashMap;
import m.a0;
import m.d4;
import m.k3;
import m.l3;
import m.m3;
import m.q1;
import m.z0;
import mt.p;
import qu.i0;
import s0.g;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: k0, reason: collision with root package name */
    public static final k3 f1073k0 = new k3("thumbPos", 0, Float.class);

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f1074l0 = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public final ColorStateList J;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1075a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1076b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1078d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1079e;

    /* renamed from: e0, reason: collision with root package name */
    public StaticLayout f1080e0;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1081f;

    /* renamed from: f0, reason: collision with root package name */
    public StaticLayout f1082f0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1083g;

    /* renamed from: g0, reason: collision with root package name */
    public final j.a f1084g0;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1085h;

    /* renamed from: h0, reason: collision with root package name */
    public ObjectAnimator f1086h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1087i;

    /* renamed from: i0, reason: collision with root package name */
    public a0 f1088i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1089j;

    /* renamed from: j0, reason: collision with root package name */
    public final Rect f1090j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1091k;

    /* renamed from: l, reason: collision with root package name */
    public int f1092l;

    /* renamed from: m, reason: collision with root package name */
    public int f1093m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1094n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f1095o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1096p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1097q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1098r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1099s;

    /* renamed from: t, reason: collision with root package name */
    public int f1100t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1101u;

    /* renamed from: v, reason: collision with root package name */
    public float f1102v;

    /* renamed from: w, reason: collision with root package name */
    public float f1103w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f1104x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1105y;

    /* renamed from: z, reason: collision with root package name */
    public float f1106z;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, j.a] */
    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.assetgro.stockgro.prod.R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i10;
        this.f1076b = null;
        this.f1077c = null;
        this.f1078d = false;
        this.f1079e = false;
        this.f1083g = null;
        this.f1085h = null;
        this.f1087i = false;
        this.f1089j = false;
        this.f1104x = VelocityTracker.obtain();
        this.H = true;
        this.f1090j0 = new Rect();
        m3.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = g.a.f16371w;
        h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, iArr, com.assetgro.stockgro.prod.R.attr.switchStyle, 0));
        n1.m(this, context, iArr, attributeSet, (TypedArray) cVar.f17584c, com.assetgro.stockgro.prod.R.attr.switchStyle);
        Drawable v10 = cVar.v(2);
        this.f1075a = v10;
        if (v10 != null) {
            v10.setCallback(this);
        }
        Drawable v11 = cVar.v(11);
        this.f1081f = v11;
        if (v11 != null) {
            v11.setCallback(this);
        }
        setTextOnInternal(cVar.F(0));
        setTextOffInternal(cVar.F(1));
        this.f1099s = cVar.q(3, true);
        this.f1091k = cVar.u(8, 0);
        this.f1092l = cVar.u(5, 0);
        this.f1093m = cVar.u(6, 0);
        this.f1094n = cVar.q(4, false);
        ColorStateList r10 = cVar.r(9);
        if (r10 != null) {
            this.f1076b = r10;
            this.f1078d = true;
        }
        PorterDuff.Mode c10 = q1.c(cVar.z(10, -1), null);
        if (this.f1077c != c10) {
            this.f1077c = c10;
            this.f1079e = true;
        }
        if (this.f1078d || this.f1079e) {
            a();
        }
        ColorStateList r11 = cVar.r(12);
        if (r11 != null) {
            this.f1083g = r11;
            this.f1087i = true;
        }
        PorterDuff.Mode c11 = q1.c(cVar.z(13, -1), null);
        if (this.f1085h != c11) {
            this.f1085h = c11;
            this.f1089j = true;
        }
        if (this.f1087i || this.f1089j) {
            b();
        }
        int C = cVar.C(7, 0);
        if (C != 0) {
            h.c cVar2 = new h.c(context, context.obtainStyledAttributes(C, g.a.f16372x));
            ColorStateList r12 = cVar2.r(3);
            if (r12 != null) {
                this.J = r12;
            } else {
                this.J = getTextColors();
            }
            int u10 = cVar2.u(0, 0);
            if (u10 != 0) {
                float f10 = u10;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int z10 = cVar2.z(1, -1);
            int z11 = cVar2.z(2, -1);
            if (z10 != 1) {
                if (z10 != 2) {
                    if (z10 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            float f11 = g.f34069a;
            if (z11 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(z11);
                } else {
                    create = Typeface.create(typeface, z11);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i10 = create.getStyle();
                } else {
                    i10 = 0;
                }
                int i11 = (~i10) & z11;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : f11);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(g.f34069a);
                setSwitchTypeface(typeface);
            }
            if (cVar2.q(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f20562a = context2.getResources().getConfiguration().locale;
                this.f1084g0 = obj;
            } else {
                this.f1084g0 = null;
            }
            setTextOnInternal(this.f1095o);
            setTextOffInternal(this.f1097q);
            cVar2.R();
        }
        new z0(this).f(attributeSet, com.assetgro.stockgro.prod.R.attr.switchStyle);
        cVar.R();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1101u = viewConfiguration.getScaledTouchSlop();
        this.f1105y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.assetgro.stockgro.prod.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private a0 getEmojiTextViewHelper() {
        if (this.f1088i0 == null) {
            this.f1088i0 = new a0(this);
        }
        return this.f1088i0;
    }

    private boolean getTargetCheckedState() {
        return this.f1106z > 0.5f;
    }

    private int getThumbOffset() {
        float f10;
        if (d4.a(this)) {
            f10 = 1.0f - this.f1106z;
        } else {
            f10 = this.f1106z;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1081f;
        if (drawable != null) {
            Rect rect2 = this.f1090j0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1075a;
            if (drawable2 != null) {
                rect = q1.b(drawable2);
            } else {
                rect = q1.f25683c;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1097q = charSequence;
        a0 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod I = ((p) emojiTextViewHelper.f25477b.f18690b).I(this.f1084g0);
        if (I != null) {
            charSequence = I.getTransformation(charSequence, this);
        }
        this.f1098r = charSequence;
        this.f1082f0 = null;
        if (this.f1099s) {
            c();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1095o = charSequence;
        a0 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod I = ((p) emojiTextViewHelper.f25477b.f18690b).I(this.f1084g0);
        if (I != null) {
            charSequence = I.getTransformation(charSequence, this);
        }
        this.f1096p = charSequence;
        this.f1080e0 = null;
        if (this.f1099s) {
            c();
        }
    }

    public final void a() {
        Drawable drawable = this.f1075a;
        if (drawable != null) {
            if (this.f1078d || this.f1079e) {
                Drawable mutate = drawable.mutate();
                this.f1075a = mutate;
                if (this.f1078d) {
                    v3.b.h(mutate, this.f1076b);
                }
                if (this.f1079e) {
                    v3.b.i(this.f1075a, this.f1077c);
                }
                if (this.f1075a.isStateful()) {
                    this.f1075a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1081f;
        if (drawable != null) {
            if (this.f1087i || this.f1089j) {
                Drawable mutate = drawable.mutate();
                this.f1081f = mutate;
                if (this.f1087i) {
                    v3.b.h(mutate, this.f1083g);
                }
                if (this.f1089j) {
                    v3.b.i(this.f1081f, this.f1085h);
                }
                if (this.f1081f.isStateful()) {
                    this.f1081f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        if (!((p) this.f1088i0.f25477b.f18690b).z()) {
            return;
        }
        Object obj = q4.a.f31656a;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1075a;
        if (drawable != null) {
            rect = q1.b(drawable);
        } else {
            rect = q1.f25683c;
        }
        Drawable drawable2 = this.f1081f;
        Rect rect2 = this.f1090j0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f1081f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1081f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1075a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.C + rect2.right;
            this.f1075a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                v3.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1075a;
        if (drawable != null) {
            v3.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1081f;
        if (drawable2 != null) {
            v3.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1075a;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f1081f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!d4.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1093m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (d4.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1093m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i0.P(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1099s;
    }

    public boolean getSplitTrack() {
        return this.f1094n;
    }

    public int getSwitchMinWidth() {
        return this.f1092l;
    }

    public int getSwitchPadding() {
        return this.f1093m;
    }

    public CharSequence getTextOff() {
        return this.f1097q;
    }

    public CharSequence getTextOn() {
        return this.f1095o;
    }

    public Drawable getThumbDrawable() {
        return this.f1075a;
    }

    public final float getThumbPosition() {
        return this.f1106z;
    }

    public int getThumbTextPadding() {
        return this.f1091k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1076b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1077c;
    }

    public Drawable getTrackDrawable() {
        return this.f1081f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1083g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1085h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1075a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1081f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1086h0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1086h0.end();
            this.f1086h0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1074l0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1081f;
        Rect rect = this.f1090j0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1075a;
        if (drawable != null) {
            if (this.f1094n && drawable2 != null) {
                Rect b10 = q1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f1080e0;
        } else {
            staticLayout = this.f1082f0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            TextPaint textPaint = this.I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1095o;
            } else {
                charSequence = this.f1097q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f1075a != null) {
            Drawable drawable = this.f1081f;
            Rect rect = this.f1090j0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = q1.b(this.f1075a);
            i14 = Math.max(0, b10.left - rect.left);
            i18 = Math.max(0, b10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (d4.a(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.A + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.A) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i17 = getPaddingTop();
                i16 = this.B + i17;
            } else {
                i16 = getHeight() - getPaddingBottom();
                i17 = i16 - this.B;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i19 = this.B;
            int i20 = height - (i19 / 2);
            i16 = i19 + i20;
            i17 = i20;
        }
        this.D = i15;
        this.E = i17;
        this.G = i16;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (this.f1099s) {
            StaticLayout staticLayout = this.f1080e0;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1096p;
                if (charSequence != null) {
                    i17 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i17 = 0;
                }
                this.f1080e0 = new StaticLayout(charSequence, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, 1.0f, g.f34069a, true);
            }
            if (this.f1082f0 == null) {
                CharSequence charSequence2 = this.f1098r;
                if (charSequence2 != null) {
                    i16 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i16 = 0;
                }
                this.f1082f0 = new StaticLayout(charSequence2, textPaint, i16, Layout.Alignment.ALIGN_NORMAL, 1.0f, g.f34069a, true);
            }
        }
        Drawable drawable = this.f1075a;
        Rect rect = this.f1090j0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1075a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1075a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (this.f1099s) {
            i14 = (this.f1091k * 2) + Math.max(this.f1080e0.getWidth(), this.f1082f0.getWidth());
        } else {
            i14 = 0;
        }
        this.C = Math.max(i14, i12);
        Drawable drawable2 = this.f1081f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i18 = this.f1081f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i19 = rect.left;
        int i20 = rect.right;
        Drawable drawable3 = this.f1075a;
        if (drawable3 != null) {
            Rect b10 = q1.b(drawable3);
            i19 = Math.max(i19, b10.left);
            i20 = Math.max(i20, b10.right);
        }
        if (this.H) {
            i15 = Math.max(this.f1092l, (this.C * 2) + i19 + i20);
        } else {
            i15 = this.f1092l;
        }
        int max = Math.max(i18, i13);
        this.A = i15;
        this.B = max;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1095o;
        } else {
            charSequence = this.f1097q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1095o;
                if (obj == null) {
                    obj = getResources().getString(com.assetgro.stockgro.prod.R.string.abc_capital_on);
                }
                WeakHashMap weakHashMap = n1.f13788a;
                new r0(com.assetgro.stockgro.prod.R.id.tag_state_description, 64, 30, 2).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f1097q;
            if (obj2 == null) {
                obj2 = getResources().getString(com.assetgro.stockgro.prod.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = n1.f13788a;
            new r0(com.assetgro.stockgro.prod.R.id.tag_state_description, 64, 30, 2).g(this, obj2);
        }
        IBinder windowToken = getWindowToken();
        float f10 = g.f34069a;
        if (windowToken != null) {
            WeakHashMap weakHashMap3 = n1.f13788a;
            if (y0.c(this)) {
                if (isChecked) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1073k0, f10);
                this.f1086h0 = ofFloat;
                ofFloat.setDuration(250L);
                l3.a(this.f1086h0, true);
                this.f1086h0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1086h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f10 = 1.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f1095o);
        setTextOffInternal(this.f1097q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1099s != z10) {
            this.f1099s = z10;
            requestLayout();
            if (z10) {
                c();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1094n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1092l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1093m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1097q;
            if (obj == null) {
                obj = getResources().getString(com.assetgro.stockgro.prod.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = n1.f13788a;
            new r0(com.assetgro.stockgro.prod.R.id.tag_state_description, 64, 30, 2).g(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1095o;
            if (obj == null) {
                obj = getResources().getString(com.assetgro.stockgro.prod.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = n1.f13788a;
            new r0(com.assetgro.stockgro.prod.R.id.tag_state_description, 64, 30, 2).g(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1075a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1075a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1106z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(j.m(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1091k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1076b = colorStateList;
        this.f1078d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1077c = mode;
        this.f1079e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1081f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1081f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(j.m(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1083g = colorStateList;
        this.f1087i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1085h = mode;
        this.f1089j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1075a && drawable != this.f1081f) {
            return false;
        }
        return true;
    }
}
