package androidx.fragment.app;

import android.app.Dialog;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class r implements androidx.lifecycle.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1819a;

    public r(t tVar) {
        this.f1819a = tVar;
    }

    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        boolean z10;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((androidx.lifecycle.t) obj) != null) {
            t tVar = this.f1819a;
            z10 = tVar.mShowsDialog;
            if (z10) {
                View requireView = tVar.requireView();
                if (requireView.getParent() == null) {
                    dialog = tVar.mDialog;
                    if (dialog != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            StringBuilder sb2 = new StringBuilder("DialogFragment ");
                            sb2.append(this);
                            sb2.append(" setting the content view on ");
                            dialog3 = tVar.mDialog;
                            sb2.append(dialog3);
                            Log.d("FragmentManager", sb2.toString());
                        }
                        dialog2 = tVar.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
