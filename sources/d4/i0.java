package d4;

import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public abstract class i0 {
    public static boolean a(ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    public static void b(ScaleGestureDetector scaleGestureDetector, boolean z10) {
        scaleGestureDetector.setQuickScaleEnabled(z10);
    }
}
