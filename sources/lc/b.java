package lc;

import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.i1;
import androidx.fragment.app.j0;
import androidx.navigation.t;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.compose.ChatMediaViewerActivity;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoActivity;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.HomeMarketDto;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycHostActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycStepFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import g7.x3;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import tg.o;
import ue.j;
import ue.n;
import vd.v;
import xd.f;
import yf.g;

/* loaded from: classes.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24518b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(0);
        this.f24517a = i10;
        this.f24518b = obj;
    }

    public final LeagueDetailPostJoiningViewModel a() {
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 0:
                j0 activity = ((c) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
                return (LeagueDetailPostJoiningViewModel) ((LeagueDetailPostJoiningActivity) activity).x();
            case 1:
                j0 activity2 = ((e) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
                return (LeagueDetailPostJoiningViewModel) ((LeagueDetailPostJoiningActivity) activity2).x();
            default:
                j0 activity3 = ((bd.d) obj).getActivity();
                Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
                return (LeagueDetailPostJoiningViewModel) ((LeagueDetailPostJoiningActivity) activity3).x();
        }
    }

    public final GroupChatViewModel d() {
        GroupChatFragment groupChatFragment;
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 11:
                g0 parentFragment = ((ud.a) obj).getParentFragment();
                if (parentFragment instanceof GroupChatFragment) {
                    groupChatFragment = (GroupChatFragment) parentFragment;
                } else {
                    groupChatFragment = null;
                }
                if (groupChatFragment == null) {
                    return null;
                }
                return (GroupChatViewModel) groupChatFragment.r();
            case 15:
                g0 parentFragment2 = ((v) obj).getParentFragment();
                Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment");
                return (GroupChatViewModel) ((GroupChatFragment) parentFragment2).r();
            default:
                j0 activity = ((ae.b) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity");
                return (GroupChatViewModel) ((MessageThreadInfoActivity) activity).x();
        }
    }

    public final WalletHomeViewModel e() {
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 25:
                j0 activity = ((vf.c) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.home.WalletHomeActivity");
                return (WalletHomeViewModel) ((WalletHomeActivity) activity).x();
            default:
                j0 activity2 = ((yf.c) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.home.WalletHomeActivity");
                return (WalletHomeViewModel) ((WalletHomeActivity) activity2).x();
        }
    }

    public final x3 f() {
        int i10 = this.f24517a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        Object obj = this.f24518b;
        switch (i10) {
            case 2:
                ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) obj;
                return new uc.b(arenaUpcomingViewModel.f8957n, arenaUpcomingViewModel.f8961r, arenaUpcomingViewModel.f8962s, arenaUpcomingViewModel.f8963t);
            case 6:
                return new j(((GroupCreateViewModel) obj).f9115n, HttpUrl.FRAGMENT_ENCODE_SET);
            case 12:
                AddMembersViewModel addMembersViewModel = (AddMembersViewModel) obj;
                FollowerRepository followerRepository = addMembersViewModel.f9265o;
                String str2 = addMembersViewModel.f9267q;
                if (str2 != null) {
                    str = str2;
                }
                return new j(followerRepository, str);
            default:
                GroupInvitedListViewModel groupInvitedListViewModel = (GroupInvitedListViewModel) obj;
                return new n(groupInvitedListViewModel.f9275o, groupInvitedListViewModel.f9274n);
        }
    }

    public final void i() {
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 5:
                ((ChatMediaViewerActivity) obj).finish();
                return;
            case 7:
                int i11 = od.e.f29968k;
                ((od.e) obj).I();
                return;
            case 8:
                ((GroupCreateHostActivityCompose) obj).finish();
                return;
            case 10:
                int i12 = GroupInfoV2Fragment.f9216r;
                ((GroupInfoV2Fragment) obj).L();
                return;
            case 13:
                ((GroupInvitedListViewModel) ((GroupInvitedListActivity) obj).x()).h();
                return;
            case 16:
                ((AddMembersHostComposeActivity) obj).finish();
                return;
            case 20:
                ((SocialChatListViewModel) ((MessageInvitesActivity) obj).x()).j();
                return;
            default:
                lf.b bVar = (lf.b) obj;
                bVar.requireActivity().finish();
                bVar.dismiss();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return f();
            case 3:
                return a();
            case 4:
                g0 parentFragment = ((hd.d) obj).getParentFragment();
                Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.orders.PortfolioStockOrderFragment");
                return (PortfolioOrdersViewModel) ((o) parentFragment).r();
            case 5:
                i();
                return Unit.f23355a;
            case 6:
                return f();
            case 7:
                i();
                return Unit.f23355a;
            case 8:
                i();
                return Unit.f23355a;
            case 9:
                return j();
            case 10:
                i();
                return Unit.f23355a;
            case 11:
                return d();
            case 12:
                return f();
            case 13:
                i();
                return Unit.f23355a;
            case 14:
                return f();
            case 15:
                return d();
            case 16:
                i();
                return Unit.f23355a;
            case 17:
                f fVar = (f) obj;
                if (fVar.getActivity() instanceof MessageThreadInfoActivity) {
                    j0 activity = fVar.getActivity();
                    Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity");
                    return ((MessageThreadInfoActivity) activity).x();
                }
                j0 activity2 = fVar.getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity");
                return ((GroupMemberListActivity) activity2).x();
            case 18:
                return d();
            case 19:
                return j();
            case 20:
                i();
                return Unit.f23355a;
            case 21:
                j0 activity3 = ((se.b) obj).getActivity();
                Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity");
                return (SocialAdvancedSearchViewModel) ((SocialAdvancedSearchActivity) activity3).x();
            case 22:
                return Integer.valueOf(((HomeMarketDto) obj).getMarketCategories().size());
            case 23:
                i();
                return Unit.f23355a;
            case 24:
                j0 activity4 = ((uf.b) obj).getActivity();
                Intrinsics.d(activity4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity");
                return (WithdrawalDetailViewModel) ((WithdrawalDetailActivity) activity4).x();
            case 25:
                return e();
            case 26:
                return j();
            case 27:
                d1 fm2 = ((KycStepFragment) obj).getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fm2, "getChildFragmentManager(...)");
                Intrinsics.checkNotNullParameter(fm2, "fm");
                return new i1(fm2);
            case 28:
                return e();
            default:
                g0 parentFragment2 = ((g) obj).getParentFragment();
                Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedFragment");
                return (KycVerificationRejectedViewModel) ((KycVerificationRejectedFragment) parentFragment2).r();
        }
    }

    public final t j() {
        int i10 = this.f24517a;
        Object obj = this.f24518b;
        switch (i10) {
            case 9:
                return yk.g.t((GroupInfoActivity) obj, R.id.group_info_nav_host_fragment);
            case 19:
                return yk.g.t((GroupDetailHostActivity) obj, R.id.group_chat_nav_host_fragment);
            default:
                return yk.g.t((KycHostActivity) obj, R.id.kyc_nav_host_fragment);
        }
    }
}
