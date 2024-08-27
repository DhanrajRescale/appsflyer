package ba;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;

/* loaded from: classes.dex */
public abstract class po extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ProgressBar f5792s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5793t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5794u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f5795v;

    /* renamed from: w, reason: collision with root package name */
    public StockOverviewV2ViewModel f5796w;

    public po(Object obj, View view, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 1);
        this.f5792s = progressBar;
        this.f5793t = recyclerView;
        this.f5794u = textView;
        this.f5795v = swipeRefreshLayout;
    }
}
