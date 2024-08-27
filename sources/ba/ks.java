package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ks extends aa {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5288u;

    /* renamed from: t, reason: collision with root package name */
    public long f5289t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5288u = sparseIntArray;
        sparseIntArray.put(R.id.slider_title, 1);
        sparseIntArray.put(R.id.narration_icon, 2);
        sparseIntArray.put(R.id.slider_value, 3);
        sparseIntArray.put(R.id.slider, 4);
        sparseIntArray.put(R.id.hint, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ks(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ks.f5288u
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 4
            r1 = r0[r1]
            com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 3
            r3 = r0[r3]
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f5289t = r3
            r1 = 0
            r0 = r0[r1]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ks.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5289t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5289t != 0) {
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
            this.f5289t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
