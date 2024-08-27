package ka;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.jl;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lka/i;", "Lgd/h;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/order/ModifyOrderPageBottomSheetViewModel;", "Lba/jl;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends gd.h<ModifyOrderPageBottomSheetViewModel, jl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f22796j = 0;

    /* renamed from: i, reason: collision with root package name */
    public String f22797i = HttpUrl.FRAGMENT_ENCODE_SET;

    @Override // gd.h, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new ha.s(1));
        }
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        ea.f0 f0Var = (ea.f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        FnoRepository fnoRepository = bottomSheetDialogFragmentComponent.f14246a.e();
        yk.g.i(fnoRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        ca.c factory = new ca.c(iu.a0.a(ModifyOrderPageBottomSheetViewModel.class), new ea.c0(schedulerProvider, compositeDisposable, fnoRepository, 0));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, ModifyOrderPageBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyOrderPageBottomSheetViewModel.class, "<this>", ModifyOrderPageBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = (ModifyOrderPageBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyOrderPageBottomSheetViewModel);
            this.f17270b = modifyOrderPageBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            ls.n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_option_order_detail_bottom_sheet;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((ModifyOrderPageBottomSheetViewModel) t()).f9070f.observe(this, new f7.i(8, new f(this, 0)));
        ((ModifyOrderPageBottomSheetViewModel) t()).f8634i.observe(this, new f7.i(8, new f(this, 1)));
        ((ModifyOrderPageBottomSheetViewModel) t()).f8645t.observe(this, new f7.i(8, new f(this, 2)));
        ((ModifyOrderPageBottomSheetViewModel) t()).f8636k.observe(this, new f7.i(8, new f(this, 3)));
    }

    @Override // gd.h
    public final void z(View view) {
        String orderId;
        String str;
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        ((jl) r()).p(getViewLifecycleOwner());
        Bundle arguments = getArguments();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (arguments == null || (orderId = arguments.getString("ORDERID")) == null) {
            orderId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        this.f22797i = str2;
        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = (ModifyOrderPageBottomSheetViewModel) t();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z10 = arguments3.getBoolean("IS_MODEL", true);
        } else {
            z10 = true;
        }
        modifyOrderPageBottomSheetViewModel.f8643r = z10;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.getBoolean("CALL_FROM_PORTFOLIO");
        }
        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel2 = (ModifyOrderPageBottomSheetViewModel) t();
        String portfolioId = this.f22797i;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            modifyOrderPageBottomSheetViewModel2.f9069e.setValue(ni.j.i("Not connected to internet"));
        } else {
            try {
                yk.g.H(androidx.lifecycle.u0.f(modifyOrderPageBottomSheetViewModel2), null, null, new g0(modifyOrderPageBottomSheetViewModel2, orderId, portfolioId, null), 3);
            } catch (Exception unused) {
                modifyOrderPageBottomSheetViewModel2.f9070f.setValue(Boolean.FALSE);
            }
        }
        ((jl) r()).f5155s.setContent(b.f22744b);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ga.j(view, 1));
    }
}
