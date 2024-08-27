package ag;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.data.remote.response.JusPayInitiateResponse;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.google.gson.Gson;
import ek.u;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.k;
import java.util.UUID;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RechargeWalletViewModel f416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RechargeWalletViewModel rechargeWalletViewModel, int i10) {
        super(1);
        this.f415a = i10;
        this.f416b = rechargeWalletViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RechargeWalletViewModel rechargeWalletViewModel = this.f416b;
        int i10 = this.f415a;
        switch (i10) {
            case 0:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 2:
                        th2.printStackTrace();
                        rechargeWalletViewModel.f9712s.postValue("Try again later");
                        break;
                    default:
                        rechargeWalletViewModel.f9712s.postValue("Try again later");
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 2:
                        th3.printStackTrace();
                        rechargeWalletViewModel.f9712s.postValue("Try again later");
                        break;
                    default:
                        rechargeWalletViewModel.f9712s.postValue("Try again later");
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        ConfigDto configDto;
        int i10 = this.f415a;
        RechargeWalletViewModel rechargeWalletViewModel = this.f416b;
        switch (i10) {
            case 0:
                if (!baseResponseDto.getSuccess() || (configDto = (ConfigDto) baseResponseDto.getData()) == null) {
                    return;
                }
                rechargeWalletViewModel.f9719z.postValue(configDto);
                return;
            case 1:
                if (baseResponseDto.getSuccess()) {
                    JusPayInitiateResponse jusPayInitiateResponse = (JusPayInitiateResponse) baseResponseDto.getData();
                    if (jusPayInitiateResponse != null) {
                        JSONObject jSONObject = new JSONObject(new Gson().toJson(jusPayInitiateResponse));
                        Object[] objArr = new Object[0];
                        Intrinsics.checkNotNullParameter("RechargeWalletViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g("response for payload " + jSONObject, "s", objArr, "params", "RechargeWalletViewModel").getClass();
                        u.k(objArr);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(PaymentConstants.PAYLOAD, jSONObject);
                        jSONObject2.put("requestId", UUID.randomUUID().toString());
                        jSONObject2.put(PaymentConstants.SERVICE, "in.juspay.hyperpay");
                        Object[] objArr2 = new Object[0];
                        Intrinsics.checkNotNullParameter("RechargeWalletViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g("payload after enveloping: " + jSONObject, "s", objArr2, "params", "RechargeWalletViewModel").getClass();
                        u.k(objArr2);
                        rechargeWalletViewModel.f9717x.postValue(new j(jSONObject2));
                        return;
                    }
                    return;
                }
                if (baseResponseDto.getMessage().length() == 0) {
                    rechargeWalletViewModel.f9712s.postValue("Try again later");
                    return;
                } else {
                    rechargeWalletViewModel.f9712s.postValue(baseResponseDto.getMessage());
                    return;
                }
            default:
                if (baseResponseDto.getSuccess()) {
                    Object data = baseResponseDto.getData();
                    if (data != null) {
                        JSONObject jSONObject3 = new JSONObject(new Gson().toJson(data));
                        rechargeWalletViewModel.D = jSONObject3.getString(PaymentConstants.ORDER_ID_CAMEL);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(PaymentConstants.PAYLOAD, jSONObject3);
                        jSONObject4.put("requestId", UUID.randomUUID().toString());
                        jSONObject4.put(PaymentConstants.SERVICE, "in.juspay.hyperpay");
                        String jSONObject5 = jSONObject4.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
                        Object[] objArr3 = new Object[0];
                        Intrinsics.checkNotNullParameter("RechargeWalletViewModel", "tag");
                        com.google.android.gms.internal.p002firebaseauthapi.a.g(jSONObject5, "s", objArr3, "params", "RechargeWalletViewModel").getClass();
                        u.k(objArr3);
                        rechargeWalletViewModel.f9718y.postValue(jSONObject4);
                        rechargeWalletViewModel.C = true;
                        return;
                    }
                    return;
                }
                if (baseResponseDto.getMessage().length() == 0) {
                    rechargeWalletViewModel.f9712s.postValue("Try again later");
                    return;
                } else {
                    rechargeWalletViewModel.f9712s.postValue(baseResponseDto.getMessage());
                    return;
                }
        }
    }
}
