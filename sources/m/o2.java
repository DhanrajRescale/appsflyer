package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o2 extends i2 implements j2 {
    public static final Method D;
    public j2 C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.j2
    public final void B(l.o oVar, l.q qVar) {
        j2 j2Var = this.C;
        if (j2Var != null) {
            j2Var.B(oVar, qVar);
        }
    }

    @Override // m.j2
    public final void m(l.o oVar, MenuItem menuItem) {
        j2 j2Var = this.C;
        if (j2Var != null) {
            j2Var.m(oVar, menuItem);
        }
    }

    @Override // m.i2
    public final w1 p(Context context, boolean z10) {
        n2 n2Var = new n2(context, z10);
        n2Var.setHoverListener(this);
        return n2Var;
    }
}
