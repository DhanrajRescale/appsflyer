package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import androidx.annotation.Keep;
import s0.g;

@Keep
/* loaded from: classes2.dex */
public class SwypeScroll extends ScrollView {
    private float lastX;
    private float lastY;
    private float xDistance;
    private float yDistance;

    public SwypeScroll(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yDistance = g.f34069a;
            this.xDistance = g.f34069a;
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
        } else if (action == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.xDistance = Math.abs(x10 - this.lastX) + this.xDistance;
            float abs = Math.abs(y10 - this.lastY) + this.yDistance;
            this.yDistance = abs;
            this.lastX = x10;
            this.lastY = y10;
            if (this.xDistance > abs) {
                return false;
            }
            SwypeLayout swypeLayout = SwypeLayout.partialSwype;
            if (swypeLayout != null && swypeLayout != SwypeLayout.activeLayout) {
                swypeLayout.reset();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
