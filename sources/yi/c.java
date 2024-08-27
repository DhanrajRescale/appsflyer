package yi;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.stock.sort.StockSortItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq.e;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f41647y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f41648x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onSortOptionClicked"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.gd.f4795u
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558641(0x7f0d00f1, float:1.8742604E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.gd r5 = (ba.gd) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f41648x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f17292v = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((StockSortItemViewModel) v()).f9075c.observe(this, new li.c(29, new qg.a(this, 20)));
        view.setOnClickListener(new ph.a(this, 11));
    }
}
