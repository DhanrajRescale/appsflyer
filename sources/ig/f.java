package ig;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioDetailViewModel f19976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jg.a f19977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PortfolioDetailViewModel portfolioDetailViewModel, jg.a aVar, yt.a aVar2) {
        super(2, aVar2);
        this.f19976b = portfolioDetailViewModel;
        this.f19977c = aVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f19976b, this.f19977c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        jg.b bVar;
        BottomSheetItem bottomSheetItem;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19975a;
        jg.a aVar2 = this.f19977c;
        PortfolioDetailViewModel portfolioDetailViewModel = this.f19976b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            PortfolioRepository portfolioRepository = portfolioDetailViewModel.f9777n;
            this.f19975a = 1;
            obj = portfolioRepository.modifyFnoPortfolio("rename", aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (bVar = (jg.b) baseResponseDto.getData()) != null) {
            portfolioDetailViewModel.N.postValue(bVar);
            e0 e0Var = portfolioDetailViewModel.f9780q;
            String b10 = aVar2.b();
            if (b10 != null) {
                bottomSheetItem = new BottomSheetItem(b10, aVar2.a());
            } else {
                bottomSheetItem = null;
            }
            e0Var.postValue(bottomSheetItem);
        }
        return Unit.f23355a;
    }
}
