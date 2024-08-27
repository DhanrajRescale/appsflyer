package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class px extends ox {
    public static final h.c D;
    public static final SparseIntArray E;
    public final nw B;
    public long C;

    static {
        h.c cVar = new h.c(12);
        D = cVar;
        cVar.W(0, new int[]{3, 4}, new int[]{R.layout.list_item_chat_message_interaction_layout, R.layout.list_item_chat_message_footer}, new String[]{"list_item_chat_message_interaction_layout", "list_item_chat_message_footer"});
        cVar.W(1, new int[]{2}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.layout_image_group_chat_profile, 5);
        sparseIntArray.put(R.id.image_group_chat_profile, 6);
        sparseIntArray.put(R.id.stockgro_logo, 7);
        sparseIntArray.put(R.id.iv_chevron, 8);
        sparseIntArray.put(R.id.group_chat_sender_name, 9);
        sparseIntArray.put(R.id.text_group_chat_time, 10);
        sparseIntArray.put(R.id.selection_layer, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public px(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            h.c r0 = ba.px.D
            android.util.SparseIntArray r2 = ba.px.E
            r3 = 12
            java.lang.Object[] r11 = m4.m.j(r13, r3, r0, r2)
            r0 = 2
            r0 = r11[r0]
            r3 = r0
            ba.c8 r3 = (ba.c8) r3
            r0 = 9
            r0 = r11[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 6
            r0 = r11[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 8
            r0 = r11[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 1
            r0 = r11[r0]
            r7 = r0
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r0 = 5
            r0 = r11[r0]
            r8 = r0
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r0 = 11
            r0 = r11[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 7
            r0 = r11[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 10
            r0 = r11[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 3
            r0 = r11[r0]
            r10 = r0
            ba.pw r10 = (ba.pw) r10
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.C = r0
            ba.c8 r0 = r12.f5701s
            if (r0 == 0) goto L58
            r0.f27496j = r12
        L58:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f5705w
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 4
            r0 = r11[r0]
            ba.nw r0 = (ba.nw) r0
            r12.B = r0
            if (r0 == 0) goto L71
            r0.f27496j = r12
        L71:
            ba.pw r0 = r12.f5708z
            if (r0 == 0) goto L77
            r0.f27496j = r12
        L77:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.px.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.C = 0L;
        }
        this.f5701s.c();
        this.f5708z.c();
        this.B.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f5701s.f() || this.f5708z.f() || this.B.f()) {
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
            this.C = 8L;
        }
        this.f5701s.h();
        this.f5708z.h();
        this.B.h();
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
                this.C |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
