package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class kc extends jc {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5215u;

    /* renamed from: t, reason: collision with root package name */
    public long f5216t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5215u = sparseIntArray;
        sparseIntArray.put(R.id.image_group_channel_list_cover, 1);
        sparseIntArray.put(R.id.subscription_package_name, 2);
        sparseIntArray.put(R.id.text_group_channel_list_topic, 3);
        sparseIntArray.put(R.id.container_group_channel_list_message, 4);
        sparseIntArray.put(R.id.text_group_channel_list_message, 5);
        sparseIntArray.put(R.id.layout_end_view, 6);
        sparseIntArray.put(R.id.iv_pin, 7);
        sparseIntArray.put(R.id.iv_mute, 8);
        sparseIntArray.put(R.id.text_group_channel_list_unread_count, 9);
        sparseIntArray.put(R.id.text_group_channel_list_date, 10);
        sparseIntArray.put(R.id.iv_separator, 11);
        sparseIntArray.put(R.id.click_area, 12);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5216t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5216t != 0) {
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
            this.f5216t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
