package ba;

import android.util.SparseIntArray;
import android.widget.ProgressBar;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class nh extends mh {

    /* renamed from: c0, reason: collision with root package name */
    public static final SparseIntArray f5567c0;
    public final ProgressBar Z;

    /* renamed from: a0, reason: collision with root package name */
    public ed f5568a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f5569b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5567c0 = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 17);
        sparseIntArray.put(R.id.toolbar, 18);
        sparseIntArray.put(R.id.header, 19);
        sparseIntArray.put(R.id.option_overview_container, 20);
        sparseIntArray.put(R.id.secondary_header, 21);
        sparseIntArray.put(R.id.show_ohlc, 22);
        sparseIntArray.put(R.id.contract_change_view, 23);
        sparseIntArray.put(R.id.ohlc_top_space, 24);
        sparseIntArray.put(R.id.olhc_loader, 25);
        sparseIntArray.put(R.id.ohlc_divider_one, 26);
        sparseIntArray.put(R.id.open_title, 27);
        sparseIntArray.put(R.id.high_title, 28);
        sparseIntArray.put(R.id.low_title, 29);
        sparseIntArray.put(R.id.prev_close_title, 30);
        sparseIntArray.put(R.id.ohlc_divider_two, 31);
        sparseIntArray.put(R.id.history_chart, 32);
        sparseIntArray.put(R.id.no_history_data_message, 33);
        sparseIntArray.put(R.id.history_data_selector, 34);
        sparseIntArray.put(R.id.one_day, 35);
        sparseIntArray.put(R.id.one_week, 36);
        sparseIntArray.put(R.id.nestedScrollView, 37);
        sparseIntArray.put(R.id.break_even_chart_title, 38);
        sparseIntArray.put(R.id.narration_icon, 39);
        sparseIntArray.put(R.id.break_even_chart, 40);
        sparseIntArray.put(R.id.break_even_point_title, 41);
        sparseIntArray.put(R.id.break_even_point, 42);
        sparseIntArray.put(R.id.expected_pl_title, 43);
        sparseIntArray.put(R.id.expected_pl, 44);
        sparseIntArray.put(R.id.break_even_chart_not_plottable_container, 45);
        sparseIntArray.put(R.id.break_even_chart_not_plottable_illustration, 46);
        sparseIntArray.put(R.id.break_even_chart_not_plottable_message, 47);
        sparseIntArray.put(R.id.expiry_date_container, 48);
        sparseIntArray.put(R.id.expiry_date_separator, 49);
        sparseIntArray.put(R.id.expiry_date_title, 50);
        sparseIntArray.put(R.id.expiry_date_chip_group, 51);
        sparseIntArray.put(R.id.strike_price_container, 52);
        sparseIntArray.put(R.id.strike_price_separator, 53);
        sparseIntArray.put(R.id.strike_price_title, 54);
        sparseIntArray.put(R.id.scrollable_ruler_view, 55);
        sparseIntArray.put(R.id.additional_info_container, 56);
        sparseIntArray.put(R.id.additional_info_separator, 57);
        sparseIntArray.put(R.id.add_info_title, 58);
        sparseIntArray.put(R.id.add_info_price_title, 59);
        sparseIntArray.put(R.id.add_info_lot_size_title, 60);
        sparseIntArray.put(R.id.add_info_total_margin_title, 61);
        sparseIntArray.put(R.id.additional_info_bottom_separator, 62);
        sparseIntArray.put(R.id.action_button_container, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nh(android.view.View r38) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.nh.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.nh.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5569b0 != 0) {
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
            this.f5569b0 = 512L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 1;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 2;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 4;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 8;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 16;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 32;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 64;
                }
                return true;
            case 7:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5569b0 |= 128;
                }
                return true;
            default:
                return false;
        }
    }
}
