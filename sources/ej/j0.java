package ej;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.JusPayInitiateResponse;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import com.google.gson.Gson;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPlanConfirmationViewModel f15493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel, int i10) {
        super(1);
        this.f15492a = i10;
        this.f15493b = subscriptionPlanConfirmationViewModel;
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f15492a;
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = this.f15493b;
        switch (i10) {
            case 1:
                if (baseResponseDto.getSuccess()) {
                    JusPayInitiateResponse jusPayInitiateResponse = (JusPayInitiateResponse) baseResponseDto.getData();
                    if (jusPayInitiateResponse != null) {
                        JSONObject jSONObject = new JSONObject(new Gson().toJson(jusPayInitiateResponse));
                        Object[] objArr = new Object[0];
                        Intrinsics.checkNotNullParameter("RechargeWalletViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g("response for payload " + jSONObject, "s", objArr, "params", "RechargeWalletViewModel").getClass();
                        ek.u.k(objArr);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(PaymentConstants.PAYLOAD, jSONObject);
                        jSONObject2.put("requestId", UUID.randomUUID().toString());
                        jSONObject2.put(PaymentConstants.SERVICE, "in.juspay.hyperpay");
                        Object[] objArr2 = new Object[0];
                        Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g("payload after enveloping: " + jSONObject, "s", objArr2, "params", "SubscriptionPlanConfirmationViewModel").getClass();
                        ek.u.k(objArr2);
                        subscriptionPlanConfirmationViewModel.f10566z.postValue(new kj.j(jSONObject2));
                        return;
                    }
                    return;
                }
                if (baseResponseDto.getMessage().length() == 0) {
                    subscriptionPlanConfirmationViewModel.B.postValue("Try again later");
                    return;
                } else {
                    subscriptionPlanConfirmationViewModel.B.postValue(baseResponseDto.getMessage());
                    return;
                }
            default:
                androidx.lifecycle.e0 e0Var = subscriptionPlanConfirmationViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                if (baseResponseDto.getSuccess()) {
                    Object data = baseResponseDto.getData();
                    if (data != null) {
                        JSONObject jSONObject3 = new JSONObject(new Gson().toJson(data));
                        subscriptionPlanConfirmationViewModel.D = jSONObject3.getString(PaymentConstants.ORDER_ID_CAMEL);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(PaymentConstants.PAYLOAD, jSONObject3);
                        jSONObject4.put("requestId", UUID.randomUUID().toString());
                        jSONObject4.put(PaymentConstants.SERVICE, "in.juspay.hyperpay");
                        String jSONObject5 = jSONObject4.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
                        Object[] objArr3 = new Object[0];
                        Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g(jSONObject5, "s", objArr3, "params", "SubscriptionPlanConfirmationViewModel").getClass();
                        ek.u.k(objArr3);
                        subscriptionPlanConfirmationViewModel.A.postValue(new kj.j(jSONObject4));
                        return;
                    }
                    return;
                }
                subscriptionPlanConfirmationViewModel.C.postValue(new kj.j(bool));
                subscriptionPlanConfirmationViewModel.f10562v.postValue(new kj.j(new k0("FAILURE", subscriptionPlanConfirmationViewModel.f10556p)));
                int length = baseResponseDto.getMessage().length();
                androidx.lifecycle.e0 e0Var2 = subscriptionPlanConfirmationViewModel.B;
                if (length == 0) {
                    e0Var2.postValue("Try again later");
                    return;
                } else {
                    e0Var2.postValue(baseResponseDto.getMessage());
                    return;
                }
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f15492a;
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = this.f15493b;
        switch (i10) {
            case 2:
                th2.printStackTrace();
                subscriptionPlanConfirmationViewModel.B.postValue("Try again later");
                return;
            default:
                androidx.lifecycle.e0 e0Var = subscriptionPlanConfirmationViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                subscriptionPlanConfirmationViewModel.B.postValue("Try again later");
                subscriptionPlanConfirmationViewModel.f10562v.postValue(new kj.j(new k0("FAILURE", subscriptionPlanConfirmationViewModel.f10556p)));
                subscriptionPlanConfirmationViewModel.C.postValue(new kj.j(bool));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15492a) {
            case 0:
                kj.j jVar = (kj.j) obj;
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    this.f15493b.k();
                }
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
