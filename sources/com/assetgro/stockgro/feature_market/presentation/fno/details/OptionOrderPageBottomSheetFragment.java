package com.assetgro.stockgro.feature_market.presentation.fno.details;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.jl;
import ca.c;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.c0;
import ea.f0;
import ek.u;
import gd.h;
import ha.s;
import ha.t;
import ha.x;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import ni.j;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionOrderPageBottomSheetFragment;", "Lgd/h;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionOrderPageBottomSheetViewModel;", "Lba/jl;", "<init>", "()V", "mt/p", "Lha/u;", "safeArgs", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionOrderPageBottomSheetFragment extends h<OptionOrderPageBottomSheetViewModel, jl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8606j = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8607i;

    @Override // gd.h, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean valueOf;
        OptionContract optionContract;
        OptionOverview optionOverview;
        boolean z10;
        boolean z11;
        FnoPortfolioHolding fnoPortfolioHolding;
        boolean z12;
        String str;
        String str2;
        Intent intent;
        Intent intent2;
        Parcelable parcelable;
        String str3;
        boolean z13;
        Parcelable parcelable2;
        Object parcelable3;
        Parcelable parcelable4;
        Object parcelable5;
        Object parcelable6;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (arguments != null && arguments.containsKey("option_bottom_sheet_contract")) {
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("OptionOrderPageBottomSheetFragment", "tag");
            a.g("Fragment is opened in a traditional way", "s", objArr, "params", "OptionOrderPageBottomSheetFragment").getClass();
            u.k(objArr);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    parcelable6 = arguments2.getParcelable("option_bottom_sheet_contract", OptionContract.class);
                    parcelable = (Parcelable) parcelable6;
                } else {
                    Parcelable parcelable7 = arguments2.getParcelable("option_bottom_sheet_contract");
                    if (!(parcelable7 instanceof OptionContract)) {
                        parcelable7 = null;
                    }
                    parcelable = (OptionContract) parcelable7;
                }
                optionContract = (OptionContract) parcelable;
                if (optionContract != null) {
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        if (i10 >= 33) {
                            parcelable5 = arguments3.getParcelable("option_bottom_sheet_identifier", OptionOverview.class);
                            parcelable4 = (Parcelable) parcelable5;
                        } else {
                            Parcelable parcelable8 = arguments3.getParcelable("option_bottom_sheet_identifier");
                            if (!(parcelable8 instanceof OptionOverview)) {
                                parcelable8 = null;
                            }
                            parcelable4 = (OptionOverview) parcelable8;
                        }
                        optionOverview = (OptionOverview) parcelable4;
                    } else {
                        optionOverview = null;
                    }
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null) {
                        valueOf = Boolean.valueOf(arguments4.getBoolean("is_sell_option"));
                    } else {
                        valueOf = null;
                    }
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null) {
                        z11 = arguments5.getBoolean("order_is_from_holdings");
                    } else {
                        z11 = false;
                    }
                    Bundle arguments6 = getArguments();
                    if (arguments6 != null) {
                        if (i10 >= 33) {
                            parcelable3 = arguments6.getParcelable("fno_portfolio_in_holdings", FnoPortfolioHolding.class);
                            parcelable2 = (Parcelable) parcelable3;
                        } else {
                            Parcelable parcelable9 = arguments6.getParcelable("fno_portfolio_in_holdings");
                            if (!(parcelable9 instanceof FnoPortfolioHolding)) {
                                parcelable9 = null;
                            }
                            parcelable2 = (FnoPortfolioHolding) parcelable9;
                        }
                        fnoPortfolioHolding = (FnoPortfolioHolding) parcelable2;
                    } else {
                        fnoPortfolioHolding = null;
                    }
                    OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = (OptionOrderPageBottomSheetViewModel) t();
                    if (fnoPortfolioHolding == null || (str3 = fnoPortfolioHolding.getPortfolioId()) == null) {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                    optionOrderPageBottomSheetViewModel.f8614m = str3;
                    if (fnoPortfolioHolding != null) {
                        z10 = fnoPortfolioHolding.isModel();
                    } else {
                        z10 = true;
                    }
                    Bundle arguments7 = getArguments();
                    if (arguments7 != null) {
                        z13 = arguments7.getBoolean("CALL_FROM_PORTFOLIO");
                    } else {
                        z13 = false;
                    }
                    this.f8607i = z13;
                }
            }
            throw new IllegalStateException("OptionContract is required".toString());
        }
        Object[] objArr2 = new Object[0];
        Intrinsics.checkNotNullParameter("OptionOrderPageBottomSheetFragment", "tag");
        a.g("Fragment is opened via Navigation Component", "s", objArr2, "params", "OptionOrderPageBottomSheetFragment").getClass();
        u.k(objArr2);
        i iVar = new i(a0.a(ha.u.class), new z1(this, 2));
        ha.u uVar = (ha.u) iVar.getValue();
        ha.u uVar2 = (ha.u) iVar.getValue();
        valueOf = Boolean.valueOf(((ha.u) iVar.getValue()).f18115c);
        ha.u uVar3 = (ha.u) iVar.getValue();
        this.f8607i = ((ha.u) iVar.getValue()).f18117e;
        optionContract = uVar.f18113a;
        optionOverview = uVar2.f18114b;
        z10 = uVar3.f18116d;
        z11 = false;
        fnoPortfolioHolding = null;
        ((OptionOrderPageBottomSheetViewModel) t()).f8609h.setValue(optionContract);
        ((OptionOrderPageBottomSheetViewModel) t()).f8610i.setValue(optionOverview);
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel2 = (OptionOrderPageBottomSheetViewModel) t();
        if (valueOf != null) {
            z12 = valueOf.booleanValue();
        } else {
            z12 = false;
        }
        optionOrderPageBottomSheetViewModel2.f8611j = z12;
        ((OptionOrderPageBottomSheetViewModel) t()).f8612k = z10;
        j0 activity = getActivity();
        if (activity != null && (intent2 = activity.getIntent()) != null) {
            str = intent2.getStringExtra("PORTFOLIO_ID");
        } else {
            str = null;
        }
        String f10 = a3.a.f("Portfolio Id: ", str);
        Object[] objArr3 = new Object[0];
        Intrinsics.checkNotNullParameter("OptionOrderPageBottomSheetFragment", "tag");
        a.g(f10, "s", objArr3, "params", "OptionOrderPageBottomSheetFragment").getClass();
        u.k(objArr3);
        Object[] objArr4 = new Object[0];
        Intrinsics.checkNotNullParameter("OptionOrderPageBottomSheetFragment", "tag");
        a.g("isModel " + z10, "s", objArr4, "params", "OptionOrderPageBottomSheetFragment").getClass();
        u.k(objArr4);
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel3 = (OptionOrderPageBottomSheetViewModel) t();
        j0 activity2 = getActivity();
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            str2 = intent.getStringExtra("PORTFOLIO_ID");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str4 = str2;
        }
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        optionOrderPageBottomSheetViewModel3.f8614m = str4;
        if (z11) {
            ((OptionOrderPageBottomSheetViewModel) t()).f8615n = fnoPortfolioHolding;
            OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel4 = (OptionOrderPageBottomSheetViewModel) t();
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                optionOrderPageBottomSheetViewModel4.f9069e.setValue(j.i("Not connected to internet"));
            } else {
                g.H(u0.f(optionOrderPageBottomSheetViewModel4), null, null, new x(optionOrderPageBottomSheetViewModel4, null), 3);
            }
        } else {
            ((OptionOrderPageBottomSheetViewModel) t()).g();
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new s(0));
        }
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        FnoRepository fnoRepository = bottomSheetDialogFragmentComponent.f14246a.e();
        g.i(fnoRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        c factory = new c(a0.a(OptionOrderPageBottomSheetViewModel.class), new c0(schedulerProvider, compositeDisposable, fnoRepository, 1));
        h hVar = f0Var.f15153a;
        h1 d10 = a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = a.h(d10, factory, defaultCreationExtras, OptionOrderPageBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(OptionOrderPageBottomSheetViewModel.class, "<this>", OptionOrderPageBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = (OptionOrderPageBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(optionOrderPageBottomSheetViewModel);
            this.f17270b = optionOrderPageBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            g.i(h11);
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
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = (OptionOrderPageBottomSheetViewModel) t();
        optionOrderPageBottomSheetViewModel.f8624w.observe(this, new f7.i(4, new t(this, 1)));
        ((OptionOrderPageBottomSheetViewModel) t()).f9070f.observe(this, new f7.i(4, new t(this, 2)));
        ((OptionOrderPageBottomSheetViewModel) t()).f8619r.observe(this, new f7.i(4, new t(this, 3)));
        ((OptionOrderPageBottomSheetViewModel) t()).f8621t.observe(this, new f7.i(4, new t(this, 4)));
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jl jlVar = (jl) r();
        jlVar.f5155s.setContent(ha.e.f18078b);
    }
}
