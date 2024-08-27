package xe;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.drawer.championsChart.adapters.ChampionsItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f40188y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f40189x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.a8.A
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558563(0x7f0d00a3, float:1.8742445E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.a8 r5 = (ba.a8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f40189x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new ChampionsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ChampionsItemViewModel championsItemViewModel = (ChampionsItemViewModel) v();
        championsItemViewModel.f9477g.observe(this, new re.d(2, new c(this, 0)));
        ChampionsItemViewModel championsItemViewModel2 = (ChampionsItemViewModel) v();
        championsItemViewModel2.f9478h.observe(this, new re.d(2, new c(this, 1)));
        ChampionsItemViewModel championsItemViewModel3 = (ChampionsItemViewModel) v();
        championsItemViewModel3.f9479i.observe(this, new re.d(2, new c(this, 2)));
        ChampionsItemViewModel championsItemViewModel4 = (ChampionsItemViewModel) v();
        championsItemViewModel4.f9480j.observe(this, new re.d(2, new c(this, 3)));
        ChampionsItemViewModel championsItemViewModel5 = (ChampionsItemViewModel) v();
        championsItemViewModel5.f9481k.observe(this, new re.d(2, new c(this, 4)));
        ChampionsItemViewModel championsItemViewModel6 = (ChampionsItemViewModel) v();
        championsItemViewModel6.f9482l.observe(this, new re.d(2, new c(this, 5)));
        ChampionsItemViewModel championsItemViewModel7 = (ChampionsItemViewModel) v();
        championsItemViewModel7.f9483m.observe(this, new re.d(2, new c(this, 6)));
        ChampionsItemViewModel championsItemViewModel8 = (ChampionsItemViewModel) v();
        championsItemViewModel8.f9484n.observe(this, new re.d(2, new c(this, 7)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22629a.setOnClickListener(new jd.a(this, 22));
    }
}
