package com.assetgro.stockgro.ui.main;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.ke;
import ba.v1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.enums.ChatStates;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.webengage.sdk.android.Analytics;
import de.d;
import dp.e;
import ea.p;
import ea.v;
import el.l;
import gd.b;
import gd.m;
import h.a0;
import i0.d1;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import jr.h;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import ls.n0;
import nf.f;
import nf.q;
import nf.s;
import nf.t;
import nf.x;
import of.c;
import okhttp3.HttpUrl;
import qu.i0;
import qu.r0;
import r3.k;
import yk.g;
import zn.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/main/MainActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/main/MainViewModel;", "Lba/v1;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MainActivity extends b {

    /* renamed from: r, reason: collision with root package name */
    public static final d f9574r = new d(14, 0);

    /* renamed from: s, reason: collision with root package name */
    public static int f9575s;

    /* renamed from: k, reason: collision with root package name */
    public m f9576k;

    /* renamed from: l, reason: collision with root package name */
    public View f9577l;

    /* renamed from: m, reason: collision with root package name */
    public a f9578m;

    /* renamed from: n, reason: collision with root package name */
    public c f9579n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f9580o = new a0(this, 7);

    /* renamed from: p, reason: collision with root package name */
    public MainSharedViewModel f9581p;

    /* renamed from: q, reason: collision with root package name */
    public e f9582q;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_main;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        int i10 = 16;
        K().D.observe(this, new re.d(16, new nf.b(this, 11)));
        int i11 = 3;
        ((MainViewModel) h.k(16, new nf.b(this, 22), K().f9587r, this)).f9599p.observe(this, new re.d(16, new f(this, i11)));
        int i12 = 12;
        ((MainViewModel) x()).f9600q.observe(this, new re.d(16, new f(this, i12)));
        int i13 = 13;
        ((MainViewModel) x()).f9601r.observe(this, new re.d(16, new f(this, i13)));
        int i14 = 14;
        ((MainViewModel) x()).f9602s.observe(this, new re.d(16, new f(this, i14)));
        int i15 = 15;
        ((MainViewModel) x()).f9603t.observe(this, new re.d(16, new f(this, i15)));
        ((MainViewModel) x()).U.observe(this, new re.d(16, new f(this, i10)));
        int i16 = 17;
        K().f9588s.observe(this, new re.d(16, new f(this, i16)));
        int i17 = 1;
        K().f9589t.observe(this, new re.d(16, new nf.b(this, i17)));
        int i18 = 2;
        K().f9590u.observe(this, new re.d(16, new nf.b(this, i18)));
        K().f9591v.observe(this, new re.d(16, new nf.b(this, i11)));
        int i19 = 4;
        int i20 = 5;
        ((MainViewModel) h.k(16, new nf.b(this, i19), K().R, this)).T.observe(this, new re.d(16, new nf.b(this, i20)));
        int i21 = 6;
        K().L.observe(this, new re.d(16, new nf.b(this, i21)));
        int i22 = 7;
        int i23 = 10;
        ((MainViewModel) h.k(16, new nf.b(this, 29), ((MainViewModel) h.k(16, new nf.b(this, 28), ((MainViewModel) h.k(16, new nf.b(this, 27), ((MainViewModel) h.k(16, new nf.b(this, 26), ((MainViewModel) h.k(16, new nf.b(this, 25), ((MainViewModel) h.k(16, new nf.b(this, 24), ((MainViewModel) h.k(16, new nf.b(this, 23), ((MainViewModel) h.k(16, new nf.b(this, 21), ((MainViewModel) h.k(16, new nf.b(this, 20), ((MainViewModel) h.k(16, new nf.b(this, 19), ((MainViewModel) h.k(16, new nf.b(this, 18), ((MainViewModel) h.k(16, new nf.b(this, i16), ((MainViewModel) h.k(16, new nf.b(this, i10), ((MainViewModel) h.k(16, new nf.b(this, i15), ((MainViewModel) h.k(16, new nf.b(this, i14), ((MainViewModel) h.k(16, new nf.b(this, i13), ((MainViewModel) h.k(16, new nf.b(this, i12), ((MainViewModel) h.k(16, new nf.b(this, i23), ((MainViewModel) h.k(16, new nf.b(this, 9), ((MainViewModel) h.k(16, new nf.b(this, 8), ((MainViewModel) h.k(16, new nf.b(this, i22), K().f9594y, this)).V, this)).W, this)).X, this)).Y, this)).f9604u, this)).f9605v, this)).f9607x, this)).f9606w, this)).f9608y, this)).f9609z, this)).A, this)).B, this)).C, this)).D, this)).E, this)).F, this)).G, this)).H, this)).I, this)).J, this)).K.observe(this, new re.d(16, new f(this, 0)));
        ((MainViewModel) x()).O.observe(this, new re.d(16, new f(this, i17)));
        ((MainViewModel) x()).L.observe(this, new re.d(16, new f(this, i18)));
        ((MainViewModel) x()).M.observe(this, new re.d(16, new f(this, i19)));
        ((MainViewModel) x()).N.observe(this, new re.d(16, new f(this, i20)));
        ((MainViewModel) x()).S.observe(this, new re.d(16, new f(this, i21)));
        ((MainViewModel) x()).P.observe(this, new re.d(16, new f(this, i22)));
        ((MainViewModel) x()).Q.observe(this, new re.d(16, new f(this, 8)));
        ((MainViewModel) x()).R.observe(this, new re.d(16, new f(this, 9)));
        K().f9595z.observe(this, new re.d(16, new f(this, i23)));
        K().N.observe(this, new re.d(16, new f(this, 11)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        String countryCode;
        final int i10 = 0;
        ((MainViewModel) x()).i(false);
        ke keVar = ((v1) w()).f6366t.f5499t;
        if (kj.a.f23207b) {
            ImageView icMissions = keVar.f5229w;
            Intrinsics.checkNotNullExpressionValue(icMissions, "icMissions");
            zq.f.M(icMissions);
            TextView missionsText = keVar.f5232z;
            Intrinsics.checkNotNullExpressionValue(missionsText, "missionsText");
            zq.f.M(missionsText);
            MaterialCardView newTagContainer = keVar.B;
            Intrinsics.checkNotNullExpressionValue(newTagContainer, "newTagContainer");
            zq.f.M(newTagContainer);
            ImageView followFollowing = keVar.f5228v;
            Intrinsics.checkNotNullExpressionValue(followFollowing, "followFollowing");
            zq.f.m0(followFollowing);
            TextView textFollowFollowing = keVar.E;
            Intrinsics.checkNotNullExpressionValue(textFollowFollowing, "textFollowFollowing");
            zq.f.m0(textFollowFollowing);
        } else {
            ImageView icMissions2 = keVar.f5229w;
            Intrinsics.checkNotNullExpressionValue(icMissions2, "icMissions");
            zq.f.m0(icMissions2);
            TextView missionsText2 = keVar.f5232z;
            Intrinsics.checkNotNullExpressionValue(missionsText2, "missionsText");
            zq.f.m0(missionsText2);
            MaterialCardView newTagContainer2 = keVar.B;
            Intrinsics.checkNotNullExpressionValue(newTagContainer2, "newTagContainer");
            zq.f.m0(newTagContainer2);
            ImageView followFollowing2 = keVar.f5228v;
            Intrinsics.checkNotNullExpressionValue(followFollowing2, "followFollowing");
            zq.f.M(followFollowing2);
            TextView textFollowFollowing2 = keVar.E;
            Intrinsics.checkNotNullExpressionValue(textFollowFollowing2, "textFollowFollowing");
            zq.f.M(textFollowFollowing2);
        }
        final int i11 = 1;
        if (k.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == -1) {
            q3.h.a(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
        final int i12 = 3;
        g.H(hl.f.d(r0.f32256b), null, null, new nf.h(this, null), 3);
        View findViewById = findViewById(R.id.nav_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        NavigationView navigationView = (NavigationView) findViewById;
        navigationView.getLayoutParams().width = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * 0.8d);
        navigationView.requestLayout();
        e Y0 = dp.b.Y0(this);
        Intrinsics.checkNotNullExpressionValue(Y0, "create(...)");
        this.f9582q = Y0;
        ((MainViewModel) x()).f9081d.checkAndUpdateNewFirebaseToken();
        ((MainViewModel) x()).f9599p.postValue(new j(Boolean.TRUE));
        ((v1) w()).f6366t.f5499t.f5231y.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i10;
                MainActivity this$0 = this.f28634b;
                switch (i13) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i13 = 5;
        ((v1) w()).f6366t.f5499t.A.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i13;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i14 = 6;
        ((v1) w()).f6366t.f5499t.D.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i14;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        ((v1) w()).f6366t.f5498s.f5033v.setVisibility(0);
        final int i15 = 7;
        ((v1) w()).f6366t.f5498s.f5033v.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i15;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i16 = 8;
        ((v1) w()).f6366t.f5498s.f5035x.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i16;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i17 = 9;
        ((v1) w()).f6366t.f5499t.f5226t.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i17;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i18 = 10;
        ((v1) w()).f6366t.f5499t.f5227u.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i18;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i19 = 11;
        ((v1) w()).f6366t.f5499t.F.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i19;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i20 = 12;
        ((v1) w()).f6366t.f5499t.C.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i20;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i21 = 13;
        ((v1) w()).f6366t.f5499t.f5230x.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i21;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        ((v1) w()).f6366t.f5498s.f5031t.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i11;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i22 = 2;
        ((v1) w()).f6366t.f5498s.f5032u.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i22;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        ((v1) w()).f6366t.f5499t.G.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i12;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        final int i23 = 4;
        ((v1) w()).f6366t.f5499t.f5225s.setOnClickListener(new View.OnClickListener(this) { // from class: nf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f28634b;

            {
                this.f28634b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i23;
                MainActivity this$0 = this.f28634b;
                switch (i132) {
                    case 0:
                        de.d dVar = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("logout", null, 2, null));
                        this$0.K().h(false);
                        return;
                    case 1:
                        de.d dVar2 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.Q();
                        return;
                    case 2:
                        de.d dVar3 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("stockgro_club", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.N();
                        return;
                    case 3:
                        de.d dVar4 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("check_update", null, 2, null));
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        MainViewModel mainViewModel = (MainViewModel) this$0.x();
                        dp.e appUpdateManager = this$0.f9582q;
                        if (appUpdateManager != null) {
                            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                            mainViewModel.f9596a0 = 0;
                            r rVar = new r(0, mainViewModel, 0);
                            synchronized (appUpdateManager) {
                                appUpdateManager.f14445b.a(rVar);
                            }
                            dp.e eVar = this$0.f9582q;
                            if (eVar != null) {
                                this$0.U(0, this$0, eVar);
                                kj.a.f23208c = true;
                                return;
                            } else {
                                Intrinsics.k("appUpdateManager");
                                throw null;
                            }
                        }
                        Intrinsics.k("appUpdateManager");
                        throw null;
                    case 4:
                        de.d dVar5 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.A(new AnalyticEvent("about", null, 2, null));
                        jr.h.u(this$0, 0);
                        return;
                    case 5:
                        de.d dVar6 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        if (kj.a.f23207b) {
                            this$0.L();
                            return;
                        }
                        Intrinsics.checkNotNullParameter("app_ham_menu_missions", "eventName");
                        this$0.E(new AnalyticEvent("app_ham_menu_missions", null, 2, null));
                        jr.h.u(this$0, 5);
                        return;
                    case 6:
                        de.d dVar7 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.O();
                        return;
                    case 7:
                        de.d dVar8 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.M();
                        return;
                    case 8:
                        de.d dVar9 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("my_profile", null, 2, null));
                        jr.h.u(this$0, 6);
                        return;
                    case 9:
                        de.d dVar10 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                        jr.h.u(this$0, 1);
                        return;
                    case 10:
                        de.d dVar11 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("faq", null, 2, null));
                        jr.h.u(this$0, 2);
                        return;
                    case 11:
                        de.d dVar12 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P();
                        return;
                    case 12:
                        de.d dVar13 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("rate_app", null, 2, null));
                        jr.h.u(this$0, 7);
                        return;
                    default:
                        de.d dVar14 = MainActivity.f9574r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.FALSE);
                        this$0.A(new AnalyticEvent("invite_friend", null, 2, null));
                        jr.h.u(this$0, 3);
                        return;
                }
            }
        });
        ((v1) w()).f6365s.f6521s.setItemIconTintList(null);
        View childAt = ((v1) w()).f6365s.f6521s.getChildAt(0);
        Intrinsics.d(childAt, "null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationMenuView");
        View childAt2 = ((zn.b) childAt).getChildAt(4);
        Intrinsics.d(childAt2, "null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationItemView");
        this.f9578m = (a) childAt2;
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_chat_badge, (ViewGroup) ((v1) w()).f6365s.f6521s, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f9577l = inflate;
        a aVar = this.f9578m;
        if (aVar != null) {
            if (inflate != null) {
                aVar.addView(inflate);
                ((v1) w()).f6365s.f6521s.setOnNavigationItemSelectedListener(new vc.b(this, i21));
                ((v1) w()).f6366t.f5499t.H.setText("Version: 1.11.9");
                K().f9593x.postValue("HomeFragment");
                MainViewModel mainViewModel = (MainViewModel) x();
                try {
                    ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                    Intrinsics.checkNotNullExpressionValue(list, "list(...)");
                    Iterator it = list.iterator();
                    loop0: while (it.hasNext()) {
                        ArrayList<InetAddress> list2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses());
                        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
                        for (InetAddress inetAddress : list2) {
                            if (!inetAddress.isLoopbackAddress()) {
                                str = inetAddress.getHostAddress();
                                Intrinsics.checkNotNullExpressionValue(str, "getHostAddress(...)");
                                if (w.z(str, ':', 0, false, 6) < 0) {
                                    break loop0;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                Bundle extras = getIntent().getExtras();
                if (extras == null || (countryCode = extras.getString("CURRENT_COUNTRY")) == null) {
                    countryCode = "IN";
                }
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                UserRepository userRepository = mainViewModel.f9081d;
                at.m<BaseResponseDto<Object>> userStatus = userRepository.getUserStatus(str, userRepository.getUserPhoneNumber(), countryCode);
                kq.e eVar = (kq.e) mainViewModel.f9079b;
                nt.h hVar = new nt.h(userStatus.c(eVar.J()), eVar.Q(), i10);
                jt.d dVar = new jt.d(new jf.g(17, new s(mainViewModel, i10)), new jf.g(18, nf.m.f28655e));
                hVar.a(dVar);
                mainViewModel.f9080c.c(dVar);
                v1 v1Var = (v1) w();
                nf.g gVar = new nf.g(this);
                DrawerLayout drawerLayout = v1Var.f6367u;
                if (drawerLayout.f1566t == null) {
                    drawerLayout.f1566t = new ArrayList();
                }
                drawerLayout.f1566t.add(gVar);
                S();
                if (WifiService.INSTANCE.getInstance().isOnline()) {
                    g.H(hl.f.d(r0.f32256b), null, null, new nf.e(this, null), 3);
                    return;
                }
                return;
            }
            Intrinsics.k("socialBadge");
            throw null;
        }
        Intrinsics.k("bottomNavigationItemView");
        throw null;
    }

    public final MainSharedViewModel K() {
        MainSharedViewModel mainSharedViewModel = this.f9581p;
        if (mainSharedViewModel != null) {
            return mainSharedViewModel;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    public final void L() {
        A(new AnalyticEvent("friends", null, 2, null));
        Intent intent = new Intent(this, (Class<?>) FollowerFollowingActivity.class);
        intent.putExtra("USER_IDENTIFIER", ((MainViewModel) x()).f9081d.getCurrentUserId());
        intent.putExtra("FOLLOWER_FOLLOWING", 1);
        ((v1) w()).f6367u.b(3);
        startActivity(intent);
    }

    public final void M() {
        MainViewModel mainViewModel = (MainViewModel) x();
        qf.b bVar = qf.b.f31937l;
        if (mainViewModel.f9598o.b(bVar)) {
            String string = getString(R.string.stockgro_plus);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            W(bVar, string);
        } else {
            B(new AnalyticEvent("app_ham_menu_stockgro_plus", null, 2, null));
            h.u(this, 4);
        }
    }

    public final void N() {
        h.u(this, 8);
    }

    public final void O() {
        MainViewModel mainViewModel = (MainViewModel) x();
        qf.b bVar = qf.b.f31936k;
        if (mainViewModel.f9598o.b(bVar)) {
            String string = getString(R.string.text_learn_with_stockgyan);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            W(bVar, string);
            return;
        }
        h.u(this, 9);
    }

    public final void P() {
        A(new AnalyticEvent("tutorials", null, 2, null));
        K().f9587r.postValue(Boolean.FALSE);
        l.H(600L, new nf.c(this, 10));
    }

    public final void Q() {
        A(new AnalyticEvent("stockgro_wallet", null, 2, null));
        MainViewModel mainViewModel = (MainViewModel) x();
        qf.b bVar = qf.b.f31932g;
        if (mainViewModel.f9598o.b(bVar)) {
            String string = getString(R.string.stockgro_wallet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            W(bVar, string);
            return;
        }
        h.u(this, 11);
    }

    public final void R() {
        String string;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("deep_link_uri")) != null && string.length() > 0) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        }
    }

    public final void S() {
        String string;
        if (getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            Bundle extras = getIntent().getExtras();
            Unit unit = null;
            if (extras != null && (string = extras.getString("path")) != null) {
                switch (string.hashCode()) {
                    case -1081306052:
                        if (string.equals("market")) {
                            K().f9588s.postValue(Boolean.TRUE);
                            K().f9593x.postValue("MarketAssetHostFragment");
                            break;
                        }
                        break;
                    case -897050771:
                        if (string.equals("social")) {
                            K().f9591v.postValue(Boolean.TRUE);
                            K().f9593x.postValue("SocialFragment");
                            break;
                        }
                        break;
                    case 93078279:
                        if (string.equals("arena")) {
                            K().I = true;
                            K().f9590u.postValue(Boolean.TRUE);
                            K().f9593x.postValue("ArenaAssetHostFragmentV2");
                            break;
                        }
                        break;
                    case 1121781064:
                        if (string.equals("portfolio")) {
                            K().f9589t.postValue(Boolean.TRUE);
                            K().f9593x.postValue("PortfolioFragment");
                            break;
                        }
                        break;
                }
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    if (extras2.getBoolean("IS_DEFERRED_DEEP_LINK")) {
                        R();
                    }
                    unit = Unit.f23355a;
                }
            }
            if (unit == null) {
                R();
            }
            Bundle extras3 = getIntent().getExtras();
            if (extras3 != null) {
                extras3.putBoolean("is_deep_link_flag", false);
            }
        }
    }

    public final void T(boolean z10) {
        ((MainViewModel) x()).Z = Boolean.valueOf(!z10);
        if (z10) {
            MainViewModel mainViewModel = (MainViewModel) x();
            AppCloneDataRequest appCloneData = kj.f.g(this);
            Intrinsics.checkNotNullParameter(appCloneData, "appCloneData");
            g.H(u0.f(mainViewModel), null, null, new x(mainViewModel, appCloneData, null), 3);
            return;
        }
        ((MainViewModel) x()).j(kj.f.g(this));
    }

    public final void U(int i10, MainActivity activity, e appUpdateManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
        Task b10 = appUpdateManager.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getAppUpdateInfo(...)");
        b10.addOnSuccessListener(new jf.g(2, new d1(i10, appUpdateManager, activity, this)));
    }

    public final void V() {
        int i10;
        String str;
        try {
            View view = this.f9577l;
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.cart_badge);
                if (textView != null) {
                    if (f9575s > 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    int i11 = f9575s;
                    if (i11 == 0) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else if (1 <= i11 && i11 < 100) {
                        str = String.valueOf(i11);
                    } else {
                        str = "99+";
                    }
                    textView.setText(str);
                    return;
                }
                return;
            }
            Intrinsics.k("socialBadge");
            throw null;
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    public final void W(qf.b bVar, String str) {
        Intent intent = new Intent(this, (Class<?>) MaintenanceWindowActivity.class);
        intent.putExtra("DATA", bVar);
        intent.putExtra("SHOW_TOOLBAR", true);
        intent.putExtra("TOOLBAR_TITLE", str);
        startActivity(intent);
    }

    @Override // h.m, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration != null) {
            configuration.fontScale = 1.0f;
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 121) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        Intrinsics.checkNotNullParameter(this, "context");
                        Intrinsics.checkNotNullParameter("App download failed", "text");
                        if ("App download failed".length() != 0) {
                            Toast makeText = Toast.makeText(this, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c("App download failed", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        }
                        if (((MainViewModel) x()).f9596a0 == 1) {
                            ((MainViewModel) x()).Q.postValue(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (((MainViewModel) x()).f9596a0 == 1) {
                    ((MainViewModel) x()).Q.postValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter("Downloading app update", "text");
            if ("Downloading app update".length() != 0) {
                Toast makeText2 = Toast.makeText(this, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService2 = getSystemService("layout_inflater");
                Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c("Downloading app update", (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
            }
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        View e10 = ((v1) w()).f6367u.e(3);
        if (e10 != null && DrawerLayout.m(e10)) {
            ((v1) w()).f6367u.b(3);
            return;
        }
        m mVar = this.f9576k;
        if (mVar instanceof gf.e) {
            finish();
            return;
        }
        if (mVar instanceof he.e) {
            if (K().K) {
                K().E.postValue(ChatStates.TOOLBAR);
                return;
            } else if (K().J) {
                K().E.postValue(ChatStates.FAB);
                return;
            } else {
                ((v1) w()).f6365s.f6521s.setSelectedItemId(R.id.home_fragment);
                return;
            }
        }
        ((v1) w()).f6365s.f6521s.setSelectedItemId(R.id.home_fragment);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        S();
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onPause() {
        fd.c cVar = K().Q;
        if (cVar != null) {
            cVar.a();
            unregisterReceiver(this.f9580o);
            super.onPause();
            return;
        }
        Intrinsics.k("timer");
        throw null;
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        e eVar = this.f9582q;
        if (eVar != null) {
            eVar.b().addOnSuccessListener(new jf.g(3, new nf.b(this, 0)));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("APP_UPDATE_BROADCAST_ACTION");
            intentFilter.addAction("REFRESH_NOTIFICATION_COUNT_CODE");
            intentFilter.addAction("REFRESH_MESSAGE_COUNT_CODE");
            int i10 = Build.VERSION.SDK_INT;
            a0 a0Var = this.f9580o;
            if (i10 >= 34) {
                registerReceiver(a0Var, intentFilter, 4);
            } else {
                registerReceiver(a0Var, intentFilter);
            }
            V();
            K().k();
            K().i();
            ((MainViewModel) x()).h();
            MainViewModel mainViewModel = (MainViewModel) x();
            g.H(u0.f(mainViewModel), null, null, new nf.w(mainViewModel, null), 3);
            super.onResume();
            String str = (String) K().f9593x.getValue();
            if (str != null) {
                K().f9593x.postValue(str);
            }
            MainSharedViewModel K = K();
            fd.c cVar = K.Q;
            if (cVar != null) {
                cVar.a();
                g.H(u0.f(K), null, null, new q(K, null), 3);
                MainViewModel mainViewModel2 = (MainViewModel) x();
                g.H(u0.f(mainViewModel2), r0.f32256b, null, new t(mainViewModel2, null), 2);
                return;
            }
            Intrinsics.k("timer");
            throw null;
        }
        Intrinsics.k("appUpdateManager");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        mj.a remoteConfigUtils = (mj.a) activityComponent.f14246a.B.get();
        g.i(remoteConfigUtils);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(remoteConfigUtils, "remoteConfigUtils");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(iu.a0.a(MainViewModel.class), new z2.e(schedulerProvider, compositeDisposable, userRepository, remoteConfigUtils, maintenanceConfigManager, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MainViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MainViewModel.class, "<this>", MainViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MainViewModel mainViewModel = (MainViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(mainViewModel);
            this.f17254b = mainViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            v vVar2 = (v) activityComponent.f14247b;
            kq.e schedulerProvider2 = activityComponent.f14246a.k();
            ct.a compositeDisposable2 = activityComponent.f14246a.c();
            UserRepository userRepository2 = activityComponent.f14246a.m();
            g.i(userRepository2);
            ChatRepository chatRepository = activityComponent.f14246a.b();
            g.i(chatRepository);
            NotificationsRepository notificationsRepository = (NotificationsRepository) activityComponent.f14246a.f14270v.get();
            g.i(notificationsRepository);
            LogoutSubject logoutSubject = (LogoutSubject) activityComponent.f14246a.f14255g.get();
            g.i(logoutSubject);
            jj.a appsFlyerAnalyticsEngineImpl = activityComponent.f14246a.n();
            g.i(appsFlyerAnalyticsEngineImpl);
            qf.a maintenanceConfigManager2 = activityComponent.f14246a.g();
            g.i(maintenanceConfigManager2);
            vVar2.getClass();
            Intrinsics.checkNotNullParameter(schedulerProvider2, "schedulerProvider");
            Intrinsics.checkNotNullParameter(compositeDisposable2, "compositeDisposable");
            Intrinsics.checkNotNullParameter(userRepository2, "userRepository");
            Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
            Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
            Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
            Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
            Intrinsics.checkNotNullParameter(maintenanceConfigManager2, "maintenanceConfigManager");
            ca.c factory2 = new ca.c(iu.a0.a(MainSharedViewModel.class), new p(schedulerProvider2, compositeDisposable2, userRepository2, chatRepository, notificationsRepository, logoutSubject, appsFlyerAnalyticsEngineImpl, maintenanceConfigManager2, 0));
            b bVar2 = vVar2.f15290a;
            h1 c11 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar2, "owner", factory2, "factory");
            y4.c defaultCreationExtras2 = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar2, "owner", c11, "store");
            Intrinsics.checkNotNullParameter(factory2, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
            h.c h12 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c11, factory2, defaultCreationExtras2, MainSharedViewModel.class, "modelClass");
            iu.e b11 = a3.a.b(MainSharedViewModel.class, "<this>", MainSharedViewModel.class, "modelClass", "modelClass");
            String s10 = i0.s(b11);
            if (s10 != null) {
                MainSharedViewModel mainSharedViewModel = (MainSharedViewModel) h12.G(b11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s10));
                g.j(mainSharedViewModel);
                this.f9581p = mainSharedViewModel;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
