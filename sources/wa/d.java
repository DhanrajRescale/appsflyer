package wa;

import android.view.View;
import androidx.lifecycle.v;
import ba.b7;
import ba.c7;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchOptionsItemViewModel;
import d7.j;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f38900y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f38901x;

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
            int r1 = ba.b7.f4261z
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558550(0x7f0d0096, float:1.8742419E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.b7 r5 = (ba.b7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f38901x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new AdvancedSearchOptionsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c7 c7Var = (c7) ((b7) this.f17291u);
        c7Var.f4268y = (AdvancedSearchOptionsItemViewModel) v();
        synchronized (c7Var) {
            c7Var.A |= 2;
        }
        c7Var.a(24);
        c7Var.m();
        ((b7) this.f17291u).p(this);
        ((AdvancedSearchOptionsItemViewModel) v()).f8696g.observe(this, new f7.i(20, new c(this, 0)));
        ((AdvancedSearchOptionsItemViewModel) v()).f8697h.observe(this, new f7.i(20, new c(this, 1)));
        this.f22629a.setOnClickListener(new j(this, 11));
    }
}
