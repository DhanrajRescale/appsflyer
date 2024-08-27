package h;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class h0 extends androidx.fragment.app.t {
    @Override // androidx.fragment.app.t
    public Dialog onCreateDialog(Bundle bundle) {
        return new g0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.t
    public final void setupDialog(Dialog dialog, int i10) {
        if (dialog instanceof g0) {
            g0 g0Var = (g0) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            g0Var.e().g(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }
}
