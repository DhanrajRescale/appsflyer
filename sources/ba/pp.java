package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class pp extends op {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5797z;

    /* renamed from: y, reason: collision with root package name */
    public long f5798y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5797z = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.portfolio_recycler_view, 3);
        sparseIntArray.put(R.id.detail_container, 4);
        sparseIntArray.put(R.id.expiry_options_recycler_view, 5);
        sparseIntArray.put(R.id.payment_container, 6);
        sparseIntArray.put(R.id.pay_using_label, 7);
        sparseIntArray.put(R.id.payment_type_container, 8);
        sparseIntArray.put(R.id.wallet_icon, 9);
        sparseIntArray.put(R.id.wallet_label, 10);
        sparseIntArray.put(R.id.low_balance_message, 11);
        sparseIntArray.put(R.id.wallet_amount, 12);
        sparseIntArray.put(R.id.buy_portfolio, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pp(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.pp.f5797z
            r2 = 14
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 1
            r0 = r10[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 13
            r0 = r10[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 4
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r10[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 11
            r0 = r10[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 7
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 6
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r10[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 3
            r0 = r10[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 2
            r0 = r10[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = 12
            r0 = r10[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 9
            r0 = r10[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 10
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f5798y = r0
            r0 = 0
            r0 = r10[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.pp.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5798y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5798y != 0) {
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
            this.f5798y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
