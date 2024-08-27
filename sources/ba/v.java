package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class v extends u {
    public static final h.c F;
    public static final SparseIntArray G;
    public long E;

    static {
        h.c cVar = new h.c(15);
        F = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_profile_social_auth}, new String[]{"layout_profile_social_auth"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.swipe_refresh_layout, 4);
        sparseIntArray.put(R.id.user_image_view, 5);
        sparseIntArray.put(R.id.image_edit_button, 6);
        sparseIntArray.put(R.id.name_input_view, 7);
        sparseIntArray.put(R.id.usernamename_input_view, 8);
        sparseIntArray.put(R.id.bio_input_view, 9);
        sparseIntArray.put(R.id.mobile_number_input_view, 10);
        sparseIntArray.put(R.id.save_info_button, 11);
        sparseIntArray.put(R.id.delete_account_layout, 12);
        sparseIntArray.put(R.id.container, 13);
        sparseIntArray.put(R.id.delete_account_button, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.view.View r19) {
        /*
            r18 = this;
            r15 = r18
            r14 = r19
            r1 = 0
            h.c r0 = ba.v.F
            android.util.SparseIntArray r2 = ba.v.G
            r3 = 15
            java.lang.Object[] r16 = m4.m.j(r14, r3, r0, r2)
            r0 = 9
            r0 = r16[r0]
            r3 = r0
            com.assetgro.stockgro.widget.InputView r3 = (com.assetgro.stockgro.widget.InputView) r3
            r0 = 13
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 14
            r0 = r16[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 12
            r0 = r16[r0]
            r5 = r0
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0 = 6
            r0 = r16[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2
            r0 = r16[r0]
            r7 = r0
            ba.tu r7 = (ba.tu) r7
            r0 = 10
            r0 = r16[r0]
            r8 = r0
            com.assetgro.stockgro.widget.InputView r8 = (com.assetgro.stockgro.widget.InputView) r8
            r0 = 7
            r0 = r16[r0]
            r9 = r0
            com.assetgro.stockgro.widget.InputView r9 = (com.assetgro.stockgro.widget.InputView) r9
            r0 = 11
            r0 = r16[r0]
            r10 = r0
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r0 = 4
            r0 = r16[r0]
            r11 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            r0 = 3
            r0 = r16[r0]
            r12 = r0
            androidx.appcompat.widget.Toolbar r12 = (androidx.appcompat.widget.Toolbar) r12
            r0 = 5
            r0 = r16[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 8
            r0 = r16[r0]
            r17 = r0
            com.assetgro.stockgro.widget.InputView r17 = (com.assetgro.stockgro.widget.InputView) r17
            r0 = r18
            r2 = r19
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.E = r0
            ba.tu r0 = r15.f6254w
            if (r0 == 0) goto L77
            r0.f27496j = r15
        L77:
            r0 = 0
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r19
            r1.setTag(r0, r15)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.v.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.E = 0L;
        }
        this.f6254w.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                if (this.f6254w.f()) {
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
            this.E = 2L;
        }
        this.f6254w.h();
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
            this.E |= 1;
        }
        return true;
    }
}
