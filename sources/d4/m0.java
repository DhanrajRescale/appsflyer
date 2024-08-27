package d4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m0 extends k0 {

    /* renamed from: d, reason: collision with root package name */
    public View f13779d;

    /* JADX WARN: Type inference failed for: r4v0, types: [d4.l0] */
    @Override // d4.k0, x2.c
    public final void q() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f13779d;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: d4.l0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    boolean z10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i10 & 8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    atomicBoolean2.set(z10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.q();
    }

    @Override // d4.k0, x2.c
    public final void s() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f13779d;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        } else {
            super.s();
        }
    }
}
