package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class fi extends ei {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4712z;

    /* renamed from: y, reason: collision with root package name */
    public long f4713y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4712z = sparseIntArray;
        sparseIntArray.put(R.id.intro_view_pager, 1);
        sparseIntArray.put(R.id.page_indicator, 2);
        sparseIntArray.put(R.id.get_started, 3);
        sparseIntArray.put(R.id.layout_onboarding_screen_footer, 4);
        sparseIntArray.put(R.id.login_container, 5);
        sparseIntArray.put(R.id.login_action, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fi(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.fi.f4712z
            r2 = 7
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 3
            r0 = r10[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 1
            r0 = r10[r0]
            r4 = r0
            androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
            r0 = 4
            r0 = r10[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 6
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 5
            r0 = r10[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 2
            r0 = r10[r0]
            r8 = r0
            me.relex.circleindicator.CircleIndicator3 r8 = (me.relex.circleindicator.CircleIndicator3) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f4713y = r0
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.fi.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4713y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4713y != 0) {
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
            this.f4713y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
