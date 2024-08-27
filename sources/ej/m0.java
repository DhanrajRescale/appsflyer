package ej;

import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.remote.request.SubscriptionPlanPurchaseRequestDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.TransactionStatusResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;

/* loaded from: classes.dex */
public final class m0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPlanConfirmationViewModel f15508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f15508b = subscriptionPlanConfirmationViewModel;
        this.f15509c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m0(this.f15508b, this.f15509c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        TransactionStatusResponse transactionStatusResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15507a;
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = this.f15508b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                PaymentRepository paymentRepository = subscriptionPlanConfirmationViewModel.f10554n;
                String str = this.f15509c;
                this.f15507a = 1;
                obj = paymentRepository.getTransactionStatus(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            androidx.lifecycle.e0 e0Var = subscriptionPlanConfirmationViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            subscriptionPlanConfirmationViewModel.C.postValue(new kj.j(bool));
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (transactionStatusResponse = (TransactionStatusResponse) baseResponseDto.getData()) != null) {
                    String status = transactionStatusResponse.getStatus();
                    if (vt.v.o(l0.f15499a, status)) {
                        String str2 = subscriptionPlanConfirmationViewModel.f10556p;
                        androidx.lifecycle.e0 e0Var2 = subscriptionPlanConfirmationViewModel.f10560t;
                        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse = subscriptionPlanConfirmationViewModel.f10557q;
                        if (subscriptionPlanConfirmationResponse != null) {
                            SubscriptionPlanPurchaseRequestDto subscriptionPlanPurchaseRequestDto = new SubscriptionPlanPurchaseRequestDto(str2, subscriptionPlanConfirmationResponse.getPackageID(), subscriptionPlanConfirmationViewModel.D);
                            if (subscriptionPlanConfirmationViewModel.E) {
                                subscriptionPlanPurchaseRequestDto.setMandateFlow(true);
                                subscriptionPlanPurchaseRequestDto.setMandateMessage(transactionStatusResponse.getMessage());
                            }
                            e0Var2.setValue(new kj.j(subscriptionPlanPurchaseRequestDto));
                        } else {
                            Intrinsics.k("data");
                            throw null;
                        }
                    } else if (vt.v.o(l0.f15500b, status)) {
                        subscriptionPlanConfirmationViewModel.f10562v.setValue(new kj.j(new k0("FAILURE", subscriptionPlanConfirmationViewModel.f10556p)));
                    } else {
                        subscriptionPlanConfirmationViewModel.f10562v.setValue(new kj.j(new k0("PENDING", subscriptionPlanConfirmationViewModel.f10556p)));
                    }
                }
            } else {
                subscriptionPlanConfirmationViewModel.C.postValue(new kj.j(bool));
                subscriptionPlanConfirmationViewModel.f10562v.setValue(new kj.j(new k0("FAILURE", subscriptionPlanConfirmationViewModel.f10556p)));
            }
        } catch (Exception unused) {
            subscriptionPlanConfirmationViewModel.C.postValue(new kj.j(Boolean.FALSE));
            subscriptionPlanConfirmationViewModel.f10562v.setValue(new kj.j(new k0("FAILURE", subscriptionPlanConfirmationViewModel.f10556p)));
        }
        return Unit.f23355a;
    }
}
