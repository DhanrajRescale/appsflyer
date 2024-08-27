package us;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f37365a;

    public b(d dVar) {
        this.f37365a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [iu.k, kotlin.jvm.functions.Function0] */
    public final void a() {
        d dVar = this.f37365a;
        if (!dVar.f37370d) {
            dVar.f37371e.mo2invoke();
            return;
        }
        qs.e youTubePlayer = dVar.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
        ts.d dVar2 = dVar.f37369c;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        String videoId = dVar2.f36381d;
        if (videoId != null) {
            boolean z10 = dVar2.f36379b;
            qs.c cVar = qs.c.f32154c;
            if (z10 && dVar2.f36380c == cVar) {
                boolean z11 = dVar2.f36378a;
                float f10 = dVar2.f36382e;
                Intrinsics.checkNotNullParameter(youTubePlayer, "<this>");
                Intrinsics.checkNotNullParameter(videoId, "videoId");
                if (z11) {
                    ((g) youTubePlayer).b(f10, videoId);
                } else {
                    g gVar = (g) youTubePlayer;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(videoId, "videoId");
                    gVar.a(gVar.f37378a, "cueVideo", videoId, Float.valueOf(f10));
                }
            } else if (!z10 && dVar2.f36380c == cVar) {
                float f11 = dVar2.f36382e;
                g gVar2 = (g) youTubePlayer;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(videoId, "videoId");
                gVar2.a(gVar2.f37378a, "cueVideo", videoId, Float.valueOf(f11));
            }
            dVar2.f36380c = null;
        }
    }
}
