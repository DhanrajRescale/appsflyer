package ej;

import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MySubscriptionViewModel f15470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MySubscriptionViewModel mySubscriptionViewModel, yt.a aVar) {
        super(2, aVar);
        this.f15470b = mySubscriptionViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f15470b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseV2Dto baseResponseV2Dto;
        MySubscriptionResponse mySubscriptionResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15469a;
        MySubscriptionViewModel mySubscriptionViewModel = this.f15470b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                PaymentRepository paymentRepository = mySubscriptionViewModel.f10506n;
                this.f15469a = 1;
                obj = paymentRepository.getMySubscription(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b) != null && (mySubscriptionResponse = (MySubscriptionResponse) baseResponseV2Dto.getData()) != null) {
                mySubscriptionViewModel.getClass();
                Intrinsics.checkNotNullParameter(mySubscriptionResponse, "<set-?>");
                mySubscriptionViewModel.f10507o = mySubscriptionResponse;
                mySubscriptionViewModel.f10508p.postValue(mySubscriptionResponse);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
