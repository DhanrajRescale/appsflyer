package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tn extends sn {
    public static final SparseIntArray P;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.stock_nested_scroll_view, 14);
        sparseIntArray.put(R.id.price_volume_title, 15);
        sparseIntArray.put(R.id.price_volume_data_narration_icon, 16);
        sparseIntArray.put(R.id.trading_view_web_view, 17);
        sparseIntArray.put(R.id.ohlc_container, 18);
        sparseIntArray.put(R.id.open_title, 19);
        sparseIntArray.put(R.id.high_title, 20);
        sparseIntArray.put(R.id.low_title, 21);
        sparseIntArray.put(R.id.prev_close_title, 22);
        sparseIntArray.put(R.id.fifty_two_wk_high_title, 23);
        sparseIntArray.put(R.id.fifty_two_wk_low_title, 24);
        sparseIntArray.put(R.id.pe_data_title, 25);
        sparseIntArray.put(R.id.pe_data_narration_icon, 26);
        sparseIntArray.put(R.id.pe_interval_tab_layout, 27);
        sparseIntArray.put(R.id.no_data_icon, 28);
        sparseIntArray.put(R.id.pb_data_title, 29);
        sparseIntArray.put(R.id.pb_data_narration_icon, 30);
        sparseIntArray.put(R.id.pb_interval_tab_layout, 31);
        sparseIntArray.put(R.id.pb_no_data_icon, 32);
        sparseIntArray.put(R.id.news_and_event_layout, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.tn.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.O != 0) {
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
            this.O = 64L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.O |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.O |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.O |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.O |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }
}
