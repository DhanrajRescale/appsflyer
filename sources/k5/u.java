package k5;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class u {
    public static void a(AudioTrack audioTrack, j5.d0 d0Var) {
        LogSessionId logSessionId;
        boolean equals;
        j5.c0 c0Var = d0Var.f20976a;
        c0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c0Var.f20974a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
