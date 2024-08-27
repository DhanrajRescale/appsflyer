package p2;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
public class s extends r {
    @Override // p2.r
    public final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnection = this.f30605b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f30605b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
