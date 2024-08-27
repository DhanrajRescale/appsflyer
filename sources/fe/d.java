package fe;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f16047b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f16048c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f16049d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f16050e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f16051a = i10;
    }

    public final String a(Group group) {
        switch (this.f16051a) {
            case 0:
                return group.getDisplayImageUrl();
            case 1:
                int memberCount = group.getMemberCount();
                if (memberCount > 1) {
                    return memberCount + " members";
                }
                return "1 member";
            default:
                return group.getGroupName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        switch (this.f16051a) {
            case 0:
                return a((Group) obj);
            case 1:
                return a((Group) obj);
            case 2:
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
