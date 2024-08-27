package d4;

import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class e2 {
    public static void a(@NonNull Window window, boolean z10) {
        int i10;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility & (-1793);
        } else {
            i10 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i10);
    }
}
