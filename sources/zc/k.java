package zc;

import android.view.View;
import androidx.lifecycle.v;
import ba.n9;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f42393y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f42394x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.n9.f5533w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558585(0x7f0d00b9, float:1.874249E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.n9 r5 = (ba.n9) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f42394x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.k.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e k10 = viewHolderComponent.f14246a.k();
        ct.a c10 = viewHolderComponent.f14246a.c();
        UserRepository m10 = viewHolderComponent.f14246a.m();
        yk.g.i(m10);
        this.f17292v = new LeagueLeaderBoardItemViewModel(k10, c10, m10);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        LeagueLeaderBoardItemViewModel leagueLeaderBoardItemViewModel = (LeagueLeaderBoardItemViewModel) v();
        leagueLeaderBoardItemViewModel.f9012g.observe(this, new eb.c(17, new j(this, 0)));
        LeagueLeaderBoardItemViewModel leagueLeaderBoardItemViewModel2 = (LeagueLeaderBoardItemViewModel) v();
        leagueLeaderBoardItemViewModel2.f9013h.observe(this, new eb.c(17, new j(this, 1)));
        LeagueLeaderBoardItemViewModel leagueLeaderBoardItemViewModel3 = (LeagueLeaderBoardItemViewModel) v();
        leagueLeaderBoardItemViewModel3.f9015j.observe(this, new eb.c(17, new j(this, 2)));
        LeagueLeaderBoardItemViewModel leagueLeaderBoardItemViewModel4 = (LeagueLeaderBoardItemViewModel) v();
        leagueLeaderBoardItemViewModel4.f9016k.observe(this, new eb.c(17, new j(this, 3)));
        LeagueLeaderBoardItemViewModel leagueLeaderBoardItemViewModel5 = (LeagueLeaderBoardItemViewModel) v();
        leagueLeaderBoardItemViewModel5.f9014i.observe(this, new eb.c(17, new j(this, 4)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((n9) this.f17291u).f27491e.setOnClickListener(new d7.j(this, 24));
    }
}
