package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class qu extends pu {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5900x;

    /* renamed from: w, reason: collision with root package name */
    public long f5901w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5900x = sparseIntArray;
        sparseIntArray.put(R.id.whats_new_icon, 1);
        sparseIntArray.put(R.id.whats_new_title, 2);
        sparseIntArray.put(R.id.whats_new_message, 3);
        sparseIntArray.put(R.id.message_content_space, 4);
        sparseIntArray.put(R.id.whats_new_content_container, 5);
        sparseIntArray.put(R.id.whats_new_drop_down, 6);
        sparseIntArray.put(R.id.whats_new_drop_down_icon, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qu(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.qu.f5900x
            r2 = 8
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 4
            r0 = r7[r0]
            androidx.legacy.widget.Space r0 = (androidx.legacy.widget.Space) r0
            r0 = 5
            r0 = r7[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 6
            r0 = r7[r0]
            r4 = r0
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            r0 = 7
            r0 = r7[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 1
            r0 = r7[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 3
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5901w = r0
            r0 = 0
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qu.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5901w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5901w != 0) {
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
            this.f5901w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
