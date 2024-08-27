package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class n2 extends m2 {
    public static final h.c H;
    public static final SparseIntArray I;
    public long G;

    static {
        h.c cVar = new h.c(18);
        H = cVar;
        cVar.W(1, new int[]{3}, new int[]{R.layout.cell_chat_media_text_consolidated_view}, new String[]{"cell_chat_media_text_consolidated_view"});
        cVar.W(2, new int[]{4}, new int[]{R.layout.layout_social_message_input_with_cta}, new String[]{"layout_social_message_input_with_cta"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.thread_nested_scroll_view, 6);
        sparseIntArray.put(R.id.parent_message_sender_info, 7);
        sparseIntArray.put(R.id.parent_message_sender_image, 8);
        sparseIntArray.put(R.id.parent_message_sender_name, 9);
        sparseIntArray.put(R.id.parent_message_chat_time, 10);
        sparseIntArray.put(R.id.parent_message, 11);
        sparseIntArray.put(R.id.iv_chevron, 12);
        sparseIntArray.put(R.id.parent_message_no_of_replies, 13);
        sparseIntArray.put(R.id.view, 14);
        sparseIntArray.put(R.id.message_thread_replies_recycler_view, 15);
        sparseIntArray.put(R.id.not_open_for_audience_message_layout, 16);
        sparseIntArray.put(R.id.not_open_for_audience_text, 17);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.G = 0L;
        }
        this.f5424s.c();
        this.f5429x.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                if (this.f5424s.f() || this.f5429x.f()) {
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
            this.G = 4L;
        }
        this.f5424s.h();
        this.f5429x.h();
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
