package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ho extends go {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f4959y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4960z;

    /* renamed from: x, reason: collision with root package name */
    public long f4961x;

    static {
        h.c cVar = new h.c(7);
        f4959y = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_stock_modify_short_sell_order}, new String[]{"content_stock_modify_short_sell_order"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4960z = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.stock_info_collapsed_header, 4);
        sparseIntArray.put(R.id.progress_bar, 5);
        sparseIntArray.put(R.id.review_order, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ho(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            h.c r0 = ba.ho.f4959y
            android.util.SparseIntArray r2 = ba.ho.f4960z
            r3 = 7
            java.lang.Object[] r8 = m4.m.j(r10, r3, r0, r2)
            r0 = 2
            r0 = r8[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            ba.ye r3 = (ba.ye) r3
            r0 = 5
            r0 = r8[r0]
            r4 = r0
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0 = 6
            r0 = r8[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 4
            r0 = r8[r0]
            r6 = r0
            com.assetgro.stockgro.widget.MarketAssetToolbarView r6 = (com.assetgro.stockgro.widget.MarketAssetToolbarView) r6
            r0 = 3
            r0 = r8[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f4961x = r0
            ba.ye r0 = r9.f4834s
            if (r0 == 0) goto L3c
            r0.f27496j = r9
        L3c:
            r0 = 0
            r0 = r8[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ho.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4961x = 0L;
        }
        this.f4834s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4961x != 0) {
                    return true;
                }
                if (this.f4834s.f()) {
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
            this.f4961x = 2L;
        }
        this.f4834s.h();
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
            this.f4961x |= 1;
        }
        return true;
    }
}
