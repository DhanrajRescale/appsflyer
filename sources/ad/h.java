package ad;

import android.view.View;
import androidx.fragment.app.j0;
import ba.j6;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.SquareOffMessageBottomSheetViewModel;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lad/h;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/winner/SquareOffMessageBottomSheetViewModel;", "Lba/j6;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends gd.h<SquareOffMessageBottomSheetViewModel, j6> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f370i = 0;

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f17270b = new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.bottom_sheet_square_off;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        j0 requireActivity = requireActivity();
        Intrinsics.d(requireActivity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
        ((LeagueDetailPostJoiningViewModel) ((LeagueDetailPostJoiningActivity) requireActivity).x()).f8991s.observe(this, new eb.c(20, new ub.f(this, 3)));
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        j6 j6Var = (j6) r();
        j6Var.f5110t.setOnClickListener(new d7.j(this, 27));
    }
}
