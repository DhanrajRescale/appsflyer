package n5;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import j5.c0;
import j5.d0;

/* loaded from: classes.dex */
public abstract class z {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, d0 d0Var) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        c0 c0Var = d0Var.f20976a;
        c0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c0Var.f20974a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            k5.t.c(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
