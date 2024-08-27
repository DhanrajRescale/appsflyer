package com.assetgro.stockgro.missions.presentation.history;

import android.view.View;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import androidx.recyclerview.widget.RecyclerView;
import ba.nk;
import ba.ok;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import da.f;
import ea.l0;
import ea.n0;
import eb.c;
import gc.h;
import gc.l;
import gc.o;
import gc.p;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;
import yk.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/history/MissionStatusDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/missions/presentation/history/MissionStatusDetailViewModel;", "Lba/nk;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionStatusDetailFragment extends m<MissionStatusDetailViewModel, nk> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8887j = 0;

    /* renamed from: g, reason: collision with root package name */
    public h f8888g;

    /* renamed from: h, reason: collision with root package name */
    public MissionStatus f8889h = MissionStatus.NOT_STARTED;

    /* renamed from: i, reason: collision with root package name */
    public final i f8890i = new i(a0.a(gc.m.class), new z1(this, 17));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_missions_status_detail;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MissionStatusDetailViewModel) r()).f9084g.observe(this, new c(8, new l(this, 0)));
        ((MissionStatusDetailViewModel) r()).f8892o.observe(this, new c(8, new l(this, 1)));
        ((MissionStatusDetailViewModel) r()).f8894q.observe(this, new c(8, new l(this, 2)));
        MissionStatusDetailViewModel missionStatusDetailViewModel = (MissionStatusDetailViewModel) r();
        missionStatusDetailViewModel.f8899v.observe(this, new c(8, new l(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        ((nk) q()).p(this);
        ok okVar = (ok) ((nk) q());
        okVar.C = (MissionStatusDetailViewModel) r();
        synchronized (okVar) {
            okVar.E |= 16;
        }
        okVar.a(24);
        okVar.m();
        if (((gc.m) this.f8890i.getValue()).f17245a.length() > 0) {
            this.f8889h = j.Z0(((gc.m) this.f8890i.getValue()).f17245a);
            ok okVar2 = (ok) ((nk) q());
            okVar2.B = this.f8889h;
            synchronized (okVar2) {
                okVar2.E |= 8;
            }
            okVar2.a(15);
            okVar2.m();
            MissionStatusDetailViewModel missionStatusDetailViewModel = (MissionStatusDetailViewModel) r();
            MissionStatus missionStatus = this.f8889h;
            Intrinsics.checkNotNullParameter(missionStatus, "missionStatus");
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                missionStatusDetailViewModel.f8894q.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
            } else {
                int i10 = o.f17247a[missionStatus.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            str = "failed";
                        }
                    } else {
                        str = "completed";
                    }
                } else {
                    str = "in-review";
                }
                missionStatusDetailViewModel.f9084g.postValue(Boolean.TRUE);
                g.H(u0.f(missionStatusDetailViewModel), null, null, new p(missionStatusDetailViewModel, str, null), 3);
            }
        }
        ((nk) q()).f5580x.setTitle(getString(R.string.your_missions));
        ((nk) q()).f5580x.setNavigationOnClickListener(new d7.j(this, 20));
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f8888g = new h(lifecycle, new l(this, 4));
        RecyclerView recyclerView = ((nk) q()).f5575s;
        h hVar = this.f8888g;
        if (hVar != null) {
            recyclerView.setAdapter(hVar);
        } else {
            Intrinsics.k("missionHistoryTimelineAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        Pair pair = (Pair) ((MissionStatusDetailViewModel) r()).f8893p.getValue();
        if (pair != null) {
            ((MissionStatusDetailViewModel) r()).f8893p.postValue(pair);
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
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
        ca.c factory = new ca.c(a0.a(MissionStatusDetailViewModel.class), new l0(k10, c10, userRepository, missionsRepository, 2));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MissionStatusDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MissionStatusDetailViewModel.class, "<this>", MissionStatusDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MissionStatusDetailViewModel missionStatusDetailViewModel = (MissionStatusDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(missionStatusDetailViewModel);
            this.f17284b = missionStatusDetailViewModel;
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
