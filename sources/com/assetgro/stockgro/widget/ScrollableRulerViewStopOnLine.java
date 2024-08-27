package com.assetgro.stockgro.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.c;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.g0;
import qj.j0;
import qj.m0;
import qu.f0;
import qu.h2;
import r3.k;
import t3.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001CB\u0019\u0012\u0006\u0010>\u001a\u00020=\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR*\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010*\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u0017\u0010-\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010<\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006D"}, d2 = {"Lcom/assetgro/stockgro/widget/ScrollableRulerViewStopOnLine;", "Landroid/view/View;", "Lqj/g0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, HttpUrl.FRAGMENT_ENCODE_SET, "setOnRulerValueChangeListener", "Lqu/f0;", "w", "Lqu/f0;", "getCoroutineScope", "()Lqu/f0;", "setCoroutineScope", "(Lqu/f0;)V", "coroutineScope", "Lqj/j0;", "x", "Lqj/j0;", "getScrollableRulerFormatter", "()Lqj/j0;", "setScrollableRulerFormatter", "(Lqj/j0;)V", "scrollableRulerFormatter", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, "z", "I", "getRulerStartValue", "()I", "setRulerStartValue", "(I)V", "rulerStartValue", "A", "getRulerEndValue", "setRulerEndValue", "rulerEndValue", "B", "getRulerIncrementValue", "setRulerIncrementValue", "rulerIncrementValue", "C", "getRulerValue", "setRulerValue", "rulerValue", "D", "getScreenWidth", "screenWidth", HttpUrl.FRAGMENT_ENCODE_SET, "E", "F", "getMiddleOfScreen", "()F", "setMiddleOfScreen", "(F)V", "middleOfScreen", "getInitialXValue", "setInitialXValue", "initialXValue", "f0", "getPreviousRulerValue", "setPreviousRulerValue", "previousRulerValue", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ScrollableRulerViewStopOnLine extends View {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f10702g0 = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public int rulerEndValue;

    /* renamed from: B, reason: from kotlin metadata */
    public int rulerIncrementValue;

    /* renamed from: C, reason: from kotlin metadata */
    public int rulerValue;

    /* renamed from: D, reason: from kotlin metadata */
    public final int screenWidth;

    /* renamed from: E, reason: from kotlin metadata */
    public float middleOfScreen;

    /* renamed from: F, reason: from kotlin metadata */
    public float initialXValue;
    public final Scroller G;
    public float H;
    public final float I;
    public final float J;

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f10703a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10704b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10705c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f10706d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f10707e;

    /* renamed from: e0, reason: collision with root package name */
    public g0 f10708e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f10709f;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public int previousRulerValue;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f10711g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10712h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10713i;

    /* renamed from: j, reason: collision with root package name */
    public final float f10714j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f10715k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f10716l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f10717m;

    /* renamed from: n, reason: collision with root package name */
    public float f10718n;

    /* renamed from: o, reason: collision with root package name */
    public final float f10719o;

    /* renamed from: p, reason: collision with root package name */
    public final float f10720p;

    /* renamed from: q, reason: collision with root package name */
    public final float f10721q;

    /* renamed from: r, reason: collision with root package name */
    public final float f10722r;

    /* renamed from: s, reason: collision with root package name */
    public final float f10723s;

    /* renamed from: t, reason: collision with root package name */
    public final PointF f10724t;

    /* renamed from: u, reason: collision with root package name */
    public final long f10725u;

    /* renamed from: v, reason: collision with root package name */
    public h2 f10726v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public f0 coroutineScope;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public j0 scrollableRulerFormatter;

    /* renamed from: y, reason: collision with root package name */
    public float f10729y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public int rulerStartValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableRulerViewStopOnLine(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.f10706d = paint;
        Paint paint2 = new Paint(1);
        this.f10707e = paint2;
        Paint paint3 = new Paint(1);
        this.f10709f = paint3;
        Paint paint4 = new Paint(1);
        this.f10711g = paint4;
        float f10 = context.getResources().getDisplayMetrics().density;
        float f11 = 4 * f10;
        this.f10712h = f11;
        this.f10713i = 10.5f * f10;
        float f12 = 8 * f10;
        this.f10714j = f12;
        this.f10715k = new Path();
        this.f10716l = new RectF();
        this.f10717m = new RectF();
        this.f10718n = 22 * f10;
        this.f10719o = f11;
        float f13 = 32 * f10;
        this.f10720p = f13;
        this.f10721q = 12 * f10;
        this.f10722r = f13;
        this.f10723s = f12;
        this.f10724t = new PointF();
        this.f10725u = 500L;
        this.rulerEndValue = 100;
        this.rulerIncrementValue = 1;
        int i10 = this.rulerStartValue;
        this.rulerValue = ((100 - i10) / 2) + i10;
        this.screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        this.middleOfScreen = (r7 - 32) / 2.0f;
        this.G = new Scroller(context, new LinearInterpolator());
        this.H = ((this.rulerEndValue - this.rulerStartValue) / this.rulerIncrementValue) * f12;
        float applyDimension = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.I = applyDimension;
        float applyDimension2 = TypedValue.applyDimension(1, 14.0f, context.getResources().getDisplayMetrics());
        this.J = applyDimension2;
        Typeface a10 = p.a(R.font.inter_600, context);
        Typeface a11 = p.a(R.font.inter_400, context);
        paint.setColor(k.getColor(context, R.color.purple_text));
        float f14 = f10 * 2.0f;
        paint.setStrokeWidth(f14);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setTextSize(paint.getTextSize());
        paint2.setColor(k.getColor(context, R.color.purple_text));
        paint2.setStrokeWidth(f14);
        paint2.setTextAlign(align);
        paint2.setTextSize(paint2.getTextSize());
        paint3.setColor(-1);
        paint3.setTextAlign(align);
        paint3.setTypeface(a10);
        paint3.setTextSize(applyDimension2);
        paint4.setColor(-7829368);
        paint4.setTextAlign(align);
        paint4.setTypeface(a11);
        paint4.setTextSize(applyDimension);
        this.previousRulerValue = -1;
    }

    public final void a() {
        Bitmap bitmap = this.f10703a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f10703a = null;
        this.f10704b = false;
        invalidate();
    }

    public final void b(int i10, int i11) {
        LinearInterpolator linearInterpolator;
        int i12 = this.rulerEndValue;
        if (i10 > i12 || i10 < (i12 = this.rulerStartValue)) {
            i10 = i12;
        }
        final int i13 = i10 * this.rulerIncrementValue;
        float f10 = this.middleOfScreen - (i13 * this.f10723s);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "initialXValue", this.initialXValue, f10);
        ofFloat.setDuration(300L);
        if (i11 < 0) {
            linearInterpolator = new LinearInterpolator();
        } else {
            linearInterpolator = null;
        }
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.start();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qj.k0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                int i14 = ScrollableRulerViewStopOnLine.f10702g0;
                ScrollableRulerViewStopOnLine this$0 = ScrollableRulerViewStopOnLine.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.initialXValue = ((Float) animatedValue).floatValue();
                this$0.rulerValue = i13;
                g0 g0Var = this$0.f10708e0;
                if (g0Var != null) {
                    h2 h2Var = this$0.f10726v;
                    if (h2Var != null) {
                        h2Var.a(null);
                    }
                    this$0.f10726v = yk.g.H(this$0.getCoroutineScope(), null, null, new l0(this$0, g0Var, null), 3);
                }
                this$0.f10705c = true;
                this$0.a();
            }
        });
        ofFloat.addListener(new m0(this, f10));
        ofFloat.start();
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.G;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), 0);
            postInvalidate();
        }
    }

    @NotNull
    public final f0 getCoroutineScope() {
        f0 f0Var = this.coroutineScope;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.k("coroutineScope");
        throw null;
    }

    public final float getInitialXValue() {
        return this.initialXValue;
    }

    public final float getMiddleOfScreen() {
        return this.middleOfScreen;
    }

    public final int getPreviousRulerValue() {
        return this.previousRulerValue;
    }

    public final int getRulerEndValue() {
        return this.rulerEndValue;
    }

    public final int getRulerIncrementValue() {
        return this.rulerIncrementValue;
    }

    public final int getRulerStartValue() {
        return this.rulerStartValue;
    }

    public final int getRulerValue() {
        return this.rulerValue;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final j0 getScrollableRulerFormatter() {
        return this.scrollableRulerFormatter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013b, code lost:
    
        if (r2 == null) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10 = this.f10720p + this.f10722r;
        float f11 = this.f10712h;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), c.b((f11 * 3) + f10 + f11 + this.I));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Paint paint = this.f10709f;
        this.f10718n = (this.f10712h * 2) + (paint.getTextSize() * 0.7f);
        this.H = ((this.rulerEndValue - this.rulerStartValue) / this.rulerIncrementValue) * this.f10723s;
        float width = getWidth() / 2.0f;
        this.middleOfScreen = width;
        float descent = ((this.J / 2.0f) + (this.f10718n / 2.0f)) - (paint.descent() / 2.0f);
        int i14 = this.rulerValue;
        int i15 = this.rulerEndValue;
        if (i14 > i15) {
            this.rulerValue = i15;
        }
        this.f10724t.set(width, descent);
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == 0) goto L90
            if (r0 == r1) goto L7f
            r2 = 2
            if (r0 == r2) goto L16
            r2 = 3
            if (r0 == r2) goto L7f
            goto La4
        L16:
            float r0 = r6.getX()
            float r2 = r5.f10729y
            float r0 = r0 - r2
            int r0 = (int) r0
            if (r0 == 0) goto L26
            float r6 = r6.getX()
            r5.f10729y = r6
        L26:
            float r6 = r5.initialXValue
            float r2 = (float) r0
            float r6 = r6 + r2
            r5.initialXValue = r6
            float r2 = r5.middleOfScreen
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L34
            r5.initialXValue = r2
        L34:
            float r6 = r5.initialXValue
            r2 = 0
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 >= 0) goto L4c
            float r6 = java.lang.Math.abs(r6)
            float r3 = r5.middleOfScreen
            float r6 = r6 + r3
            float r4 = r5.H
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4c
            float r4 = r4 - r3
            float r6 = -r4
            r5.initialXValue = r6
        L4c:
            float r6 = r5.initialXValue
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            float r3 = r5.f10723s
            if (r2 >= 0) goto L65
            int r2 = r5.rulerStartValue
            float r6 = java.lang.Math.abs(r6)
            float r4 = r5.middleOfScreen
            float r6 = r6 + r4
            float r6 = r6 / r3
            int r3 = r5.rulerIncrementValue
            float r3 = (float) r3
            float r6 = r6 * r3
            int r6 = (int) r6
        L63:
            int r2 = r2 + r6
            goto L71
        L65:
            int r2 = r5.rulerStartValue
            float r4 = r5.middleOfScreen
            float r4 = r4 - r6
            float r4 = r4 / r3
            int r6 = r5.rulerIncrementValue
            float r6 = (float) r6
            float r4 = r4 * r6
            int r6 = (int) r4
            goto L63
        L71:
            int r6 = r5.previousRulerValue
            if (r2 == r6) goto La4
            r5.rulerValue = r2
            r5.b(r2, r0)
            int r6 = r5.rulerValue
            r5.previousRulerValue = r6
            goto La4
        L7f:
            r6.getX()
            r5.a()
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto La4
            r0 = 0
            r6.requestDisallowInterceptTouchEvent(r0)
            goto La4
        L90:
            r6.getX()
            r5.f10705c = r1
            float r6 = r6.getX()
            r5.f10729y = r6
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto La4
            r6.requestDisallowInterceptTouchEvent(r1)
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCoroutineScope(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.coroutineScope = f0Var;
    }

    public final void setInitialXValue(float f10) {
        this.initialXValue = f10;
    }

    public final void setMiddleOfScreen(float f10) {
        this.middleOfScreen = f10;
    }

    public final void setOnRulerValueChangeListener(@NotNull g0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f10708e0 = listener;
    }

    public final void setPreviousRulerValue(int i10) {
        this.previousRulerValue = i10;
    }

    public final void setRulerEndValue(int i10) {
        this.rulerEndValue = i10;
        int i11 = this.rulerStartValue;
        this.H = ((i10 - i11) / this.rulerIncrementValue) * this.f10723s;
        this.rulerValue = ((i10 - i11) / 2) + i11;
        a();
    }

    public final void setRulerIncrementValue(int i10) {
        this.rulerIncrementValue = i10;
    }

    public final void setRulerStartValue(int i10) {
        this.rulerStartValue = i10;
    }

    public final void setRulerValue(int i10) {
        this.rulerValue = i10;
    }

    public final void setScrollableRulerFormatter(j0 j0Var) {
        this.scrollableRulerFormatter = j0Var;
    }
}
