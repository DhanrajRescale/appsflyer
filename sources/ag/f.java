package ag;

import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationFragment;
import ek.u;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends HyperPaymentsCallbackAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f414b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f413a = i10;
        this.f414b = obj;
    }

    @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
    public final void onEvent(JSONObject data, JuspayResponseHandler handler) {
        com.kaopiz.kprogresshud.f fVar;
        com.kaopiz.kprogresshud.f fVar2;
        com.kaopiz.kprogresshud.f fVar3;
        com.kaopiz.kprogresshud.f fVar4;
        int i10 = this.f413a;
        Object obj = this.f414b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(handler, "handler");
                try {
                    String s7 = "Final initiate output:" + data;
                    Object[] params = new Object[0];
                    Intrinsics.checkNotNullParameter("RechargeWalletActivity", "tag");
                    Intrinsics.checkNotNullParameter(s7, "s");
                    Intrinsics.checkNotNullParameter(params, "params");
                    qv.a.b("RechargeWalletActivity").getClass();
                    u.k(params);
                    String string = data.getString("event");
                    if (string != null) {
                        switch (string.hashCode()) {
                            case -174112336:
                                if (string.equals("hide_loader") && (fVar = ((RechargeWalletActivity) obj).f17255c) != null) {
                                    fVar.b();
                                    return;
                                }
                                return;
                            case 24468461:
                                if (string.equals("process_result")) {
                                    com.kaopiz.kprogresshud.f fVar5 = ((RechargeWalletActivity) obj).f17255c;
                                    if (fVar5 != null) {
                                        fVar5.b();
                                    }
                                    RechargeWalletActivity.K((RechargeWalletActivity) obj, data);
                                    return;
                                }
                                return;
                            case 334457749:
                                if (string.equals("show_loader") && (fVar2 = ((RechargeWalletActivity) obj).f17255c) != null) {
                                    fVar2.d();
                                    return;
                                }
                                return;
                            case 1858061443:
                                if (string.equals("initiate_result")) {
                                    com.kaopiz.kprogresshud.f fVar6 = ((RechargeWalletActivity) obj).f17255c;
                                    if (fVar6 != null) {
                                        fVar6.b();
                                    }
                                    String s10 = "Final initiate_result :" + data.optJSONObject(PaymentConstants.PAYLOAD);
                                    Object[] params2 = new Object[0];
                                    Intrinsics.checkNotNullParameter("RechargeWalletActivity", "tag");
                                    Intrinsics.checkNotNullParameter(s10, "s");
                                    Intrinsics.checkNotNullParameter(params2, "params");
                                    qv.a.b("RechargeWalletActivity").getClass();
                                    u.k(params2);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(handler, "handler");
                try {
                    String s11 = "Final initiate output:" + data;
                    Object[] params3 = new Object[0];
                    Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationFragment", "tag");
                    Intrinsics.checkNotNullParameter(s11, "s");
                    Intrinsics.checkNotNullParameter(params3, "params");
                    qv.a.b("SubscriptionPlanConfirmationFragment").getClass();
                    u.k(params3);
                    String string2 = data.getString("event");
                    if (string2 != null) {
                        switch (string2.hashCode()) {
                            case -174112336:
                                if (string2.equals("hide_loader") && (fVar3 = ((SubscriptionPlanConfirmationFragment) obj).f17283a) != null) {
                                    fVar3.b();
                                    return;
                                }
                                return;
                            case 24468461:
                                if (string2.equals("process_result")) {
                                    com.kaopiz.kprogresshud.f fVar7 = ((SubscriptionPlanConfirmationFragment) obj).f17283a;
                                    if (fVar7 != null) {
                                        fVar7.b();
                                    }
                                    SubscriptionPlanConfirmationFragment.H((SubscriptionPlanConfirmationFragment) obj, data);
                                    return;
                                }
                                return;
                            case 334457749:
                                if (string2.equals("show_loader") && (fVar4 = ((SubscriptionPlanConfirmationFragment) obj).f17283a) != null) {
                                    fVar4.d();
                                    return;
                                }
                                return;
                            case 1858061443:
                                if (string2.equals("initiate_result")) {
                                    com.kaopiz.kprogresshud.f fVar8 = ((SubscriptionPlanConfirmationFragment) obj).f17283a;
                                    if (fVar8 != null) {
                                        fVar8.b();
                                    }
                                    String s12 = "Final initiate_result :" + data.optJSONObject(PaymentConstants.PAYLOAD);
                                    Object[] params4 = new Object[0];
                                    Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationFragment", "tag");
                                    Intrinsics.checkNotNullParameter(s12, "s");
                                    Intrinsics.checkNotNullParameter(params4, "params");
                                    qv.a.b("SubscriptionPlanConfirmationFragment").getClass();
                                    u.k(params4);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
        }
    }
}
