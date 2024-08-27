package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class fh extends eh {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f4709w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4710x;

    /* renamed from: v, reason: collision with root package name */
    public long f4711v;

    static {
        h.c cVar = new h.c(9);
        f4709w = cVar;
        cVar.W(0, new int[]{4}, new int[]{R.layout.layout_no_internet_connection}, new String[]{"layout_no_internet_connection"});
        cVar.W(1, new int[]{3}, new int[]{R.layout.layout_popup_no_internet_connection}, new String[]{"layout_popup_no_internet_connection"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4710x = sparseIntArray;
        sparseIntArray.put(R.id.layout_no_posts_v2, 2);
        sparseIntArray.put(R.id.swipe_refresh_view, 5);
        sparseIntArray.put(R.id.feed_recycler_view, 6);
        sparseIntArray.put(R.id.fetch_more_loader, 7);
        sparseIntArray.put(R.id.progress_bar, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fh(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.fh.f4709w
            android.util.SparseIntArray r2 = ba.fh.f4710x
            r3 = 9
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 1
            r0 = r6[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 6
            r0 = r6[r0]
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0 = 7
            r0 = r6[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 4
            r0 = r6[r0]
            r4 = r0
            ba.ot r4 = (ba.ot) r4
            r0 = 2
            r0 = r6[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 3
            r0 = r6[r0]
            r5 = r0
            ba.tt r5 = (ba.tt) r5
            r0 = 8
            r0 = r6[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 5
            r0 = r6[r0]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f4711v = r0
            android.view.View r0 = r7.f4614s
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            java.lang.Object r0 = r7.f4615t
            ba.ot r0 = (ba.ot) r0
            if (r0 == 0) goto L50
            r0.f27496j = r7
        L50:
            java.lang.Object r0 = r7.f4616u
            ba.tt r0 = (ba.tt) r0
            if (r0 == 0) goto L58
            r0.f27496j = r7
        L58:
            r0 = 0
            r0 = r6[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.fh.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4711v = 0L;
        }
        ((tt) this.f4616u).c();
        ((ot) this.f4615t).c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4711v != 0) {
                    return true;
                }
                if (((tt) this.f4616u).f() || ((ot) this.f4615t).f()) {
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
            this.f4711v = 4L;
        }
        ((tt) this.f4616u).h();
        ((ot) this.f4615t).h();
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
                this.f4711v |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4711v |= 1;
        }
        return true;
    }
}
