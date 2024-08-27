package g5;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th2) {
        if ((th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
