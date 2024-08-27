package vo;

import a8.o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.api.Api;
import com.google.android.material.slider.Slider;
import d4.n1;
import d4.w0;
import d4.y0;
import hl.f;
import in.i;
import j9.w;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import mo.c0;
import mo.z;
import pn.e;
import r3.k;
import s0.g;
import t7.x;
import to.h;

/* loaded from: classes2.dex */
public abstract class c extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public float F;
    public MotionEvent G;
    public boolean H;
    public float I;
    public float J;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38200a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f38201b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f38202c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f38203d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f38204e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f38205e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f38206f;

    /* renamed from: f0, reason: collision with root package name */
    public int f38207f0;

    /* renamed from: g, reason: collision with root package name */
    public final a f38208g;

    /* renamed from: g0, reason: collision with root package name */
    public int f38209g0;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f38210h;

    /* renamed from: h0, reason: collision with root package name */
    public float f38211h0;

    /* renamed from: i, reason: collision with root package name */
    public o f38212i;

    /* renamed from: i0, reason: collision with root package name */
    public float[] f38213i0;

    /* renamed from: j, reason: collision with root package name */
    public final int f38214j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f38215j0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f38216k;

    /* renamed from: k0, reason: collision with root package name */
    public int f38217k0;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f38218l;

    /* renamed from: l0, reason: collision with root package name */
    public int f38219l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f38220m;

    /* renamed from: m0, reason: collision with root package name */
    public int f38221m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f38222n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f38223o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f38224o0;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f38225p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f38226p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f38227q;

    /* renamed from: q0, reason: collision with root package name */
    public ColorStateList f38228q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f38229r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f38230r0;

    /* renamed from: s, reason: collision with root package name */
    public final int f38231s;

    /* renamed from: s0, reason: collision with root package name */
    public ColorStateList f38232s0;

    /* renamed from: t, reason: collision with root package name */
    public final int f38233t;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f38234t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f38235u;

    /* renamed from: u0, reason: collision with root package name */
    public final h f38236u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f38237v;

    /* renamed from: v0, reason: collision with root package name */
    public Drawable f38238v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f38239w;

    /* renamed from: w0, reason: collision with root package name */
    public List f38240w0;

    /* renamed from: x, reason: collision with root package name */
    public final int f38241x;

    /* renamed from: x0, reason: collision with root package name */
    public float f38242x0;

    /* renamed from: y, reason: collision with root package name */
    public int f38243y;

    /* renamed from: y0, reason: collision with root package name */
    public int f38244y0;

    /* renamed from: z, reason: collision with root package name */
    public int f38245z;

    public c(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.sliderStyle, 2132083956), attributeSet, R.attr.sliderStyle);
        int i10;
        int i11;
        this.f38216k = new ArrayList();
        this.f38218l = new ArrayList();
        this.f38220m = new ArrayList();
        this.f38222n = false;
        this.H = false;
        this.f38205e0 = new ArrayList();
        this.f38207f0 = -1;
        this.f38209g0 = -1;
        this.f38211h0 = g.f34069a;
        this.f38215j0 = true;
        this.n0 = false;
        h hVar = new h();
        this.f38236u0 = hVar;
        this.f38240w0 = Collections.emptyList();
        this.f38244y0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f38200a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f38201b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f38202c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f38203d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f38204e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f38206f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f38241x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f38229r = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        this.f38231s = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f38233t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f38235u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f38237v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.E = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        int[] iArr = un.a.Q;
        c0.a(context2, attributeSet, R.attr.sliderStyle, 2132083956);
        c0.b(context2, attributeSet, iArr, R.attr.sliderStyle, 2132083956, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, 2132083956);
        this.f38214j = obtainStyledAttributes.getResourceId(8, 2132083990);
        this.I = obtainStyledAttributes.getFloat(3, g.f34069a);
        this.J = obtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.I));
        this.f38211h0 = obtainStyledAttributes.getFloat(2, g.f34069a);
        this.f38239w = (int) Math.ceil(obtainStyledAttributes.getDimension(9, (float) Math.ceil(e.f(48, getContext()))));
        boolean hasValue = obtainStyledAttributes.hasValue(21);
        if (hasValue) {
            i10 = 21;
        } else {
            i10 = 23;
        }
        int i12 = hasValue ? 21 : 22;
        ColorStateList l12 = dp.b.l1(context2, obtainStyledAttributes, i10);
        setTrackInactiveTintList(l12 == null ? k.getColorStateList(context2, R.color.material_slider_inactive_track_color) : l12);
        ColorStateList l13 = dp.b.l1(context2, obtainStyledAttributes, i12);
        setTrackActiveTintList(l13 == null ? k.getColorStateList(context2, R.color.material_slider_active_track_color) : l13);
        hVar.n(dp.b.l1(context2, obtainStyledAttributes, 10));
        if (obtainStyledAttributes.hasValue(13)) {
            setThumbStrokeColor(dp.b.l1(context2, obtainStyledAttributes, 13));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(14, g.f34069a));
        ColorStateList l14 = dp.b.l1(context2, obtainStyledAttributes, 5);
        setHaloTintList(l14 == null ? k.getColorStateList(context2, R.color.material_slider_halo_color) : l14);
        this.f38215j0 = obtainStyledAttributes.getBoolean(20, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(15);
        if (hasValue2) {
            i11 = 15;
        } else {
            i11 = 17;
        }
        int i13 = hasValue2 ? 15 : 16;
        ColorStateList l15 = dp.b.l1(context2, obtainStyledAttributes, i11);
        setTickInactiveTintList(l15 == null ? k.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : l15);
        ColorStateList l16 = dp.b.l1(context2, obtainStyledAttributes, i13);
        setTickActiveTintList(l16 == null ? k.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : l16);
        setThumbRadius(obtainStyledAttributes.getDimensionPixelSize(12, 0));
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(11, g.f34069a));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(24, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(19, 0));
        setLabelBehavior(obtainStyledAttributes.getInt(7, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        hVar.q();
        this.f38227q = ViewConfiguration.get(context2).getScaledTouchSlop();
        a aVar = new a((Slider) this);
        this.f38208g = aVar;
        n1.n(this, aVar);
        this.f38210h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void a(Drawable drawable) {
        int i10 = this.C * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
        } else {
            float max = i10 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final int b() {
        int i10 = this.f38243y / 2;
        int i11 = this.f38245z;
        int i12 = 0;
        if (i11 == 1 || i11 == 3) {
            i12 = ((bp.a) this.f38216k.get(0)).getIntrinsicHeight();
        }
        return i10 + i12;
    }

    public final ValueAnimator c(boolean z10) {
        float f10;
        ValueAnimator valueAnimator;
        int E1;
        TimeInterpolator F1;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            valueAnimator = this.f38225p;
        } else {
            valueAnimator = this.f38223o;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        if (z10) {
            E1 = dp.b.E1(getContext(), R.attr.motionDurationMedium4, 83);
            F1 = dp.b.F1(getContext(), R.attr.motionEasingEmphasizedInterpolator, vn.a.f38184e);
        } else {
            E1 = dp.b.E1(getContext(), R.attr.motionDurationShort3, 117);
            F1 = dp.b.F1(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, vn.a.f38182c);
        }
        ofFloat.setDuration(E1);
        ofFloat.setInterpolator(F1);
        ofFloat.addUpdateListener(new w(this, 5));
        return ofFloat;
    }

    public final void d(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        canvas.translate((this.B + ((int) (m(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f38208g.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f38200a.setColor(f(this.f38234t0));
        this.f38201b.setColor(f(this.f38232s0));
        this.f38204e.setColor(f(this.f38230r0));
        this.f38206f.setColor(f(this.f38228q0));
        Iterator it = this.f38216k.iterator();
        while (it.hasNext()) {
            bp.a aVar = (bp.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        h hVar = this.f38236u0;
        if (hVar.isStateful()) {
            hVar.setState(getDrawableState());
        }
        Paint paint = this.f38203d;
        paint.setColor(f(this.f38226p0));
        paint.setAlpha(63);
    }

    public final float[] e() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f38205e0.size() == 1) {
            floatValue2 = this.I;
        }
        float m10 = m(floatValue2);
        float m11 = m(floatValue);
        if (i()) {
            return new float[]{m11, m10};
        }
        return new float[]{m10, m11};
    }

    public final int f(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean g(float f10) {
        if (Math.abs(Math.round(r0) - new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.f38211h0)), MathContext.DECIMAL64).doubleValue()) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f38208g.f23946k;
    }

    public float getMinSeparation() {
        return g.f34069a;
    }

    public abstract float getValueFrom();

    public abstract float getValueTo();

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f38205e0);
    }

    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 1) {
            return true;
        }
        return false;
    }

    public final void j() {
        if (this.f38211h0 <= g.f34069a) {
            return;
        }
        v();
        int min = Math.min((int) (((this.J - this.I) / this.f38211h0) + 1.0f), (this.f38221m0 / (this.A * 2)) + 1);
        float[] fArr = this.f38213i0;
        if (fArr == null || fArr.length != min * 2) {
            this.f38213i0 = new float[min * 2];
        }
        float f10 = this.f38221m0 / (min - 1);
        for (int i10 = 0; i10 < min * 2; i10 += 2) {
            float[] fArr2 = this.f38213i0;
            fArr2[i10] = ((i10 / 2.0f) * f10) + this.B;
            fArr2[i10 + 1] = b();
        }
    }

    public final boolean k(int i10) {
        int i11 = this.f38209g0;
        long j10 = i11 + i10;
        long size = this.f38205e0.size() - 1;
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.f38209g0 = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.f38207f0 != -1) {
            this.f38207f0 = i12;
        }
        t();
        postInvalidate();
        return true;
    }

    public final void l(int i10) {
        if (i()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i10 = -i10;
            }
        }
        k(i10);
    }

    public final float m(float f10) {
        float f11 = this.I;
        float f12 = (f10 - f11) / (this.J - f11);
        if (i()) {
            return 1.0f - f12;
        }
        return f12;
    }

    public final void n() {
        Iterator it = this.f38220m.iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.a.u(it.next());
        throw null;
    }

    public final void o(bp.a aVar, float f10) {
        String str;
        if (((int) f10) == f10) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(f10));
        if (!TextUtils.equals(aVar.f7235x, format)) {
            aVar.f7235x = format;
            aVar.A.f27977d = true;
            aVar.invalidateSelf();
        }
        int m10 = (this.B + ((int) (m(f10) * this.f38221m0))) - (aVar.getIntrinsicWidth() / 2);
        int b10 = b() - (this.E + this.C);
        aVar.setBounds(m10, b10 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + m10, b10);
        Rect rect = new Rect(aVar.getBounds());
        mo.c.b(e.l(this), this, rect);
        aVar.setBounds(rect);
        x m11 = e.m(this);
        int i10 = m11.f35538a;
        ViewOverlay viewOverlay = m11.f35539b;
        switch (i10) {
            case 0:
                viewOverlay.add(aVar);
                return;
            default:
                viewOverlay.add(aVar);
                return;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f38216k.iterator();
        while (it.hasNext()) {
            bp.a aVar = (bp.a) it.next();
            ViewGroup l10 = e.l(this);
            if (l10 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                l10.getLocationOnScreen(iArr);
                aVar.I = iArr[0];
                l10.getWindowVisibleDisplayFrame(aVar.C);
                l10.addOnLayoutChangeListener(aVar.B);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        o oVar = this.f38212i;
        if (oVar != null) {
            removeCallbacks(oVar);
        }
        this.f38222n = false;
        Iterator it = this.f38216k.iterator();
        while (it.hasNext()) {
            bp.a aVar = (bp.a) it.next();
            x m10 = e.m(this);
            if (m10 != null) {
                int i10 = m10.f35538a;
                ViewOverlay viewOverlay = m10.f35539b;
                switch (i10) {
                    case 0:
                        viewOverlay.remove(aVar);
                        break;
                    default:
                        viewOverlay.remove(aVar);
                        break;
                }
                ViewGroup l10 = e.l(this);
                if (l10 == null) {
                    aVar.getClass();
                } else {
                    l10.removeOnLayoutChangeListener(aVar.B);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f38224o0) {
            v();
            j();
        }
        super.onDraw(canvas);
        int b10 = b();
        int i10 = this.f38221m0;
        float[] e10 = e();
        int i11 = this.B;
        float f10 = i10;
        float f11 = i11 + (e10[1] * f10);
        float f12 = i11 + i10;
        Paint paint = this.f38200a;
        if (f11 < f12) {
            float f13 = b10;
            canvas.drawLine(f11, f13, f12, f13, paint);
        }
        float f14 = this.B;
        float f15 = (e10[0] * f10) + f14;
        if (f15 > f14) {
            float f16 = b10;
            canvas.drawLine(f14, f16, f15, f16, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.I) {
            int i12 = this.f38221m0;
            float[] e11 = e();
            float f17 = this.B;
            float f18 = i12;
            float f19 = b10;
            canvas.drawLine((e11[0] * f18) + f17, f19, (e11[1] * f18) + f17, f19, this.f38201b);
        }
        if (this.f38215j0 && this.f38211h0 > g.f34069a) {
            float[] e12 = e();
            int round = Math.round(e12[0] * ((this.f38213i0.length / 2) - 1));
            int round2 = Math.round(e12[1] * ((this.f38213i0.length / 2) - 1));
            float[] fArr = this.f38213i0;
            int i13 = round * 2;
            Paint paint2 = this.f38204e;
            canvas.drawPoints(fArr, 0, i13, paint2);
            int i14 = round2 * 2;
            canvas.drawPoints(this.f38213i0, i13, i14 - i13, this.f38206f);
            float[] fArr2 = this.f38213i0;
            canvas.drawPoints(fArr2, i14, fArr2.length - i14, paint2);
        }
        if ((this.H || isFocused()) && isEnabled()) {
            int i15 = this.f38221m0;
            if (!(getBackground() instanceof RippleDrawable)) {
                int m10 = (int) ((m(((Float) this.f38205e0.get(this.f38209g0)).floatValue()) * i15) + this.B);
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = this.D;
                    canvas.clipRect(m10 - i16, b10 - i16, m10 + i16, i16 + b10, Region.Op.UNION);
                }
                canvas.drawCircle(m10, b10, this.D, this.f38203d);
            }
        }
        if ((this.f38207f0 != -1 || this.f38245z == 3) && isEnabled()) {
            if (this.f38245z != 2) {
                if (!this.f38222n) {
                    this.f38222n = true;
                    ValueAnimator c10 = c(true);
                    this.f38223o = c10;
                    this.f38225p = null;
                    c10.start();
                }
                ArrayList arrayList = this.f38216k;
                Iterator it = arrayList.iterator();
                for (int i17 = 0; i17 < this.f38205e0.size() && it.hasNext(); i17++) {
                    if (i17 != this.f38209g0) {
                        o((bp.a) it.next(), ((Float) this.f38205e0.get(i17)).floatValue());
                    }
                }
                if (it.hasNext()) {
                    o((bp.a) it.next(), ((Float) this.f38205e0.get(this.f38209g0)).floatValue());
                } else {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f38205e0.size())));
                }
            }
        } else if (this.f38222n) {
            this.f38222n = false;
            ValueAnimator c11 = c(false);
            this.f38225p = c11;
            this.f38223o = null;
            c11.addListener(new m.d(this, 8));
            this.f38225p.start();
        }
        int i18 = this.f38221m0;
        for (int i19 = 0; i19 < this.f38205e0.size(); i19++) {
            float floatValue = ((Float) this.f38205e0.get(i19)).floatValue();
            Drawable drawable = this.f38238v0;
            if (drawable != null) {
                d(canvas, i18, b10, floatValue, drawable);
            } else if (i19 < this.f38240w0.size()) {
                d(canvas, i18, b10, floatValue, (Drawable) this.f38240w0.get(i19));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((m(floatValue) * i18) + this.B, b10, this.C, this.f38202c);
                }
                d(canvas, i18, b10, floatValue, this.f38236u0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a aVar = this.f38208g;
        if (!z10) {
            this.f38207f0 = -1;
            aVar.j(this.f38209g0);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 == 66) {
                        l(Integer.MIN_VALUE);
                    }
                } else {
                    l(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            } else {
                k(Integer.MIN_VALUE);
            }
        } else {
            k(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        aVar.w(this.f38209g0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f38205e0.size() == 1) {
            this.f38207f0 = 0;
        }
        Float f10 = null;
        Boolean bool = null;
        if (this.f38207f0 == -1) {
            if (i10 != 61) {
                if (i10 != 66) {
                    if (i10 != 81) {
                        if (i10 != 69) {
                            if (i10 != 70) {
                                switch (i10) {
                                    case 21:
                                        l(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        l(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            k(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    k(1);
                    bool = Boolean.TRUE;
                }
                this.f38207f0 = this.f38209g0;
                postInvalidate();
                bool = Boolean.TRUE;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(k(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(k(-1));
            } else {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i10, keyEvent);
        }
        boolean isLongPress = this.n0 | keyEvent.isLongPress();
        this.n0 = isLongPress;
        float f11 = 1.0f;
        if (isLongPress) {
            float f12 = this.f38211h0;
            if (f12 != g.f34069a) {
                f11 = f12;
            }
            if ((this.J - this.I) / f11 > 20) {
                f11 *= Math.round(r0 / r11);
            }
        } else {
            float f13 = this.f38211h0;
            if (f13 != g.f34069a) {
                f11 = f13;
            }
        }
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 69) {
                    if (i10 == 70 || i10 == 81) {
                        f10 = Float.valueOf(f11);
                    }
                } else {
                    f10 = Float.valueOf(-f11);
                }
            } else {
                if (i()) {
                    f11 = -f11;
                }
                f10 = Float.valueOf(f11);
            }
        } else {
            if (!i()) {
                f11 = -f11;
            }
            f10 = Float.valueOf(f11);
        }
        if (f10 != null) {
            if (q(this.f38207f0, f10.floatValue() + ((Float) this.f38205e0.get(this.f38207f0)).floatValue())) {
                t();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return k(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return k(-1);
            }
        }
        this.f38207f0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.n0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f38243y;
        int i13 = this.f38245z;
        int i14 = 0;
        if (i13 == 1 || i13 == 3) {
            i14 = ((bp.a) this.f38216k.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + i14, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.I = bVar.f38195a;
        this.J = bVar.f38196b;
        p(bVar.f38197c);
        this.f38211h0 = bVar.f38198d;
        if (bVar.f38199e) {
            requestFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, vo.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f38195a = this.I;
        baseSavedState.f38196b = this.J;
        baseSavedState.f38197c = new ArrayList(this.f38205e0);
        baseSavedState.f38198d = this.f38211h0;
        baseSavedState.f38199e = hasFocus();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f38221m0 = Math.max(i10 - (this.B * 2), 0);
        j();
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r2 != 3) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vo.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        x m10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (m10 = e.m(this)) == null) {
            return;
        }
        Iterator it = this.f38216k.iterator();
        while (it.hasNext()) {
            bp.a aVar = (bp.a) it.next();
            int i11 = m10.f35538a;
            ViewOverlay viewOverlay = m10.f35539b;
            switch (i11) {
                case 0:
                    viewOverlay.remove(aVar);
                    break;
                default:
                    viewOverlay.remove(aVar);
                    break;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        qo.d dVar;
        ViewGroup l10;
        int resourceId;
        x m10;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f38205e0.size() == arrayList.size() && this.f38205e0.equals(arrayList)) {
                return;
            }
            this.f38205e0 = arrayList;
            int i10 = 1;
            this.f38224o0 = true;
            this.f38209g0 = 0;
            t();
            ArrayList arrayList2 = this.f38216k;
            if (arrayList2.size() > this.f38205e0.size()) {
                List<bp.a> subList = arrayList2.subList(this.f38205e0.size(), arrayList2.size());
                for (bp.a aVar : subList) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.b(this) && (m10 = e.m(this)) != null) {
                        int i11 = m10.f35538a;
                        ViewOverlay viewOverlay = m10.f35539b;
                        switch (i11) {
                            case 0:
                                viewOverlay.remove(aVar);
                                break;
                            default:
                                viewOverlay.remove(aVar);
                                break;
                        }
                        ViewGroup l11 = e.l(this);
                        if (l11 == null) {
                            aVar.getClass();
                        } else {
                            l11.removeOnLayoutChangeListener(aVar.B);
                        }
                    }
                }
                subList.clear();
            }
            while (arrayList2.size() < this.f38205e0.size()) {
                Context context = getContext();
                int i12 = this.f38214j;
                bp.a aVar2 = new bp.a(context, i12);
                TypedArray f10 = c0.f(aVar2.f7236y, null, un.a.Y, 0, i12, new int[0]);
                Context context2 = aVar2.f7236y;
                aVar2.H = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                i f11 = aVar2.f36253a.f36231a.f();
                f11.f20172k = aVar2.w();
                aVar2.setShapeAppearanceModel(f11.a());
                CharSequence text = f10.getText(6);
                boolean equals = TextUtils.equals(aVar2.f7235x, text);
                z zVar = aVar2.A;
                if (!equals) {
                    aVar2.f7235x = text;
                    zVar.f27977d = true;
                    aVar2.invalidateSelf();
                }
                if (f10.hasValue(0) && (resourceId = f10.getResourceId(0, 0)) != 0) {
                    dVar = new qo.d(context2, resourceId);
                } else {
                    dVar = null;
                }
                if (dVar != null && f10.hasValue(1)) {
                    dVar.f32111j = dp.b.l1(context2, f10, 1);
                }
                zVar.b(dVar, context2);
                aVar2.n(ColorStateList.valueOf(f10.getColor(7, u3.a.b(u3.a.d(e.j(context2, R.attr.colorOnBackground, bp.a.class.getCanonicalName()), 153), u3.a.d(e.j(context2, android.R.attr.colorBackground, bp.a.class.getCanonicalName()), 229)))));
                aVar2.r(ColorStateList.valueOf(e.j(context2, R.attr.colorSurface, bp.a.class.getCanonicalName())));
                aVar2.D = f10.getDimensionPixelSize(2, 0);
                aVar2.E = f10.getDimensionPixelSize(4, 0);
                aVar2.F = f10.getDimensionPixelSize(5, 0);
                aVar2.G = f10.getDimensionPixelSize(3, 0);
                f10.recycle();
                arrayList2.add(aVar2);
                WeakHashMap weakHashMap2 = n1.f13788a;
                if (y0.b(this) && (l10 = e.l(this)) != null) {
                    int[] iArr = new int[2];
                    l10.getLocationOnScreen(iArr);
                    aVar2.I = iArr[0];
                    l10.getWindowVisibleDisplayFrame(aVar2.C);
                    l10.addOnLayoutChangeListener(aVar2.B);
                }
            }
            if (arrayList2.size() == 1) {
                i10 = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                bp.a aVar3 = (bp.a) it.next();
                aVar3.f36253a.f36241k = i10;
                aVar3.invalidateSelf();
            }
            Iterator it2 = this.f38218l.iterator();
            while (it2.hasNext()) {
                qj.x xVar = (qj.x) it2.next();
                Iterator it3 = this.f38205e0.iterator();
                while (it3.hasNext()) {
                    xVar.a(this, ((Float) it3.next()).floatValue());
                }
            }
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final boolean q(int i10, float f10) {
        float floatValue;
        float floatValue2;
        this.f38209g0 = i10;
        int i11 = 0;
        if (Math.abs(f10 - ((Float) this.f38205e0.get(i10)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f38244y0 == 0) {
            if (minSeparation == g.f34069a) {
                minSeparation = 0.0f;
            } else {
                float f11 = this.I;
                minSeparation = nn.d.b(f11, this.J, (minSeparation - this.B) / this.f38221m0, f11);
            }
        }
        if (i()) {
            minSeparation = -minSeparation;
        }
        int i12 = i10 + 1;
        if (i12 >= this.f38205e0.size()) {
            floatValue = this.J;
        } else {
            floatValue = ((Float) this.f38205e0.get(i12)).floatValue() - minSeparation;
        }
        int i13 = i10 - 1;
        if (i13 < 0) {
            floatValue2 = this.I;
        } else {
            floatValue2 = minSeparation + ((Float) this.f38205e0.get(i13)).floatValue();
        }
        this.f38205e0.set(i10, Float.valueOf(f.E(f10, floatValue2, floatValue)));
        Iterator it = this.f38218l.iterator();
        while (it.hasNext()) {
            ((qj.x) it.next()).a(this, ((Float) this.f38205e0.get(i10)).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f38210h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f38212i;
            if (runnable == null) {
                this.f38212i = new o(this, i11);
            } else {
                removeCallbacks(runnable);
            }
            o oVar = this.f38212i;
            oVar.f281b = i10;
            postDelayed(oVar, 200L);
            return true;
        }
        return true;
    }

    public final void r() {
        double d10;
        float f10 = this.f38242x0;
        float f11 = this.f38211h0;
        if (f11 > g.f34069a) {
            d10 = Math.round(f10 * r1) / ((int) ((this.J - this.I) / f11));
        } else {
            d10 = f10;
        }
        if (i()) {
            d10 = 1.0d - d10;
        }
        float f12 = this.J;
        q(this.f38207f0, (float) ((d10 * (f12 - r1)) + this.I));
    }

    public final void s(int i10, Rect rect) {
        int m10 = this.B + ((int) (m(getValues().get(i10).floatValue()) * this.f38221m0));
        int b10 = b();
        int i11 = this.C;
        int i12 = this.f38239w;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(m10 - i13, b10 - i13, m10 + i13, b10 + i13);
    }

    public void setActiveThumbIndex(int i10) {
        this.f38207f0 = i10;
    }

    public void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        int i10;
        super.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        setLayerType(i10, null);
    }

    public abstract void setHaloRadius(int i10);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i10);

    public void setSeparationUnit(int i10) {
        this.f38244y0 = i10;
        this.f38224o0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f10);

    public abstract void setThumbRadius(int i10);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f10);

    public abstract void setTickActiveRadius(int i10);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i10);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i10);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        p(arrayList);
    }

    public final void t() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m10 = (int) ((m(((Float) this.f38205e0.get(this.f38209g0)).floatValue()) * this.f38221m0) + this.B);
                int b10 = b();
                int i10 = this.D;
                v3.b.f(background, m10 - i10, b10 - i10, m10 + i10, b10 + i10);
            }
        }
    }

    public final void u() {
        boolean z10;
        int max = Math.max(this.f38241x, Math.max(this.A + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.C * 2)));
        boolean z11 = false;
        if (max == this.f38243y) {
            z10 = false;
        } else {
            this.f38243y = max;
            z10 = true;
        }
        int max2 = Math.max(Math.max(Math.max(this.C - this.f38231s, 0), Math.max((this.A - this.f38233t) / 2, 0)), Math.max(Math.max(this.f38217k0 - this.f38235u, 0), Math.max(this.f38219l0 - this.f38237v, 0))) + this.f38229r;
        if (this.B != max2) {
            this.B = max2;
            WeakHashMap weakHashMap = n1.f13788a;
            if (y0.c(this)) {
                this.f38221m0 = Math.max(getWidth() - (this.B * 2), 0);
                j();
            }
            z11 = true;
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void v() {
        if (this.f38224o0) {
            float f10 = this.I;
            float f11 = this.J;
            if (f10 < f11) {
                if (f11 > f10) {
                    if (this.f38211h0 > g.f34069a && !g(f11 - f10)) {
                        throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f38211h0), Float.valueOf(this.I), Float.valueOf(this.J)));
                    }
                    Iterator it = this.f38205e0.iterator();
                    while (it.hasNext()) {
                        Float f12 = (Float) it.next();
                        if (f12.floatValue() >= this.I && f12.floatValue() <= this.J) {
                            if (this.f38211h0 > g.f34069a && !g(f12.floatValue() - this.I)) {
                                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f12, Float.valueOf(this.I), Float.valueOf(this.f38211h0), Float.valueOf(this.f38211h0)));
                            }
                        } else {
                            throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f12, Float.valueOf(this.I), Float.valueOf(this.J)));
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= g.f34069a) {
                        float f13 = this.f38211h0;
                        if (f13 > g.f34069a && minSeparation > g.f34069a) {
                            if (this.f38244y0 == 1) {
                                if (minSeparation < f13 || !g(minSeparation)) {
                                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f38211h0), Float.valueOf(this.f38211h0)));
                                }
                            } else {
                                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f38211h0)));
                            }
                        }
                        float f14 = this.f38211h0;
                        if (f14 != g.f34069a) {
                            if (((int) f14) != f14) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f14)));
                            }
                            float f15 = this.I;
                            if (((int) f15) != f15) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f15)));
                            }
                            float f16 = this.J;
                            if (((int) f16) != f16) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f16)));
                            }
                        }
                        this.f38224o0 = false;
                        return;
                    }
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
                }
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.J), Float.valueOf(this.I)));
            }
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.I), Float.valueOf(this.J)));
        }
    }

    public void setValues(@NonNull List<Float> list) {
        p(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f38238v0 = null;
        this.f38240w0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f38240w0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
