package kf;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.home.stockgyan.index.StockGyanIndexItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ub.f;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f23091y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f23092x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.xc.f6648t
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558636(0x7f0d00ec, float:1.8742593E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.xc r5 = (ba.xc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f23092x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockGyanIndexItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockGyanIndexItemViewModel stockGyanIndexItemViewModel = (StockGyanIndexItemViewModel) v();
        stockGyanIndexItemViewModel.f9573g.observe(this, new re.d(15, new f(this, 19)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new p004if.c(this, 2));
    }
}
