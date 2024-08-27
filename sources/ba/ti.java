package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ti extends si {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f6196y;

    /* renamed from: x, reason: collision with root package name */
    public long f6197x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6196y = sparseIntArray;
        sparseIntArray.put(R.id.step, 1);
        sparseIntArray.put(R.id.kyc_tutorial_card_view_pager, 2);
        sparseIntArray.put(R.id.page_indicator, 3);
        sparseIntArray.put(R.id.mobile_not_linked, 4);
        sparseIntArray.put(R.id.kyc_text_icon, 5);
        sparseIntArray.put(R.id.kyc_text_message, 6);
        sparseIntArray.put(R.id.proceed, 7);
        sparseIntArray.put(R.id.kyc_acceptance_message, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ti(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ti.f6196y
            r2 = 9
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 8
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 5
            r0 = r9[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 6
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            androidx.viewpager.widget.ViewPager r4 = (androidx.viewpager.widget.ViewPager) r4
            r0 = 4
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            me.relex.circleindicator.CircleIndicator r6 = (me.relex.circleindicator.CircleIndicator) r6
            r0 = 7
            r0 = r9[r0]
            r7 = r0
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r0 = 1
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f6197x = r0
            r0 = 0
            r0 = r9[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ti.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6197x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6197x != 0) {
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
            this.f6197x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
