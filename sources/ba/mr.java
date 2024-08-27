package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class mr extends lr {
    public static final SparseIntArray F;
    public final TextView C;
    public final TextView D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.group_display_image_layout, 10);
        sparseIntArray.put(R.id.edit_group_display_image, 11);
        sparseIntArray.put(R.id.edit_group_name, 12);
        sparseIntArray.put(R.id.league_description_layout, 13);
        sparseIntArray.put(R.id.league_meta_data_description, 14);
        sparseIntArray.put(R.id.reward_pool_layout, 15);
        sparseIntArray.put(R.id.league_duration_layout, 16);
        sparseIntArray.put(R.id.entry_close_layout, 17);
        sparseIntArray.put(R.id.player_min_max, 18);
        sparseIntArray.put(R.id.group_expiry_layout, 19);
        sparseIntArray.put(R.id.ic_auto_delete_time, 20);
        sparseIntArray.put(R.id.groupAutoDeleteMessage, 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mr(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.mr.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.mr.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 1;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 2;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 4;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 8;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 16;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 32;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 64;
                }
                return true;
            case 7:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 128;
                }
                return true;
            case 8:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 256;
                }
                return true;
            default:
                return false;
        }
    }
}
