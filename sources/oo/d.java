package oo;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Arrays;
import mo.c0;

/* loaded from: classes2.dex */
public abstract class d extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final e f30155a;

    /* renamed from: b, reason: collision with root package name */
    public int f30156b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30157c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30158d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30159e;

    /* renamed from: f, reason: collision with root package name */
    public a f30160f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30161g;

    /* renamed from: h, reason: collision with root package name */
    public int f30162h;

    /* renamed from: i, reason: collision with root package name */
    public final b f30163i;

    /* renamed from: j, reason: collision with root package name */
    public final b f30164j;

    /* renamed from: k, reason: collision with root package name */
    public final c f30165k;

    /* renamed from: l, reason: collision with root package name */
    public final c f30166l;

    /* JADX WARN: Type inference failed for: r9v4, types: [oo.a, java.lang.Object] */
    public d(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(ap.a.a(context, attributeSet, i10, 2132083954), attributeSet, i10);
        this.f30161g = false;
        this.f30162h = 4;
        this.f30163i = new b(this, 0);
        this.f30164j = new b(this, 1);
        this.f30165k = new c(this, 0);
        this.f30166l = new c(this, 1);
        Context context2 = getContext();
        this.f30155a = a(context2, attributeSet);
        TypedArray f10 = c0.f(context2, attributeSet, un.a.f37293d, i10, i11, new int[0]);
        f10.getInt(5, -1);
        this.f30159e = Math.min(f10.getInt(3, -1), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        f10.recycle();
        this.f30160f = new Object();
        this.f30158d = true;
    }

    private n getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f30217l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f30197l;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public void b(int i10, boolean z10) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f30156b = i10;
                this.f30157c = z10;
                this.f30161g = true;
                if (getIndeterminateDrawable().isVisible()) {
                    a aVar = this.f30160f;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != s0.g.f34069a) {
                        getIndeterminateDrawable().f30218m.m();
                        return;
                    }
                }
                this.f30165k.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i10);
        if (getProgressDrawable() != null && !z10) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = d4.n1.f13788a
            boolean r0 = d4.y0.b(r2)
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.d.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f30155a.f30172f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f30155a.f30169c;
    }

    public int getShowAnimationBehavior() {
        return this.f30155a.f30171e;
    }

    public int getTrackColor() {
        return this.f30155a.f30170d;
    }

    public int getTrackCornerRadius() {
        return this.f30155a.f30168b;
    }

    public int getTrackThickness() {
        return this.f30155a.f30167a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f30218m.l(this.f30165k);
        }
        k progressDrawable = getProgressDrawable();
        c cVar = this.f30166l;
        if (progressDrawable != null) {
            k progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f30210f == null) {
                progressDrawable2.f30210f = new ArrayList();
            }
            if (!progressDrawable2.f30210f.contains(cVar)) {
                progressDrawable2.f30210f.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            o indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f30210f == null) {
                indeterminateDrawable.f30210f = new ArrayList();
            }
            if (!indeterminateDrawable.f30210f.contains(cVar)) {
                indeterminateDrawable.f30210f.add(cVar);
            }
        }
        if (c()) {
            if (this.f30159e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f30164j);
        removeCallbacks(this.f30163i);
        ((m) getCurrentDrawable()).e(false, false, false);
        o indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f30166l;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(cVar);
            getIndeterminateDrawable().f30218m.o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        int e10;
        int d10;
        try {
            n currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.e() < 0) {
                e10 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
            } else {
                e10 = currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.d() < 0) {
                d10 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
            } else {
                d10 = currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(e10, d10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30158d) {
            ((m) getCurrentDrawable()).e(c(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f30158d) {
            ((m) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull a aVar) {
        this.f30160f = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f30207c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f30207c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f30155a.f30172f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            m mVar = (m) getCurrentDrawable();
            if (mVar != null) {
                mVar.e(false, false, false);
            }
            super.setIndeterminate(z10);
            m mVar2 = (m) getCurrentDrawable();
            if (mVar2 != null) {
                mVar2.e(c(), false, false);
            }
            if ((mVar2 instanceof o) && c()) {
                ((o) mVar2).f30218m.n();
            }
            this.f30161g = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof o) {
                ((m) drawable).e(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{pn.e.i(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f30155a.f30169c = iArr;
            getIndeterminateDrawable().f30218m.i();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        b(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof k) {
                k kVar = (k) drawable;
                kVar.e(false, false, false);
                super.setProgressDrawable(kVar);
                kVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f30155a.f30171e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        e eVar = this.f30155a;
        if (eVar.f30170d != i10) {
            eVar.f30170d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        e eVar = this.f30155a;
        if (eVar.f30168b != i10) {
            eVar.f30168b = Math.min(i10, eVar.f30167a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        e eVar = this.f30155a;
        if (eVar.f30167a != i10) {
            eVar.f30167a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f30162h = i10;
    }

    @Override // android.widget.ProgressBar
    public o getIndeterminateDrawable() {
        return (o) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public k getProgressDrawable() {
        return (k) super.getProgressDrawable();
    }
}
