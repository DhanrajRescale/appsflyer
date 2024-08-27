package ga;

import android.view.View;
import androidx.lifecycle.v;
import ba.bb;
import ba.cb;
import c2.e1;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f17185y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f17186x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(androidx.recyclerview.widget.RecyclerView r4, com.assetgro.stockgro.feature_market.domain.model.FnoOption r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "identifierInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r5 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            android.content.Context r5 = r4.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = ba.bb.f4275y
            androidx.databinding.DataBinderMapperImpl r0 = m4.d.f27474a
            r0 = 0
            r1 = 0
            r2 = 2131558610(0x7f0d00d2, float:1.874254E38)
            m4.m r4 = m4.m.g(r5, r2, r4, r1, r0)
            ba.bb r4 = (ba.bb) r4
            java.lang.String r5 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r3.<init>(r4)
            r3.f17186x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.f.<init>(androidx.recyclerview.widget.RecyclerView, com.assetgro.stockgro.feature_market.domain.model.FnoOption, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new OptionChainItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        cb cbVar = (cb) ((bb) this.f17291u);
        cbVar.f4281x = (OptionChainItemViewModel) v();
        synchronized (cbVar) {
            cbVar.f4348z |= 2;
        }
        cbVar.a(24);
        cbVar.m();
        ((bb) this.f17291u).p(this);
        ((OptionChainItemViewModel) v()).f8583g.observe(this, new f7.i(2, new e1(this, 19)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new d7.j(this, 4));
    }
}
