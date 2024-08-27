package com.github.clans.fab;

import al.d;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.assetgro.stockgro.prod.R;
import pm.a;
import pm.b;
import pm.c;
import pm.e;
import pm.k;
import pm.l;
import s0.g;

/* loaded from: classes.dex */
public class FloatingActionButton extends ImageButton {

    /* renamed from: p0, reason: collision with root package name */
    public static final PorterDuffXfermode f10975p0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public boolean A;
    public RectF B;
    public final Paint C;
    public final Paint D;
    public boolean E;
    public long F;
    public float G;
    public long H;
    public double I;
    public boolean J;

    /* renamed from: a, reason: collision with root package name */
    public int f10976a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10977b;

    /* renamed from: c, reason: collision with root package name */
    public int f10978c;

    /* renamed from: d, reason: collision with root package name */
    public int f10979d;

    /* renamed from: e, reason: collision with root package name */
    public int f10980e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f10981e0;

    /* renamed from: f, reason: collision with root package name */
    public int f10982f;

    /* renamed from: f0, reason: collision with root package name */
    public float f10983f0;

    /* renamed from: g, reason: collision with root package name */
    public int f10984g;

    /* renamed from: g0, reason: collision with root package name */
    public float f10985g0;

    /* renamed from: h, reason: collision with root package name */
    public int f10986h;

    /* renamed from: h0, reason: collision with root package name */
    public float f10987h0;

    /* renamed from: i, reason: collision with root package name */
    public int f10988i;

    /* renamed from: i0, reason: collision with root package name */
    public int f10989i0;

    /* renamed from: j, reason: collision with root package name */
    public int f10990j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10991j0;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f10992k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f10993k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f10994l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f10995l0;

    /* renamed from: m, reason: collision with root package name */
    public Animation f10996m;

    /* renamed from: m0, reason: collision with root package name */
    public int f10997m0;

    /* renamed from: n, reason: collision with root package name */
    public Animation f10998n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public String f10999o;

    /* renamed from: o0, reason: collision with root package name */
    public final GestureDetector f11000o0;

    /* renamed from: p, reason: collision with root package name */
    public View.OnClickListener f11001p;

    /* renamed from: q, reason: collision with root package name */
    public RippleDrawable f11002q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11003r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11004s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11005t;

    /* renamed from: u, reason: collision with root package name */
    public int f11006u;

    /* renamed from: v, reason: collision with root package name */
    public int f11007v;

    /* renamed from: w, reason: collision with root package name */
    public int f11008w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11009x;

    /* renamed from: y, reason: collision with root package name */
    public float f11010y;

