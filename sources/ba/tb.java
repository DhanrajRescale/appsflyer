package ba;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tb extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f6181t;

    /* renamed from: s, reason: collision with root package name */
    public long f6182s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6181t = sparseIntArray;
        sparseIntArray.put(R.id.icon_document, 1);
        sparseIntArray.put(R.id.filename, 2);
        sparseIntArray.put(R.id.download_button, 3);
        sparseIntArray.put(R.id.remove_file, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 5, null, f6181t);
        this.f6182s = -1L;
        ((ConstraintLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6182s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6182s != 0) {
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
            this.f6182s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
