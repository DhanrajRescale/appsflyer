package gi;

import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenActivity;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenViewModel;
import kotlin.jvm.internal.Intrinsics;
import qs.e;
import s0.g;

/* loaded from: classes.dex */
public final class b extends rs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YoutubeVideoFullScreenActivity f17437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f17439c;

    public b(YoutubeVideoFullScreenActivity youtubeVideoFullScreenActivity, String str, float f10) {
        this.f17437a = youtubeVideoFullScreenActivity;
        this.f17438b = str;
        this.f17439c = f10;
    }

    @Override // rs.a
    public final void a(e youTubePlayer, float f10) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        ((YoutubeVideoFullScreenViewModel) this.f17437a.x()).f10155n = f10;
    }

    @Override // rs.a
    public final void c(e youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        YoutubeVideoFullScreenActivity youtubeVideoFullScreenActivity = this.f17437a;
        float f10 = ((YoutubeVideoFullScreenViewModel) youtubeVideoFullScreenActivity.x()).f10155n;
        String str = this.f17438b;
        if (f10 > g.f34069a) {
            ((us.g) youTubePlayer).b(((YoutubeVideoFullScreenViewModel) youtubeVideoFullScreenActivity.x()).f10155n, str);
        } else {
            ((us.g) youTubePlayer).b(this.f17439c, str);
        }
    }
}
