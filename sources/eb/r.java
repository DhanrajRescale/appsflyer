package eb;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ba.pl;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.y;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RegistrationOtpVerificationFragment f15352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(RegistrationOtpVerificationFragment registrationOtpVerificationFragment, int i10) {
        super(1);
        this.f15351a = i10;
        this.f15352b = registrationOtpVerificationFragment;
    }

    public final void a(CountrySelectDto countrySelectDto) {
        int i10 = this.f15351a;
        RegistrationOtpVerificationFragment registrationOtpVerificationFragment = this.f15352b;
        switch (i10) {
            case 1:
                List<OtpChannel> otpChannels = countrySelectDto.getOtpChannels();
                int size = otpChannels.size();
                if (size == 1 || size == 2 || size == 3) {
                    int i11 = RegistrationOtpVerificationFragment.f8778j;
                    registrationOtpVerificationFragment.getClass();
                    int i12 = 0;
                    for (Object obj : otpChannels) {
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            OtpChannel otpChannel = (OtpChannel) obj;
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        TextView thirdOptionText = ((pl) registrationOtpVerificationFragment.q()).C;
                                        Intrinsics.checkNotNullExpressionValue(thirdOptionText, "thirdOptionText");
                                        CardView thirdOtpChoice = ((pl) registrationOtpVerificationFragment.q()).D;
                                        Intrinsics.checkNotNullExpressionValue(thirdOtpChoice, "thirdOtpChoice");
                                        TextView textOr2 = ((pl) registrationOtpVerificationFragment.q()).B;
                                        Intrinsics.checkNotNullExpressionValue(textOr2, "textOr2");
                                        CardView thirdOtpChoice2 = ((pl) registrationOtpVerificationFragment.q()).D;
                                        Intrinsics.checkNotNullExpressionValue(thirdOtpChoice2, "thirdOtpChoice");
                                        registrationOtpVerificationFragment.J(thirdOptionText, thirdOtpChoice, otpChannel, new View[]{textOr2, thirdOtpChoice2});
                                    }
                                } else {
                                    TextView secondOptionText = ((pl) registrationOtpVerificationFragment.q()).f5786y;
                                    Intrinsics.checkNotNullExpressionValue(secondOptionText, "secondOptionText");
                                    CardView secondOtpChoice = ((pl) registrationOtpVerificationFragment.q()).f5787z;
                                    Intrinsics.checkNotNullExpressionValue(secondOtpChoice, "secondOtpChoice");
                                    TextView textOr = ((pl) registrationOtpVerificationFragment.q()).A;
                                    Intrinsics.checkNotNullExpressionValue(textOr, "textOr");
                                    CardView secondOtpChoice2 = ((pl) registrationOtpVerificationFragment.q()).f5787z;
                                    Intrinsics.checkNotNullExpressionValue(secondOtpChoice2, "secondOtpChoice");
                                    registrationOtpVerificationFragment.J(secondOptionText, secondOtpChoice, otpChannel, new View[]{textOr, secondOtpChoice2});
                                }
                            } else {
                                TextView firstOptionText = ((pl) registrationOtpVerificationFragment.q()).f5782u;
                                Intrinsics.checkNotNullExpressionValue(firstOptionText, "firstOptionText");
                                CardView firstOtpChoice = ((pl) registrationOtpVerificationFragment.q()).f5783v;
                                Intrinsics.checkNotNullExpressionValue(firstOtpChoice, "firstOtpChoice");
                                registrationOtpVerificationFragment.J(firstOptionText, firstOtpChoice, otpChannel, new View[0]);
                            }
                            i12 = i13;
                        } else {
                            y.j();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                ((RegistrationOtpVerificationViewModel) registrationOtpVerificationFragment.r()).f8782n = countrySelectDto.getDefaultOtpChannel().getOtpRetryTimer();
                RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = (RegistrationOtpVerificationViewModel) registrationOtpVerificationFragment.r();
                registrationOtpVerificationViewModel.h(registrationOtpVerificationViewModel.f8782n);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String sessionId;
        String otp;
        String str;
        String str2;
        String n10;
        int i10 = this.f15351a;
        RegistrationOtpVerificationFragment registrationOtpVerificationFragment = this.f15352b;
        switch (i10) {
            case 0:
                int i11 = RegistrationOtpVerificationFragment.f8778j;
                ((pl) registrationOtpVerificationFragment.q()).f5785x.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                CardView[] cardViewArr = {((pl) registrationOtpVerificationFragment.q()).f5783v, ((pl) registrationOtpVerificationFragment.q()).f5787z, ((pl) registrationOtpVerificationFragment.q()).D};
                for (int i12 = 0; i12 < 3; i12++) {
                    CardView cardView = cardViewArr[i12];
                    cardView.setClickable(false);
                    cardView.setEnabled(false);
                    cardView.setAlpha(0.5f);
                }
                ((pl) registrationOtpVerificationFragment.q()).f5782u.setTextColor(r3.k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.grey_827F92));
                ((pl) registrationOtpVerificationFragment.q()).f5786y.setTextColor(r3.k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.grey_827F92));
                ((pl) registrationOtpVerificationFragment.q()).C.setTextColor(r3.k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.grey_827F92));
                return Unit.f23355a;
            case 1:
                a((CountrySelectDto) obj);
                return Unit.f23355a;
            case 2:
                Pair pair = (Pair) obj;
                if (((Boolean) pair.f23353a).booleanValue()) {
                    int i13 = RegistrationOtpVerificationFragment.f8778j;
                    String phoneNumber = registrationOtpVerificationFragment.I().f15353a;
                    String invitationCode = registrationOtpVerificationFragment.I().f15354b;
                    Pair pair2 = (Pair) pair.f23354b;
                    if (pair2 != null && (str2 = (String) pair2.f23353a) != null) {
                        sessionId = str2;
                    } else {
                        sessionId = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (pair2 != null && (str = (String) pair2.f23354b) != null) {
                        otp = str;
                    } else {
                        otp = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    boolean z10 = registrationOtpVerificationFragment.I().f15356d;
                    Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                    Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                    Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                    Intrinsics.checkNotNullParameter(otp, "otp");
                    q6.l.h(registrationOtpVerificationFragment).o(new t(phoneNumber, invitationCode, sessionId, otp, z10));
                } else {
                    ((pl) registrationOtpVerificationFragment.q()).f5785x.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return Unit.f23355a;
            case 3:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = registrationOtpVerificationFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = registrationOtpVerificationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 4:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    RegistrationOtpVerificationFragment.H(registrationOtpVerificationFragment);
                }
                pl plVar = (pl) registrationOtpVerificationFragment.q();
                Intrinsics.c(num);
                int intValue = num.intValue();
                if (intValue < 10) {
                    n10 = jr.h.n("00:0", intValue);
                } else {
                    n10 = jr.h.n("00:", intValue);
                }
                plVar.E.setText(n10);
                return Unit.f23355a;
            default:
                a((CountrySelectDto) obj);
                return Unit.f23355a;
        }
    }
}
