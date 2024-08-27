package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ob extends nb {
    public static final h.c G;
    public static final SparseIntArray H;
    public long F;

    static {
        h.c cVar = new h.c(20);
        G = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_stock_specs}, new String[]{"layout_stock_specs"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 3);
        sparseIntArray.put(R.id.stock_holdings_item_image, 4);
        sparseIntArray.put(R.id.percentage_layout, 5);
        sparseIntArray.put(R.id.change_percentage, 6);
        sparseIntArray.put(R.id.change_type_icon, 7);
        sparseIntArray.put(R.id.stock_holdings_item_stock_name, 8);
        sparseIntArray.put(R.id.short_chip, 9);
        sparseIntArray.put(R.id.stock_holdings_item_market_sentiment_text, 10);
        sparseIntArray.put(R.id.space, 11);
        sparseIntArray.put(R.id.button_layout, 12);
        sparseIntArray.put(R.id.buy_sell_layout, 13);
        sparseIntArray.put(R.id.portfolio_stock_sell, 14);
        sparseIntArray.put(R.id.portfolio_stock_buy, 15);
        sparseIntArray.put(R.id.short_cover_layout, 16);
        sparseIntArray.put(R.id.portfolio_cover_buy, 17);
        sparseIntArray.put(R.id.portfolio_short_sell, 18);
        sparseIntArray.put(R.id.followers_layout, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ob(android.view.View r19) {
        /*
            r18 = this;
            r15 = r18
            r14 = r19
            r1 = 0
            h.c r0 = ba.ob.G
            android.util.SparseIntArray r2 = ba.ob.H
            r3 = 20
            java.lang.Object[] r16 = m4.m.j(r14, r3, r0, r2)
            r0 = 12
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 13
            r0 = r16[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 6
            r0 = r16[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 7
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 19
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 3
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 17
            r0 = r16[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 18
            r0 = r16[r0]
            r7 = r0
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r0 = 15
            r0 = r16[r0]
            r8 = r0
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r0 = 14
            r0 = r16[r0]
            r9 = r0
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            r0 = 9
            r0 = r16[r0]
            r10 = r0
            com.assetgro.stockgro.widget.ChipView r10 = (com.assetgro.stockgro.widget.ChipView) r10
            r0 = 16
            r0 = r16[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 11
            r0 = r16[r0]
            androidx.legacy.widget.Space r0 = (androidx.legacy.widget.Space) r0
            r0 = 4
            r0 = r16[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 10
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 8
            r0 = r16[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 2
            r0 = r16[r0]
            r17 = r0
            ba.qv r17 = (ba.qv) r17
            r0 = r18
            r2 = r19
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.F = r0
            r0 = 0
            r0 = r16[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            ba.qv r0 = r15.D
            if (r0 == 0) goto La6
            r0.f27496j = r15
        La6:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r19
            r1.setTag(r0, r15)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ob.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.F = 0L;
        }
        this.D.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                if (this.D.f()) {
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
            this.F = 2L;
        }
        this.D.h();
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
            this.F |= 1;
        }
        return true;
    }
}
