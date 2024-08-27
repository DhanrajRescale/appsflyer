package wa;

import android.view.View;
import androidx.lifecycle.v;
import ba.d7;
import ba.e7;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchStocksItemViewModel;
import d7.j;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f38910y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f38911x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.d7.f4451y
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558551(0x7f0d0097, float:1.874242E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.d7 r5 = (ba.d7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f38911x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.i.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new AdvancedSearchStocksItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e7 e7Var = (e7) ((d7) this.f17291u);
        e7Var.f4457x = (AdvancedSearchStocksItemViewModel) v();
        synchronized (e7Var) {
            e7Var.f4579z |= 2;
        }
        e7Var.a(24);
        e7Var.m();
        ((d7) this.f17291u).p(this);
        ((AdvancedSearchStocksItemViewModel) v()).f8698g.observe(this, new f7.i(21, new h(this, 0)));
        ((AdvancedSearchStocksItemViewModel) v()).f8699h.observe(this, new f7.i(21, new h(this, 1)));
        this.f22629a.setOnClickListener(new j(this, 12));
    }
}
