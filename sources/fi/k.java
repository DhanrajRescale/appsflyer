package fi;

import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;

/* loaded from: classes.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public VideoPlayer f16131a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoPlayer f16133c;

    /* renamed from: d, reason: collision with root package name */
    public int f16134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VideoPlayer videoPlayer, yt.a aVar) {
        super(aVar);
        this.f16133c = videoPlayer;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16132b = obj;
        this.f16134d |= Integer.MIN_VALUE;
        return VideoPlayer.a(this.f16133c, this);
    }
}
