package x5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import e5.x;

/* loaded from: classes.dex */
public final class q implements o, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f40034a;

    /* renamed from: b, reason: collision with root package name */
    public b3.t f40035b;

    public q(DisplayManager displayManager) {
        this.f40034a = displayManager;
    }

    @Override // x5.o
    public final void a(b3.t tVar) {
        this.f40035b = tVar;
        Handler l10 = x.l(null);
        DisplayManager displayManager = this.f40034a;
        displayManager.registerDisplayListener(this, l10);
        tVar.l(displayManager.getDisplay(0));
    }

    @Override // x5.o
    public final void b() {
        this.f40034a.unregisterDisplayListener(this);
        this.f40035b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        b3.t tVar = this.f40035b;
        if (tVar != null && i10 == 0) {
            tVar.l(this.f40034a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
