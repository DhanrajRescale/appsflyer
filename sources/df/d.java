package df;

import android.view.View;
import androidx.lifecycle.v;
import ba.od;
import com.assetgro.stockgro.ui.drawer.tutorials.TutorialItemViewModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: x, reason: collision with root package name */
    public YouTubePlayerView f14325x;

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new TutorialItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        TutorialItemViewModel tutorialItemViewModel = (TutorialItemViewModel) v();
        tutorialItemViewModel.f9513g.observe(this, new re.d(8, new c(this, 0)));
        TutorialItemViewModel tutorialItemViewModel2 = (TutorialItemViewModel) v();
        tutorialItemViewModel2.f9514h.observe(this, new re.d(8, new c(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        YouTubePlayerView youtubePlayer = ((od) this.f17291u).f5655t;
        Intrinsics.checkNotNullExpressionValue(youtubePlayer, "youtubePlayer");
        Intrinsics.checkNotNullParameter(youtubePlayer, "<set-?>");
        this.f14325x = youtubePlayer;
    }
}
