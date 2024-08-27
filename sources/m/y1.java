package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f25801b;

    public /* synthetic */ y1(z1 z1Var, int i10) {
        this.f25800a = i10;
        this.f25801b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25800a;
        z1 z1Var = this.f25801b;
        switch (i10) {
            case 0:
                ViewParent parent = z1Var.f25828d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                z1Var.a();
                View view = z1Var.f25828d;
                if (view.isEnabled() && !view.isLongClickable() && z1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, s0.g.f34069a, s0.g.f34069a, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    z1Var.f25831g = true;
                    return;
                }
                return;
        }
    }
}
