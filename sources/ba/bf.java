package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class bf extends af {
    public static final SparseIntArray Q;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.data_container, 1);
        sparseIntArray.put(R.id.portfolio_spinner, 2);
        sparseIntArray.put(R.id.portfolio_select_tutorial_icon, 3);
        sparseIntArray.put(R.id.portfolio_select_tutorial_desc, 4);
        sparseIntArray.put(R.id.portfolio_name, 5);
        sparseIntArray.put(R.id.cash_balance_label, 6);
        sparseIntArray.put(R.id.portfolio_amount, 7);
        sparseIntArray.put(R.id.order_input_view, 8);
        sparseIntArray.put(R.id.stock_quantity_input_view, 9);
        sparseIntArray.put(R.id.price_input_view, 10);
        sparseIntArray.put(R.id.total_amount_input_view, 11);
        sparseIntArray.put(R.id.container, 12);
        sparseIntArray.put(R.id.regular_check_button, 13);
        sparseIntArray.put(R.id.regular_label, 14);
        sparseIntArray.put(R.id.bracket_order_check_button, 15);
        sparseIntArray.put(R.id.bracket_order_label, 16);
        sparseIntArray.put(R.id.bracket_order_layout, 17);
        sparseIntArray.put(R.id.stop_loss_delta_input_view, 18);
        sparseIntArray.put(R.id.stop_loss_percentage_input_view, 19);
        sparseIntArray.put(R.id.stop_loss_amount_input_view, 20);
        sparseIntArray.put(R.id.book_profit_delta_input_view, 21);
        sparseIntArray.put(R.id.book_profit_percentage_input_view, 22);
        sparseIntArray.put(R.id.book_profit_amount_input_view, 23);
        sparseIntArray.put(R.id.product_input_view, 24);
        sparseIntArray.put(R.id.validity_input_view, 25);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.P != 0) {
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
            this.P = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
