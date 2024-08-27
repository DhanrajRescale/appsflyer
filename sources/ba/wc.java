package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class wc extends vc {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f6519z;

    /* renamed from: y, reason: collision with root package name */
    public long f6520y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6519z = sparseIntArray;
        sparseIntArray.put(R.id.stock_image, 1);
        sparseIntArray.put(R.id.stock_name, 2);
        sparseIntArray.put(R.id.stock_price, 3);
        sparseIntArray.put(R.id.stock_change_info_view, 4);
        sparseIntArray.put(R.id.sector_background, 5);
        sparseIntArray.put(R.id.sector, 6);
        sparseIntArray.put(R.id.footer_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public wc(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.wc.f6519z
            r2 = 8
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 7
            r0 = r9[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 6
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 5
            r0 = r9[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 4
            r0 = r9[r0]
            r4 = r0
            com.assetgro.stockgro.widget.StockChangeInfoView r4 = (com.assetgro.stockgro.widget.StockChangeInfoView) r4
            r0 = 1
            r0 = r9[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 2
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 3
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f6520y = r0
            r0 = 0
            r0 = r9[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.wc.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6520y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6520y != 0) {
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
            this.f6520y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
