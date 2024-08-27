package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ex extends dx {
    public static final h.c H;
    public static final SparseIntArray I;
    public final nw F;
    public long G;

    static {
        h.c cVar = new h.c(18);
        H = cVar;
        cVar.W(0, new int[]{6}, new int[]{R.layout.list_item_group_chat_date_layout}, new String[]{"list_item_group_chat_date_layout"});
        cVar.W(1, new int[]{9, 10}, new int[]{R.layout.list_item_chat_message_interaction_layout, R.layout.list_item_chat_message_footer}, new String[]{"list_item_chat_message_interaction_layout", "list_item_chat_message_footer"});
        cVar.W(2, new int[]{8}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        cVar.W(4, new int[]{7}, new int[]{R.layout.stockgro_list_item_chat_parent_layout}, new String[]{"stockgro_list_item_chat_parent_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.iv_chevron, 11);
        sparseIntArray.put(R.id.layout_chat_message, 12);
        sparseIntArray.put(R.id.layout_thread_info, 13);
        sparseIntArray.put(R.id.label_show_thread, 14);
        sparseIntArray.put(R.id.separator, 15);
        sparseIntArray.put(R.id.label_no_of_replies, 16);
        sparseIntArray.put(R.id.selection_layer, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ex(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ex.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        ChatMessage chatMessage = this.D;
        ChatMessage chatMessage2 = this.C;
        long j11 = 144 & j10;
        if (j11 != 0 && chatMessage != null) {
            str = chatMessage.getSenderName();
        } else {
            str = null;
        }
        long j12 = j10 & 192;
        if (j11 != 0) {
            qu.i0.K(this.f4536s, str);
            this.f4540w.getClass();
            yk.j.v1(this.B, chatMessage);
        }
        if (j12 != 0) {
            this.f4542y.r(chatMessage2);
        }
        this.f4540w.c();
        this.f4542y.c();
        this.f4541x.c();
        this.f4537t.c();
        this.F.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                if (this.f4540w.f() || this.f4542y.f() || this.f4541x.f() || this.f4537t.f() || this.F.f()) {
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
            this.G = 128L;
        }
        this.f4540w.h();
        this.f4542y.h();
        this.f4541x.h();
        this.f4537t.h();
        this.F.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.G |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.G |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }
}
