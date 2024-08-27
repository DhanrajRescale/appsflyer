package fg;

import android.content.Intent;
import ba.x4;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawalDetailActivity f16089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(WithdrawalDetailActivity withdrawalDetailActivity, int i10) {
        super(1);
        this.f16088a = i10;
        this.f16089b = withdrawalDetailActivity;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f16088a;
        WithdrawalDetailActivity withdrawalDetailActivity = this.f16089b;
        switch (i10) {
            case 1:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = withdrawalDetailActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = withdrawalDetailActivity.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    int i11 = WithdrawalDetailActivity.f9757k;
                    withdrawalDetailActivity.getClass();
                    if (!WifiService.INSTANCE.getInstance().isOnline()) {
                        hl.f.S0(R.string.no_internet_connection, withdrawalDetailActivity);
                        return;
                    }
                    ((x4) withdrawalDetailActivity.w()).f6600s.setEnabled(false);
                    String str = ((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9767w;
                    if (Intrinsics.a(str, "TRANSFER_TO_PAYTM_WALLET")) {
                        WithdrawalDetailViewModel withdrawalDetailViewModel = (WithdrawalDetailViewModel) withdrawalDetailActivity.x();
                        double parseDouble = Double.parseDouble(((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9762r);
                        String phoneNumber = ((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9763s;
                        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                        withdrawalDetailViewModel.h(parseDouble, phoneNumber, "WALLET", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    if (Intrinsics.a(str, "TRANSFER_TO_UPI")) {
                        WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) withdrawalDetailActivity.x();
                        double parseDouble2 = Double.parseDouble(((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9762r);
                        String vpa = ((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9764t;
                        Intrinsics.checkNotNullParameter(vpa, "vpa");
                        withdrawalDetailViewModel2.h(parseDouble2, vpa, "UPI", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) withdrawalDetailActivity.x();
                    double parseDouble3 = Double.parseDouble(((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9762r);
                    String accountNumber = ((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9766v;
                    String bankIFSC = ((WithdrawalDetailViewModel) withdrawalDetailActivity.x()).f9765u;
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    Intrinsics.checkNotNullParameter(bankIFSC, "bankIFSC");
                    withdrawalDetailViewModel3.h(parseDouble3, accountNumber, "BANK", bankIFSC);
                    return;
                }
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f16088a;
        WithdrawalDetailActivity withdrawalDetailActivity = this.f16089b;
        switch (i10) {
            case 2:
                ((x4) withdrawalDetailActivity.w()).f6600s.setEnabled(true);
                Pair pair = (Pair) jVar.a();
                if (pair != null) {
                    int i11 = tf.b.f36008c;
                    String string = withdrawalDetailActivity.getString(R.string.ok);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    WithdrawPreCheckData data = new WithdrawPreCheckData(string, (String) pair.f23353a, ((Boolean) pair.f23354b).booleanValue());
                    Intrinsics.checkNotNullParameter(data, "data");
                    tf.b bVar = new tf.b();
                    bVar.setArguments(hl.f.y(new Pair("DATA", data)));
                    bVar.show(withdrawalDetailActivity.getSupportFragmentManager(), "MessageBottomSheet");
                    return;
                }
                return;
            case 3:
                tf.d dVar = (tf.d) jVar.a();
                if (dVar != null) {
                    ij.p pVar = dVar.f36011a;
                    if (!pVar.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4983u.setErrorText(pVar.f20087b);
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4983u.m();
                    }
                    ij.p pVar2 = dVar.f36012b;
                    if (!pVar2.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4982t.setErrorText(pVar2.f20087b);
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4982t.m();
                    }
                    ij.p pVar3 = dVar.f36013c;
                    if (!pVar3.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4984v.setErrorText(pVar3.f20087b);
                        return;
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6604w.f4984v.m();
                        return;
                    }
                }
                return;
            case 4:
                tf.f fVar = (tf.f) jVar.a();
                if (fVar != null) {
                    ij.p pVar4 = fVar.f36015a;
                    if (!pVar4.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6606y.f5407u.setErrorText(pVar4.f20087b);
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6606y.f5407u.m();
                    }
                    ij.p pVar5 = fVar.f36016b;
                    if (!pVar5.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6606y.f5406t.setErrorText(pVar5.f20087b);
                        return;
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6606y.f5406t.m();
                        return;
                    }
                }
                return;
            case 5:
                tf.g gVar = (tf.g) jVar.a();
                if (gVar != null) {
                    ij.p pVar6 = gVar.f36017a;
                    if (!pVar6.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6605x.f5184u.setErrorText(pVar6.f20087b);
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6605x.f5184u.m();
                    }
                    ij.p pVar7 = gVar.f36018b;
                    if (!pVar7.f20086a) {
                        ((x4) withdrawalDetailActivity.w()).f6605x.f5183t.setErrorText(pVar7.f20087b);
                        return;
                    } else {
                        ((x4) withdrawalDetailActivity.w()).f6605x.f5183t.m();
                        return;
                    }
                }
                return;
            default:
                d otpVerifyScreenDataWrapper = (d) jVar.a();
                if (otpVerifyScreenDataWrapper != null) {
                    int i12 = f.f16070k;
                    Intrinsics.checkNotNullParameter(otpVerifyScreenDataWrapper, "otpVerifyScreenDataWrapper");
                    f fVar2 = new f();
                    fVar2.setArguments(hl.f.y(new Pair("DATA", otpVerifyScreenDataWrapper)));
                    fVar2.show(withdrawalDetailActivity.getSupportFragmentManager(), "PaymentWithdrawalOTPVerifyBottomSheet");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16088a;
        WithdrawalDetailActivity withdrawalDetailActivity = this.f16089b;
        switch (i10) {
            case 0:
                tf.c cVar = (tf.c) obj;
                if (cVar.f36010a.f20086a) {
                    ((x4) withdrawalDetailActivity.w()).f6605x.f5184u.m();
                    ((x4) withdrawalDetailActivity.w()).f6600s.setEnabled(true);
                } else {
                    ((x4) withdrawalDetailActivity.w()).f6605x.f5184u.setErrorText(cVar.f36010a.f20087b);
                    ((x4) withdrawalDetailActivity.w()).f6600s.setEnabled(false);
                }
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                d((kj.j) obj);
                return Unit.f23355a;
            case 3:
                d((kj.j) obj);
                return Unit.f23355a;
            case 4:
                d((kj.j) obj);
                return Unit.f23355a;
            case 5:
                d((kj.j) obj);
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                double doubleValue = ((Number) ((Pair) obj).f23353a).doubleValue();
                String string = withdrawalDetailActivity.getString(R.string.available_withdrawable_cash_balance);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullExpressionValue(String.format(string, Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1)), "format(...)");
                return Unit.f23355a;
            case 8:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                withdrawalDetailActivity.getClass();
                withdrawalDetailActivity.setResult(-1, new Intent());
                withdrawalDetailActivity.finish();
                return Unit.f23355a;
        }
    }
}
