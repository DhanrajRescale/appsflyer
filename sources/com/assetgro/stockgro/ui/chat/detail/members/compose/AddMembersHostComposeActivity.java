package com.assetgro.stockgro.ui.chat.detail.members.compose;

import androidx.compose.foundation.layout.e;
import androidx.lifecycle.h1;
import b1.d;
import ba.c;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/compose/AddMembersHostComposeActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/members/AddMembersViewModel;", "Lba/c;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AddMembersHostComposeActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9299k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_add_members_host_compose;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((AddMembersViewModel) x()).f9266p.observe(this, new a(11, new wd.a(this, 0)));
    }

    @Override // gd.b
    public final void I() {
        String stringExtra = getIntent().getStringExtra("CHAT_GROUP_ID");
        if (stringExtra != null) {
            ((AddMembersViewModel) x()).f9267q = stringExtra;
        }
        c cVar = (c) w();
        e eVar = new e(this, 27);
        Object obj = d.f3079a;
        cVar.f4327s.setContent(new b1.c(eVar, true, 660180159));
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        setResult(-1);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = activityComponent.f14246a.f();
        g.i(followerRepository);
        ContactsRepository contactsRepository = activityComponent.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(AddMembersViewModel.class), new ea.b(chatRepository, contactsRepository, followerRepository, userRepository, k10, compositeDisposable));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, AddMembersViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(AddMembersViewModel.class, "<this>", AddMembersViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            AddMembersViewModel addMembersViewModel = (AddMembersViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(addMembersViewModel);
            this.f17254b = addMembersViewModel;
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
