package gf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.BulletInDto;
import com.assetgro.stockgro.data.remote.response.SubscriptionNudgeResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;
import ut.n;
import vt.g0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HomeViewModel homeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f17376b = homeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f17376b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseV2Dto baseResponseV2Dto;
        SubscriptionNudgeResponse subscriptionNudgeResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17375a;
        HomeViewModel homeViewModel = this.f17376b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PaymentRepository paymentRepository = homeViewModel.f9547p;
                this.f17375a = 1;
                obj = paymentRepository.getSubscriptionPrompt("home", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b) != null && (subscriptionNudgeResponse = (SubscriptionNudgeResponse) baseResponseV2Dto.getData()) != null) {
                String planName = subscriptionNudgeResponse.getPlanName();
                if (planName != null && !homeViewModel.f9081d.getSubscriptionPlanRegisteredOnMixpanel()) {
                    homeViewModel.H.postValue(new kj.j(planName));
                    homeViewModel.f9081d.setSubscriptionPlanRegisteredOnMixpanel(true);
                }
                if (subscriptionNudgeResponse.getPackageBulletin() != null) {
                    List<BulletInDto> packageBulletin = subscriptionNudgeResponse.getPackageBulletin();
                    BulletInDto bulletInDto = (BulletInDto) g0.u(packageBulletin);
                    if (Intrinsics.a(bulletInDto.getContentType(), "1")) {
                        if (!homeViewModel.G) {
                            e0 e0Var = homeViewModel.F;
                            String planName2 = subscriptionNudgeResponse.getPlanName();
                            if (planName2 == null) {
                                planName2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            e0Var.postValue(new kj.j(new Pair(planName2, bulletInDto.getText())));
                            homeViewModel.G = true;
                        }
                    } else {
                        homeViewModel.E.postValue(packageBulletin);
                    }
                } else {
                    homeViewModel.E.postValue(new ArrayList());
                }
            }
        } catch (Exception unused) {
            homeViewModel.E.postValue(new ArrayList());
        }
        return Unit.f23355a;
    }
}
