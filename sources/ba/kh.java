package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;

/* loaded from: classes.dex */
public abstract class kh extends m4.m {
    public final Toolbar A;
    public final View B;
    public OptionChainViewModel C;

    /* renamed from: s, reason: collision with root package name */
    public final SwitchCompat f5243s;

    /* renamed from: t, reason: collision with root package name */
    public final MarketAssetToolbarView f5244t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5245u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f5246v;

    /* renamed from: w, reason: collision with root package name */
    public final SwipeRefreshLayout f5247w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f5248x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5249y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5250z;

    public kh(Object obj, View view, SwitchCompat switchCompat, MarketAssetToolbarView marketAssetToolbarView, RecyclerView recyclerView, LinearLayout linearLayout, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, Toolbar toolbar, View view2) {
        super(obj, view, 2);
        this.f5243s = switchCompat;
        this.f5244t = marketAssetToolbarView;
        this.f5245u = recyclerView;
        this.f5246v = linearLayout;
        this.f5247w = swipeRefreshLayout;
        this.f5248x = textView;
        this.f5249y = textView2;
        this.f5250z = textView3;
        this.A = toolbar;
        this.B = view2;
    }
}
