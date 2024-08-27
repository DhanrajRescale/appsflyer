package ah;

import android.view.View;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import ba.rb;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioItemViewModel;
import el.l;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f424z = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f425x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f426y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.rb.f5951x
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558619(0x7f0d00db, float:1.8742559E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.rb r5 = (ba.rb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f425x = r6
            r4.f426y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioItemViewModel, com.assetgro.stockgro.ui.base.BaseItemViewModel] */
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ?? baseItemViewModel = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        e0 e0Var = baseItemViewModel.f9075c;
        baseItemViewModel.f9965g = i0.C(e0Var, e.f427b);
        baseItemViewModel.f9966h = i0.C(e0Var, e.f428c);
        baseItemViewModel.f9967i = i0.C(e0Var, e.f429d);
        this.f17292v = baseItemViewModel;
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((UnlockPortfolioItemViewModel) v()).f9965g.observe(this, new xf.v(26, new c(this, 0)));
        ((UnlockPortfolioItemViewModel) v()).f9966h.observe(this, new xf.v(26, new c(this, 1)));
        ((UnlockPortfolioItemViewModel) v()).f9967i.observe(this, new xf.v(26, new c(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22629a.setOnClickListener(new p004if.c(this, 20));
        ((rb) this.f17291u).f5953t.setVisibility(l.u(this.f426y));
    }
}
