package ee;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f15383b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f15384c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f15385d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f15386e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f15387f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f15388g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f15389h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f15390i = new c(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f15391a = i10;
    }

    public final String a(Group group) {
        switch (this.f15391a) {
            case 2:
                return group.getCoverImageURL();
            case 3:
                return group.getDescription();
            case 4:
                return group.getDisplayImageUrl();
            case 5:
                return group.getGroupName();
            default:
                return a3.a.m(new Object[]{String.valueOf(group.getMemberCount())}, 1, "Members: %s", "format(...)");
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        switch (this.f15391a) {
            case 0:
                GroupMember it = (GroupMember) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
            case 1:
                return ((Group) obj).getAdmins();
            case 2:
                return a((Group) obj);
            case 3:
                return a((Group) obj);
            case 4:
                return a((Group) obj);
            case 5:
                return a((Group) obj);
            case 6:
                return a((Group) obj);
            default:
                Group group = (Group) obj;
                int accessPackageLevel = group.getSubscriptionPackageInfo().getAccessPackageLevel();
                if (accessPackageLevel != 1) {
                    if (accessPackageLevel != 2) {
                        if (accessPackageLevel != 3) {
                            return new Pair(HttpUrl.FRAGMENT_ENCODE_SET, -1);
                        }
                        pair = new Pair(group.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_influencer));
                    } else {
                        pair = new Pair(group.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_expert));
                    }
                } else {
                    pair = new Pair(group.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_advance));
                }
                return pair;
        }
    }
}
