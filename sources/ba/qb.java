package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class qb extends pb {
    public static final h.c M;
    public static final SparseIntArray N;
    public long L;

    static {
        h.c cVar = new h.c(24);
        M = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_portfolio_order_details}, new String[]{"layout_portfolio_order_details"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 3);
        sparseIntArray.put(R.id.order_stock_image, 4);
        sparseIntArray.put(R.id.order_stock_name, 5);
        sparseIntArray.put(R.id.order_last_traded_price, 6);
        sparseIntArray.put(R.id.info, 7);
        sparseIntArray.put(R.id.trade_type, 8);
        sparseIntArray.put(R.id.order_type, 9);
        sparseIntArray.put(R.id.order_stock_change_info_view, 10);
        sparseIntArray.put(R.id.bid_ask_container, 11);
        sparseIntArray.put(R.id.bid_label, 12);
        sparseIntArray.put(R.id.bid, 13);
        sparseIntArray.put(R.id.ask_label, 14);
        sparseIntArray.put(R.id.ask, 15);
        sparseIntArray.put(R.id.view, 16);
        sparseIntArray.put(R.id.order_action_layout, 17);
        sparseIntArray.put(R.id.order_modify_button, 18);
        sparseIntArray.put(R.id.order_cancel_button, 19);
        sparseIntArray.put(R.id.order_date_layout, 20);
        sparseIntArray.put(R.id.order_entry_date, 21);
        sparseIntArray.put(R.id.order_execution_date, 22);
        sparseIntArray.put(R.id.order_status, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qb(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qb.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.L = 0L;
        }
        this.f5753w.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                if (this.f5753w.f()) {
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
            this.L = 2L;
        }
        this.f5753w.h();
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
            this.L |= 1;
        }
        return true;
    }
}
