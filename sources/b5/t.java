package b5;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f3586a;

    public t(SparseBooleanArray sparseBooleanArray) {
        this.f3586a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f3586a;
        yk.j.G0(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i10 = e5.x.f15050a;
        SparseBooleanArray sparseBooleanArray = this.f3586a;
        if (i10 < 24) {
            if (sparseBooleanArray.size() != tVar.f3586a.size()) {
                return false;
            }
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                if (a(i11) != tVar.a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(tVar.f3586a);
    }

    public final int hashCode() {
        int i10 = e5.x.f15050a;
        SparseBooleanArray sparseBooleanArray = this.f3586a;
        if (i10 < 24) {
            int size = sparseBooleanArray.size();
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                size = (size * 31) + a(i11);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
