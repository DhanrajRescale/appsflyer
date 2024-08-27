package com.assetgro.stockgro.ui.social.presentation.block;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.i;
import bi.a;
import bi.e;
import ch.c;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/block/BlockedUserListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/social/presentation/block/BlockedUserListViewModel;", "Lba/i;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BlockedUserListActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10120l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f10121k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_blocked_user_list;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((BlockedUserListViewModel) x()).f9084g.observe(this, new c(24, new e(this, 0)));
        ((BlockedUserListViewModel) x()).f10125q.observe(this, new c(24, new e(this, 1)));
        ((BlockedUserListViewModel) x()).f10123o.observe(this, new c(24, new e(this, 2)));
        ((BlockedUserListViewModel) x()).f10124p.observe(this, new c(24, new e(this, 3)));
        ((BlockedUserListViewModel) x()).f10126r.observe(this, new c(24, new e(this, 4)));
    }

    @Override // gd.b
    public final void I() {
        i iVar = (i) w();
        String string = getString(R.string.text_blocked_users);
        Toolbar toolbar = iVar.f4993x;
        toolbar.setTitle(string);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new ph.a(this, 3));
        v(toolbar);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f10121k = new a(lifecycle, ((BlockedUserListViewModel) x()).f10122n.getUserId(), new e(this, 5), new e(this, 6), new be.b(this, 20));
        i iVar2 = (i) w();
        iVar2.f4992w.setOnRefreshListener(new vc.b(this, 26));
        i iVar3 = (i) w();
        a aVar = this.f10121k;
        if (aVar != null) {
            iVar3.f4989t.setAdapter(aVar);
            i iVar4 = (i) w();
            iVar4.f4988s.setMyScrollChangeListener(new va.b(this, 5));
            return;
        }
        Intrinsics.k("blockUserListAdapter");
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
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(BlockedUserListViewModel.class), new z2.e(schedulerProvider, compositeDisposable, userRepository, chatRepository, maintenanceConfigManager, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, BlockedUserListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(BlockedUserListViewModel.class, "<this>", BlockedUserListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            BlockedUserListViewModel blockedUserListViewModel = (BlockedUserListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(blockedUserListViewModel);
            this.f17254b = blockedUserListViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
