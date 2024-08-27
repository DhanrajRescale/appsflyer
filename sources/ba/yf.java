package ba;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yf extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f6726t;

    /* renamed from: s, reason: collision with root package name */
    public long f6727s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6726t = sparseIntArray;
        sparseIntArray.put(R.id.filterChipGroup, 1);
        sparseIntArray.put(R.id.dateChip, 2);
        sparseIntArray.put(R.id.amountChip, 3);
        sparseIntArray.put(R.id.tradeTypeChipGroup, 4);
        sparseIntArray.put(R.id.boughtChip, 5);
        sparseIntArray.put(R.id.soldChip, 6);
        sparseIntArray.put(R.id.timeChipGroup, 7);
        sparseIntArray.put(R.id.todayChip, 8);
        sparseIntArray.put(R.id.yesterdayChip, 9);
        sparseIntArray.put(R.id.lastWeekChip, 10);
        sparseIntArray.put(R.id.lastMonthChip, 11);
        sparseIntArray.put(R.id.Month3Chip, 12);
        sparseIntArray.put(R.id.Month6Chip, 13);
        sparseIntArray.put(R.id.yearChip, 14);
        sparseIntArray.put(R.id.history_filter_reset_button, 15);
        sparseIntArray.put(R.id.history_filter_apply_button, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 17, null, f6726t);
        this.f6727s = -1L;
        ((LinearLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6727s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6727s != 0) {
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
            this.f6727s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
