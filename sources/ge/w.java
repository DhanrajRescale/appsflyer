package ge;

import android.view.View;
import com.assetgro.stockgro.ui.chat.helper.search.StockgroContactViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f17350y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final c f17351x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(androidx.recyclerview.widget.RecyclerView r5, ge.c r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.t8.f6166v
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558575(0x7f0d00af, float:1.874247E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.t8 r5 = (ba.t8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17351x = r6
            m4.m r5 = r4.f17291u
            ba.t8 r5 = (ba.t8) r5
            android.widget.CheckBox r5 = r5.f6167s
            r6 = 8
            r5.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.w.<init>(androidx.recyclerview.widget.RecyclerView, ge.c):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockgroContactViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (androidx.lifecycle.v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockgroContactViewModel stockgroContactViewModel = (StockgroContactViewModel) v();
        stockgroContactViewModel.f9364g.observe(this, new id.a(22, new v(this, 0)));
        StockgroContactViewModel stockgroContactViewModel2 = (StockgroContactViewModel) v();
        stockgroContactViewModel2.f9365h.observe(this, new id.a(22, new v(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new jd.a(this, 12));
    }
}
