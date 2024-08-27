package k7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22428a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f22429b;

    public j0(k0 k0Var) {
        this.f22429b = k0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        k0 k0Var;
        View o10;
        y1 M;
        if (this.f22428a && (o10 = (k0Var = this.f22429b).o(motionEvent)) != null && (M = k0Var.f22454r.M(o10)) != null) {
            i0 i0Var = k0Var.f22449m;
            RecyclerView recyclerView = k0Var.f22454r;
            i0Var.d(recyclerView, M);
            WeakHashMap weakHashMap = d4.n1.f13788a;
            if ((i0Var.b(3084, d4.w0.d(recyclerView)) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = k0Var.f22448l;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    k0Var.f22440d = x10;
                    k0Var.f22441e = y10;
                    k0Var.f22445i = s0.g.f34069a;
                    k0Var.f22444h = s0.g.f34069a;
                    k0Var.f22449m.getClass();
                    k0Var.t(M, 2);
                }
            }
        }
    }
}
