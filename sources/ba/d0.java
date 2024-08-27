package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class d0 extends c0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4430y;

    /* renamed from: x, reason: collision with root package name */
    public long f4431x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4430y = sparseIntArray;
        sparseIntArray.put(R.id.ll_toolbar, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.loading_progress_bar, 4);
        sparseIntArray.put(R.id.add_friend, 5);
        sparseIntArray.put(R.id.app_bar_layout, 6);
        sparseIntArray.put(R.id.collapsing_toolbar, 7);
        sparseIntArray.put(R.id.tab_layout, 8);
        sparseIntArray.put(R.id.followers_following_view_pager, 9);
        sparseIntArray.put(R.id.no_followers_or_following_container, 10);
        sparseIntArray.put(R.id.image_no_followers_following, 11);
        sparseIntArray.put(R.id.no_followers_following_text, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.d0.f4430y
            r2 = 13
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 5
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 6
            r0 = r9[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 7
            r0 = r9[r0]
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = (com.google.android.material.appbar.CollapsingToolbarLayout) r0
            r0 = 9
            r0 = r9[r0]
            r3 = r0
            androidx.viewpager2.widget.ViewPager2 r3 = (androidx.viewpager2.widget.ViewPager2) r3
            r0 = 11
            r0 = r9[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 1
            r0 = r9[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 4
            r0 = r9[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 12
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r9[r0]
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 8
            r0 = r9[r0]
            r5 = r0
            com.google.android.material.tabs.TabLayout r5 = (com.google.android.material.tabs.TabLayout) r5
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            com.google.android.material.textview.MaterialTextView r6 = (com.google.android.material.textview.MaterialTextView) r6
            r0 = 2
            r0 = r9[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f4431x = r0
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.d0.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4431x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4431x != 0) {
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
            this.f4431x = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
