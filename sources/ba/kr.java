package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class kr extends jr {
    public static final h.c F;
    public static final SparseIntArray G;
    public long E;

    static {
        h.c cVar = new h.c(17);
        F = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_social_message_input_with_cta}, new String[]{"layout_social_message_input_with_cta"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.llParent, 3);
        sparseIntArray.put(R.id.not_open_for_audience_message_layout, 4);
        sparseIntArray.put(R.id.not_open_for_audience_text, 5);
        sparseIntArray.put(R.id.blocked_user_message_layout, 6);
        sparseIntArray.put(R.id.icon_error, 7);
        sparseIntArray.put(R.id.blocked_user_text, 8);
        sparseIntArray.put(R.id.blocked_text, 9);
        sparseIntArray.put(R.id.rvStickerView, 10);
        sparseIntArray.put(R.id.reported_text, 11);
        sparseIntArray.put(R.id.pinned_messages_layout, 12);
        sparseIntArray.put(R.id.view, 13);
        sparseIntArray.put(R.id.label_no_of_pinned_messages, 14);
        sparseIntArray.put(R.id.recycler_group_chat, 15);
        sparseIntArray.put(R.id.action_scroll_to_bottom, 16);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.E = 0L;
        }
        this.f5175y.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                if (this.f5175y.f()) {
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
            this.E = 2L;
        }
        this.f5175y.h();
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
            this.E |= 1;
        }
        return true;
    }
}
