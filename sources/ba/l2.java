package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class l2 extends k2 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5312u;

    /* renamed from: t, reason: collision with root package name */
    public long f5313t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5312u = sparseIntArray;
        sparseIntArray.put(R.id.toolbar_header_layout, 1);
        sparseIntArray.put(R.id.toolbar_layout, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.group_display_picture, 4);
        sparseIntArray.put(R.id.group_name, 5);
        sparseIntArray.put(R.id.options_menu, 6);
        sparseIntArray.put(R.id.parent_message_sender_info, 7);
        sparseIntArray.put(R.id.parent_message_sender_image, 8);
        sparseIntArray.put(R.id.parent_message_sender_name, 9);
        sparseIntArray.put(R.id.parent_message_chat_time, 10);
        sparseIntArray.put(R.id.parent_message, 11);
        sparseIntArray.put(R.id.parent_message_text, 12);
        sparseIntArray.put(R.id.media_layout, 13);
        sparseIntArray.put(R.id.parent_message_image, 14);
        sparseIntArray.put(R.id.play_video_button, 15);
        sparseIntArray.put(R.id.parent_message_no_of_replies, 16);
        sparseIntArray.put(R.id.view, 17);
        sparseIntArray.put(R.id.message_thread_replies_recycler_view, 18);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5313t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5313t != 0) {
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
            this.f5313t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
