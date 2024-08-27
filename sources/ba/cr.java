package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class cr extends eh {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f4412w;

    /* renamed from: v, reason: collision with root package name */
    public long f4413v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4412w = sparseIntArray;
        sparseIntArray.put(R.id.fast_forward, 1);
        sparseIntArray.put(R.id.fast_rewind, 2);
        sparseIntArray.put(R.id.play_pause_button, 3);
        sparseIntArray.put(R.id.custom_seek_bar, 4);
        sparseIntArray.put(R.id.time_duration, 5);
        sparseIntArray.put(R.id.volume_button, 6);
        sparseIntArray.put(R.id.settings, 7);
        sparseIntArray.put(R.id.fullscreen, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cr(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.cr.f4412w
            r2 = 9
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 4
            r0 = r7[r0]
            r3 = r0
            androidx.appcompat.widget.AppCompatSeekBar r3 = (androidx.appcompat.widget.AppCompatSeekBar) r3
            r0 = 1
            r0 = r7[r0]
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 2
            r0 = r7[r0]
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 8
            r0 = r7[r0]
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 3
            r0 = r7[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 7
            r0 = r7[r0]
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 5
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 6
            r0 = r7[r0]
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f4413v = r0
            r0 = 0
            r0 = r7[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.cr.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4413v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4413v != 0) {
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
            this.f4413v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
