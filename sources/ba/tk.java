package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tk extends sk {
    public static final h.c A;
    public static final SparseIntArray B;

    /* renamed from: z, reason: collision with root package name */
    public long f6201z;

    static {
        h.c cVar = new h.c(12);
        A = cVar;
        cVar.W(1, new int[]{2, 3}, new int[]{R.layout.layout_tnc_registration, R.layout.layout_login_account_footer}, new String[]{"layout_tnc_registration", "layout_login_account_footer"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView3, 4);
        sparseIntArray.put(R.id.illustration, 5);
        sparseIntArray.put(R.id.login_account_label, 6);
        sparseIntArray.put(R.id.input_view, 7);
        sparseIntArray.put(R.id.spam_disclaimer, 8);
        sparseIntArray.put(R.id.invitation_code_input_view, 9);
        sparseIntArray.put(R.id.next, 10);
        sparseIntArray.put(R.id.terms_and_conditions, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tk(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.tk.A
            android.util.SparseIntArray r2 = ba.tk.B
            r3 = 12
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 5
            r0 = r10[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 7
            r0 = r10[r0]
            r4 = r0
            com.assetgro.stockgro.widget.MultipleCountryInputView r4 = (com.assetgro.stockgro.widget.MultipleCountryInputView) r4
            r0 = 9
            r0 = r10[r0]
            r5 = r0
            com.assetgro.stockgro.widget.InputView r5 = (com.assetgro.stockgro.widget.InputView) r5
            r0 = 3
            r0 = r10[r0]
            r6 = r0
            ba.cs r6 = (ba.cs) r6
            r0 = 6
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 4
            r0 = r10[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0 = 10
            r0 = r10[r0]
            r7 = r0
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r0 = 0
            r0 = r10[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = 8
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 11
            r0 = r10[r0]
            com.assetgro.stockgro.widget.TnCLinkView r0 = (com.assetgro.stockgro.widget.TnCLinkView) r0
            r0 = 2
            r0 = r10[r0]
            r9 = r0
            ba.vv r9 = (ba.vv) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.f6201z = r0
            ba.cs r0 = r11.f6098v
            if (r0 == 0) goto L5c
            r0.f27496j = r11
        L5c:
            r0 = 1
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.f6100x
            r0.setTag(r1)
            ba.vv r0 = r11.f6101y
            if (r0 == 0) goto L70
            r0.f27496j = r11
        L70:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.tk.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6201z = 0L;
        }
        this.f6101y.c();
        this.f6098v.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6201z != 0) {
                    return true;
                }
                if (this.f6101y.f() || this.f6098v.f()) {
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
            this.f6201z = 4L;
        }
        this.f6101y.h();
        this.f6098v.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6201z |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6201z |= 1;
        }
        return true;
    }
}
