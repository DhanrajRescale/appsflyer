package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class vr extends ur {
    public static final h.c O;
    public static final SparseIntArray P;
    public long N;

    static {
        h.c cVar = new h.c(22);
        O = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_league_portfolio_snapshot}, new String[]{"layout_league_portfolio_snapshot"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_disclaimer, 3);
        sparseIntArray.put(R.id.portfolio_name_container, 4);
        sparseIntArray.put(R.id.portfolio_name, 5);
        sparseIntArray.put(R.id.invite_friends, 6);
        sparseIntArray.put(R.id.pending_order_message_container, 7);
        sparseIntArray.put(R.id.image, 8);
        sparseIntArray.put(R.id.order_pending_text, 9);
        sparseIntArray.put(R.id.cancelled_task_message_container, 10);
        sparseIntArray.put(R.id.portfolio_secondary_information_container, 11);
        sparseIntArray.put(R.id.realised_profit_label, 12);
        sparseIntArray.put(R.id.realised_profit, 13);
        sparseIntArray.put(R.id.unrealised_profit_label, 14);
        sparseIntArray.put(R.id.unrealised_profit, 15);
        sparseIntArray.put(R.id.transaction_charges_label, 16);
        sparseIntArray.put(R.id.transaction_charges_container, 17);
        sparseIntArray.put(R.id.pending_order_amount, 18);
        sparseIntArray.put(R.id.asset_text, 19);
        sparseIntArray.put(R.id.portfolio_stock_recycler_view, 20);
        sparseIntArray.put(R.id.portfolio_frozen_stock_recycler_view, 21);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.N = 0L;
        }
        this.f6351w.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                if (this.f6351w.f()) {
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
            this.N = 2L;
        }
        this.f6351w.h();
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
            this.N |= 1;
        }
        return true;
    }
}
