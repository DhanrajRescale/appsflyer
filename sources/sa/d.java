package sa;

import android.view.View;
import androidx.lifecycle.v;
import ba.s7;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.insights.AssetInsightItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {
    public static final /* synthetic */ int B = 0;
    public oa.a A;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f34408x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f34409y;

    /* renamed from: z, reason: collision with root package name */
    public oa.a f34410z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onSeeAllClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.s7.f6048w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558559(0x7f0d009f, float:1.8742437E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.s7 r5 = (ba.s7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f34408x = r6
            r4.f34409y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new AssetInsightItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        AssetInsightItemViewModel assetInsightItemViewModel = (AssetInsightItemViewModel) v();
        assetInsightItemViewModel.f8670g.observe(this, new f7.i(16, new c(this, 0)));
        ((AssetInsightItemViewModel) v()).f9075c.observe(this, new f7.i(16, new c(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f34410z = new oa.a(u(), false, new c(this, 2));
        this.A = new oa.a(u(), true, new c(this, 3));
        ((s7) this.f17291u).f6051u.setOnClickListener(new d7.j(this, 10));
    }
}
