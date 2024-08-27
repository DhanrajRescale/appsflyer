package com.assetgro.stockgro.ui.chat.message_invites;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import b1.d;
import b3.t;
import ba.i2;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.i;
import ea.v;
import gd.b;
import iu.a0;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/message_invites/MessageInvitesActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/SocialChatListViewModel;", "Lba/i2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MessageInvitesActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9420l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final c f9421k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public MessageInvitesActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 4));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9421k = registerForActivityResult;
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_message_invites;
    }

    @Override // gd.b
    public final void I() {
        i2 i2Var = (i2) w();
        i2Var.f5007t.setTitle(getString(R.string.message_invites));
        i2 i2Var2 = (i2) w();
        i2Var2.f5007t.setNavigationOnClickListener(new a(this, 15));
        Toolbar toolbar = ((i2) w()).f5007t;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        ((SocialChatListViewModel) x()).j();
        i2 i2Var3 = (i2) w();
        be.b bVar = new be.b(this, 3);
        Object obj = d.f3079a;
        i2Var3.f5006s.setContent(new b1.c(bVar, true, -658198411));
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        FollowerRepository followerRepository = activityComponent.f14246a.f();
        g.i(followerRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(SocialChatListViewModel.class), new i(schedulerProvider, compositeDisposable, chatRepository, userRepository, followerRepository, maintenanceConfigManager, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, SocialChatListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialChatListViewModel.class, "<this>", SocialChatListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialChatListViewModel);
            this.f17254b = socialChatListViewModel;
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
