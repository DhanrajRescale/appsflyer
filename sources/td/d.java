package td;

import androidx.navigation.x0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.data.model.MembershipStatus;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35857a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f35832b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f35833c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f35834d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f35835e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f35836f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f35837g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f35838h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f35839i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f35840j = new d(8);

    /* renamed from: k, reason: collision with root package name */
    public static final d f35841k = new d(9);

    /* renamed from: l, reason: collision with root package name */
    public static final d f35842l = new d(10);

    /* renamed from: m, reason: collision with root package name */
    public static final d f35843m = new d(11);

    /* renamed from: n, reason: collision with root package name */
    public static final d f35844n = new d(12);

    /* renamed from: o, reason: collision with root package name */
    public static final d f35845o = new d(13);

    /* renamed from: p, reason: collision with root package name */
    public static final d f35846p = new d(14);

    /* renamed from: q, reason: collision with root package name */
    public static final d f35847q = new d(15);

    /* renamed from: r, reason: collision with root package name */
    public static final d f35848r = new d(16);

    /* renamed from: s, reason: collision with root package name */
    public static final d f35849s = new d(17);

    /* renamed from: t, reason: collision with root package name */
    public static final d f35850t = new d(18);

    /* renamed from: u, reason: collision with root package name */
    public static final d f35851u = new d(19);

    /* renamed from: v, reason: collision with root package name */
    public static final d f35852v = new d(20);

    /* renamed from: w, reason: collision with root package name */
    public static final d f35853w = new d(21);

    /* renamed from: x, reason: collision with root package name */
    public static final d f35854x = new d(22);

    /* renamed from: y, reason: collision with root package name */
    public static final d f35855y = new d(23);

    /* renamed from: z, reason: collision with root package name */
    public static final d f35856z = new d(24);
    public static final d A = new d(25);
    public static final d B = new d(26);
    public static final d C = new d(27);
    public static final d D = new d(28);
    public static final d E = new d(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f35857a = i10;
    }

    public final Boolean a(Group group) {
        boolean z10 = true;
        switch (this.f35857a) {
            case 4:
                return Boolean.valueOf(!group.getIsOpenForAudience());
            case 20:
                return Boolean.valueOf(!Intrinsics.a(group.getType(), "League"));
            case 24:
                MembershipStatus membershipStatus = group.getMembershipStatus();
                if (membershipStatus != null) {
                    return Boolean.valueOf(membershipStatus.getIsMuted());
                }
                return null;
            default:
                String type = group.getType();
                if (type == null || type.length() == 0 || !Intrinsics.a(group.getType(), "League")) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }

    public final Boolean d(GroupUIConfig groupUIConfig) {
        switch (this.f35857a) {
            case 7:
                return Boolean.valueOf(groupUIConfig.getCanAddMembers());
            case 8:
                return Boolean.valueOf(groupUIConfig.getCanEditAdminOnlyOption());
            case 9:
                return Boolean.valueOf(groupUIConfig.getCanExitGroup());
            case 10:
                return Boolean.valueOf(groupUIConfig.getCanViewGroupMember());
            case 11:
                return Boolean.valueOf(groupUIConfig.getCanViewRogues());
            case 22:
                return Boolean.valueOf(groupUIConfig.getIsGroupMetaEditable());
            default:
                return Boolean.valueOf(groupUIConfig.getCanViewInvitedUsers());
        }
    }

    public final Integer e(Group group) {
        int i10 = 8;
        switch (this.f35857a) {
            case 2:
                List<GroupMember> admins = group.getAdmins();
                if (admins != null && !admins.isEmpty()) {
                    i10 = 0;
                }
                return Integer.valueOf(i10);
            case 12:
                List<GroupMember> seeders = group.getSeeders();
                if (seeders != null && !seeders.isEmpty()) {
                    i10 = 0;
                }
                return Integer.valueOf(i10);
            default:
                List<GroupMember> moderators = group.getModerators();
                if (moderators != null && !moderators.isEmpty()) {
                    i10 = 0;
                }
                return Integer.valueOf(i10);
        }
    }

    public final String f(Group group) {
        switch (this.f35857a) {
            case 5:
                return String.valueOf(group.getAutoDeleteTime());
            case 6:
                return String.valueOf(group.getBannedMembersCount());
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 20:
            default:
                return String.valueOf(group.getMemberCount());
            case 14:
                return group.getCoverImageURL();
            case 15:
                String description = group.getDescription();
                if (description == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return description;
            case 16:
                return group.getDisplayImageUrl();
            case 17:
                return group.getGroupName();
            case 18:
                if (Intrinsics.a(String.valueOf(group.getMembersCount().getInvitedUsers()), "1")) {
                    return group.getMembersCount().getInvitedUsers() + " invitee";
                }
                return group.getMembersCount().getInvitedUsers() + " invitees";
            case 19:
                if (Intrinsics.a(String.valueOf(group.getMemberCount()), "1")) {
                    return group.getMemberCount() + " member";
                }
                return group.getMemberCount() + " members";
            case 21:
                return group.getInviteLink();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f35857a;
        switch (i10) {
            case 0:
                x0 popUpTo = (x0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f2340a = true;
                return Unit.f23355a;
            case 1:
                androidx.navigation.l0 navOptions = (androidx.navigation.l0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.a(R.id.groupInfoV2Fragment, f35832b);
                return Unit.f23355a;
            case 2:
                return e((Group) obj);
            case 3:
                Group group = (Group) obj;
                switch (i10) {
                    case 3:
                        return group.getAdmins();
                    default:
                        return group.getSeeders();
                }
            case 4:
                return a((Group) obj);
            case 5:
                return f((Group) obj);
            case 6:
                return f((Group) obj);
            case 7:
                return d((GroupUIConfig) obj);
            case 8:
                return d((GroupUIConfig) obj);
            case 9:
                return d((GroupUIConfig) obj);
            case 10:
                return d((GroupUIConfig) obj);
            case 11:
                return d((GroupUIConfig) obj);
            case 12:
                return e((Group) obj);
            case 13:
                Group group2 = (Group) obj;
                switch (i10) {
                    case 3:
                        return group2.getAdmins();
                    default:
                        return group2.getSeeders();
                }
            case 14:
                return f((Group) obj);
            case 15:
                return f((Group) obj);
            case 16:
                return f((Group) obj);
            case 17:
                return f((Group) obj);
            case 18:
                return f((Group) obj);
            case 19:
                return f((Group) obj);
            case 20:
                return a((Group) obj);
            case 21:
                return f((Group) obj);
            case 22:
                return d((GroupUIConfig) obj);
            case 23:
                return d((GroupUIConfig) obj);
            case 24:
                return a((Group) obj);
            case 25:
                return a((Group) obj);
            case 26:
                ArenaGame arenaGame = (ArenaGame) obj;
                switch (i10) {
                    case 26:
                        return String.valueOf(arenaGame.getMaximumPlayers());
                    default:
                        return String.valueOf(arenaGame.getMinimumPlayers());
                }
            case 27:
                return f((Group) obj);
            case 28:
                ArenaGame arenaGame2 = (ArenaGame) obj;
                switch (i10) {
                    case 26:
                        return String.valueOf(arenaGame2.getMaximumPlayers());
                    default:
                        return String.valueOf(arenaGame2.getMinimumPlayers());
                }
            default:
                return e((Group) obj);
        }
    }
}
