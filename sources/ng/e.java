package ng;

import android.view.View;
import androidx.fragment.app.g0;
import ba.g;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.k;
import ls.n0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lng/e;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/g;", "<init>", "()V", "yk/g", "ng/b", "ng/c", "ng/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends h<ReusedBottomSheetViewModel, g> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28689j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f28690i = ut.h.a(new ag.b(this, 7));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.k();
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
        return R.layout.fragment_bottom_sheet_filter;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final int i10 = 0;
        ((MaterialButton) s().findViewById(R.id.history_filter_apply_button)).setOnClickListener(new View.OnClickListener(this) { // from class: ng.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f28685b;

            {
                this.f28685b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i11;
                String str2;
                int i12;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                int i13 = i10;
                e this$0 = this.f28685b;
                switch (i13) {
                    case 0:
                        int i14 = e.f28689j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        g0 parentFragment = this$0.getParentFragment();
                        if (parentFragment instanceof k) {
                            g0 parentFragment2 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            PortfolioHistoryViewModel portfolioHistoryViewModel = (PortfolioHistoryViewModel) ((k) parentFragment2).r();
                            g0 parentFragment3 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            String str4 = ((PortfolioHistoryViewModel) ((k) parentFragment3).r()).f9824t;
                            int checkedChipId = ((ChipGroup) this$0.s().findViewById(R.id.filterChipGroup)).getCheckedChipId();
                            if (checkedChipId == R.id.amountChip) {
                                str2 = "amount:asc";
                            } else if (checkedChipId == R.id.dateChip) {
                                str2 = "execution_date:desc";
                            } else {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            int checkedChipId2 = ((ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup)).getCheckedChipId();
                            if (checkedChipId2 == R.id.boughtChip) {
                                str3 = "bought";
                            } else if (checkedChipId2 == R.id.soldChip) {
                                str3 = "sold";
                            }
                            switch (((ChipGroup) this$0.s().findViewById(R.id.timeChipGroup)).getCheckedChipId()) {
                                case R.id.Month3Chip /* 2131361799 */:
                                    i12 = 90;
                                    break;
                                case R.id.Month6Chip /* 2131361800 */:
                                    i12 = 180;
                                    break;
                                case R.id.lastMonthChip /* 2131363109 */:
                                    i12 = 31;
                                    break;
                                case R.id.lastWeekChip /* 2131363110 */:
                                    i12 = 7;
                                    break;
                                case R.id.yearChip /* 2131364856 */:
                                    i12 = 365;
                                    break;
                                case R.id.yesterdayChip /* 2131364858 */:
                                    i12 = 1;
                                    break;
                                default:
                                    i12 = 0;
                                    break;
                            }
                            portfolioHistoryViewModel.i(str4, str2, str3, i12);
                        } else if (parentFragment instanceof lg.g) {
                            g0 parentFragment4 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel = (PortfolioFnoHistoryViewModel) ((lg.g) parentFragment4).r();
                            g0 parentFragment5 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            String str5 = ((PortfolioFnoHistoryViewModel) ((lg.g) parentFragment5).r()).f9816s;
                            int checkedChipId3 = ((ChipGroup) this$0.s().findViewById(R.id.filterChipGroup)).getCheckedChipId();
                            if (checkedChipId3 == R.id.amountChip) {
                                str = "amount:asc";
                            } else if (checkedChipId3 == R.id.dateChip) {
                                str = "execution_date:desc";
                            } else {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            int checkedChipId4 = ((ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup)).getCheckedChipId();
                            if (checkedChipId4 == R.id.boughtChip) {
                                str3 = "bought";
                            } else if (checkedChipId4 == R.id.soldChip) {
                                str3 = "sold";
                            }
                            switch (((ChipGroup) this$0.s().findViewById(R.id.timeChipGroup)).getCheckedChipId()) {
                                case R.id.Month3Chip /* 2131361799 */:
                                    i11 = 90;
                                    break;
                                case R.id.Month6Chip /* 2131361800 */:
                                    i11 = 180;
                                    break;
                                case R.id.lastMonthChip /* 2131363109 */:
                                    i11 = 31;
                                    break;
                                case R.id.lastWeekChip /* 2131363110 */:
                                    i11 = 7;
                                    break;
                                case R.id.yearChip /* 2131364856 */:
                                    i11 = 365;
                                    break;
                                case R.id.yesterdayChip /* 2131364858 */:
                                    i11 = 1;
                                    break;
                                default:
                                    i11 = 0;
                                    break;
                            }
                            portfolioFnoHistoryViewModel.h(str5, str, str3, Integer.valueOf(i11));
                        }
                        this$0.dismiss();
                        return;
                    default:
                        int i15 = e.f28689j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ChipGroup chipGroup = (ChipGroup) this$0.s().findViewById(R.id.filterChipGroup);
                        b[] bVarArr = b.f28686a;
                        l7.g gVar = chipGroup.f11258h;
                        mo.g gVar2 = (mo.g) ((Map) gVar.f24117c).get(Integer.valueOf(R.id.dateChip));
                        if (gVar2 != null && gVar.a(gVar2)) {
                            gVar.e();
                        }
                        ChipGroup chipGroup2 = (ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup);
                        d[] dVarArr = d.f28688a;
                        l7.g gVar3 = chipGroup2.f11258h;
                        mo.g gVar4 = (mo.g) ((Map) gVar3.f24117c).get(Integer.valueOf(R.id.boughtChip));
                        if (gVar4 != null && gVar3.a(gVar4)) {
                            gVar3.e();
                        }
                        ChipGroup chipGroup3 = (ChipGroup) this$0.s().findViewById(R.id.timeChipGroup);
                        c[] cVarArr = c.f28687a;
                        l7.g gVar5 = chipGroup3.f11258h;
                        mo.g gVar6 = (mo.g) ((Map) gVar5.f24117c).get(Integer.valueOf(R.id.todayChip));
                        if (gVar6 != null && gVar5.a(gVar6)) {
                            gVar5.e();
                        }
                        g0 parentFragment6 = this$0.getParentFragment();
                        if (parentFragment6 instanceof k) {
                            g0 parentFragment7 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment7, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            PortfolioHistoryViewModel portfolioHistoryViewModel2 = (PortfolioHistoryViewModel) ((k) parentFragment7).r();
                            g0 parentFragment8 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment8, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            portfolioHistoryViewModel2.i(((PortfolioHistoryViewModel) ((k) parentFragment8).r()).f9824t, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 365);
                        } else if (parentFragment6 instanceof lg.g) {
                            g0 parentFragment9 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment9, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel2 = (PortfolioFnoHistoryViewModel) ((lg.g) parentFragment9).r();
                            g0 parentFragment10 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment10, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            portfolioFnoHistoryViewModel2.h(((PortfolioFnoHistoryViewModel) ((lg.g) parentFragment10).r()).f9816s, null, null, null);
                        }
                        this$0.f28690i.getValue();
                        this$0.dismiss();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((MaterialButton) s().findViewById(R.id.history_filter_reset_button)).setOnClickListener(new View.OnClickListener(this) { // from class: ng.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f28685b;

            {
                this.f28685b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i112;
                String str2;
                int i12;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                int i13 = i11;
                e this$0 = this.f28685b;
                switch (i13) {
                    case 0:
                        int i14 = e.f28689j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        g0 parentFragment = this$0.getParentFragment();
                        if (parentFragment instanceof k) {
                            g0 parentFragment2 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            PortfolioHistoryViewModel portfolioHistoryViewModel = (PortfolioHistoryViewModel) ((k) parentFragment2).r();
                            g0 parentFragment3 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            String str4 = ((PortfolioHistoryViewModel) ((k) parentFragment3).r()).f9824t;
                            int checkedChipId = ((ChipGroup) this$0.s().findViewById(R.id.filterChipGroup)).getCheckedChipId();
                            if (checkedChipId == R.id.amountChip) {
                                str2 = "amount:asc";
                            } else if (checkedChipId == R.id.dateChip) {
                                str2 = "execution_date:desc";
                            } else {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            int checkedChipId2 = ((ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup)).getCheckedChipId();
                            if (checkedChipId2 == R.id.boughtChip) {
                                str3 = "bought";
                            } else if (checkedChipId2 == R.id.soldChip) {
                                str3 = "sold";
                            }
                            switch (((ChipGroup) this$0.s().findViewById(R.id.timeChipGroup)).getCheckedChipId()) {
                                case R.id.Month3Chip /* 2131361799 */:
                                    i12 = 90;
                                    break;
                                case R.id.Month6Chip /* 2131361800 */:
                                    i12 = 180;
                                    break;
                                case R.id.lastMonthChip /* 2131363109 */:
                                    i12 = 31;
                                    break;
                                case R.id.lastWeekChip /* 2131363110 */:
                                    i12 = 7;
                                    break;
                                case R.id.yearChip /* 2131364856 */:
                                    i12 = 365;
                                    break;
                                case R.id.yesterdayChip /* 2131364858 */:
                                    i12 = 1;
                                    break;
                                default:
                                    i12 = 0;
                                    break;
                            }
                            portfolioHistoryViewModel.i(str4, str2, str3, i12);
                        } else if (parentFragment instanceof lg.g) {
                            g0 parentFragment4 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel = (PortfolioFnoHistoryViewModel) ((lg.g) parentFragment4).r();
                            g0 parentFragment5 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            String str5 = ((PortfolioFnoHistoryViewModel) ((lg.g) parentFragment5).r()).f9816s;
                            int checkedChipId3 = ((ChipGroup) this$0.s().findViewById(R.id.filterChipGroup)).getCheckedChipId();
                            if (checkedChipId3 == R.id.amountChip) {
                                str = "amount:asc";
                            } else if (checkedChipId3 == R.id.dateChip) {
                                str = "execution_date:desc";
                            } else {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            int checkedChipId4 = ((ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup)).getCheckedChipId();
                            if (checkedChipId4 == R.id.boughtChip) {
                                str3 = "bought";
                            } else if (checkedChipId4 == R.id.soldChip) {
                                str3 = "sold";
                            }
                            switch (((ChipGroup) this$0.s().findViewById(R.id.timeChipGroup)).getCheckedChipId()) {
                                case R.id.Month3Chip /* 2131361799 */:
                                    i112 = 90;
                                    break;
                                case R.id.Month6Chip /* 2131361800 */:
                                    i112 = 180;
                                    break;
                                case R.id.lastMonthChip /* 2131363109 */:
                                    i112 = 31;
                                    break;
                                case R.id.lastWeekChip /* 2131363110 */:
                                    i112 = 7;
                                    break;
                                case R.id.yearChip /* 2131364856 */:
                                    i112 = 365;
                                    break;
                                case R.id.yesterdayChip /* 2131364858 */:
                                    i112 = 1;
                                    break;
                                default:
                                    i112 = 0;
                                    break;
                            }
                            portfolioFnoHistoryViewModel.h(str5, str, str3, Integer.valueOf(i112));
                        }
                        this$0.dismiss();
                        return;
                    default:
                        int i15 = e.f28689j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ChipGroup chipGroup = (ChipGroup) this$0.s().findViewById(R.id.filterChipGroup);
                        b[] bVarArr = b.f28686a;
                        l7.g gVar = chipGroup.f11258h;
                        mo.g gVar2 = (mo.g) ((Map) gVar.f24117c).get(Integer.valueOf(R.id.dateChip));
                        if (gVar2 != null && gVar.a(gVar2)) {
                            gVar.e();
                        }
                        ChipGroup chipGroup2 = (ChipGroup) this$0.s().findViewById(R.id.tradeTypeChipGroup);
                        d[] dVarArr = d.f28688a;
                        l7.g gVar3 = chipGroup2.f11258h;
                        mo.g gVar4 = (mo.g) ((Map) gVar3.f24117c).get(Integer.valueOf(R.id.boughtChip));
                        if (gVar4 != null && gVar3.a(gVar4)) {
                            gVar3.e();
                        }
                        ChipGroup chipGroup3 = (ChipGroup) this$0.s().findViewById(R.id.timeChipGroup);
                        c[] cVarArr = c.f28687a;
                        l7.g gVar5 = chipGroup3.f11258h;
                        mo.g gVar6 = (mo.g) ((Map) gVar5.f24117c).get(Integer.valueOf(R.id.todayChip));
                        if (gVar6 != null && gVar5.a(gVar6)) {
                            gVar5.e();
                        }
                        g0 parentFragment6 = this$0.getParentFragment();
                        if (parentFragment6 instanceof k) {
                            g0 parentFragment7 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment7, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            PortfolioHistoryViewModel portfolioHistoryViewModel2 = (PortfolioHistoryViewModel) ((k) parentFragment7).r();
                            g0 parentFragment8 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment8, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                            portfolioHistoryViewModel2.i(((PortfolioHistoryViewModel) ((k) parentFragment8).r()).f9824t, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 365);
                        } else if (parentFragment6 instanceof lg.g) {
                            g0 parentFragment9 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment9, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel2 = (PortfolioFnoHistoryViewModel) ((lg.g) parentFragment9).r();
                            g0 parentFragment10 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment10, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                            portfolioFnoHistoryViewModel2.h(((PortfolioFnoHistoryViewModel) ((lg.g) parentFragment10).r()).f9816s, null, null, null);
                        }
                        this$0.f28690i.getValue();
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
