package ka;

import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOrderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class o0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OptionContract f22870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f22874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22875h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f22876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f22877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z10, g1 g1Var, OptionContract optionContract, g1 g1Var2, g1 g1Var3, g1 g1Var4, hu.c cVar, g1 g1Var5, g1 g1Var6, g1 g1Var7) {
        super(0);
        this.f22868a = z10;
        this.f22869b = g1Var;
        this.f22870c = optionContract;
        this.f22871d = g1Var2;
        this.f22872e = g1Var3;
        this.f22873f = g1Var4;
        this.f22874g = cVar;
        this.f22875h = g1Var5;
        this.f22876i = g1Var6;
        this.f22877j = g1Var7;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str;
        OptionOrderType optionOrderType;
        if (((Boolean) this.f22875h.getValue()).booleanValue()) {
            str = "Market";
        } else {
            str = "Limit";
        }
        String str2 = str;
        if (this.f22868a) {
            optionOrderType = OptionOrderType.SELL;
        } else {
            optionOrderType = OptionOrderType.BUY;
        }
        g1 g1Var = this.f22876i;
        String portfolioId = ((FnoPortfolio) g1Var.getValue()).getPortfolioId();
        double doubleValue = ((Number) this.f22869b.getValue()).doubleValue();
        BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = new BuySellModifyFnoRequestDto(null, portfolioId, null, this.f22870c.getIdentifier(), null, Double.valueOf(doubleValue), ((Number) this.f22871d.getValue()).intValue(), str2, false, 277, null);
        if (((Boolean) this.f22877j.getValue()).booleanValue()) {
            buySellModifyFnoRequestDto.setStopLossPercentage(kotlin.text.q.e((String) this.f22872e.getValue()));
            buySellModifyFnoRequestDto.setBookProfitPercentage(kotlin.text.q.e((String) this.f22873f.getValue()));
        }
        this.f22874g.b(OptionOrderType.INSTANCE.toOptionOrderTypeString(optionOrderType), Double.valueOf(((FnoPortfolio) g1Var.getValue()).getCashBalance()), buySellModifyFnoRequestDto);
        return Unit.f23355a;
    }
}
