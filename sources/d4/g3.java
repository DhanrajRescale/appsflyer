package d4;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class g3 extends f3 {
    @Override // ni.j
    public final void p(boolean z10) {
        Window window = this.f13732b;
        if (z10) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
