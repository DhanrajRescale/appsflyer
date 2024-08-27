package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class b4 extends a4 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4254z;

    /* renamed from: y, reason: collision with root package name */
    public long f4255y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4254z = sparseIntArray;
        sparseIntArray.put(R.id.stock_gyan_view_pager, 1);
        sparseIntArray.put(R.id.page_indicator, 2);
        sparseIntArray.put(R.id.like_layout, 3);
        sparseIntArray.put(R.id.action_like, 4);
        sparseIntArray.put(R.id.total_likes, 5);
        sparseIntArray.put(R.id.action_share, 6);
        sparseIntArray.put(R.id.action_forward, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b4(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.b4.f4254z
            r2 = 8
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 7
            r0 = r10[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 4
            r0 = r10[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 6
            r0 = r10[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 3
            r0 = r10[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 2
            r0 = r10[r0]
            r6 = r0
            me.relex.circleindicator.CircleIndicator r6 = (me.relex.circleindicator.CircleIndicator) r6
            r0 = 1
            r0 = r10[r0]
            r7 = r0
            androidx.viewpager.widget.ViewPager r7 = (androidx.viewpager.widget.ViewPager) r7
            r0 = 5
            r0 = r10[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f4255y = r0
            r0 = 0
            r0 = r10[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.b4.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4255y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4255y != 0) {
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
            this.f4255y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
