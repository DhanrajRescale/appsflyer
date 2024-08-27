package com.jsibbold.zoomage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import d4.i0;
import pm.b;
import s0.g;
import vr.a;
import vr.c;
import vr.d;

/* loaded from: classes2.dex */
public class ZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {
    public int A;
    public final ScaleGestureDetector B;
    public ValueAnimator C;
    public final GestureDetector D;
    public boolean E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f12015d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f12016e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f12017f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f12018g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f12019h;

    /* renamed from: i, reason: collision with root package name */
    public final float f12020i;

    /* renamed from: j, reason: collision with root package name */
    public final float f12021j;

    /* renamed from: k, reason: collision with root package name */
    public float f12022k;

    /* renamed from: l, reason: collision with root package name */
    public float f12023l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f12024m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12025n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12026o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12027p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12028q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12029r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12030s;

    /* renamed from: t, reason: collision with root package name */
    public float f12031t;

    /* renamed from: u, reason: collision with root package name */
    public int f12032u;

    /* renamed from: v, reason: collision with root package name */
    public final PointF f12033v;

    /* renamed from: w, reason: collision with root package name */
    public float f12034w;

    /* renamed from: x, reason: collision with root package name */
    public float f12035x;

    /* renamed from: y, reason: collision with root package name */
    public float f12036y;

    /* renamed from: z, reason: collision with root package name */
    public int f12037z;

