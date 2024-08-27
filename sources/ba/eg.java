package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class eg extends dg {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f4612w;

    /* renamed from: v, reason: collision with root package name */
    public long f4613v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4612w = sparseIntArray;
        sparseIntArray.put(R.id.materialTextView, 1);
        sparseIntArray.put(R.id.linearLayout, 2);
        sparseIntArray.put(R.id.camera, 3);
        sparseIntArray.put(R.id.linearLayout2, 4);
        sparseIntArray.put(R.id.gallery, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eg(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.eg.f4612w
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r3 = 5
            r3 = r0[r3]
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r4 = 2
            r4 = r0[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4 = 4
            r4 = r0[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4 = 1
            r4 = r0[r4]
            com.google.android.material.textview.MaterialTextView r4 = (com.google.android.material.textview.MaterialTextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4613v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.eg.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4613v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4613v != 0) {
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
            this.f4613v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
