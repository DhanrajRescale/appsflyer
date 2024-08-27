package gi;

import ba.r4;
import com.assetgro.stockgro.ui.social.presentation.video.VideoFullScreenActivity;
import fi.g;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoFullScreenActivity f17436b;

    public a(VideoFullScreenActivity videoFullScreenActivity) {
        this.f17436b = videoFullScreenActivity;
    }

    @Override // fi.g
    public final void c() {
    }

    @Override // fi.g
    public final void d() {
        VideoFullScreenActivity videoFullScreenActivity = this.f17436b;
        ((r4) videoFullScreenActivity.w()).f5928s.j();
        videoFullScreenActivity.finish();
    }

    @Override // fi.g
    public final void onPause() {
    }
}
