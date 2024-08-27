package us;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.FrameLayout;
import c0.s;
import iu.k;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final f f37367a;

    /* renamed from: b, reason: collision with root package name */
    public final ts.c f37368b;

    /* renamed from: c, reason: collision with root package name */
    public final ts.d f37369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37370d;

    /* renamed from: e, reason: collision with root package name */
    public k f37371e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f37372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [rs.a, ts.d, java.lang.Object] */
    public d(Context context, i listener) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(context, "context");
        f fVar = new f(context, listener);
        this.f37367a = fVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        ts.c cVar = new ts.c(applicationContext);
        this.f37368b = cVar;
        ?? obj = new Object();
        this.f37369c = obj;
        this.f37371e = c.f37366a;
        this.f37372f = new LinkedHashSet();
        this.f37373g = true;
        addView(fVar, new FrameLayout.LayoutParams(-1, -1));
        fVar.a(obj);
        fVar.a(new a(this, 0));
        fVar.a(new a(this, 1));
        cVar.f36376b.add(new b(this));
    }

    public final void a(rs.a youTubePlayerListener, boolean z10, ss.b playerOptions) {
        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
        Intrinsics.checkNotNullParameter(playerOptions, "playerOptions");
        if (!this.f37370d) {
            if (z10) {
                ts.c cVar = this.f37368b;
                cVar.getClass();
                ts.b bVar = new ts.b(cVar);
                cVar.f36377c = bVar;
                Object systemService = cVar.f36375a.getSystemService("connectivity");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).registerDefaultNetworkCallback(bVar);
            }
            s sVar = new s(27, this, playerOptions, youTubePlayerListener);
            this.f37371e = sVar;
            if (!z10) {
                sVar.mo2invoke();
                return;
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final boolean getCanPlay$core_release() {
        return this.f37373g;
    }

    @NotNull
    public final f getWebViewYouTubePlayer$core_release() {
        return this.f37367a;
    }

    public final void setCustomPlayerUi(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z10) {
        this.f37370d = z10;
    }
}
