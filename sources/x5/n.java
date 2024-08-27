package x5;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(Surface surface, float f10) {
        int i10;
        if (f10 == s0.g.f34069a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f10, i10);
        } catch (IllegalStateException e10) {
            e5.m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
