package df;

import androidx.lifecycle.v;
import ba.od;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f14324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f14323a = i10;
        this.f14324b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f14323a;
        d dVar = this.f14324b;
        switch (i10) {
            case 0:
                ((od) dVar.f17291u).f5654s.setText(str);
                return;
            default:
                Intrinsics.c(str);
                v u10 = dVar.u();
                YouTubePlayerView youTubePlayerView = dVar.f14325x;
                if (youTubePlayerView != null) {
                    u10.a(youTubePlayerView);
                    YouTubePlayerView youTubePlayerView2 = dVar.f14325x;
                    if (youTubePlayerView2 != null) {
                        us.a youTubePlayerListener = new us.a(str, 2);
                        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
                        youTubePlayerView2.f12118b.getWebViewYouTubePlayer$core_release().a(youTubePlayerListener);
                        return;
                    }
                    Intrinsics.k("youTubePlayerView");
                    throw null;
                }
                Intrinsics.k("youTubePlayerView");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14323a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
