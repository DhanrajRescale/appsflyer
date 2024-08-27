package ab;

import android.view.View;
import androidx.lifecycle.h1;
import ba.sq;
import c2.p0;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.CountrySelectBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lab/c;", "Lgd/h;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/mobile/CountrySelectBottomSheetViewModel;", "Lba/sq;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends gd.h<CountrySelectBottomSheetViewModel, sq> {

    /* renamed from: i, reason: collision with root package name */
    public a f286i;

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f287j = ut.h.a(new p0(this, 20));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(CountrySelectBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 1));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, CountrySelectBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(CountrySelectBottomSheetViewModel.class, "<this>", CountrySelectBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            CountrySelectBottomSheetViewModel countrySelectBottomSheetViewModel = (CountrySelectBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(countrySelectBottomSheetViewModel);
            this.f17270b = countrySelectBottomSheetViewModel;
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
        return R.layout.layout_country_select_bottom_sheet_fragment;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((LoginViewModel) this.f287j.getValue()).f8710v.observe(this, new f7.i(24, new b(this, 0)));
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f286i = new a(lifecycle, new b(this, 1));
        sq sqVar = (sq) r();
        a aVar = this.f286i;
        if (aVar != null) {
            sqVar.f6117s.setAdapter(aVar);
        } else {
            Intrinsics.k("countryListAdapter");
            throw null;
        }
    }
}
