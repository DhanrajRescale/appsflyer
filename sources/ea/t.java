package ea;

import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15278a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PaymentRepository f15281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mt.p f15283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kq.e eVar, ct.a aVar, PaymentRepository paymentRepository, UserRepository userRepository, mt.p pVar) {
        super(0);
        this.f15279b = eVar;
        this.f15280c = aVar;
        this.f15281d = paymentRepository;
        this.f15282e = userRepository;
        this.f15283f = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15278a) {
            case 0:
                return new RechargeWalletViewModel(this.f15279b, this.f15280c, this.f15283f, this.f15281d, this.f15282e);
            default:
                return new WithdrawalDetailViewModel(this.f15279b, this.f15280c, this.f15281d, this.f15282e, this.f15283f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kq.e eVar, ct.a aVar, mt.p pVar, PaymentRepository paymentRepository, UserRepository userRepository) {
        super(0);
        this.f15279b = eVar;
        this.f15280c = aVar;
        this.f15283f = pVar;
        this.f15281d = paymentRepository;
        this.f15282e = userRepository;
    }
}
