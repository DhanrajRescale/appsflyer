package ie;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f19927a = new iu.k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
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
