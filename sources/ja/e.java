package ja;

import android.view.View;
import androidx.lifecycle.v;
import ba.ab;
import ba.za;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionListItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f21259y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f21260x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.za.f6824z
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558609(0x7f0d00d1, float:1.8742539E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.za r5 = (ba.za) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f21260x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new MarketOptionListItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ab abVar = (ab) ((za) this.f17291u);
        abVar.f6831y = (MarketOptionListItemViewModel) v();
        synchronized (abVar) {
            abVar.A |= 2;
        }
        abVar.a(24);
        abVar.m();
        ((za) this.f17291u).p(this);
        ((MarketOptionListItemViewModel) v()).f8625g.observe(this, new f7.i(6, new d(this, 0)));
        ((MarketOptionListItemViewModel) v()).f8626h.observe(this, new f7.i(6, new d(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new d7.j(this, 5));
    }
}
