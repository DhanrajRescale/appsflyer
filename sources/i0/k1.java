package i0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class k1 implements h1 {
    @Override // i0.h1
    public final g1 b(KeyEvent keyEvent) {
        g1 g1Var = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long a10 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
            if (v1.a.a(a10, y1.f19264i)) {
                g1Var = g1.SELECT_LINE_LEFT;
            } else if (v1.a.a(a10, y1.f19265j)) {
                g1Var = g1.SELECT_LINE_RIGHT;
            } else if (v1.a.a(a10, y1.f19266k)) {
                g1Var = g1.SELECT_HOME;
            } else if (v1.a.a(a10, y1.f19267l)) {
                g1Var = g1.SELECT_END;
            }
        } else if (keyEvent.isAltPressed()) {
            long a11 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
            if (v1.a.a(a11, y1.f19264i)) {
                g1Var = g1.LINE_LEFT;
            } else if (v1.a.a(a11, y1.f19265j)) {
                g1Var = g1.LINE_RIGHT;
            } else if (v1.a.a(a11, y1.f19266k)) {
                g1Var = g1.HOME;
            } else if (v1.a.a(a11, y1.f19267l)) {
                g1Var = g1.END;
            }
        }
        if (g1Var == null) {
            return j1.f18997a.b(keyEvent);
        }
        return g1Var;
    }
}
