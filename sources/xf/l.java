package xf;

import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.ui.payments.kyc.KycHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycHostViewModel f40223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(KycHostViewModel kycHostViewModel, int i10) {
        super(1);
        this.f40222a = i10;
        this.f40223b = kycHostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40222a;
        KycHostViewModel kycHostViewModel = this.f40223b;
        switch (i10) {
            case 0:
                kycHostViewModel.h((KycResponseDto) obj);
                return Unit.f23355a;
            default:
                kycHostViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
