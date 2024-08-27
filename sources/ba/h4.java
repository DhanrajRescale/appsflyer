package ba;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;

/* loaded from: classes.dex */
public abstract class h4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MarketAssetToolbarView f4890s;

    /* renamed from: t, reason: collision with root package name */
    public final Toolbar f4891t;

    /* renamed from: u, reason: collision with root package name */
    public final WebView f4892u;

    public h4(Object obj, View view, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar, WebView webView) {
        super(obj, view, 0);
        this.f4890s = marketAssetToolbarView;
        this.f4891t = toolbar;
        this.f4892u = webView;
    }
}
