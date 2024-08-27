package ao;

import android.app.Dialog;
import android.os.Bundle;
import h.h0;

/* loaded from: classes2.dex */
public class g extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2671a = 0;

    @Override // androidx.fragment.app.t
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof f) {
            boolean z10 = ((f) dialog).i().I;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.t
    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof f) {
            boolean z10 = ((f) dialog).i().I;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // h.h0, androidx.fragment.app.t
    public Dialog onCreateDialog(Bundle bundle) {
        return new f(getContext(), getTheme());
    }

    public final void q() {
        super.dismiss();
    }
}
