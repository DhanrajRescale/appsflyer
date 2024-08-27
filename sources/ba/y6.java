package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class y6 extends x6 {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 1);
        sparseIntArray.put(R.id.sector_stock_image, 2);
        sparseIntArray.put(R.id.sector_stock_name, 3);
        sparseIntArray.put(R.id.short_chip, 4);
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
    public y6(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
