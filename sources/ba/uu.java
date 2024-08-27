package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class uu extends tu {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.facebook_auth_container, 1);
        sparseIntArray.put(R.id.facebook_header, 2);
        sparseIntArray.put(R.id.facebook_label, 3);
        sparseIntArray.put(R.id.facebook_verified_chip, 4);
        sparseIntArray.put(R.id.facebook_auth_name_input_view, 5);
        sparseIntArray.put(R.id.facebook_mobile_number_input_view, 6);
        sparseIntArray.put(R.id.facebook_email_input_view, 7);
        sparseIntArray.put(R.id.fbButton, 8);
        sparseIntArray.put(R.id.linkedin_auth_container, 9);
        sparseIntArray.put(R.id.linkedin_header, 10);
        sparseIntArray.put(R.id.linkedin_label, 11);
        sparseIntArray.put(R.id.linkedin_verified_chip, 12);
        sparseIntArray.put(R.id.linkedin_auth_name_input_view, 13);
        sparseIntArray.put(R.id.linkedin_mobile_number_input_view, 14);
        sparseIntArray.put(R.id.linkedin_email_input_view, 15);
        sparseIntArray.put(R.id.linkedInButton, 16);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
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
            this.F = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
