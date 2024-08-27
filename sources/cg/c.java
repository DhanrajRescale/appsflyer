package cg;

import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletTransactionDetailViewModel f8135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WalletTransactionDetailViewModel walletTransactionDetailViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f8135b = walletTransactionDetailViewModel;
        this.f8136c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f8135b, this.f8136c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        TransactionDetailResponse transactionDetailResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8134a;
        WalletTransactionDetailViewModel walletTransactionDetailViewModel = this.f8135b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PaymentRepository paymentRepository = walletTransactionDetailViewModel.f9722n;
                String str = this.f8136c;
                this.f8134a = 1;
                obj = paymentRepository.getTransactionDetails(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (transactionDetailResponse = (TransactionDetailResponse) baseResponseDto.getData()) != null) {
                walletTransactionDetailViewModel.f9723o.postValue(transactionDetailResponse);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
