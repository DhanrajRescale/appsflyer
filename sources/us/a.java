package us;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends rs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37364b;

    public a(Object obj, int i10) {
        this.f37363a = i10;
        this.f37364b = obj;
    }

    @Override // rs.a
    public final void c(qs.e youTubePlayer) {
        int i10 = this.f37363a;
        Object obj = this.f37364b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                d dVar = (d) obj;
                dVar.setYouTubePlayerReady$core_release(true);
                LinkedHashSet linkedHashSet = dVar.f37372f;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    linkedHashSet.clear();
                    g gVar = (g) youTubePlayer;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(this, "listener");
                    gVar.f37380c.remove(this);
                    return;
                }
                a3.a.u(it.next());
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                g gVar2 = (g) youTubePlayer;
                gVar2.b(s0.g.f34069a, (String) obj);
                gVar2.a(gVar2.f37378a, "mute", new Object[0]);
                return;
            default:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                return;
        }
    }

    @Override // rs.a
    public final void d(qs.e youTubePlayer, qs.d state) {
        switch (this.f37363a) {
            case 0:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                Intrinsics.checkNotNullParameter(state, "state");
                if (state == qs.d.f32161d) {
                    d dVar = (d) this.f37364b;
                    if (!dVar.f37373g && !dVar.f37367a.f37377d) {
                        ((g) youTubePlayer).c();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.d(youTubePlayer, state);
                return;
        }
    }
}
