package fg;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.f6;
import ba.g6;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.d0;
import ea.f0;
import iu.a0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import ls.n0;
import m.v2;
import okhttp3.HttpUrl;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lfg/f;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/withdrawal/PaymentWithdrawalOTPVerifyViewModel;", "Lba/f6;", "<init>", "()V", "fg/c", "fg/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends gd.h<PaymentWithdrawalOTPVerifyViewModel, f6> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f16070k = 0;

    /* renamed from: i, reason: collision with root package name */
    public final z9.c f16071i = new z9.c(new bb.d(this, 2));

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f16072j = ut.h.a(new ag.b(this, 4));

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        requireActivity().unregisterReceiver(this.f16071i);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        j0 requireActivity = requireActivity();
        int i10 = Build.VERSION.SDK_INT;
        z9.c cVar = this.f16071i;
        if (i10 >= 34) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
            Unit unit = Unit.f23355a;
            requireActivity.registerReceiver(cVar, intentFilter, 4);
        } else {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
            Unit unit2 = Unit.f23355a;
            requireActivity.registerReceiver(cVar, intentFilter2);
        }
        SmsRetriever.getClient((Activity) requireActivity).startSmsRetriever();
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        PaymentRepository paymentRepository = bottomSheetDialogFragmentComponent.f14246a.i();
        yk.g.i(paymentRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        ca.c factory = new ca.c(a0.a(PaymentWithdrawalOTPVerifyViewModel.class), new d0(schedulerProvider, compositeDisposable, paymentRepository, 0));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, PaymentWithdrawalOTPVerifyViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PaymentWithdrawalOTPVerifyViewModel.class, "<this>", PaymentWithdrawalOTPVerifyViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = (PaymentWithdrawalOTPVerifyViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(paymentWithdrawalOTPVerifyViewModel);
            this.f17270b = paymentWithdrawalOTPVerifyViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.bottom_sheet_payment_withdrawal_otp_verify;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((PaymentWithdrawalOTPVerifyViewModel) t()).f9748q.observe(this, new v(4, new e(this, 0)));
        ((PaymentWithdrawalOTPVerifyViewModel) t()).f9750s.observe(this, new v(4, new e(this, 1)));
        ((PaymentWithdrawalOTPVerifyViewModel) t()).f9070f.observe(this, new v(4, new e(this, 2)));
    }

    @Override // gd.h
    public final void z(View view) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(view, "view");
        g6 g6Var = (g6) ((f6) r());
        g6Var.B = (PaymentWithdrawalOTPVerifyViewModel) t();
        synchronized (g6Var) {
            g6Var.D |= 32;
        }
        g6Var.a(24);
        g6Var.m();
        ((f6) r()).p(this);
        d dVar = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("DATA", d.class);
                dVar = (d) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                dVar = (d) arguments2.getParcelable("DATA");
            }
        }
        if (dVar != null) {
            String errorMessage = dVar.f16067b;
            if (errorMessage != null) {
                PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = (PaymentWithdrawalOTPVerifyViewModel) t();
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                paymentWithdrawalOTPVerifyViewModel.f9743l.postValue(new Pair(errorMessage, Boolean.FALSE));
                paymentWithdrawalOTPVerifyViewModel.f9751t.postValue(Boolean.TRUE);
            }
            c cVar = dVar.f16066a;
            final int i10 = 1;
            if (cVar != null) {
                PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel2 = (PaymentWithdrawalOTPVerifyViewModel) t();
                String str = cVar.f16063b;
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                paymentWithdrawalOTPVerifyViewModel2.f9754w = str;
                ((PaymentWithdrawalOTPVerifyViewModel) t()).g();
                ((PaymentWithdrawalOTPVerifyViewModel) t()).f9753v = cVar.f16065d;
                TextView textView = ((f6) r()).f4676y;
                String string = getString(R.string.we_just_sent_you_on_your_mobile_number);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{y.b0(2, cVar.f16064c)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(format);
                ((f6) r()).f4670s.setOnClickListener(new bb.a(15, this, cVar));
            }
            final int i11 = 0;
            ((f6) r()).f4677z.setOnClickListener(new View.OnClickListener(this) { // from class: fg.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f16061b;

                {
                    this.f16061b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    f this$0 = this.f16061b;
                    switch (i12) {
                        case 0:
                            int i13 = f.f16070k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel3 = (PaymentWithdrawalOTPVerifyViewModel) this$0.t();
                            e0 e0Var = paymentWithdrawalOTPVerifyViewModel3.f9070f;
                            try {
                                e0 e0Var2 = paymentWithdrawalOTPVerifyViewModel3.f9739h;
                                Boolean bool = Boolean.FALSE;
                                e0Var2.postValue(bool);
                                paymentWithdrawalOTPVerifyViewModel3.f9743l.postValue(new Pair(HttpUrl.FRAGMENT_ENCODE_SET, bool));
                                e0Var.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(paymentWithdrawalOTPVerifyViewModel3), null, null, new j(paymentWithdrawalOTPVerifyViewModel3, null), 3);
                                return;
                            } catch (Exception unused) {
                                e0Var.postValue(Boolean.FALSE);
                                return;
                            }
                        default:
                            int i14 = f.f16070k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            WithdrawalDetailActivity withdrawalDetailActivity = (WithdrawalDetailActivity) this$0.f16072j.getValue();
                            withdrawalDetailActivity.getClass();
                            withdrawalDetailActivity.setResult(-1, new Intent());
                            withdrawalDetailActivity.finish();
                            return;
                    }
                }
            });
            ((f6) r()).f4674w.addTextChangedListener(new v2(this, 4));
            ((f6) r()).f4672u.setOnClickListener(new View.OnClickListener(this) { // from class: fg.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f16061b;

                {
                    this.f16061b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    f this$0 = this.f16061b;
                    switch (i12) {
                        case 0:
                            int i13 = f.f16070k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel3 = (PaymentWithdrawalOTPVerifyViewModel) this$0.t();
                            e0 e0Var = paymentWithdrawalOTPVerifyViewModel3.f9070f;
                            try {
                                e0 e0Var2 = paymentWithdrawalOTPVerifyViewModel3.f9739h;
                                Boolean bool = Boolean.FALSE;
                                e0Var2.postValue(bool);
                                paymentWithdrawalOTPVerifyViewModel3.f9743l.postValue(new Pair(HttpUrl.FRAGMENT_ENCODE_SET, bool));
                                e0Var.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(paymentWithdrawalOTPVerifyViewModel3), null, null, new j(paymentWithdrawalOTPVerifyViewModel3, null), 3);
                                return;
                            } catch (Exception unused) {
                                e0Var.postValue(Boolean.FALSE);
                                return;
                            }
                        default:
                            int i14 = f.f16070k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            WithdrawalDetailActivity withdrawalDetailActivity = (WithdrawalDetailActivity) this$0.f16072j.getValue();
                            withdrawalDetailActivity.getClass();
                            withdrawalDetailActivity.setResult(-1, new Intent());
                            withdrawalDetailActivity.finish();
                            return;
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Required OtpVerifyScreenData not supplied".toString());
    }
}
