package ue;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f37119c;

    public /* synthetic */ p(Activity activity, boolean z10, int i10) {
        this.f37117a = i10;
        this.f37119c = activity;
        this.f37118b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f37117a;
        boolean z10 = this.f37118b;
        Activity activity = this.f37119c;
        switch (i10) {
            case 0:
                MediaPlayerActivity mediaPlayerActivity = (MediaPlayerActivity) activity;
                mediaPlayerActivity.f9460d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                mediaPlayerActivity.f9465i = true;
                if (z10) {
                    mediaPlayerActivity.a();
                    return;
                } else {
                    mediaPlayerActivity.b();
                    return;
                }
            default:
                com.assetgro.stockgro.ui.hedwig.utils.MediaPlayerActivity mediaPlayerActivity2 = (com.assetgro.stockgro.ui.hedwig.utils.MediaPlayerActivity) activity;
                mediaPlayerActivity2.f9524f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                mediaPlayerActivity2.f9529k = true;
                if (z10) {
                    mediaPlayerActivity2.a();
                    return;
                } else {
                    mediaPlayerActivity2.b();
                    return;
                }
        }
    }
}
