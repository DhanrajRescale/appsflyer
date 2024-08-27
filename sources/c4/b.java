package c4;

import android.util.LongSparseArray;
import vt.m0;

/* loaded from: classes.dex */
public final class b extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f7941b;

    public b(LongSparseArray longSparseArray) {
        this.f7941b = longSparseArray;
    }

    @Override // vt.m0
    public final long b() {
        int i10 = this.f7940a;
        this.f7940a = i10 + 1;
        return this.f7941b.keyAt(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7940a < this.f7941b.size()) {
            return true;
        }
        return false;
    }
}
