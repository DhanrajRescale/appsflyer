package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class mb extends lb {
    public static final h.c C;
    public static final SparseIntArray D;
    public long B;

    static {
        h.c cVar = new h.c(11);
        C = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_portfolio_history_details}, new String[]{"layout_portfolio_history_details"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.background_view, 3);
        sparseIntArray.put(R.id.image_icon_container, 4);
        sparseIntArray.put(R.id.history_image, 5);
        sparseIntArray.put(R.id.history_stock_name, 6);
        sparseIntArray.put(R.id.history_date, 7);
        sparseIntArray.put(R.id.history_order_type, 8);
        sparseIntArray.put(R.id.history_order_description_view, 9);
        sparseIntArray.put(R.id.history_order_description, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mb(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            h.c r0 = ba.mb.C
            android.util.SparseIntArray r2 = ba.mb.D
            r3 = 11
            java.lang.Object[] r11 = m4.m.j(r13, r3, r0, r2)
            r0 = 3
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 7
            r0 = r11[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 5
            r0 = r11[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 10
            r0 = r11[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r11[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 8
            r0 = r11[r0]
            r6 = r0
            com.assetgro.stockgro.widget.ChipView r6 = (com.assetgro.stockgro.widget.ChipView) r6
            r0 = 1
            r0 = r11[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 6
            r0 = r11[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r11[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 2
            r0 = r11[r0]
            r10 = r0
            ba.bu r10 = (ba.bu) r10
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.B = r0
            android.widget.LinearLayout r0 = r12.f5346w
            r1 = 0
            r0.setTag(r1)
            ba.bu r0 = r12.f5349z
            if (r0 == 0) goto L5d
            r0.f27496j = r12
        L5d:
            r0 = 0
            r0 = r11[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.mb.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.B = 0L;
        }
        this.f5349z.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                if (this.f5349z.f()) {
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
            this.B = 2L;
        }
        this.f5349z.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
