package com.assetgro.stockgro.ui.chat.detail.members;

import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.e;
import androidx.lifecycle.h1;
import b1.c;
import b1.d;
import ba.m0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import iu.a0;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/GroupInvitedListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/members/GroupInvitedListViewModel;", "Lba/m0;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupInvitedListActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9272l = 0;

    /* renamed from: k, reason: collision with root package name */
    public String f9273k = "0";

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_invited_list;
    }

    @Override // gd.b
    public final void I() {
        GroupInvitedListViewModel groupInvitedListViewModel = (GroupInvitedListViewModel) x();
        String stringExtra = getIntent().getStringExtra("CHAT_GROUP_ID");
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
        groupInvitedListViewModel.f9275o = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("CHAT_GROUP_NO_OF_INVITEES");
        if (stringExtra2 == null) {
            stringExtra2 = "0";
        }
        this.f9273k = stringExtra2;
        m0 m0Var = (m0) w();
        m0Var.f5415t.setTitle(getString(R.string.invited_members));
        u(((m0) w()).f5415t);
        m0 m0Var2 = (m0) w();
        m0Var2.f5415t.setNavigationOnClickListener(new a(this, 4));
        Toolbar toolbar = ((m0) w()).f5415t;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        ((GroupInvitedListViewModel) x()).h();
        m0 m0Var3 = (m0) w();
        e eVar = new e(this, 25);
        Object obj = d.f3079a;
        m0Var3.f5414s.setContent(new c(eVar, true, 1233258339));
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
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        ca.c factory = new ca.c(a0.a(GroupInvitedListViewModel.class), new ea.d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupInvitedListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupInvitedListViewModel.class, "<this>", GroupInvitedListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupInvitedListViewModel groupInvitedListViewModel = (GroupInvitedListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupInvitedListViewModel);
            this.f17254b = groupInvitedListViewModel;
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
