package xf;

import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycVerificationRejectedViewModel f40246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(KycVerificationRejectedViewModel kycVerificationRejectedViewModel, int i10) {
        super(1);
        this.f40245a = i10;
        this.f40246b = kycVerificationRejectedViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40245a;
        KycVerificationRejectedViewModel kycVerificationRejectedViewModel = this.f40246b;
        switch (i10) {
            case 0:
                KycResponseDto kycResponseDto = (KycResponseDto) obj;
                kycVerificationRejectedViewModel.f9084g.postValue(Boolean.FALSE);
                if (Intrinsics.a(kycResponseDto.getStatus(), "pending")) {
                    kycVerificationRejectedViewModel.f9700o.postValue(kycResponseDto);
                }
                return Unit.f23355a;
            default:
                kycVerificationRejectedViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
