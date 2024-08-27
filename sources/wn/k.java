package wn;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class k extends m {

    /* renamed from: c, reason: collision with root package name */
    public z3.a f39335c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f39336d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39337e;

    /* renamed from: f, reason: collision with root package name */
    public int f39338f;

    /* renamed from: g, reason: collision with root package name */
    public int f39339g;

    /* renamed from: h, reason: collision with root package name */
    public int f39340h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f39341i;

    @Override // o3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        int findPointerIndex;
        if (this.f39340h < 0) {
            this.f39340h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f39337e) {
            int i10 = this.f39338f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f39339g) > this.f39340h) {
                this.f39339g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f39338f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f11101n;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.p(view, x10, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39337e = z10;
            if (z10) {
                this.f39339g = y11;
                this.f39338f = motionEvent.getPointerId(0);
                if (this.f39341i == null) {
                    this.f39341i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f39336d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f39336d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f39341i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    @Override // o3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.k.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public final void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        v(coordinatorLayout, view, i10, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
