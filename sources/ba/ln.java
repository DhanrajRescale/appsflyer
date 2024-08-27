package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ln extends kn {
    public static final h.c A;
    public static final SparseIntArray B;

    /* renamed from: z, reason: collision with root package name */
    public long f5377z;

    static {
        h.c cVar = new h.c(9);
        A = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_social}, new String[]{"content_social"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar_container, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.options_toolbar_container, 5);
        sparseIntArray.put(R.id.options_toolbar, 6);
        sparseIntArray.put(R.id.options_menu_mute, 7);
        sparseIntArray.put(R.id.options_menu_pin, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ln(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.ln.A
            android.util.SparseIntArray r2 = ba.ln.B
            r3 = 9
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 2
            r0 = r10[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 1
            r0 = r10[r0]
            r3 = r0
            ba.se r3 = (ba.se) r3
            r0 = 7
            r0 = r10[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r10[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 6
            r0 = r10[r0]
            r6 = r0
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            r0 = 5
            r0 = r10[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 4
            r0 = r10[r0]
            r8 = r0
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r0 = 3
            r0 = r10[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.f5377z = r0
            ba.se r0 = r11.f5269s
            if (r0 == 0) goto L4a
            r0.f27496j = r11
        L4a:
            r0 = 0
            r0 = r10[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ln.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5377z = 0L;
        }
        this.f5269s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5377z != 0) {
                    return true;
                }
                if (this.f5269s.f()) {
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
            this.f5377z = 2L;
        }
        this.f5269s.h();
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
            this.f5377z |= 1;
        }
        return true;
    }
}
