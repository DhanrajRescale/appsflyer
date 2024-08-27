package ba;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;

/* loaded from: classes.dex */
public abstract class qg extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final wr f5858s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5859t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5860u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f5861v;

    /* renamed from: w, reason: collision with root package name */
    public CompletedLeaguePortfolioViewModel f5862w;

    public qg(Object obj, View view, wr wrVar, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 2);
        this.f5858s = wrVar;
        this.f5859t = textView;
        this.f5860u = recyclerView;
        this.f5861v = swipeRefreshLayout;
    }
}
