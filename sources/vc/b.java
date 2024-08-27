package vc;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.j1;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import ba.b3;
import ba.h3;
import ba.m1;
import ba.p3;
import ba.yn;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupFeedAndChatHostFragment;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostActivity;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.assetgro.stockgro.ui.splash.SplashViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchActivity;
import gg.h;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r7.j;
import td.i;
import tg.o;
import yo.k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements j, k, et.c, j1, zn.d, et.b, DeepLinkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37934b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f37933a = i10;
        this.f37934b = obj;
    }

    @Override // et.b
    public final Object a(Object p02, Object p12) {
        Function2 tmp0 = (Function2) this.f37934b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Integer) tmp0.invoke(p02, p12);
    }

    @Override // et.c
    public final void b(Object obj) {
        int i10 = this.f37933a;
        Object obj2 = this.f37934b;
        switch (i10) {
            case 4:
                GroupChatViewModel this$0 = (GroupChatViewModel) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f9084g.postValue(Boolean.FALSE);
                return;
            case 5:
                GroupDescriptionEditViewModel this$02 = (GroupDescriptionEditViewModel) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.f9084g.postValue(Boolean.FALSE);
                this$02.f9204o.postValue(Boolean.TRUE);
                return;
            default:
                SocialAdvancedSearchViewModel this$03 = (SocialAdvancedSearchViewModel) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                e0 e0Var = this$03.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                this$03.f9084g.postValue(bool);
                this$03.f9432r.postValue(bool);
                return;
        }
    }

    @Override // no.i
    public final boolean c(MenuItem it) {
        MainActivity this$0 = (MainActivity) this.f37934b;
        de.d dVar = MainActivity.f9574r;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.getItemId()) {
            case R.id.arena_fragment /* 2131362007 */:
                if (Intrinsics.a(this$0.K().f9593x.getValue(), "ArenaAssetHostFragmentV2")) {
                    this$0.K().C.postValue(new kj.j(Unit.f23355a));
                    return true;
                }
                ((MainViewModel) this$0.x()).f9600q.postValue(new kj.j(Boolean.TRUE));
                this$0.K().f9593x.postValue("ArenaAssetHostFragmentV2");
                return true;
            case R.id.home_fragment /* 2131362881 */:
                if (Intrinsics.a(this$0.K().f9593x.getValue(), "HomeFragment")) {
                    this$0.K().A.postValue(new kj.j(Unit.f23355a));
                    return true;
                }
                ((MainViewModel) this$0.x()).f9599p.postValue(new kj.j(Boolean.TRUE));
                this$0.K().f9593x.postValue("HomeFragment");
                return true;
            case R.id.market_fragment /* 2131363298 */:
                ((MainViewModel) this$0.x()).f9601r.postValue(new kj.j(Boolean.TRUE));
                this$0.K().f9593x.postValue("MarketAssetHostFragment");
                return true;
            case R.id.portfolio_fragment /* 2131363840 */:
                ((MainViewModel) this$0.x()).f9603t.postValue(new kj.j(Boolean.TRUE));
                this$0.K().f9593x.postValue("PortfolioFragment");
                return true;
            case R.id.social_fragment /* 2131364246 */:
                if (Intrinsics.a(this$0.K().f9593x.getValue(), "SocialFragment")) {
                    this$0.K().B.postValue(new kj.j(Unit.f23355a));
                    return true;
                }
                ((MainViewModel) this$0.x()).f9602s.postValue(new kj.j(Boolean.TRUE));
                this$0.K().f9593x.postValue("SocialFragment");
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.fragment.app.j1
    public final void d(Bundle bundle, String str) {
        int i10;
        String userId;
        GroupInfoV2Fragment this$0 = (GroupInfoV2Fragment) this.f37934b;
        int i11 = GroupInfoV2Fragment.f9216r;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("bundleKey");
        if (Intrinsics.a(string, "SOCIAL_BOTTOM_SHEET_PRIMARY_ACTION")) {
            i iVar = this$0.f9222l;
            if (iVar == null) {
                i10 = -1;
            } else {
                i10 = td.j.f35894a[iVar.ordinal()];
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    this$0.M(true);
                    return;
                }
                return;
            } else {
                GroupMember groupMember = ((GroupInfoViewModel) this$0.r()).A;
                if (groupMember != null && (userId = groupMember.getUserId()) != null) {
                    ((GroupInfoViewModel) this$0.r()).j(userId, "Admin");
                    return;
                }
                return;
            }
        }
        Intrinsics.a(string, "SOCIAL_BOTTOM_SHEET_SECONDARY_ACTION");
    }

    @Override // r7.j
    public final void i() {
        int i10 = this.f37933a;
        Object obj = this.f37934b;
        switch (i10) {
            case 0:
                d this$0 = (d) obj;
                int i11 = d.f37937j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((CompletedLeaguePortfolioViewModel) this$0.r()).i();
                return;
            case 1:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 16:
            case 18:
            case 21:
            case 23:
            default:
                BlockedUserListActivity this$02 = (BlockedUserListActivity) obj;
                int i12 = BlockedUserListActivity.f10120l;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                BlockedUserListViewModel blockedUserListViewModel = (BlockedUserListViewModel) this$02.x();
                blockedUserListViewModel.f10128t = 0;
                blockedUserListViewModel.h();
                return;
            case 2:
                bd.d this$03 = (bd.d) obj;
                int i13 = bd.d.f6945m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) this$03.r();
                leaguePortfolioViewModel.f9084g.postValue(Boolean.TRUE);
                leaguePortfolioViewModel.h();
                return;
            case 3:
                DeactivatedMembersListActivity this$04 = (DeactivatedMembersListActivity) obj;
                sb.b bVar = DeactivatedMembersListActivity.f9104l;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                DeactivatedMembersListViewModel deactivatedMembersListViewModel = (DeactivatedMembersListViewModel) this$04.x();
                deactivatedMembersListViewModel.f9112t = 0;
                deactivatedMembersListViewModel.h();
                return;
            case 7:
                be.c this$05 = (be.c) obj;
                int i14 = be.c.f6956j;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ((SocialChatListViewModel) this$05.r()).l();
                return;
            case 9:
                BannedMembersListActivity this$06 = (BannedMembersListActivity) obj;
                int i15 = BannedMembersListActivity.f9417l;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                BannedMemberListViewModel bannedMemberListViewModel = (BannedMemberListViewModel) this$06.x();
                bannedMemberListViewModel.f9415v = 0;
                bannedMemberListViewModel.h();
                return;
            case 11:
                ChampionsChartActivity this$07 = (ChampionsChartActivity) obj;
                int i16 = ChampionsChartActivity.f9473l;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                ChampionsChartViewModel championsChartViewModel = (ChampionsChartViewModel) this$07.x();
                championsChartViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(championsChartViewModel), null, null, new we.b(championsChartViewModel, null), 3);
                return;
            case 12:
                StockGyanGroupsActivity this$08 = (StockGyanGroupsActivity) obj;
                int i17 = StockGyanGroupsActivity.f9499l;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                ((StockGyanGroupsViewModel) this$08.x()).h();
                return;
            case 14:
                NotificationsActivity this$09 = (NotificationsActivity) obj;
                int i18 = NotificationsActivity.f9619m;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                ((NotificationsViewModel) this$09.x()).h();
                return;
            case 15:
                WalletHomeActivity this$010 = (WalletHomeActivity) obj;
                int i19 = WalletHomeActivity.f9645m;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                ((WalletHomeViewModel) this$010.x()).j();
                return;
            case 17:
                gg.e this$011 = (gg.e) obj;
                int i20 = gg.e.f17391j;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                ((PortfolioViewModel) this$011.r()).i(h.f17405l);
                return;
            case 19:
                lg.k this$012 = (lg.k) obj;
                int i21 = lg.k.f24839h;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                ((PortfolioHistoryViewModel) this$012.r()).h(((PortfolioHistoryViewModel) this$012.r()).f9824t);
                return;
            case 20:
                o this$013 = (o) obj;
                int i22 = o.f36067i;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                ((PortfolioOrdersViewModel) this$013.r()).h(((PortfolioOrdersViewModel) this$013.r()).f9920s);
                return;
            case 22:
                EditProfileActivity this$014 = (EditProfileActivity) obj;
                int i23 = EditProfileActivity.f10028o;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                ((EditProfileViewModel) this$014.x()).i();
                return;
            case 24:
                ph.i this$015 = (ph.i) obj;
                int i24 = ph.i.f31105h;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                ((RedemptionHostViewModel) this$015.r()).i();
                return;
            case 25:
                rh.i this$016 = (rh.i) obj;
                int i25 = rh.i.f33755h;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                ((RedemptionHostViewModel) this$016.r()).j();
                return;
        }
    }

    @Override // yo.k
    public final void j(yo.g tab, int i10) {
        int i11 = this.f37933a;
        Object obj = this.f37934b;
        switch (i11) {
            case 1:
                LeagueDetailPostJoiningActivity this$0 = (LeagueDetailPostJoiningActivity) obj;
                int i12 = LeagueDetailPostJoiningActivity.f8982n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt = ((m1) this$0.w()).f5420w.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    linearLayout.setShowDividers(2);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(r3.k.getColor(this$0, R.color.tabSeparatorColor));
                    gradientDrawable.setSize(3, 1);
                    linearLayout.setDividerPadding(35);
                    linearLayout.setDividerDrawable(gradientDrawable);
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            tab.b(this$0.getString(R.string.chat_small_case));
                            return;
                        }
                        return;
                    }
                    tab.b(this$0.getString(R.string.ranks));
                    return;
                }
                tab.b(this$0.getString(R.string.portfolio));
                return;
            case 8:
                GroupFeedAndChatHostFragment this$02 = (GroupFeedAndChatHostFragment) obj;
                int i13 = GroupFeedAndChatHostFragment.f9388j;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (i10 != 0) {
                    if (i10 == 1) {
                        String string = this$02.getString(R.string.title_chat);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        tab.b(upperCase);
                        return;
                    }
                    return;
                }
                String string2 = this$02.getString(R.string.text_feed);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                tab.b(upperCase2);
                return;
            case 18:
                PortfolioDetailActivity this$03 = (PortfolioDetailActivity) obj;
                int i14 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt2 = ((b3) this$03.w()).f4250w.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                if (childAt2 instanceof LinearLayout) {
                    LinearLayout linearLayout2 = (LinearLayout) childAt2;
                    linearLayout2.setShowDividers(2);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(r3.k.getColor(this$03, R.color.tabSeparatorColor));
                    gradientDrawable2.setSize(3, 1);
                    linearLayout2.setDividerPadding(35);
                    linearLayout2.setDividerDrawable(gradientDrawable2);
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            tab.b(this$03.getString(R.string.history));
                            return;
                        }
                        return;
                    }
                    tab.b(this$03.getString(R.string.orders));
                    return;
                }
                tab.b(this$03.getString(R.string.holdings));
                return;
            case 21:
                FollowerFollowingActivity this$04 = (FollowerFollowingActivity) obj;
                int i15 = FollowerFollowingActivity.f9977n;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$04.getString(R.string.cta_following));
                        return;
                    }
                    return;
                }
                tab.b(this$04.getString(R.string.cta_followers));
                return;
            case 23:
                RedemptionHostActivity this$05 = (RedemptionHostActivity) obj;
                int i16 = RedemptionHostActivity.f10080k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt3 = ((h3) this$05.w()).f4887s.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt3, "getChildAt(...)");
                if (childAt3 instanceof LinearLayout) {
                    LinearLayout linearLayout3 = (LinearLayout) childAt3;
                    linearLayout3.setShowDividers(2);
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    gradientDrawable3.setColor(r3.k.getColor(this$05, R.color.whiteColorWithOpacity));
                    gradientDrawable3.setSize(3, 1);
                    linearLayout3.setDividerPadding(35);
                    linearLayout3.setDividerDrawable(gradientDrawable3);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$05.getString(R.string.text_redemption_redeemed));
                        return;
                    }
                    return;
                }
                tab.b(this$05.getString(R.string.text_redemption_offers));
                return;
            case 28:
                StockDetailFragment this$06 = (StockDetailFragment) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt4 = ((yn) this$06.q()).f6759x.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt4, "getChildAt(...)");
                if (childAt4 instanceof LinearLayout) {
                    LinearLayout linearLayout4 = (LinearLayout) childAt4;
                    linearLayout4.setShowDividers(2);
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    gradientDrawable4.setColor(r3.k.getColor(this$06.requireContext(), R.color.tabSeparatorColor));
                    gradientDrawable4.setSize(3, 1);
                    linearLayout4.setDividerPadding(35);
                    linearLayout4.setDividerDrawable(gradientDrawable4);
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            tab.b(this$06.getString(R.string.analysis));
                            return;
                        }
                        return;
                    }
                    tab.b(this$06.getString(R.string.charts));
                    return;
                }
                tab.b(this$06.getString(R.string.overview));
                return;
            default:
                MarketAssetSearchActivity this$07 = (MarketAssetSearchActivity) obj;
                int i17 = MarketAssetSearchActivity.f10385k;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt5 = ((p3) this$07.w()).f5715t.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt5, "getChildAt(...)");
                if (childAt5 instanceof LinearLayout) {
                    LinearLayout linearLayout5 = (LinearLayout) childAt5;
                    linearLayout5.setShowDividers(2);
                    GradientDrawable gradientDrawable5 = new GradientDrawable();
                    gradientDrawable5.setColor(r3.k.getColor(this$07, R.color.tabSeparatorColor));
                    gradientDrawable5.setSize(3, 1);
                    linearLayout5.setDividerPadding(35);
                    linearLayout5.setDividerDrawable(gradientDrawable5);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b("EQUITY");
                        return;
                    }
                    return;
                }
                tab.b("EQUITY");
                return;
        }
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public final void onDeepLinking(DeepLinkResult it) {
        SplashActivity this$0 = (SplashActivity) this.f37934b;
        int i10 = SplashActivity.f10156m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String stringValue = it.getDeepLink().getStringValue("deep_link_sub2");
        if (stringValue != null && stringValue.length() > 0) {
            SplashViewModel splashViewModel = (SplashViewModel) this$0.x();
            String stringValue2 = it.getDeepLink().getStringValue("deep_link_sub2");
            if (stringValue2 != null) {
                splashViewModel.f9081d.setInvitationCode(stringValue2);
            }
        }
        String deepLinkValue = it.getDeepLink().getDeepLinkValue();
        if (deepLinkValue != null && deepLinkValue.length() != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.valueOf(it.getDeepLink().getDeepLinkValue())));
            this$0.startActivity(intent);
            this$0.finish();
        }
    }
}
