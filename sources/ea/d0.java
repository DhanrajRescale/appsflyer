package ea;

import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.filter.PinRetryBottomSheetViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PaymentRepository f15137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(kq.e eVar, ct.a aVar, PaymentRepository paymentRepository, int i10) {
        super(0);
        this.f15134a = i10;
        this.f15135b = eVar;
        this.f15136c = aVar;
        this.f15137d = paymentRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15134a;
        ct.a aVar = this.f15136c;
        pj.a aVar2 = this.f15135b;
        PaymentRepository paymentRepository = this.f15137d;
        switch (i10) {
            case 0:
                return new PaymentWithdrawalOTPVerifyViewModel(aVar2, aVar, paymentRepository);
            default:
                return new PinRetryBottomSheetViewModel(aVar2, aVar, paymentRepository);
        }
    }
}
