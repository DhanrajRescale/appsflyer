package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ax extends zw {
    public static final h.c C;
    public static final SparseIntArray D;
    public long B;

    static {
        h.c cVar = new h.c(10);
        C = cVar;
        cVar.W(0, new int[]{2}, new int[]{R.layout.list_item_group_chat_date_layout}, new String[]{"list_item_group_chat_date_layout"});
        cVar.W(1, new int[]{3}, new int[]{R.layout.list_item_chat_message_reported}, new String[]{"list_item_chat_message_reported"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.layout_image_group_chat_profile_parent, 4);
        sparseIntArray.put(R.id.image_group_chat_profile, 5);
        sparseIntArray.put(R.id.stockgro_logo_parent, 6);
        sparseIntArray.put(R.id.iv_chevron, 7);
        sparseIntArray.put(R.id.message_warning_icon, 8);
        sparseIntArray.put(R.id.selection_layer, 9);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.B;
            this.B = 0L;
        }
        ChatMessage chatMessage = this.f6901z;
        if ((j10 & 12) != 0) {
            this.f6897v.getClass();
            this.f6900y.r(chatMessage);
        }
        this.f6897v.c();
        this.f6900y.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                if (this.f6897v.f() || this.f6900y.f()) {
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
            this.B = 8L;
        }
        this.f6897v.h();
        this.f6900y.h();
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
                this.B |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
