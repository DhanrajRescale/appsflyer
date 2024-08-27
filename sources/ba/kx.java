package ba;

import android.util.SparseIntArray;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class kx extends jx {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f5303t;

    /* renamed from: s, reason: collision with root package name */
    public long f5304s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5303t = sparseIntArray;
        sparseIntArray.put(R.id.sticker_image_view, 1);
        sparseIntArray.put(R.id.image_group_chat_file_thumbnail, 2);
        sparseIntArray.put(R.id.video_tint_layer, 3);
        sparseIntArray.put(R.id.play_video_button, 4);
        sparseIntArray.put(R.id.msg_progress_bar, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 6, null, f5303t);
        this.f5304s = -1L;
        ((MaterialCardView) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5304s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5304s != 0) {
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
            this.f5304s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
