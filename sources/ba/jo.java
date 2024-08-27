package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class jo extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final af f5160s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f5161t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f5162u;

    /* renamed from: v, reason: collision with root package name */
    public final MarketAssetToolbarView f5163v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5164w;

    public jo(Object obj, View view, af afVar, ProgressBar progressBar, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 1);
        this.f5160s = afVar;
        this.f5161t = progressBar;
        this.f5162u = materialButton;
        this.f5163v = marketAssetToolbarView;
        this.f5164w = toolbar;
    }
}
