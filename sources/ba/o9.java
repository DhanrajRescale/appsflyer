package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class o9 extends n9 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5651y;

    /* renamed from: x, reason: collision with root package name */
    public long f5652x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5651y = sparseIntArray;
        sparseIntArray.put(R.id.card_background, 1);
        sparseIntArray.put(R.id.rank_container, 2);
        sparseIntArray.put(R.id.rank_icon, 3);
        sparseIntArray.put(R.id.bullet, 4);
        sparseIntArray.put(R.id.user_image, 5);
        sparseIntArray.put(R.id.player_name, 6);
        sparseIntArray.put(R.id.info, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o9(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.o9.f5651y
            r2 = 8
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 4
            r0 = r8[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r8[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 7
            r0 = r8[r0]
            com.assetgro.stockgro.widget.StockChangeInfoView r0 = (com.assetgro.stockgro.widget.StockChangeInfoView) r0
            r0 = 6
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r8[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 5
            r0 = r8[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5652x = r0
            r0 = 0
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.o9.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5652x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5652x != 0) {
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
            this.f5652x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
