package us;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements rs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f37382a;

    public i(YouTubePlayerView youTubePlayerView) {
        this.f37382a = youTubePlayerView;
    }

    @Override // rs.b
    public final void a(View fullscreenView, hj.b exitFullscreen) {
        Intrinsics.checkNotNullParameter(fullscreenView, "fullscreenView");
        Intrinsics.checkNotNullParameter(exitFullscreen, "exitFullscreen");
        YouTubePlayerView youTubePlayerView = this.f37382a;
        if (!youTubePlayerView.f12117a.isEmpty()) {
            Iterator it = youTubePlayerView.f12117a.iterator();
            while (it.hasNext()) {
                ((rs.b) it.next()).a(fullscreenView, exitFullscreen);
            }
            return;
        }
        throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
    }

    @Override // rs.b
    public final void b() {
        YouTubePlayerView youTubePlayerView = this.f37382a;
        if (!youTubePlayerView.f12117a.isEmpty()) {
            Iterator it = youTubePlayerView.f12117a.iterator();
            while (it.hasNext()) {
                ((rs.b) it.next()).b();
            }
            return;
        }
        throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
    }
}
