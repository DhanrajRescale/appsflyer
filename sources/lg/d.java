package lg;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioFnoHistoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHistoryViewModel f24825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f24827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f24829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel, String str, Integer num, String str2, String str3, yt.a aVar) {
        super(2, aVar);
        this.f24825b = portfolioFnoHistoryViewModel;
        this.f24826c = str;
        this.f24827d = num;
        this.f24828e = str2;
        this.f24829f = str3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f24825b, this.f24826c, this.f24827d, this.f24828e, this.f24829f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f24824a;
        PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel = this.f24825b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioFnoHistoryViewModel.f9811n;
            String str = portfolioFnoHistoryViewModel.f9812o;
            String str2 = this.f24826c;
            if (str2 == null) {
                str2 = "execution_date:desc";
            }
            String str3 = str2;
            String valueOf = String.valueOf(this.f24827d);
            Portfolio portfolio = portfolioFnoHistoryViewModel.f9813p;
            if (portfolio != null) {
                bool = Boolean.valueOf(portfolio.isModelPortfolio());
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            String str4 = this.f24828e;
            String str5 = this.f24829f;
            this.f24824a = 1;
            obj = portfolioRepository.getFnoPortfolioHistory(str, str4, str3, str5, valueOf, bool2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            portfolioFnoHistoryViewModel.f9084g.setValue(Boolean.FALSE);
            PortfolioFnoHistoryData portfolioFnoHistoryData = (PortfolioFnoHistoryData) v0Var.f29303b;
            if (portfolioFnoHistoryData != null) {
                portfolioFnoHistoryViewModel.f9814q.postValue(portfolioFnoHistoryData.getData());
            }
        }
        return Unit.f23355a;
    }
}
