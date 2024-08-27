package c2;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPin2Fragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationFragment;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeFragment;
import com.assetgro.stockgro.prod.R;
import g7.o3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, int i10) {
        super(0);
        this.f7808a = i10;
        this.f7809b = obj;
    }

    public final LoginViewModel a() {
        int i10 = this.f7808a;
        Object obj = this.f7809b;
        switch (i10) {
            case 20:
                androidx.fragment.app.j0 activity = ((ab.c) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity).x();
            case 21:
                androidx.fragment.app.j0 activity2 = ((MobileLoginFragment) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity2).x();
            case 22:
                androidx.fragment.app.j0 activity3 = ((ForgotPinOtpFragment) obj).getActivity();
                Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity3).x();
            case 23:
                androidx.fragment.app.j0 activity4 = ((PinLoginFragment) obj).getActivity();
                Intrinsics.d(activity4, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity4).x();
            case 24:
                androidx.fragment.app.j0 activity5 = ((ReSetPin2Fragment) obj).getActivity();
                Intrinsics.d(activity5, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity5).x();
            case 25:
                androidx.fragment.app.j0 activity6 = ((MobileRegisterFragment) obj).getActivity();
                Intrinsics.d(activity6, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity6).x();
            case 26:
                androidx.fragment.app.j0 activity7 = ((NameRegisterFragment) obj).getActivity();
                Intrinsics.d(activity7, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity7).x();
            default:
                androidx.fragment.app.j0 activity8 = ((RegistrationOtpVerificationFragment) obj).getActivity();
                Intrinsics.d(activity8, "null cannot be cast to non-null type com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity");
                return (LoginViewModel) ((LoginActivity) activity8).x();
        }
    }

    public final void d() {
        int i10 = this.f7808a;
        Object obj = this.f7809b;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) obj;
                q0Var.a().E(q0Var.f7829q);
                return;
            case 1:
                i1 i1Var = ((i1) obj).f7723m;
                if (i1Var != null) {
                    i1Var.b1();
                    return;
                }
                return;
            case 2:
                ((d2.d1) obj).f13402b = null;
                return;
            case 12:
                ((qu.x1) ((qu.r) obj)).a(null);
                return;
            case 13:
                ((o3) obj).f16991k.f(Unit.f23355a);
                return;
            case 16:
                ((MarketOptionsListViewModel) ((ja.i) obj).r()).i(ja.l.f21279c);
                return;
            case 17:
                ((MarketAssetInsightsViewModel) ((sa.l) obj).r()).i(ra.e.f33559f);
                return;
            case 18:
                ((MarketStocksListViewModel) ((ta.h) obj).r()).j();
                return;
            case 28:
                ((RiaProfileViewModel) ((RiaProfileActivity) obj).x()).k(ib.a0.f19757c);
                return;
            default:
                ((MissionsHomeFragment) obj).requireActivity().finish();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [vt.q, java.lang.Object, vt.l] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        a2.u uVar;
        boolean z10;
        NavHostFragment navHostFragment;
        int i10;
        Bundle bundle;
        Object[] objArr;
        androidx.lifecycle.o lifecycle;
        int i11 = this.f7808a;
        Object obj = this.f7809b;
        switch (i11) {
            case 0:
                d();
                return Unit.f23355a;
            case 1:
                d();
                return Unit.f23355a;
            case 2:
                d();
                return Unit.f23355a;
            case 3:
                j2.a aVar = (j2.a) obj;
                return new l2.a(aVar.f20627a.f33032g.getTextLocale(), aVar.f20630d.f21964d.getText());
            case 4:
                return new k2.g(((k2.t) obj).f21964d);
            case 5:
                Object systemService = ((p2.q) obj).f30601a.getContext().getSystemService("input_method");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 6:
                return new BaseInputConnection(((p2.g0) obj).f30559a, false);
            case 7:
                t2.b bVar = (t2.b) obj;
                if (((m1.f) bVar.f35289c.getValue()).f27254a != 9205357640488583168L) {
                    t0.n1 n1Var = bVar.f35289c;
                    if (!m1.f.f(((m1.f) n1Var.getValue()).f27254a)) {
                        return bVar.f35287a.b(((m1.f) n1Var.getValue()).f27254a);
                    }
                }
                return null;
            case 8:
                z2.r rVar = (z2.r) obj;
                a2.u h10 = z2.r.h(rVar);
                if (h10 != null && h10.m()) {
                    uVar = h10;
                } else {
                    uVar = null;
                }
                if (uVar != null && rVar.m160getPopupContentSizebOM6tXw() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 9:
                return androidx.lifecycle.u0.e((androidx.lifecycle.i1) obj);
            case 10:
                NavHostFragment owner = (NavHostFragment) obj;
                Context context = owner.getContext();
                if (context != null) {
                    Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
                    Intrinsics.checkNotNullParameter(context, "context");
                    androidx.navigation.t navController = new androidx.navigation.t(context);
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    if (!Intrinsics.a(owner, navController.f2317n)) {
                        androidx.lifecycle.t tVar = navController.f2317n;
                        androidx.navigation.p pVar = navController.f2321r;
                        if (tVar != null && (lifecycle = tVar.getLifecycle()) != null) {
                            lifecycle.c(pVar);
                        }
                        navController.f2317n = owner;
                        owner.getLifecycle().a(pVar);
                    }
                    androidx.lifecycle.h1 store = owner.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(store, "viewModelStore");
                    Intrinsics.checkNotNullParameter(store, "viewModelStore");
                    Intrinsics.checkNotNullParameter(store, "viewModelStore");
                    NavControllerViewModel navControllerViewModel = navController.f2318o;
                    Intrinsics.checkNotNullParameter(store, "viewModelStore");
                    androidx.navigation.u factory = NavControllerViewModel.f2146c;
                    y4.a defaultCreationExtras = y4.a.f41149b;
                    Intrinsics.checkNotNullParameter(store, "store");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                    h.c cVar = new h.c(store, factory, defaultCreationExtras);
                    Intrinsics.checkNotNullParameter(NavControllerViewModel.class, "modelClass");
                    iu.e b10 = a3.a.b(NavControllerViewModel.class, "<this>", NavControllerViewModel.class, "modelClass", "modelClass");
                    String s7 = qu.i0.s(b10);
                    if (s7 != null) {
                        if (!Intrinsics.a(navControllerViewModel, (NavControllerViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7)))) {
                            if (navController.f2310g.isEmpty()) {
                                Intrinsics.checkNotNullParameter(store, "viewModelStore");
                                Intrinsics.checkNotNullParameter(store, "store");
                                Intrinsics.checkNotNullParameter(factory, "factory");
                                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                                h.c cVar2 = new h.c(store, factory, defaultCreationExtras);
                                Intrinsics.checkNotNullParameter(NavControllerViewModel.class, "modelClass");
                                iu.e b11 = a3.a.b(NavControllerViewModel.class, "<this>", NavControllerViewModel.class, "modelClass", "modelClass");
                                String s10 = qu.i0.s(b11);
                                if (s10 != null) {
                                    navController.f2318o = (NavControllerViewModel) cVar2.G(b11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s10));
                                } else {
                                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                                }
                            } else {
                                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
                            }
                        }
                        Intrinsics.checkNotNullParameter(navController, "navHostController");
                        Intrinsics.checkNotNullParameter(navController, "navController");
                        androidx.navigation.w0 w0Var = navController.f2324u;
                        Context requireContext = owner.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                        androidx.fragment.app.d1 childFragmentManager = owner.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                        w0Var.a(new f7.e(requireContext, childFragmentManager));
                        Context requireContext2 = owner.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                        androidx.fragment.app.d1 childFragmentManager2 = owner.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
                        int id2 = owner.getId();
                        if (id2 == 0 || id2 == -1) {
                            id2 = R.id.nav_host_fragment_container;
                        }
                        navController.f2324u.a(new FragmentNavigator(requireContext2, childFragmentManager2, id2));
                        Bundle a10 = owner.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                        if (a10 != null) {
                            a10.setClassLoader(context.getClassLoader());
                            navController.f2307d = a10.getBundle("android-support-nav:controller:navigatorState");
                            navController.f2308e = a10.getParcelableArray("android-support-nav:controller:backStack");
                            LinkedHashMap linkedHashMap = navController.f2316m;
                            linkedHashMap.clear();
                            int[] intArray = a10.getIntArray("android-support-nav:controller:backStackDestIds");
                            ArrayList<String> stringArrayList = a10.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (intArray != null && stringArrayList != null) {
                                int length = intArray.length;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < length) {
                                    navController.f2315l.put(Integer.valueOf(intArray[i12]), stringArrayList.get(i13));
                                    i12++;
                                    i13++;
                                }
                            }
                            ArrayList<String> stringArrayList2 = a10.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 != null) {
                                for (String id3 : stringArrayList2) {
                                    Parcelable[] parcelableArray = a10.getParcelableArray("android-support-nav:controller:backStackStates:" + id3);
                                    if (parcelableArray != null) {
                                        Intrinsics.checkNotNullExpressionValue(id3, "id");
                                        int length2 = parcelableArray.length;
                                        ?? lVar = new vt.l();
                                        if (length2 == 0) {
                                            objArr = vt.q.f38329e;
                                        } else if (length2 > 0) {
                                            objArr = new Object[length2];
                                        } else {
                                            throw new IllegalArgumentException(jr.h.n("Illegal Capacity: ", length2));
                                        }
                                        lVar.f38331b = objArr;
                                        t.m0 U = zq.f.U(parcelableArray);
                                        while (U.hasNext()) {
                                            Parcelable parcelable = (Parcelable) U.next();
                                            Intrinsics.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                            lVar.h((androidx.navigation.o) parcelable);
                                        }
                                        linkedHashMap.put(id3, lVar);
                                    }
                                }
                            }
                            navController.f2309f = a10.getBoolean("android-support-nav:controller:deepLinkHandled");
                        }
                        owner.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new androidx.activity.d(navController, 4));
                        Bundle a11 = owner.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                        if (a11 != null) {
                            navHostFragment = owner;
                            navHostFragment.f2205c = a11.getInt("android-support-nav:fragment:graphId");
                        } else {
                            navHostFragment = owner;
                        }
                        navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new androidx.activity.d(navHostFragment, 5));
                        int i14 = navHostFragment.f2205c;
                        if (i14 != 0) {
                            navController.x(((androidx.navigation.i0) navController.B.getValue()).b(i14), null);
                        } else {
                            Bundle arguments = navHostFragment.getArguments();
                            if (arguments != null) {
                                i10 = arguments.getInt("android-support-nav:fragment:graphId");
                            } else {
                                i10 = 0;
                            }
                            if (arguments != null) {
                                bundle = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
                            } else {
                                bundle = null;
                            }
                            if (i10 != 0) {
                                navController.w(i10, bundle);
                            }
                        }
                        return navController;
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            case 11:
                g7.j1 j1Var = (g7.j1) vt.g0.w(((g7.h0) ((g7.d1) obj).f16707b.f31450b).f16803a.b());
                if (j1Var != null && (j1Var instanceof g7.g1)) {
                    g7.g1 g1Var = (g7.g1) j1Var;
                    if (g1Var.f16785a == g7.b1.f16663a) {
                        return g1Var;
                    }
                }
                return null;
            case 12:
                d();
                return Unit.f23355a;
            case 13:
                d();
                return Unit.f23355a;
            case 14:
                return Integer.valueOf(((DialogContentLayout) obj).getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
            case 15:
                return Float.valueOf(((Number) ((n9.i) ((n9.b) obj)).getValue()).floatValue());
            case 16:
                d();
                return Unit.f23355a;
            case 17:
                d();
                return Unit.f23355a;
            case 18:
                d();
                return Unit.f23355a;
            case 19:
                androidx.fragment.app.g0 parentFragment = ((ua.a) obj).getParentFragment();
                Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListFragment");
                return (MarketStocksListViewModel) ((ta.h) parentFragment).r();
            case 20:
                return a();
            case 21:
                return a();
            case 22:
                return a();
            case 23:
                return a();
            case 24:
                return a();
            case 25:
                return a();
            case 26:
                return a();
            case 27:
                return a();
            case 28:
                d();
                return Unit.f23355a;
            default:
                d();
                return Unit.f23355a;
        }
    }
}
