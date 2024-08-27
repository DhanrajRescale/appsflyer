package ph;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.redemption.offers.RedemptionOfferItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f31087y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final d f31088x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, ph.d r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.bc.f4282t
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.bc r5 = (ba.bc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f31088x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.e.<init>(androidx.recyclerview.widget.RecyclerView, ph.d):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new RedemptionOfferItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        RedemptionOfferItemViewModel redemptionOfferItemViewModel = (RedemptionOfferItemViewModel) v();
        redemptionOfferItemViewModel.f10094g.observe(this, new ch.c(15, new qg.a(this, 10)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new a(this, 1));
    }
}
