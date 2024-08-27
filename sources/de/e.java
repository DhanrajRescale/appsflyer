package de;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f14318b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f14319c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f14320d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f14321a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        int i10 = this.f14321a;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                switch (i10) {
                    case 0:
                        return group.getGroupName();
                    default:
                        return group.getCoverImageURL();
                }
            case 1:
                Group group2 = (Group) obj;
                switch (i10) {
                    case 0:
                        return group2.getGroupName();
                    default:
                        return group2.getCoverImageURL();
                }
            default:
                Group group3 = (Group) obj;
                int accessPackageLevel = group3.getSubscriptionPackageInfo().getAccessPackageLevel();
                if (accessPackageLevel != 1) {
                    if (accessPackageLevel != 2) {
                        if (accessPackageLevel != 3) {
                            return new Pair(HttpUrl.FRAGMENT_ENCODE_SET, -1);
                        }
                        pair = new Pair(group3.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_influencer));
                    } else {
                        pair = new Pair(group3.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_expert));
                    }
                } else {
                    pair = new Pair(group3.getSubscriptionPackageInfo().getAccessPackageName(), Integer.valueOf(R.drawable.subscription_tag_advance));
                }
                return pair;
        }
    }
}
