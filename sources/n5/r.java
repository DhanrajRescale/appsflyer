package n5;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return e5.x.p(e5.x.q(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
