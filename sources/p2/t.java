package p2;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class t extends s {
    @Override // p2.r, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean commitContent;
        InputConnection inputConnection = this.f30605b;
        if (inputConnection != null) {
            commitContent = inputConnection.commitContent(inputContentInfo, i10, bundle);
            return commitContent;
        }
        return false;
    }
}
