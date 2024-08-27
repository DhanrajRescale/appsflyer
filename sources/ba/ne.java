package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ne extends me {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.details_layout, 1);
        sparseIntArray.put(R.id.offer_title, 2);
        sparseIntArray.put(R.id.offer_sub_title, 3);
        sparseIntArray.put(R.id.description, 4);
        sparseIntArray.put(R.id.layout_pricing_details, 5);
        sparseIntArray.put(R.id.layout_total_amount, 6);
        sparseIntArray.put(R.id.total_amount_value, 7);
        sparseIntArray.put(R.id.view, 8);
        sparseIntArray.put(R.id.bonus_value, 9);
        sparseIntArray.put(R.id.separator, 10);
        sparseIntArray.put(R.id.cash_value, 11);
        sparseIntArray.put(R.id.wallet_info, 12);
        sparseIntArray.put(R.id.layout_wallet_details, 13);
        sparseIntArray.put(R.id.wallet_balance, 14);
        sparseIntArray.put(R.id.wallet_bonus, 15);
        sparseIntArray.put(R.id.separator1, 16);
        sparseIntArray.put(R.id.wallet_cash, 17);
        sparseIntArray.put(R.id.error_text, 18);
        sparseIntArray.put(R.id.space, 19);
        sparseIntArray.put(R.id.no_action_container, 20);
        sparseIntArray.put(R.id.no_action_text, 21);
        sparseIntArray.put(R.id.action_container, 22);
        sparseIntArray.put(R.id.tnc_check_button, 23);
        sparseIntArray.put(R.id.tnc_label, 24);
        sparseIntArray.put(R.id.redeem_button, 25);
        sparseIntArray.put(R.id.add_cash_and_redeem_button, 26);
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
