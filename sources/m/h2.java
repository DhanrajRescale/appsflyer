package m;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25537b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.f25536a = i10;
        this.f25537b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        i2 i2Var;
        e0 e0Var;
        int i10 = this.f25536a;
        Object obj = this.f25537b;
        switch (i10) {
            case 0:
                int action = event.getAction();
                int x10 = (int) event.getX();
                int y10 = (int) event.getY();
                if (action == 0 && (e0Var = (i2Var = (i2) obj).f25583z) != null && e0Var.isShowing() && x10 >= 0 && x10 < i2Var.f25583z.getWidth() && y10 >= 0 && y10 < i2Var.f25583z.getHeight()) {
                    i2Var.f25579v.postDelayed(i2Var.f25575r, 250L);
                    return false;
                }
                if (action == 1) {
                    i2 i2Var2 = (i2) obj;
                    i2Var2.f25579v.removeCallbacks(i2Var2.f25575r);
                    return false;
                }
                return false;
            default:
                w wVar = (w) obj;
                ((GestureDetector) ((hr.c) ((d4.n) ((e.l) wVar.f25762c).f14641b)).f18690b).onTouchEvent(event);
                ((ScaleGestureDetector) wVar.f25763d).onTouchEvent(event);
                Intrinsics.b(event, "event");
                if (event.getAction() == 1) {
                    ws.c cVar = (ws.c) ((ws.a) wVar.f25765f);
                    cVar.f39417a.b();
                    cVar.f39418b.b();
                }
            case 1:
                return true;
        }
    }
}
