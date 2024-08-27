package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ku extends ju {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f5293w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5294x;

    /* renamed from: v, reason: collision with root package name */
    public long f5295v;

    static {
        h.c cVar = new h.c(6);
        f5293w = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_portfolio_value_details}, new String[]{"layout_portfolio_value_details"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5294x = sparseIntArray;
        sparseIntArray.put(R.id.current_value_text, 3);
        sparseIntArray.put(R.id.portfolio_current_value_amount, 4);
        sparseIntArray.put(R.id.view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ku(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.ku.f5293w
            android.util.SparseIntArray r2 = ba.ku.f5294x
            r3 = 6
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 3
            r0 = r6[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r6[r0]
            r3 = r0
            ba.lu r3 = (ba.lu) r3
            r0 = 4
            r0 = r6[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 0
            r0 = r6[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 5
            r0 = r6[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f5295v = r0
            ba.lu r0 = r7.f5177s
            if (r0 == 0) goto L35
            r0.f27496j = r7
        L35:
            r0 = 1
            r0 = r6[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            r0.setTag(r1)
            androidx.cardview.widget.CardView r0 = r7.f5179u
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ku.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5295v = 0L;
        }
        this.f5177s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5295v != 0) {
                    return true;
                }
                if (this.f5177s.f()) {
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
            this.f5295v = 2L;
        }
        this.f5177s.h();
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
            this.f5295v |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5177s.p(tVar);
    }
}
