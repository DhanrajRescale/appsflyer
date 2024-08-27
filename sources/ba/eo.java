package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class eo extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final we f4629s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f4630t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f4631u;

    /* renamed from: v, reason: collision with root package name */
    public final MarketAssetToolbarView f4632v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4633w;

    public eo(Object obj, View view, we weVar, ProgressBar progressBar, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4629s = weVar;
        this.f4630t = progressBar;
        this.f4631u = materialButton;
        this.f4632v = marketAssetToolbarView;
        this.f4633w = toolbar;
    }
}
