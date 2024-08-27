package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class j5 extends i5 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f5108z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.label_filter_transactions, 1);
        sparseIntArray.put(R.id.label_date, 2);
        sparseIntArray.put(R.id.label_date_remark, 3);
        sparseIntArray.put(R.id.date_filters, 4);
        sparseIntArray.put(R.id.this_week, 5);
        sparseIntArray.put(R.id.this_month, 6);
        sparseIntArray.put(R.id.last_one_week, 7);
        sparseIntArray.put(R.id.last_one_month, 8);
        sparseIntArray.put(R.id.last_six_month, 9);
        sparseIntArray.put(R.id.label_transactions, 10);
        sparseIntArray.put(R.id.transaction_filters, 11);
        sparseIntArray.put(R.id.cash, 12);
        sparseIntArray.put(R.id.bonus, 13);
        sparseIntArray.put(R.id.label_status, 14);
        sparseIntArray.put(R.id.status_filters, 15);
        sparseIntArray.put(R.id.success, 16);
        sparseIntArray.put(R.id.pending, 17);
        sparseIntArray.put(R.id.failed, 18);
        sparseIntArray.put(R.id.label_categories, 19);
        sparseIntArray.put(R.id.categories_filters, 20);
        sparseIntArray.put(R.id.leagues, 21);
        sparseIntArray.put(R.id.referral, 22);
        sparseIntArray.put(R.id.payment, 23);
        sparseIntArray.put(R.id.subscription, 24);
        sparseIntArray.put(R.id.withdrawal, 25);
        sparseIntArray.put(R.id.clear_filter, 26);
        sparseIntArray.put(R.id.apply_filter, 27);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j5(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.j5.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5108z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5108z != 0) {
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
            this.f5108z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
