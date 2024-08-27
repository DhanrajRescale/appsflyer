package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rk extends pk {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f5977y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5978z;

    /* renamed from: x, reason: collision with root package name */
    public long f5979x;

    static {
        h.c cVar = new h.c(10);
        f5977y = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_create_account_footer}, new String[]{"layout_create_account_footer"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5978z = sparseIntArray;
        sparseIntArray.put(R.id.illustration, 3);
        sparseIntArray.put(R.id.login_account_label, 4);
        sparseIntArray.put(R.id.input_view, 5);
        sparseIntArray.put(R.id.tnc_privacy_consent_container, 6);
        sparseIntArray.put(R.id.tnc_privacy_consent_checkbox, 7);
        sparseIntArray.put(R.id.tnc_privacy_consent_text, 8);
        sparseIntArray.put(R.id.next, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rk(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            h.c r0 = ba.rk.f5977y
            android.util.SparseIntArray r2 = ba.rk.f5978z
            r3 = 10
            java.lang.Object[] r8 = m4.m.j(r10, r3, r0, r2)
            r0 = 2
            r0 = r8[r0]
            r3 = r0
            ba.uq r3 = (ba.uq) r3
            r0 = 3
            r0 = r8[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 5
            r0 = r8[r0]
            r4 = r0
            com.assetgro.stockgro.widget.MultipleCountryInputView r4 = (com.assetgro.stockgro.widget.MultipleCountryInputView) r4
            r0 = 4
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r8[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 7
            r0 = r8[r0]
            r6 = r0
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r0 = 6
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 8
            r0 = r8[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f5979x = r0
            ba.uq r0 = r9.f5775s
            if (r0 == 0) goto L49
            r0.f27496j = r9
        L49:
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rk.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5979x = 0L;
        }
        this.f5775s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5979x != 0) {
                    return true;
                }
                if (this.f5775s.f()) {
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
            this.f5979x = 2L;
        }
        this.f5775s.h();
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
            this.f5979x |= 1;
        }
        return true;
    }
}
