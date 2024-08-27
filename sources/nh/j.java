package nh;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public float f28710a;

    /* renamed from: b, reason: collision with root package name */
    public float f28711b;

    /* renamed from: c, reason: collision with root package name */
    public float f28712c;

    /* renamed from: d, reason: collision with root package name */
    public float f28713d;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                view.animate().x(Math.min(Math.max(s0.g.f34069a, motionEvent.getRawX() + this.f28712c), view.getRootView().getWidth() - view.getWidth())).y(Math.min(Math.max(s0.g.f34069a, motionEvent.getRawY() + this.f28713d), view.getRootView().getHeight() - view.getHeight())).setDuration(0L).start();
                return true;
            }
            float rawX = motionEvent.getRawX() - this.f28710a;
            float rawY = motionEvent.getRawY() - this.f28711b;
            if (Math.abs(rawX) >= 10.0f || Math.abs(rawY) >= 10.0f) {
                return true;
            }
            return view.performClick();
        }
        this.f28710a = motionEvent.getRawX();
        this.f28711b = motionEvent.getRawY();
        this.f28712c = view.getX() - this.f28710a;
        this.f28713d = view.getY() - this.f28711b;
        return true;
    }
}
