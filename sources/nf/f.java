package nf;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d1;
import ba.v1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.portfolio.unlock.UnlockPortfolioHostActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import d4.n1;
import d4.y0;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MainActivity mainActivity, int i10) {
        super(1);
        this.f28642a = i10;
        this.f28643b = mainActivity;
    }

    public final void a(Boolean bool) {
        wo.h hVar;
        int i10 = this.f28642a;
        MainActivity mainActivity = this.f28643b;
        switch (i10) {
            case 0:
                de.d dVar = MainActivity.f9574r;
                ((MainViewModel) mainActivity.x()).i(true);
                return;
            case 1:
                de.d dVar2 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("notification", null, 2, null));
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) NotificationsActivity.class));
                return;
            case 2:
                de.d dVar3 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("my_profile", null, 2, null));
                jr.h.u(mainActivity, 6);
                return;
            case 3:
            case 6:
            default:
                ((v1) mainActivity.w()).f6365s.f6521s.setSelectedItemId(R.id.market_fragment);
                return;
            case 4:
                de.d dVar4 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) EditProfileActivity.class));
                return;
            case 5:
                de.d dVar5 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) UnlockPortfolioHostActivity.class));
                return;
            case 7:
                de.d dVar6 = MainActivity.f9574r;
                wo.m g10 = wo.m.g(((v1) mainActivity.w()).f27491e, HttpUrl.FRAGMENT_ENCODE_SET, -2);
                BottomNavigationView bottomNavigationView = ((v1) mainActivity.w()).f6365s.f6521s;
                wo.h hVar2 = g10.f39393l;
                if (hVar2 != null) {
                    hVar2.a();
                }
                if (bottomNavigationView == null) {
                    hVar = null;
                } else {
                    hVar = new wo.h(g10, bottomNavigationView);
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.b(bottomNavigationView)) {
                        bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(hVar);
                    }
                    bottomNavigationView.addOnAttachStateChangeListener(hVar);
                }
                g10.f39393l = hVar;
                wo.j jVar = g10.f39390i;
                jVar.setBackgroundColor(-1);
                View inflate = mainActivity.getLayoutInflater().inflate(R.layout.layout_custom_snackbar, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.snackbar_text)).setText(mainActivity.getString(R.string.text_install_app));
                TextView textView = (TextView) inflate.findViewById(R.id.snackbar_action_button);
                textView.setText(mainActivity.getString(R.string.text_install));
                textView.setOnClickListener(new bb.a(10, mainActivity, g10));
                ((Snackbar$SnackbarLayout) jVar).addView(inflate, 0);
                g10.h();
                return;
            case 8:
                mainActivity.moveTaskToBack(true);
                Process.killProcess(Process.myPid());
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f28642a;
        MainActivity mainActivity = this.f28643b;
        switch (i10) {
            case 3:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    bool.booleanValue();
                    de.d dVar = MainActivity.f9574r;
                    mainActivity.y().screenNavigated("home");
                    if (!(mainActivity.f9576k instanceof gf.e)) {
                        d1 supportFragmentManager = mainActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
                        gf.e eVar = (gf.e) mainActivity.getSupportFragmentManager().C("HomeFragment");
                        if (eVar == null) {
                            int i11 = gf.e.f17361m;
                            Bundle bundle = new Bundle();
                            gf.e eVar2 = new gf.e();
                            eVar2.setArguments(bundle);
                            aVar.e(R.id.containerFragment, eVar2, "HomeFragment", 1);
                            eVar = eVar2;
                        } else {
                            aVar.o(eVar);
                        }
                        gd.m mVar = mainActivity.f9576k;
                        if (mVar != null) {
                            aVar.k(mVar);
                        }
                        aVar.h(false);
                        mainActivity.f9576k = eVar;
                        mainActivity.A(new AnalyticEvent("app_home_bottom_nav", new HashMap()));
                        mainActivity.D(new AnalyticEvent("app_home_bottom_nav", new HashMap()));
                        return;
                    }
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                Boolean bool2 = (Boolean) jVar.a();
                if (bool2 != null && bool2.booleanValue() && kj.a.f23208c) {
                    Toast.makeText(mainActivity, "Check for updates failed", 0).show();
                    return;
                }
                return;
            case 10:
                ((MainViewModel) mainActivity.x()).h();
                return;
            case 11:
                if (((Unit) jVar.a()) != null) {
                    de.d dVar2 = MainActivity.f9574r;
                    mainActivity.getClass();
                    mainActivity.A(new AnalyticEvent("notification", null, 2, null));
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) NotificationsActivity.class));
                    return;
                }
                return;
            case 12:
                Boolean bool3 = (Boolean) jVar.a();
                if (bool3 != null) {
                    bool3.booleanValue();
                    de.d dVar3 = MainActivity.f9574r;
                    mainActivity.y().screenNavigated((String) mainActivity.K().F.getValue());
                    if (!(mainActivity.f9576k instanceof nc.d)) {
                        d1 supportFragmentManager2 = mainActivity.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction(...)");
                        nc.d dVar4 = (nc.d) mainActivity.getSupportFragmentManager().C("ArenaAssetHostFragmentV2");
                        if (dVar4 == null) {
                            int i12 = nc.d.f28615i;
                            Bundle extras = mainActivity.getIntent().getExtras();
                            Bundle bundle2 = new Bundle();
                            if (extras != null) {
                                bundle2.putAll(extras);
                            }
                            dVar4 = new nc.d();
                            dVar4.setArguments(bundle2);
                            aVar2.e(R.id.containerFragment, dVar4, "ArenaAssetHostFragmentV2", 1);
                        } else {
                            aVar2.o(dVar4);
                        }
                        gd.m mVar2 = mainActivity.f9576k;
                        if (mVar2 != null) {
                            aVar2.k(mVar2);
                        }
                        aVar2.h(false);
                        mainActivity.f9576k = dVar4;
                        mainActivity.A(new AnalyticEvent("app_arena_bottom_nav", new HashMap()));
                        mainActivity.D(new AnalyticEvent("app_arena_bottom_nav", new HashMap()));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Boolean bool4 = (Boolean) jVar.a();
                if (bool4 != null) {
                    bool4.booleanValue();
                    de.d dVar5 = MainActivity.f9574r;
                    mainActivity.y().screenNavigated(mainActivity.K().G);
                    if (!(mainActivity.f9576k instanceof na.d)) {
                        d1 supportFragmentManager3 = mainActivity.getSupportFragmentManager();
                        supportFragmentManager3.getClass();
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "beginTransaction(...)");
                        na.d dVar6 = (na.d) mainActivity.getSupportFragmentManager().C("MarketAssetHostFragment");
                        if (dVar6 == null) {
                            dVar6 = new na.d();
                            aVar3.e(R.id.containerFragment, dVar6, "MarketAssetHostFragment", 1);
                        } else {
                            aVar3.o(dVar6);
                        }
                        gd.m mVar3 = mainActivity.f9576k;
                        if (mVar3 != null) {
                            aVar3.k(mVar3);
                        }
                        aVar3.h(false);
                        mainActivity.f9576k = dVar6;
                        mainActivity.A(new AnalyticEvent("app_stocks_bottom_nav", new HashMap()));
                        mainActivity.D(new AnalyticEvent("app_stocks_bottom_nav", new HashMap()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Boolean bool5 = (Boolean) jVar.a();
                if (bool5 != null) {
                    bool5.booleanValue();
                    de.d dVar7 = MainActivity.f9574r;
                    mainActivity.y().screenNavigated(mainActivity.K().H);
                    if (!(mainActivity.f9576k instanceof he.e)) {
                        d1 supportFragmentManager4 = mainActivity.getSupportFragmentManager();
                        supportFragmentManager4.getClass();
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager4);
                        Intrinsics.checkNotNullExpressionValue(aVar4, "beginTransaction(...)");
                        he.e eVar3 = (he.e) mainActivity.getSupportFragmentManager().C("SocialFragment");
                        if (eVar3 == null) {
                            int i13 = he.e.f18301m;
                            Bundle bundle3 = new Bundle();
                            he.e eVar4 = new he.e();
                            eVar4.setArguments(bundle3);
                            aVar4.e(R.id.containerFragment, eVar4, "SocialFragment", 1);
                            eVar3 = eVar4;
                        } else {
                            aVar4.o(eVar3);
                        }
                        gd.m mVar4 = mainActivity.f9576k;
                        if (mVar4 != null) {
                            aVar4.k(mVar4);
                        }
                        aVar4.h(false);
                        mainActivity.f9576k = eVar3;
                    }
                    mainActivity.A(new AnalyticEvent("app_social_bottom_nav", new HashMap()));
                    mainActivity.D(new AnalyticEvent("app_social_bottom_nav", new HashMap()));
                    return;
                }
                return;
            case 15:
                Boolean bool6 = (Boolean) jVar.a();
                if (bool6 != null) {
                    bool6.booleanValue();
                    de.d dVar8 = MainActivity.f9574r;
                    MainViewModel mainViewModel = (MainViewModel) mainActivity.x();
                    qf.b bVar = qf.b.f31941p;
                    if (mainViewModel.f9598o.b(bVar)) {
                        String string = mainActivity.getString(R.string.portfolio);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        d1 supportFragmentManager5 = mainActivity.getSupportFragmentManager();
                        supportFragmentManager5.getClass();
                        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager5);
                        Intrinsics.checkNotNullExpressionValue(aVar5, "beginTransaction(...)");
                        int i14 = qf.c.f31944h;
                        Bundle bundle4 = new Bundle();
                        bundle4.putSerializable("DATA", bVar);
                        bundle4.putBoolean("SHOW_TOOLBAR", true);
                        bundle4.putString("TOOLBAR_TITLE", string);
                        qf.c m10 = de.d.m(bundle4);
                        aVar5.e(R.id.containerFragment, m10, "MaintenanceV2Fragment", 1);
                        gd.m mVar5 = mainActivity.f9576k;
                        if (mVar5 != null) {
                            aVar5.k(mVar5);
                        }
                        aVar5.h(false);
                        mainActivity.f9576k = m10;
                    } else {
                        mainActivity.y().screenNavigated("portfolio-home");
                        if (!(mainActivity.f9576k instanceof gg.e)) {
                            d1 supportFragmentManager6 = mainActivity.getSupportFragmentManager();
                            supportFragmentManager6.getClass();
                            androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager6);
                            Intrinsics.checkNotNullExpressionValue(aVar6, "beginTransaction(...)");
                            gg.e eVar5 = (gg.e) mainActivity.getSupportFragmentManager().C("PortfolioFragment");
                            if (eVar5 == null) {
                                int i15 = gg.e.f17391j;
                                Bundle bundle5 = new Bundle();
                                gg.e eVar6 = new gg.e();
                                eVar6.setArguments(bundle5);
                                aVar6.e(R.id.containerFragment, eVar6, "PortfolioFragment", 1);
                                eVar5 = eVar6;
                            } else {
                                aVar6.o(eVar5);
                            }
                            gd.m mVar6 = mainActivity.f9576k;
                            if (mVar6 != null) {
                                aVar6.k(mVar6);
                            }
                            aVar6.h(false);
                            mainActivity.f9576k = eVar5;
                        } else {
                            return;
                        }
                    }
                    mainActivity.A(new AnalyticEvent("app_portfolio_bottom_nav", new HashMap()));
                    mainActivity.D(new AnalyticEvent("app_portfolio_bottom_nav", new HashMap()));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f28642a;
        MainActivity context = this.f28643b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                d((kj.j) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                String text = (String) obj;
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            case 8:
                a((Boolean) obj);
                return Unit.f23355a;
            case 9:
                Integer num = (Integer) obj;
                MainViewModel mainViewModel = (MainViewModel) context.x();
                dp.e appUpdateManager = context.f9582q;
                if (appUpdateManager != null) {
                    Intrinsics.c(num);
                    int intValue = num.intValue();
                    Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                    mainViewModel.f9596a0 = intValue;
                    r rVar = new r(intValue, mainViewModel, 0);
                    synchronized (appUpdateManager) {
                        appUpdateManager.f14445b.a(rVar);
                    }
                    int intValue2 = num.intValue();
                    dp.e eVar = context.f9582q;
                    if (eVar != null) {
                        context.U(intValue2, context, eVar);
                        return Unit.f23355a;
                    }
                    Intrinsics.k("appUpdateManager");
                    throw null;
                }
                Intrinsics.k("appUpdateManager");
                throw null;
            case 10:
                d((kj.j) obj);
                return Unit.f23355a;
            case 11:
                d((kj.j) obj);
                return Unit.f23355a;
            case 12:
                d((kj.j) obj);
                return Unit.f23355a;
            case 13:
                d((kj.j) obj);
                return Unit.f23355a;
            case 14:
                d((kj.j) obj);
                return Unit.f23355a;
            case 15:
                d((kj.j) obj);
                return Unit.f23355a;
            case 16:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
