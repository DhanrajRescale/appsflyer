package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yw extends xw {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final h.c f6786z;

    /* renamed from: y, reason: collision with root package name */
    public long f6787y;

    static {
        h.c cVar = new h.c(7);
        f6786z = cVar;
        cVar.W(0, new int[]{2}, new int[]{R.layout.list_item_group_chat_date_layout}, new String[]{"list_item_group_chat_date_layout"});
        cVar.W(1, new int[]{3}, new int[]{R.layout.list_item_chat_message_reported}, new String[]{"list_item_chat_message_reported"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.iv_chevron, 4);
        sparseIntArray.put(R.id.message_warning_icon, 5);
        sparseIntArray.put(R.id.selection_layer, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yw(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = ba.yw.f6786z
            android.util.SparseIntArray r2 = ba.yw.A
            r3 = 7
            java.lang.Object[] r7 = m4.m.j(r9, r3, r0, r2)
            r0 = 4
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            ba.bx r4 = (ba.bx) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            ba.vw r5 = (ba.vw) r5
            r0 = 1
            r0 = r7[r0]
            r6 = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r0 = 5
            r0 = r7[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 6
            r0 = r7[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f6787y = r0
            ba.bx r0 = r8.f6695t
            if (r0 == 0) goto L3b
            r0.f27496j = r8
        L3b:
            ba.vw r0 = r8.f6696u
            if (r0 == 0) goto L41
            r0.f27496j = r8
        L41:
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.f6697v
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.yw.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f6787y;
            this.f6787y = 0L;
        }
        ChatMessage chatMessage = this.f6698w;
        if ((j10 & 12) != 0) {
            this.f6695t.getClass();
            this.f6696u.r(chatMessage);
        }
        this.f6695t.c();
        this.f6696u.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6787y != 0) {
                    return true;
                }
                if (this.f6695t.f() || this.f6696u.f()) {
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
            this.f6787y = 8L;
        }
        this.f6695t.h();
        this.f6696u.h();
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
                this.f6787y |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6787y |= 1;
        }
        return true;
    }
}
