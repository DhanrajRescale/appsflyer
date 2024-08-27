package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ww extends vw {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6587x;

    /* renamed from: w, reason: collision with root package name */
    public long f6588w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6587x = sparseIntArray;
        sparseIntArray.put(R.id.text_group_chat_message, 3);
        sparseIntArray.put(R.id.layout_image_group_chat_profile, 4);
        sparseIntArray.put(R.id.image_group_chat_profile, 5);
        sparseIntArray.put(R.id.stockgro_logo, 6);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.f6588w;
            this.f6588w = 0L;
        }
        ChatMessage chatMessage = this.f6487v;
        long j11 = j10 & 3;
        if (j11 != 0 && chatMessage != null) {
            str = chatMessage.getSenderName();
        } else {
            str = null;
        }
        if (j11 != 0) {
            qu.i0.K(this.f6485t, str);
            yk.j.v1(this.f6486u, chatMessage);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6588w != 0) {
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
            this.f6588w = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.vw
    public final void r(ChatMessage chatMessage) {
        this.f6487v = chatMessage;
        synchronized (this) {
            this.f6588w |= 1;
        }
        a(14);
        m();
    }
}
