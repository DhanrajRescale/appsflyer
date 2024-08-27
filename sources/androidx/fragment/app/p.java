package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1796a;

    public p(t tVar) {
        this.f1796a = tVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        t tVar = this.f1796a;
        dialog = tVar.mDialog;
        if (dialog != null) {
            dialog2 = tVar.mDialog;
            tVar.onCancel(dialog2);
        }
    }
}
