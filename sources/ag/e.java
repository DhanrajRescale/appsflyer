package ag;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.f3;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.PaymentCallbackDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import ek.u;
import el.l;
import ij.p;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.k;
import java.util.HashMap;
import kj.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RechargeWalletActivity f412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RechargeWalletActivity rechargeWalletActivity, int i10) {
        super(1);
        this.f411a = i10;
        this.f412b = rechargeWalletActivity;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f411a;
        RechargeWalletActivity rechargeWalletActivity = this.f412b;
        switch (i10) {
            case 3:
                ((f3) rechargeWalletActivity.w()).f4658s.performClick();
                return;
            case 4:
                rechargeWalletActivity.finish();
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = rechargeWalletActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = rechargeWalletActivity.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void d(j jVar) {
        int i10 = this.f411a;
        RechargeWalletActivity rechargeWalletActivity = this.f412b;
        switch (i10) {
            case 1:
                rechargeWalletActivity.onBackPressed();
                return;
            case 2:
                tf.e eVar = (tf.e) jVar.a();
                if (eVar != null) {
                    p pVar = eVar.f36014a;
                    if (!pVar.f20086a) {
                        ((f3) rechargeWalletActivity.w()).f4662w.setErrorText(pVar.f20087b);
                        return;
                    } else {
                        ((f3) rechargeWalletActivity.w()).f4662w.m();
                        return;
                    }
                }
                return;
            case 8:
                JSONObject jSONObject = (JSONObject) jVar.a();
                if (jSONObject != null) {
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("RechargeWalletActivity", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g("Final initiate payload:    " + jSONObject, "s", objArr, "params", "RechargeWalletActivity").getClass();
                    u.k(objArr);
                    rechargeWalletActivity.L().initiate(jSONObject, new f(rechargeWalletActivity, 0));
                    return;
                }
                return;
            default:
                com.kaopiz.kprogresshud.f fVar = rechargeWalletActivity.f17255c;
                if (fVar != null) {
                    fVar.b();
                }
                Pair pair = (Pair) jVar.a();
                if (pair != null) {
                    String str = (String) pair.f23354b;
                    if (Intrinsics.a(str, "backpressed")) {
                        String string = rechargeWalletActivity.getResources().getString(R.string.transaction_aborted);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        rechargeWalletActivity.N("CANCELED", string);
                        return;
                    } else {
                        if (Intrinsics.a(str, "charged")) {
                            String string2 = rechargeWalletActivity.getResources().getString(R.string.payment_success);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            rechargeWalletActivity.N("TXN_SUCCESS", string2);
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f411a;
        RechargeWalletActivity context = this.f412b;
        switch (i10) {
            case 0:
                String text = (String) obj;
                com.kaopiz.kprogresshud.f fVar = context.f17255c;
                if (fVar != null) {
                    fVar.b();
                }
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            case 1:
                d((j) obj);
                return Unit.f23355a;
            case 2:
                d((j) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                PaymentCallbackDto paymentCallbackDto = (PaymentCallbackDto) baseResponseDto.getData();
                if (paymentCallbackDto != null) {
                    boolean success = baseResponseDto.getSuccess();
                    int i11 = RechargeWalletActivity.f9705l;
                    if (success) {
                        if (((RechargeWalletViewModel) context.x()).f9711r) {
                            Intent intent = new Intent();
                            intent.putExtra("PAYMENT_RESPONSE_STATUS", "TXN_SUCCESS");
                            intent.putExtra("PAYMENT_RESPONSE_MESSAGE", context.getResources().getString(R.string.payment_success));
                            Unit unit = Unit.f23355a;
                            context.setResult(-1, intent);
                            context.finish();
                        } else {
                            String string = context.getResources().getString(R.string.payment_success);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            context.N("TXN_SUCCESS", string);
                        }
                    } else {
                        context.getClass();
                        if (Intrinsics.a(paymentCallbackDto.getStatus(), "PENDING")) {
                            String string2 = context.getResources().getString(R.string.payment_pending);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            context.N("PENDING", string2);
                        } else {
                            String string3 = context.getResources().getString(R.string.payment_failure);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            context.N("TXN_FAILED", string3);
                        }
                    }
                }
                return Unit.f23355a;
            case 7:
                String string4 = context.getString(R.string.payment_add_message);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String m10 = a3.a.m(new Object[]{String.valueOf(((ConfigDto) obj).getCommonConfig().getPayments().getAddTransactionLimit().getMin())}, 1, string4, "format(...)");
                TextView textView = ((f3) context.w()).f4665z;
                textView.setVisibility(0);
                textView.setText(m10);
                return Unit.f23355a;
            case 8:
                d((j) obj);
                return Unit.f23355a;
            case 9:
                JSONObject jSONObject = (JSONObject) obj;
                if (context.L().isInitialised()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(PaymentConstants.AMOUNT, ((RechargeWalletViewModel) context.x()).f9716w);
                    hashMap.put("uuid", String.valueOf(((RechargeWalletViewModel) context.x()).f9708o.uuid()));
                    AnalyticEvent analyticEvent = new AnalyticEvent("add_money_initiated", p0.f(new Pair(PaymentConstants.AMOUNT, ((RechargeWalletViewModel) context.x()).f9716w)));
                    context.A(analyticEvent);
                    context.D(analyticEvent);
                    context.L().process(jSONObject);
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = context.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                    l.H(2000L, new ad.f(13, context, jSONObject));
                }
                return Unit.f23355a;
            default:
                d((j) obj);
                return Unit.f23355a;
        }
    }
}
