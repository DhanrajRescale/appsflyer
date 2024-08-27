package ej;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDowngradePromptFragment f15533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(SubscriptionDowngradePromptFragment subscriptionDowngradePromptFragment, int i10) {
        super(1);
        this.f15532a = i10;
        this.f15533b = subscriptionDowngradePromptFragment;
    }

    public final void a(kj.j jVar) {
        int i10 = this.f15532a;
        SubscriptionDowngradePromptFragment subscriptionDowngradePromptFragment = this.f15533b;
        switch (i10) {
            case 0:
                String packageId = (String) jVar.a();
                if (packageId != null) {
                    androidx.navigation.t h10 = q6.l.h(subscriptionDowngradePromptFragment);
                    Intrinsics.checkNotNullParameter(packageId, "packageId");
                    h10.o(new t(packageId, false));
                    return;
                }
                return;
            case 1:
                String packageId2 = (String) jVar.a();
                if (packageId2 != null) {
                    androidx.navigation.t h11 = q6.l.h(subscriptionDowngradePromptFragment);
                    Intrinsics.checkNotNullParameter(packageId2, "packageId");
                    Intrinsics.checkNotNullParameter("CASH", "pgRoute");
                    h11.o(new u(packageId2, HttpUrl.FRAGMENT_ENCODE_SET, false));
                    return;
                }
                return;
            case 2:
                SubscriptionFeatureFlag subscriptionFeatureFlag = (SubscriptionFeatureFlag) jVar.a();
                if (subscriptionFeatureFlag != null) {
                    q6.l.h(subscriptionDowngradePromptFragment).o(new v(subscriptionFeatureFlag));
                    return;
                }
                return;
            case 3:
                String str = (String) jVar.a();
                if (str != null) {
                    int i11 = r0.f15534d;
                    String string = subscriptionDowngradePromptFragment.getString(R.string.proceed);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    mt.p.A(str, string).show(subscriptionDowngradePromptFragment.getChildFragmentManager(), "SubscriptionUPIAutoPayPreConfirmation");
                    return;
                }
                return;
            default:
                if (((Unit) jVar.a()) != null) {
                    subscriptionDowngradePromptFragment.y(new AnalyticEvent("app_sub_autopay_proceed", null, 2, null));
                    SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = (SubscriptionDowngradePromptViewModel) subscriptionDowngradePromptFragment.r();
                    String packageId3 = subscriptionDowngradePromptFragment.H().f15537a;
                    Intrinsics.checkNotNullParameter(packageId3, "packageId");
                    subscriptionDowngradePromptViewModel.f10536q.setValue(new kj.j(packageId3));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        switch (this.f15532a) {
            case 0:
                a((kj.j) obj);
                return Unit.f23355a;
            case 1:
                a((kj.j) obj);
                return Unit.f23355a;
            case 2:
                a((kj.j) obj);
                return Unit.f23355a;
            case 3:
                a((kj.j) obj);
                return Unit.f23355a;
            case 4:
                Boolean bool = (Boolean) obj;
                boolean a10 = Intrinsics.a(bool, Boolean.TRUE);
                SubscriptionDowngradePromptFragment subscriptionDowngradePromptFragment = this.f15533b;
                if (a10) {
                    com.kaopiz.kprogresshud.f fVar2 = subscriptionDowngradePromptFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = subscriptionDowngradePromptFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            default:
                a((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
