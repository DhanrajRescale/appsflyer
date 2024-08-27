package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ze extends ye {
    public static final SparseIntArray N;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_spinner, 1);
        sparseIntArray.put(R.id.portfolio_name, 2);
        sparseIntArray.put(R.id.cash_balance_label, 3);
        sparseIntArray.put(R.id.portfolio_amount, 4);
        sparseIntArray.put(R.id.short_sell_chip, 5);
        sparseIntArray.put(R.id.order_input_view, 6);
        sparseIntArray.put(R.id.stock_quantity_input_view, 7);
        sparseIntArray.put(R.id.price_input_view, 8);
        sparseIntArray.put(R.id.total_amount_input_view, 9);
        sparseIntArray.put(R.id.container, 10);
        sparseIntArray.put(R.id.regular_check_button, 11);
        sparseIntArray.put(R.id.regular_label, 12);
        sparseIntArray.put(R.id.bracket_order_check_button, 13);
        sparseIntArray.put(R.id.bracket_order_label, 14);
        sparseIntArray.put(R.id.bracket_order_layout, 15);
        sparseIntArray.put(R.id.stop_loss_delta_input_view, 16);
        sparseIntArray.put(R.id.stop_loss_percentage_input_view, 17);
        sparseIntArray.put(R.id.stop_loss_amount_input_view, 18);
        sparseIntArray.put(R.id.book_profit_delta_input_view, 19);
        sparseIntArray.put(R.id.book_profit_percentage_input_view, 20);
        sparseIntArray.put(R.id.book_profit_amount_input_view, 21);
        sparseIntArray.put(R.id.product_input_view, 22);
        sparseIntArray.put(R.id.validity_input_view, 23);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.M != 0) {
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
            this.M = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
