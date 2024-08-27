package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class zd extends yd {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f6843u;

    /* renamed from: t, reason: collision with root package name */
    public long f6844t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6843u = sparseIntArray;
        sparseIntArray.put(R.id.header_header, 1);
        sparseIntArray.put(R.id.feed_post_assets_layout, 2);
        sparseIntArray.put(R.id.video_frame_layout, 3);
        sparseIntArray.put(R.id.video_thumbnail, 4);
        sparseIntArray.put(R.id.ic_youtube_icon, 5);
        sparseIntArray.put(R.id.youtube_player, 6);
        sparseIntArray.put(R.id.fullscreen_youtube, 7);
        sparseIntArray.put(R.id.video_player, 8);
        sparseIntArray.put(R.id.document_list_container, 9);
        sparseIntArray.put(R.id.downloadImageView, 10);
        sparseIntArray.put(R.id.pdfName, 11);
        sparseIntArray.put(R.id.download, 12);
        sparseIntArray.put(R.id.feedImageTypeView, 13);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6844t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6844t != 0) {
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
            this.f6844t = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
