package ej;

import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OtherSubscriptionPlansFragment f15479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(OtherSubscriptionPlansFragment otherSubscriptionPlansFragment, int i10) {
        super(1);
        this.f15478a = i10;
        this.f15479b = otherSubscriptionPlansFragment;
    }

    public final void a(kj.j jVar) {
        int i10 = this.f15478a;
        OtherSubscriptionPlansFragment otherSubscriptionPlansFragment = this.f15479b;
        switch (i10) {
            case 0:
                String packageId = (String) jVar.a();
                if (packageId != null) {
                    androidx.navigation.t h10 = q6.l.h(otherSubscriptionPlansFragment);
                    Intrinsics.checkNotNullParameter(packageId, "packageId");
                    h10.o(new l(packageId, false));
                    return;
                }
                return;
            case 1:
                SubscriptionPackages subscriptionPackages = (SubscriptionPackages) jVar.a();
                if (subscriptionPackages != null) {
                    androidx.navigation.t h11 = q6.l.h(otherSubscriptionPlansFragment);
                    String packageId2 = subscriptionPackages.getPackageId();
                    int level = subscriptionPackages.getLevel();
                    String targetPlan = subscriptionPackages.getTitle();
                    int i11 = OtherSubscriptionPlansFragment.f10518k;
                    String currentPlan = otherSubscriptionPlansFragment.I().f15490a.getTitle();
                    String targetPlanPrice = subscriptionPackages.getDiscountPrice();
                    String currentPlanValidity = (String) kotlin.text.w.P(otherSubscriptionPlansFragment.I().f15490a.getValidityTitle(), new String[]{" "}, 0, 6).get(0);
                    Intrinsics.checkNotNullParameter(packageId2, "packageId");
                    Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                    Intrinsics.checkNotNullParameter(targetPlan, "targetPlan");
                    Intrinsics.checkNotNullParameter(targetPlanPrice, "targetPlanPrice");
                    Intrinsics.checkNotNullParameter(currentPlanValidity, "currentPlanValidity");
                    h11.o(new m(packageId2, level, currentPlan, targetPlan, targetPlanPrice, currentPlanValidity));
                    return;
                }
                return;
            default:
                SubscriptionFeatureFlag subscriptionFeatureFlag = (SubscriptionFeatureFlag) jVar.a();
                if (subscriptionFeatureFlag != null) {
                    q6.l.h(otherSubscriptionPlansFragment).o(new k(subscriptionFeatureFlag));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f15478a) {
            case 0:
                a((kj.j) obj);
                return Unit.f23355a;
            case 1:
                a((kj.j) obj);
                return Unit.f23355a;
            default:
                a((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
