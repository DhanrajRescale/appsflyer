package ri;

import ba.zk;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderViewModel;
import ij.p;
import iu.v;
import iu.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyStockCoverOrderFragment f33767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ModifyStockCoverOrderFragment modifyStockCoverOrderFragment, int i10) {
        super(1);
        this.f33766a = i10;
        this.f33767b = modifyStockCoverOrderFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f33766a;
        int i11 = 8;
        ModifyStockCoverOrderFragment modifyStockCoverOrderFragment = this.f33767b;
        switch (i10) {
            case 0:
                zk zkVar = (zk) modifyStockCoverOrderFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                zkVar.A.setVisibility(i11);
                return;
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((zk) modifyStockCoverOrderFragment.q()).f6862y.setVisibility(0);
                    ((zk) modifyStockCoverOrderFragment.q()).f6857t.setVisibility(4);
                } else {
                    ((zk) modifyStockCoverOrderFragment.q()).f6862y.setVisibility(8);
                    ((zk) modifyStockCoverOrderFragment.q()).f6857t.setVisibility(0);
                }
                ((zk) modifyStockCoverOrderFragment.q()).A.setEnabled(!bool.booleanValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StockDto stockDto;
        int i10 = this.f33766a;
        int i11 = 1;
        ModifyStockCoverOrderFragment modifyStockCoverOrderFragment = this.f33767b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                ((zk) modifyStockCoverOrderFragment.q()).f6860w.setText(portfolio.getPortfolioName());
                ((zk) modifyStockCoverOrderFragment.q()).f6859v.setText(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                return Unit.f23355a;
            case 2:
                StockDto stockDto2 = ((StockDetailDto) obj).getStockDto();
                ((zk) modifyStockCoverOrderFragment.q()).B.m(stockDto2.getLtp(), stockDto2.getName(), stockDto2.getImageUrl());
                ChangeDto change = stockDto2.getChange();
                if (change != null) {
                    ((zk) modifyStockCoverOrderFragment.q()).B.n(change);
                }
                ((zk) modifyStockCoverOrderFragment.q()).f6861x.setPrice(Double.valueOf(stockDto2.getLtp()));
                x xVar = new x();
                xVar.f20558a = -1;
                ((zk) modifyStockCoverOrderFragment.q()).f6856s.a(new ji.b(xVar, modifyStockCoverOrderFragment, new v(), i11));
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                String str = (String) obj;
                if (Intrinsics.a(str, "Market")) {
                    StockDetailDto stockDetailDto = (StockDetailDto) ((ModifyStockCoverOrderViewModel) modifyStockCoverOrderFragment.r()).f10324s.getValue();
                    if (stockDetailDto != null && (stockDto = stockDetailDto.getStockDto()) != null) {
                        ((zk) modifyStockCoverOrderFragment.q()).f6861x.setPrice(Double.valueOf(stockDto.getLtp()));
                        ((zk) modifyStockCoverOrderFragment.q()).f6861x.p();
                        ((zk) modifyStockCoverOrderFragment.q()).f6858u.getTabOne().performClick();
                    }
                } else if (Intrinsics.a(str, "Limit")) {
                    ((zk) modifyStockCoverOrderFragment.q()).f6861x.q();
                    ((zk) modifyStockCoverOrderFragment.q()).f6858u.getTabTwo().performClick();
                } else {
                    ((zk) modifyStockCoverOrderFragment.q()).f6861x.p();
                }
                return Unit.f23355a;
            case 5:
                l lVar = (l) ((kj.j) obj).a();
                if (lVar != null) {
                    p pVar = lVar.f33779a;
                    if (!pVar.f20086a) {
                        ((zk) modifyStockCoverOrderFragment.q()).f6863z.setErrorText(pVar.f20087b);
                    } else {
                        ((zk) modifyStockCoverOrderFragment.q()).f6863z.m();
                    }
                    p pVar2 = lVar.f33780b;
                    if (!pVar2.f20086a) {
                        ((zk) modifyStockCoverOrderFragment.q()).f6861x.setError(pVar2.f20087b);
                    } else {
                        ((zk) modifyStockCoverOrderFragment.q()).f6861x.n();
                    }
                }
                return Unit.f23355a;
            case 6:
                ((zk) modifyStockCoverOrderFragment.q()).f6863z.setDisplayValue(String.valueOf(((StockModifyInfoDto) obj).getQuantity()));
                return Unit.f23355a;
            default:
                ((zk) modifyStockCoverOrderFragment.q()).f6861x.setPrice((Double) obj);
                return Unit.f23355a;
        }
    }
}
