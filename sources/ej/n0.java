package ej;

import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class n0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPlanConfirmationViewModel f15514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel, String str, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f15514b = subscriptionPlanConfirmationViewModel;
        this.f15515c = str;
        this.f15516d = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n0(this.f15514b, this.f15515c, this.f15516d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseV2Dto baseResponseV2Dto;
        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15513a;
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = this.f15514b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PaymentRepository paymentRepository = subscriptionPlanConfirmationViewModel.f10554n;
            this.f15513a = 1;
            obj = paymentRepository.getSubscriptionConfirmation(this.f15515c, this.f15516d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b) != null && (subscriptionPlanConfirmationResponse = (SubscriptionPlanConfirmationResponse) baseResponseV2Dto.getData()) != null) {
            subscriptionPlanConfirmationViewModel.f10557q = subscriptionPlanConfirmationResponse;
            subscriptionPlanConfirmationViewModel.f10558r.postValue(subscriptionPlanConfirmationResponse);
        }
        return Unit.f23355a;
    }
}
