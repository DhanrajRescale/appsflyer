package ba;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class un extends m4.m {
    public final MaterialButton A;
    public final MarketAssetToolbarView B;
    public final Toolbar C;

    /* renamed from: s, reason: collision with root package name */
    public final AppBarLayout f6331s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f6332t;

    /* renamed from: u, reason: collision with root package name */
    public final InputView f6333u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6334v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6335w;

    /* renamed from: x, reason: collision with root package name */
    public final PriceInputView f6336x;

    /* renamed from: y, reason: collision with root package name */
    public final ProgressBar f6337y;

    /* renamed from: z, reason: collision with root package name */
    public final InputView f6338z;

    public un(Object obj, View view, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, InputView inputView, TextView textView, TextView textView2, PriceInputView priceInputView, ProgressBar progressBar, InputView inputView2, MaterialButton materialButton, MarketAssetToolbarView marketAssetToolbarView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6331s = appBarLayout;
        this.f6332t = constraintLayout;
        this.f6333u = inputView;
        this.f6334v = textView;
        this.f6335w = textView2;
        this.f6336x = priceInputView;
        this.f6337y = progressBar;
        this.f6338z = inputView2;
        this.A = materialButton;
        this.B = marketAssetToolbarView;
        this.C = toolbar;
    }
}
