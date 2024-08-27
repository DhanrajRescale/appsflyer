package vi;

import ba.to;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.ui.stock.sell.StockSellFragment;
import com.assetgro.stockgro.ui.stock.sell.StockSellViewModel;
import ij.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockSellFragment f38086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockSellFragment stockSellFragment, int i10) {
        super(1);
        this.f38085a = i10;
        this.f38086b = stockSellFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f38085a;
        int i11 = 8;
        StockSellFragment stockSellFragment = this.f38086b;
        switch (i10) {
            case 2:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((to) stockSellFragment.q()).f6217x.setVisibility(0);
                    ((to) stockSellFragment.q()).f6212s.setVisibility(4);
                } else {
                    ((to) stockSellFragment.q()).f6217x.setVisibility(8);
                    ((to) stockSellFragment.q()).f6212s.setVisibility(0);
                }
                ((to) stockSellFragment.q()).f6219z.setEnabled(!bool.booleanValue());
                return;
            default:
                to toVar = (to) stockSellFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                toVar.f6219z.setVisibility(i11);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double d10;
        int i10 = this.f38085a;
        StockSellFragment stockSellFragment = this.f38086b;
        switch (i10) {
            case 0:
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) obj;
                to toVar = (to) stockSellFragment.q();
                toVar.A.m(stockSellSelectOrderResponseDto.getStockPrice(), stockSellSelectOrderResponseDto.getStockName(), stockSellSelectOrderResponseDto.getStockImage());
                ((to) stockSellFragment.q()).A.n(stockSellSelectOrderResponseDto.getChange());
                ((to) stockSellFragment.q()).f6216w.setPrice(Double.valueOf(stockSellSelectOrderResponseDto.getStockPrice()));
                ((to) stockSellFragment.q()).f6218y.setDisplayValue(String.valueOf(stockSellSelectOrderResponseDto.getRemainingQuantity()));
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                if (portfolio != null) {
                    ((to) stockSellFragment.q()).f6215v.setText(portfolio.getPortfolioName());
                    Double valueOf = Double.valueOf(portfolio.getCashBalance());
                    if (valueOf != null) {
                        double doubleValue = valueOf.doubleValue();
                        ((to) stockSellFragment.q()).f6214u.setText(ij.h.m(ij.h.f20067a, doubleValue));
                    }
                }
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                String str = (String) obj;
                if (Intrinsics.a(str, "Market")) {
                    to toVar2 = (to) stockSellFragment.q();
                    StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) ((StockSellViewModel) stockSellFragment.r()).f10402r.getValue();
                    if (stockSellSelectOrderResponseDto2 != null) {
                        d10 = Double.valueOf(stockSellSelectOrderResponseDto2.getStockPrice());
                    } else {
                        d10 = null;
                    }
                    toVar2.f6216w.setPrice(d10);
                    ((to) stockSellFragment.q()).f6216w.p();
                } else if (Intrinsics.a(str, "Limit")) {
                    ((to) stockSellFragment.q()).f6216w.q();
                }
                return Unit.f23355a;
            case 4:
                l lVar = (l) obj;
                if (!lVar.f38103a.f20086a) {
                    ((to) stockSellFragment.q()).f6218y.setErrorText(lVar.f38103a.f20087b);
                } else {
                    ((to) stockSellFragment.q()).f6218y.m();
                }
                p pVar = lVar.f38104b;
                if (!pVar.f20086a) {
                    ((to) stockSellFragment.q()).f6216w.setError(pVar.f20087b);
                } else {
                    ((to) stockSellFragment.q()).f6216w.n();
                }
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
