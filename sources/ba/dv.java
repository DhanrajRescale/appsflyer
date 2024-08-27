package ba;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class dv extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f4532t;

    /* renamed from: s, reason: collision with root package name */
    public long f4533s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4532t = sparseIntArray;
        sparseIntArray.put(R.id.input_value, 1);
        sparseIntArray.put(R.id.display_value, 2);
        sparseIntArray.put(R.id.error_text, 3);
        sparseIntArray.put(R.id.text_length_counter, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 5, null, f4532t);
        this.f4533s = -1L;
        ((LinearLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4533s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4533s != 0) {
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
            this.f4533s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
