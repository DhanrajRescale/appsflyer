package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xe extends we {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_name, 1);
        sparseIntArray.put(R.id.cash_balance_label, 2);
        sparseIntArray.put(R.id.portfolio_amount, 3);
        sparseIntArray.put(R.id.order_input_view, 4);
        sparseIntArray.put(R.id.stock_quantity_input_view, 5);
        sparseIntArray.put(R.id.price_input_view, 6);
        sparseIntArray.put(R.id.total_amount_input_view, 7);
        sparseIntArray.put(R.id.container, 8);
        sparseIntArray.put(R.id.regular_check_button, 9);
        sparseIntArray.put(R.id.regular_label, 10);
        sparseIntArray.put(R.id.bracket_order_check_button, 11);
        sparseIntArray.put(R.id.bracket_order_label, 12);
        sparseIntArray.put(R.id.bracket_order_layout, 13);
        sparseIntArray.put(R.id.stop_loss_delta_input_view, 14);
        sparseIntArray.put(R.id.stop_loss_percentage_input_view, 15);
        sparseIntArray.put(R.id.stop_loss_amount_input_view, 16);
        sparseIntArray.put(R.id.book_profit_delta_input_view, 17);
        sparseIntArray.put(R.id.book_profit_percentage_input_view, 18);
        sparseIntArray.put(R.id.book_profit_amount_input_view, 19);
        sparseIntArray.put(R.id.product_input_view, 20);
        sparseIntArray.put(R.id.validity_input_view, 21);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.K != 0) {
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
            this.K = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
