package z9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.g0;
import ba.f6;
import ba.pl;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final a f42200a;

    public c(bb.d otpReceiver) {
        Intrinsics.checkNotNullParameter(otpReceiver, "otpReceiver");
        this.f42200a = otpReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.a(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            Bundle extras = intent.getExtras();
            Intrinsics.c(extras);
            Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Intrinsics.d(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            int statusCode = ((Status) obj).getStatusCode();
            a aVar = this.f42200a;
            if (statusCode != 0) {
                if (statusCode == 15) {
                    bb.d dVar = (bb.d) aVar;
                    int i10 = dVar.f6911a;
                    g0 g0Var = dVar.f6912b;
                    switch (i10) {
                        case 0:
                            ForgotPinOtpFragment.H((ForgotPinOtpFragment) g0Var);
                            return;
                        case 1:
                            RegistrationOtpVerificationFragment.H((RegistrationOtpVerificationFragment) g0Var);
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            Object obj2 = extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str != null) {
                "OTP_Message ".concat(str);
                qv.a.a(new Object[0]);
                Pattern compile = Pattern.compile("(|^)\\d{6}");
                Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
                Matcher matcher = compile.matcher(str);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                if (matcher.find()) {
                    String otp = matcher.group(0);
                    Intrinsics.c(otp);
                    bb.d dVar2 = (bb.d) aVar;
                    int i11 = dVar2.f6911a;
                    g0 g0Var2 = dVar2.f6912b;
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(otp, "otp");
                            ForgotPinOtpFragment forgotPinOtpFragment = (ForgotPinOtpFragment) g0Var2;
                            ((pl) forgotPinOtpFragment.q()).f5785x.setText(otp);
                            ((ForgotPinOtpViewModel) forgotPinOtpFragment.r()).i(otp);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(otp, "otp");
                            RegistrationOtpVerificationFragment registrationOtpVerificationFragment = (RegistrationOtpVerificationFragment) g0Var2;
                            ((pl) registrationOtpVerificationFragment.q()).f5785x.setText(otp);
                            ((RegistrationOtpVerificationViewModel) registrationOtpVerificationFragment.r()).i(otp);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(otp, "otp");
                            fg.f fVar = (fg.f) g0Var2;
                            ((f6) fVar.r()).f4674w.setText(otp);
                            ((f6) fVar.r()).f4670s.performClick();
                            return;
                    }
                }
            }
        }
    }
}
