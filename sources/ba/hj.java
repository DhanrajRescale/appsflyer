package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class hj extends gj {
    public static final SparseIntArray O;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.stats_nested_scroll_view, 1);
        sparseIntArray.put(R.id.my_earning_image_text, 2);
        sparseIntArray.put(R.id.my_earning_container, 3);
        sparseIntArray.put(R.id.my_earning, 4);
        sparseIntArray.put(R.id.view_earning, 5);
        sparseIntArray.put(R.id.ll_league_played, 6);
        sparseIntArray.put(R.id.ll_zones_played, 7);
        sparseIntArray.put(R.id.leagues_participated, 8);
        sparseIntArray.put(R.id.leagues_won, 9);
        sparseIntArray.put(R.id.ll_strike_rate, 10);
        sparseIntArray.put(R.id.winning_percentage, 11);
        sparseIntArray.put(R.id.recent_performance_container, 12);
        sparseIntArray.put(R.id.recent_performances_label, 13);
        sparseIntArray.put(R.id.filter_click_container, 14);
        sparseIntArray.put(R.id.recent_performances_filter, 15);
        sparseIntArray.put(R.id.recent_performances_recycler_view, 16);
        sparseIntArray.put(R.id.progress_bar, 17);
        sparseIntArray.put(R.id.bottom_strip_container, 18);
        sparseIntArray.put(R.id.previous_page, 19);
        sparseIntArray.put(R.id.page_no_text, 20);
        sparseIntArray.put(R.id.next_page, 21);
        sparseIntArray.put(R.id.arrow_slider_group, 22);
        sparseIntArray.put(R.id.no_lifetime_prepzone, 23);
        sparseIntArray.put(R.id.bottom_screen_primary_cta, 24);
        sparseIntArray.put(R.id.bottom_screen_secondary_cta, 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hj(android.view.View r27) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.hj.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.N != 0) {
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
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
