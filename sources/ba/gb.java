package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gb extends fb {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f4790y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4791z;

    /* renamed from: x, reason: collision with root package name */
    public long f4792x;

    static {
        h.c cVar = new h.c(9);
        f4790y = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4791z = sparseIntArray;
        sparseIntArray.put(R.id.layout_image_group_chat_profile, 3);
        sparseIntArray.put(R.id.image_group_chat_profile, 4);
        sparseIntArray.put(R.id.stockgro_logo, 5);
        sparseIntArray.put(R.id.card_group_chat_message, 6);
        sparseIntArray.put(R.id.group_chat_sender_name, 7);
        sparseIntArray.put(R.id.text_group_chat_time, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gb(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = ba.gb.f4790y
            android.util.SparseIntArray r2 = ba.gb.f4791z
            r3 = 9
            java.lang.Object[] r7 = m4.m.j(r9, r3, r0, r2)
            r0 = 6
            r0 = r7[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 2
            r0 = r7[r0]
            r3 = r0
            ba.c8 r3 = (ba.c8) r3
            r0 = 7
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 4
            r0 = r7[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 3
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 0
            r0 = r7[r0]
            r5 = r0
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0 = 5
            r0 = r7[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 8
            r0 = r7[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f4792x = r0
            ba.c8 r0 = r8.f4695s
            if (r0 == 0) goto L47
            r0.f27496j = r8
        L47:
            r0 = 1
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            r0.setTag(r1)
            android.widget.RelativeLayout r0 = r8.f4697u
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gb.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4792x = 0L;
        }
        this.f4695s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4792x != 0) {
                    return true;
                }
                if (this.f4695s.f()) {
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
            this.f4792x = 2L;
        }
        this.f4695s.h();
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
            this.f4792x |= 1;
        }
        return true;
    }
}
