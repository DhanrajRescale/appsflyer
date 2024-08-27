package androidx.navigation;

import androidx.navigation.fragment.FragmentNavigator;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2276b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f2275a = i10;
        this.f2276b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t source, androidx.lifecycle.m event) {
        int i10 = this.f2275a;
        Object obj = null;
        Object obj2 = this.f2276b;
        switch (i10) {
            case 0:
                t this$0 = (t) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                this$0.f2320q = event.a();
                if (this$0.f2306c != null) {
                    Iterator<E> it = this$0.f2310g.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        nVar.f2260d = event.a();
                        nVar.c();
                    }
                    return;
                }
                return;
            case 1:
                FragmentNavigator this$02 = (FragmentNavigator) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.m.ON_DESTROY) {
                    androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) source;
                    for (Object obj3 : (Iterable) this$02.b().f2283f.f36547a.getValue()) {
                        if (Intrinsics.a(((n) obj3).f2262f, g0Var.getTag())) {
                            obj = obj3;
                        }
                    }
                    n nVar2 = (n) obj;
                    if (nVar2 != null && !((List) this$02.b().f2282e.f36547a.getValue()).contains(nVar2)) {
                        this$02.b().b(nVar2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o7.d this$03 = (o7.d) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.m.ON_START) {
                    this$03.f29764f = true;
                    return;
                } else {
                    if (event == androidx.lifecycle.m.ON_STOP) {
                        this$03.f29764f = false;
                        return;
                    }
                    return;
                }
            default:
                g1 videoPlayer = (g1) obj2;
                Intrinsics.checkNotNullParameter(videoPlayer, "$videoPlayer");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = ld.s.f24587a[event.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            VideoPlayer videoPlayer2 = (VideoPlayer) videoPlayer.getValue();
                            if (videoPlayer2 != null) {
                                videoPlayer2.j();
                            }
                            videoPlayer.setValue(null);
                            return;
                        }
                        return;
                    }
                    VideoPlayer videoPlayer3 = (VideoPlayer) videoPlayer.getValue();
                    if (videoPlayer3 != null) {
                        int i12 = VideoPlayer.f10134s;
                        videoPlayer3.k(0L);
                        return;
                    }
                    return;
                }
                VideoPlayer videoPlayer4 = (VideoPlayer) videoPlayer.getValue();
                if (videoPlayer4 != null) {
                    videoPlayer4.i();
                    return;
                }
                return;
        }
    }
}
