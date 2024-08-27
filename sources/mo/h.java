package mo;

import android.view.SubMenu;
import l.i0;

/* loaded from: classes2.dex */
public final class h extends l.o {
    @Override // l.o, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        l.q a10 = a(i10, i11, i12, charSequence);
        i0 i0Var = new i0(this.f23636a, this, a10);
        a10.f23677o = i0Var;
        i0Var.setHeaderTitle(a10.f23667e);
        return i0Var;
    }
}
