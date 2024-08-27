package ba;

import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class y9 extends x9 {
    public static final SparseIntArray T;
    public final ImageView Q;
    public final TextView R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.background_view, 21);
        sparseIntArray.put(R.id.player_min_max, 22);
        sparseIntArray.put(R.id.fillingFast, 23);
        sparseIntArray.put(R.id.fillingFastText, 24);
        sparseIntArray.put(R.id.tvSeatsLeft, 25);
        sparseIntArray.put(R.id.constraintLayout2, 26);
        sparseIntArray.put(R.id.prize_text, 27);
        sparseIntArray.put(R.id.linearLayoutCompat2, 28);
        sparseIntArray.put(R.id.special_gift_chance_seperator, 29);
        sparseIntArray.put(R.id.linearLayout4, 30);
        sparseIntArray.put(R.id.entry_text, 31);
        sparseIntArray.put(R.id.entry_amount_wrapper, 32);
        sparseIntArray.put(R.id.free_image_view, 33);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y9(android.view.View r28) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y9.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y9.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.S != 0) {
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
            this.S = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
