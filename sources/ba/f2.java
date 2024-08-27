package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class f2 extends e2 {
    public static final h.c A;
    public static final SparseIntArray B;

    /* renamed from: z, reason: collision with root package name */
    public long f4657z;

    static {
        h.c cVar = new h.c(13);
        A = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_social_message_input_with_cta}, new String[]{"layout_social_message_input_with_cta"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.image_holder, 3);
        sparseIntArray.put(R.id.video_player, 4);
        sparseIntArray.put(R.id.document_container, 5);
        sparseIntArray.put(R.id.document_chat_file_thumbnail, 6);
        sparseIntArray.put(R.id.document_name, 7);
        sparseIntArray.put(R.id.header, 8);
        sparseIntArray.put(R.id.label_to, 9);
        sparseIntArray.put(R.id.destination_group_name, 10);
        sparseIntArray.put(R.id.close_window, 11);
        sparseIntArray.put(R.id.footer, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f2(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.f2.A
            android.util.SparseIntArray r2 = ba.f2.B
            r3 = 13
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 11
            r0 = r10[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 10
            r0 = r10[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 6
            r0 = r10[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 5
            r0 = r10[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 7
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 12
            r0 = r10[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0 = 8
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 3
            r0 = r10[r0]
            r7 = r0
            com.assetgro.stockgro.widget.ChatImageView r7 = (com.assetgro.stockgro.widget.ChatImageView) r7
            r0 = 9
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r10[r0]
            r8 = r0
            ba.ev r8 = (ba.ev) r8
            r0 = 4
            r0 = r10[r0]
            r9 = r0
            com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer r9 = (com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.f4657z = r0
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r10[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r1)
            ba.ev r0 = r11.f4563x
            if (r0 == 0) goto L6e
            r0.f27496j = r11
        L6e:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f2.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4657z = 0L;
        }
        this.f4563x.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4657z != 0) {
                    return true;
                }
                if (this.f4563x.f()) {
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
            this.f4657z = 2L;
        }
        this.f4563x.h();
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
            this.f4657z |= 1;
        }
        return true;
    }
}
