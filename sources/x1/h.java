package x1;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f39854a = new Object();

    public final long a(@NotNull MotionEvent motionEvent, int i10) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i10);
        rawY = motionEvent.getRawY(i10);
        return t0.t.g(rawX, rawY);
    }
}
