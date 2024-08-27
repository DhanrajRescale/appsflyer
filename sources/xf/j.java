package xf;

import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.Response;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycFAQViewModel f40219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(KycFAQViewModel kycFAQViewModel, yt.a aVar) {
        super(2, aVar);
        this.f40219b = kycFAQViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f40219b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Boolean isAllowed;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40218a;
        KycFAQViewModel kycFAQViewModel = this.f40219b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                PaymentRepository paymentRepository = kycFAQViewModel.f9667n;
                this.f40218a = 1;
                obj = paymentRepository.getKycTicketStatus(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            kycFAQViewModel.f9084g.postValue(Boolean.FALSE);
            Response response = v0Var.f29302a;
            Object obj2 = v0Var.f29303b;
            if (response.isSuccessful()) {
                KycSupportTicketResponseDto kycSupportTicketResponseDto = (KycSupportTicketResponseDto) obj2;
                if (kycSupportTicketResponseDto != null && (isAllowed = kycSupportTicketResponseDto.getIsAllowed()) != null && !isAllowed.booleanValue()) {
                    KycSupportTicketResponseDto kycSupportTicketResponseDto2 = (KycSupportTicketResponseDto) obj2;
                    if (kycSupportTicketResponseDto2 != null) {
                        kycFAQViewModel.f9671r.postValue(new kj.j(kycSupportTicketResponseDto2));
                    }
                }
                kycFAQViewModel.f9669p.postValue(new kj.j(Unit.f23355a));
            }
        } catch (Exception unused) {
            kycFAQViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
