package com.assetgro.stockgro.ui.chat.host;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.c0;
import androidx.navigation.f0;
import androidx.navigation.i0;
import b3.t;
import ba.e0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CharLimit;
import com.assetgro.stockgro.data.model.ExitOption;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.MembershipStatus;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import id.a;
import ie.f;
import ie.i;
import ie.m;
import ie.n;
import ie.q;
import ie.s;
import iu.a0;
import iu.v;
import java.util.List;
import jt.d;
import k.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import l.o;
import ls.n0;
import m.w;
import okhttp3.HttpUrl;
import ut.g;
import ut.h;
import vt.p0;
import yd.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/host/GroupDetailHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/host/GroupChatHostViewModel;", "Lba/e0;", "Lyd/c;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupDetailHostActivity extends b implements c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f9382p = 0;

    /* renamed from: k, reason: collision with root package name */
    public final e.c f9383k;

    /* renamed from: l, reason: collision with root package name */
    public final g f9384l;

    /* renamed from: m, reason: collision with root package name */
    public f0 f9385m;

    /* renamed from: n, reason: collision with root package name */
    public ChatSharedViewModel f9386n;

    /* renamed from: o, reason: collision with root package name */
    public ue.b f9387o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public GroupDetailHostActivity() {
        e.c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 3));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9383k = registerForActivityResult;
        this.f9384l = h.a(new lc.b(this, 19));
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_chat_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupChatHostViewModel) x()).T.observe(this, new a(24, new q(this, 13)));
        ((GroupChatHostViewModel) x()).f9374s.observe(this, new a(24, new q(this, 15)));
        ((GroupChatHostViewModel) x()).f9373r.observe(this, new a(24, new q(this, 16)));
        ((GroupChatHostViewModel) x()).S.observe(this, new a(24, new q(this, 17)));
        ((GroupChatHostViewModel) x()).f9375t.observe(this, new a(24, new q(this, 18)));
        GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) x();
        groupChatHostViewModel.O.observe(this, new a(24, new q(this, 19)));
        GroupChatHostViewModel groupChatHostViewModel2 = (GroupChatHostViewModel) x();
        groupChatHostViewModel2.P.observe(this, new a(24, new q(this, 20)));
        GroupChatHostViewModel groupChatHostViewModel3 = (GroupChatHostViewModel) x();
        groupChatHostViewModel3.Q.observe(this, new a(24, new q(this, 21)));
        ((GroupChatHostViewModel) x()).f9376u.observe(this, new a(24, new q(this, 22)));
        GroupChatHostViewModel groupChatHostViewModel4 = (GroupChatHostViewModel) x();
        groupChatHostViewModel4.Q.observe(this, new a(24, new q(this, 0)));
        ((GroupChatHostViewModel) x()).f9376u.observe(this, new a(24, new q(this, 1)));
        K().C.observe(this, new a(24, new q(this, 2)));
        K().D.observe(this, new a(24, new q(this, 3)));
        K().E.observe(this, new a(24, new q(this, 4)));
        ((GroupChatHostViewModel) x()).f9372q.observe(this, new a(24, new q(this, 8)));
        K().f9135p.observe(this, new a(24, new q(this, 9)));
        K().f9136q.observe(this, new a(24, new q(this, 10)));
        ((GroupChatHostViewModel) x()).f9378w.observe(this, new a(24, new q(this, 11)));
        ((GroupChatHostViewModel) x()).f9379x.observe(this, new a(24, new q(this, 12)));
        ((GroupChatHostViewModel) x()).f9381z.observe(this, new a(24, new q(this, 14)));
    }

    @Override // gd.b
    public final void I() {
        String string;
        String groupId;
        Bundle extras = getIntent().getExtras();
        int i10 = 3;
        int i11 = 2;
        int i12 = 1;
        if (extras != null && (groupId = extras.getString("GROUP_CHAT_ID")) != null) {
            ((GroupChatHostViewModel) x()).A = groupId;
            GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) x();
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            groupChatHostViewModel.f9084g.postValue(Boolean.TRUE);
            nt.h c10 = groupChatHostViewModel.f9369n.getChatGroupById(groupId, true, true).c(((e) groupChatHostViewModel.f9079b).J());
            d dVar = new d(new ge.q(3, new ie.b(groupChatHostViewModel, 1)), new ge.q(4, new ie.b(groupChatHostViewModel, 2)));
            c10.a(dVar);
            groupChatHostViewModel.f9080c.c(dVar);
            GroupChatHostViewModel groupChatHostViewModel2 = (GroupChatHostViewModel) x();
            yk.g.H(u0.f(groupChatHostViewModel2), null, null, new f(groupChatHostViewModel2, null), 3);
            GroupChatHostViewModel groupChatHostViewModel3 = (GroupChatHostViewModel) x();
            yk.g.H(u0.f(groupChatHostViewModel3), null, null, new i(groupChatHostViewModel3, null), 3);
        }
        Bundle extras2 = getIntent().getExtras();
        int i13 = 0;
        if (extras2 != null) {
            ((GroupChatHostViewModel) x()).K = extras2.getBoolean("CALL_FROM_CHAT", false) ? 1 : 0;
        }
        ((e0) w()).f4550t.setOnClickListener(new zc.c(1));
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null && (string = extras3.getString("INVITE_GROUP_NAME")) != null) {
            ((GroupChatHostViewModel) x()).B = string;
            ((e0) w()).f4553w.setText(string);
        }
        ((GroupChatHostViewModel) x()).C = (ne.a) getIntent().getSerializableExtra("INVITE_TYPE");
        this.f9385m = ((i0) L().B.getValue()).b(R.navigation.group_detail_navigation);
        ne.a aVar = ((GroupChatHostViewModel) x()).C;
        if (aVar != null) {
            View clickDisablerView = ((e0) w()).f4550t;
            Intrinsics.checkNotNullExpressionValue(clickDisablerView, "clickDisablerView");
            zq.f.m0(clickDisablerView);
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    e0 e0Var = (e0) w();
                    s sVar = new s(this, i10);
                    Object obj = b1.d.f3079a;
                    e0Var.f4551u.setContent(new b1.c(sVar, true, 1766777279));
                }
            } else {
                e0 e0Var2 = (e0) w();
                s sVar2 = new s(this, i11);
                Object obj2 = b1.d.f3079a;
                e0Var2.f4551u.setContent(new b1.c(sVar2, true, 498243592));
            }
            Unit unit = Unit.f23355a;
        }
        ((e0) w()).f4549s.setOnOptionSelected(new va.b(this, 1));
        ((e0) w()).f4555y.setOnClickListener(new m(this, i13));
        Toolbar toolbar = ((e0) w()).A;
        u(toolbar);
        toolbar.setNavigationOnClickListener(new m(this, i12));
        v(toolbar);
        this.f9387o = new ue.b(this);
        String groupId2 = ((GroupChatHostViewModel) x()).A;
        if (groupId2 != null) {
            ue.b bVar = this.f9387o;
            if (bVar != null) {
                String userId = ((GroupChatHostViewModel) x()).f9369n.getUserId();
                if (userId == null) {
                    userId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Intrinsics.checkNotNullParameter(groupId2, "groupId");
                Intrinsics.checkNotNullParameter(userId, "userId");
                bVar.f37072b = groupId2;
                bVar.f37073c = userId;
                ue.b bVar2 = this.f9387o;
                if (bVar2 != null) {
                    bVar2.a(new q(this, 23));
                } else {
                    Intrinsics.k("chatCacheManager");
                    throw null;
                }
            } else {
                Intrinsics.k("chatCacheManager");
                throw null;
            }
        }
        ((e0) w()).f4554x.setOnClickListener(new m(this, i11));
    }

    public final ChatSharedViewModel K() {
        ChatSharedViewModel chatSharedViewModel = this.f9386n;
        if (chatSharedViewModel != null) {
            return chatSharedViewModel;
        }
        Intrinsics.k("chatSharedViewModel");
        throw null;
    }

    public final androidx.navigation.t L() {
        return (androidx.navigation.t) this.f9384l.getValue();
    }

    public final void M(boolean z10) {
        MembershipStatus membershipStatus;
        w wVar = new w(new k.e(this, R.style.SocialPopupTheme), ((e0) w()).f4555y);
        new j((Context) wVar.f25760a).inflate(R.menu.menu_channel, (o) wVar.f25761b);
        v vVar = new v();
        int i10 = 1;
        if (z10) {
            Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group != null) {
                if (!group.getIsUserBlocked() && !Intrinsics.a(K().f9138s.getValue(), Boolean.TRUE)) {
                    ((o) wVar.f25761b).add(0, 3, 3, R.string.text_block);
                } else {
                    Group group2 = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
                    if ((group2 == null || !group2.getIAmBlocked()) && Intrinsics.a(K().f9138s.getValue(), Boolean.TRUE)) {
                        ((o) wVar.f25761b).add(0, 3, 3, R.string.text_unblock_normal);
                    }
                }
            }
            Group group3 = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group3 != null && (membershipStatus = group3.getMembershipStatus()) != null) {
                boolean isMuted = membershipStatus.getIsMuted();
                vVar.f20556a = isMuted;
                if (isMuted) {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_unmute);
                } else {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_mute);
                }
            }
        }
        wVar.f25764e = new ie.o(this, z10, vVar, i10);
        wVar.k();
    }

    public final void N(boolean z10) {
        MembershipStatus membershipStatus;
        w wVar = new w(new k.e(this, R.style.SocialPopupTheme), ((e0) w()).f4555y);
        new j((Context) wVar.f25760a).inflate(R.menu.menu_chat_user, (o) wVar.f25761b);
        v vVar = new v();
        int i10 = 0;
        if (z10) {
            Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group != null && (membershipStatus = group.getMembershipStatus()) != null) {
                boolean isMuted = membershipStatus.getIsMuted();
                vVar.f20556a = isMuted;
                if (isMuted) {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_unmute);
                } else {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_mute);
                }
            }
            Group group2 = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group2 != null && group2.getIsFeedEnabled()) {
                ((o) wVar.f25761b).add(0, 5, 5, R.string.text_community_guidelines);
            }
        }
        wVar.f25764e = new ie.o(this, z10, vVar, i10);
        wVar.k();
    }

    public final void O(boolean z10) {
        MembershipStatus membershipStatus;
        w wVar = new w(new k.e(this, R.style.SocialPopupTheme), ((e0) w()).f4555y);
        new j((Context) wVar.f25760a).inflate(R.menu.menu_channel_admin, (o) wVar.f25761b);
        v vVar = new v();
        int i10 = 0;
        if (z10) {
            Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group != null && (membershipStatus = group.getMembershipStatus()) != null) {
                boolean isMuted = membershipStatus.getIsMuted();
                vVar.f20556a = isMuted;
                if (isMuted) {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_unmute);
                } else {
                    ((o) wVar.f25761b).add(0, 4, 4, R.string.text_mute);
                }
            }
            Group group2 = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
            if (group2 != null && group2.getIsFeedEnabled()) {
                ((o) wVar.f25761b).add(0, 5, 5, R.string.text_community_guidelines);
            }
        }
        wVar.f25764e = new n(i10, this, wVar, vVar);
        wVar.k();
    }

    public final void P(String optionTapped) {
        Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
        if (group != null) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(optionTapped, "optionTapped");
            A(new AnalyticEvent("app_groupview_threedots_options", p0.f(new Pair("group_id", group.getGroupId()), new Pair("group_name", group.getGroupName()), new Pair("options_tapped", optionTapped))));
        }
    }

    public final void Q() {
        CharLimit charLimit;
        Bundle extras;
        if (!((GroupChatHostViewModel) x()).n()) {
            return;
        }
        P("group_info");
        y().screenNavigated("social-group-info");
        Intent intent = new Intent(this, (Class<?>) GroupInfoActivity.class);
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            charLimit = (CharLimit) extras.getParcelable("CHAR_LIMIT");
        } else {
            charLimit = null;
        }
        intent.putExtra("DEEPLINK", "stockgro://social/group/info?groupId=" + ((GroupChatHostViewModel) x()).A);
        intent.putExtra("CHAR_LIMIT", charLimit);
        intent.putExtra("INVITE_TYPE", ((GroupChatHostViewModel) x()).C);
        startActivityForResult(intent, 10013);
    }

    public final void R() {
        Pair pair;
        Unit unit;
        List<ExitOption> exitReasons;
        Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
        if (group != null) {
            if (kotlin.text.s.j(group.getType(), "1on1", false)) {
                pair = new Pair(Integer.valueOf(R.string.text_message_exit_personal_group), group.getFriendUserName());
            } else {
                pair = new Pair(Integer.valueOf(R.string.text_message_exit_multi_group), group.getGroupName());
            }
        } else {
            pair = new Pair(Integer.valueOf(R.string.group_exit_message), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String string = getString(((Number) pair.f23353a).intValue());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String m10 = a3.a.m(new Object[]{pair.f23354b}, 1, string, "format(...)");
        Group group2 = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
        if (group2 != null && (exitReasons = group2.getExitReasons()) != null) {
            if (exitReasons.isEmpty()) {
                S(m10);
            } else {
                c cVar = yd.e.f41535b;
                String string2 = getString(R.string.exit_group);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = getString(R.string.cancel);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                sb.b.b(m10, string2, string3, this, exitReasons).show(getSupportFragmentManager(), "ExitDialogFragment");
            }
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            S(m10);
        }
    }

    public final void S(String alertMessage) {
        int i10;
        Group group = (Group) ((GroupChatHostViewModel) x()).f9372q.getValue();
        int i11 = 0;
        if (group != null) {
            if (kotlin.text.s.j(group.getType(), "1on1", false)) {
                i10 = R.string.text_delete_chat;
            } else {
                i10 = R.string.exit_group;
            }
        } else {
            i10 = R.string.exit;
        }
        eb.f listener = new eb.f(this, 1);
        String positiveButtonText = getString(i10);
        Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
        String negativeButtonText = getString(R.string.cancel);
        Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(listener, "listener");
        h.i iVar = new h.i(this, R.style.StockgroDialogTheme);
        h.e eVar = iVar.f17693a;
        eVar.f17611f = alertMessage;
        qj.c cVar = new qj.c(listener, i11);
        eVar.f17612g = positiveButtonText;
        eVar.f17613h = cVar;
        qj.c cVar2 = new qj.c(listener, 1);
        eVar.f17614i = negativeButtonText;
        eVar.f17615j = cVar2;
        iVar.c();
    }

    @Override // yd.c
    public final void d(ExitOption reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ((GroupChatHostViewModel) x()).f9377v.postValue(Boolean.TRUE);
        ((GroupChatHostViewModel) x()).j(new ExitData(reason.getCode(), reason.getMsg()));
    }

    @Override // yd.c
    public final void e() {
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10013 && i11 == 0) {
            Intent intent2 = new Intent();
            intent2.putExtra("GROUP_CHAT_ID", ((GroupChatHostViewModel) x()).A);
            intent2.putExtra("IS_FOLLOWING", true);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        Integer num;
        boolean z10;
        o7.f fVar;
        d1 childFragmentManager;
        List f10;
        c0 c0Var;
        setResult(-1);
        androidx.navigation.n nVar = (androidx.navigation.n) L().f2310g.o();
        GroupChatFragment groupChatFragment = null;
        if (nVar != null && (c0Var = nVar.f2258b) != null) {
            num = Integer.valueOf(c0Var.f2181h);
        } else {
            num = null;
        }
        if (((e0) w()).f4549s.D.getVisibility() == 0) {
            androidx.lifecycle.e0 e0Var = K().G;
            Unit unit = Unit.f23355a;
            e0Var.postValue(new kj.j(unit));
            K().E.postValue(new kj.j(unit));
            return;
        }
        if (K().f9133n) {
            K().F.postValue(new kj.j(Unit.f23355a));
            return;
        }
        View clickDisablerView = ((e0) w()).f4550t;
        Intrinsics.checkNotNullExpressionValue(clickDisablerView, "clickDisablerView");
        if (clickDisablerView.getVisibility() == 0) {
            Intent intent = new Intent();
            intent.putExtra("GROUP_CHAT_ID", ((GroupChatHostViewModel) x()).A);
            intent.putExtra("IS_FOLLOWING", true);
            setResult(-1, intent);
            finish();
        }
        if (num != null && num.intValue() == R.id.chatFragment) {
            d1 supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            int i10 = kj.f.f23221a;
            Intrinsics.checkNotNullParameter(supportFragmentManager, "<this>");
            g0 g0Var = supportFragmentManager.f1668y;
            if (g0Var != null && (childFragmentManager = g0Var.getChildFragmentManager()) != null && (f10 = childFragmentManager.f1646c.f()) != null) {
                fVar = (g0) vt.g0.u(f10);
            } else {
                fVar = null;
            }
            if (fVar instanceof GroupChatFragment) {
                groupChatFragment = (GroupChatFragment) fVar;
            }
            if (groupChatFragment != null && ((GroupChatViewModel) groupChatFragment.r()).f9189u == ((GroupChatViewModel) groupChatFragment.r()).f9183r) {
                ((GroupChatViewModel) groupChatFragment.r()).f9189u = ((GroupChatViewModel) groupChatFragment.r()).f9179p;
                groupChatFragment.K();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        boolean z11 = false;
        if (extras != null) {
            z10 = extras.getBoolean("is_deep_link_flag");
        } else {
            z10 = false;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            z11 = extras2.getBoolean("HANDLE_BACKPRESS");
        }
        if (z11 && (isTaskRoot() || z10)) {
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("path", "social");
            intent2.putExtra("HANDLE_BACKPRESS", z11);
            startActivity(intent2);
            finish();
            return;
        }
        if (num != null && num.intValue() != R.id.groupFeedAndChatHostFragment && num.intValue() != R.id.chatFragment && num.intValue() != R.id.feedStreamFragment) {
            t();
            return;
        }
        Intent intent3 = new Intent();
        intent3.putExtra("GROUP_CHAT_ID", ((GroupChatHostViewModel) x()).A);
        intent3.putExtra("IS_FOLLOWING", true);
        setResult(-1, intent3);
        finish();
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) x();
        qf.b bVar = qf.b.f31929d;
        qf.a aVar = groupChatHostViewModel.f9371p;
        if (aVar.b(bVar) || aVar.b(qf.b.f31931f)) {
            Intent intent = new Intent(this, (Class<?>) MaintenanceWindowActivity.class);
            intent.putExtra("DATA", bVar);
            intent.putExtra("SHOW_TOOLBAR", true);
            intent.putExtra("TOOLBAR_TITLE", getString(R.string.text_social_lowercase));
            startActivity(intent);
            finish();
        }
    }

    @Override // h.m
    public final boolean t() {
        if (!L().p() && !super.t()) {
            return false;
        }
        return true;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        ea.v vVar = (ea.v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        yk.g.i(chatRepository);
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        yk.g.i(arenaRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        yk.g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(GroupChatHostViewModel.class), new ea.g(schedulerProvider, compositeDisposable, userRepository, chatRepository, arenaRepository, maintenanceConfigManager));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupChatHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupChatHostViewModel.class, "<this>", GroupChatHostViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(groupChatHostViewModel);
            this.f17254b = groupChatHostViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            this.f9386n = activityComponent.b();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
