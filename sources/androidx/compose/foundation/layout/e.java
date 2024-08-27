package androidx.compose.foundation.layout;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.g;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import b0.l1;
import b0.s;
import c0.m0;
import c2.p0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.GroupInfoInviteItem;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.request.FeedPostReactionDto;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamComposeFragment;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import com.google.gson.Gson;
import d2.w0;
import d2.y0;
import e1.v;
import e1.z;
import g7.b1;
import g7.t0;
import g7.x0;
import hb.u;
import i0.a2;
import iu.k;
import ja.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.o;
import l0.n0;
import m.w;
import m0.i0;
import m0.l5;
import m0.o0;
import m0.v4;
import m0.w4;
import qu.f0;
import qu.h;
import qu.r0;
import sb.a0;
import sb.l0;
import t0.d0;
import t0.f;
import t0.f2;
import t0.g1;
import t0.m;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import t0.z1;
import tu.s0;
import ut.l;
import vt.g0;
import vt.x;
import vt.y;
import w.x1;

/* loaded from: classes.dex */
public final class e extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i10) {
        super(2);
        this.f1291a = i10;
        this.f1292b = obj;
    }

    public final void a(GroupMember member, View view) {
        GroupMemberListViewModel groupMemberListViewModel;
        String str;
        int i10 = this.f1291a;
        Object obj = this.f1292b;
        switch (i10) {
            case 21:
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "view");
                DeactivatedMembersListActivity deactivatedMembersListActivity = (DeactivatedMembersListActivity) obj;
                sb.b bVar = DeactivatedMembersListActivity.f9104l;
                deactivatedMembersListActivity.getClass();
                w wVar = new w(deactivatedMembersListActivity, view);
                new j((Context) wVar.f25760a).inflate(R.menu.menu_member_options_for_deactivated_users, (o) wVar.f25761b);
                wVar.f25764e = new g(16, deactivatedMembersListActivity, member);
                wVar.k();
                return;
            default:
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
                GroupMemberListActivity groupMemberListActivity = (GroupMemberListActivity) obj;
                int i11 = GroupMemberListActivity.f9283m;
                String userId = ((GroupMemberListViewModel) groupMemberListActivity.x()).f9286n.getUserId();
                if (userId == null || (!Intrinsics.a(userId, member.getUserId()) && (str = (groupMemberListViewModel = (GroupMemberListViewModel) groupMemberListActivity.x()).D) != null && str.length() != 0 && groupMemberListViewModel.f9298z.contains(groupMemberListViewModel.D))) {
                    ((GroupMemberListViewModel) groupMemberListActivity.x()).f9290r.postValue(member);
                    ((GroupMemberListViewModel) groupMemberListActivity.x()).A.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Set set) {
        Set I;
        h hVar = null;
        switch (this.f1291a) {
            case 4:
                f2 f2Var = (f2) this.f1292b;
                synchronized (f2Var.f34999b) {
                    try {
                        if (((z1) f2Var.f35015r.getValue()).compareTo(z1.f35282e) >= 0) {
                            if (set instanceof v0.c) {
                                v0.c cVar = (v0.c) set;
                                Object[] objArr = cVar.f37645b;
                                int i10 = cVar.f37644a;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    Object obj = objArr[i11];
                                    Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(obj instanceof z) || ((z) obj).d(1)) {
                                        f2Var.f35004g.add(obj);
                                    }
                                }
                            } else {
                                for (Object obj2 : set) {
                                    if (!(obj2 instanceof z) || ((z) obj2).d(1)) {
                                        f2Var.f35004g.add(obj2);
                                    }
                                }
                            }
                            hVar = f2Var.v();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (hVar != null) {
                    l.Companion companion = l.INSTANCE;
                    hVar.resumeWith(Unit.f23355a);
                    return;
                }
                return;
            case 5:
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (Object obj3 : set2) {
                        if (!(obj3 instanceof z) || ((z) obj3).d(4)) {
                            ((su.g) this.f1292b).o(set);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                v vVar = (v) this.f1292b;
                while (true) {
                    AtomicReference atomicReference = vVar.f14933b;
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        I = set;
                    } else if (obj4 instanceof Set) {
                        I = y.g(obj4, set);
                    } else if (obj4 instanceof List) {
                        I = g0.I(x.a(set), (Collection) obj4);
                    } else {
                        t.G("Unexpected notification");
                        throw null;
                    }
                    while (!atomicReference.compareAndSet(obj4, I)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (v.a(vVar)) {
                        vVar.f14932a.invoke(new x.a(vVar, 21));
                        return;
                    }
                    return;
                }
        }
    }

    public final void e(n nVar, int i10) {
        ArenaGame arenaGame;
        boolean z10;
        e0 e0Var;
        boolean z11;
        g1.e eVar = g1.a.f16391m;
        Object obj = m.f35080a;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f1291a;
        int i12 = 16;
        int i13 = 6;
        Object obj2 = this.f1292b;
        int i14 = 2;
        switch (i11) {
            case 8:
                if ((i10 & 3) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                ((d2.a) obj2).a(nVar, 0);
                return;
            case 9:
            case 17:
            case 21:
            case 23:
            case 26:
            default:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                r rVar3 = (r) nVar;
                y8.h hVar = new y8.h((Context) rVar3.m(AndroidCompositionLocals_androidKt.f1428b));
                hVar.f41338c = ((GroupInfoInviteItem) obj2).getDisplayPicture();
                hVar.b();
                float f10 = 40;
                q6.l.c(hVar.a(), "User photo", androidx.compose.ui.draw.a.b(d.g(d.q(lVar, f10), f10), h0.h.f17801a), w0.u(R.drawable.ic_placeholder_user, rVar3, 6), null, null, null, rVar3, 4152, 0, 65520);
                return;
            case 10:
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                el.l.d(null, new p0((i) obj2, i12), nVar, 0, 1);
                return;
            case 11:
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                ka.i iVar = (ka.i) obj2;
                yk.j.S((ModifyOrderPageBottomSheetViewModel) iVar.t(), new ka.h(iVar), nVar, 8, 0);
                return;
            case 12:
                if ((i10 & 11) == 2) {
                    r rVar6 = (r) nVar;
                    if (rVar6.G()) {
                        rVar6.V();
                        return;
                    }
                }
                el.l.d(null, new p0((sa.l) obj2, 17), nVar, 0, 1);
                return;
            case 13:
                if ((i10 & 11) == 2) {
                    r rVar7 = (r) nVar;
                    if (rVar7.G()) {
                        rVar7.V();
                        return;
                    }
                }
                el.l.d(null, new p0((ta.h) obj2, 18), nVar, 0, 1);
                return;
            case 14:
                if ((i10 & 11) == 2) {
                    r rVar8 = (r) nVar;
                    if (rVar8.G()) {
                        rVar8.V();
                        return;
                    }
                }
                el.l.d(null, new p0((RiaProfileActivity) obj2, 28), nVar, 0, 1);
                return;
            case 15:
                if ((i10 & 11) == 2) {
                    r rVar9 = (r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                yk.o.w((SocialHomeFeedV2ViewModel) ((nb.a) obj2).r(), nVar, 8);
                return;
            case 16:
                if ((i10 & 11) == 2) {
                    r rVar10 = (r) nVar;
                    if (rVar10.G()) {
                        rVar10.V();
                        return;
                    }
                }
                FeedStreamComposeFragment feedStreamComposeFragment = (FeedStreamComposeFragment) obj2;
                FeedStreamViewModel feedStreamViewModel = (FeedStreamViewModel) feedStreamComposeFragment.r();
                CommentsViewModel commentsViewModel = feedStreamComposeFragment.f8831h;
                if (commentsViewModel != null) {
                    yk.j.C(feedStreamViewModel, commentsViewModel, nVar, 72);
                    return;
                } else {
                    Intrinsics.k("commentViewModel");
                    throw null;
                }
            case 18:
                if ((i10 & 11) == 2) {
                    r rVar11 = (r) nVar;
                    if (rVar11.G()) {
                        rVar11.V();
                        return;
                    }
                }
                xb.g gVar = (xb.g) obj2;
                r rVar12 = (r) nVar;
                rVar12.b0(-483455358);
                l1 a10 = b0.y.a(b0.n.f2937c, eVar, rVar12, 0);
                rVar12.b0(-1323940314);
                int i15 = rVar12.P;
                r1 o10 = rVar12.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar12.f35166a instanceof f) {
                    rVar12.e0();
                    if (rVar12.O) {
                        rVar12.n(jVar);
                    } else {
                        rVar12.n0();
                    }
                    t.v0(rVar12, a10, c2.k.f7749e);
                    t.v0(rVar12, o10, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar12.O || !Intrinsics.a(rVar12.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar12, i15, iVar2);
                    }
                    v.e.w(rVar12, j10, rVar12, 0, 2058660585);
                    a.c(d.m(lVar, kp.j.R(28, rVar12)), rVar12);
                    yk.o.g(rVar12, 0);
                    a.c(d.m(lVar, kp.j.R(12, rVar12)), rVar12);
                    kp.j.i(gVar, rVar12, 0);
                    kp.j.h(rVar12, 0);
                    rVar12.s(false);
                    rVar12.s(true);
                    rVar12.s(false);
                    rVar12.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 19:
                if ((i10 & 11) == 2) {
                    r rVar13 = (r) nVar;
                    if (rVar13.G()) {
                        rVar13.V();
                        return;
                    }
                }
                xc.b bVar = (xc.b) obj2;
                LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) bVar.f40172i.getValue();
                if (leagueDetailPreJoiningViewModel != null && (e0Var = leagueDetailPreJoiningViewModel.f9050q) != null) {
                    arenaGame = (ArenaGame) e0Var.getValue();
                } else {
                    arenaGame = null;
                }
                if (arenaGame != null) {
                    LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel2 = (LeagueDetailPreJoiningViewModel) bVar.f40172i.getValue();
                    if (leagueDetailPreJoiningViewModel2 != null) {
                        z10 = ((Boolean) leagueDetailPreJoiningViewModel2.f9057x.getValue()).booleanValue();
                    } else {
                        z10 = true;
                    }
                    yk.j.Y(z10, arenaGame, new xc.a(bVar, 1), new xc.a(bVar, i14), nVar, 64, 0);
                    return;
                }
                return;
            case 20:
                if ((i10 & 11) == 2) {
                    r rVar14 = (r) nVar;
                    if (rVar14.G()) {
                        rVar14.V();
                        return;
                    }
                }
                r rVar15 = (r) nVar;
                Context context = (Context) rVar15.m(AndroidCompositionLocals_androidKt.f1428b);
                g1.o e10 = d.e(lVar, 1.0f);
                ad.g gVar2 = (ad.g) obj2;
                rVar15.b0(-483455358);
                l1 a11 = b0.y.a(b0.n.f2937c, eVar, rVar15, 0);
                rVar15.b0(-1323940314);
                int i16 = rVar15.P;
                r1 o11 = rVar15.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(e10);
                if (rVar15.f35166a instanceof f) {
                    rVar15.e0();
                    if (rVar15.O) {
                        rVar15.n(jVar2);
                    } else {
                        rVar15.n0();
                    }
                    t.v0(rVar15, a11, c2.k.f7749e);
                    t.v0(rVar15, o11, c2.k.f7748d);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar15.O || !Intrinsics.a(rVar15.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar15, i16, iVar3);
                    }
                    v.e.w(rVar15, j11, rVar15, 0, 2058660585);
                    q6.l.c(gVar2.f367b, null, androidx.compose.ui.draw.a.b(d.e(lVar, 1.0f), h0.h.b(10)), null, new ub.f(gVar2, i14), a2.k.f97b, null, rVar15, 48, 6, 64376);
                    a.c(d.g(lVar, 16), rVar15);
                    String string = gVar2.getString(R.string.share_your_winnings);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    al.d.A(null, false, string, new ad.f(0, gVar2, context), rVar15, 0, 3);
                    v.e.y(rVar15, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 22:
                if ((i10 & 11) == 2) {
                    r rVar16 = (r) nVar;
                    if (rVar16.G()) {
                        rVar16.V();
                        return;
                    }
                }
                r rVar17 = (r) nVar;
                Object g10 = v.e.g(rVar17, 773894976, -723523240);
                if (g10 == obj) {
                    g10 = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar17), rVar17);
                }
                rVar17.s(false);
                f0 f0Var = ((d0) g10).f34970a;
                Object h10 = v.e.h(rVar17, false, 1574867477);
                if (h10 == obj) {
                    w.e.a(s0.g.f34069a);
                    h10 = new x1(300, (w.d0) null, 6);
                    rVar17.k0(h10);
                }
                rVar17.s(false);
                w4 c10 = v4.c((x1) h10, pd.h.f30899k, rVar17, 438, 8);
                GroupCreateHostActivityCompose groupCreateHostActivityCompose = (GroupCreateHostActivityCompose) obj2;
                v4.a(b1.d.c(795422167, new i0(5, groupCreateHostActivityCompose, f0Var, c10), rVar17), null, c10, false, null, s0.g.f34069a, n1.t.f28176h, 0L, 0L, b1.d.c(556653520, new o0(8, groupCreateHostActivityCompose, f0Var, c10), rVar17), rVar17, 806879750, 442);
                return;
            case 24:
                if ((i10 & 11) == 2) {
                    r rVar18 = (r) nVar;
                    if (rVar18.G()) {
                        rVar18.V();
                        return;
                    }
                }
                kp.j.f(new ub.f((ud.a) obj2, 8), nVar, 0);
                return;
            case 25:
                if ((i10 & 11) == 2) {
                    r rVar19 = (r) nVar;
                    if (rVar19.G()) {
                        rVar19.V();
                        return;
                    }
                }
                GroupInvitedListActivity groupInvitedListActivity = (GroupInvitedListActivity) obj2;
                h7.b a12 = h7.g.a((tu.f) ((GroupInvitedListViewModel) groupInvitedListActivity.x()).f9276p.getValue(), nVar);
                g1 K0 = yk.j.K0(new s0(((GroupInvitedListViewModel) groupInvitedListActivity.x()).f9277q), nVar);
                p0.o D1 = dp.b.D1(((Boolean) K0.getValue()).booleanValue(), new lc.b(groupInvitedListActivity, 13), nVar, 0);
                m0 a13 = c0.p0.a(nVar);
                float f11 = 16;
                g1.o x10 = a.x(lVar, f11, f11, f11, s0.g.f34069a, 8);
                FillElement fillElement = d.f1286c;
                g1.o K02 = al.d.K0(x10.g(fillElement), D1);
                r rVar20 = (r) nVar;
                rVar20.b0(733328855);
                b0.v c11 = s.c(g1.a.f16379a, false, rVar20, 0);
                rVar20.b0(-1323940314);
                int i17 = rVar20.P;
                r1 o12 = rVar20.o();
                c2.l.M.getClass();
                c2.j jVar3 = c2.k.f7746b;
                b1.c j12 = androidx.compose.ui.layout.a.j(K02);
                boolean z12 = rVar20.f35166a instanceof f;
                if (z12) {
                    rVar20.e0();
                    if (rVar20.O) {
                        rVar20.n(jVar3);
                    } else {
                        rVar20.n0();
                    }
                    c2.i iVar4 = c2.k.f7749e;
                    t.v0(rVar20, c11, iVar4);
                    c2.i iVar5 = c2.k.f7748d;
                    t.v0(rVar20, o12, iVar5);
                    c2.i iVar6 = c2.k.f7750f;
                    if (rVar20.O || !Intrinsics.a(rVar20.Q(), Integer.valueOf(i17))) {
                        nn.d.s(i17, rVar20, i17, iVar6);
                    }
                    v.e.w(rVar20, j12, rVar20, 0, 2058660585);
                    if (Intrinsics.a(a12.c().f16682a, x0.f17118b)) {
                        rVar20.b0(-204859062);
                        b0.g gVar3 = b0.n.f2939e;
                        g1.e eVar2 = g1.a.f16392n;
                        rVar20.b0(-483455358);
                        l1 a14 = b0.y.a(gVar3, eVar2, rVar20, 54);
                        rVar20.b0(-1323940314);
                        int i18 = rVar20.P;
                        r1 o13 = rVar20.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(fillElement);
                        if (z12) {
                            rVar20.e0();
                            if (rVar20.O) {
                                rVar20.n(jVar3);
                            } else {
                                rVar20.n0();
                            }
                            t.v0(rVar20, a14, iVar4);
                            t.v0(rVar20, o13, iVar5);
                            if (rVar20.O || !Intrinsics.a(rVar20.Q(), Integer.valueOf(i18))) {
                                nn.d.s(i18, rVar20, i18, iVar6);
                            }
                            v.e.w(rVar20, j13, rVar20, 0, 2058660585);
                            l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar20, 0, 31);
                            v.e.y(rVar20, false, true, false, false);
                            rVar20.s(false);
                            z11 = false;
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        rVar20.b0(-204481451);
                        qu.i0.c(androidx.compose.animation.a.a(fillElement), a13, null, false, null, null, null, false, new y0(29, a12, groupInvitedListActivity), rVar20, 0, 252);
                        z11 = false;
                        rVar20.s(false);
                    }
                    p0.h.a(((Boolean) K0.getValue()).booleanValue(), D1, new BoxChildDataElement(g1.a.f16380b, z11), 0L, 0L, false, rVar20, 64, 56);
                    v.e.y(rVar20, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 27:
                if ((i10 & 11) == 2) {
                    r rVar21 = (r) nVar;
                    if (rVar21.G()) {
                        rVar21.V();
                        return;
                    }
                }
                r rVar22 = (r) nVar;
                Object g11 = v.e.g(rVar22, 773894976, -723523240);
                if (g11 == obj) {
                    g11 = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar22), rVar22);
                }
                rVar22.s(false);
                f0 f0Var2 = ((d0) g11).f34970a;
                rVar22.s(false);
                w4 c12 = v4.c(null, wd.d.f39017b, rVar22, 390, 10);
                AddMembersHostComposeActivity addMembersHostComposeActivity = (AddMembersHostComposeActivity) obj2;
                v4.a(b1.d.c(859702097, new i0(i13, addMembersHostComposeActivity, f0Var2, c12), rVar22), null, c12, false, null, s0.g.f34069a, n1.t.f28176h, 0L, 0L, b1.d.c(-1098104200, new o0(9, addMembersHostComposeActivity, f0Var2, c12), rVar22), rVar22, 806879750, 442);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool;
        ArrayList arrayList;
        int i10 = this.f1291a;
        Object obj3 = this.f1292b;
        boolean z10 = true;
        ArrayList arrayList2 = null;
        switch (i10) {
            case 0:
                return new w2.h(((g1.g) ((g1.d) obj3)).a(0L, ((w2.j) obj).f38798a, (w2.k) obj2));
            case 1:
                ((Number) obj2).longValue();
                a3.a.u(obj3);
                t0.p0 p0Var = n0.f23794a;
                return null;
            case 2:
                ((a2) obj3).e(((m1.c) obj2).f27237a);
                return Unit.f23355a;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((p0.o) obj3).f30484e.j(floatValue);
                return Unit.f23355a;
            case 4:
                d((Set) obj);
                return Unit.f23355a;
            case 5:
                d((Set) obj);
                return Unit.f23355a;
            case 6:
                d((Set) obj);
                return Unit.f23355a;
            case 7:
                g1.o oVar = (g1.o) obj;
                g1.o oVar2 = (g1.m) obj2;
                if (oVar2 instanceof g1.j) {
                    hu.c cVar = ((g1.j) oVar2).f16402c;
                    Intrinsics.d(cVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    zq.f.z(3, cVar);
                    n nVar = (n) obj3;
                    oVar2 = t.h0(nVar, (g1.o) cVar.b(g1.l.f16404b, nVar, 0));
                }
                return oVar.g(oVar2);
            case 8:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                t0 prependHint = (t0) obj;
                t0 appendHint = (t0) obj2;
                Intrinsics.checkNotNullParameter(prependHint, "prependHint");
                Intrinsics.checkNotNullParameter(appendHint, "appendHint");
                g7.w4 w4Var = (g7.w4) obj3;
                if (yk.g.a0(w4Var, prependHint.f17060a, b1.f16664b)) {
                    prependHint.f17060a = w4Var;
                    prependHint.f17061b.f(w4Var);
                }
                if (yk.g.a0(w4Var, appendHint.f17060a, b1.f16665c)) {
                    appendHint.f17060a = w4Var;
                    appendHint.f17061b.f(w4Var);
                }
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
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 16:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 17:
                u feedStreamElement = (u) obj;
                hb.y postInteraction = (hb.y) obj2;
                Intrinsics.checkNotNullParameter(feedStreamElement, "feedElement");
                Intrinsics.checkNotNullParameter(postInteraction, "postInteraction");
                FeedStreamViewModel feedStreamViewModel = (FeedStreamViewModel) obj3;
                feedStreamViewModel.getClass();
                Intrinsics.checkNotNullParameter(feedStreamElement, "feedStreamElement");
                Intrinsics.checkNotNullParameter(postInteraction, "postInteraction");
                int ordinal = postInteraction.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                        feedStreamViewModel.g();
                                    } else {
                                        feedStreamElement.f18230a.f18229f.f18210a.getClass();
                                        hb.s sVar = feedStreamElement.f18230a;
                                        feedStreamViewModel.m(sVar.f18224a);
                                        pe.a[] aVarArr = pe.a.f31008a;
                                        yk.g.H(u0.f(feedStreamViewModel), null, null, new sb.m0(feedStreamViewModel, new FeedPostReactionDto(sVar.f18224a, "Like", sVar.f18229f.f18210a.f18208a), feedStreamElement, null), 3);
                                    }
                                }
                            } else if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                feedStreamViewModel.g();
                            } else {
                                hb.s sVar2 = feedStreamElement.f18230a;
                                String str = sVar2.f18224a;
                                boolean z11 = sVar2.f18229f.f18213d.f18205a;
                                feedStreamViewModel.l(str);
                                yk.g.H(u0.f(feedStreamViewModel), null, null, new sb.n0(feedStreamViewModel, str, z11, null), 3);
                            }
                        } else {
                            hb.s sVar3 = feedStreamElement.f18230a;
                            int length = sVar3.f18227d.f18218e.length();
                            hb.r rVar = sVar3.f18227d;
                            if (length != 0) {
                                String str2 = rVar.f18218e;
                                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                    feedStreamViewModel.g();
                                } else {
                                    yk.g.H(u0.f(feedStreamViewModel), r0.f32256b, null, new sb.o0(feedStreamViewModel, str2, null), 2);
                                }
                            }
                            if (rVar.f18219f.length() != 0) {
                                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                    feedStreamViewModel.g();
                                } else {
                                    yk.g.H(u0.f(feedStreamViewModel), null, null, new sb.e0(feedStreamViewModel, rVar.f18219f, null), 3);
                                }
                            }
                        }
                    } else if (feedStreamElement.f18230a.f18227d.f18218e.length() > 0) {
                        hb.s sVar4 = feedStreamElement.f18230a;
                        hb.r rVar2 = sVar4.f18227d;
                        feedStreamViewModel.k(new a0(rVar2.f18219f, rVar2.f18221h, ((sb.d) feedStreamViewModel.f8837r.getValue()).f34446d, sVar4.f18227d.f18216c));
                    }
                } else {
                    String str3 = feedStreamElement.f18230a.f18224a;
                    if (!WifiService.INSTANCE.getInstance().isOnline()) {
                        feedStreamViewModel.g();
                    } else {
                        yk.g.H(u0.f(feedStreamViewModel), null, null, new l0(feedStreamViewModel, str3, null), 3);
                    }
                }
                return Unit.f23355a;
            case 18:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 21:
                a((GroupMember) obj, (View) obj2);
                return Unit.f23355a;
            case 22:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 23:
                Map payload = (Map) obj;
                String event = (String) obj2;
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (event.hashCode()) {
                    case -203764388:
                        if (event.equals("del_msg_out")) {
                            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) obj3;
                            groupChatViewModel.O.postValue(GroupChatViewModel.h(groupChatViewModel, payload));
                            break;
                        }
                        break;
                    case -77733200:
                        if (event.equals("recent_messages")) {
                            GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) obj3;
                            groupChatViewModel2.getClass();
                            Object obj4 = payload.get("end_of_response");
                            if (obj4 instanceof Boolean) {
                                bool = (Boolean) obj4;
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                z10 = bool.booleanValue();
                            }
                            synchronized (groupChatViewModel2) {
                                groupChatViewModel2.L0 = z10;
                            }
                            Object obj5 = payload.get("messages");
                            if (obj5 instanceof ArrayList) {
                                arrayList = (ArrayList) obj5;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                Object obj6 = payload.get("messages");
                                if (obj6 instanceof ArrayList) {
                                    arrayList2 = (ArrayList) obj6;
                                }
                                Gson gson = new Gson();
                                Object fromJson = gson.fromJson(gson.toJsonTree(arrayList2), (Class<Object>) ChatMessage[].class);
                                Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                                ArrayList A = vt.v.A((Object[]) fromJson);
                                ChatMessage chatMessage = (ChatMessage) A.get(0);
                                if (chatMessage.getUpdatedAt() > groupChatViewModel2.f9200z0) {
                                    groupChatViewModel2.f9200z0 = chatMessage.getUpdatedAt();
                                    String groupId = chatMessage.getGroupId();
                                    if (groupId != null) {
                                        groupChatViewModel2.y(groupId, Long.valueOf(chatMessage.getUpdatedAt()), chatMessage.getMessageId());
                                    }
                                    groupChatViewModel2.G.postValue(A);
                                }
                                HashSet hashSet = groupChatViewModel2.f9186s0;
                                ArrayList arrayList3 = new ArrayList(vt.z.k(A));
                                Iterator it = A.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((ChatMessage) it.next()).getMessageId());
                                }
                                hashSet.addAll(arrayList3);
                                break;
                            }
                        }
                        break;
                    case 599428593:
                        if (event.equals("new_msg_out")) {
                            GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) obj3;
                            ChatMessage h10 = GroupChatViewModel.h(groupChatViewModel3, payload);
                            HashSet hashSet2 = groupChatViewModel3.f9186s0;
                            if (!hashSet2.contains(h10.getMessageId())) {
                                if (groupChatViewModel3.f9176n.getUserId() != null) {
                                    String parentMessageId = h10.getParentMessageId();
                                    if (parentMessageId != null && parentMessageId.length() != 0) {
                                        if (hashSet2.contains(h10.getParentMessageId())) {
                                            groupChatViewModel3.I.postValue(h10);
                                        } else {
                                            groupChatViewModel3.l();
                                        }
                                    } else {
                                        groupChatViewModel3.H.postValue(h10);
                                        hashSet2.add(h10.getMessageId());
                                    }
                                }
                                String groupId2 = h10.getGroupId();
                                if (groupId2 != null) {
                                    groupChatViewModel3.y(groupId2, h10.getServerTime(), h10.getMessageId());
                                    break;
                                }
                            }
                        }
                        break;
                    case 1882867803:
                        if (event.equals("edit_msg_out")) {
                            GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) obj3;
                            groupChatViewModel4.K.postValue(GroupChatViewModel.h(groupChatViewModel4, payload));
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 24:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 25:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 26:
                a((GroupMember) obj, (View) obj2);
                return Unit.f23355a;
            case 27:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 28:
                e((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                String userId = (String) obj;
                String username = (String) obj2;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(username, "username");
                int i11 = MessageThreadInfoActivity.f9316m;
                ((MessageThreadInfoActivity) obj3).L(userId, username);
                return Unit.f23355a;
        }
    }
}
