package mo;

import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class f0 {
    public static /* bridge */ /* synthetic */ Rect a(WindowMetrics windowMetrics) {
        return windowMetrics.getBounds();
    }

    public static /* bridge */ /* synthetic */ WindowMetrics b(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics();
    }
}
