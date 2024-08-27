package ba;

import android.util.SparseIntArray;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class qw extends pw {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f5910t;

    /* renamed from: s, reason: collision with root package name */
    public long f5911s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5910t = sparseIntArray;
        sparseIntArray.put(R.id.message_interaction_layout, 1);
        sparseIntArray.put(R.id.action_message_like, 2);
        sparseIntArray.put(R.id.label_total_likes, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 4, null, f5910t);
        this.f5911s = -1L;
        ((MaterialCardView) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5911s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5911s != 0) {
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
            this.f5911s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
