package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class fv extends ev {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4749x;

    /* renamed from: w, reason: collision with root package name */
    public long f4750w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4749x = sparseIntArray;
        sparseIntArray.put(R.id.messageInputContainer, 1);
        sparseIntArray.put(R.id.edittext_group_chat_message, 2);
        sparseIntArray.put(R.id.button_group_chat_upload, 3);
        sparseIntArray.put(R.id.add_sticker, 4);
        sparseIntArray.put(R.id.button_group_chat_send, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fv(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.fv.f4749x
            r2 = 6
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 4
            r0 = r8[r0]
            r3 = r0
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0 = 5
            r0 = r8[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r0 = 2
            r0 = r8[r0]
            r6 = r0
            com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText r6 = (com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText) r6
            r0 = 1
            r0 = r8[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f4750w = r0
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.fv.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4750w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4750w != 0) {
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
            this.f4750w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
