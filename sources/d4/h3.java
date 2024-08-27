package d4;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes.dex */
public final class h3 extends ni.j {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f13750b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f13751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Window window) {
        super(3);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f13750b = insetsController;
        this.f13751c = window;
    }

    @Override // ni.j
    public final boolean o() {
        int systemBarsAppearance;
        systemBarsAppearance = this.f13750b.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // ni.j
    public final void p(boolean z10) {
        Window window = this.f13751c;
        WindowInsetsController windowInsetsController = this.f13750b;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // ni.j
    public final void q(boolean z10) {
        Window window = this.f13751c;
        WindowInsetsController windowInsetsController = this.f13750b;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
