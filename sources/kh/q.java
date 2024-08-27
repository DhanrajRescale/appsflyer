package kh;

import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements r7.j, yo.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f23168a;

    public /* synthetic */ q(y yVar) {
        this.f23168a = yVar;
    }

    @Override // r7.j
    public final void i() {
        int i10 = y.f23187n;
        y this$0 = this.f23168a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((UserStatisticsViewModel) this$0.r()).k();
    }

    @Override // yo.k
    public final void j(yo.g tab, int i10) {
        int i11 = y.f23187n;
        y this$0 = this.f23168a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        tab.b(this$0.getString(R.string.timeline_tab));
                        return;
                    }
                    return;
                }
                tab.b(this$0.getString(R.string.long_term_portfolio));
                return;
            }
            tab.b(this$0.getString(R.string.groups_tab));
            return;
        }
        tab.b(this$0.getString(R.string.league_statistics_tab));
    }
}
