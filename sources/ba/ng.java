package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ng extends mg {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f5565v;

    /* renamed from: u, reason: collision with root package name */
    public long f5566u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5565v = sparseIntArray;
        sparseIntArray.put(R.id.clear_history_image_view, 1);
        sparseIntArray.put(R.id.clear_history_text_view, 2);
        sparseIntArray.put(R.id.button_layout, 3);
        sparseIntArray.put(R.id.clear_history_button_layout, 4);
        sparseIntArray.put(R.id.cancel, 5);
        sparseIntArray.put(R.id.confirm, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ng(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ng.f5565v
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r3 = 4
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 1
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 2
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 6
            r3 = r0[r3]
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r5.<init>(r6, r1, r3, r2)
            r3 = -1
            r5.f5566u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ng.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5566u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5566u != 0) {
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
            this.f5566u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
