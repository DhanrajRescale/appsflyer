package bb;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ba.pl;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpFragment;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import q6.l;
import vt.y;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForgotPinOtpFragment f6910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ForgotPinOtpFragment forgotPinOtpFragment, int i10) {
        super(1);
        this.f6909a = i10;
        this.f6910b = forgotPinOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String n10;
        int i10 = this.f6909a;
        Unit unit = null;
        ForgotPinOtpFragment forgotPinOtpFragment = this.f6910b;
        switch (i10) {
            case 0:
                int i11 = ForgotPinOtpFragment.f8733j;
                ((pl) forgotPinOtpFragment.q()).f5785x.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                CardView[] cardViewArr = {((pl) forgotPinOtpFragment.q()).f5783v, ((pl) forgotPinOtpFragment.q()).f5787z, ((pl) forgotPinOtpFragment.q()).D};
                for (int i12 = 0; i12 < 3; i12++) {
                    CardView cardView = cardViewArr[i12];
                    cardView.setClickable(false);
                    cardView.setEnabled(false);
                    cardView.setAlpha(0.5f);
                }
                return Unit.f23355a;
            case 1:
                List<OtpChannel> otpChannels = ((CountrySelectDto) obj).getOtpChannels();
                int size = otpChannels.size();
                if (size == 1 || size == 2 || size == 3) {
                    int i13 = ForgotPinOtpFragment.f8733j;
                    forgotPinOtpFragment.getClass();
                    int i14 = 0;
                    for (Object obj2 : otpChannels) {
                        int i15 = i14 + 1;
                        if (i14 >= 0) {
                            OtpChannel otpChannel = (OtpChannel) obj2;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        TextView thirdOptionText = ((pl) forgotPinOtpFragment.q()).C;
                                        Intrinsics.checkNotNullExpressionValue(thirdOptionText, "thirdOptionText");
                                        CardView thirdOtpChoice = ((pl) forgotPinOtpFragment.q()).D;
                                        Intrinsics.checkNotNullExpressionValue(thirdOtpChoice, "thirdOtpChoice");
                                        String name = otpChannel.getName();
                                        TextView textOr2 = ((pl) forgotPinOtpFragment.q()).B;
                                        Intrinsics.checkNotNullExpressionValue(textOr2, "textOr2");
                                        CardView thirdOtpChoice2 = ((pl) forgotPinOtpFragment.q()).D;
                                        Intrinsics.checkNotNullExpressionValue(thirdOtpChoice2, "thirdOtpChoice");
                                        forgotPinOtpFragment.I(thirdOptionText, thirdOtpChoice, name, new View[]{textOr2, thirdOtpChoice2});
                                    }
                                } else {
                                    TextView secondOptionText = ((pl) forgotPinOtpFragment.q()).f5786y;
                                    Intrinsics.checkNotNullExpressionValue(secondOptionText, "secondOptionText");
                                    CardView secondOtpChoice = ((pl) forgotPinOtpFragment.q()).f5787z;
                                    Intrinsics.checkNotNullExpressionValue(secondOtpChoice, "secondOtpChoice");
                                    String name2 = otpChannel.getName();
                                    TextView textOr = ((pl) forgotPinOtpFragment.q()).A;
                                    Intrinsics.checkNotNullExpressionValue(textOr, "textOr");
                                    CardView secondOtpChoice2 = ((pl) forgotPinOtpFragment.q()).f5787z;
                                    Intrinsics.checkNotNullExpressionValue(secondOtpChoice2, "secondOtpChoice");
                                    forgotPinOtpFragment.I(secondOptionText, secondOtpChoice, name2, new View[]{textOr, secondOtpChoice2});
                                }
                            } else {
                                TextView firstOptionText = ((pl) forgotPinOtpFragment.q()).f5782u;
                                Intrinsics.checkNotNullExpressionValue(firstOptionText, "firstOptionText");
                                CardView firstOtpChoice = ((pl) forgotPinOtpFragment.q()).f5783v;
                                Intrinsics.checkNotNullExpressionValue(firstOtpChoice, "firstOtpChoice");
                                forgotPinOtpFragment.I(firstOptionText, firstOtpChoice, otpChannel.getName(), new View[0]);
                            }
                            i14 = i15;
                        } else {
                            y.j();
                            throw null;
                        }
                    }
                }
                return Unit.f23355a;
            case 2:
                j jVar = (j) ((kj.j) obj).a();
                if (jVar != null) {
                    String phoneNumber = jVar.f6928a;
                    Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                    String otp = jVar.f6929b;
                    Intrinsics.checkNotNullParameter(otp, "otp");
                    String sessionId = jVar.f6930c;
                    Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                    l.h(forgotPinOtpFragment).o(new f(phoneNumber, otp, sessionId));
                    unit = Unit.f23355a;
                }
                if (unit == null) {
                    ((pl) forgotPinOtpFragment.q()).f5785x.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return Unit.f23355a;
            case 3:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = forgotPinOtpFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = forgotPinOtpFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    ForgotPinOtpFragment.H(forgotPinOtpFragment);
                }
                pl plVar = (pl) forgotPinOtpFragment.q();
                Intrinsics.c(num);
                int intValue = num.intValue();
                if (intValue < 10) {
                    n10 = jr.h.n("00:0", intValue);
                } else {
                    n10 = jr.h.n("00:", intValue);
                }
                plVar.E.setText(n10);
                return Unit.f23355a;
        }
    }
}
