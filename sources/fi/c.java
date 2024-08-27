package fi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoPlayer f16121b;

    public /* synthetic */ c(VideoPlayer videoPlayer, int i10) {
        this.f16120a = i10;
        this.f16121b = videoPlayer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f16120a;
        VideoPlayer this$0 = this.f16121b;
        switch (i10) {
            case 0:
                int i11 = VideoPlayer.f10134s;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                g gVar = this$0.onVideoPlayerAction;
                if (gVar != null) {
                    gVar.d();
                    return;
                }
                return;
            default:
                int i12 = VideoPlayer.f10134s;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View inflate = LayoutInflater.from(this$0.getContext()).inflate(R.layout.layout_video_settings_dialog, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.speedOption);
                h.j create = new h.i(this$0.getContext()).setView(inflate).create();
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                textView.setOnClickListener(new bb.a(21, this$0, create));
                create.show();
                return;
        }
    }
}
