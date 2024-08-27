package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ps.a;
import ss.b;
import ts.c;
import us.d;
import us.e;
import us.f;
import us.g;
import us.h;
import us.i;
import us.j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lus/e;", "Landroidx/lifecycle/r;", "Landroid/view/View;", "view", HttpUrl.FRAGMENT_ENCODE_SET, "setCustomPlayerUi", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Z", "getEnableAutomaticInitialization", "()Z", "setEnableAutomaticInitialization", "(Z)V", "enableAutomaticInitialization", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class YouTubePlayerView extends e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12117a;

    /* renamed from: b, reason: collision with root package name */
    public final d f12118b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean enableAutomaticInitialization;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12117a = new ArrayList();
        d dVar = new d(context, new i(this));
        this.f12118b = dVar;
        addView(dVar, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f31333a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.enableAutomaticInitialization = obtainStyledAttributes.getBoolean(1, true);
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        boolean z11 = obtainStyledAttributes.getBoolean(2, true);
        String string = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.recycle();
        if (z10 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        j jVar = new j(string, this, z10);
        if (this.enableAutomaticInitialization) {
            dVar.a(jVar, z11, b.f34767b);
        }
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = h.f37381a[event.ordinal()];
        d dVar = this.f12118b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    c cVar = dVar.f37368b;
                    ts.b bVar = cVar.f36377c;
                    if (bVar != null) {
                        Object systemService = cVar.f36375a.getSystemService("connectivity");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                        ((ConnectivityManager) systemService).unregisterNetworkCallback(bVar);
                        cVar.f36376b.clear();
                        cVar.f36377c = null;
                    }
                    f fVar = dVar.f37367a;
                    dVar.removeView(fVar);
                    fVar.removeAllViews();
                    fVar.destroy();
                    return;
                }
                return;
            }
            ((g) dVar.f37367a.getYoutubePlayer$core_release()).c();
            dVar.f37369c.f36378a = false;
            dVar.f37373g = false;
            return;
        }
        dVar.f37369c.f36378a = true;
        dVar.f37373g = true;
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.enableAutomaticInitialization;
    }

    public final void setCustomPlayerUi(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f12118b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z10) {
        this.enableAutomaticInitialization = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