    public ZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12016e = new Matrix();
        this.f12017f = new Matrix();
        this.f12018g = new float[9];
        this.f12019h = null;
        this.f12020i = 0.6f;
        this.f12021j = 8.0f;
        this.f12022k = 0.6f;
        this.f12023l = 8.0f;
        this.f12024m = new RectF();
        this.f12033v = new PointF(g.f34069a, g.f34069a);
        this.f12034w = 1.0f;
        this.f12035x = 1.0f;
        this.f12036y = 1.0f;
        int i10 = 1;
        this.f12037z = 1;
        this.A = 0;
        this.E = false;
        this.F = false;
        b bVar = new b(this, 2);
        this.B = new ScaleGestureDetector(context, this);
        this.D = new GestureDetector(context, bVar);
        i0.b(this.B, false);
        this.f12015d = getScaleType();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f38279a);
        this.f12026o = obtainStyledAttributes.getBoolean(9, true);
        this.f12025n = obtainStyledAttributes.getBoolean(8, true);
        this.f12029r = obtainStyledAttributes.getBoolean(0, true);
        this.f12030s = obtainStyledAttributes.getBoolean(1, true);
        this.f12028q = obtainStyledAttributes.getBoolean(7, false);
        this.f12027p = obtainStyledAttributes.getBoolean(3, true);
        this.f12020i = obtainStyledAttributes.getFloat(6, 0.6f);
        this.f12021j = obtainStyledAttributes.getFloat(5, 8.0f);
        this.f12031t = obtainStyledAttributes.getFloat(4, 3.0f);
        int i11 = obtainStyledAttributes.getInt(2, 0);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 2;
            }
        }
        this.f12032u = i10;
        g();
        obtainStyledAttributes.recycle();
    }

    private float getCurrentDisplayedHeight() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight() * this.f12018g[4];
        }
        return g.f34069a;
    }

    private float getCurrentDisplayedWidth() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth() * this.f12018g[0];
        }
        return g.f34069a;
    }

    public final void b(int i10, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12018g[i10], f10);
        ofFloat.addUpdateListener(new d(this, i10));
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public final void d(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        float[] fArr2 = this.f12018g;
        matrix2.getValues(fArr2);
        float f10 = fArr[0] - fArr2[0];
        float f11 = fArr[4] - fArr2[4];
        float f12 = fArr[2] - fArr2[2];
        float f13 = fArr[5] - fArr2[5];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g.f34069a, 1.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new vr.b(this, matrix2, f12, f13, f10, f11));
        this.C.addListener(new c(this, matrix));
        this.C.setDuration(200);
        this.C.start();
    }

    public final void e() {
        if (this.f12030s) {
            float currentDisplayedWidth = getCurrentDisplayedWidth();
            float width = getWidth();
            RectF rectF = this.f12024m;
            if (currentDisplayedWidth > width) {
                if (rectF.left > g.f34069a) {
                    b(2, g.f34069a);
                } else if (rectF.right < getWidth()) {
                    b(2, (rectF.left + getWidth()) - rectF.right);
                }
            } else if (rectF.left < g.f34069a) {
                b(2, g.f34069a);
            } else if (rectF.right > getWidth()) {
                b(2, (rectF.left + getWidth()) - rectF.right);
            }
            if (getCurrentDisplayedHeight() > getHeight()) {
                if (rectF.top > g.f34069a) {
                    b(5, g.f34069a);
                    return;
                } else {
                    if (rectF.bottom < getHeight()) {
                        b(5, (rectF.top + getHeight()) - rectF.bottom);
                        return;
                    }
                    return;
                }
            }
            if (rectF.top < g.f34069a) {
                b(5, g.f34069a);
            } else if (rectF.bottom > getHeight()) {
                b(5, (rectF.top + getHeight()) - rectF.bottom);
            }
        }
    }

    public final void f() {
        if (this.f12029r) {
            d(this.f12017f);
        } else {
            setImageMatrix(this.f12017f);
        }
    }

    public final void g() {
        float f10 = this.f12020i;
        float f11 = this.f12021j;
        if (f10 < f11) {
            if (f10 >= g.f34069a) {
                if (f11 >= g.f34069a) {
                    if (this.f12031t > f11) {
                        this.f12031t = f11;
                    }
                    if (this.f12031t < f10) {
                        this.f12031t = f10;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("maxScale must be greater than 0");
            }
            throw new IllegalStateException("minScale must be greater than 0");
        }
        throw new IllegalStateException("minScale must be less than maxScale");
    }

    public boolean getAnimateOnReset() {
        return this.f12029r;
    }

    public boolean getAutoCenter() {
        return this.f12030s;
    }

    public int getAutoResetMode() {
        return this.f12032u;
    }

    public float getCurrentScaleFactor() {
        return this.f12036y;
    }

    public boolean getDoubleTapToZoom() {
        return this.f12027p;
    }

    public float getDoubleTapToZoomScaleFactor() {
        return this.f12031t;
    }

    public boolean getRestrictBounds() {
        return this.f12028q;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.f12034w;
        float f10 = this.f12018g[0];
        float f11 = scaleFactor / f10;
        this.f12035x = f11;
        float f12 = f11 * f10;
        float f13 = this.f12022k;
        if (f12 < f13) {
            this.f12035x = f13 / f10;
        } else {
            float f14 = this.f12023l;
            if (f12 > f14) {
                this.f12035x = f14 / f10;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f12034w = this.f12018g[0];
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f12035x = 1.0f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        float f10;
        float height;
        float f11;
        float width;
        float f12;
        if (!isClickable() && isEnabled() && (this.f12026o || this.f12025n)) {
            ImageView.ScaleType scaleType = getScaleType();
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
            if (scaleType != scaleType2) {
                super.setScaleType(scaleType2);
            }
            boolean z10 = false;
            if (this.f12019h == null) {
                this.f12019h = new float[9];
                Matrix matrix = new Matrix(getImageMatrix());
                this.f12017f = matrix;
                matrix.getValues(this.f12019h);
                float f13 = this.f12020i;
                float f14 = this.f12019h[0];
                this.f12022k = f13 * f14;
                this.f12023l = this.f12021j * f14;
            }
            this.A = motionEvent.getPointerCount();
            Matrix matrix2 = this.f12016e;
            matrix2.set(getImageMatrix());
            float[] fArr = this.f12018g;
            matrix2.getValues(fArr);
            Drawable drawable = getDrawable();
            RectF rectF = this.f12024m;
            if (drawable != null) {
                rectF.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
            }
            this.B.onTouchEvent(motionEvent);
            this.D.onTouchEvent(motionEvent);
            if (this.f12027p && this.E) {
                this.E = false;
                this.F = false;
                if (fArr[0] != this.f12019h[0]) {
                    f();
                } else {
                    Matrix matrix3 = new Matrix(matrix2);
                    float f15 = this.f12031t;
                    matrix3.postScale(f15, f15, this.B.getFocusX(), this.B.getFocusY());
                    d(matrix3);
                }
                return true;
            }
            if (!this.F) {
                int actionMasked = motionEvent.getActionMasked();
                PointF pointF = this.f12033v;
                if (actionMasked != 0 && this.A == this.f12037z) {
                    if (motionEvent.getActionMasked() == 2) {
                        float focusX = this.B.getFocusX();
                        float focusY = this.B.getFocusY();
                        if (this.f12025n && this.f12036y > 1.0f) {
                            float f16 = focusX - pointF.x;
                            if (this.f12028q) {
                                if (getCurrentDisplayedWidth() >= getWidth()) {
                                    float f17 = rectF.left;
                                    if (f17 <= g.f34069a && f17 + f16 > g.f34069a && !this.B.isInProgress()) {
                                        f16 = -rectF.left;
                                    } else if (rectF.right >= getWidth() && rectF.right + f16 < getWidth() && !this.B.isInProgress()) {
                                        width = getWidth();
                                        f12 = rectF.right;
                                        f16 = width - f12;
                                    }
                                } else if (!this.B.isInProgress()) {
                                    float f18 = rectF.left;
                                    if (f18 >= g.f34069a && f18 + f16 < g.f34069a) {
                                        f16 = -f18;
                                    } else if (rectF.right <= getWidth() && rectF.right + f16 > getWidth()) {
                                        width = getWidth();
                                        f12 = rectF.right;
                                        f16 = width - f12;
                                    }
                                }
                            }
                            float f19 = rectF.right;
                            if (f19 + f16 < g.f34069a) {
                                f16 = -f19;
                            } else if (rectF.left + f16 > getWidth()) {
                                f16 = getWidth() - rectF.left;
                            }
                            float f20 = focusY - pointF.y;
                            if (this.f12028q) {
                                if (getCurrentDisplayedHeight() >= getHeight()) {
                                    float f21 = rectF.top;
                                    if (f21 <= g.f34069a && f21 + f20 > g.f34069a && !this.B.isInProgress()) {
                                        f10 = rectF.top;
                                        f20 = -f10;
                                    } else if (rectF.bottom >= getHeight() && rectF.bottom + f20 < getHeight() && !this.B.isInProgress()) {
                                        height = getHeight();
                                        f11 = rectF.bottom;
                                        f20 = height - f11;
                                    }
                                } else if (!this.B.isInProgress()) {
                                    f10 = rectF.top;
                                    if (f10 < g.f34069a || f10 + f20 >= g.f34069a) {
                                        if (rectF.bottom <= getHeight() && rectF.bottom + f20 > getHeight()) {
                                            height = getHeight();
                                            f11 = rectF.bottom;
                                            f20 = height - f11;
                                        }
                                    }
                                    f20 = -f10;
                                }
                            }
                            float f22 = rectF.bottom;
                            if (f22 + f20 < g.f34069a) {
                                f20 = -f22;
                            } else if (rectF.top + f20 > getHeight()) {
                                f20 = getHeight() - rectF.top;
                            }
                            matrix2.postTranslate(f16, f20);
                        }
                        if (this.f12026o) {
                            float f23 = this.f12035x;
                            matrix2.postScale(f23, f23, focusX, focusY);
                            this.f12036y = fArr[0] / this.f12019h[0];
                        }
                        setImageMatrix(matrix2);
                        pointF.set(focusX, focusY);
                    }
                } else {
                    pointF.set(this.B.getFocusX(), this.B.getFocusY());
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.f12035x = 1.0f;
                    int i10 = this.f12032u;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    e();
                                }
                            } else {
                                f();
                            }
                        } else if (fArr[0] >= this.f12019h[0]) {
                            f();
                        } else {
                            e();
                        }
                    } else if (fArr[0] <= this.f12019h[0]) {
                        f();
                    } else {
                        e();
                    }
                }
            }
            ViewParent parent = getParent();
            if (this.A > 1 || this.f12036y > 1.0f || ((valueAnimator = this.C) != null && valueAnimator.isRunning())) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
            this.f12037z = this.A;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimateOnReset(boolean z10) {
        this.f12029r = z10;
    }

    public void setAutoCenter(boolean z10) {
        this.f12030s = z10;
    }

    public void setAutoResetMode(int i10) {
        this.f12032u = i10;
    }

    public void setDoubleTapToZoom(boolean z10) {
        this.f12027p = z10;
    }

    public void setDoubleTapToZoomScaleFactor(float f10) {
        this.f12031t = f10;
        g();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            setScaleType(this.f12015d);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.f12015d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.f12015d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        setScaleType(this.f12015d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.f12015d);
    }

    public void setRestrictBounds(boolean z10) {
        this.f12028q = z10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.f12015d = scaleType;
            this.f12019h = null;
        }
    }

    public void setTranslatable(boolean z10) {
        this.f12025n = z10;
    }

    public void setZoomable(boolean z10) {
        this.f12026o = z10;
    }
}
