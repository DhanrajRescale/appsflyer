package com.assetgro.stockgro.missions.presentation.detail;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.jk;
import ba.kk;
import ba.vs;
import bb.a;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailFragment;
import com.assetgro.stockgro.missions.presentation.home.MissionSharedViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.l0;
import ea.n0;
import eb.c;
import el.l;
import fc.d;
import fc.e;
import fc.f;
import fc.n;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import yk.g;
import yk.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/detail/MissionTaskDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/missions/presentation/detail/MissionTaskDetailViewModel;", "Lba/jk;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionTaskDetailFragment extends m<MissionTaskDetailViewModel, jk> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8859j = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8860g = new i(a0.a(f.class), new z1(this, 15));

    /* renamed from: h, reason: collision with root package name */
    public MissionSharedViewModel f8861h;

    /* renamed from: i, reason: collision with root package name */
    public BottomSheetBehavior f8862i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_mission_task_detail;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MissionTaskDetailViewModel) r()).f9084g.observe(this, new c(5, new d(this, 0)));
        ((MissionTaskDetailViewModel) r()).f8864o.observe(this, new c(5, new d(this, 1)));
        ((MissionTaskDetailViewModel) r()).f8865p.observe(this, new c(5, new d(this, 2)));
        ((MissionTaskDetailViewModel) r()).f8867r.observe(this, new c(5, new d(this, 3)));
        ((MissionTaskDetailViewModel) r()).f8866q.observe(this, new c(5, new d(this, 4)));
        MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) r();
        missionTaskDetailViewModel.f8874y.observe(this, new c(5, new d(this, 5)));
        MissionTaskDetailViewModel missionTaskDetailViewModel2 = (MissionTaskDetailViewModel) r();
        missionTaskDetailViewModel2.A.observe(this, new c(5, new d(this, 6)));
        ((MissionTaskDetailViewModel) r()).f8864o.observe(this, new c(5, new d(this, 7)));
        MissionTaskDetailViewModel missionTaskDetailViewModel3 = (MissionTaskDetailViewModel) r();
        missionTaskDetailViewModel3.B.observe(this, new c(5, new d(this, 8)));
    }

    @Override // gd.m
    public final void E(View view) {
        String status;
        Intrinsics.checkNotNullParameter(view, "view");
        ((jk) q()).p(this);
        kk kkVar = (kk) ((jk) q());
        kkVar.f5154x = (MissionTaskDetailViewModel) r();
        synchronized (kkVar) {
            kkVar.f5258y |= 2;
        }
        kkVar.a(24);
        kkVar.m();
        String taskId = ((f) this.f8860g.getValue()).f16012a;
        ((MissionTaskDetailViewModel) r()).f8869t = taskId;
        MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) r();
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        MissionDetail missionDetail = (MissionDetail) missionTaskDetailViewModel.f8864o.getValue();
        final int i10 = 1;
        final int i11 = 0;
        if (missionDetail != null && (status = missionDetail.getStatus()) != null && j.Z0(status) == MissionStatus.UNDER_REVIEW) {
            missionTaskDetailViewModel.f8871v = false;
            fd.c cVar = missionTaskDetailViewModel.f8872w;
            if (cVar != null) {
                cVar.a();
                missionTaskDetailViewModel.f8871v = true;
                g.H(u0.f(missionTaskDetailViewModel), null, null, new n(missionTaskDetailViewModel, null), 3);
            } else {
                Intrinsics.k("refreshTimer");
                throw null;
            }
        } else {
            missionTaskDetailViewModel.i(taskId);
        }
        Toolbar toolbar = ((jk) q()).f5153w;
        toolbar.setTitle(getString(R.string.title_mission));
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: fc.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionTaskDetailFragment f16006b;

            {
                this.f16006b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                MissionTaskDetailFragment this$0 = this.f16006b;
                switch (i12) {
                    case 0:
                        int i13 = MissionTaskDetailFragment.f8859j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    default:
                        int i14 = MissionTaskDetailFragment.f8859j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H(false);
                        return;
                }
            }
        });
        BottomSheetBehavior w10 = BottomSheetBehavior.w(((jk) q()).f5149s.f5931s);
        Intrinsics.checkNotNullExpressionValue(w10, "from(...)");
        this.f8862i = w10;
        ((jk) q()).f5152v.setOnCTAAction(new e(this, taskId));
        vs vsVar = ((jk) q()).f5149s.f5932t.f5683t;
        H(false);
        vsVar.f6467u.setOnClickListener(new a(5, vsVar, this));
        vsVar.f6466t.setOnClickListener(new View.OnClickListener(this) { // from class: fc.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissionTaskDetailFragment f16006b;

            {
                this.f16006b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                MissionTaskDetailFragment this$0 = this.f16006b;
                switch (i12) {
                    case 0:
                        int i13 = MissionTaskDetailFragment.f8859j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    default:
                        int i14 = MissionTaskDetailFragment.f8859j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H(false);
                        return;
                }
            }
        });
    }

    public final void H(boolean z10) {
        vs vsVar = ((jk) q()).f5149s.f5932t.f5683t;
        ImageView iconArrow = vsVar.f6465s;
        Intrinsics.checkNotNullExpressionValue(iconArrow, "iconArrow");
        kp.j.f0(iconArrow, !z10);
        vsVar.f6466t.setVisibility(l.u(z10));
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) r();
        missionTaskDetailViewModel.f8871v = false;
        fd.c cVar = missionTaskDetailViewModel.f8872w;
        if (cVar != null) {
            cVar.a();
        } else {
            Intrinsics.k("refreshTimer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        String status;
        super.onResume();
        String taskId = ((MissionTaskDetailViewModel) r()).f8869t;
        if (taskId != null) {
            MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) r();
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            MissionDetail missionDetail = (MissionDetail) missionTaskDetailViewModel.f8864o.getValue();
            if (missionDetail != null && (status = missionDetail.getStatus()) != null && j.Z0(status) == MissionStatus.UNDER_REVIEW) {
                missionTaskDetailViewModel.f8871v = false;
                fd.c cVar = missionTaskDetailViewModel.f8872w;
                if (cVar != null) {
                    cVar.a();
                    missionTaskDetailViewModel.f8871v = true;
                    g.H(u0.f(missionTaskDetailViewModel), null, null, new n(missionTaskDetailViewModel, null), 3);
                    return;
                }
                Intrinsics.k("refreshTimer");
                throw null;
            }
            missionTaskDetailViewModel.i(taskId);
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        MissionsRepository missionsRepository = (MissionsRepository) bVar.G.get();
        g.i(missionsRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        ca.c factory = new ca.c(a0.a(MissionTaskDetailViewModel.class), new l0(k10, c10, userRepository, missionsRepository, 3));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MissionTaskDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MissionTaskDetailViewModel.class, "<this>", MissionTaskDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(missionTaskDetailViewModel);
            this.f17284b = missionTaskDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f8861h = fragmentComponent.h();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
