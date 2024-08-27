package kh;

import android.view.View;
import androidx.lifecycle.h1;
import ba.ih;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.FilterRecentPerformanceBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import y.q0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkh/d;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/profile/statistics/FilterRecentPerformanceBottomSheetViewModel;", "Lba/ih;", "<init>", "()V", "yk/g", "Lkh/m;", "selectedChoice", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends gd.h<FilterRecentPerformanceBottomSheetViewModel, ih> {

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f23121i = ut.h.a(new c(this, 0));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        ea.f0 f0Var = (ea.f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(iu.a0.a(FilterRecentPerformanceBottomSheetViewModel.class), new ea.b0(schedulerProvider, compositeDisposable, 3));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, FilterRecentPerformanceBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(FilterRecentPerformanceBottomSheetViewModel.class, "<this>", FilterRecentPerformanceBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            FilterRecentPerformanceBottomSheetViewModel filterRecentPerformanceBottomSheetViewModel = (FilterRecentPerformanceBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(filterRecentPerformanceBottomSheetViewModel);
            this.f17270b = filterRecentPerformanceBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_filter_recent_performance_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List g10 = vt.y.g(m.f23151d, m.f23152e, m.f23153f, m.f23154g, m.f23155h);
        ih ihVar = (ih) r();
        q0 q0Var = new q0(26, this, g10);
        Object obj = b1.d.f3079a;
        ihVar.f5046s.setContent(new b1.c(q0Var, true, -1987606116));
    }
}
