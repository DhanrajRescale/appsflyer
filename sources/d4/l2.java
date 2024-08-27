package d4;

import android.app.ApplicationExitInfo;
import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l2 {
    public static /* bridge */ /* synthetic */ int b() {
        return WindowInsets.Type.statusBars();
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo f(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ int s() {
        return WindowInsets.Type.navigationBars();
    }

    public static /* bridge */ /* synthetic */ Insets t(WindowInsets windowInsets, int i10) {
        return windowInsets.getInsets(i10);
    }
}
