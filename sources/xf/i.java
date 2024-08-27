package xf;

import com.assetgro.stockgro.data.model.KycFAQ;
import com.assetgro.stockgro.data.model.KycFAQResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycFAQViewModel f40217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KycFAQViewModel kycFAQViewModel, int i10) {
        super(1);
        this.f40216a = i10;
        this.f40217b = kycFAQViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<KycFAQ> faqs;
        int i10 = this.f40216a;
        KycFAQViewModel kycFAQViewModel = this.f40217b;
        switch (i10) {
            case 0:
                kycFAQViewModel.f9084g.postValue(Boolean.FALSE);
                KycFAQResponse kycFAQResponse = (KycFAQResponse) ((BaseResponseDto) obj).getData();
                if (kycFAQResponse != null && (faqs = kycFAQResponse.getFaqs()) != null) {
                    kycFAQViewModel.f9668o.postValue(new kj.j(faqs));
                }
                return Unit.f23355a;
            default:
                kycFAQViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
