package i5;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;

/* loaded from: classes.dex */
public abstract class b0 {
    public static j5.d0 a(Context context, g0 g0Var, boolean z10) {
        PlaybackSession createPlaybackSession;
        j5.a0 a0Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager c10 = j5.z.c(context.getSystemService("media_metrics"));
        if (c10 != null) {
            createPlaybackSession = c10.createPlaybackSession();
            a0Var = new j5.a0(context, createPlaybackSession);
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            e5.m.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new j5.d0(logSessionId);
        }
        if (z10) {
            g0Var.getClass();
            j5.w wVar = (j5.w) g0Var.f19472r;
            wVar.getClass();
            wVar.f21016f.a(a0Var);
        }
        sessionId = a0Var.f20939c.getSessionId();
        return new j5.d0(sessionId);
    }
}
