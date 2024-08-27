package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.remote.response.WithdrawableLimitDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitViewModel;

/* loaded from: classes.dex */
public final class w4 extends v4 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.progress_bar, 4);
        sparseIntArray.put(R.id.data_container, 5);
        sparseIntArray.put(R.id.limit_title, 6);
        sparseIntArray.put(R.id.limit_title_container, 7);
        sparseIntArray.put(R.id.limit_values_container, 8);
        sparseIntArray.put(R.id.note, 9);
        sparseIntArray.put(R.id.note_container, 10);
        sparseIntArray.put(R.id.action_container, 11);
        sparseIntArray.put(R.id.compose_view, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w4(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.w4.C
            r2 = 13
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 1
            r0 = r12[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 11
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2
            r0 = r12[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 12
            r0 = r12[r0]
            r4 = r0
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            r0 = 5
            r0 = r12[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 6
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 7
            r0 = r12[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 8
            r0 = r12[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 9
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r12[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 4
            r0 = r12[r0]
            r9 = r0
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            r0 = 3
            r0 = r12[r0]
            r10 = r0
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.B = r0
            com.google.android.material.button.MaterialButton r0 = r13.f6380s
            r0.setTag(r11)
            r0 = 0
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.w4.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        WithdrawableLimitDto withdrawableLimitDto;
        synchronized (this) {
            j10 = this.B;
            this.B = 0L;
        }
        WithdrawableLimitViewModel withdrawableLimitViewModel = this.A;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if (withdrawableLimitViewModel != null) {
                e0Var = withdrawableLimitViewModel.f9635o;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                withdrawableLimitDto = (WithdrawableLimitDto) e0Var.getValue();
            } else {
                withdrawableLimitDto = null;
            }
            if (withdrawableLimitDto != null) {
                str = withdrawableLimitDto.getCtaTitle();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f6380s, str);
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
