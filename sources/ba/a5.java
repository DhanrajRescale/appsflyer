package ba;

import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class a5 extends z4 {
    public static final h.c N;
    public static final SparseIntArray O;
    public final NestedScrollView C;
    public final ImageView D;
    public final qt E;
    public final TextView F;
    public final ImageView G;
    public final qt H;
    public final TextView I;
    public final ImageView J;
    public final qt K;
    public final TextView L;
    public long M;

    static {
        h.c cVar = new h.c(24);
        N = cVar;
        cVar.W(2, new int[]{16}, new int[]{R.layout.layout_payment_error_child_view}, new String[]{"layout_payment_error_child_view"});
        cVar.W(7, new int[]{17}, new int[]{R.layout.layout_payment_error_child_view}, new String[]{"layout_payment_error_child_view"});
        cVar.W(12, new int[]{18}, new int[]{R.layout.layout_payment_error_child_view}, new String[]{"layout_payment_error_child_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 19);
        sparseIntArray.put(R.id.payment_methods, 20);
        sparseIntArray.put(R.id.transfer_label, 21);
        sparseIntArray.put(R.id.ic_image, 22);
        sparseIntArray.put(R.id.message, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a5(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a5.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a5.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                if (this.H.f() || this.K.f() || this.E.f()) {
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
            this.M = 8L;
        }
        this.H.h();
        this.K.h();
        this.E.h();
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
                this.M |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.H.p(tVar);
        this.K.p(tVar);
        this.E.p(tVar);
    }
}
