package ej;

import ba.gp;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.remote.request.SubscriptionPlanPurchaseRequestDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import in.juspay.services.HyperServices;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPlanConfirmationFragment f15472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(SubscriptionPlanConfirmationFragment subscriptionPlanConfirmationFragment, int i10) {
        super(1);
        this.f15471a = i10;
        this.f15472b = subscriptionPlanConfirmationFragment;
    }

    public final void a(kj.j jVar) {
        int i10 = this.f15471a;
        int i11 = 1;
        SubscriptionPlanConfirmationFragment subscriptionPlanConfirmationFragment = this.f15472b;
        switch (i10) {
            case 0:
                SubscriptionPlanPurchaseRequestDto subscriptionPlanPurchaseRequestDto = (SubscriptionPlanPurchaseRequestDto) jVar.a();
                if (subscriptionPlanPurchaseRequestDto != null) {
                    androidx.navigation.t h10 = q6.l.h(subscriptionPlanConfirmationFragment);
                    String packageId = subscriptionPlanPurchaseRequestDto.getPackageId();
                    String pgRoute = subscriptionPlanPurchaseRequestDto.getPgRoute();
                    String transactionId = subscriptionPlanPurchaseRequestDto.getTransactionId();
                    boolean isMandateFlow = subscriptionPlanPurchaseRequestDto.getIsMandateFlow();
                    String mandateMessage = subscriptionPlanPurchaseRequestDto.getMandateMessage();
                    Intrinsics.checkNotNullParameter(packageId, "packageId");
                    Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
                    h10.o(new i0(packageId, pgRoute, transactionId, mandateMessage, isMandateFlow));
                    return;
                }
                return;
            case 1:
            case 6:
            default:
                Pair pair = (Pair) jVar.a();
                if (pair != null) {
                    if (((Boolean) pair.f23353a).booleanValue()) {
                        ((gp) subscriptionPlanConfirmationFragment.q()).f4846u.f27491e.setVisibility(0);
                        ((gp) subscriptionPlanConfirmationFragment.q()).F.setVisibility(8);
                        ((gp) subscriptionPlanConfirmationFragment.q()).B.setVisibility(8);
                        ((gp) subscriptionPlanConfirmationFragment.q()).f4846u.f4347s.setText((CharSequence) pair.f23354b);
                        return;
                    }
                    ((gp) subscriptionPlanConfirmationFragment.q()).f4846u.f27491e.setVisibility(8);
                    ((gp) subscriptionPlanConfirmationFragment.q()).F.setVisibility(0);
                    ((gp) subscriptionPlanConfirmationFragment.q()).B.setVisibility(0);
                    return;
                }
                return;
            case 2:
                k0 k0Var = (k0) jVar.a();
                if (k0Var != null) {
                    androidx.navigation.t h11 = q6.l.h(subscriptionPlanConfirmationFragment);
                    int i12 = SubscriptionPlanConfirmationFragment.f10549k;
                    g0 g0Var = (g0) subscriptionPlanConfirmationFragment.f10550g.getValue();
                    String str = k0Var.f15495a;
                    Intrinsics.checkNotNullParameter(str, "case");
                    String pgRoute2 = k0Var.f15496b;
                    Intrinsics.checkNotNullParameter(pgRoute2, "pgRoute");
                    String packageId2 = g0Var.f15476a;
                    Intrinsics.checkNotNullParameter(packageId2, "packageId");
                    h11.o(new h0(str, pgRoute2, packageId2));
                    return;
                }
                return;
            case 3:
                String str2 = (String) jVar.a();
                if (str2 != null) {
                    int i13 = r0.f15534d;
                    String string = subscriptionPlanConfirmationFragment.getString(R.string.proceed_to_payment);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    mt.p.A(str2, string).show(subscriptionPlanConfirmationFragment.getParentFragmentManager(), "SubscriptionUPIAutoPayPreConfirmation");
                    return;
                }
                return;
            case 4:
                JSONObject jSONObject = (JSONObject) jVar.a();
                if (jSONObject != null) {
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationFragment", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g("Final initiate payload:    " + jSONObject, "s", objArr, "params", "SubscriptionPlanConfirmationFragment").getClass();
                    ek.u.k(objArr);
                    HyperServices hyperServices = subscriptionPlanConfirmationFragment.f10551h;
                    if (hyperServices != null) {
                        hyperServices.initiate(jSONObject, new ag.f(subscriptionPlanConfirmationFragment, i11));
                        return;
                    } else {
                        Intrinsics.k("hyperInstance");
                        throw null;
                    }
                }
                return;
            case 5:
                JSONObject jSONObject2 = (JSONObject) jVar.a();
                if (jSONObject2 != null) {
                    int i14 = SubscriptionPlanConfirmationFragment.f10549k;
                    ((ManageSubscriptionViewModel) subscriptionPlanConfirmationFragment.f10553j.getValue()).f10497p = true;
                    ((SubscriptionPlanConfirmationViewModel) subscriptionPlanConfirmationFragment.r()).C.postValue(new kj.j(Boolean.TRUE));
                    HyperServices hyperServices2 = subscriptionPlanConfirmationFragment.f10551h;
                    if (hyperServices2 != null) {
                        if (hyperServices2.isInitialised()) {
                            HyperServices hyperServices3 = subscriptionPlanConfirmationFragment.f10551h;
                            if (hyperServices3 != null) {
                                hyperServices3.process(jSONObject2);
                                return;
                            } else {
                                Intrinsics.k("hyperInstance");
                                throw null;
                            }
                        }
                        com.kaopiz.kprogresshud.f fVar = subscriptionPlanConfirmationFragment.f17283a;
                        if (fVar != null) {
                            fVar.d();
                        }
                        el.l.H(2000L, new ad.f(16, subscriptionPlanConfirmationFragment, jSONObject2));
                        return;
                    }
                    Intrinsics.k("hyperInstance");
                    throw null;
                }
                return;
            case 7:
                if (((Unit) jVar.a()) != null) {
                    subscriptionPlanConfirmationFragment.y(new AnalyticEvent("app_sub_autopay_proceed", null, 2, null));
                    ((SubscriptionPlanConfirmationViewModel) subscriptionPlanConfirmationFragment.r()).i();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f15471a;
        SubscriptionPlanConfirmationFragment subscriptionPlanConfirmationFragment = this.f15472b;
        switch (i10) {
            case 0:
                a((kj.j) obj);
                return Unit.f23355a;
            case 1:
                SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse = (SubscriptionPlanConfirmationResponse) obj;
                if (((SubscriptionPlanConfirmationViewModel) subscriptionPlanConfirmationFragment.r()).E) {
                    gp gpVar = (gp) subscriptionPlanConfirmationFragment.q();
                    gpVar.L.setEnabled(subscriptionPlanConfirmationResponse.getUpiAutoPay().getEnabled());
                }
                return Unit.f23355a;
            case 2:
                a((kj.j) obj);
                return Unit.f23355a;
            case 3:
                a((kj.j) obj);
                return Unit.f23355a;
            case 4:
                a((kj.j) obj);
                return Unit.f23355a;
            case 5:
                a((kj.j) obj);
                return Unit.f23355a;
            case 6:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = subscriptionPlanConfirmationFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = subscriptionPlanConfirmationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 7:
                a((kj.j) obj);
                return Unit.f23355a;
            default:
                a((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
