package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ol extends nl {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5670w;

    /* renamed from: v, reason: collision with root package name */
    public long f5671v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5670w = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.plan_tab_layout, 3);
        sparseIntArray.put(R.id.plan_detail_view_pager, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ol(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ol.f5670w
            r2 = 5
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 1
            r0 = r7[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 4
            r0 = r7[r0]
            r3 = r0
            androidx.viewpager2.widget.ViewPager2 r3 = (androidx.viewpager2.widget.ViewPager2) r3
            r0 = 3
            r0 = r7[r0]
            r4 = r0
            com.google.android.material.tabs.TabLayout r4 = (com.google.android.material.tabs.TabLayout) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5671v = r0
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ol.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5671v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5671v != 0) {
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
            this.f5671v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
