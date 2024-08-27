package com.assetgro.stockgro.missions.presentation.home;

import android.content.Intent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.navigation.t;
import androidx.recyclerview.widget.RecyclerView;
import b1.d;
import ba.lk;
import ba.mk;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.LifetimeEarnings;
import com.assetgro.stockgro.missions.domain.model.MissionsHomeData;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeFragment;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.l0;
import ea.n0;
import eb.c;
import gd.m;
import hc.a;
import hc.f;
import hc.g;
import hc.h;
import hc.p;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/home/MissionsHomeFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/missions/presentation/home/MissionsHomeViewModel;", "Lba/lk;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionsHomeFragment extends m<MissionsHomeViewModel, lk> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8912j = 0;

    /* renamed from: g, reason: collision with root package name */
    public MissionSharedViewModel f8913g;

    /* renamed from: h, reason: collision with root package name */
    public BottomSheetBehavior f8914h;

    /* renamed from: i, reason: collision with root package name */
    public a f8915i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_missions_home;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MissionsHomeViewModel) r()).f8920r.observe(this, new c(10, new g(this, 0)));
        ((MissionsHomeViewModel) r()).f9084g.observe(this, new c(10, new g(this, 1)));
        ((MissionsHomeViewModel) r()).f8917o.observe(this, new c(10, new g(this, 2)));
        ((MissionsHomeViewModel) r()).f8918p.observe(this, new c(10, new g(this, 3)));
        MissionSharedViewModel missionSharedViewModel = this.f8913g;
        if (missionSharedViewModel != null) {
            missionSharedViewModel.f8911n.observe(this, new c(10, new g(this, 4)));
            ((MissionsHomeViewModel) r()).f8919q.observe(this, new c(10, new g(this, 5)));
            MissionsHomeViewModel missionsHomeViewModel = (MissionsHomeViewModel) r();
            missionsHomeViewModel.f8925w.observe(this, new c(10, new g(this, 6)));
            return;
        }
        Intrinsics.k("missionSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((lk) q()).p(this);
        mk mkVar = (mk) ((lk) q());
        mkVar.C = (MissionsHomeViewModel) r();
        synchronized (mkVar) {
            mkVar.D |= 16;
        }
        mkVar.a(24);
        mkVar.m();
        ((lk) q()).A.setTitle(getString(R.string.title_missions));
        final int i10 = 0;
        ((lk) q()).A.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: hc.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionsHomeFragment f18269b;

            {
                this.f18269b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                String str2;
                LifetimeEarnings lifetimeEarnings;
                LifetimeEarnings lifetimeEarnings2;
                int i11 = i10;
                MissionsHomeFragment this$0 = this.f18269b;
                switch (i11) {
                    case 0:
                        int i12 = MissionsHomeFragment.f8912j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i13 = MissionsHomeFragment.f8912j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        t h10 = q6.l.h(this$0);
                        MissionsHomeData missionsHomeData = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                        if (missionsHomeData != null && (lifetimeEarnings2 = missionsHomeData.getLifetimeEarnings()) != null) {
                            str = lifetimeEarnings2.getTitle();
                        } else {
                            str = null;
                        }
                        MissionsHomeData missionsHomeData2 = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                        if (missionsHomeData2 != null && (lifetimeEarnings = missionsHomeData2.getLifetimeEarnings()) != null) {
                            str2 = lifetimeEarnings.getAmount();
                        } else {
                            str2 = null;
                        }
                        h10.o(new i(str, str2));
                        this$0.B(new AnalyticEvent("app_missions_history_tapped", null, 2, null));
                        return;
                    case 2:
                        int i14 = MissionsHomeFragment.f8912j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                        return;
                    default:
                        int i15 = MissionsHomeFragment.f8912j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                        return;
                }
            }
        });
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f8915i = new a(lifecycle, new g(this, 7));
        RecyclerView recyclerView = ((lk) q()).f5361s.f4447t.f4186w;
        a aVar = this.f8915i;
        if (aVar != null) {
            recyclerView.setAdapter(aVar);
            final int i11 = 1;
            ((lk) q()).f5366x.f5290s.setOnClickListener(new View.OnClickListener(this) { // from class: hc.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MissionsHomeFragment f18269b;

                {
                    this.f18269b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String str2;
                    LifetimeEarnings lifetimeEarnings;
                    LifetimeEarnings lifetimeEarnings2;
                    int i112 = i11;
                    MissionsHomeFragment this$0 = this.f18269b;
                    switch (i112) {
                        case 0:
                            int i12 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i13 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            t h10 = q6.l.h(this$0);
                            MissionsHomeData missionsHomeData = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData != null && (lifetimeEarnings2 = missionsHomeData.getLifetimeEarnings()) != null) {
                                str = lifetimeEarnings2.getTitle();
                            } else {
                                str = null;
                            }
                            MissionsHomeData missionsHomeData2 = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData2 != null && (lifetimeEarnings = missionsHomeData2.getLifetimeEarnings()) != null) {
                                str2 = lifetimeEarnings.getAmount();
                            } else {
                                str2 = null;
                            }
                            h10.o(new i(str, str2));
                            this$0.B(new AnalyticEvent("app_missions_history_tapped", null, 2, null));
                            return;
                        case 2:
                            int i14 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                        default:
                            int i15 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                    }
                }
            });
            final int i12 = 2;
            ((lk) q()).f5366x.f5292u.setOnClickListener(new View.OnClickListener(this) { // from class: hc.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MissionsHomeFragment f18269b;

                {
                    this.f18269b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String str2;
                    LifetimeEarnings lifetimeEarnings;
                    LifetimeEarnings lifetimeEarnings2;
                    int i112 = i12;
                    MissionsHomeFragment this$0 = this.f18269b;
                    switch (i112) {
                        case 0:
                            int i122 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i13 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            t h10 = q6.l.h(this$0);
                            MissionsHomeData missionsHomeData = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData != null && (lifetimeEarnings2 = missionsHomeData.getLifetimeEarnings()) != null) {
                                str = lifetimeEarnings2.getTitle();
                            } else {
                                str = null;
                            }
                            MissionsHomeData missionsHomeData2 = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData2 != null && (lifetimeEarnings = missionsHomeData2.getLifetimeEarnings()) != null) {
                                str2 = lifetimeEarnings.getAmount();
                            } else {
                                str2 = null;
                            }
                            h10.o(new i(str, str2));
                            this$0.B(new AnalyticEvent("app_missions_history_tapped", null, 2, null));
                            return;
                        case 2:
                            int i14 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                        default:
                            int i15 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                    }
                }
            });
            final int i13 = 3;
            ((lk) q()).f5366x.f5291t.setOnClickListener(new View.OnClickListener(this) { // from class: hc.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MissionsHomeFragment f18269b;

                {
                    this.f18269b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String str2;
                    LifetimeEarnings lifetimeEarnings;
                    LifetimeEarnings lifetimeEarnings2;
                    int i112 = i13;
                    MissionsHomeFragment this$0 = this.f18269b;
                    switch (i112) {
                        case 0:
                            int i122 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i132 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            t h10 = q6.l.h(this$0);
                            MissionsHomeData missionsHomeData = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData != null && (lifetimeEarnings2 = missionsHomeData.getLifetimeEarnings()) != null) {
                                str = lifetimeEarnings2.getTitle();
                            } else {
                                str = null;
                            }
                            MissionsHomeData missionsHomeData2 = (MissionsHomeData) ((MissionsHomeViewModel) this$0.r()).f8918p.getValue();
                            if (missionsHomeData2 != null && (lifetimeEarnings = missionsHomeData2.getLifetimeEarnings()) != null) {
                                str2 = lifetimeEarnings.getAmount();
                            } else {
                                str2 = null;
                            }
                            h10.o(new i(str, str2));
                            this$0.B(new AnalyticEvent("app_missions_history_tapped", null, 2, null));
                            return;
                        case 2:
                            int i14 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                        default:
                            int i15 = MissionsHomeFragment.f8912j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) MyProfileActivity.class));
                            return;
                    }
                }
            });
            BottomSheetBehavior w10 = BottomSheetBehavior.w(((lk) q()).f5361s.f4446s);
            Intrinsics.checkNotNullExpressionValue(w10, "from(...)");
            this.f8914h = w10;
            if (w10 != null) {
                h hVar = new h(this, i10);
                ArrayList arrayList = w10.W;
                if (!arrayList.contains(hVar)) {
                    arrayList.add(hVar);
                }
                ComposeView composeView = ((lk) q()).f5362t;
                f fVar = new f(this, i11);
                Object obj = d.f3079a;
                composeView.setContent(new b1.c(fVar, true, 371479666));
                return;
            }
            Intrinsics.k("bottomSheetBehavior");
            throw null;
        }
        Intrinsics.k("missionListAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        fd.c cVar = ((MissionsHomeViewModel) r()).f8923u;
        if (cVar != null) {
            cVar.a();
        } else {
            Intrinsics.k("refreshTimer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MissionsHomeViewModel missionsHomeViewModel = (MissionsHomeViewModel) r();
        missionsHomeViewModel.f9084g.postValue(Boolean.TRUE);
        fd.c cVar = missionsHomeViewModel.f8923u;
        if (cVar != null) {
            cVar.a();
            yk.g.H(u0.f(missionsHomeViewModel), null, null, new p(missionsHomeViewModel, null), 3);
            MissionsHomeData missionsHomeData = (MissionsHomeData) ((MissionsHomeViewModel) r()).f8918p.getValue();
            if (missionsHomeData != null) {
                ((MissionsHomeViewModel) r()).f8918p.postValue(missionsHomeData);
            }
            Pair pair = (Pair) ((MissionsHomeViewModel) r()).f8917o.getValue();
            if (pair != null) {
                ((MissionsHomeViewModel) r()).f8917o.postValue(pair);
                return;
            }
            return;
        }
        Intrinsics.k("refreshTimer");
        throw null;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        MissionsRepository missionsRepository = (MissionsRepository) bVar.G.get();
        yk.g.i(missionsRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MissionsHomeViewModel.class), new l0(k10, c10, userRepository, missionsRepository, 4));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MissionsHomeViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MissionsHomeViewModel.class, "<this>", MissionsHomeViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MissionsHomeViewModel missionsHomeViewModel = (MissionsHomeViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(missionsHomeViewModel);
            this.f17284b = missionsHomeViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            this.f8913g = fragmentComponent.h();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
