package kh;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ba.gj;
import com.assetgro.stockgro.data.model.RecentPerformance;
import com.assetgro.stockgro.data.remote.response.Stats;
import com.assetgro.stockgro.data.remote.response.UserStatsAndResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.i0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f23131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f23130a = i10;
        this.f23131b = gVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f23130a;
        g gVar = this.f23131b;
        switch (i10) {
            case 5:
                gj gjVar = (gj) gVar.q();
                Intrinsics.c(bool);
                gjVar.f4821u.setVisibility(el.l.u(bool.booleanValue()));
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ProgressBar progressBar = ((gj) gVar.q()).H;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    gVar.F(progressBar);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ProgressBar progressBar2 = ((gj) gVar.q()).H;
                        Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                        zq.f.M(progressBar2);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        List<RecentPerformance> list;
        int i11 = this.f23130a;
        g gVar = this.f23131b;
        switch (i11) {
            case 0:
                String str = null;
                Pair pair = (Pair) ((kj.j) obj).a();
                if (pair != null) {
                    if (gVar.f23136h) {
                        ((gj) gVar.q()).C.setText(gVar.getString(R.string.my_winnings));
                    } else {
                        gj gjVar = (gj) gVar.q();
                        Bundle arguments = gVar.getArguments();
                        if (arguments != null) {
                            str = arguments.getString("USER_NAME");
                        }
                        gjVar.C.setText(jr.h.r(str, "'s Earnings"));
                    }
                    boolean booleanValue = ((Boolean) pair.f23353a).booleanValue();
                    if (booleanValue) {
                        ((gj) gVar.q()).L.setVisibility(8);
                        ((gj) gVar.q()).A.setVisibility(0);
                        ((gj) gVar.q()).B.setVisibility(0);
                        ((gj) gVar.q()).A.setText((CharSequence) pair.f23354b);
                    } else if (!booleanValue) {
                        ((gj) gVar.q()).L.setVisibility(0);
                        ((gj) gVar.q()).A.setVisibility(8);
                        ((gj) gVar.q()).B.setVisibility(8);
                    }
                }
                return Unit.f23355a;
            case 1:
                UserStatsAndResponseDto userStatsAndResponseDto = (UserStatsAndResponseDto) obj;
                ((gj) gVar.q()).F.setText(gVar.getString(R.string.page_of_recent_performance, String.valueOf(userStatsAndResponseDto.getCurrentPage()), String.valueOf(userStatsAndResponseDto.getTotalPages())));
                if (userStatsAndResponseDto.getPerformance().isEmpty()) {
                    gj gjVar2 = (gj) gVar.q();
                    m mVar = (m) ((UserStatisticsViewModel) gVar.r()).F.getValue();
                    ConstraintLayout bottomStripContainer = gjVar2.f4822v;
                    Intrinsics.checkNotNullExpressionValue(bottomStripContainer, "bottomStripContainer");
                    zq.f.m0(bottomStripContainer);
                    RecyclerView recentPerformancesRecyclerView = gjVar2.K;
                    Intrinsics.checkNotNullExpressionValue(recentPerformancesRecyclerView, "recentPerformancesRecyclerView");
                    zq.f.M(recentPerformancesRecyclerView);
                    Group arrowSliderGroup = gjVar2.f4819s;
                    Intrinsics.checkNotNullExpressionValue(arrowSliderGroup, "arrowSliderGroup");
                    zq.f.M(arrowSliderGroup);
                    m mVar2 = m.f23155h;
                    ImageView noLifetimePrepzone = gjVar2.E;
                    TextView bottomScreenSecondaryCta = gjVar2.f4821u;
                    TextView bottomScreenPrimaryCta = gjVar2.f4820t;
                    if (mVar == mVar2) {
                        Intrinsics.checkNotNullExpressionValue(noLifetimePrepzone, "noLifetimePrepzone");
                        zq.f.m0(noLifetimePrepzone);
                        if (gVar.f23136h) {
                            Intrinsics.checkNotNullExpressionValue(bottomScreenPrimaryCta, "bottomScreenPrimaryCta");
                            String string = gVar.getString(R.string.its_high_time);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            kj.f.v(bottomScreenPrimaryCta, string);
                            Intrinsics.checkNotNullExpressionValue(bottomScreenSecondaryCta, "bottomScreenSecondaryCta");
                            String string2 = gVar.getString(R.string.checkout_prepzones);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            kj.f.v(bottomScreenSecondaryCta, string2);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(bottomScreenPrimaryCta, "bottomScreenPrimaryCta");
                            String string3 = gVar.getString(R.string.no_activity);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            kj.f.v(bottomScreenPrimaryCta, string3);
                            Intrinsics.checkNotNullExpressionValue(bottomScreenSecondaryCta, "bottomScreenSecondaryCta");
                            String string4 = gVar.getString(R.string.choose_different_time);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            kj.f.v(bottomScreenSecondaryCta, string4);
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(noLifetimePrepzone, "noLifetimePrepzone");
                        zq.f.M(noLifetimePrepzone);
                        Intrinsics.checkNotNullExpressionValue(bottomScreenPrimaryCta, "bottomScreenPrimaryCta");
                        String string5 = gVar.getString(R.string.no_activity);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        kj.f.v(bottomScreenPrimaryCta, string5);
                        Intrinsics.checkNotNullExpressionValue(bottomScreenSecondaryCta, "bottomScreenSecondaryCta");
                        String string6 = gVar.getString(R.string.choose_different_time);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        kj.f.v(bottomScreenSecondaryCta, string6);
                    }
                    Intrinsics.checkNotNullExpressionValue(bottomStripContainer, "bottomStripContainer");
                    ViewGroup.LayoutParams layoutParams = bottomStripContainer.getLayoutParams();
                    if (layoutParams != null) {
                        m3.d dVar = (m3.d) layoutParams;
                        dVar.f27328l = -1;
                        dVar.f27324j = gjVar2.I.getId();
                        ((ViewGroup.MarginLayoutParams) dVar).topMargin = kj.f.j(12);
                        bottomStripContainer.setLayoutParams(dVar);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    gj gjVar3 = (gj) gVar.q();
                    ConstraintLayout bottomStripContainer2 = gjVar3.f4822v;
                    Intrinsics.checkNotNullExpressionValue(bottomStripContainer2, "bottomStripContainer");
                    zq.f.m0(bottomStripContainer2);
                    Intrinsics.checkNotNullExpressionValue(bottomStripContainer2, "bottomStripContainer");
                    ViewGroup.LayoutParams layoutParams2 = bottomStripContainer2.getLayoutParams();
                    if (layoutParams2 != null) {
                        m3.d dVar2 = (m3.d) layoutParams2;
                        dVar2.f27324j = -1;
                        dVar2.f27328l = 0;
                        bottomStripContainer2.setLayoutParams(dVar2);
                        RecyclerView recentPerformancesRecyclerView2 = gjVar3.K;
                        Intrinsics.checkNotNullExpressionValue(recentPerformancesRecyclerView2, "recentPerformancesRecyclerView");
                        zq.f.m0(recentPerformancesRecyclerView2);
                        Group arrowSliderGroup2 = gjVar3.f4819s;
                        Intrinsics.checkNotNullExpressionValue(arrowSliderGroup2, "arrowSliderGroup");
                        zq.f.m0(arrowSliderGroup2);
                        m mVar3 = (m) ((UserStatisticsViewModel) gVar.r()).F.getValue();
                        if (mVar3 != null) {
                            i10 = mVar3.f23158b;
                        } else {
                            i10 = R.string.data;
                        }
                        String string7 = gVar.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        TextView bottomScreenPrimaryCta2 = gjVar3.f4820t;
                        Intrinsics.checkNotNullExpressionValue(bottomScreenPrimaryCta2, "bottomScreenPrimaryCta");
                        String string8 = gVar.getString(R.string.performance_data, string7);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        kj.f.v(bottomScreenPrimaryCta2, string8);
                        TextView bottomScreenSecondaryCta2 = gjVar3.f4821u;
                        Intrinsics.checkNotNullExpressionValue(bottomScreenSecondaryCta2, "bottomScreenSecondaryCta");
                        String string9 = gVar.getString(R.string.choose_different_time);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                        kj.f.v(bottomScreenSecondaryCta2, string9);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                k kVar = gVar.f23135g;
                if (kVar != null) {
                    List<RecentPerformance> performance = userStatsAndResponseDto.getPerformance();
                    if (!performance.isEmpty()) {
                        list = performance;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = i0.f38321a;
                    }
                    kVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("recentPerformanceAdapter");
                throw null;
            case 2:
                ((gj) gVar.q()).J.setText(gVar.getString(((m) obj).f23158b));
                UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) gVar.r();
                userStatisticsViewModel.J.setValue(1);
                userStatisticsViewModel.l();
                return Unit.f23355a;
            case 3:
                Stats stats = (Stats) obj;
                ((gj) gVar.q()).f4826z.setVisibility(0);
                ((gj) gVar.q()).f4824x.setText(stats.getPlayed());
                ((gj) gVar.q()).f4825y.setText(stats.getWon());
                ((gj) gVar.q()).M.setText(jr.h.r(stats.getWinningPercentage(), "%"));
                return Unit.f23355a;
            case 4:
                ((gj) gVar.q()).C.setText((String) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
