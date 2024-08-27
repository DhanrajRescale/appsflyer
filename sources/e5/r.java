package e5;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class r implements b {
    public final t a(Looper looper, Handler.Callback callback) {
        return new t(new Handler(looper, callback));
    }
}
