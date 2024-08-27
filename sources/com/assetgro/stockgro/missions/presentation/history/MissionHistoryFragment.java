package com.assetgro.stockgro.missions.presentation.history;

import android.view.View;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import androidx.navigation.t;
import ba.hk;
import ba.ik;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.domain.model.MissionsHistoryConsolidated;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryFragment;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.l0;
import ea.n0;
import gc.b;
import gc.c;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import vt.p0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/history/MissionHistoryFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/missions/presentation/history/MissionHistoryViewModel;", "Lba/hk;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionHistoryFragment extends m<MissionHistoryViewModel, hk> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8876h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8877g = new i(a0.a(c.class), new z1(this, 16));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_mission_history;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MissionHistoryViewModel) r()).f8884p.observe(this, new eb.c(6, new b(this, 0)));
        ((MissionHistoryViewModel) r()).f8886r.observe(this, new eb.c(6, new b(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((hk) q()).p(this);
        ik ikVar = (ik) ((hk) q());
        ikVar.B = (MissionHistoryViewModel) r();
        synchronized (ikVar) {
            ikVar.C |= 64;
        }
        ikVar.a(24);
        ikVar.m();
        String str = ((c) this.f8877g.getValue()).f17222a;
        if (str == null) {
            str = getString(R.string.mission_earnings);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        String str2 = ((c) this.f8877g.getValue()).f17223b;
        if (str2 == null) {
            str2 = "0";
        }
        ik ikVar2 = (ik) ((hk) q());
        ikVar2.f4950z = str;
        synchronized (ikVar2) {
            ikVar2.C |= 32;
        }
        ikVar2.a(23);
        ikVar2.m();
        ikVar2.A = str2;
        synchronized (ikVar2) {
            ikVar2.C |= 16;
        }
        final int i10 = 2;
        ikVar2.a(2);
        ikVar2.m();
        ((hk) q()).f4947w.setTitle(getString(R.string.your_missions));
        final int i11 = 0;
        ((hk) q()).f4947w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionHistoryFragment f17219b;

            {
                this.f17219b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                MissionHistoryFragment this$0 = this.f17219b;
                switch (i12) {
                    case 0:
                        int i13 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    case 1:
                        int i14 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("completed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "completed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated == null || missionsHistoryConsolidated.getCompleted() != 0) {
                            t h10 = q6.l.h(this$0);
                            String status = MissionStatus.COMPLETED.getParamName();
                            Intrinsics.checkNotNullParameter(status, "status");
                            h10.o(new d(status));
                            return;
                        }
                        return;
                    case 2:
                        int i15 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("in_review", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "in_review"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated2 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated2 == null || missionsHistoryConsolidated2.getInReview() != 0) {
                            t h11 = q6.l.h(this$0);
                            String status2 = MissionStatus.UNDER_REVIEW.getParamName();
                            Intrinsics.checkNotNullParameter(status2, "status");
                            h11.o(new d(status2));
                            return;
                        }
                        return;
                    default:
                        int i16 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("failed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "failed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated3 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated3 == null || missionsHistoryConsolidated3.getFailed() != 0) {
                            t h12 = q6.l.h(this$0);
                            String status3 = MissionStatus.FAILED.getParamName();
                            Intrinsics.checkNotNullParameter(status3, "status");
                            h12.o(new d(status3));
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 1;
        ((hk) q()).f4944t.f27491e.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionHistoryFragment f17219b;

            {
                this.f17219b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i12;
                MissionHistoryFragment this$0 = this.f17219b;
                switch (i122) {
                    case 0:
                        int i13 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    case 1:
                        int i14 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("completed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "completed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated == null || missionsHistoryConsolidated.getCompleted() != 0) {
                            t h10 = q6.l.h(this$0);
                            String status = MissionStatus.COMPLETED.getParamName();
                            Intrinsics.checkNotNullParameter(status, "status");
                            h10.o(new d(status));
                            return;
                        }
                        return;
                    case 2:
                        int i15 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("in_review", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "in_review"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated2 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated2 == null || missionsHistoryConsolidated2.getInReview() != 0) {
                            t h11 = q6.l.h(this$0);
                            String status2 = MissionStatus.UNDER_REVIEW.getParamName();
                            Intrinsics.checkNotNullParameter(status2, "status");
                            h11.o(new d(status2));
                            return;
                        }
                        return;
                    default:
                        int i16 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("failed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "failed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated3 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated3 == null || missionsHistoryConsolidated3.getFailed() != 0) {
                            t h12 = q6.l.h(this$0);
                            String status3 = MissionStatus.FAILED.getParamName();
                            Intrinsics.checkNotNullParameter(status3, "status");
                            h12.o(new d(status3));
                            return;
                        }
                        return;
                }
            }
        });
        ((hk) q()).f4946v.f27491e.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionHistoryFragment f17219b;

            {
                this.f17219b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i10;
                MissionHistoryFragment this$0 = this.f17219b;
                switch (i122) {
                    case 0:
                        int i13 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    case 1:
                        int i14 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("completed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "completed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated == null || missionsHistoryConsolidated.getCompleted() != 0) {
                            t h10 = q6.l.h(this$0);
                            String status = MissionStatus.COMPLETED.getParamName();
                            Intrinsics.checkNotNullParameter(status, "status");
                            h10.o(new d(status));
                            return;
                        }
                        return;
                    case 2:
                        int i15 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("in_review", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "in_review"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated2 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated2 == null || missionsHistoryConsolidated2.getInReview() != 0) {
                            t h11 = q6.l.h(this$0);
                            String status2 = MissionStatus.UNDER_REVIEW.getParamName();
                            Intrinsics.checkNotNullParameter(status2, "status");
                            h11.o(new d(status2));
                            return;
                        }
                        return;
                    default:
                        int i16 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("failed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "failed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated3 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated3 == null || missionsHistoryConsolidated3.getFailed() != 0) {
                            t h12 = q6.l.h(this$0);
                            String status3 = MissionStatus.FAILED.getParamName();
                            Intrinsics.checkNotNullParameter(status3, "status");
                            h12.o(new d(status3));
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 3;
        ((hk) q()).f4945u.f27491e.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionHistoryFragment f17219b;

            {
                this.f17219b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i13;
                MissionHistoryFragment this$0 = this.f17219b;
                switch (i122) {
                    case 0:
                        int i132 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    case 1:
                        int i14 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("completed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "completed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated == null || missionsHistoryConsolidated.getCompleted() != 0) {
                            t h10 = q6.l.h(this$0);
                            String status = MissionStatus.COMPLETED.getParamName();
                            Intrinsics.checkNotNullParameter(status, "status");
                            h10.o(new d(status));
                            return;
                        }
                        return;
                    case 2:
                        int i15 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("in_review", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "in_review"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated2 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated2 == null || missionsHistoryConsolidated2.getInReview() != 0) {
                            t h11 = q6.l.h(this$0);
                            String status2 = MissionStatus.UNDER_REVIEW.getParamName();
                            Intrinsics.checkNotNullParameter(status2, "status");
                            h11.o(new d(status2));
                            return;
                        }
                        return;
                    default:
                        int i16 = MissionHistoryFragment.f8876h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter("failed", "status");
                        this$0.B(new AnalyticEvent("app_missionhistory_statuscard_tapped", p0.f(new Pair("status", "failed"))));
                        MissionsHistoryConsolidated missionsHistoryConsolidated3 = (MissionsHistoryConsolidated) ((MissionHistoryViewModel) this$0.r()).f8883o.getValue();
                        if (missionsHistoryConsolidated3 == null || missionsHistoryConsolidated3.getFailed() != 0) {
                            t h12 = q6.l.h(this$0);
                            String status3 = MissionStatus.FAILED.getParamName();
                            Intrinsics.checkNotNullParameter(status3, "status");
                            h12.o(new d(status3));
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((MissionHistoryViewModel) r()).h();
        MissionHistoryViewModel missionHistoryViewModel = (MissionHistoryViewModel) r();
        UserRepository userRepository = missionHistoryViewModel.f9081d;
        missionHistoryViewModel.f8885q.postValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserDisplayImage()));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        MissionsRepository missionsRepository = (MissionsRepository) bVar.G.get();
        g.i(missionsRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        ca.c factory = new ca.c(a0.a(MissionHistoryViewModel.class), new l0(k10, c10, userRepository, missionsRepository, 0));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MissionHistoryViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MissionHistoryViewModel.class, "<this>", MissionHistoryViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MissionHistoryViewModel missionHistoryViewModel = (MissionHistoryViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(missionHistoryViewModel);
            this.f17284b = missionHistoryViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
