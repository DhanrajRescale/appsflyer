package us;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends rs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f37384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37385c;

    public j(String str, YouTubePlayerView youTubePlayerView, boolean z10) {
        this.f37383a = str;
        this.f37384b = youTubePlayerView;
        this.f37385c = z10;
    }

    @Override // rs.a
    public final void c(qs.e youTubePlayer) {
        boolean z10;
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        String videoId = this.f37383a;
        if (videoId != null) {
            if (this.f37384b.f12118b.getCanPlay$core_release() && this.f37385c) {
                z10 = true;
            } else {
                z10 = false;
            }
            Intrinsics.checkNotNullParameter(youTubePlayer, "<this>");
            Intrinsics.checkNotNullParameter(videoId, "videoId");
            if (z10) {
                ((g) youTubePlayer).b(s0.g.f34069a, videoId);
            } else {
                g gVar = (g) youTubePlayer;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(videoId, "videoId");
                gVar.a(gVar.f37378a, "cueVideo", videoId, Float.valueOf(s0.g.f34069a));
            }
        }
        g gVar2 = (g) youTubePlayer;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar2.f37380c.remove(this);
    }
}
