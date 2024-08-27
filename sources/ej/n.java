package ej;

import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.PaymentFeatures;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.data.remote.response.SubscriptionMaintenanceResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OtherSubscriptionPlansViewModel f15511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPackages f15512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(OtherSubscriptionPlansViewModel otherSubscriptionPlansViewModel, SubscriptionPackages subscriptionPackages, yt.a aVar) {
        super(2, aVar);
        this.f15511b = otherSubscriptionPlansViewModel;
        this.f15512c = subscriptionPackages;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f15511b, this.f15512c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SubscriptionMaintenanceResponse subscriptionMaintenanceResponse;
        SubscriptionMaintenanceResponse subscriptionMaintenanceResponse2;
        PaymentFeatures payment_features;
        SubscriptionFeatureFlag purchase;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15510a;
        OtherSubscriptionPlansViewModel otherSubscriptionPlansViewModel = this.f15511b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                PaymentRepository paymentRepository = otherSubscriptionPlansViewModel.f10523n;
                this.f15510a = 1;
                obj = paymentRepository.getSubwayMaintenance(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            Response response = v0Var.f29302a;
            Object obj2 = v0Var.f29303b;
            if (response.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) obj2;
                if (baseResponseV2Dto != null && (subscriptionMaintenanceResponse2 = (SubscriptionMaintenanceResponse) baseResponseV2Dto.getData()) != null && (payment_features = subscriptionMaintenanceResponse2.getPayment_features()) != null && (purchase = payment_features.getPurchase()) != null && purchase.is_enabled()) {
                    otherSubscriptionPlansViewModel.f10524o.setValue(new kj.j(this.f15512c.getPackageId()));
                } else {
                    BaseResponseV2Dto baseResponseV2Dto2 = (BaseResponseV2Dto) obj2;
                    if (baseResponseV2Dto2 != null && (subscriptionMaintenanceResponse = (SubscriptionMaintenanceResponse) baseResponseV2Dto2.getData()) != null) {
                        otherSubscriptionPlansViewModel.f10528s.postValue(new kj.j(subscriptionMaintenanceResponse.getPayment_features().getPurchase()));
                    }
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, otherSubscriptionPlansViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
