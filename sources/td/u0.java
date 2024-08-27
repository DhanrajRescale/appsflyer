package td;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.data.model.RiaRraInfo;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class u0 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f35956b = new u0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f35957c = new u0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final u0 f35958d = new u0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f35959e = new u0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final u0 f35960f = new u0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final u0 f35961g = new u0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final u0 f35962h = new u0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final u0 f35963i = new u0(7);

    /* renamed from: j, reason: collision with root package name */
    public static final u0 f35964j = new u0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final u0 f35965k = new u0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final u0 f35966l = new u0(10);

    /* renamed from: m, reason: collision with root package name */
    public static final u0 f35967m = new u0(11);

    /* renamed from: n, reason: collision with root package name */
    public static final u0 f35968n = new u0(12);

    /* renamed from: o, reason: collision with root package name */
    public static final u0 f35969o = new u0(13);

    /* renamed from: p, reason: collision with root package name */
    public static final u0 f35970p = new u0(14);

    /* renamed from: q, reason: collision with root package name */
    public static final u0 f35971q = new u0(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35972a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i10) {
        super(1);
        this.f35972a = i10;
    }

    public final Boolean a(Group group) {
        boolean z10 = false;
        switch (this.f35972a) {
            case 12:
                String riaRraDescription = group.getRiaRraDescription();
                if (riaRraDescription == null || riaRraDescription.length() == 0) {
                    z10 = true;
                }
                return Boolean.valueOf(!z10);
            default:
                String riaRraUserId = group.getRiaRraUserId();
                if (riaRraUserId == null || riaRraUserId.length() == 0) {
                    z10 = true;
                }
                return Boolean.valueOf(!z10);
        }
    }

    public final String d(Group group) {
        switch (this.f35972a) {
            case 6:
                return group.getRiaRraDescription();
            case 7:
                RiaRraInfo riaRraInfo = group.getRiaRraInfo();
                if (riaRraInfo == null) {
                    return null;
                }
                return riaRraInfo.getDisplayImage();
            case 8:
                RiaRraInfo riaRraInfo2 = group.getRiaRraInfo();
                if (riaRraInfo2 == null) {
                    return null;
                }
                return riaRraInfo2.getDisplayName();
            case 9:
                RiaRraInfo riaRraInfo3 = group.getRiaRraInfo();
                if (riaRraInfo3 == null) {
                    return null;
                }
                return riaRraInfo3.getUserName();
            default:
                return String.valueOf(group.getStarredMessagesCount());
        }
    }

    public final String e(ArenaGame arenaGame) {
        long j10 = 0;
        switch (this.f35972a) {
            case 3:
                Long portfolioSubmissionTime = arenaGame.getPortfolioSubmissionTime();
                if (portfolioSubmissionTime != null) {
                    j10 = portfolioSubmissionTime.longValue();
                }
                jv.a b10 = jv.a.b("dd MMM yyyy");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, j10);
                hv.q p10 = hv.q.p();
                l10.getClass();
                String a10 = b10.a(hv.t.p(l10, p10));
                Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                return a10;
            case 4:
                Long portfolioSubmissionTime2 = arenaGame.getPortfolioSubmissionTime();
                if (portfolioSubmissionTime2 != null) {
                    j10 = portfolioSubmissionTime2.longValue();
                }
                hv.e l11 = hv.e.l(0, j10);
                hv.t a11 = a3.a.a(l11, l11);
                jv.a b11 = jv.a.b("dd MMM yyyy | HH:mm");
                hv.g gVar = a11.f18769a;
                gVar.getClass();
                String a12 = b11.a(gVar);
                Intrinsics.checkNotNullExpressionValue(a12, "format(...)");
                return a12;
            case 5:
                ij.h hVar = ij.h.f20067a;
                return ij.h.h(arenaGame.getPrizePool(), 0, false, 6);
            default:
                if (arenaGame.getSeatsLeft() >= 0) {
                    return String.valueOf(arenaGame.getSeatsLeft());
                }
                return "0";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        int i10 = this.f35972a;
        boolean z10 = true;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                switch (i10) {
                    case 0:
                        return group.getModerators();
                    default:
                        return group.getTags();
                }
            case 1:
                return Integer.valueOf(((Group) obj).getMemberCount());
            case 2:
                Group group2 = (Group) obj;
                int accessPackageLevel = group2.getSubscriptionPackageInfo().getAccessPackageLevel();
                if (accessPackageLevel != 1) {
                    if (accessPackageLevel != 2) {
                        if (accessPackageLevel != 3) {
                            return new Pair(HttpUrl.FRAGMENT_ENCODE_SET, -1);
                        }
                        pair = new Pair(group2.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_influencer));
                    } else {
                        pair = new Pair(group2.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_expert));
                    }
                } else {
                    pair = new Pair(group2.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_advance));
                }
                return pair;
            case 3:
                return e((ArenaGame) obj);
            case 4:
                return e((ArenaGame) obj);
            case 5:
                return e((ArenaGame) obj);
            case 6:
                return d((Group) obj);
            case 7:
                return d((Group) obj);
            case 8:
                return d((Group) obj);
            case 9:
                return d((Group) obj);
            case 10:
                return e((ArenaGame) obj);
            case 11:
                GroupUIConfig groupUIConfig = (GroupUIConfig) obj;
                if (!groupUIConfig.getCanAddMembers() || !groupUIConfig.getCanEditAdminOnlyOption()) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 12:
                return a((Group) obj);
            case 13:
                return a((Group) obj);
            case 14:
                return d((Group) obj);
            default:
                Group group3 = (Group) obj;
                switch (i10) {
                    case 0:
                        return group3.getModerators();
                    default:
                        return group3.getTags();
                }
        }
    }
}
