package wk;

import android.text.InputFilter;
import com.chaos.view.PinView;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinView f39144b;

    public b(PinView pinView) {
        this.f39144b = pinView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (this.f39143a) {
            return;
        }
        PinView pinView = this.f39144b;
        pinView.removeCallbacks(this);
        InputFilter[] inputFilterArr = PinView.H;
        if (pinView.isCursorVisible() && pinView.isFocused()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pinView.f(!pinView.A);
            pinView.postDelayed(this, 500L);
        }
    }
}
