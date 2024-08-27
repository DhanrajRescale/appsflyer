package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gx extends fx {
    public static final h.c J;
    public static final SparseIntArray K;
    public final nw H;
    public long I;

    static {
        h.c cVar = new h.c(21);
        J = cVar;
        cVar.W(0, new int[]{6}, new int[]{R.layout.list_item_group_chat_date_layout}, new String[]{"list_item_group_chat_date_layout"});
        cVar.W(1, new int[]{9, 10}, new int[]{R.layout.list_item_chat_message_interaction_layout, R.layout.list_item_chat_message_footer}, new String[]{"list_item_chat_message_interaction_layout", "list_item_chat_message_footer"});
        cVar.W(2, new int[]{8}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        cVar.W(4, new int[]{7}, new int[]{R.layout.stockgro_list_item_chat_parent_layout}, new String[]{"stockgro_list_item_chat_parent_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.layout_image_group_chat_profile_parent, 11);
        sparseIntArray.put(R.id.image_group_chat_profile, 12);
        sparseIntArray.put(R.id.stockgro_logo_parent, 13);
        sparseIntArray.put(R.id.iv_chevron, 14);
        sparseIntArray.put(R.id.layout_chat_message, 15);
        sparseIntArray.put(R.id.layout_thread_info, 16);
        sparseIntArray.put(R.id.label_show_thread, 17);
        sparseIntArray.put(R.id.separator, 18);
        sparseIntArray.put(R.id.label_no_of_replies, 19);
        sparseIntArray.put(R.id.selection_layer, 20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gx(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gx.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        ChatMessage chatMessage = this.F;
        ChatMessage chatMessage2 = this.E;
        long j11 = 80 & j10;
        if (j11 != 0 && chatMessage != null) {
            str = chatMessage.getSenderName();
        } else {
            str = null;
        }
        long j12 = j10 & 96;
        if (j11 != 0) {
            qu.i0.K(this.f4756s, str);
            this.f4761x.getClass();
            yk.j.v1(this.D, chatMessage);
        }
        if (j12 != 0) {
            this.A.r(chatMessage2);
        }
        this.f4761x.c();
        this.A.c();
        this.f4763z.c();
        this.f4758u.c();
        this.H.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                if (this.f4761x.f() || this.A.f() || this.f4763z.f() || this.f4758u.f() || this.H.f()) {
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
            this.I = 64L;
        }
        this.f4761x.h();
        this.A.h();
        this.f4763z.h();
        this.f4758u.h();
        this.H.h();
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
                        this.I |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }
}
