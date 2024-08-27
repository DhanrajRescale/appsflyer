package ad;

import android.view.View;
import androidx.lifecycle.v;
import ba.l9;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueDeclaredWinnerItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f357z = 0;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f358x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f359y;

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
            int r1 = ba.l9.f5327y
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558584(0x7f0d00b8, float:1.8742488E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.l9 r5 = (ba.l9) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f358x = r7
            r4.f359y = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, boolean):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new LeagueDeclaredWinnerItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        LeagueDeclaredWinnerItemViewModel leagueDeclaredWinnerItemViewModel = (LeagueDeclaredWinnerItemViewModel) v();
        leagueDeclaredWinnerItemViewModel.f9030g.observe(this, new eb.c(18, new c(this, 0)));
        LeagueDeclaredWinnerItemViewModel leagueDeclaredWinnerItemViewModel2 = (LeagueDeclaredWinnerItemViewModel) v();
        leagueDeclaredWinnerItemViewModel2.f9031h.observe(this, new eb.c(18, new c(this, 1)));
        LeagueDeclaredWinnerItemViewModel leagueDeclaredWinnerItemViewModel3 = (LeagueDeclaredWinnerItemViewModel) v();
        leagueDeclaredWinnerItemViewModel3.f9033j.observe(this, new eb.c(18, new c(this, 2)));
        LeagueDeclaredWinnerItemViewModel leagueDeclaredWinnerItemViewModel4 = (LeagueDeclaredWinnerItemViewModel) v();
        leagueDeclaredWinnerItemViewModel4.f9032i.observe(this, new eb.c(18, new c(this, 3)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((l9) this.f17291u).p(this);
        this.f22629a.setOnClickListener(new d7.j(this, 25));
    }
}
