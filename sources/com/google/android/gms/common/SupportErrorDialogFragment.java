package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.d1;
import androidx.fragment.app.t;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends t {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    private Dialog zac;

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.t, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.t
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.zac == null) {
                this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
            }
            return this.zac;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.t
    public void show(@NonNull d1 d1Var, String str) {
        super.show(d1Var, str);
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}
