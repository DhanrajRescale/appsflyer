package in.juspay.hypersdk.mystique;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes2.dex */
public class SecureActionCallback implements ActionMode.Callback {
    private boolean disableCopy;
    private boolean disableCut;
    private boolean disablePaste;
    private boolean disableShare;

    public SecureActionCallback(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.disableCopy = z10;
        this.disableCut = z11;
        this.disableShare = z12;
        this.disablePaste = z13;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.disableCopy) {
            menu.removeItem(R.id.copy);
        }
        if (this.disableCut) {
            menu.removeItem(R.id.cut);
        }
        if (this.disableShare) {
            menu.removeItem(R.id.shareText);
        }
        if (!this.disablePaste) {
            return true;
        }
        menu.removeItem(R.id.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.disableCopy) {
            menu.removeItem(R.id.copy);
        }
        if (this.disableCut) {
            menu.removeItem(R.id.cut);
        }
        if (this.disableShare) {
            menu.removeItem(R.id.shareText);
        }
        if (!this.disablePaste) {
            return true;
        }
        menu.removeItem(R.id.paste);
        return true;
    }
}
