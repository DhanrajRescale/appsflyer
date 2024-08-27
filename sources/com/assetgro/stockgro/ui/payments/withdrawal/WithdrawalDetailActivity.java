package com.assetgro.stockgro.ui.payments.withdrawal;

import ab.g;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import ba.x4;
import ba.y4;
import ca.c;
import com.assetgro.stockgro.data.remote.response.CommonConfig;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.data.remote.response.Limit;
import com.assetgro.stockgro.data.remote.response.PaymentConfig;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.t;
import eb.f;
import fg.n;
import gd.b;
import iu.a0;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import kotlin.text.y;
import kq.e;
import ls.n0;
import mt.p;
import okhttp3.HttpUrl;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/WithdrawalDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/withdrawal/WithdrawalDetailViewModel;", "Lba/x4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WithdrawalDetailActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9757k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_withdrawal_details;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((WithdrawalDetailViewModel) x()).f9084g.observe(this, new v(5, new n(this, 1)));
        ((WithdrawalDetailViewModel) x()).D.observe(this, new v(5, new n(this, 2)));
        ((WithdrawalDetailViewModel) x()).f9768x.observe(this, new v(5, new n(this, 3)));
        ((WithdrawalDetailViewModel) x()).f9769y.observe(this, new v(5, new n(this, 4)));
        ((WithdrawalDetailViewModel) x()).f9770z.observe(this, new v(5, new n(this, 5)));
        ((WithdrawalDetailViewModel) x()).f9761q.observe(this, new v(5, new n(this, 6)));
        ((WithdrawalDetailViewModel) x()).B.observe(this, new v(5, new n(this, 7)));
        ((WithdrawalDetailViewModel) x()).F.observe(this, new v(5, new n(this, 8)));
        ((WithdrawalDetailViewModel) x()).G.observe(this, new v(5, new n(this, 9)));
        ((WithdrawalDetailViewModel) x()).A.observe(this, new v(5, new n(this, 0)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        y4 y4Var = (y4) ((x4) w());
        y4Var.E = (WithdrawalDetailViewModel) x();
        synchronized (y4Var) {
            y4Var.F |= 32;
        }
        y4Var.a(24);
        y4Var.m();
        ((x4) w()).p(this);
        WithdrawalDetailViewModel withdrawalDetailViewModel = (WithdrawalDetailViewModel) x();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString("WITHDRAWAL_TRANSFER_MODE");
        } else {
            str = null;
        }
        if (str == null) {
            str = "TRANSFER_TO_BANK";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        withdrawalDetailViewModel.f9767w = str;
        String str2 = ((WithdrawalDetailViewModel) x()).f9767w;
        final int i10 = 0;
        if (Intrinsics.a(str2, "TRANSFER_TO_PAYTM_WALLET")) {
            ((x4) w()).f6607z.setTitle(getString(R.string.text_paytem_wallet));
            this.f17260h = "wallet-paytm-withdraw-request";
            ((x4) w()).f6604w.f4981s.setVisibility(8);
            ((x4) w()).f6605x.f5182s.setVisibility(0);
            ((x4) w()).f6606y.f5405s.setVisibility(8);
            ((x4) w()).A.f6692v.setText(getString(R.string.text_transfer_to_paytm));
        } else if (Intrinsics.a(str2, "TRANSFER_TO_UPI")) {
            ((x4) w()).f6607z.setTitle(getString(R.string.upi));
            this.f17260h = "wallet-upi-withdraw-request";
            ((x4) w()).f6604w.f4981s.setVisibility(8);
            ((x4) w()).f6605x.f5182s.setVisibility(8);
            ((x4) w()).f6606y.f5405s.setVisibility(0);
            ((x4) w()).A.f6692v.setText(getString(R.string.text_transfer_to_upi));
        } else {
            ((x4) w()).f6607z.setTitle(getString(R.string.text_bank_details));
            this.f17260h = "wallet-bank-withdraw-request";
            ((x4) w()).f6604w.f4981s.setVisibility(0);
            ((x4) w()).f6605x.f5182s.setVisibility(8);
            ((x4) w()).f6606y.f5405s.setVisibility(8);
            ((x4) w()).A.f6692v.setText(getString(R.string.text_transfer_to_bank));
        }
        Toolbar toolbar = ((x4) w()).f6607z;
        u(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: fg.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalDetailActivity f16087b;

            {
                this.f16087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij.p pVar;
                ij.p pVar2;
                ConfigDto configDto;
                CommonConfig commonConfig;
                PaymentConfig payments;
                ij.p pVar3;
                ij.p pVar4;
                ConfigDto configDto2;
                CommonConfig commonConfig2;
                PaymentConfig payments2;
                ij.p pVar5;
                ConfigDto configDto3;
                CommonConfig commonConfig3;
                PaymentConfig payments3;
                int i11 = i10;
                WithdrawalDetailActivity this$0 = this.f16087b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0, new Intent());
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x4) this$0.w()).B.performClick();
                        return;
                    case 2:
                        int i14 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.c(view);
                        Object systemService = this$0.getSystemService("input_method");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        String str3 = ((WithdrawalDetailViewModel) this$0.x()).f9767w;
                        double d10 = 0.0d;
                        Limit limit = null;
                        String str4 = "0";
                        if (Intrinsics.a(str3, "TRANSFER_TO_PAYTM_WALLET")) {
                            String inputValue = ((x4) this$0.w()).f6605x.f5184u.getInputValue();
                            if (inputValue.length() != 0) {
                                str4 = inputValue;
                            }
                            String phoneNumber = s.n(((x4) this$0.w()).f6605x.f5183t.getInputValue(), ((WithdrawalDetailViewModel) this$0.x()).f9081d.getCountryPrefix() + " ", HttpUrl.FRAGMENT_ENCODE_SET, false);
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            String b02 = y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var = withdrawalDetailViewModel2.B;
                            Pair pair = (Pair) e0Var.getValue();
                            if (pair != null && (configDto3 = (ConfigDto) pair.f23354b) != null && (commonConfig3 = configDto3.getCommonConfig()) != null && (payments3 = commonConfig3.getPayments()) != null) {
                                limit = payments3.getTransactionLimit();
                            }
                            Pair pair2 = (Pair) e0Var.getValue();
                            if (pair2 != null) {
                                d10 = ((Number) pair2.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel2.f9759o.getClass();
                            ij.p H = mt.p.H(valueOf, limit, d10);
                            if (b02 != null && b02.length() != 0) {
                                if (TextUtils.isDigitsOnly(b02) && b02.length() == 10) {
                                    pVar5 = new ij.p();
                                } else {
                                    pVar5 = new ij.p(R.string.mobile_number_invalid, false);
                                }
                            } else {
                                pVar5 = new ij.p(R.string.mobile_number_empty, false);
                            }
                            withdrawalDetailViewModel2.f9770z.postValue(new kj.j(new tf.g(H, pVar5)));
                            if (H.f20086a && pVar5.f20086a) {
                                WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                withdrawalDetailViewModel3.f9762r = str4;
                                WithdrawalDetailViewModel withdrawalDetailViewModel4 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(b02, "<set-?>");
                                withdrawalDetailViewModel4.f9763s = b02;
                                try {
                                    int i15 = uf.b.f37160j;
                                    Bundle bundle = new Bundle();
                                    uf.b bVar = new uf.b();
                                    bVar.setArguments(bundle);
                                    bVar.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                    return;
                                } catch (Exception e10) {
                                    FirebaseCrashlytics.getInstance().recordException(e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.a(str3, "TRANSFER_TO_UPI")) {
                            String inputValue2 = ((x4) this$0.w()).f6606y.f5407u.getInputValue();
                            if (inputValue2.length() != 0) {
                                str4 = inputValue2;
                            }
                            String inputValue3 = ((x4) this$0.w()).f6606y.f5406t.getInputValue();
                            WithdrawalDetailViewModel withdrawalDetailViewModel5 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf2 = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var2 = withdrawalDetailViewModel5.B;
                            Pair pair3 = (Pair) e0Var2.getValue();
                            if (pair3 != null && (configDto2 = (ConfigDto) pair3.f23354b) != null && (commonConfig2 = configDto2.getCommonConfig()) != null && (payments2 = commonConfig2.getPayments()) != null) {
                                limit = payments2.getTransactionLimit();
                            }
                            Pair pair4 = (Pair) e0Var2.getValue();
                            if (pair4 != null) {
                                d10 = ((Number) pair4.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel5.f9759o.getClass();
                            ij.p H2 = mt.p.H(valueOf2, limit, d10);
                            if (inputValue3 != null && inputValue3.length() != 0) {
                                Intrinsics.checkNotNullParameter(inputValue3, "<this>");
                                if (inputValue3.length() != 0) {
                                    if (inputValue3.charAt(0) != '@' && y.Z(inputValue3) != '@' && w.s(inputValue3, "@", false)) {
                                        pVar4 = new ij.p();
                                        withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                                        if (!H2.f20086a && pVar4.f20086a) {
                                            WithdrawalDetailViewModel withdrawalDetailViewModel6 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                            withdrawalDetailViewModel6.f9762r = str4;
                                            WithdrawalDetailViewModel withdrawalDetailViewModel7 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(inputValue3, "<set-?>");
                                            withdrawalDetailViewModel7.f9764t = inputValue3;
                                            try {
                                                int i16 = uf.b.f37160j;
                                                Bundle bundle2 = new Bundle();
                                                uf.b bVar2 = new uf.b();
                                                bVar2.setArguments(bundle2);
                                                bVar2.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                                return;
                                            } catch (Exception e11) {
                                                FirebaseCrashlytics.getInstance().recordException(e11);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    pVar3 = new ij.p(R.string.upi_id_invalid, false);
                                } else {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                            } else {
                                pVar3 = new ij.p(R.string.upi_id_empty, false);
                            }
                            pVar4 = pVar3;
                            withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                            if (!H2.f20086a) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (((x4) this$0.w()).f6604w.f4983u.getInputValue().length() != 0) {
                            str4 = ((x4) this$0.w()).f6604w.f4983u.getInputValue();
                        }
                        String inputValue4 = ((x4) this$0.w()).f6604w.f4982t.getInputValue();
                        String inputValue5 = ((x4) this$0.w()).f6604w.f4984v.getInputValue();
                        WithdrawalDetailViewModel withdrawalDetailViewModel8 = (WithdrawalDetailViewModel) this$0.x();
                        Double valueOf3 = Double.valueOf(Double.parseDouble(str4));
                        e0 e0Var3 = withdrawalDetailViewModel8.B;
                        Pair pair5 = (Pair) e0Var3.getValue();
                        if (pair5 != null && (configDto = (ConfigDto) pair5.f23354b) != null && (commonConfig = configDto.getCommonConfig()) != null && (payments = commonConfig.getPayments()) != null) {
                            limit = payments.getTransactionLimit();
                        }
                        Pair pair6 = (Pair) e0Var3.getValue();
                        if (pair6 != null) {
                            d10 = ((Number) pair6.f23353a).doubleValue();
                        }
                        withdrawalDetailViewModel8.f9759o.getClass();
                        ij.p H3 = mt.p.H(valueOf3, limit, d10);
                        if (inputValue4 != null && inputValue4.length() != 0) {
                            pVar = new ij.p();
                        } else {
                            pVar = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        if (inputValue5 != null && inputValue5.length() != 0) {
                            pVar2 = new ij.p();
                        } else {
                            pVar2 = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        withdrawalDetailViewModel8.f9768x.postValue(new kj.j(new tf.d(H3, pVar, pVar2)));
                        if (H3.f20086a && pVar.f20086a && pVar2.f20086a) {
                            WithdrawalDetailViewModel withdrawalDetailViewModel9 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                            withdrawalDetailViewModel9.f9762r = str4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel10 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue4, "<set-?>");
                            withdrawalDetailViewModel10.f9766v = inputValue4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel11 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue5, "<set-?>");
                            withdrawalDetailViewModel11.f9765u = inputValue5;
                            try {
                                int i17 = uf.b.f37160j;
                                Bundle bundle3 = new Bundle();
                                uf.b bVar3 = new uf.b();
                                bVar3.setArguments(bundle3);
                                bVar3.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                return;
                            } catch (Exception e12) {
                                FirebaseCrashlytics.getInstance().recordException(e12);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i18 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.setResult(-1, new Intent());
                        this$0.finish();
                        return;
                    default:
                        int i19 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) WithdrawableLimitActivity.class));
                        return;
                }
            }
        });
        v(toolbar);
        final int i11 = 4;
        ((x4) w()).B.setOnCheckedChangeListener(new g(this, i11));
        final int i12 = 1;
        ((x4) w()).D.setOnClickListener(new View.OnClickListener(this) { // from class: fg.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalDetailActivity f16087b;

            {
                this.f16087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij.p pVar;
                ij.p pVar2;
                ConfigDto configDto;
                CommonConfig commonConfig;
                PaymentConfig payments;
                ij.p pVar3;
                ij.p pVar4;
                ConfigDto configDto2;
                CommonConfig commonConfig2;
                PaymentConfig payments2;
                ij.p pVar5;
                ConfigDto configDto3;
                CommonConfig commonConfig3;
                PaymentConfig payments3;
                int i112 = i12;
                WithdrawalDetailActivity this$0 = this.f16087b;
                switch (i112) {
                    case 0:
                        int i122 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0, new Intent());
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x4) this$0.w()).B.performClick();
                        return;
                    case 2:
                        int i14 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.c(view);
                        Object systemService = this$0.getSystemService("input_method");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        String str3 = ((WithdrawalDetailViewModel) this$0.x()).f9767w;
                        double d10 = 0.0d;
                        Limit limit = null;
                        String str4 = "0";
                        if (Intrinsics.a(str3, "TRANSFER_TO_PAYTM_WALLET")) {
                            String inputValue = ((x4) this$0.w()).f6605x.f5184u.getInputValue();
                            if (inputValue.length() != 0) {
                                str4 = inputValue;
                            }
                            String phoneNumber = s.n(((x4) this$0.w()).f6605x.f5183t.getInputValue(), ((WithdrawalDetailViewModel) this$0.x()).f9081d.getCountryPrefix() + " ", HttpUrl.FRAGMENT_ENCODE_SET, false);
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            String b02 = y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var = withdrawalDetailViewModel2.B;
                            Pair pair = (Pair) e0Var.getValue();
                            if (pair != null && (configDto3 = (ConfigDto) pair.f23354b) != null && (commonConfig3 = configDto3.getCommonConfig()) != null && (payments3 = commonConfig3.getPayments()) != null) {
                                limit = payments3.getTransactionLimit();
                            }
                            Pair pair2 = (Pair) e0Var.getValue();
                            if (pair2 != null) {
                                d10 = ((Number) pair2.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel2.f9759o.getClass();
                            ij.p H = mt.p.H(valueOf, limit, d10);
                            if (b02 != null && b02.length() != 0) {
                                if (TextUtils.isDigitsOnly(b02) && b02.length() == 10) {
                                    pVar5 = new ij.p();
                                } else {
                                    pVar5 = new ij.p(R.string.mobile_number_invalid, false);
                                }
                            } else {
                                pVar5 = new ij.p(R.string.mobile_number_empty, false);
                            }
                            withdrawalDetailViewModel2.f9770z.postValue(new kj.j(new tf.g(H, pVar5)));
                            if (H.f20086a && pVar5.f20086a) {
                                WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                withdrawalDetailViewModel3.f9762r = str4;
                                WithdrawalDetailViewModel withdrawalDetailViewModel4 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(b02, "<set-?>");
                                withdrawalDetailViewModel4.f9763s = b02;
                                try {
                                    int i15 = uf.b.f37160j;
                                    Bundle bundle = new Bundle();
                                    uf.b bVar = new uf.b();
                                    bVar.setArguments(bundle);
                                    bVar.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                    return;
                                } catch (Exception e10) {
                                    FirebaseCrashlytics.getInstance().recordException(e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.a(str3, "TRANSFER_TO_UPI")) {
                            String inputValue2 = ((x4) this$0.w()).f6606y.f5407u.getInputValue();
                            if (inputValue2.length() != 0) {
                                str4 = inputValue2;
                            }
                            String inputValue3 = ((x4) this$0.w()).f6606y.f5406t.getInputValue();
                            WithdrawalDetailViewModel withdrawalDetailViewModel5 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf2 = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var2 = withdrawalDetailViewModel5.B;
                            Pair pair3 = (Pair) e0Var2.getValue();
                            if (pair3 != null && (configDto2 = (ConfigDto) pair3.f23354b) != null && (commonConfig2 = configDto2.getCommonConfig()) != null && (payments2 = commonConfig2.getPayments()) != null) {
                                limit = payments2.getTransactionLimit();
                            }
                            Pair pair4 = (Pair) e0Var2.getValue();
                            if (pair4 != null) {
                                d10 = ((Number) pair4.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel5.f9759o.getClass();
                            ij.p H2 = mt.p.H(valueOf2, limit, d10);
                            if (inputValue3 != null && inputValue3.length() != 0) {
                                Intrinsics.checkNotNullParameter(inputValue3, "<this>");
                                if (inputValue3.length() != 0) {
                                    if (inputValue3.charAt(0) != '@' && y.Z(inputValue3) != '@' && w.s(inputValue3, "@", false)) {
                                        pVar4 = new ij.p();
                                        withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                                        if (!H2.f20086a && pVar4.f20086a) {
                                            WithdrawalDetailViewModel withdrawalDetailViewModel6 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                            withdrawalDetailViewModel6.f9762r = str4;
                                            WithdrawalDetailViewModel withdrawalDetailViewModel7 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(inputValue3, "<set-?>");
                                            withdrawalDetailViewModel7.f9764t = inputValue3;
                                            try {
                                                int i16 = uf.b.f37160j;
                                                Bundle bundle2 = new Bundle();
                                                uf.b bVar2 = new uf.b();
                                                bVar2.setArguments(bundle2);
                                                bVar2.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                                return;
                                            } catch (Exception e11) {
                                                FirebaseCrashlytics.getInstance().recordException(e11);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    pVar3 = new ij.p(R.string.upi_id_invalid, false);
                                } else {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                            } else {
                                pVar3 = new ij.p(R.string.upi_id_empty, false);
                            }
                            pVar4 = pVar3;
                            withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                            if (!H2.f20086a) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (((x4) this$0.w()).f6604w.f4983u.getInputValue().length() != 0) {
                            str4 = ((x4) this$0.w()).f6604w.f4983u.getInputValue();
                        }
                        String inputValue4 = ((x4) this$0.w()).f6604w.f4982t.getInputValue();
                        String inputValue5 = ((x4) this$0.w()).f6604w.f4984v.getInputValue();
                        WithdrawalDetailViewModel withdrawalDetailViewModel8 = (WithdrawalDetailViewModel) this$0.x();
                        Double valueOf3 = Double.valueOf(Double.parseDouble(str4));
                        e0 e0Var3 = withdrawalDetailViewModel8.B;
                        Pair pair5 = (Pair) e0Var3.getValue();
                        if (pair5 != null && (configDto = (ConfigDto) pair5.f23354b) != null && (commonConfig = configDto.getCommonConfig()) != null && (payments = commonConfig.getPayments()) != null) {
                            limit = payments.getTransactionLimit();
                        }
                        Pair pair6 = (Pair) e0Var3.getValue();
                        if (pair6 != null) {
                            d10 = ((Number) pair6.f23353a).doubleValue();
                        }
                        withdrawalDetailViewModel8.f9759o.getClass();
                        ij.p H3 = mt.p.H(valueOf3, limit, d10);
                        if (inputValue4 != null && inputValue4.length() != 0) {
                            pVar = new ij.p();
                        } else {
                            pVar = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        if (inputValue5 != null && inputValue5.length() != 0) {
                            pVar2 = new ij.p();
                        } else {
                            pVar2 = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        withdrawalDetailViewModel8.f9768x.postValue(new kj.j(new tf.d(H3, pVar, pVar2)));
                        if (H3.f20086a && pVar.f20086a && pVar2.f20086a) {
                            WithdrawalDetailViewModel withdrawalDetailViewModel9 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                            withdrawalDetailViewModel9.f9762r = str4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel10 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue4, "<set-?>");
                            withdrawalDetailViewModel10.f9766v = inputValue4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel11 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue5, "<set-?>");
                            withdrawalDetailViewModel11.f9765u = inputValue5;
                            try {
                                int i17 = uf.b.f37160j;
                                Bundle bundle3 = new Bundle();
                                uf.b bVar3 = new uf.b();
                                bVar3.setArguments(bundle3);
                                bVar3.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                return;
                            } catch (Exception e12) {
                                FirebaseCrashlytics.getInstance().recordException(e12);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i18 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.setResult(-1, new Intent());
                        this$0.finish();
                        return;
                    default:
                        int i19 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) WithdrawableLimitActivity.class));
                        return;
                }
            }
        });
        final int i13 = 2;
        ((x4) w()).f6600s.setOnClickListener(new View.OnClickListener(this) { // from class: fg.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalDetailActivity f16087b;

            {
                this.f16087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij.p pVar;
                ij.p pVar2;
                ConfigDto configDto;
                CommonConfig commonConfig;
                PaymentConfig payments;
                ij.p pVar3;
                ij.p pVar4;
                ConfigDto configDto2;
                CommonConfig commonConfig2;
                PaymentConfig payments2;
                ij.p pVar5;
                ConfigDto configDto3;
                CommonConfig commonConfig3;
                PaymentConfig payments3;
                int i112 = i13;
                WithdrawalDetailActivity this$0 = this.f16087b;
                switch (i112) {
                    case 0:
                        int i122 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0, new Intent());
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x4) this$0.w()).B.performClick();
                        return;
                    case 2:
                        int i14 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.c(view);
                        Object systemService = this$0.getSystemService("input_method");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        String str3 = ((WithdrawalDetailViewModel) this$0.x()).f9767w;
                        double d10 = 0.0d;
                        Limit limit = null;
                        String str4 = "0";
                        if (Intrinsics.a(str3, "TRANSFER_TO_PAYTM_WALLET")) {
                            String inputValue = ((x4) this$0.w()).f6605x.f5184u.getInputValue();
                            if (inputValue.length() != 0) {
                                str4 = inputValue;
                            }
                            String phoneNumber = s.n(((x4) this$0.w()).f6605x.f5183t.getInputValue(), ((WithdrawalDetailViewModel) this$0.x()).f9081d.getCountryPrefix() + " ", HttpUrl.FRAGMENT_ENCODE_SET, false);
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            String b02 = y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var = withdrawalDetailViewModel2.B;
                            Pair pair = (Pair) e0Var.getValue();
                            if (pair != null && (configDto3 = (ConfigDto) pair.f23354b) != null && (commonConfig3 = configDto3.getCommonConfig()) != null && (payments3 = commonConfig3.getPayments()) != null) {
                                limit = payments3.getTransactionLimit();
                            }
                            Pair pair2 = (Pair) e0Var.getValue();
                            if (pair2 != null) {
                                d10 = ((Number) pair2.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel2.f9759o.getClass();
                            ij.p H = mt.p.H(valueOf, limit, d10);
                            if (b02 != null && b02.length() != 0) {
                                if (TextUtils.isDigitsOnly(b02) && b02.length() == 10) {
                                    pVar5 = new ij.p();
                                } else {
                                    pVar5 = new ij.p(R.string.mobile_number_invalid, false);
                                }
                            } else {
                                pVar5 = new ij.p(R.string.mobile_number_empty, false);
                            }
                            withdrawalDetailViewModel2.f9770z.postValue(new kj.j(new tf.g(H, pVar5)));
                            if (H.f20086a && pVar5.f20086a) {
                                WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                withdrawalDetailViewModel3.f9762r = str4;
                                WithdrawalDetailViewModel withdrawalDetailViewModel4 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(b02, "<set-?>");
                                withdrawalDetailViewModel4.f9763s = b02;
                                try {
                                    int i15 = uf.b.f37160j;
                                    Bundle bundle = new Bundle();
                                    uf.b bVar = new uf.b();
                                    bVar.setArguments(bundle);
                                    bVar.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                    return;
                                } catch (Exception e10) {
                                    FirebaseCrashlytics.getInstance().recordException(e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.a(str3, "TRANSFER_TO_UPI")) {
                            String inputValue2 = ((x4) this$0.w()).f6606y.f5407u.getInputValue();
                            if (inputValue2.length() != 0) {
                                str4 = inputValue2;
                            }
                            String inputValue3 = ((x4) this$0.w()).f6606y.f5406t.getInputValue();
                            WithdrawalDetailViewModel withdrawalDetailViewModel5 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf2 = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var2 = withdrawalDetailViewModel5.B;
                            Pair pair3 = (Pair) e0Var2.getValue();
                            if (pair3 != null && (configDto2 = (ConfigDto) pair3.f23354b) != null && (commonConfig2 = configDto2.getCommonConfig()) != null && (payments2 = commonConfig2.getPayments()) != null) {
                                limit = payments2.getTransactionLimit();
                            }
                            Pair pair4 = (Pair) e0Var2.getValue();
                            if (pair4 != null) {
                                d10 = ((Number) pair4.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel5.f9759o.getClass();
                            ij.p H2 = mt.p.H(valueOf2, limit, d10);
                            if (inputValue3 != null && inputValue3.length() != 0) {
                                Intrinsics.checkNotNullParameter(inputValue3, "<this>");
                                if (inputValue3.length() != 0) {
                                    if (inputValue3.charAt(0) != '@' && y.Z(inputValue3) != '@' && w.s(inputValue3, "@", false)) {
                                        pVar4 = new ij.p();
                                        withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                                        if (!H2.f20086a && pVar4.f20086a) {
                                            WithdrawalDetailViewModel withdrawalDetailViewModel6 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                            withdrawalDetailViewModel6.f9762r = str4;
                                            WithdrawalDetailViewModel withdrawalDetailViewModel7 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(inputValue3, "<set-?>");
                                            withdrawalDetailViewModel7.f9764t = inputValue3;
                                            try {
                                                int i16 = uf.b.f37160j;
                                                Bundle bundle2 = new Bundle();
                                                uf.b bVar2 = new uf.b();
                                                bVar2.setArguments(bundle2);
                                                bVar2.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                                return;
                                            } catch (Exception e11) {
                                                FirebaseCrashlytics.getInstance().recordException(e11);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    pVar3 = new ij.p(R.string.upi_id_invalid, false);
                                } else {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                            } else {
                                pVar3 = new ij.p(R.string.upi_id_empty, false);
                            }
                            pVar4 = pVar3;
                            withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                            if (!H2.f20086a) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (((x4) this$0.w()).f6604w.f4983u.getInputValue().length() != 0) {
                            str4 = ((x4) this$0.w()).f6604w.f4983u.getInputValue();
                        }
                        String inputValue4 = ((x4) this$0.w()).f6604w.f4982t.getInputValue();
                        String inputValue5 = ((x4) this$0.w()).f6604w.f4984v.getInputValue();
                        WithdrawalDetailViewModel withdrawalDetailViewModel8 = (WithdrawalDetailViewModel) this$0.x();
                        Double valueOf3 = Double.valueOf(Double.parseDouble(str4));
                        e0 e0Var3 = withdrawalDetailViewModel8.B;
                        Pair pair5 = (Pair) e0Var3.getValue();
                        if (pair5 != null && (configDto = (ConfigDto) pair5.f23354b) != null && (commonConfig = configDto.getCommonConfig()) != null && (payments = commonConfig.getPayments()) != null) {
                            limit = payments.getTransactionLimit();
                        }
                        Pair pair6 = (Pair) e0Var3.getValue();
                        if (pair6 != null) {
                            d10 = ((Number) pair6.f23353a).doubleValue();
                        }
                        withdrawalDetailViewModel8.f9759o.getClass();
                        ij.p H3 = mt.p.H(valueOf3, limit, d10);
                        if (inputValue4 != null && inputValue4.length() != 0) {
                            pVar = new ij.p();
                        } else {
                            pVar = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        if (inputValue5 != null && inputValue5.length() != 0) {
                            pVar2 = new ij.p();
                        } else {
                            pVar2 = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        withdrawalDetailViewModel8.f9768x.postValue(new kj.j(new tf.d(H3, pVar, pVar2)));
                        if (H3.f20086a && pVar.f20086a && pVar2.f20086a) {
                            WithdrawalDetailViewModel withdrawalDetailViewModel9 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                            withdrawalDetailViewModel9.f9762r = str4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel10 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue4, "<set-?>");
                            withdrawalDetailViewModel10.f9766v = inputValue4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel11 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue5, "<set-?>");
                            withdrawalDetailViewModel11.f9765u = inputValue5;
                            try {
                                int i17 = uf.b.f37160j;
                                Bundle bundle3 = new Bundle();
                                uf.b bVar3 = new uf.b();
                                bVar3.setArguments(bundle3);
                                bVar3.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                return;
                            } catch (Exception e12) {
                                FirebaseCrashlytics.getInstance().recordException(e12);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i18 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.setResult(-1, new Intent());
                        this$0.finish();
                        return;
                    default:
                        int i19 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) WithdrawableLimitActivity.class));
                        return;
                }
            }
        });
        final int i14 = 3;
        ((x4) w()).A.f6690t.setOnClickListener(new View.OnClickListener(this) { // from class: fg.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalDetailActivity f16087b;

            {
                this.f16087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij.p pVar;
                ij.p pVar2;
                ConfigDto configDto;
                CommonConfig commonConfig;
                PaymentConfig payments;
                ij.p pVar3;
                ij.p pVar4;
                ConfigDto configDto2;
                CommonConfig commonConfig2;
                PaymentConfig payments2;
                ij.p pVar5;
                ConfigDto configDto3;
                CommonConfig commonConfig3;
                PaymentConfig payments3;
                int i112 = i14;
                WithdrawalDetailActivity this$0 = this.f16087b;
                switch (i112) {
                    case 0:
                        int i122 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0, new Intent());
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x4) this$0.w()).B.performClick();
                        return;
                    case 2:
                        int i142 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.c(view);
                        Object systemService = this$0.getSystemService("input_method");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        String str3 = ((WithdrawalDetailViewModel) this$0.x()).f9767w;
                        double d10 = 0.0d;
                        Limit limit = null;
                        String str4 = "0";
                        if (Intrinsics.a(str3, "TRANSFER_TO_PAYTM_WALLET")) {
                            String inputValue = ((x4) this$0.w()).f6605x.f5184u.getInputValue();
                            if (inputValue.length() != 0) {
                                str4 = inputValue;
                            }
                            String phoneNumber = s.n(((x4) this$0.w()).f6605x.f5183t.getInputValue(), ((WithdrawalDetailViewModel) this$0.x()).f9081d.getCountryPrefix() + " ", HttpUrl.FRAGMENT_ENCODE_SET, false);
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            String b02 = y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var = withdrawalDetailViewModel2.B;
                            Pair pair = (Pair) e0Var.getValue();
                            if (pair != null && (configDto3 = (ConfigDto) pair.f23354b) != null && (commonConfig3 = configDto3.getCommonConfig()) != null && (payments3 = commonConfig3.getPayments()) != null) {
                                limit = payments3.getTransactionLimit();
                            }
                            Pair pair2 = (Pair) e0Var.getValue();
                            if (pair2 != null) {
                                d10 = ((Number) pair2.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel2.f9759o.getClass();
                            ij.p H = mt.p.H(valueOf, limit, d10);
                            if (b02 != null && b02.length() != 0) {
                                if (TextUtils.isDigitsOnly(b02) && b02.length() == 10) {
                                    pVar5 = new ij.p();
                                } else {
                                    pVar5 = new ij.p(R.string.mobile_number_invalid, false);
                                }
                            } else {
                                pVar5 = new ij.p(R.string.mobile_number_empty, false);
                            }
                            withdrawalDetailViewModel2.f9770z.postValue(new kj.j(new tf.g(H, pVar5)));
                            if (H.f20086a && pVar5.f20086a) {
                                WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                withdrawalDetailViewModel3.f9762r = str4;
                                WithdrawalDetailViewModel withdrawalDetailViewModel4 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(b02, "<set-?>");
                                withdrawalDetailViewModel4.f9763s = b02;
                                try {
                                    int i15 = uf.b.f37160j;
                                    Bundle bundle = new Bundle();
                                    uf.b bVar = new uf.b();
                                    bVar.setArguments(bundle);
                                    bVar.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                    return;
                                } catch (Exception e10) {
                                    FirebaseCrashlytics.getInstance().recordException(e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.a(str3, "TRANSFER_TO_UPI")) {
                            String inputValue2 = ((x4) this$0.w()).f6606y.f5407u.getInputValue();
                            if (inputValue2.length() != 0) {
                                str4 = inputValue2;
                            }
                            String inputValue3 = ((x4) this$0.w()).f6606y.f5406t.getInputValue();
                            WithdrawalDetailViewModel withdrawalDetailViewModel5 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf2 = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var2 = withdrawalDetailViewModel5.B;
                            Pair pair3 = (Pair) e0Var2.getValue();
                            if (pair3 != null && (configDto2 = (ConfigDto) pair3.f23354b) != null && (commonConfig2 = configDto2.getCommonConfig()) != null && (payments2 = commonConfig2.getPayments()) != null) {
                                limit = payments2.getTransactionLimit();
                            }
                            Pair pair4 = (Pair) e0Var2.getValue();
                            if (pair4 != null) {
                                d10 = ((Number) pair4.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel5.f9759o.getClass();
                            ij.p H2 = mt.p.H(valueOf2, limit, d10);
                            if (inputValue3 != null && inputValue3.length() != 0) {
                                Intrinsics.checkNotNullParameter(inputValue3, "<this>");
                                if (inputValue3.length() != 0) {
                                    if (inputValue3.charAt(0) != '@' && y.Z(inputValue3) != '@' && w.s(inputValue3, "@", false)) {
                                        pVar4 = new ij.p();
                                        withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                                        if (!H2.f20086a && pVar4.f20086a) {
                                            WithdrawalDetailViewModel withdrawalDetailViewModel6 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                            withdrawalDetailViewModel6.f9762r = str4;
                                            WithdrawalDetailViewModel withdrawalDetailViewModel7 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(inputValue3, "<set-?>");
                                            withdrawalDetailViewModel7.f9764t = inputValue3;
                                            try {
                                                int i16 = uf.b.f37160j;
                                                Bundle bundle2 = new Bundle();
                                                uf.b bVar2 = new uf.b();
                                                bVar2.setArguments(bundle2);
                                                bVar2.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                                return;
                                            } catch (Exception e11) {
                                                FirebaseCrashlytics.getInstance().recordException(e11);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    pVar3 = new ij.p(R.string.upi_id_invalid, false);
                                } else {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                            } else {
                                pVar3 = new ij.p(R.string.upi_id_empty, false);
                            }
                            pVar4 = pVar3;
                            withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                            if (!H2.f20086a) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (((x4) this$0.w()).f6604w.f4983u.getInputValue().length() != 0) {
                            str4 = ((x4) this$0.w()).f6604w.f4983u.getInputValue();
                        }
                        String inputValue4 = ((x4) this$0.w()).f6604w.f4982t.getInputValue();
                        String inputValue5 = ((x4) this$0.w()).f6604w.f4984v.getInputValue();
                        WithdrawalDetailViewModel withdrawalDetailViewModel8 = (WithdrawalDetailViewModel) this$0.x();
                        Double valueOf3 = Double.valueOf(Double.parseDouble(str4));
                        e0 e0Var3 = withdrawalDetailViewModel8.B;
                        Pair pair5 = (Pair) e0Var3.getValue();
                        if (pair5 != null && (configDto = (ConfigDto) pair5.f23354b) != null && (commonConfig = configDto.getCommonConfig()) != null && (payments = commonConfig.getPayments()) != null) {
                            limit = payments.getTransactionLimit();
                        }
                        Pair pair6 = (Pair) e0Var3.getValue();
                        if (pair6 != null) {
                            d10 = ((Number) pair6.f23353a).doubleValue();
                        }
                        withdrawalDetailViewModel8.f9759o.getClass();
                        ij.p H3 = mt.p.H(valueOf3, limit, d10);
                        if (inputValue4 != null && inputValue4.length() != 0) {
                            pVar = new ij.p();
                        } else {
                            pVar = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        if (inputValue5 != null && inputValue5.length() != 0) {
                            pVar2 = new ij.p();
                        } else {
                            pVar2 = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        withdrawalDetailViewModel8.f9768x.postValue(new kj.j(new tf.d(H3, pVar, pVar2)));
                        if (H3.f20086a && pVar.f20086a && pVar2.f20086a) {
                            WithdrawalDetailViewModel withdrawalDetailViewModel9 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                            withdrawalDetailViewModel9.f9762r = str4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel10 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue4, "<set-?>");
                            withdrawalDetailViewModel10.f9766v = inputValue4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel11 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue5, "<set-?>");
                            withdrawalDetailViewModel11.f9765u = inputValue5;
                            try {
                                int i17 = uf.b.f37160j;
                                Bundle bundle3 = new Bundle();
                                uf.b bVar3 = new uf.b();
                                bVar3.setArguments(bundle3);
                                bVar3.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                return;
                            } catch (Exception e12) {
                                FirebaseCrashlytics.getInstance().recordException(e12);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i18 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.setResult(-1, new Intent());
                        this$0.finish();
                        return;
                    default:
                        int i19 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) WithdrawableLimitActivity.class));
                        return;
                }
            }
        });
        ((x4) w()).f6603v.setOnClickListener(new View.OnClickListener(this) { // from class: fg.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalDetailActivity f16087b;

            {
                this.f16087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij.p pVar;
                ij.p pVar2;
                ConfigDto configDto;
                CommonConfig commonConfig;
                PaymentConfig payments;
                ij.p pVar3;
                ij.p pVar4;
                ConfigDto configDto2;
                CommonConfig commonConfig2;
                PaymentConfig payments2;
                ij.p pVar5;
                ConfigDto configDto3;
                CommonConfig commonConfig3;
                PaymentConfig payments3;
                int i112 = i11;
                WithdrawalDetailActivity this$0 = this.f16087b;
                switch (i112) {
                    case 0:
                        int i122 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0, new Intent());
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x4) this$0.w()).B.performClick();
                        return;
                    case 2:
                        int i142 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.c(view);
                        Object systemService = this$0.getSystemService("input_method");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        String str3 = ((WithdrawalDetailViewModel) this$0.x()).f9767w;
                        double d10 = 0.0d;
                        Limit limit = null;
                        String str4 = "0";
                        if (Intrinsics.a(str3, "TRANSFER_TO_PAYTM_WALLET")) {
                            String inputValue = ((x4) this$0.w()).f6605x.f5184u.getInputValue();
                            if (inputValue.length() != 0) {
                                str4 = inputValue;
                            }
                            String phoneNumber = s.n(((x4) this$0.w()).f6605x.f5183t.getInputValue(), ((WithdrawalDetailViewModel) this$0.x()).f9081d.getCountryPrefix() + " ", HttpUrl.FRAGMENT_ENCODE_SET, false);
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            String b02 = y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            WithdrawalDetailViewModel withdrawalDetailViewModel2 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var = withdrawalDetailViewModel2.B;
                            Pair pair = (Pair) e0Var.getValue();
                            if (pair != null && (configDto3 = (ConfigDto) pair.f23354b) != null && (commonConfig3 = configDto3.getCommonConfig()) != null && (payments3 = commonConfig3.getPayments()) != null) {
                                limit = payments3.getTransactionLimit();
                            }
                            Pair pair2 = (Pair) e0Var.getValue();
                            if (pair2 != null) {
                                d10 = ((Number) pair2.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel2.f9759o.getClass();
                            ij.p H = mt.p.H(valueOf, limit, d10);
                            if (b02 != null && b02.length() != 0) {
                                if (TextUtils.isDigitsOnly(b02) && b02.length() == 10) {
                                    pVar5 = new ij.p();
                                } else {
                                    pVar5 = new ij.p(R.string.mobile_number_invalid, false);
                                }
                            } else {
                                pVar5 = new ij.p(R.string.mobile_number_empty, false);
                            }
                            withdrawalDetailViewModel2.f9770z.postValue(new kj.j(new tf.g(H, pVar5)));
                            if (H.f20086a && pVar5.f20086a) {
                                WithdrawalDetailViewModel withdrawalDetailViewModel3 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                withdrawalDetailViewModel3.f9762r = str4;
                                WithdrawalDetailViewModel withdrawalDetailViewModel4 = (WithdrawalDetailViewModel) this$0.x();
                                Intrinsics.checkNotNullParameter(b02, "<set-?>");
                                withdrawalDetailViewModel4.f9763s = b02;
                                try {
                                    int i15 = uf.b.f37160j;
                                    Bundle bundle = new Bundle();
                                    uf.b bVar = new uf.b();
                                    bVar.setArguments(bundle);
                                    bVar.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                    return;
                                } catch (Exception e10) {
                                    FirebaseCrashlytics.getInstance().recordException(e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.a(str3, "TRANSFER_TO_UPI")) {
                            String inputValue2 = ((x4) this$0.w()).f6606y.f5407u.getInputValue();
                            if (inputValue2.length() != 0) {
                                str4 = inputValue2;
                            }
                            String inputValue3 = ((x4) this$0.w()).f6606y.f5406t.getInputValue();
                            WithdrawalDetailViewModel withdrawalDetailViewModel5 = (WithdrawalDetailViewModel) this$0.x();
                            Double valueOf2 = Double.valueOf(Double.parseDouble(str4));
                            e0 e0Var2 = withdrawalDetailViewModel5.B;
                            Pair pair3 = (Pair) e0Var2.getValue();
                            if (pair3 != null && (configDto2 = (ConfigDto) pair3.f23354b) != null && (commonConfig2 = configDto2.getCommonConfig()) != null && (payments2 = commonConfig2.getPayments()) != null) {
                                limit = payments2.getTransactionLimit();
                            }
                            Pair pair4 = (Pair) e0Var2.getValue();
                            if (pair4 != null) {
                                d10 = ((Number) pair4.f23353a).doubleValue();
                            }
                            withdrawalDetailViewModel5.f9759o.getClass();
                            ij.p H2 = mt.p.H(valueOf2, limit, d10);
                            if (inputValue3 != null && inputValue3.length() != 0) {
                                Intrinsics.checkNotNullParameter(inputValue3, "<this>");
                                if (inputValue3.length() != 0) {
                                    if (inputValue3.charAt(0) != '@' && y.Z(inputValue3) != '@' && w.s(inputValue3, "@", false)) {
                                        pVar4 = new ij.p();
                                        withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                                        if (!H2.f20086a && pVar4.f20086a) {
                                            WithdrawalDetailViewModel withdrawalDetailViewModel6 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                            withdrawalDetailViewModel6.f9762r = str4;
                                            WithdrawalDetailViewModel withdrawalDetailViewModel7 = (WithdrawalDetailViewModel) this$0.x();
                                            Intrinsics.checkNotNullParameter(inputValue3, "<set-?>");
                                            withdrawalDetailViewModel7.f9764t = inputValue3;
                                            try {
                                                int i16 = uf.b.f37160j;
                                                Bundle bundle2 = new Bundle();
                                                uf.b bVar2 = new uf.b();
                                                bVar2.setArguments(bundle2);
                                                bVar2.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                                return;
                                            } catch (Exception e11) {
                                                FirebaseCrashlytics.getInstance().recordException(e11);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    pVar3 = new ij.p(R.string.upi_id_invalid, false);
                                } else {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                            } else {
                                pVar3 = new ij.p(R.string.upi_id_empty, false);
                            }
                            pVar4 = pVar3;
                            withdrawalDetailViewModel5.f9769y.postValue(new kj.j(new tf.f(H2, pVar4)));
                            if (!H2.f20086a) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (((x4) this$0.w()).f6604w.f4983u.getInputValue().length() != 0) {
                            str4 = ((x4) this$0.w()).f6604w.f4983u.getInputValue();
                        }
                        String inputValue4 = ((x4) this$0.w()).f6604w.f4982t.getInputValue();
                        String inputValue5 = ((x4) this$0.w()).f6604w.f4984v.getInputValue();
                        WithdrawalDetailViewModel withdrawalDetailViewModel8 = (WithdrawalDetailViewModel) this$0.x();
                        Double valueOf3 = Double.valueOf(Double.parseDouble(str4));
                        e0 e0Var3 = withdrawalDetailViewModel8.B;
                        Pair pair5 = (Pair) e0Var3.getValue();
                        if (pair5 != null && (configDto = (ConfigDto) pair5.f23354b) != null && (commonConfig = configDto.getCommonConfig()) != null && (payments = commonConfig.getPayments()) != null) {
                            limit = payments.getTransactionLimit();
                        }
                        Pair pair6 = (Pair) e0Var3.getValue();
                        if (pair6 != null) {
                            d10 = ((Number) pair6.f23353a).doubleValue();
                        }
                        withdrawalDetailViewModel8.f9759o.getClass();
                        ij.p H3 = mt.p.H(valueOf3, limit, d10);
                        if (inputValue4 != null && inputValue4.length() != 0) {
                            pVar = new ij.p();
                        } else {
                            pVar = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        if (inputValue5 != null && inputValue5.length() != 0) {
                            pVar2 = new ij.p();
                        } else {
                            pVar2 = new ij.p(R.string.text_field_cannot_be_empty, false);
                        }
                        withdrawalDetailViewModel8.f9768x.postValue(new kj.j(new tf.d(H3, pVar, pVar2)));
                        if (H3.f20086a && pVar.f20086a && pVar2.f20086a) {
                            WithdrawalDetailViewModel withdrawalDetailViewModel9 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(str4, "<set-?>");
                            withdrawalDetailViewModel9.f9762r = str4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel10 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue4, "<set-?>");
                            withdrawalDetailViewModel10.f9766v = inputValue4;
                            WithdrawalDetailViewModel withdrawalDetailViewModel11 = (WithdrawalDetailViewModel) this$0.x();
                            Intrinsics.checkNotNullParameter(inputValue5, "<set-?>");
                            withdrawalDetailViewModel11.f9765u = inputValue5;
                            try {
                                int i17 = uf.b.f37160j;
                                Bundle bundle3 = new Bundle();
                                uf.b bVar3 = new uf.b();
                                bVar3.setArguments(bundle3);
                                bVar3.show(this$0.getSupportFragmentManager(), "ConfirmPaymentBottomSheetDialogFragment");
                                return;
                            } catch (Exception e12) {
                                FirebaseCrashlytics.getInstance().recordException(e12);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i18 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.setResult(-1, new Intent());
                        this$0.finish();
                        return;
                    default:
                        int i19 = WithdrawalDetailActivity.f9757k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) WithdrawableLimitActivity.class));
                        return;
                }
            }
        });
        ((x4) w()).f6605x.f5184u.setOnInputViewAction(new f(this, 3));
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) WalletHomeActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mt.p] */
    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        ea.v vVar = (ea.v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        yk.g.i(paymentRepository);
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        ?? validator = new Object();
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        c factory = new c(a0.a(WithdrawalDetailViewModel.class), new t(schedulerProvider, compositeDisposable, paymentRepository, userRepository, (p) validator));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, WithdrawalDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(WithdrawalDetailViewModel.class, "<this>", WithdrawalDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            WithdrawalDetailViewModel withdrawalDetailViewModel = (WithdrawalDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(withdrawalDetailViewModel);
            this.f17254b = withdrawalDetailViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
