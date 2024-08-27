package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class f0 extends e0 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar_header_layout, 3);
        sparseIntArray.put(R.id.toolbar_layout, 4);
        sparseIntArray.put(R.id.header_layout, 5);
        sparseIntArray.put(R.id.group_display_image, 6);
        sparseIntArray.put(R.id.group_name, 7);
        sparseIntArray.put(R.id.options_menu, 8);
        sparseIntArray.put(R.id.chat_toolbar, 9);
        sparseIntArray.put(R.id.click_disabler_view, 10);
        sparseIntArray.put(R.id.compose_view, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f0(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.f0.C
            r2 = 12
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 2
            r0 = r13[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 9
            r0 = r13[r0]
            r3 = r0
            com.assetgro.stockgro.widget.ChatToolbar r3 = (com.assetgro.stockgro.widget.ChatToolbar) r3
            r0 = 10
            r0 = r13[r0]
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            r0 = 11
            r0 = r13[r0]
            r5 = r0
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.ui.platform.ComposeView) r5
            r0 = 6
            r0 = r13[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 7
            r0 = r13[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 5
            r0 = r13[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = 8
            r0 = r13[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 1
            r0 = r13[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 3
            r0 = r13[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 4
            r0 = r13[r0]
            r11 = r0
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.B = r0
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r12)
            android.widget.TextView r0 = r14.f4556z
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f0.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.B;
            this.B = 0L;
        }
        long j11 = j10 & 7;
        if (j11 != 0) {
            q(0, null);
        }
        if (j11 != 0) {
            zq.f.i0(this.f4556z, null);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 4L;
        }
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
            this.B |= 1;
        }
        return true;
    }
}
