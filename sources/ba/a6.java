package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import java.util.List;

/* loaded from: classes.dex */
public final class a6 extends z5 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4167y;

    /* renamed from: x, reason: collision with root package name */
    public long f4168x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4167y = sparseIntArray;
        sparseIntArray.put(R.id.cancel, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a6(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.a6.f4167y
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 3
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 1
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f4168x = r0
            android.widget.TextView r0 = r8.f6807t
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            android.widget.LinearLayout r0 = r8.f6808u
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        List list;
        boolean z10;
        long j11;
        synchronized (this) {
            j10 = this.f4168x;
            this.f4168x = 0L;
        }
        zi.k kVar = this.f6809v;
        long j12 = j10 & 3;
        String str = null;
        int i10 = 0;
        if (j12 != 0) {
            if (kVar != null) {
                List list2 = kVar.f42493b;
                str = kVar.f42492a;
                list = list2;
            } else {
                list = null;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (j12 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (z10) {
                i10 = 8;
            }
        } else {
            list = null;
        }
        if ((j10 & 3) != 0) {
            qu.i0.K(this.f6807t, str);
            this.f6807t.setVisibility(i10);
            el.l.C0(this.f6808u, list);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4168x != 0) {
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
            this.f4168x = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
