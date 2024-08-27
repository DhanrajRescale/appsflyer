package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class zo extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final gf f6870s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f6871t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f6872u;

    /* renamed from: v, reason: collision with root package name */
    public final MarketAssetToolbarView f6873v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f6874w;

    public zo(Object obj, View view, gf gfVar, ProgressBar progressBar, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 1);
        this.f6870s = gfVar;
        this.f6871t = progressBar;
        this.f6872u = materialButton;
        this.f6873v = marketAssetToolbarView;
        this.f6874w = toolbar;
    }
}
