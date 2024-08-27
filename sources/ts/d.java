package ts;

import kotlin.jvm.internal.Intrinsics;
import qs.e;

/* loaded from: classes2.dex */
public final class d extends rs.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36378a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36379b;

    /* renamed from: c, reason: collision with root package name */
    public qs.c f36380c;

    /* renamed from: d, reason: collision with root package name */
    public String f36381d;

    /* renamed from: e, reason: collision with root package name */
    public float f36382e;

    @Override // rs.a
    public final void a(e youTubePlayer, float f10) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        this.f36382e = f10;
    }

    @Override // rs.a
    public final void b(e youTubePlayer, qs.c error) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error == qs.c.f32154c) {
            this.f36380c = error;
        }
    }

    @Override // rs.a
    public final void d(e youTubePlayer, qs.d state) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return;
                }
            } else {
                this.f36379b = true;
                return;
            }
        }
        this.f36379b = false;
    }

    @Override // rs.a
    public final void e(e youTubePlayer, String videoId) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.f36381d = videoId;
    }
}
