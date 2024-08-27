package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ys extends xs {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6778x;

    /* renamed from: w, reason: collision with root package name */
    public long f6779w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6778x = sparseIntArray;
        sparseIntArray.put(R.id.input_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ys(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ys.f6778x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 2
            r0 = r7[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            com.assetgro.stockgro.missions.presentation.widget.MissionInputView r5 = (com.assetgro.stockgro.missions.presentation.widget.MissionInputView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f6779w = r0
            android.widget.TextView r0 = r8.f6676s
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f6677t
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ys.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f6779w     // Catch: java.lang.Throwable -> L47
            r2 = 0
            r7.f6779w = r2     // Catch: java.lang.Throwable -> L47
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L47
            com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel r4 = r7.f6679v
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L39
            if (r4 == 0) goto L17
            androidx.lifecycle.e0 r2 = r4.f8864o
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = 0
            r7.q(r3, r2)
            if (r2 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.assetgro.stockgro.missions.domain.model.MissionDetail r2 = (com.assetgro.stockgro.missions.domain.model.MissionDetail) r2
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2d
            com.assetgro.stockgro.missions.domain.model.InputTypeDetails r2 = r2.getInputTypeDetails()
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L39
            java.lang.String r1 = r2.getSubText()
            java.lang.String r2 = r2.getTitle()
            goto L3a
        L39:
            r2 = r1
        L3a:
            if (r0 == 0) goto L46
            android.widget.TextView r0 = r7.f6676s
            qu.i0.K(r0, r1)
            android.widget.TextView r0 = r7.f6677t
            qu.i0.K(r0, r2)
        L46:
            return
        L47:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ys.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6779w != 0) {
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
            this.f6779w = 4L;
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
            this.f6779w |= 1;
        }
        return true;
    }
}
