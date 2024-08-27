package k7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f22359a;

    public g0(k0 k0Var) {
        this.f22359a = k0Var;
    }

    @Override // k7.m1
    public final void a(MotionEvent motionEvent) {
        k0 k0Var = this.f22359a;
        ((GestureDetector) ((hr.c) ((d4.n) k0Var.f22461y.f14641b)).f18690b).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = k0Var.f22456t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (k0Var.f22448l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(k0Var.f22448l);
        if (findPointerIndex >= 0) {
            k0Var.l(actionMasked, findPointerIndex, motionEvent);
        }
        y1 y1Var = k0Var.f22439c;
        if (y1Var == null) {
            return;
        }
        int i10 = 0;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == k0Var.f22448l) {
                            if (actionIndex == 0) {
                                i10 = 1;
                            }
                            k0Var.f22448l = motionEvent.getPointerId(i10);
                            k0Var.u(k0Var.f22451o, actionIndex, motionEvent);
                            return;
                        }
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = k0Var.f22456t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            } else {
                if (findPointerIndex >= 0) {
                    k0Var.u(k0Var.f22451o, findPointerIndex, motionEvent);
                    k0Var.r(y1Var);
                    RecyclerView recyclerView = k0Var.f22454r;
                    x xVar = k0Var.f22455s;
                    recyclerView.removeCallbacks(xVar);
                    xVar.run();
                    k0Var.f22454r.invalidate();
                    return;
                }
                return;
            }
        }
        k0Var.t(null, 0);
        k0Var.f22448l = -1;
    }

    @Override // k7.m1
    public final boolean d(MotionEvent motionEvent) {
        int findPointerIndex;
        k0 k0Var = this.f22359a;
        ((GestureDetector) ((hr.c) ((d4.n) k0Var.f22461y.f14641b)).f18690b).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        h0 h0Var = null;
        if (actionMasked == 0) {
            k0Var.f22448l = motionEvent.getPointerId(0);
            k0Var.f22440d = motionEvent.getX();
            k0Var.f22441e = motionEvent.getY();
            VelocityTracker velocityTracker = k0Var.f22456t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            k0Var.f22456t = VelocityTracker.obtain();
            if (k0Var.f22439c == null) {
                ArrayList arrayList = k0Var.f22452p;
                if (!arrayList.isEmpty()) {
                    View o10 = k0Var.o(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        h0 h0Var2 = (h0) arrayList.get(size);
                        if (h0Var2.f22380e.f22629a == o10) {
                            h0Var = h0Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (h0Var != null) {
                    k0Var.f22440d -= h0Var.f22384i;
                    k0Var.f22441e -= h0Var.f22385j;
                    y1 y1Var = h0Var.f22380e;
                    k0Var.n(y1Var, true);
                    if (k0Var.f22437a.remove(y1Var.f22629a)) {
                        k0Var.f22449m.getClass();
                        i0.a(y1Var);
                    }
                    k0Var.t(y1Var, h0Var.f22381f);
                    k0Var.u(k0Var.f22451o, 0, motionEvent);
                }
            }
        } else if (actionMasked != 3 && actionMasked != 1) {
            int i10 = k0Var.f22448l;
            if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                k0Var.l(actionMasked, findPointerIndex, motionEvent);
            }
        } else {
            k0Var.f22448l = -1;
            k0Var.t(null, 0);
        }
        VelocityTracker velocityTracker2 = k0Var.f22456t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (k0Var.f22439c != null) {
            return true;
        }
        return false;
    }

    @Override // k7.m1
    public final void e(boolean z10) {
        if (!z10) {
            return;
        }
        this.f22359a.t(null, 0);
    }
}