    /* renamed from: z, reason: collision with root package name */
    public float f11011z;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10979d = d.g0(4.0f, getContext());
        this.f10980e = d.g0(1.0f, getContext());
        this.f10982f = d.g0(3.0f, getContext());
        this.f10994l = d.g0(24.0f, getContext());
        this.f11006u = d.g0(6.0f, getContext());
        this.f11010y = -1.0f;
        this.f11011z = -1.0f;
        this.B = new RectF();
        this.C = new Paint(1);
        this.D = new Paint(1);
        this.G = 195.0f;
        this.H = 0L;
        this.J = true;
        this.f10981e0 = 16;
        this.f10997m0 = 100;
        this.f11000o0 = new GestureDetector(getContext(), new b(this, 0));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f31223a, 0, 0);
        this.f10984g = obtainStyledAttributes.getColor(9, -2473162);
        this.f10986h = obtainStyledAttributes.getColor(10, -1617853);
        this.f10988i = obtainStyledAttributes.getColor(8, -5592406);
        this.f10990j = obtainStyledAttributes.getColor(11, -1711276033);
        this.f10977b = obtainStyledAttributes.getBoolean(26, true);
        this.f10978c = obtainStyledAttributes.getColor(21, 1711276032);
        this.f10979d = obtainStyledAttributes.getDimensionPixelSize(22, this.f10979d);
        this.f10980e = obtainStyledAttributes.getDimensionPixelSize(23, this.f10980e);
        this.f10982f = obtainStyledAttributes.getDimensionPixelSize(24, this.f10982f);
        this.f10976a = obtainStyledAttributes.getInt(27, 0);
        this.f10999o = obtainStyledAttributes.getString(14);
        this.f10993k0 = obtainStyledAttributes.getBoolean(18, false);
        this.f11007v = obtainStyledAttributes.getColor(17, -16738680);
        this.f11008w = obtainStyledAttributes.getColor(16, 1291845632);
        this.f10997m0 = obtainStyledAttributes.getInt(19, this.f10997m0);
        this.n0 = obtainStyledAttributes.getBoolean(20, true);
        if (obtainStyledAttributes.hasValue(15)) {
            this.f10989i0 = obtainStyledAttributes.getInt(15, 0);
            this.f10995l0 = true;
        }
        if (obtainStyledAttributes.hasValue(12)) {
            float dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        this.f10996m = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(25, R.anim.fab_scale_up));
        this.f10998n = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(13, R.anim.fab_scale_down));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.f10993k0) {
                setIndeterminate(true);
            } else if (this.f10995l0) {
                j();
                k(this.f10989i0, false);
            }
        }
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCircleSize() {
        int i10;
        Resources resources = getResources();
        if (this.f10976a == 0) {
            i10 = R.dimen.fab_size_normal;
        } else {
            i10 = R.dimen.fab_size_mini;
        }
        return resources.getDimensionPixelSize(i10);
    }

    private int getShadowX() {
        return Math.abs(this.f10980e) + this.f10979d;
    }

    private int getShadowY() {
        return Math.abs(this.f10982f) + this.f10979d;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    public final int b() {
        int i10;
        int circleSize = getCircleSize();
        if (f()) {
            i10 = getShadowY() * 2;
        } else {
            i10 = 0;
        }
        int i11 = circleSize + i10;
        if (this.f11005t) {
            return i11 + (this.f11006u * 2);
        }
        return i11;
    }

    public final int c() {
        int i10;
        int circleSize = getCircleSize();
        if (f()) {
            i10 = getShadowX() * 2;
        } else {
            i10 = 0;
        }
        int i11 = circleSize + i10;
        if (this.f11005t) {
            return i11 + (this.f11006u * 2);
        }
        return i11;
    }

    public final c d(int i10) {
        c cVar = new c(this, new OvalShape());
        cVar.getPaint().setColor(i10);
        return cVar;
    }

    public final RippleDrawable e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, d(this.f10988i));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, d(this.f10986h));
        stateListDrawable.addState(new int[0], d(this.f10984g));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f10990j}), stateListDrawable, null);
        setOutlineProvider(new a(this, 0));
        setClipToOutline(true);
        this.f11002q = rippleDrawable;
        return rippleDrawable;
    }

    public final boolean f() {
        return !this.f11003r && this.f10977b;
    }

    public final void g(boolean z10) {
        if (getVisibility() != 4) {
            if (z10) {
                this.f10996m.cancel();
                startAnimation(this.f10998n);
            }
            super.setVisibility(4);
        }
    }

    public int getButtonSize() {
        return this.f10976a;
    }

    public int getColorDisabled() {
        return this.f10988i;
    }

    public int getColorNormal() {
        return this.f10984g;
    }

    public int getColorPressed() {
        return this.f10986h;
    }

    public int getColorRipple() {
        return this.f10990j;
    }

    public Animation getHideAnimation() {
        return this.f10998n;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.f10992k;
        if (drawable != null) {
            return drawable;
        }
        return new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.f10999o;
    }

    public k getLabelView() {
        return (k) getTag(R.id.fab_label);
    }

    public int getLabelVisibility() {
        k labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.f10997m0;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f11001p;
    }

    public synchronized int getProgress() {
        int i10;
        if (this.E) {
            i10 = 0;
        } else {
            i10 = this.f10989i0;
        }
        return i10;
    }

    public int getShadowColor() {
        return this.f10978c;
    }

    public int getShadowRadius() {
        return this.f10979d;
    }

    public int getShadowXOffset() {
        return this.f10980e;
    }

    public int getShadowYOffset() {
        return this.f10982f;
    }

    public Animation getShowAnimation() {
        return this.f10996m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        RippleDrawable rippleDrawable = this.f11002q;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
            return;
        }
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        RippleDrawable rippleDrawable = this.f11002q;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{android.R.attr.state_enabled});
            return;
        }
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    public final void j() {
        if (!this.A) {
            if (this.f11010y == -1.0f) {
                this.f11010y = getX();
            }
            if (this.f11011z == -1.0f) {
                this.f11011z = getY();
            }
            this.A = true;
        }
    }

    public final synchronized void k(int i10, boolean z10) {
        float f10;
        if (this.E) {
            return;
        }
        this.f10989i0 = i10;
        this.f10991j0 = z10;
        if (!this.A) {
            this.f10995l0 = true;
            return;
        }
        this.f11005t = true;
        this.f11009x = true;
        l();
        j();
        n();
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = this.f10997m0;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        float f11 = i10;
        if (f11 == this.f10987h0) {
            return;
        }
        int i12 = this.f10997m0;
        if (i12 > 0) {
            f10 = (f11 / i12) * 360.0f;
        } else {
            f10 = g.f34069a;
        }
        this.f10987h0 = f10;
        this.F = SystemClock.uptimeMillis();
        if (!z10) {
            this.f10985g0 = this.f10987h0;
        }
        invalidate();
    }

    public final void l() {
        int i10;
        int i11 = 0;
        if (f()) {
            i10 = getShadowX();
        } else {
            i10 = 0;
        }
        if (f()) {
            i11 = getShadowY();
        }
        int i12 = this.f11006u;
        this.B = new RectF((i12 / 2) + i10, (i12 / 2) + i11, (c() - i10) - (this.f11006u / 2), (b() - i11) - (this.f11006u / 2));
    }

    public final void m(boolean z10) {
        if (getVisibility() == 4) {
            if (z10) {
                this.f10998n.cancel();
                startAnimation(this.f10996m);
            }
            super.setVisibility(0);
        }
    }

    public final void n() {
        LayerDrawable layerDrawable;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (f()) {
            layerDrawable = new LayerDrawable(new Drawable[]{new e(this), e(), getIconDrawable()});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{e(), getIconDrawable()});
        }
        if (getIconDrawable() != null) {
            i10 = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        } else {
            i10 = -1;
        }
        int circleSize = getCircleSize();
        if (i10 <= 0) {
            i10 = this.f10994l;
        }
        int i14 = (circleSize - i10) / 2;
        if (f()) {
            i11 = Math.abs(this.f10980e) + this.f10979d;
        } else {
            i11 = 0;
        }
        if (f()) {
            i13 = this.f10979d + Math.abs(this.f10982f);
        }
        if (this.f11005t) {
            int i15 = this.f11006u;
            i11 += i15;
            i13 += i15;
        }
        if (f()) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        int i16 = i11 + i14;
        int i17 = i13 + i14;
        layerDrawable.setLayerInset(i12, i16, i17, i16, i17);
        setBackgroundCompat(layerDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11005t) {
            if (this.n0) {
                canvas.drawArc(this.B, 360.0f, 360.0f, false, this.C);
            }
            boolean z10 = this.E;
            Paint paint = this.D;
            boolean z11 = true;
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.F;
                float f10 = (((float) uptimeMillis) * this.G) / 1000.0f;
                long j10 = this.H;
                int i10 = this.f10981e0;
                if (j10 >= 200) {
                    double d10 = this.I + uptimeMillis;
                    this.I = d10;
                    if (d10 > 500.0d) {
                        this.I = d10 - 500.0d;
                        this.H = 0L;
                        this.J = true ^ this.J;
                    }
                    float cos = (((float) Math.cos(((this.I / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f11 = 270 - i10;
                    if (this.J) {
                        this.f10983f0 = cos * f11;
                    } else {
                        float f12 = (1.0f - cos) * f11;
                        this.f10985g0 = (this.f10983f0 - f12) + this.f10985g0;
                        this.f10983f0 = f12;
                    }
                } else {
                    this.H = j10 + uptimeMillis;
                }
                float f13 = this.f10985g0 + f10;
                this.f10985g0 = f13;
                if (f13 > 360.0f) {
                    this.f10985g0 = f13 - 360.0f;
                }
                this.F = SystemClock.uptimeMillis();
                float f14 = this.f10985g0 - 90.0f;
                float f15 = i10 + this.f10983f0;
                if (isInEditMode()) {
                    f14 = g.f34069a;
                    f15 = 135.0f;
                }
                canvas.drawArc(this.B, f14, f15, false, paint);
            } else {
                if (this.f10985g0 != this.f10987h0) {
                    float uptimeMillis2 = (((float) (SystemClock.uptimeMillis() - this.F)) / 1000.0f) * this.G;
                    float f16 = this.f10985g0;
                    float f17 = this.f10987h0;
                    if (f16 > f17) {
                        this.f10985g0 = Math.max(f16 - uptimeMillis2, f17);
                    } else {
                        this.f10985g0 = Math.min(f16 + uptimeMillis2, f17);
                    }
                    this.F = SystemClock.uptimeMillis();
                } else {
                    z11 = false;
                }
                boolean z12 = z11;
                canvas.drawArc(this.B, -90.0f, this.f10985g0, false, paint);
                if (!z12) {
                    return;
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(c(), b());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pm.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pm.d dVar = (pm.d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f10985g0 = dVar.f31172a;
        this.f10987h0 = dVar.f31173b;
        this.G = dVar.f31174c;
        this.f11006u = dVar.f31176e;
        this.f11007v = dVar.f31177f;
        this.f11008w = dVar.f31178g;
        this.f10993k0 = dVar.f31182k;
        this.f10995l0 = dVar.f31183l;
        this.f10989i0 = dVar.f31175d;
        this.f10991j0 = dVar.f31184m;
        this.n0 = dVar.f31185n;
        this.F = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, pm.d] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f31172a = this.f10985g0;
        baseSavedState.f31173b = this.f10987h0;
        baseSavedState.f31174c = this.G;
        baseSavedState.f31176e = this.f11006u;
        baseSavedState.f31177f = this.f11007v;
        baseSavedState.f31178g = this.f11008w;
        boolean z11 = this.E;
        baseSavedState.f31182k = z11;
        if (this.f11005t && this.f10989i0 > 0 && !z11) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f31183l = z10;
        baseSavedState.f31175d = this.f10989i0;
        baseSavedState.f31184m = this.f10991j0;
        baseSavedState.f31185n = this.n0;
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        j();
        if (this.f10993k0) {
            setIndeterminate(true);
            this.f10993k0 = false;
        } else if (this.f10995l0) {
            k(this.f10989i0, this.f10991j0);
            this.f10995l0 = false;
        } else if (this.f11009x) {
            if (this.f11005t) {
                if (this.f11010y > getX()) {
                    f10 = getX() + this.f11006u;
                } else {
                    f10 = getX() - this.f11006u;
                }
                if (this.f11011z > getY()) {
                    f11 = getY() + this.f11006u;
                } else {
                    f11 = getY() - this.f11006u;
                }
            } else {
                f10 = this.f11010y;
                f11 = this.f11011z;
            }
            setX(f10);
            setY(f11);
            this.f11009x = false;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        l();
        Paint paint = this.C;
        paint.setColor(this.f11008w);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f11006u);
        Paint paint2 = this.D;
        paint2.setColor(this.f11007v);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f11006u);
        n();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11001p != null && isEnabled()) {
            k kVar = (k) getTag(R.id.fab_label);
            if (kVar == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 3) {
                    kVar.d();
                    i();
                }
            } else {
                kVar.d();
                i();
            }
            this.f11000o0.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        }
        if (this.f10976a != i10) {
            this.f10976a = i10;
            n();
        }
    }

    public void setColorDisabled(int i10) {
        if (i10 != this.f10988i) {
            this.f10988i = i10;
            n();
        }
    }

    public void setColorDisabledResId(int i10) {
        setColorDisabled(getResources().getColor(i10));
    }

    public void setColorNormal(int i10) {
        if (this.f10984g != i10) {
            this.f10984g = i10;
            n();
        }
    }

    public void setColorNormalResId(int i10) {
        setColorNormal(getResources().getColor(i10));
    }

    public void setColorPressed(int i10) {
        if (i10 != this.f10986h) {
            this.f10986h = i10;
            n();
        }
    }

    public void setColorPressedResId(int i10) {
        setColorPressed(getResources().getColor(i10));
    }

    public void setColorRipple(int i10) {
        if (i10 != this.f10990j) {
            this.f10990j = i10;
            n();
        }
    }

    public void setColorRippleResId(int i10) {
        setColorRipple(getResources().getColor(i10));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        if (f10 > g.f34069a) {
            super.setElevation(f10);
            if (!isInEditMode()) {
                this.f11003r = true;
                this.f10977b = false;
            }
            n();
        }
    }

    @TargetApi(21)
    public void setElevationCompat(float f10) {
        this.f10978c = 637534208;
        float f11 = f10 / 2.0f;
        this.f10979d = Math.round(f11);
        this.f10980e = 0;
        if (this.f10976a == 0) {
            f11 = f10;
        }
        this.f10982f = Math.round(f11);
        super.setElevation(f10);
        this.f11004s = true;
        this.f10977b = false;
        n();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        k kVar = (k) getTag(R.id.fab_label);
        if (kVar != null) {
            kVar.setEnabled(z10);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.f10998n = animation;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f10992k != drawable) {
            this.f10992k = drawable;
            n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        Drawable drawable = getResources().getDrawable(i10);
        if (this.f10992k != drawable) {
            this.f10992k = drawable;
            n();
        }
    }

    public synchronized void setIndeterminate(boolean z10) {
        if (!z10) {
            try {
                this.f10985g0 = g.f34069a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11005t = z10;
        this.f11009x = true;
        this.E = z10;
        this.F = SystemClock.uptimeMillis();
        l();
        n();
    }

    public void setLabelText(String str) {
        this.f10999o = str;
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i10) {
        getLabelView().setTextColor(i10);
    }

    public void setLabelVisibility(int i10) {
        boolean z10;
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i10);
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            labelView.setHandleVisibilityChanges(z10);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f11004s) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i10) {
        this.f10997m0 = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f11001p = onClickListener;
        View view = (View) getTag(R.id.fab_label);
        if (view != null) {
            view.setOnClickListener(new h.b(this, 3));
        }
    }

    public void setShadowColor(int i10) {
        if (this.f10978c != i10) {
            this.f10978c = i10;
            n();
        }
    }

    public void setShadowColorResource(int i10) {
        int color = getResources().getColor(i10);
        if (this.f10978c != color) {
            this.f10978c = color;
            n();
        }
    }

    public void setShadowRadius(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f10979d != dimensionPixelSize) {
            this.f10979d = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowXOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f10980e != dimensionPixelSize) {
            this.f10980e = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowYOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f10982f != dimensionPixelSize) {
            this.f10982f = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.f10996m = animation;
    }

    public synchronized void setShowProgressBackground(boolean z10) {
        this.n0 = z10;
    }

    public void setShowShadow(boolean z10) {
        if (this.f10977b != z10) {
            this.f10977b = z10;
            n();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        k kVar = (k) getTag(R.id.fab_label);
        if (kVar != null) {
            kVar.setVisibility(i10);
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setShadowRadius(float f10) {
        this.f10979d = d.g0(f10, getContext());
        requestLayout();
        n();
    }

    public void setShadowXOffset(float f10) {
        this.f10980e = d.g0(f10, getContext());
        requestLayout();
        n();
    }

    public void setShadowYOffset(float f10) {
        this.f10982f = d.g0(f10, getContext());
        requestLayout();
        n();
    }
}
