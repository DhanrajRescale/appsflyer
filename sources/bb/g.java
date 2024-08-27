package bb;

import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForgotPinOtpViewModel f6919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ForgotPinOtpViewModel forgotPinOtpViewModel, int i10) {
        super(1);
        this.f6918a = i10;
        this.f6919b = forgotPinOtpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f6918a;
        ForgotPinOtpViewModel forgotPinOtpViewModel = this.f6919b;
        switch (i10) {
            case 0:
                Integer timePassed = (Integer) obj;
                Intrinsics.checkNotNullParameter(timePassed, "timePassed");
                return Integer.valueOf(forgotPinOtpViewModel.f8737n - timePassed.intValue());
            default:
                forgotPinOtpViewModel.f8742s.postValue((Integer) obj);
                return Unit.f23355a;
        }
    }
}
