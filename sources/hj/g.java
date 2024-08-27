package hj;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusViewModel;
import kj.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPurchaseStatusViewModel f18508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18509c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f18512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SubscriptionPurchaseStatusViewModel subscriptionPurchaseStatusViewModel, String str, String str2, String str3, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f18508b = subscriptionPurchaseStatusViewModel;
        this.f18509c = str;
        this.f18510d = str2;
        this.f18511e = str3;
        this.f18512f = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f18508b, this.f18509c, this.f18510d, this.f18511e, this.f18512f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SubscriptionPurchaseResponse subscriptionPurchaseResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18507a;
        SubscriptionPurchaseStatusViewModel subscriptionPurchaseStatusViewModel = this.f18508b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PaymentRepository paymentRepository = subscriptionPurchaseStatusViewModel.f10572n;
                String str = this.f18509c;
                String str2 = this.f18510d;
                String str3 = this.f18511e;
                this.f18507a = 1;
                obj = paymentRepository.purchaseSubscriptionPlan(str, str2, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            subscriptionPurchaseStatusViewModel.f9084g.setValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
                if (baseResponseV2Dto != null && (subscriptionPurchaseResponse = (SubscriptionPurchaseResponse) baseResponseV2Dto.getData()) != null) {
                    boolean z10 = this.f18512f;
                    subscriptionPurchaseStatusViewModel.f10574p.postValue(subscriptionPurchaseResponse);
                    subscriptionPurchaseStatusViewModel.f10581w.postValue(new j(Boolean.TRUE));
                    subscriptionPurchaseStatusViewModel.f10578t.postValue(subscriptionPurchaseResponse.getNote());
                    e0 e0Var = subscriptionPurchaseStatusViewModel.f10576r;
                    if (z10) {
                        subscriptionPurchaseStatusViewModel.f10573o.g0("subscription_purchase");
                        e0Var.postValue(new j(new Pair("app_sub_purchase_success", subscriptionPurchaseResponse.getTitle())));
                    } else {
                        e0Var.postValue(new j(new Pair("subscription_purchase", subscriptionPurchaseResponse.getTitle())));
                    }
                }
            } else {
                subscriptionPurchaseStatusViewModel.f10579u.setValue(new j("PURCHASE_FAILED"));
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, subscriptionPurchaseStatusViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
