package ub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.m;
import ba.cm;
import ba.em;
import ba.j6;
import ba.nc;
import ba.sh;
import ba.xc;
import ba.y7;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnerViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditFragment;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupFeedAndChatHostFragment;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.drawer.tutorials.VideoTutorialFragment;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationPendingFragment;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.google.android.gms.common.Scopes;
import fg.g;
import hk.w;
import iu.k;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import q6.l;
import rd.d0;
import rd.q;
import rd.r;
import rd.u;
import tg.j;
import vd.v;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i10) {
        super(1);
        this.f37057a = i10;
        this.f37058b = obj;
    }

    public final void a(BottomSheetItem bottomSheetItem) {
        int i10 = 0;
        int i11 = this.f37057a;
        int i12 = 8;
        Object obj = this.f37058b;
        switch (i11) {
            case 4:
                hd.c cVar = (hd.c) obj;
                ((y7) cVar.f17291u).f6712t.setText(bottomSheetItem.getDisplayName());
                ImageView imageView = ((y7) cVar.f17291u).f6711s;
                if (!bottomSheetItem.getIsSelected()) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
            default:
                Intrinsics.checkNotNullParameter(bottomSheetItem, "sortOption");
                hd.d dVar = (hd.d) obj;
                int i13 = hd.d.f18292k;
                PortfolioOrdersViewModel portfolioOrdersViewModel = (PortfolioOrdersViewModel) dVar.f18294j.getValue();
                String str = ((PortfolioOrdersViewModel) dVar.f18294j.getValue()).f9920s;
                portfolioOrdersViewModel.getClass();
                Intrinsics.checkNotNullParameter(bottomSheetItem, "bottomSheetItem");
                m<BaseResponseDto<PortfolioOrdersDto>> portfolioOrders = portfolioOrdersViewModel.f9915n.getPortfolioOrders(str, bottomSheetItem.getOptionName());
                g gVar = new g(22, tg.c.f36042s);
                portfolioOrders.getClass();
                h c10 = new nt.b(new nt.b(new nt.b(new nt.f(portfolioOrders, gVar, 1), new g(23, new j(portfolioOrdersViewModel, 4)), 1), new g(24, new j(portfolioOrdersViewModel, 5)), 2), new g(25, new j(portfolioOrdersViewModel, 6)), 0).c(((kq.e) portfolioOrdersViewModel.f9079b).J());
                jt.d dVar2 = new jt.d(new g(26, new j(portfolioOrdersViewModel, 7)), new g(27, new j(portfolioOrdersViewModel, i12)));
                c10.a(dVar2);
                Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
                portfolioOrdersViewModel.f9080c.c(dVar2);
                portfolioOrdersViewModel.f9923v = bottomSheetItem;
                dVar.dismiss();
                return;
        }
    }

    public final void d(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 6:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    GroupDescriptionEditFragment groupDescriptionEditFragment = (GroupDescriptionEditFragment) obj;
                    ((GroupDescriptionEditViewModel) groupDescriptionEditFragment.r()).f9204o.postValue(Boolean.FALSE);
                    l.h(groupDescriptionEditFragment).p();
                    return;
                }
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = ((PaymentWithdrawalActivity) obj).f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = ((PaymentWithdrawalActivity) obj).f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void e(Integer num) {
        TextView textView;
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 21:
                sf.b bVar = (sf.b) obj;
                Intrinsics.c(num);
                bVar.f34608j = num.intValue();
                bVar.B(num.intValue());
                return;
            default:
                Intrinsics.c(num);
                int intValue = num.intValue();
                int i11 = gg.e.f17391j;
                View actionView = ((cm) ((gg.e) obj).q()).E.getMenu().findItem(R.id.menu_item_notifications).getActionView();
                if (actionView != null) {
                    textView = (TextView) actionView.findViewById(R.id.cart_badge_notification);
                } else {
                    textView = null;
                }
                if (textView != null) {
                    kj.f.u(textView, intValue);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str) {
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 3:
                ad.h hVar = (ad.h) obj;
                j6 j6Var = (j6) hVar.r();
                String string = hVar.getString(R.string.square_off_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                j6Var.f5109s.setText(a3.a.m(new Object[]{str}, 1, string, "format(...)"));
                return;
            case 15:
                if (str == null || str.length() == 0) {
                    TextView groupMemberDescription = ((nc) ((re.e) obj).f17291u).f5557u;
                    Intrinsics.checkNotNullExpressionValue(groupMemberDescription, "groupMemberDescription");
                    zq.f.M(groupMemberDescription);
                    return;
                }
                return;
            default:
                nk.a t10 = new nk.a().t(new xj.h(new Object(), new w(16)), true);
                Intrinsics.checkNotNullExpressionValue(t10, "transforms(...)");
                ImageView imageView = ((xc) ((kf.b) obj).f17291u).f6649s;
                com.bumptech.glide.b.f(imageView).m(str).w(t10).z(imageView);
                return;
        }
    }

    public final void i(List list) {
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 17:
                df.a aVar = ((VideoTutorialFragment) obj).f9516g;
                if (aVar != null) {
                    aVar.u(list);
                    return;
                } else {
                    Intrinsics.k("tutorialAdapter");
                    throw null;
                }
            default:
                lg.g gVar = (lg.g) obj;
                em emVar = (em) gVar.q();
                be.b bVar = new be.b(gVar, 9);
                Object obj2 = b1.d.f3079a;
                emVar.f4627s.setContent(new b1.c(bVar, true, -510428839));
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 1:
                ((LeagueWinnerViewModel) obj).f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 7:
                ((GroupDescriptionEditViewModel) obj).f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 14:
                ((SocialAdvancedSearchViewModel) obj).f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            default:
                ((TopPortfolioListViewModel) obj).f9084g.postValue(Boolean.FALSE);
                return;
        }
    }

    public final void j(kj.j jVar) {
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 13:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    GroupFeedAndChatHostFragment groupFeedAndChatHostFragment = (GroupFeedAndChatHostFragment) obj;
                    boolean booleanValue = bool.booleanValue();
                    Bundle arguments = groupFeedAndChatHostFragment.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("IS_FEED_MAINTENANCE_ON", booleanValue);
                    }
                    sh shVar = (sh) groupFeedAndChatHostFragment.q();
                    ie.l lVar = groupFeedAndChatHostFragment.f9391i;
                    if (lVar != null) {
                        shVar.f6087t.setAdapter(lVar);
                        ie.l lVar2 = groupFeedAndChatHostFragment.f9391i;
                        if (lVar2 != null) {
                            lVar2.f19929n = booleanValue;
                            lVar2.e(0);
                            return;
                        } else {
                            Intrinsics.k("groupChatTabAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("groupChatTabAdapter");
                    throw null;
                }
                return;
            case 20:
                if (((Unit) jVar.a()) != null) {
                    MaintenanceWindowActivity maintenanceWindowActivity = (MaintenanceWindowActivity) obj;
                    maintenanceWindowActivity.startActivity(new Intent(maintenanceWindowActivity, (Class<?>) SplashActivity.class));
                    maintenanceWindowActivity.finish();
                    return;
                }
                return;
            default:
                Boolean bool2 = (Boolean) jVar.a();
                if (bool2 != null) {
                    OptionsListHostActivity optionsListHostActivity = (OptionsListHostActivity) obj;
                    if (bool2.booleanValue()) {
                        int i11 = OptionsListHostActivity.f9631l;
                        optionsListHostActivity.getClass();
                        Intent intent = new Intent(optionsListHostActivity, (Class<?>) MaintenanceWindowActivity.class);
                        intent.putExtra("DATA", qf.b.f31940o);
                        intent.putExtra("SHOW_TOOLBAR", true);
                        intent.putExtra("TOOLBAR_TITLE", optionsListHostActivity.getString(R.string.add_options));
                        optionsListHostActivity.startActivity(intent);
                        optionsListHostActivity.finish();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void k(Pair pair) {
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 24:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("plain/text");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@stockgro.com"});
                intent.putExtra("android.intent.extra.SUBJECT", "Regarding pending KYC application for " + pair.f23354b);
                intent.putExtra("android.intent.extra.TEXT", "Hi StockGro Team, \n\n This mail is regarding pending KYC application \n\n\n\n Thanks\n " + pair.f23353a + "\n" + pair.f23354b);
                ((KycVerificationPendingFragment) obj).startActivity(Intent.createChooser(intent, "Send mail..."));
                return;
            default:
                ((WithdrawalDetailViewModel) obj).B.postValue(pair);
                return;
        }
    }

    public final void l(xd.a chatBottomSheetItem) {
        GroupMember groupMember;
        String userId;
        GroupMember groupMember2;
        String userId2;
        GroupMember groupMember3;
        String userId3;
        sj.d dVar;
        sj.d dVar2;
        GroupMember groupMember4;
        String userId4;
        sj.d dVar3;
        GroupMember groupMember5;
        String userId5;
        ChatMessage chatMessage;
        int i10 = this.f37057a;
        Object obj = this.f37058b;
        switch (i10) {
            case 9:
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "option");
                v vVar = (v) obj;
                int i11 = v.f38018k;
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) vVar.f38020j.getValue();
                groupChatViewModel.getClass();
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "chatBottomSheetItem");
                String str = chatBottomSheetItem.f40174b;
                int hashCode = str.hashCode();
                e0 e0Var = groupChatViewModel.f9084g;
                e0 e0Var2 = groupChatViewModel.R;
                e0 e0Var3 = groupChatViewModel.N;
                switch (hashCode) {
                    case -1996763020:
                        if (str.equals("deactivate") && (groupMember = (GroupMember) e0Var3.getValue()) != null && (userId = groupMember.getUserId()) != null) {
                            e0Var.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(groupChatViewModel), null, null, new u(groupChatViewModel, userId, "Rogue", null), 3);
                            break;
                        }
                        break;
                    case -1655974669:
                        if (str.equals("activate") && (groupMember2 = (GroupMember) e0Var3.getValue()) != null && (userId2 = groupMember2.getUserId()) != null) {
                            e0Var.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(groupChatViewModel), null, null, new u(groupChatViewModel, userId2, "User", null), 3);
                            break;
                        }
                        break;
                    case -934610812:
                        if (str.equals("remove") && (groupMember3 = (GroupMember) e0Var3.getValue()) != null && (userId3 = groupMember3.getUserId()) != null) {
                            e0Var.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(groupChatViewModel), null, null, new d0(groupChatViewModel, userId3, null), 3);
                            break;
                        }
                        break;
                    case -934521548:
                        if (str.equals("report") && (dVar = (sj.d) e0Var2.getValue()) != null && dVar.f34663c != null) {
                            groupChatViewModel.f9167e0.postValue(Boolean.TRUE);
                            break;
                        }
                        break;
                    case -309425751:
                        if (str.equals(Scopes.PROFILE) && (dVar2 = (sj.d) e0Var2.getValue()) != null) {
                            groupChatViewModel.S.postValue(dVar2);
                            break;
                        }
                        break;
                    case 97295:
                        if (str.equals("ban") && (groupMember4 = (GroupMember) e0Var3.getValue()) != null && (userId4 = groupMember4.getUserId()) != null) {
                            groupChatViewModel.i(userId4, "Rogue");
                            break;
                        }
                        break;
                    case 3052376:
                        if (str.equals("chat") && (dVar3 = (sj.d) e0Var2.getValue()) != null) {
                            String d10 = a3.a.d("toString(...)");
                            e0Var.postValue(Boolean.TRUE);
                            ChatRepository chatRepository = groupChatViewModel.f9176n;
                            h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, dVar3.f34663c, chatRepository.getUserId())).c(((kq.e) groupChatViewModel.f9079b).J());
                            jt.d dVar4 = new jt.d(new q(16, new r(groupChatViewModel, 1)), new q(17, new r(groupChatViewModel, 2)));
                            c10.a(dVar4);
                            groupChatViewModel.f9080c.c(dVar4);
                            break;
                        }
                        break;
                    case 111426262:
                        if (str.equals("unban") && (groupMember5 = (GroupMember) e0Var3.getValue()) != null && (userId5 = groupMember5.getUserId()) != null) {
                            groupChatViewModel.i(userId5, "User");
                            break;
                        }
                        break;
                }
                vVar.dismiss();
                return;
            case 10:
                xd.c cVar = (xd.c) obj;
                ((y7) cVar.f17291u).f6712t.setText(chatBottomSheetItem.f40173a);
                ((y7) cVar.f17291u).f6711s.setVisibility(8);
                return;
            default:
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "option");
                ae.b bVar = (ae.b) obj;
                int i12 = ae.b.f373k;
                GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) bVar.f375j.getValue();
                groupChatViewModel2.getClass();
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "chatBottomSheetItem");
                if (Intrinsics.a(chatBottomSheetItem.f40174b, "delete") && (chatMessage = (ChatMessage) groupChatViewModel2.G0.getValue()) != null) {
                    groupChatViewModel2.k(chatMessage);
                }
                bVar.dismiss();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1 A[LOOP:7: B:57:0x01cb->B:59:0x01d1, LOOP_END] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.f.invoke(java.lang.Object):java.lang.Object");
    }
}
