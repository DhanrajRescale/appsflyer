package ba;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public abstract class q extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Toolbar f5811s;

    /* renamed from: t, reason: collision with root package name */
    public final WebView f5812t;

    public q(Object obj, View view, Toolbar toolbar, WebView webView) {
        super(obj, view, 0);
        this.f5811s = toolbar;
        this.f5812t = webView;
    }
}
