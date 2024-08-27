package com.assetgro.stockgro.ui.chat.discover.info;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.RecyclerView;
import b3.t;
import ba.i0;
import ba.j0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.i;
import ea.v;
import ee.f;
import gd.b;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import nt.h;
import qu.r0;
import vd.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/discover/info/GroupDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/discover/info/GroupDetailViewModel;", "Lba/i0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupDetailActivity extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9324n = 0;

    /* renamed from: k, reason: collision with root package name */
    public d f9325k;

    /* renamed from: l, reason: collision with root package name */
    public String f9326l;

    /* renamed from: m, reason: collision with root package name */
    public final c f9327m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public GroupDetailActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9327m = registerForActivityResult;
    }

    public static final void K(GroupDetailActivity groupDetailActivity) {
        Boolean bool;
        Unit unit;
        Group group;
        String string;
        Bundle extras = groupDetailActivity.getIntent().getExtras();
        Boolean bool2 = null;
        if (extras != null) {
            bool = Boolean.valueOf(extras.getBoolean("HANDLE_BACKPRESS"));
        } else {
            bool = null;
        }
        Bundle extras2 = groupDetailActivity.getIntent().getExtras();
        if (extras2 != null && (string = extras2.getString("DEEPLINK")) != null) {
            if (string.length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                intent.putExtra("HANDLE_BACKPRESS", bool);
                groupDetailActivity.startActivity(intent);
            }
            groupDetailActivity.setResult(-1);
            groupDetailActivity.finish();
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null && (group = (Group) ((GroupDetailViewModel) groupDetailActivity.x()).f9331q.getValue()) != null) {
            Intent intent2 = new Intent(groupDetailActivity, (Class<?>) GroupDetailHostActivity.class);
            intent2.putExtra("GROUP_CHAT_ID", group.getGroupId());
            Bundle extras3 = groupDetailActivity.getIntent().getExtras();
            if (extras3 != null) {
                bool2 = Boolean.valueOf(extras3.getBoolean("HANDLE_BACKPRESS"));
            }
            intent2.putExtra("HANDLE_BACKPRESS", bool2);
            groupDetailActivity.f9327m.a(intent2);
        }
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_detail;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupDetailViewModel) x()).f9084g.observe(this, new a(19, new ee.b(this, 0)));
        ((GroupDetailViewModel) x()).f9331q.observe(this, new a(19, new ee.b(this, 1)));
        ((GroupDetailViewModel) x()).f9335u.observe(this, new a(19, new ee.b(this, 2)));
        ((GroupDetailViewModel) x()).f9332r.observe(this, new a(19, new ee.b(this, 3)));
        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) x();
        groupDetailViewModel.f9339y.observe(this, new a(19, new ee.b(this, 4)));
        ((GroupDetailViewModel) x()).f9333s.observe(this, new a(19, new ee.b(this, 5)));
        ((GroupDetailViewModel) x()).f9337w.observe(this, new a(19, new ee.b(this, 6)));
    }

    @Override // gd.b
    public final void I() {
        j0 j0Var = (j0) ((i0) w());
        j0Var.C = (GroupDetailViewModel) x();
        synchronized (j0Var) {
            j0Var.D |= 64;
        }
        j0Var.a(24);
        j0Var.m();
        ((i0) w()).p(this);
        this.f9326l = getIntent().getStringExtra("GROUP_CHAT_ID");
        Toolbar toolbar = ((i0) w()).B;
        toolbar.setTitle(getString(R.string.text_group_information));
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ee.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailActivity f15380b;

            {
                this.f15380b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                GroupDetailActivity this$0 = this.f15380b;
                switch (i11) {
                    case 0:
                        int i12 = GroupDetailActivity.f9324n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i13 = GroupDetailActivity.f9324n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) this$0.x();
                        String str = this$0.f9326l;
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            groupDetailViewModel.f9336v.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
                        }
                        Group group = (Group) groupDetailViewModel.f9331q.getValue();
                        if (group != null) {
                            if (!group.getAllowedToJoin()) {
                                groupDetailViewModel.f9332r.postValue(group.getSubscriptionPackageInfo().getMessage());
                                return;
                            } else {
                                groupDetailViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(groupDetailViewModel), null, null, new h(groupDetailViewModel, str, "User", null), 3);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        v(toolbar);
        final int i11 = 1;
        ((i0) w()).f4999x.setOnClickListener(new View.OnClickListener(this) { // from class: ee.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailActivity f15380b;

            {
                this.f15380b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                GroupDetailActivity this$0 = this.f15380b;
                switch (i112) {
                    case 0:
                        int i12 = GroupDetailActivity.f9324n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i13 = GroupDetailActivity.f9324n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) this$0.x();
                        String str = this$0.f9326l;
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            groupDetailViewModel.f9336v.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
                        }
                        Group group = (Group) groupDetailViewModel.f9331q.getValue();
                        if (group != null) {
                            if (!group.getAllowedToJoin()) {
                                groupDetailViewModel.f9332r.postValue(group.getSubscriptionPackageInfo().getMessage());
                                return;
                            } else {
                                groupDetailViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(groupDetailViewModel), null, null, new h(groupDetailViewModel, str, "User", null), 3);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9325k = new d(lifecycle, ((GroupDetailViewModel) x()).f9328n.getUserId(), new ee.b(this, 7), ee.c.f15383b, ee.d.f15392a, false, true);
        RecyclerView recyclerView = ((i0) w()).f4995t;
        d dVar = this.f9325k;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
        } else {
            Intrinsics.k("groupMemberAdapter");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) x();
        g.H(u0.f(groupDetailViewModel), r0.f32256b, null, new ee.g(groupDetailViewModel, null), 2);
        String groupId = this.f9326l;
        if (groupId != null) {
            GroupDetailViewModel groupDetailViewModel2 = (GroupDetailViewModel) x();
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            groupDetailViewModel2.f9084g.postValue(Boolean.TRUE);
            h c10 = groupDetailViewModel2.f9328n.getChatGroupById(groupId, true, true).c(((e) groupDetailViewModel2.f9079b).J());
            jt.d dVar = new jt.d(new vd.a(18, new f(groupDetailViewModel2, 0)), new vd.a(19, new f(groupDetailViewModel2, 1)));
            c10.a(dVar);
            groupDetailViewModel2.f9080c.c(dVar);
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = activityComponent.f14246a.f();
        g.i(followerRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(GroupDetailViewModel.class), new i(schedulerProvider, compositeDisposable, userRepository, chatRepository, followerRepository, maintenanceConfigManager));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupDetailViewModel.class, "<this>", GroupDetailViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupDetailViewModel);
            this.f17254b = groupDetailViewModel;
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
