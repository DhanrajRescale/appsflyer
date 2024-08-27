package com.assetgro.stockgro.ui.chat.list;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.m;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.list.UserGroupListActivity;
import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import id.a;
import iu.a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import je.c;
import je.d;
import je.e;
import je.j;
import je.k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import vt.p0;
import vt.z;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/list/UserGroupListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/list/UserGroupListViewModel;", "Lba/m;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserGroupListActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static e f9394l;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f9395k = new ArrayList();

    @Override // gd.b
    public final int F() {
        return R.layout.activity_combined_channel_list;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((UserGroupListViewModel) x()).f9401p.observe(this, new a(26, c.f21315b));
        ((UserGroupListViewModel) x()).f9402q.observe(this, new a(26, new d(this, 0)));
        ((UserGroupListViewModel) x()).f9403r.observe(this, new a(26, new d(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("CHAT_MESSAGE");
        if (!(parcelableArrayListExtra instanceof ArrayList)) {
            parcelableArrayListExtra = null;
        }
        Intrinsics.c(parcelableArrayListExtra);
        this.f9395k = parcelableArrayListExtra;
        String stringExtra = getIntent().getStringExtra("GROUP_ID");
        if (stringExtra != null) {
            ((UserGroupListViewModel) x()).f9405t = stringExtra;
            UserGroupListViewModel userGroupListViewModel = (UserGroupListViewModel) x();
            dp.b.V0(userGroupListViewModel.f9399n.getUserId(), new k(userGroupListViewModel));
        }
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        final int i10 = 1;
        f9394l = new e(lifecycle, new be.b(this, i10));
        m mVar = (m) w();
        e eVar = f9394l;
        if (eVar != null) {
            mVar.f5411s.setAdapter(eVar);
            Toolbar toolbar = ((m) w()).f5413u;
            u(toolbar);
            vl.b r10 = r();
            if (r10 != null) {
                r10.j0();
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: je.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserGroupListActivity f21314b;

                {
                    this.f21314b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserGroupListActivity userGroupListActivity;
                    Iterator it;
                    int i11 = i10;
                    UserGroupListActivity this$0 = this.f21314b;
                    switch (i11) {
                        case 0:
                            e eVar2 = UserGroupListActivity.f9394l;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((UserGroupListViewModel) this$0.x()).f9404s.size() > 0) {
                                Iterator it2 = this$0.f9395k.iterator();
                                while (it2.hasNext()) {
                                    ChatMessage message = (ChatMessage) it2.next();
                                    Intrinsics.c(message);
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    UserGroupListViewModel userGroupListViewModel2 = (UserGroupListViewModel) this$0.x();
                                    HashSet hashSet = ((UserGroupListViewModel) this$0.x()).f9404s;
                                    ArrayList groupIds = new ArrayList(z.k(hashSet));
                                    Iterator it3 = hashSet.iterator();
                                    while (it3.hasNext()) {
                                        groupIds.add(((ChatChannel) it3.next()).getGroup().getGroupId());
                                    }
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    Intrinsics.checkNotNullParameter(groupIds, "groupIds");
                                    fv.e eVar3 = userGroupListViewModel2.f9400o;
                                    if (eVar3 != null && !eVar3.a()) {
                                        userGroupListActivity = this$0;
                                        it = it2;
                                    } else {
                                        Pair pair = new Pair("message_id", message.getMessageId());
                                        Pair pair2 = new Pair("template", message.getTemplate());
                                        Pair pair3 = new Pair("n_template", message.getMessage());
                                        ChatRepository chatRepository = userGroupListViewModel2.f9399n;
                                        userGroupListActivity = this$0;
                                        it = it2;
                                        Map g10 = p0.g(new Pair("groups", groupIds), new Pair("msg", p0.g(pair, pair2, pair3, new Pair("sender_id", chatRepository.getUserId()), new Pair("group_id", userGroupListViewModel2.f9405t), new Pair("token", a3.a.f("Bearer ", chatRepository.getAccessToken())), new Pair("client_time_micros", Long.valueOf(System.currentTimeMillis() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)), new Pair("media", message.getMedia()), new Pair("replied_to", message.getParentMessageId()), new Pair("replies_info", message.getThreadInfo()), new Pair("updated_at_micros", Long.valueOf(message.getUpdatedAt())))));
                                        try {
                                            fv.e eVar4 = userGroupListViewModel2.f9400o;
                                            if (eVar4 != null) {
                                                eVar4.d("fwd_msg_ack", new i(userGroupListViewModel2, 0));
                                            }
                                            fv.e eVar5 = userGroupListViewModel2.f9400o;
                                            if (eVar5 != null) {
                                                fv.g e10 = eVar5.e("fwd_msg_in", eVar5.f16283d, g10);
                                                e10.a("ok", c.f21317d);
                                                e10.a("error", c.f21318e);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    it2 = it;
                                    this$0 = userGroupListActivity;
                                }
                                return;
                            }
                            return;
                        default:
                            e eVar6 = UserGroupListActivity.f9394l;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.finish();
                            return;
                    }
                }
            });
            v(toolbar);
            e0 e0Var = ((UserGroupListViewModel) x()).f9084g;
            Boolean bool = Boolean.TRUE;
            e0Var.postValue(bool);
            ((UserGroupListViewModel) x()).f9404s.clear();
            UserGroupListViewModel userGroupListViewModel2 = (UserGroupListViewModel) x();
            userGroupListViewModel2.f9084g.postValue(bool);
            g.H(u0.f(userGroupListViewModel2), null, null, new j(userGroupListViewModel2, null), 3);
            final int i11 = 0;
            ((m) w()).f5412t.setOnClickListener(new View.OnClickListener(this) { // from class: je.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserGroupListActivity f21314b;

                {
                    this.f21314b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserGroupListActivity userGroupListActivity;
                    Iterator it;
                    int i112 = i11;
                    UserGroupListActivity this$0 = this.f21314b;
                    switch (i112) {
                        case 0:
                            e eVar2 = UserGroupListActivity.f9394l;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((UserGroupListViewModel) this$0.x()).f9404s.size() > 0) {
                                Iterator it2 = this$0.f9395k.iterator();
                                while (it2.hasNext()) {
                                    ChatMessage message = (ChatMessage) it2.next();
                                    Intrinsics.c(message);
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    UserGroupListViewModel userGroupListViewModel22 = (UserGroupListViewModel) this$0.x();
                                    HashSet hashSet = ((UserGroupListViewModel) this$0.x()).f9404s;
                                    ArrayList groupIds = new ArrayList(z.k(hashSet));
                                    Iterator it3 = hashSet.iterator();
                                    while (it3.hasNext()) {
                                        groupIds.add(((ChatChannel) it3.next()).getGroup().getGroupId());
                                    }
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    Intrinsics.checkNotNullParameter(groupIds, "groupIds");
                                    fv.e eVar3 = userGroupListViewModel22.f9400o;
                                    if (eVar3 != null && !eVar3.a()) {
                                        userGroupListActivity = this$0;
                                        it = it2;
                                    } else {
                                        Pair pair = new Pair("message_id", message.getMessageId());
                                        Pair pair2 = new Pair("template", message.getTemplate());
                                        Pair pair3 = new Pair("n_template", message.getMessage());
                                        ChatRepository chatRepository = userGroupListViewModel22.f9399n;
                                        userGroupListActivity = this$0;
                                        it = it2;
                                        Map g10 = p0.g(new Pair("groups", groupIds), new Pair("msg", p0.g(pair, pair2, pair3, new Pair("sender_id", chatRepository.getUserId()), new Pair("group_id", userGroupListViewModel22.f9405t), new Pair("token", a3.a.f("Bearer ", chatRepository.getAccessToken())), new Pair("client_time_micros", Long.valueOf(System.currentTimeMillis() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)), new Pair("media", message.getMedia()), new Pair("replied_to", message.getParentMessageId()), new Pair("replies_info", message.getThreadInfo()), new Pair("updated_at_micros", Long.valueOf(message.getUpdatedAt())))));
                                        try {
                                            fv.e eVar4 = userGroupListViewModel22.f9400o;
                                            if (eVar4 != null) {
                                                eVar4.d("fwd_msg_ack", new i(userGroupListViewModel22, 0));
                                            }
                                            fv.e eVar5 = userGroupListViewModel22.f9400o;
                                            if (eVar5 != null) {
                                                fv.g e10 = eVar5.e("fwd_msg_in", eVar5.f16283d, g10);
                                                e10.a("ok", c.f21317d);
                                                e10.a("error", c.f21318e);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    it2 = it;
                                    this$0 = userGroupListActivity;
                                }
                                return;
                            }
                            return;
                        default:
                            e eVar6 = UserGroupListActivity.f9394l;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.finish();
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("userGroupListAdapter");
        throw null;
    }

    @Override // h.m, androidx.fragment.app.j0, android.app.Activity
    public final void onDestroy() {
        fv.e eVar = ((UserGroupListViewModel) x()).f9400o;
        if (eVar != null) {
            fv.e.c(eVar);
        }
        yq.b bVar = new yq.b(1);
        fv.m mVar = le.g.f24613a;
        le.e eVar2 = new le.e(bVar, 2);
        mVar.f16332q = true;
        mVar.f16331p.a();
        mVar.f(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, null, eVar2);
        super.onDestroy();
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
        ca.c factory = new ca.c(a0.a(UserGroupListViewModel.class), new ea.d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 6));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, UserGroupListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserGroupListViewModel.class, "<this>", UserGroupListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserGroupListViewModel userGroupListViewModel = (UserGroupListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userGroupListViewModel);
            this.f17254b = userGroupListViewModel;
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
