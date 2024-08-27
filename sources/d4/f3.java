package d4;

import android.view.View;
import android.view.Window;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes.dex */
public class f3 extends e3 {
    @Override // ni.j
    public final boolean o() {
        if ((this.f13732b.getDecorView().getSystemUiVisibility() & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            return true;
        }
        return false;
    }

    @Override // ni.j
    public final void q(boolean z10) {
        Window window = this.f13732b;
        if (z10) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | UserMetadata.MAX_INTERNAL_KEY_SIZE);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
