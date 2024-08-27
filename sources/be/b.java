package be;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.g0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import b0.l1;
import b0.s;
import b0.v;
import b0.y;
import c2.i;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.enums.GroupJoinStatus;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListActivity;
import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup;
import com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitActivity;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansViewModel;
import d2.w0;
import g1.e;
import g1.l;
import g7.x0;
import h7.g;
import id.p;
import iu.k;
import j2.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.w;
import m0.l5;
import nl.n0;
import okhttp3.HttpUrl;
import okhttp3.Response;
import p0.h;
import p0.o;
import t0.g1;
import t0.m;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import tu.f;
import tu.s0;
import vt.p0;
import yk.j;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(2);
        this.f6954a = i10;
        this.f6955b = obj;
    }

    private final void f(n nVar, int i10) {
        if ((i10 & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        MessageInvitesActivity messageInvitesActivity = (MessageInvitesActivity) this.f6955b;
        h7.b a10 = g.a((f) ((SocialChatListViewModel) messageInvitesActivity.x()).Q.getValue(), nVar);
        g1 K0 = j.K0(new s0(((SocialChatListViewModel) messageInvitesActivity.x()).R), nVar);
        o D1 = dp.b.D1(((Boolean) K0.getValue()).booleanValue(), new lc.b(messageInvitesActivity, 20), nVar, 0);
        l lVar = l.f16404b;
        FillElement fillElement = d.f1286c;
        g1.o K02 = al.d.K0(fillElement, D1);
        r rVar2 = (r) nVar;
        rVar2.b0(733328855);
        v c10 = s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(K02);
        boolean z10 = rVar2.f35166a instanceof t0.f;
        if (z10) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            i iVar = c2.k.f7749e;
            t.v0(rVar2, c10, iVar);
            i iVar2 = c2.k.f7748d;
            t.v0(rVar2, o10, iVar2);
            i iVar3 = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            if (Intrinsics.a(a10.c().f16682a, x0.f17118b)) {
                rVar2.b0(1559121050);
                b0.g gVar = b0.n.f2939e;
                e eVar = g1.a.f16392n;
                rVar2.b0(-483455358);
                l1 a11 = y.a(gVar, eVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(fillElement);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t.v0(rVar2, a11, iVar);
                    t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar2, 0, 31);
                    v.e.y(rVar2, false, true, false, false);
                    rVar2.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                rVar2.b0(1559488772);
                kp.j.o(lVar, a10, new v.g(messageInvitesActivity, 12), rVar2, 70, 0);
                rVar2.s(false);
            }
            h.a(((Boolean) K0.getValue()).booleanValue(), D1, bVar.a(lVar, g1.a.f16380b), 0L, 0L, false, rVar2, 64, 56);
            v.e.y(rVar2, false, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void i(n nVar, int i10) {
        String str;
        String str2;
        String str3;
        if ((i10 & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        l lVar = l.f16404b;
        float f10 = 8;
        g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, f10, 2);
        SocialExpertGroup socialExpertGroup = (SocialExpertGroup) this.f6955b;
        r rVar2 = (r) nVar;
        rVar2.b0(-483455358);
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(x10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, a10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.a.c(d.g(lVar, 32), rVar2);
            g1.o a11 = h2.l.a(lVar, false, hf.v.f18420e);
            String groupName = socialExpertGroup.getGroupName();
            if (groupName == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = groupName;
            }
            al.d.C(str, a11, w0.e(R.color.black_1A1A1A, rVar2), kp.j.S(16, rVar2, 6), null, null, jh.c.f21383l, 0L, null, null, 0L, 2, false, 2, 2, null, null, rVar2, 1572864, 27696, 104368);
            float f11 = 2;
            pp.b.c(v.e.f(lVar, f11, rVar2, lVar, 1.0f), w0.e(R.color.white_E3E3E3, rVar2), s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
            androidx.compose.foundation.layout.a.c(d.g(lVar, 6), rVar2);
            g1.o a12 = h2.l.a(lVar, false, hf.v.f18421f);
            String name = socialExpertGroup.getName();
            if (name == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str2 = name;
            }
            al.d.C(str2, a12, w0.e(R.color.purpleSubmitBackground, rVar2), j.e1(14), null, null, jh.c.f21380i, 0L, null, null, 0L, 2, false, 1, 0, null, null, rVar2, 1575936, 3120, 120752);
            androidx.compose.foundation.layout.a.c(d.g(lVar, f11), rVar2);
            g1.o a13 = h2.l.a(lVar, false, hf.v.f18422g);
            String members = socialExpertGroup.getMembers();
            if (members == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str3 = members;
            }
            al.d.C(str3, a13, w0.e(R.color.orange_new, rVar2), j.e1(11), null, null, jh.c.f21378g, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
            v.e.y(rVar2, false, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void j(n nVar, int i10) {
        String str;
        String str2;
        String str3;
        if ((i10 & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        l lVar = l.f16404b;
        float f10 = 8;
        g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, f10, 2);
        UserInfoItem userInfoItem = (UserInfoItem) this.f6955b;
        r rVar2 = (r) nVar;
        rVar2.b0(-483455358);
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(x10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, a10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.a.c(d.g(lVar, 32), rVar2);
            g1.o a11 = h2.l.a(lVar, false, hf.v.f18426k);
            String name = userInfoItem.getName();
            if (name == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = name;
            }
            long S = kp.j.S(18, rVar2, 6);
            o2.v vVar = jh.c.f21384m;
            al.d.C(str, a11, w0.e(R.color.black_1A1A1A, rVar2), S, null, null, vVar, 0L, null, null, 0L, 2, false, 1, 0, null, null, rVar2, 1572864, 3120, 120752);
            float f11 = 2;
            pp.b.c(v.e.f(lVar, f11, rVar2, lVar, 1.0f), w0.e(R.color.separator_color_new, rVar2), s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
            androidx.compose.foundation.layout.a.c(d.g(lVar, 6), rVar2);
            g1.o a12 = h2.l.a(lVar, false, hf.v.f18427l);
            String percentageReturn = userInfoItem.getPercentageReturn();
            if (percentageReturn == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str2 = percentageReturn;
            }
            al.d.C(str2, a12, w0.e(R.color.purpleSubmitBackground, rVar2), j.e1(16), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
            androidx.compose.foundation.layout.a.c(d.g(lVar, f11), rVar2);
            g1.o a13 = h2.l.a(lVar, false, hf.v.f18428m);
            String subTitle = userInfoItem.getSubTitle();
            if (subTitle == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str3 = subTitle;
            }
            al.d.C(str3, a13, w0.e(R.color.orange_new, rVar2), j.e1(11), null, null, jh.c.f21382k, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
            v.e.y(rVar2, false, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void k(n nVar, int i10) {
        if ((i10 & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        r rVar2 = (r) nVar;
        rVar2.b0(-2039945925);
        j2.c cVar = new j2.c();
        int h10 = cVar.h(new b0(w0.e(R.color.purpleSubmitBackground, rVar2), j.e1(12), null, null, null, jh.c.f21373b, null, 0L, null, null, null, 0L, u2.j.f36685c, null, 61404));
        try {
            cVar.g("Click Here", "Click Here");
            cVar.d("Click Here");
            Unit unit = Unit.f23355a;
            cVar.f(h10);
            h10 = cVar.h(new b0(0L, j.e1(12), null, null, null, jh.c.f21372a, null, 0L, null, null, null, 0L, null, null, 65501));
            try {
                cVar.d(" to know more about the beneficiary policy");
                cVar.f(h10);
                j2.e i11 = cVar.i();
                rVar2.s(false);
                rVar2.b0(-2039918165);
                boolean h11 = rVar2.h(i11);
                Object obj = (WithdrawableLimitActivity) this.f6955b;
                boolean h12 = h11 | rVar2.h(obj);
                Object Q = rVar2.Q();
                if (h12 || Q == m.f35080a) {
                    Q = new zd.g(8, i11, obj);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                i0.l1.e(i11, null, null, false, 0, 0, null, (Function1) Q, rVar2, 0, 126);
            } finally {
            }
        } finally {
        }
    }

    public final void a(String transactionId, String transactionStatus) {
        int i10 = this.f6954a;
        Object obj = this.f6955b;
        switch (i10) {
            case 7:
                Intrinsics.checkNotNullParameter(transactionId, "id");
                Intrinsics.checkNotNullParameter(transactionStatus, "status");
                WalletTransactionListFragment walletTransactionListFragment = (WalletTransactionListFragment) obj;
                walletTransactionListFragment.x(new AnalyticEvent("app_txn_detail_open", p0.f(new Pair("status", transactionStatus))));
                androidx.navigation.t h10 = q6.l.h(walletTransactionListFragment);
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(transactionStatus, "transactionStatus");
                h10.o(new dg.l(transactionId, transactionStatus));
                return;
            case 15:
                Intrinsics.checkNotNullParameter(transactionId, "id");
                Intrinsics.checkNotNullParameter(transactionStatus, "userName");
                kh.g gVar = (kh.g) obj;
                if (!((UserStatisticsViewModel) gVar.r()).i(transactionId) && !Intrinsics.a(transactionId, ((UserStatisticsViewModel) gVar.r()).f10054q)) {
                    Intent intent = new Intent(gVar.getActivity(), (Class<?>) UserProfileActivity.class);
                    intent.putExtra("USER_IDENTIFIER", transactionId);
                    intent.putExtra("USER_NAME", transactionStatus);
                    g0 parentFragment = gVar.getParentFragment();
                    Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.statistics.UserStatisticsFragment");
                    ((kh.y) parentFragment).f23192k.a(intent);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(transactionId, "winnerId");
                Intrinsics.checkNotNullParameter(transactionStatus, "winnerName");
                ((kh.k) obj).f23149g.invoke(transactionId, transactionStatus);
                return;
        }
    }

    public final void d(Throwable t10, Response response) {
        int i10 = this.f6954a;
        Object obj = this.f6955b;
        switch (i10) {
            case 23:
                Intrinsics.e(t10, "<anonymous parameter 0>");
                ((fv.e) obj).f16287h.a();
                return;
            default:
                Intrinsics.e(t10, "t");
                fv.m mVar = (fv.m) obj;
                mVar.getClass();
                mVar.d("Transport: error " + t10);
                mVar.g();
                Iterator it = ((List) mVar.f16325j.f11784d).iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(t10, response);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x03e2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1.Q(), java.lang.Integer.valueOf(r13)) == false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(t0.n r54, int r55) {
        /*
            Method dump skipped, instructions count: 3214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.b.e(t0.n, int):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GroupJoinStatus groupJoinStatus;
        int i10 = this.f6954a;
        int i11 = 3;
        boolean z10 = false;
        Object obj3 = this.f6955b;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                String str = (String) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                c cVar = (c) obj3;
                SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) cVar.r();
                Intrinsics.checkNotNullParameter(group, "chatGroup");
                boolean isEmpty = socialChatListViewModel.f9101x.isEmpty();
                e0 e0Var = socialChatListViewModel.f9098u;
                if (isEmpty) {
                    e0Var.postValue(group.getGroupId());
                }
                String str2 = (String) socialChatListViewModel.f9101x.get(group.getGroupId());
                if (kotlin.text.s.j(str2, "Joined", false)) {
                    groupJoinStatus = GroupJoinStatus.Joined;
                } else if (kotlin.text.s.j(str2, "Requested", false)) {
                    groupJoinStatus = GroupJoinStatus.Requested;
                } else if (kotlin.text.s.j(str2, "Cancelled", false)) {
                    groupJoinStatus = GroupJoinStatus.Cancelled;
                } else if (kotlin.text.s.j(str2, "Exited", false)) {
                    groupJoinStatus = GroupJoinStatus.Exited;
                } else {
                    groupJoinStatus = GroupJoinStatus.None;
                }
                int i12 = p.f19875a[groupJoinStatus.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                group.setJoinStatus("None");
                                e0Var.postValue(group.getGroupId());
                            } else {
                                group.setJoinStatus("Exited");
                                e0Var.postValue(group.getGroupId());
                            }
                        } else {
                            group.setJoinStatus("Cancelled");
                            e0Var.postValue(group.getGroupId());
                        }
                    } else {
                        group.setJoinStatus("Requested");
                        e0Var.postValue(group.getGroupId());
                    }
                } else {
                    group.setJoinStatus("Joined");
                    socialChatListViewModel.f9099v.postValue(group);
                }
                Intrinsics.checkNotNullParameter(group, "group");
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("group_id", group.getGroupId());
                pairArr[1] = new Pair("group_name", group.getGroupName());
                pairArr[2] = new Pair("subscription_type", group.getSubscriptionPackageInfo().getAccessPackageName());
                Boolean hasWriteAccess = group.getHasWriteAccess();
                if (hasWriteAccess != null) {
                    z10 = hasWriteAccess.booleanValue();
                }
                pairArr[3] = new Pair("privacy_type", String.valueOf(z10));
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                pairArr[4] = new Pair("category_name", str);
                cVar.x(new AnalyticEvent("app_groups_grouptile_tapped", p0.f(pairArr)));
                return Unit.f23355a;
            case 1:
                ChatChannel chatGroup = (ChatChannel) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(chatGroup, "chatGroup");
                UserGroupListActivity userGroupListActivity = (UserGroupListActivity) obj3;
                je.e eVar = UserGroupListActivity.f9394l;
                userGroupListActivity.getClass();
                if (booleanValue) {
                    chatGroup.setCheck(true);
                    if (!((UserGroupListViewModel) userGroupListActivity.x()).f9404s.contains(chatGroup)) {
                        ((UserGroupListViewModel) userGroupListActivity.x()).f9404s.add(chatGroup);
                    }
                } else {
                    chatGroup.setCheck(false);
                    ((UserGroupListViewModel) userGroupListActivity.x()).f9404s.remove(chatGroup);
                }
                ((UserGroupListViewModel) userGroupListActivity.x()).f9403r.postValue(Boolean.valueOf(!((UserGroupListViewModel) userGroupListActivity.x()).f9404s.isEmpty()));
                return Unit.f23355a;
            case 2:
                GroupMember member = (GroupMember) obj;
                View view = (View) obj2;
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "view");
                BannedMembersListActivity bannedMembersListActivity = (BannedMembersListActivity) obj3;
                int i13 = BannedMembersListActivity.f9417l;
                bannedMembersListActivity.getClass();
                w wVar = new w(bannedMembersListActivity, view);
                new k.j((Context) wVar.f25760a).inflate(R.menu.menu_member_options_for_banned_users, (l.o) wVar.f25761b);
                wVar.f25764e = new androidx.fragment.app.g(22, bannedMembersListActivity, member);
                wVar.k();
                return Unit.f23355a;
            case 3:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((String) obj, (String) obj2);
                return Unit.f23355a;
            case 8:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 10:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 11:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 12:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 13:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 14:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 15:
                a((String) obj, (String) obj2);
                return Unit.f23355a;
            case 16:
                a((String) obj, (String) obj2);
                return Unit.f23355a;
            case 17:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 18:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                User user = (User) obj;
                View view2 = (View) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(view2, "view");
                BlockedUserListActivity blockedUserListActivity = (BlockedUserListActivity) obj3;
                int i14 = BlockedUserListActivity.f10120l;
                blockedUserListActivity.getClass();
                w wVar2 = new w(blockedUserListActivity, view2);
                new k.j((Context) wVar2.f25760a).inflate(R.menu.menu_options_dynamic, (l.o) wVar2.f25761b);
                ((l.o) wVar2.f25761b).a(1, 1, 0, blockedUserListActivity.getString(R.string.text_unblock));
                wVar2.f25764e = new androidx.fragment.app.g(25, blockedUserListActivity, user);
                wVar2.k();
                return Unit.f23355a;
            case 21:
                ((Number) obj).intValue();
                SubscriptionPackages selectedSubscriptionPackages = (SubscriptionPackages) obj2;
                Intrinsics.checkNotNullParameter(selectedSubscriptionPackages, "selectedSubscriptionPackages");
                OtherSubscriptionPlansFragment otherSubscriptionPlansFragment = (OtherSubscriptionPlansFragment) obj3;
                int i15 = OtherSubscriptionPlansFragment.f10518k;
                if (otherSubscriptionPlansFragment.I().f15490a.getLevel() == 0) {
                    ((ManageSubscriptionViewModel) otherSubscriptionPlansFragment.f10522j.getValue()).f10498q = true;
                    otherSubscriptionPlansFragment.y(new AnalyticEvent("app_sub_subscription_initiated", p0.f(new Pair("target_plan", selectedSubscriptionPackages.getTitle()), new Pair("target_plan_price", selectedSubscriptionPackages.getDiscountPrice()))));
                } else if (selectedSubscriptionPackages.getFlowType() == 1) {
                    otherSubscriptionPlansFragment.y(new AnalyticEvent("app_sub_upgrade_initiated", p0.f(new Pair("target_plan", selectedSubscriptionPackages.getTitle()), new Pair("target_plan_price", selectedSubscriptionPackages.getDiscountPrice()), new Pair("validity_left", kotlin.text.w.P(otherSubscriptionPlansFragment.I().f15490a.getValidityTitle(), new String[]{" "}, 0, 6).get(0)))));
                }
                OtherSubscriptionPlansViewModel otherSubscriptionPlansViewModel = (OtherSubscriptionPlansViewModel) otherSubscriptionPlansFragment.r();
                Intrinsics.checkNotNullParameter(selectedSubscriptionPackages, "selectedSubscriptionPackages");
                int flowType = selectedSubscriptionPackages.getFlowType();
                if (vt.v.o(new Integer[]{0, 1}, Integer.valueOf(flowType))) {
                    yk.g.H(u0.f(otherSubscriptionPlansViewModel), null, null, new ej.n(otherSubscriptionPlansViewModel, selectedSubscriptionPackages, null), 3);
                } else if (flowType == 2) {
                    otherSubscriptionPlansViewModel.f10526q.setValue(new kj.j(selectedSubscriptionPackages));
                }
                return Unit.f23355a;
            case 22:
                n0.Q(new yk.h(i11, (Integer) obj2, (List) obj3));
                return Unit.f23355a;
            case 23:
                d((Throwable) obj, (Response) obj2);
                return Unit.f23355a;
            default:
                d((Throwable) obj, (Response) obj2);
                return Unit.f23355a;
        }
    }
}
