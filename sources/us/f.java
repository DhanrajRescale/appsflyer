package us;

import android.content.Context;
import android.webkit.WebView;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.g0;

/* loaded from: classes2.dex */
public final class f extends WebView implements qs.h {

    /* renamed from: a, reason: collision with root package name */
    public final rs.b f37374a;

    /* renamed from: b, reason: collision with root package name */
    public final g f37375b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f37376c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, i listener) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37374a = listener;
        this.f37375b = new g(this);
    }

    public final boolean a(rs.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.f37375b.f37380c.add(listener);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        g gVar = this.f37375b;
        gVar.f37380c.clear();
        gVar.f37379b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @NotNull
    public qs.e getInstance() {
        return this.f37375b;
    }

    @NotNull
    public Collection<rs.a> getListeners() {
        return g0.V(this.f37375b.f37380c);
    }

    @NotNull
    public final qs.e getYoutubePlayer$core_release() {
        return this.f37375b;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        if (this.f37377d && (i10 == 8 || i10 == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i10);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z10) {
        this.f37377d = z10;
    }
}
