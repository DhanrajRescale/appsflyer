package com.assetgro.stockgro.ui.chat.detail.messages.pin;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.q0;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesActivity;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.d;
import ea.v;
import gd.b;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import r3.k;
import yk.g;
import zd.c;
import zd.e;
import zd.f;
import zd.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/messages/pin/GroupPinnedMessagesActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/messages/pin/GroupPinnedMessagesViewModel;", "Lba/q0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupPinnedMessagesActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9300m = 0;

    /* renamed from: k, reason: collision with root package name */
    public h f9301k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayoutManager f9302l;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_pinned_messages;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupPinnedMessagesViewModel) x()).f9307r.observe(this, new a(13, new c(this, 0)));
        ((GroupPinnedMessagesViewModel) x()).f9309t.observe(this, new a(13, new c(this, 1)));
        ((GroupPinnedMessagesViewModel) x()).f9306q.observe(this, new a(13, new c(this, 2)));
        ((GroupPinnedMessagesViewModel) x()).f9310u.observe(this, new a(13, new c(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        String stringExtra = getIntent().getStringExtra("GROUP_CHAT_ID");
        if (stringExtra != null) {
            GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = (GroupPinnedMessagesViewModel) x();
            Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
            groupPinnedMessagesViewModel.f9313x = stringExtra;
        }
        String stringExtra2 = getIntent().getStringExtra("MESSAGES_TYPE");
        if (stringExtra2 != null) {
            GroupPinnedMessagesViewModel groupPinnedMessagesViewModel2 = (GroupPinnedMessagesViewModel) x();
            Intrinsics.checkNotNullParameter(stringExtra2, "<set-?>");
            groupPinnedMessagesViewModel2.f9312w = stringExtra2;
        }
        String userId = ((GroupPinnedMessagesViewModel) x()).f9303n.getUserId();
        if (userId != null) {
            GroupPinnedMessagesViewModel groupPinnedMessagesViewModel3 = (GroupPinnedMessagesViewModel) x();
            Intrinsics.checkNotNullParameter(userId, "userId");
            e0 e0Var = groupPinnedMessagesViewModel3.f9084g;
            Boolean bool = Boolean.TRUE;
            e0Var.postValue(bool);
            g.H(u0.f(groupPinnedMessagesViewModel3), null, null, new e(groupPinnedMessagesViewModel3, userId, null), 3);
            GroupPinnedMessagesViewModel groupPinnedMessagesViewModel4 = (GroupPinnedMessagesViewModel) x();
            Intrinsics.checkNotNullParameter(userId, "userId");
            groupPinnedMessagesViewModel4.f9084g.postValue(bool);
            g.H(u0.f(groupPinnedMessagesViewModel4), null, null, new f(groupPinnedMessagesViewModel4, userId, null), 3);
        }
        ((GroupPinnedMessagesViewModel) x()).h();
        if (Intrinsics.a(((GroupPinnedMessagesViewModel) x()).f9312w, "GROUP_PINNED_MESSAGES")) {
            q0 q0Var = (q0) w();
            q0Var.f5816v.setImageDrawable(k.getDrawable(this, R.drawable.ic_pin_deselect));
            q0 q0Var2 = (q0) w();
            q0Var2.f5819y.setText(getString(R.string.text_pinned_messages));
        } else {
            q0 q0Var3 = (q0) w();
            q0Var3.f5816v.setImageDrawable(k.getDrawable(this, R.drawable.ic_star_unselected));
            q0 q0Var4 = (q0) w();
            q0Var4.f5819y.setText(getString(R.string.text_starred_messages));
        }
        Toolbar toolbar = ((q0) w()).f5818x;
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: zd.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupPinnedMessagesActivity f42408b;

            {
                this.f42408b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                GroupPinnedMessagesActivity this$0 = this.f42408b;
                switch (i11) {
                    case 0:
                        int i12 = GroupPinnedMessagesActivity.f9300m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = GroupPinnedMessagesActivity.f9300m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ChatMessage chatMessage = ((GroupPinnedMessagesViewModel) this$0.x()).f9304o;
                        if (chatMessage != null) {
                            if (((GroupPinnedMessagesViewModel) this$0.x()).f9312w.equals("GROUP_PINNED_MESSAGES")) {
                                GroupPinnedMessagesViewModel groupPinnedMessagesViewModel5 = (GroupPinnedMessagesViewModel) this$0.x();
                                String senderId = chatMessage.getSenderId();
                                String messageId = chatMessage.getMessageId();
                                Intrinsics.checkNotNullParameter(messageId, "messageId");
                                groupPinnedMessagesViewModel5.f9084g.postValue(Boolean.TRUE);
                                nt.h c10 = groupPinnedMessagesViewModel5.f9303n.pinMessageToGroup(senderId, groupPinnedMessagesViewModel5.f9313x, messageId, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel5.f9079b).J());
                                jt.d dVar = new jt.d(new vd.a(8, new g(0, groupPinnedMessagesViewModel5, messageId)), new vd.a(9, new d(groupPinnedMessagesViewModel5, 4)));
                                c10.a(dVar);
                                groupPinnedMessagesViewModel5.f9080c.c(dVar);
                            } else {
                                GroupPinnedMessagesViewModel groupPinnedMessagesViewModel6 = (GroupPinnedMessagesViewModel) this$0.x();
                                String messageId2 = chatMessage.getMessageId();
                                Intrinsics.checkNotNullParameter(messageId2, "messageId");
                                groupPinnedMessagesViewModel6.f9084g.postValue(Boolean.TRUE);
                                nt.h c11 = groupPinnedMessagesViewModel6.f9303n.starMessageForUser(groupPinnedMessagesViewModel6.f9313x, messageId2, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel6.f9079b).J());
                                jt.d dVar2 = new jt.d(new androidx.fragment.app.g(20, groupPinnedMessagesViewModel6, messageId2), new vd.a(12, new d(groupPinnedMessagesViewModel6, 5)));
                                c11.a(dVar2);
                                groupPinnedMessagesViewModel6.f9080c.c(dVar2);
                            }
                        }
                        this$0.K(false);
                        return;
                    default:
                        int i14 = GroupPinnedMessagesActivity.f9300m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(false);
                        ((GroupPinnedMessagesViewModel) this$0.x()).h();
                        return;
                }
            }
        });
        v(toolbar);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9301k = new h(lifecycle, new c(this, 4), new c(this, 5));
        final int i11 = 1;
        this.f9302l = new LinearLayoutManager(1);
        q0 q0Var5 = (q0) w();
        h hVar = this.f9301k;
        if (hVar != null) {
            RecyclerView recyclerView = q0Var5.f5814t;
            recyclerView.setAdapter(hVar);
            LinearLayoutManager linearLayoutManager = this.f9302l;
            if (linearLayoutManager != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
                q0 q0Var6 = (q0) w();
                q0Var6.f5816v.setOnClickListener(new View.OnClickListener(this) { // from class: zd.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GroupPinnedMessagesActivity f42408b;

                    {
                        this.f42408b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i11;
                        GroupPinnedMessagesActivity this$0 = this.f42408b;
                        switch (i112) {
                            case 0:
                                int i12 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.setResult(-1);
                                this$0.finish();
                                return;
                            case 1:
                                int i13 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ChatMessage chatMessage = ((GroupPinnedMessagesViewModel) this$0.x()).f9304o;
                                if (chatMessage != null) {
                                    if (((GroupPinnedMessagesViewModel) this$0.x()).f9312w.equals("GROUP_PINNED_MESSAGES")) {
                                        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel5 = (GroupPinnedMessagesViewModel) this$0.x();
                                        String senderId = chatMessage.getSenderId();
                                        String messageId = chatMessage.getMessageId();
                                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                                        groupPinnedMessagesViewModel5.f9084g.postValue(Boolean.TRUE);
                                        nt.h c10 = groupPinnedMessagesViewModel5.f9303n.pinMessageToGroup(senderId, groupPinnedMessagesViewModel5.f9313x, messageId, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel5.f9079b).J());
                                        jt.d dVar = new jt.d(new vd.a(8, new g(0, groupPinnedMessagesViewModel5, messageId)), new vd.a(9, new d(groupPinnedMessagesViewModel5, 4)));
                                        c10.a(dVar);
                                        groupPinnedMessagesViewModel5.f9080c.c(dVar);
                                    } else {
                                        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel6 = (GroupPinnedMessagesViewModel) this$0.x();
                                        String messageId2 = chatMessage.getMessageId();
                                        Intrinsics.checkNotNullParameter(messageId2, "messageId");
                                        groupPinnedMessagesViewModel6.f9084g.postValue(Boolean.TRUE);
                                        nt.h c11 = groupPinnedMessagesViewModel6.f9303n.starMessageForUser(groupPinnedMessagesViewModel6.f9313x, messageId2, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel6.f9079b).J());
                                        jt.d dVar2 = new jt.d(new androidx.fragment.app.g(20, groupPinnedMessagesViewModel6, messageId2), new vd.a(12, new d(groupPinnedMessagesViewModel6, 5)));
                                        c11.a(dVar2);
                                        groupPinnedMessagesViewModel6.f9080c.c(dVar2);
                                    }
                                }
                                this$0.K(false);
                                return;
                            default:
                                int i14 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.K(false);
                                ((GroupPinnedMessagesViewModel) this$0.x()).h();
                                return;
                        }
                    }
                });
                q0 q0Var7 = (q0) w();
                final int i12 = 2;
                q0Var7.f5815u.setOnClickListener(new View.OnClickListener(this) { // from class: zd.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GroupPinnedMessagesActivity f42408b;

                    {
                        this.f42408b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i12;
                        GroupPinnedMessagesActivity this$0 = this.f42408b;
                        switch (i112) {
                            case 0:
                                int i122 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.setResult(-1);
                                this$0.finish();
                                return;
                            case 1:
                                int i13 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ChatMessage chatMessage = ((GroupPinnedMessagesViewModel) this$0.x()).f9304o;
                                if (chatMessage != null) {
                                    if (((GroupPinnedMessagesViewModel) this$0.x()).f9312w.equals("GROUP_PINNED_MESSAGES")) {
                                        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel5 = (GroupPinnedMessagesViewModel) this$0.x();
                                        String senderId = chatMessage.getSenderId();
                                        String messageId = chatMessage.getMessageId();
                                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                                        groupPinnedMessagesViewModel5.f9084g.postValue(Boolean.TRUE);
                                        nt.h c10 = groupPinnedMessagesViewModel5.f9303n.pinMessageToGroup(senderId, groupPinnedMessagesViewModel5.f9313x, messageId, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel5.f9079b).J());
                                        jt.d dVar = new jt.d(new vd.a(8, new g(0, groupPinnedMessagesViewModel5, messageId)), new vd.a(9, new d(groupPinnedMessagesViewModel5, 4)));
                                        c10.a(dVar);
                                        groupPinnedMessagesViewModel5.f9080c.c(dVar);
                                    } else {
                                        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel6 = (GroupPinnedMessagesViewModel) this$0.x();
                                        String messageId2 = chatMessage.getMessageId();
                                        Intrinsics.checkNotNullParameter(messageId2, "messageId");
                                        groupPinnedMessagesViewModel6.f9084g.postValue(Boolean.TRUE);
                                        nt.h c11 = groupPinnedMessagesViewModel6.f9303n.starMessageForUser(groupPinnedMessagesViewModel6.f9313x, messageId2, Boolean.FALSE).c(((kq.e) groupPinnedMessagesViewModel6.f9079b).J());
                                        jt.d dVar2 = new jt.d(new androidx.fragment.app.g(20, groupPinnedMessagesViewModel6, messageId2), new vd.a(12, new d(groupPinnedMessagesViewModel6, 5)));
                                        c11.a(dVar2);
                                        groupPinnedMessagesViewModel6.f9080c.c(dVar2);
                                    }
                                }
                                this$0.K(false);
                                return;
                            default:
                                int i14 = GroupPinnedMessagesActivity.f9300m;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.K(false);
                                ((GroupPinnedMessagesViewModel) this$0.x()).h();
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.k("mLayoutManager");
            throw null;
        }
        Intrinsics.k("pinnedMessagesAdapter");
        throw null;
    }

    public final void K(boolean z10) {
        int i10;
        q0 q0Var = (q0) w();
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        q0Var.f5818x.setVisibility(i10);
        q0 q0Var2 = (q0) w();
        if (!z10) {
            i11 = 8;
        }
        q0Var2.f5817w.setVisibility(i11);
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
        ca.c factory = new ca.c(a0.a(GroupPinnedMessagesViewModel.class), new d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 4));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupPinnedMessagesViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupPinnedMessagesViewModel.class, "<this>", GroupPinnedMessagesViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = (GroupPinnedMessagesViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupPinnedMessagesViewModel);
            this.f17254b = groupPinnedMessagesViewModel;
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
