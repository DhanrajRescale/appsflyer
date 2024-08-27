package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class wx extends vx {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f6589z;

    /* renamed from: y, reason: collision with root package name */
    public long f6590y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6589z = sparseIntArray;
        sparseIntArray.put(R.id.sticker, 5);
        sparseIntArray.put(R.id.thumbnail_container, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public wx(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.wx.f6589z
            r2 = 7
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 5
            r0 = r9[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 3
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r9[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 6
            r0 = r9[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f6590y = r0
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f6489t
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f6490u
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f6491v
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f6492w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.wx.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.f6590y;
            this.f6590y = 0L;
        }
        ChatMessage chatMessage = this.f6493x;
        long j11 = j10 & 3;
        if (j11 != 0 && chatMessage != null) {
            str = chatMessage.getSenderName();
        } else {
            str = null;
        }
        if (j11 != 0) {
            yk.j.t1(this.f6489t, chatMessage);
            yk.j.u1(this.f6490u, chatMessage);
            qu.i0.K(this.f6491v, str);
            yk.j.s1(this.f6492w, chatMessage, this.f6488s);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6590y != 0) {
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
            this.f6590y = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.vx
    public final void r(ChatMessage chatMessage) {
        this.f6493x = chatMessage;
        synchronized (this) {
            this.f6590y |= 1;
        }
        a(14);
        m();
    }
}
