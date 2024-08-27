package bb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import ba.e2;
import ba.f6;
import ba.n3;
import ba.se;
import ba.vl;
import ba.vs;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.WalletTransaction;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.assetgro.stockgro.data.model.portfolio.WalletCtaDetails;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.preview.MediaAssetUploadPreviewActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.github.clans.fab.FloatingActionButton;
import dg.o;
import dg.p;
import eb.u;
import fg.k;
import iu.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import lf.i0;
import wo.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6906c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f6904a = i10;
        this.f6906c = obj;
        this.f6905b = obj2;
    }

    private final void a() {
        String str;
        ForgotPinOtpFragment this$0 = (ForgotPinOtpFragment) this.f6906c;
        String otpChannel = (String) this.f6905b;
        int i10 = ForgotPinOtpFragment.f8733j;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(otpChannel, "$gateway");
        ForgotPinOtpViewModel forgotPinOtpViewModel = (ForgotPinOtpViewModel) this$0.r();
        String phoneNumber = ((e) this$0.f8734g.getValue()).f6913a;
        CountrySelectDto countrySelectDto = (CountrySelectDto) ((LoginViewModel) this$0.f8736i.getValue()).f8708t.getValue();
        if (countrySelectDto == null || (str = countrySelectDto.getCode()) == null) {
            str = "IN";
        }
        String countryCode = str;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            forgotPinOtpViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
            return;
        }
        yk.g.H(u0.f(forgotPinOtpViewModel), null, null, new i(forgotPinOtpViewModel, phoneNumber, countryCode, otpChannel, null), 3);
        ct.b bVar = forgotPinOtpViewModel.f8743t;
        if (bVar != null) {
            bVar.a();
        }
    }

    private final void b() {
        Editable text;
        String str;
        PinLoginFragment this$0 = (PinLoginFragment) this.f6906c;
        String osVersion = (String) this.f6905b;
        int i10 = PinLoginFragment.f8744i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(osVersion, "$osVersion");
        Editable text2 = ((vl) this$0.q()).f6450u.getText();
        if (text2 != null && !w.C(text2) && (text = ((vl) this$0.q()).f6450u.getText()) != null && text.length() == 4) {
            PinLoginViewModel pinLoginViewModel = (PinLoginViewModel) this$0.r();
            String phoneNumber = ((cb.b) this$0.f8745g.getValue()).f8078a;
            String pin = String.valueOf(((vl) this$0.q()).f6450u.getText());
            CountrySelectDto countrySelectDto = (CountrySelectDto) ((LoginViewModel) this$0.f8746h.getValue()).f8708t.getValue();
            if (countrySelectDto != null) {
                str = countrySelectDto.getCode();
            } else {
                str = null;
            }
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                pinLoginViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                return;
            } else {
                yk.g.H(u0.f(pinLoginViewModel), null, null, new cb.e(pinLoginViewModel, phoneNumber, pin, osVersion, str, null), 3);
                return;
            }
        }
        Context requireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        hl.f.S0(R.string.enter_four_digit_pin, requireContext);
    }

    private final void c() {
        Pair pair = (Pair) this.f6906c;
        eb.a this$0 = (eb.a) this.f6905b;
        int i10 = eb.a.f15299i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair != null) {
            this$0.dismiss();
        }
    }

    private final void d() {
        String str;
        RegistrationOtpVerificationFragment this$0 = (RegistrationOtpVerificationFragment) this.f6906c;
        OtpChannel otpChannel = (OtpChannel) this.f6905b;
        int i10 = RegistrationOtpVerificationFragment.f8778j;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(otpChannel, "$gateway");
        RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = (RegistrationOtpVerificationViewModel) this$0.r();
        String phoneNumber = this$0.I().f15353a;
        CountrySelectDto countrySelectDto = (CountrySelectDto) ((LoginViewModel) this$0.f8781i.getValue()).f8708t.getValue();
        if (countrySelectDto == null || (str = countrySelectDto.getCode()) == null) {
            str = "IN";
        }
        String countryCode = str;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
        registrationOtpVerificationViewModel.f8782n = otpChannel.getOtpRetryTimer();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            registrationOtpVerificationViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
        } else {
            registrationOtpVerificationViewModel.f9084g.setValue(Boolean.TRUE);
            yk.g.H(u0.f(registrationOtpVerificationViewModel), null, null, new u(registrationOtpVerificationViewModel, phoneNumber, countryCode, otpChannel, null), 3);
        }
    }

    private final void e() {
        RiaProfileActivity this$0 = (RiaProfileActivity) this.f6906c;
        String label = (String) this.f6905b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(label, "$label");
        CharSequence text = ((n3) this$0.w()).L.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (w.s(text, " Read more....", false)) {
            int i10 = i0.f24733j;
            String string = this$0.getString(R.string.text_about);
            int i11 = kj.f.f23221a;
            Intrinsics.checkNotNullParameter(label, "<this>");
            kq.e.L(new ShowInfoData(string, s.n(label, "\n", "<br>", false), this$0.getString(R.string.got_it), 0, 0, false, 24, null)).show(this$0.getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
        }
    }

    private final void f() {
        vs this_apply = (vs) this.f6906c;
        MissionTaskDetailFragment this$0 = (MissionTaskDetailFragment) this.f6905b;
        int i10 = MissionTaskDetailFragment.f8859j;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this_apply.f6466t.getVisibility() == 8) {
            this$0.H(true);
        } else {
            this$0.H(false);
        }
    }

    private final void g() {
        int i10;
        int i11;
        se this_apply = (se) this.f6906c;
        he.e this$0 = (he.e) this.f6905b;
        int i12 = he.e.f18301m;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FloatingActionButton floatingActionButton = this_apply.f6072w;
        int i13 = 8;
        if (this$0.f18305j) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        floatingActionButton.setVisibility(i10);
        if (this$0.f18304i) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this_apply.f6073x.setVisibility(i11);
        if (this$0.f18306k) {
            i13 = 0;
        }
        this_apply.f6071v.setVisibility(i13);
        this_apply.f6074y.b(true);
        this$0.K().J = !r0.f11026j;
    }

    private final void h() {
        MediaAssetUploadPreviewActivity this$0 = (MediaAssetUploadPreviewActivity) this.f6906c;
        String str = (String) this.f6905b;
        int i10 = MediaAssetUploadPreviewActivity.f9422k;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String obj = w.X(String.valueOf(((e2) this$0.w()).f4563x.f4649v.getEditText().getText())).toString();
        Intent intent = new Intent();
        intent.putExtra("URI", String.valueOf(str));
        intent.putExtra("CHAT_MESSAGE", obj);
        Unit unit = Unit.f23355a;
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    private final void i() {
        String url;
        ChatMessage message = (ChatMessage) this.f6906c;
        Function1 onDocumentClicked = (Function1) this.f6905b;
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(onDocumentClicked, "$onDocumentClicked");
        Media media = message.getMedia();
        if (media != null && (url = media.getUrl()) != null) {
            onDocumentClicked.invoke(url);
        }
    }

    private final void j() {
        Context context = (Context) this.f6906c;
        h.j jVar = (h.j) this.f6905b;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
        jVar.dismiss();
    }

    private final void k() {
        MainActivity this$0 = (MainActivity) this.f6906c;
        m this_snackBar = (m) this.f6905b;
        de.d dVar = MainActivity.f9574r;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_snackBar, "$this_snackBar");
        dp.e eVar = this$0.f9582q;
        if (eVar != null) {
            eVar.a();
            this_snackBar.a(3);
        } else {
            Intrinsics.k("appUpdateManager");
            throw null;
        }
    }

    private final void l() {
        NotificationsActivity this$0 = (NotificationsActivity) this.f6906c;
        m snackbar = (m) this.f6905b;
        int i10 = NotificationsActivity.f9619m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(snackbar, "$snackbar");
        dp.e eVar = this$0.f9621l;
        if (eVar != null) {
            eVar.a();
            snackbar.a(3);
        } else {
            Intrinsics.k("appUpdateManager");
            throw null;
        }
    }

    private final void m() {
        tf.b this$0 = (tf.b) this.f6906c;
        WithdrawPreCheckData preCheckData = (WithdrawPreCheckData) this.f6905b;
        int i10 = tf.b.f36008c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preCheckData, "$preCheckData");
        this$0.dismiss();
        if (preCheckData.getGoToWallet()) {
            j0 requireActivity = this$0.requireActivity();
            requireActivity.setResult(-1, new Intent());
            requireActivity.finish();
        }
    }

    private final void n() {
        WalletCtaDetails details;
        String ctaLink;
        z data = (z) this.f6906c;
        wf.a this$0 = (wf.a) this.f6905b;
        int i10 = wf.a.f39037c;
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WalletCta walletCta = (WalletCta) data.f20560a;
        if (walletCta != null && (details = walletCta.getDetails()) != null && (ctaLink = details.getCtaLink()) != null) {
            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ctaLink)));
            this$0.dismiss();
        }
    }

    private final void o() {
        WalletTransaction walletTransaction;
        o this$0 = (o) this.f6906c;
        p this$1 = (p) this.f6905b;
        int i10 = o.f14373w;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        Integer valueOf = Integer.valueOf(this$0.d());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null && (walletTransaction = (WalletTransaction) this$1.q(valueOf.intValue())) != null) {
            this$1.f14377g.invoke(walletTransaction.getId(), walletTransaction.getTxnStatus());
        }
    }

    private final void p() {
        fg.f this$0 = (fg.f) this.f6906c;
        fg.c otpVerifyData = (fg.c) this.f6905b;
        int i10 = fg.f.f16070k;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(otpVerifyData, "$otpVerifyData");
        PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = (PaymentWithdrawalOTPVerifyViewModel) this$0.t();
        WithdrawInitiateDto withdrawInitiateDto = otpVerifyData.f16062a;
        String otp = String.valueOf(((f6) this$0.r()).f4674w.getText());
        e0 e0Var = paymentWithdrawalOTPVerifyViewModel.f9070f;
        Intrinsics.checkNotNullParameter(withdrawInitiateDto, "withdrawInitiateDto");
        Intrinsics.checkNotNullParameter(otp, "otp");
        try {
            e0Var.postValue(Boolean.TRUE);
            yk.g.H(u0.f(paymentWithdrawalOTPVerifyViewModel), null, null, new k(paymentWithdrawalOTPVerifyViewModel, withdrawInitiateDto, otp, null), 3);
        } catch (Exception unused) {
            e0Var.postValue(Boolean.FALSE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 mi.n, still in use, count: 3, list:
          (r12v4 mi.n) from 0x0109: MOVE (r28v0 mi.n) = (r12v4 mi.n) (LINE:266)
          (r12v4 mi.n) from 0x0145: MOVE (r28v2 mi.n) = (r12v4 mi.n) (LINE:326)
          (r12v4 mi.n) from 0x013d: MOVE (r28v3 mi.n) = (r12v4 mi.n) (LINE:318)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    private final void q() {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.a.q():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 pi.f, still in use, count: 3, list:
          (r11v4 pi.f) from 0x0126: MOVE (r27v0 pi.f) = (r11v4 pi.f) (LINE:295)
          (r11v4 pi.f) from 0x0169: MOVE (r27v2 pi.f) = (r11v4 pi.f) (LINE:362)
          (r11v4 pi.f) from 0x0160: MOVE (r27v3 pi.f) = (r11v4 pi.f) (LINE:353)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    private final void r() {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.a.r():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v25 xi.f, still in use, count: 3, list:
          (r12v25 xi.f) from 0x01e3: MOVE (r24v2 xi.f) = (r12v25 xi.f) (LINE:484)
          (r12v25 xi.f) from 0x0228: MOVE (r24v4 xi.f) = (r12v25 xi.f) (LINE:553)
          (r12v25 xi.f) from 0x021b: MOVE (r24v5 xi.f) = (r12v25 xi.f) (LINE:540)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.widget.ArrayAdapter, fi.f, android.widget.BaseAdapter, android.widget.ListAdapter] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r47) {
        /*
            Method dump skipped, instructions count: 3574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.a.onClick(android.view.View):void");
    }

    public /* synthetic */ a(String str, OfferDetailsActivity offerDetailsActivity) {
        this.f6904a = 20;
        this.f6905b = str;
        this.f6906c = offerDetailsActivity;
    }
}
