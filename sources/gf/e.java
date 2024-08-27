package gf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.b1;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import b3.t;
import b5.s0;
import ba.ai;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.presentation.MissionsHostActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.i0;
import ea.n0;
import iu.a0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgf/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/home/HomeViewModel;", "Lba/ai;", "Lni/l;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends gd.m<HomeViewModel, ai> implements ni.l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17361m = 0;

    /* renamed from: g, reason: collision with root package name */
    public final e.c f17362g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17363h;

    /* renamed from: i, reason: collision with root package name */
    public final b1 f17364i;

    /* renamed from: j, reason: collision with root package name */
    public final e.c f17365j;

    /* renamed from: k, reason: collision with root package name */
    public MainSharedViewModel f17366k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17367l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [f.a, java.lang.Object] */
    public e() {
        e.c registerForActivityResult = registerForActivityResult(new f.b(1), new s0(1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f17362g = registerForActivityResult;
        this.f17363h = 23023;
        iu.e viewModelClass = a0.a(MainViewModel.class);
        z1 storeProducer = new z1(this, 22);
        ad.f extrasProducer = new ad.f(8, null, this);
        z1 z1Var = new z1(this, 23);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f17364i = new b1(viewModelClass, storeProducer, z1Var, extrasProducer);
        e.c registerForActivityResult2 = registerForActivityResult(new Object(), new t(this, 6));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f17365j = registerForActivityResult2;
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_home;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MainViewModel) this.f17364i.getValue()).T.observe(this, new re.d(11, new b(this, 2)));
        H().A.observe(this, new re.d(11, new b(this, 3)));
        H().f9593x.observe(this, new re.d(11, new b(this, 4)));
        ((HomeViewModel) r()).F.observe(this, new re.d(11, new b(this, 5)));
        ((HomeViewModel) r()).I.observe(this, new re.d(11, new b(this, 6)));
        ((HomeViewModel) r()).J.observe(this, new re.d(11, new b(this, 7)));
        ((HomeViewModel) r()).f9548q.observe(this, new re.d(11, new b(this, 8)));
        ((HomeViewModel) r()).f9549r.observe(this, new re.d(11, new b(this, 9)));
        H().P.observe(this, new re.d(11, new b(this, 10)));
        ((HomeViewModel) r()).f9552u.observe(this, new re.d(11, new b(this, 0)));
        ((HomeViewModel) r()).f9553v.observe(this, new re.d(11, new b(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        PackageInfo packageInfo;
        int i10;
        PackageManager.PackageInfoFlags of2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(view, "view");
        final int i11 = 1;
        setHasOptionsMenu(true);
        ((ai) q()).p(this);
        Toolbar toolbar = ((ai) q()).f4205u;
        toolbar.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        toolbar.n(R.menu.menu_home_fragment);
        toolbar.getMenu().findItem(R.id.menu_item_missions).setVisible(!kj.a.f23207b);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: gf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f17353b;

            {
                this.f17353b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                e this$0 = this.f17353b;
                switch (i13) {
                    case 0:
                        int i14 = e.f17361m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i15 = e.f17361m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        Intrinsics.checkNotNullParameter("app_homepage_missions_animation_tapped", "eventName");
                        this$0.B(new AnalyticEvent("app_homepage_missions_animation_tapped", null, 2, null));
                        this$0.f17365j.a(new Intent(this$0.requireActivity(), (Class<?>) MissionsHostActivity.class));
                        return;
                    default:
                        int i16 = e.f17361m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H().j();
                        return;
                }
            }
        });
        p(toolbar);
        Menu menu = toolbar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.menu_item_missions).getActionView();
        if (actionView != null && (constraintLayout2 = (ConstraintLayout) actionView.findViewById(R.id.missions_menu_layout)) != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: gf.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f17353b;

                {
                    this.f17353b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i11;
                    e this$0 = this.f17353b;
                    switch (i13) {
                        case 0:
                            int i14 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i15 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            Intrinsics.checkNotNullParameter("app_homepage_missions_animation_tapped", "eventName");
                            this$0.B(new AnalyticEvent("app_homepage_missions_animation_tapped", null, 2, null));
                            this$0.f17365j.a(new Intent(this$0.requireActivity(), (Class<?>) MissionsHostActivity.class));
                            return;
                        default:
                            int i16 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().j();
                            return;
                    }
                }
            });
        }
        View actionView2 = menu.findItem(R.id.menu_item_notifications).getActionView();
        if (actionView2 != null && (constraintLayout = (ConstraintLayout) actionView2.findViewById(R.id.menu_notification_layout)) != null) {
            final int i13 = 2;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gf.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f17353b;

                {
                    this.f17353b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i132 = i13;
                    e this$0 = this.f17353b;
                    switch (i132) {
                        case 0:
                            int i14 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i15 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            Intrinsics.checkNotNullParameter("app_homepage_missions_animation_tapped", "eventName");
                            this$0.B(new AnalyticEvent("app_homepage_missions_animation_tapped", null, 2, null));
                            this$0.f17365j.a(new Intent(this$0.requireActivity(), (Class<?>) MissionsHostActivity.class));
                            return;
                        default:
                            int i16 = e.f17361m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().j();
                            return;
                    }
                }
            });
        }
        toolbar.setNavigationIcon(R.drawable.ic_drawer_new_v2);
        ai aiVar = (ai) q();
        d dVar = new d(this, i11);
        Object obj = b1.d.f3079a;
        aiVar.f4204t.setContent(new b1.c(dVar, true, -742611339));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        PackageManager packageManager = requireContext.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        String packageName = requireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int i14 = kj.f.f23221a;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            of2 = PackageManager.PackageInfoFlags.of(0);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
            Intrinsics.c(packageInfo);
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            Intrinsics.c(packageInfo);
        }
        long convert = TimeUnit.MINUTES.convert(System.currentTimeMillis() - packageInfo.firstInstallTime, TimeUnit.MILLISECONDS);
        String a10 = ((HomeViewModel) r()).f9546o.a("rdft", "minutes", "2880");
        if (a10.length() > 0) {
            i10 = Integer.parseInt(a10);
        } else {
            i10 = 2880;
        }
        if (convert >= i10) {
            if (i15 <= 28) {
                this.f17362g.a("android.permission.READ_EXTERNAL_STORAGE");
            }
            HomeViewModel homeViewModel = (HomeViewModel) r();
            UserRepository userRepository = homeViewModel.f9081d;
            int parseInt = Integer.parseInt(userRepository.getPrivacyPolicyVersion());
            int parseInt2 = Integer.parseInt(homeViewModel.f9546o.a("dppvn", "version", "0"));
            e0 e0Var = homeViewModel.I;
            if (parseInt2 > parseInt) {
                userRepository.setPrivacyPolicyVersion(String.valueOf(parseInt2));
                e0Var.postValue(Boolean.TRUE);
            } else {
                e0Var.postValue(Boolean.FALSE);
            }
            HomeViewModel homeViewModel2 = (HomeViewModel) r();
            UserRepository userRepository2 = homeViewModel2.f9081d;
            int parseInt3 = Integer.parseInt(userRepository2.getTermsAndConditionVersion());
            int parseInt4 = Integer.parseInt(homeViewModel2.f9546o.a("dtacvn", "version", "0"));
            e0 e0Var2 = homeViewModel2.J;
            if (parseInt4 > parseInt3) {
                userRepository2.setTermsAndConditionVersion(String.valueOf(parseInt4));
                e0Var2.postValue(Boolean.TRUE);
            } else {
                e0Var2.postValue(Boolean.FALSE);
            }
            this.f17367l = true;
        }
    }

    public final MainSharedViewModel H() {
        MainSharedViewModel mainSharedViewModel = this.f17366k;
        if (mainSharedViewModel != null) {
            return mainSharedViewModel;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // ni.l
    public final void c(StockDto stockDto) {
        String str;
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        j0 activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
            bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
            bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
            bundle.putString("STOCK_NAME", stockDto.getCode());
            bundle.putString("PORTFOLIO_ID", str);
            intent.putExtras(bundle);
            requireActivity().startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == this.f17363h && i11 == -1) {
            H().f9590u.postValue(Boolean.TRUE);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (!z10) {
            ((HomeViewModel) r()).f9550s = false;
            ((HomeViewModel) r()).j(hf.h.f18373c);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((HomeViewModel) r()).C;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((HomeViewModel) r()).j(hf.h.f18373c);
        H().f9593x.setValue("HomeFragment");
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        TopChartsRepository topChartsRepository = (TopChartsRepository) bVar.f14269u.get();
        yk.g.i(topChartsRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        mj.a remoteConfigUtils = (mj.a) bVar.B.get();
        yk.g.i(remoteConfigUtils);
        PaymentRepository paymentRepository = bVar.i();
        yk.g.i(paymentRepository);
        jj.a appsFlyerAnalyticsEngineImpl = bVar.n();
        yk.g.i(appsFlyerAnalyticsEngineImpl);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(remoteConfigUtils, "remoteConfigUtils");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        ca.c factory = new ca.c(a0.a(HomeViewModel.class), new i0(k10, c10, topChartsRepository, userRepository, remoteConfigUtils, paymentRepository, appsFlyerAnalyticsEngineImpl));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, HomeViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(HomeViewModel.class, "<this>", HomeViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            HomeViewModel homeViewModel = (HomeViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(homeViewModel);
            this.f17284b = homeViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f17366k = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
