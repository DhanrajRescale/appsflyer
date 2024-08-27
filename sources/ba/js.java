package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class js extends is {
    public static final SparseIntArray O;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.search_option_layout_container, 1);
        sparseIntArray.put(R.id.search_option_layout, 2);
        sparseIntArray.put(R.id.chip_all, 3);
        sparseIntArray.put(R.id.chip_stocks, 4);
        sparseIntArray.put(R.id.chip_options, 5);
        sparseIntArray.put(R.id.stock_disclaimer, 6);
        sparseIntArray.put(R.id.bottom_screen_section, 7);
        sparseIntArray.put(R.id.search_result_first_container, 8);
        sparseIntArray.put(R.id.label_first_search_result, 9);
        sparseIntArray.put(R.id.search_result_first_data_container, 10);
        sparseIntArray.put(R.id.search_result_first_recycler_view, 11);
        sparseIntArray.put(R.id.view_more_first_search_result, 12);
        sparseIntArray.put(R.id.no_search_result_first_container, 13);
        sparseIntArray.put(R.id.no_results_in_category_text, 14);
        sparseIntArray.put(R.id.search_result_second_container, 15);
        sparseIntArray.put(R.id.label_second_search_result, 16);
        sparseIntArray.put(R.id.search_result_second_data_container, 17);
        sparseIntArray.put(R.id.search_result_second_recycler_view, 18);
        sparseIntArray.put(R.id.view_more_second_search_result, 19);
        sparseIntArray.put(R.id.no_search_result_second_container, 20);
        sparseIntArray.put(R.id.text_no_data_second_container, 21);
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
            this.N = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
