package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class c9 extends b9 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4345x;

    /* renamed from: w, reason: collision with root package name */
    public long f4346w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4345x = sparseIntArray;
        sparseIntArray.put(R.id.user_image_view, 1);
        sparseIntArray.put(R.id.user_name_text, 2);
        sparseIntArray.put(R.id.user_name_subtext, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c9(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.c9.f4345x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 3
            r0 = r7[r0]
            r4 = r0
            com.google.android.material.textview.MaterialTextView r4 = (com.google.android.material.textview.MaterialTextView) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            com.google.android.material.textview.MaterialTextView r5 = (com.google.android.material.textview.MaterialTextView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f4346w = r0
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.c9.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4346w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4346w != 0) {
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
            this.f4346w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
