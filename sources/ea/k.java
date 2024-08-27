package ea;

import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpViewModel;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycHostViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedViewModel;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailViewModel;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansViewModel;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PaymentRepository f15205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(kq.e eVar, ct.a aVar, PaymentRepository paymentRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15201a = i10;
        this.f15202b = eVar;
        this.f15203c = aVar;
        this.f15205e = paymentRepository;
        this.f15204d = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15201a;
        UserRepository userRepository = this.f15204d;
        PaymentRepository paymentRepository = this.f15205e;
        ct.a aVar = this.f15203c;
        pj.a aVar2 = this.f15202b;
        switch (i10) {
            case 0:
                return new KycHostViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 1:
                return new PaymentWithdrawalViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 2:
                switch (i10) {
                    case 2:
                        return new RedemptionHostViewModel(paymentRepository, userRepository, aVar2, aVar);
                    default:
                        return new RedemptionHostViewModel(paymentRepository, userRepository, aVar2, aVar);
                }
            case 3:
                return new StockGroHelpViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 4:
                return new WithdrawableLimitViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 5:
                return new KycFAQViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 6:
                return new KycVerificationRejectedViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 7:
                return new OtherSubscriptionPlansViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 8:
                return new MySubscriptionViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 9:
                switch (i10) {
                    case 2:
                        return new RedemptionHostViewModel(paymentRepository, userRepository, aVar2, aVar);
                    default:
                        return new RedemptionHostViewModel(paymentRepository, userRepository, aVar2, aVar);
                }
            case 10:
                return new SubscriptionDowngradePromptViewModel(paymentRepository, userRepository, aVar2, aVar);
            case 11:
                return new WalletTransactionDetailViewModel(paymentRepository, userRepository, aVar2, aVar);
            default:
                return new WalletTransactionListViewModel(paymentRepository, userRepository, aVar2, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(pj.a aVar, ct.a aVar2, UserRepository userRepository, PaymentRepository paymentRepository, int i10) {
        super(0);
        this.f15201a = i10;
        this.f15202b = aVar;
        this.f15203c = aVar2;
        this.f15204d = userRepository;
        this.f15205e = paymentRepository;
    }
}
