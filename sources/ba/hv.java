package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class hv extends gv {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.search_option_layout, 1);
        sparseIntArray.put(R.id.chip_all, 2);
        sparseIntArray.put(R.id.chip_people, 3);
        sparseIntArray.put(R.id.chip_groups, 4);
        sparseIntArray.put(R.id.search_result_first_container, 5);
        sparseIntArray.put(R.id.label_first_search_result, 6);
        sparseIntArray.put(R.id.search_result_first_recycler_view, 7);
        sparseIntArray.put(R.id.view_more_first_search_result, 8);
        sparseIntArray.put(R.id.no_search_result_first_container, 9);
        sparseIntArray.put(R.id.no_results_in_category_text, 10);
        sparseIntArray.put(R.id.search_result_second_container, 11);
        sparseIntArray.put(R.id.label_second_search_result, 12);
        sparseIntArray.put(R.id.search_result_second_data_container, 13);
        sparseIntArray.put(R.id.search_result_second_recycler_view, 14);
        sparseIntArray.put(R.id.view_more_second_search_result, 15);
        sparseIntArray.put(R.id.no_search_result_second_container, 16);
        sparseIntArray.put(R.id.text_no_data_second_container, 17);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.I != 0) {
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
            this.I = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
