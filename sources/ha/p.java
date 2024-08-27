package ha;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.OptionHistoryDto;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionDetailViewModel f18103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(OptionDetailViewModel optionDetailViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f18103b = optionDetailViewModel;
        this.f18104c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f18103b, this.f18104c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        OptionHistoryDto optionHistoryDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18102a;
        OptionDetailViewModel optionDetailViewModel = this.f18103b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            FnoRepository fnoRepository = optionDetailViewModel.f8593n;
            this.f18102a = 1;
            obj = fnoRepository.getOptionOhlcHistory(this.f18104c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        optionDetailViewModel.f8605z.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (optionHistoryDto = (OptionHistoryDto) baseResponseDto.getData()) != null) {
            optionDetailViewModel.L = optionHistoryDto.toOptionHistory();
            optionDetailViewModel.f8597r.postValue(optionHistoryDto.toOptionHistory());
            optionDetailViewModel.k(optionDetailViewModel.K);
        }
        return Unit.f23355a;
    }
}
