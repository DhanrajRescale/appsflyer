package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class f8 extends e8 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.close_reply_view, 5);
        sparseIntArray.put(R.id.sticker, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f8(android.view.View r12) {
        /*
            r11 = this;
            r8 = 0
            android.util.SparseIntArray r0 = ba.f8.B
            r1 = 7
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r1, r9, r0)
            r0 = 5
            r0 = r10[r0]
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 6
            r0 = r10[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 3
            r0 = r10[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 1
            r0 = r10[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 4
            r0 = r10[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.A = r0
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4583u
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4584v
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4585w
            r0.setTag(r9)
            android.widget.ImageView r0 = r11.f4586x
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f8.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.A;
            this.A = 0L;
        }
        ChatMessage chatMessage = this.f4587y;
        long j11 = j10 & 3;
        if (j11 != 0 && chatMessage != null) {
            str = chatMessage.getSenderName();
        } else {
            str = null;
        }
        if (j11 != 0) {
            yk.j.t1(this.f4583u, chatMessage);
            yk.j.u1(this.f4584v, chatMessage);
            qu.i0.K(this.f4585w, str);
            yk.j.s1(this.f4586x, chatMessage, this.f4582t);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
