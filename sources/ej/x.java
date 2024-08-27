package ej;

import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.SubscriptionDowngradePromptResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDowngradePromptViewModel f15559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f15559b = subscriptionDowngradePromptViewModel;
        this.f15560c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f15559b, this.f15560c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SubscriptionDowngradePromptResponse subscriptionDowngradePromptResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15558a;
        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = this.f15559b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                PaymentRepository paymentRepository = subscriptionDowngradePromptViewModel.f10533n;
                String str = this.f15560c;
                this.f15558a = 1;
                obj = paymentRepository.getPackageDowngrade(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            subscriptionDowngradePromptViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
                if (baseResponseV2Dto != null) {
                    subscriptionDowngradePromptResponse = (SubscriptionDowngradePromptResponse) baseResponseV2Dto.getData();
                } else {
                    subscriptionDowngradePromptResponse = null;
                }
                subscriptionDowngradePromptViewModel.f10534o.postValue(subscriptionDowngradePromptResponse);
            }
        } catch (Exception unused) {
            subscriptionDowngradePromptViewModel.f9084g.postValue(Boolean.FALSE);
            v.e.r(R.string.no_internet_connection, subscriptionDowngradePromptViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
