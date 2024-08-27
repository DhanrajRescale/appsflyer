package o5;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import j5.c0;
import j5.d0;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(i iVar, d0 d0Var) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        c0 c0Var = d0Var.f20976a;
        c0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c0Var.f20974a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = iVar.f29626b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
