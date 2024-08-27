package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class uw extends tw {
    public static final h.c D;
    public static final SparseIntArray E;
    public final nw B;
    public long C;

    static {
        h.c cVar = new h.c(15);
        D = cVar;
        cVar.W(0, new int[]{4}, new int[]{R.layout.list_item_group_chat_date_layout}, new String[]{"list_item_group_chat_date_layout"});
        cVar.W(1, new int[]{6, 7}, new int[]{R.layout.list_item_chat_message_interaction_layout, R.layout.list_item_chat_message_footer}, new String[]{"list_item_chat_message_interaction_layout", "list_item_chat_message_footer"});
        cVar.W(2, new int[]{5}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.message_container, 8);
        sparseIntArray.put(R.id.layout_image_group_chat_profile, 9);
        sparseIntArray.put(R.id.image_group_chat_profile, 10);
        sparseIntArray.put(R.id.stockgro_logo, 11);
        sparseIntArray.put(R.id.iv_chevron, 12);
        sparseIntArray.put(R.id.group_chat_sender_name, 13);
        sparseIntArray.put(R.id.selection_layer, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uw(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.uw.D
            android.util.SparseIntArray r2 = ba.uw.E
            r3 = 15
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 5
            r0 = r10[r0]
            r3 = r0
            ba.c8 r3 = (ba.c8) r3
            r0 = 13
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r10[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 12
            r0 = r10[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2
            r0 = r10[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 4
            r0 = r10[r0]
            r6 = r0
            ba.bx r6 = (ba.bx) r6
            r0 = 9
            r0 = r10[r0]
            r7 = r0
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r0 = 8
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 14
            r0 = r10[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 11
            r0 = r10[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 3
            r0 = r10[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 6
            r0 = r10[r0]
            r9 = r0
            ba.pw r9 = (ba.pw) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.C = r0
            ba.c8 r0 = r11.f6240s
            if (r0 == 0) goto L64
            r0.f27496j = r11
        L64:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.f6242u
            r1 = 0
            r0.setTag(r1)
            ba.bx r0 = r11.f6243v
            if (r0 == 0) goto L70
            r0.f27496j = r11
        L70:
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 1
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 7
            r0 = r10[r0]
            ba.nw r0 = (ba.nw) r0
            r11.B = r0
            if (r0 == 0) goto L8b
            r0.f27496j = r11
        L8b:
            android.widget.TextView r0 = r11.f6245x
            r0.setTag(r1)
            ba.pw r0 = r11.f6246y
            if (r0 == 0) goto L96
            r0.f27496j = r11
        L96:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.uw.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        ChatMessage chatMessage = this.f6247z;
        if ((j10 & 24) != 0) {
            this.f6243v.getClass();
            yk.j.v1(this.f6245x, chatMessage);
        }
        this.f6243v.c();
        this.f6240s.c();
        this.f6246y.c();
        this.B.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f6243v.f() || this.f6240s.f() || this.f6246y.f() || this.B.f()) {
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
            this.C = 16L;
        }
        this.f6243v.h();
        this.f6240s.h();
        this.f6246y.h();
        this.B.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.C |= 4;
                }
                return true;
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
