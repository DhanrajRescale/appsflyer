package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class k8 extends j8 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5210y;

    /* renamed from: x, reason: collision with root package name */
    public long f5211x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5210y = sparseIntArray;
        sparseIntArray.put(R.id.image, 3);
        sparseIntArray.put(R.id.seperator, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k8(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.k8.f5210y
            r2 = 5
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            r0 = 4
            r0 = r7[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5211x = r0
            android.widget.TextView r0 = r8.f5116s
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f5117t
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.k8.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f5211x     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            r7.f5211x = r2     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.CountrySelectItemViewModel r4 = r7.f5119v
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L31
            if (r4 == 0) goto L17
            androidx.lifecycle.e0 r2 = r4.f9075c
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = 0
            r7.q(r3, r2)
            if (r2 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.assetgro.stockgro.data.model.CountrySelectDto r2 = (com.assetgro.stockgro.data.model.CountrySelectDto) r2
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L31
            java.lang.String r1 = r2.getPrefix()
            java.lang.String r2 = r2.getName()
            goto L32
        L31:
            r2 = r1
        L32:
            if (r0 == 0) goto L3e
            android.widget.TextView r0 = r7.f5116s
            qu.i0.K(r0, r1)
            android.widget.TextView r0 = r7.f5117t
            qu.i0.K(r0, r2)
        L3e:
            return
        L3f:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.k8.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5211x != 0) {
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
            this.f5211x = 4L;
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
            this.f5211x |= 1;
        }
        return true;
    }
}
