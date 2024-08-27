package ji;

import ba.un;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderViewModel;
import ij.p;
import iu.k;
import iu.v;
import iu.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockCoverOrderFragment f21398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StockCoverOrderFragment stockCoverOrderFragment, int i10) {
        super(1);
        this.f21397a = i10;
        this.f21398b = stockCoverOrderFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f21397a;
        int i11 = 8;
        StockCoverOrderFragment stockCoverOrderFragment = this.f21398b;
        switch (i10) {
            case 2:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((un) stockCoverOrderFragment.q()).f6337y.setVisibility(0);
                    ((un) stockCoverOrderFragment.q()).f6332t.setVisibility(4);
                } else {
                    ((un) stockCoverOrderFragment.q()).f6337y.setVisibility(8);
                    ((un) stockCoverOrderFragment.q()).f6332t.setVisibility(0);
                }
                ((un) stockCoverOrderFragment.q()).A.setEnabled(!bool.booleanValue());
                return;
            default:
                un unVar = (un) stockCoverOrderFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                unVar.A.setVisibility(i11);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double d10;
        int i10 = this.f21397a;
        StockCoverOrderFragment stockCoverOrderFragment = this.f21398b;
        switch (i10) {
            case 0:
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) obj;
                un unVar = (un) stockCoverOrderFragment.q();
                unVar.B.m(stockSellSelectOrderResponseDto.getStockPrice(), stockSellSelectOrderResponseDto.getStockName(), stockSellSelectOrderResponseDto.getStockImage());
                ((un) stockCoverOrderFragment.q()).B.n(stockSellSelectOrderResponseDto.getChange());
                ((un) stockCoverOrderFragment.q()).f6336x.setPrice(Double.valueOf(stockSellSelectOrderResponseDto.getStockPrice()));
                ((un) stockCoverOrderFragment.q()).f6338z.setDisplayValue(String.valueOf(stockSellSelectOrderResponseDto.getCoverRemainingQuantity()));
                x xVar = new x();
                xVar.f20558a = -1;
                v vVar = new v();
                ((un) stockCoverOrderFragment.q()).f6331s.a(new b(xVar, stockCoverOrderFragment, vVar, 0));
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                if (portfolio != null) {
                    ((un) stockCoverOrderFragment.q()).f6335w.setText(portfolio.getPortfolioName());
                    ((un) stockCoverOrderFragment.q()).f6334v.setText(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                }
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                String str = (String) obj;
                if (Intrinsics.a(str, "Market")) {
                    un unVar2 = (un) stockCoverOrderFragment.q();
                    StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) ((StockCoverOrderViewModel) stockCoverOrderFragment.r()).f10176r.getValue();
                    if (stockSellSelectOrderResponseDto2 != null) {
                        d10 = Double.valueOf(stockSellSelectOrderResponseDto2.getStockPrice());
                    } else {
                        d10 = null;
                    }
                    unVar2.f6336x.setPrice(d10);
                    ((un) stockCoverOrderFragment.q()).f6336x.p();
                } else if (Intrinsics.a(str, "Limit")) {
                    ((un) stockCoverOrderFragment.q()).f6336x.q();
                }
                return Unit.f23355a;
            case 4:
                g gVar = (g) obj;
                if (!gVar.f21406a.f20086a) {
                    ((un) stockCoverOrderFragment.q()).f6338z.setErrorText(gVar.f21406a.f20087b);
                } else {
                    ((un) stockCoverOrderFragment.q()).f6338z.m();
                }
                p pVar = gVar.f21407b;
                if (!pVar.f20086a) {
                    ((un) stockCoverOrderFragment.q()).f6336x.setError(pVar.f20087b);
                } else {
                    ((un) stockCoverOrderFragment.q()).f6336x.n();
                }
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
