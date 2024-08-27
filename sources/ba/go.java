package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class go extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ye f4834s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f4835t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f4836u;

    /* renamed from: v, reason: collision with root package name */
    public final MarketAssetToolbarView f4837v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4838w;

    public go(Object obj, View view, ye yeVar, ProgressBar progressBar, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4834s = yeVar;
        this.f4835t = progressBar;
        this.f4836u = materialButton;
        this.f4837v = marketAssetToolbarView;
        this.f4838w = toolbar;
    }
}
