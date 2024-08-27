package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class zr extends yr {
    public static final SparseIntArray M;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.league_title, 1);
        sparseIntArray.put(R.id.second_image_container, 2);
        sparseIntArray.put(R.id.second_position, 3);
        sparseIntArray.put(R.id.second_image, 4);
        sparseIntArray.put(R.id.second_name, 5);
        sparseIntArray.put(R.id.second_reward_icon, 6);
        sparseIntArray.put(R.id.second_amount, 7);
        sparseIntArray.put(R.id.first_image_container, 8);
        sparseIntArray.put(R.id.first_position, 9);
        sparseIntArray.put(R.id.first_image, 10);
        sparseIntArray.put(R.id.first_name, 11);
        sparseIntArray.put(R.id.first_reward_icon, 12);
        sparseIntArray.put(R.id.first_amount, 13);
        sparseIntArray.put(R.id.third_image_container, 14);
        sparseIntArray.put(R.id.third_position, 15);
        sparseIntArray.put(R.id.third_image, 16);
        sparseIntArray.put(R.id.third_name, 17);
        sparseIntArray.put(R.id.third_reward_icon, 18);
        sparseIntArray.put(R.id.third_amount, 19);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.L != 0) {
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
            this.L = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
