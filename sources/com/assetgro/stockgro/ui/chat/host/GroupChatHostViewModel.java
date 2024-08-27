package com.assetgro.stockgro.ui.chat.host;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ge.q;
import ie.b;
import ie.c;
import ie.k;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ne.a;
import ni.j;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import rb.f;
import vt.x;
import vt.y;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/host/GroupChatHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupChatHostViewModel extends BaseViewModel {
    public String A;
    public String B;
    public a C;
    public final e0 D;
    public final List E;
    public final List F;
    public final List G;
    public String H;
    public String I;
    public int J;
    public int K;
    public final List L;
    public final List M;
    public final e0 N;
    public final d0 O;
    public final d0 P;
    public final d0 Q;
    public final e0 R;
    public final e0 S;
    public final e0 T;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9369n;

    /* renamed from: o, reason: collision with root package name */
    public final ArenaRepository f9370o;

    /* renamed from: p, reason: collision with root package name */
    public final qf.a f9371p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9372q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9373r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9374s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9375t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9376u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9377v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9378w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9379x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9380y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9381z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupChatHostViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, ArenaRepository arenaRepository, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9369n = chatRepository;
        this.f9370o = arenaRepository;
        this.f9371p = maintenanceConfigManager;
        ?? liveData = new LiveData();
        this.f9372q = liveData;
        this.f9373r = new LiveData();
        this.f9374s = new LiveData();
        this.f9375t = new LiveData();
        this.f9376u = new LiveData();
        this.f9377v = new LiveData();
        this.f9378w = new LiveData();
        this.f9379x = new LiveData();
        new LiveData();
        new LiveData();
        this.f9380y = new LiveData();
        this.f9381z = new LiveData();
        this.D = new LiveData();
        this.E = y.g("Social", "League", "Private");
        this.F = x.a("Social");
        this.G = x.a("1on1");
        this.H = HttpUrl.FRAGMENT_ENCODE_SET;
        this.I = HttpUrl.FRAGMENT_ENCODE_SET;
        this.L = y.g("Admin", "Moderator");
        this.M = y.g("Admin", "Moderator");
        this.N = new LiveData();
        this.O = i0.C(liveData, new b(this, 4));
        this.P = i0.C(liveData, new b(this, 3));
        this.Q = i0.C(liveData, k.f19927a);
        ?? liveData2 = new LiveData();
        this.R = liveData2;
        this.S = liveData2;
        this.T = new LiveData();
    }

    public static String k(Group group) {
        String type;
        if (group != null && (type = group.getType()) != null) {
            if (!type.equals("Support") && !type.equals("1on1")) {
                return group.getGroupName();
            }
            return group.getFriendUserName();
        }
        if (group != null) {
            return group.getGroupName();
        }
        return null;
    }

    public final void h(String str, String action, String groupId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9369n.blockUserOnPrivateChat(true, str).c(((e) this.f9079b).J());
        d dVar = new d(new q(1, new f(7, this, action, groupId)), new q(2, new b(this, 0)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i(boolean z10) {
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new c(this, z10, null), 3);
    }

    public final void j(ExitData exitData) {
        String groupId;
        Group group = (Group) this.f9372q.getValue();
        if (group != null && (groupId = group.getGroupId()) != null) {
            this.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new ie.d(this, groupId, exitData, null), 3);
        }
    }

    public final void l(ArenaGame arenaGame) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        TemplateParams templateParams = new TemplateParams(arenaGame.getName(), String.valueOf(arenaGame.getPrizePool()), HttpUrl.FRAGMENT_ENCODE_SET);
        RedirectConfig redirectConfig = new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/arena/league/", arenaGame.getGameId()), arenaGame.getGameId(), "appsflyer", this.f9081d.getUserReferralCode());
        Boolean bool = Boolean.TRUE;
        InviteTemplateDto inviteTemplateDto = new InviteTemplateDto("league_chat_invite", templateParams, bool, redirectConfig);
        this.f9084g.postValue(bool);
        g.H(u0.f(this), null, null, new ie.h(this, inviteTemplateDto, null), 3);
    }

    public final void m() {
        String str;
        InviteTemplateDto inviteTemplateDto;
        e0 e0Var = this.f9372q;
        Group group = (Group) e0Var.getValue();
        if (group != null) {
            str = group.getType();
        } else {
            str = null;
        }
        boolean a10 = Intrinsics.a(str, "League");
        e0 e0Var2 = this.f9083f;
        if (a10) {
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                e0Var2.setValue(j.i("Not connected to internet"));
                return;
            }
            String str2 = this.A;
            if (str2 != null) {
                g.H(u0.f(this), null, null, new ie.g(this, str2, null), 3);
                return;
            }
            return;
        }
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            e0Var2.setValue(j.i("Not connected to internet"));
            return;
        }
        Group group2 = (Group) e0Var.getValue();
        if (group2 != null) {
            inviteTemplateDto = new InviteTemplateDto("chat_group_invite", new TemplateParams(group2.getGroupName(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/social/chats/", group2.getGroupId()), group2.getGroupId(), "appsflyer", this.f9081d.getUserReferralCode()));
        } else {
            inviteTemplateDto = null;
        }
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new ie.e(this, inviteTemplateDto, null), 3);
    }

    public final boolean n() {
        String type;
        Group group = (Group) this.f9372q.getValue();
        if (group != null && (type = group.getType()) != null) {
            return this.E.contains(type);
        }
        return false;
    }

    public final void o(String action, String groupId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new ie.j(this, action, groupId, null), 3);
    }
}
