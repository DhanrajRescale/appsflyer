package qs;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import in.juspay.hypersdk.analytics.LogConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f32171a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32172b;

    public i(us.f youTubePlayerOwner) {
        Intrinsics.checkNotNullParameter(youTubePlayerOwner, "youTubePlayerOwner");
        this.f32171a = youTubePlayerOwner;
        this.f32172b = new Handler(Looper.getMainLooper());
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f32172b.post(new g(this, 1));
    }

    @JavascriptInterface
    public final void sendError(@NotNull String error) {
        c cVar;
        Intrinsics.checkNotNullParameter(error, "error");
        if (s.j(error, "2", true)) {
            cVar = c.f32153b;
        } else if (s.j(error, "5", true)) {
            cVar = c.f32154c;
        } else if (s.j(error, "100", true)) {
            cVar = c.f32155d;
        } else {
            boolean j10 = s.j(error, "101", true);
            c cVar2 = c.f32156e;
            if (j10 || s.j(error, "150", true)) {
                cVar = cVar2;
            } else {
                cVar = c.f32152a;
            }
        }
        this.f32172b.post(new yk.h(27, this, cVar));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@NotNull String quality) {
        a aVar;
        Intrinsics.checkNotNullParameter(quality, "quality");
        if (s.j(quality, "small", true)) {
            aVar = a.f32137b;
        } else if (s.j(quality, "medium", true)) {
            aVar = a.f32138c;
        } else if (s.j(quality, "large", true)) {
            aVar = a.f32139d;
        } else if (s.j(quality, "hd720", true)) {
            aVar = a.f32140e;
        } else if (s.j(quality, "hd1080", true)) {
            aVar = a.f32141f;
        } else if (s.j(quality, "highres", true)) {
            aVar = a.f32142g;
        } else if (s.j(quality, LogConstants.DEFAULT_CHANNEL, true)) {
            aVar = a.f32143h;
        } else {
            aVar = a.f32136a;
        }
        this.f32172b.post(new yk.h(23, this, aVar));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@NotNull String rate) {
        b bVar;
        Intrinsics.checkNotNullParameter(rate, "rate");
        if (s.j(rate, "0.25", true)) {
            bVar = b.f32146b;
        } else if (s.j(rate, "0.5", true)) {
            bVar = b.f32147c;
        } else if (s.j(rate, "1", true)) {
            bVar = b.f32148d;
        } else if (s.j(rate, "1.5", true)) {
            bVar = b.f32149e;
        } else if (s.j(rate, "2", true)) {
            bVar = b.f32150f;
        } else {
            bVar = b.f32145a;
        }
        this.f32172b.post(new yk.h(25, this, bVar));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f32172b.post(new g(this, 0));
    }

    @JavascriptInterface
    public final void sendStateChange(@NotNull String state) {
        d dVar;
        Intrinsics.checkNotNullParameter(state, "state");
        if (s.j(state, "UNSTARTED", true)) {
            dVar = d.f32159b;
        } else if (s.j(state, "ENDED", true)) {
            dVar = d.f32160c;
        } else if (s.j(state, "PLAYING", true)) {
            dVar = d.f32161d;
        } else if (s.j(state, "PAUSED", true)) {
            dVar = d.f32162e;
        } else if (s.j(state, "BUFFERING", true)) {
            dVar = d.f32163f;
        } else if (s.j(state, "CUED", true)) {
            dVar = d.f32164g;
        } else {
            dVar = d.f32158a;
        }
        this.f32172b.post(new yk.h(26, this, dVar));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            this.f32172b.post(new f(this, Float.parseFloat(seconds), 1));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = "0";
            }
            this.f32172b.post(new f(this, Float.parseFloat(seconds), 2));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(@NotNull String videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        return this.f32172b.post(new yk.h(24, this, videoId));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@NotNull String fraction) {
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        try {
            this.f32172b.post(new f(this, Float.parseFloat(fraction), 0));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f32172b.post(new g(this, 2));
    }
}
