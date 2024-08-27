package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.widget.ArrowSlider;
import com.assetgro.stockgro.widget.PrepZoneHeaderView;

/* loaded from: classes.dex */
public abstract class q1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ArrowSlider f5820s;

    /* renamed from: t, reason: collision with root package name */
    public final PrepZoneHeaderView f5821t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f5822u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f5823v;

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f5824w;

    public q1(Object obj, View view, ArrowSlider arrowSlider, PrepZoneHeaderView prepZoneHeaderView, Toolbar toolbar, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f5820s = arrowSlider;
        this.f5821t = prepZoneHeaderView;
        this.f5822u = toolbar;
        this.f5823v = linearLayout;
        this.f5824w = recyclerView;
    }
}
