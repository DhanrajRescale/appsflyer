package ba;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class k5 extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f5204t;

    /* renamed from: s, reason: collision with root package name */
    public long f5205s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5204t = sparseIntArray;
        sparseIntArray.put(R.id.exit_group_label, 1);
        sparseIntArray.put(R.id.exit_league_message, 2);
        sparseIntArray.put(R.id.cancel, 3);
        sparseIntArray.put(R.id.exit, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 5, null, f5204t);
        this.f5205s = -1L;
        ((RelativeLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5205s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5205s != 0) {
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
            this.f5205s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
