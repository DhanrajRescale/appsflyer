package fi;

import b5.u0;
import b5.y0;
import ba.cw;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import i5.g0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoPlayer f16130a;

    public j(VideoPlayer videoPlayer) {
        this.f16130a = videoPlayer;
    }

    @Override // b5.y0
    public final void l(int i10) {
        if (i10 != 1) {
            VideoPlayer videoPlayer = this.f16130a;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        cw cwVar = videoPlayer.f10135a;
                        if (cwVar != null) {
                            cwVar.f4423t.setUseController(false);
                            Unit unit = Unit.f23355a;
                            return;
                        } else {
                            Intrinsics.k("binding");
                            throw null;
                        }
                    }
                } else {
                    g0 g0Var = videoPlayer.f10138d;
                    if (g0Var != null) {
                        videoPlayer.l(g0Var);
                        g onVideoPlayerAction = videoPlayer.getOnVideoPlayerAction();
                        if (onVideoPlayerAction != null) {
                            onVideoPlayerAction.c();
                        }
                    }
                    cw cwVar2 = videoPlayer.f10135a;
                    if (cwVar2 != null) {
                        cwVar2.f4422s.setVisibility(8);
                        cw cwVar3 = videoPlayer.f10135a;
                        if (cwVar3 != null) {
                            cwVar3.f4423t.setUseController(true);
                        } else {
                            Intrinsics.k("binding");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("binding");
                        throw null;
                    }
                }
                Unit unit2 = Unit.f23355a;
                return;
            }
            int i11 = VideoPlayer.f10134s;
            videoPlayer.m();
            Unit unit3 = Unit.f23355a;
            return;
        }
        Unit unit4 = Unit.f23355a;
    }

    @Override // b5.y0
    public final void n(u0 playbackParameters) {
        Intrinsics.checkNotNullParameter(playbackParameters, "playbackParameters");
    }
}
