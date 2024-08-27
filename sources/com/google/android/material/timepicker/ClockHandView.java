package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f11533a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11534b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11535c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11536d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11537e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f11538f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f11539g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11540h;

    /* renamed from: i, reason: collision with root package name */
    public float f11541i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11542j;

    /* renamed from: k, reason: collision with root package name */
    public double f11543k;

    /* renamed from: l, reason: collision with root package name */
    public int f11544l;

    /* renamed from: m, reason: collision with root package name */
    public int f11545m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f11533a = new ValueAnimator();
        this.f11535c = new ArrayList();
        Paint paint = new Paint();
        this.f11538f = paint;
        this.f11539g = new RectF();
        this.f11545m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.f37301l, R.attr.materialClockStyle, 2132083978);
        dp.b.E1(context, R.attr.motionDurationLong2, 200);
        dp.b.F1(context, R.attr.motionEasingEmphasizedInterpolator, vn.a.f38181b);
        this.f11544l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f11536d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f11540h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f11537e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(s0.g.f34069a);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(this.f11544l * 0.66f);
        }
        return this.f11544l;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f11533a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.f11541i = f11;
        this.f11543k = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a10 = a(this.f11545m);
        float cos = (((float) Math.cos(this.f11543k)) * a10) + width;
        float sin = (a10 * ((float) Math.sin(this.f11543k))) + height;
        float f12 = this.f11536d;
        this.f11539g.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f11535c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.I - f11) > 0.001f) {
                clockFaceView.I = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float a10 = a(this.f11545m);
        float cos = (((float) Math.cos(this.f11543k)) * a10) + f10;
        float f11 = height;
        float sin = (a10 * ((float) Math.sin(this.f11543k))) + f11;
        Paint paint = this.f11538f;
        paint.setStrokeWidth(s0.g.f34069a);
        canvas.drawCircle(cos, sin, this.f11536d, paint);
        double sin2 = Math.sin(this.f11543k);
        paint.setStrokeWidth(this.f11540h);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f11543k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f10, f11, this.f11537e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f11533a.isRunning()) {
            b(this.f11541i);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.f11542j;
                if (this.f11534b) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y10 - (getHeight() / 2))) <= a(2) + pn.e.f(12, getContext())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f11545m = i10;
                }
                z10 = false;
            }
        } else {
            this.f11542j = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.f11542j;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            i11 = degrees + 450;
        }
        float f10 = i11;
        if (this.f11541i != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f10);
            }
            this.f11542j = z14 | z13;
            return true;
        }
        z13 = true;
        this.f11542j = z14 | z13;
        return true;
    }
}
