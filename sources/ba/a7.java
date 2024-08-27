package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.league.option.ActivePrepZonePortfolioOptionItemViewModel;

/* loaded from: classes.dex */
public final class a7 extends z6 {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 2);
        sparseIntArray.put(R.id.stock_icon, 3);
        sparseIntArray.put(R.id.lot_info, 4);
        sparseIntArray.put(R.id.percentage_container, 5);
        sparseIntArray.put(R.id.change_percentage, 6);
        sparseIntArray.put(R.id.change_type_icon, 7);
        sparseIntArray.put(R.id.container_one, 8);
        sparseIntArray.put(R.id.total_bought_label, 9);
        sparseIntArray.put(R.id.total_bought, 10);
        sparseIntArray.put(R.id.total_sold_label, 11);
        sparseIntArray.put(R.id.total_sold, 12);
        sparseIntArray.put(R.id.profit_loss_text, 13);
        sparseIntArray.put(R.id.profit_amount, 14);
        sparseIntArray.put(R.id.container_two, 15);
        sparseIntArray.put(R.id.avg_buy_price_label, 16);
        sparseIntArray.put(R.id.avg_buy_price, 17);
        sparseIntArray.put(R.id.avg_sell_price_label, 18);
        sparseIntArray.put(R.id.avg_sell_price, 19);
        sparseIntArray.put(R.id.market_price_label, 20);
        sparseIntArray.put(R.id.market_price, 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a7(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a7.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        UnifiedStockTransaction unifiedStockTransaction;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel = this.E;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if (activePrepZonePortfolioOptionItemViewModel != null) {
                e0Var = activePrepZonePortfolioOptionItemViewModel.f9075c;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                unifiedStockTransaction = (UnifiedStockTransaction) e0Var.getValue();
            } else {
                unifiedStockTransaction = null;
            }
            if (unifiedStockTransaction != null) {
                str = unifiedStockTransaction.getContractName();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f6814w, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.G = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }
}
