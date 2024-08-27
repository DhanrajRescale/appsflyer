package ba;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public abstract class w extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Toolbar f6494s;

    /* renamed from: t, reason: collision with root package name */
    public final WebView f6495t;

    public w(Object obj, View view, Toolbar toolbar, WebView webView) {
        super(obj, view, 0);
        this.f6494s = toolbar;
        this.f6495t = webView;
    }
}
