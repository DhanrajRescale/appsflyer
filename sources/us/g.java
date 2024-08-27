package us;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements qs.e {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f37378a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f37379b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f37380c;

    public g(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f37378a = webView;
        this.f37379b = new Handler(Looper.getMainLooper());
        this.f37380c = new LinkedHashSet();
    }

    public final void a(WebView webView, String str, Object... objArr) {
        String obj;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            if (obj2 instanceof String) {
                obj = "'" + obj2 + '\'';
            } else {
                obj = obj2.toString();
            }
            arrayList.add(obj);
        }
        this.f37379b.post(new androidx.fragment.app.e(webView, str, arrayList));
    }

    public final void b(float f10, String videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        a(this.f37378a, "loadVideo", videoId, Float.valueOf(f10));
    }

    public final void c() {
        a(this.f37378a, "pauseVideo", new Object[0]);
    }
}
