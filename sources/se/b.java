package se;

import android.view.View;
import ba.mg;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import ge.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ut.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lse/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/mg;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<ReusedBottomSheetViewModel, mg> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34598j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f34599i = ut.h.a(new lc.b(this, 21));

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
        return R.layout.fragment_clear_search_history_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        mg mgVar = (mg) r();
        final int i10 = 0;
        mgVar.f5468s.setOnClickListener(new View.OnClickListener(this) { // from class: se.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34597b;

            {
                this.f34597b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b this$0 = this.f34597b;
                switch (i11) {
                    case 0:
                        int i12 = b.f34598j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = b.f34598j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) this$0.f34599i.getValue();
                        socialAdvancedSearchViewModel.f9432r.postValue(Boolean.FALSE);
                        nt.h c10 = socialAdvancedSearchViewModel.f9428n.deleteSocialSearchHistoryData().c(((kq.e) socialAdvancedSearchViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new vc.b(socialAdvancedSearchViewModel, 10), new q(10, new ub.f(socialAdvancedSearchViewModel, 14)));
                        c10.a(dVar);
                        socialAdvancedSearchViewModel.f9080c.c(dVar);
                        this$0.dismiss();
                        return;
                }
            }
        });
        mg mgVar2 = (mg) r();
        final int i11 = 1;
        mgVar2.f5469t.setOnClickListener(new View.OnClickListener(this) { // from class: se.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34597b;

            {
                this.f34597b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b this$0 = this.f34597b;
                switch (i112) {
                    case 0:
                        int i12 = b.f34598j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = b.f34598j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) this$0.f34599i.getValue();
                        socialAdvancedSearchViewModel.f9432r.postValue(Boolean.FALSE);
                        nt.h c10 = socialAdvancedSearchViewModel.f9428n.deleteSocialSearchHistoryData().c(((kq.e) socialAdvancedSearchViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new vc.b(socialAdvancedSearchViewModel, 10), new q(10, new ub.f(socialAdvancedSearchViewModel, 14)));
                        c10.a(dVar);
                        socialAdvancedSearchViewModel.f9080c.c(dVar);
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
