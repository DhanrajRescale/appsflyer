package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class q implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1814a;

    public q(t tVar) {
        this.f1814a = tVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        t tVar = this.f1814a;
        dialog = tVar.mDialog;
        if (dialog != null) {
            dialog2 = tVar.mDialog;
            tVar.onDismiss(dialog2);
        }
    }
}
