package si;

import ba.to;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifySellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifyStockSellViewModel;
import ij.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifySellOrderFragment f34635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ModifySellOrderFragment modifySellOrderFragment, int i10) {
        super(1);
        this.f34634a = i10;
        this.f34635b = modifySellOrderFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f34634a;
        int i11 = 8;
        ModifySellOrderFragment modifySellOrderFragment = this.f34635b;
        switch (i10) {
            case 0:
                to toVar = (to) modifySellOrderFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                toVar.f6219z.setVisibility(i11);
                return;
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((to) modifySellOrderFragment.q()).f6217x.setVisibility(0);
                    ((to) modifySellOrderFragment.q()).f6212s.setVisibility(4);
                } else {
                    ((to) modifySellOrderFragment.q()).f6217x.setVisibility(8);
                    ((to) modifySellOrderFragment.q()).f6212s.setVisibility(0);
                }
                ((to) modifySellOrderFragment.q()).f6219z.setEnabled(!bool.booleanValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StockDto stockDto;
        int i10 = this.f34634a;
        ModifySellOrderFragment modifySellOrderFragment = this.f34635b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                ((to) modifySellOrderFragment.q()).f6215v.setText(portfolio.getPortfolioName());
                ((to) modifySellOrderFragment.q()).f6214u.setText(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                return Unit.f23355a;
            case 2:
                StockDto stockDto2 = ((StockDetailDto) obj).getStockDto();
                ((to) modifySellOrderFragment.q()).A.m(stockDto2.getLtp(), stockDto2.getName(), stockDto2.getImageUrl());
                ChangeDto change = stockDto2.getChange();
                if (change != null) {
                    ((to) modifySellOrderFragment.q()).A.n(change);
                }
                ((to) modifySellOrderFragment.q()).f6216w.setPrice(Double.valueOf(stockDto2.getLtp()));
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                String str = (String) obj;
                if (Intrinsics.a(str, "Market")) {
                    StockDetailDto stockDetailDto = (StockDetailDto) ((ModifyStockSellViewModel) modifySellOrderFragment.r()).f10340s.getValue();
                    if (stockDetailDto != null && (stockDto = stockDetailDto.getStockDto()) != null) {
                        ((to) modifySellOrderFragment.q()).f6216w.setPrice(Double.valueOf(stockDto.getLtp()));
                        ((to) modifySellOrderFragment.q()).f6216w.p();
                        ((to) modifySellOrderFragment.q()).f6213t.getTabOne().performClick();
                    }
                } else if (Intrinsics.a(str, "Limit")) {
                    ((to) modifySellOrderFragment.q()).f6216w.q();
                    ((to) modifySellOrderFragment.q()).f6213t.getTabTwo().performClick();
                } else {
                    ((to) modifySellOrderFragment.q()).f6216w.p();
                }
                return Unit.f23355a;
            case 5:
                vi.l lVar = (vi.l) ((kj.j) obj).a();
                if (lVar != null) {
                    p pVar = lVar.f38103a;
                    if (!pVar.f20086a) {
                        ((to) modifySellOrderFragment.q()).f6218y.setErrorText(pVar.f20087b);
                    } else {
                        ((to) modifySellOrderFragment.q()).f6218y.m();
                    }
                    p pVar2 = lVar.f38104b;
                    if (!pVar2.f20086a) {
                        ((to) modifySellOrderFragment.q()).f6216w.setError(pVar2.f20087b);
                    } else {
                        ((to) modifySellOrderFragment.q()).f6216w.n();
                    }
                }
                return Unit.f23355a;
            case 6:
                ((to) modifySellOrderFragment.q()).f6218y.setDisplayValue(String.valueOf(((StockModifyInfoDto) obj).getQuantity()));
                return Unit.f23355a;
            default:
                ((to) modifySellOrderFragment.q()).f6216w.setPrice((Double) obj);
                return Unit.f23355a;
        }
    }
}
