package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ig extends hg {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5044w;

    /* renamed from: v, reason: collision with root package name */
    public long f5045v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5044w = sparseIntArray;
        sparseIntArray.put(R.id.create_portfolio_container, 1);
        sparseIntArray.put(R.id.cancel_reset_portfolio, 2);
        sparseIntArray.put(R.id.save_reset_portfolio, 3);
        sparseIntArray.put(R.id.progress_bar, 4);
        sparseIntArray.put(R.id.porfolio_message_contianer, 5);
        sparseIntArray.put(R.id.portfolio_message_one, 6);
        sparseIntArray.put(R.id.continue_next, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ig(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ig.f5044w
            r2 = 8
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 2
            r0 = r7[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 7
            r0 = r7[r0]
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r0 = 1
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 6
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 4
            r0 = r7[r0]
            r4 = r0
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5045v = r0
            r0 = 0
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ig.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5045v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5045v != 0) {
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
            this.f5045v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
