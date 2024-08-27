package qg;

import android.view.View;
import b1.d;
import ba.mn;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ut.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqg/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/mn;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<ReusedBottomSheetViewModel, mn> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31950j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f31951i = ut.h.a(new ag.b(this, 10));

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
        return R.layout.fragment_sort_by_bottom_sheet_dialog;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        mn mnVar = (mn) r();
        be.b bVar = new be.b(this, 12);
        Object obj = d.f3079a;
        mnVar.f5488s.setContent(new b1.c(bVar, true, 12718306));
    }
}
