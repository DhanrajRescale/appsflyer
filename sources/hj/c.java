package hj;

import androidx.navigation.t;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusFragment;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import org.json.JSONObject;
import q6.l;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPurchaseStatusFragment f18497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SubscriptionPurchaseStatusFragment subscriptionPurchaseStatusFragment, int i10) {
        super(1);
        this.f18496a = i10;
        this.f18497b = subscriptionPurchaseStatusFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f18496a;
        SubscriptionPurchaseStatusFragment subscriptionPurchaseStatusFragment = this.f18497b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = subscriptionPurchaseStatusFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = subscriptionPurchaseStatusFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Plan", ((SubscriptionPurchaseResponse) obj).getTitle());
                n0 n0Var = subscriptionPurchaseStatusFragment.f17287e;
                if (n0Var != null) {
                    n0Var.l(jSONObject);
                    subscriptionPurchaseStatusFragment.z(new AnalyticEvent("app_sub_purchase_success", null, 2, null));
                    if (((ManageSubscriptionViewModel) subscriptionPurchaseStatusFragment.f10571h.getValue()).f10498q) {
                        subscriptionPurchaseStatusFragment.z(new AnalyticEvent("subscription_purchase", null, 2, null));
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("mixpanelAPI");
                throw null;
            default:
                String str = (String) ((j) obj).a();
                if (str != null) {
                    t h10 = l.h(subscriptionPurchaseStatusFragment);
                    int i11 = SubscriptionPurchaseStatusFragment.f10569i;
                    String pgRoute = subscriptionPurchaseStatusFragment.H().f18500b;
                    String packageId = subscriptionPurchaseStatusFragment.H().f18499a;
                    Intrinsics.checkNotNullParameter(str, "case");
                    Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
                    Intrinsics.checkNotNullParameter(packageId, "packageId");
                    h10.o(new f(str, pgRoute, packageId));
                }
                return Unit.f23355a;
        }
    }
}
