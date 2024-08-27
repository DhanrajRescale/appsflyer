package oa;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.InsightListItemViewModel;
import d7.j;
import f7.i;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f29870z = 0;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f29871x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f29872y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.q7.f5836w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558558(0x7f0d009e, float:1.8742435E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.q7 r5 = (ba.q7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f29871x = r7
            r4.f29872y = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, boolean):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new InsightListItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        InsightListItemViewModel insightListItemViewModel = (InsightListItemViewModel) v();
        insightListItemViewModel.f8655g.observe(this, new i(12, new b(this, 0)));
        InsightListItemViewModel insightListItemViewModel2 = (InsightListItemViewModel) v();
        insightListItemViewModel2.f8656h.observe(this, new i(12, new b(this, 1)));
        InsightListItemViewModel insightListItemViewModel3 = (InsightListItemViewModel) v();
        insightListItemViewModel3.f8657i.observe(this, new i(12, new b(this, 2)));
        InsightListItemViewModel insightListItemViewModel4 = (InsightListItemViewModel) v();
        insightListItemViewModel4.f8658j.observe(this, new i(12, new b(this, 3)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new j(this, 8));
    }
}
