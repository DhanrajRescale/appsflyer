package lp;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class c0 extends e0 {
    public static e0 f(int i10) {
        return i10 < 0 ? e0.f24969b : i10 > 0 ? e0.f24970c : e0.f24968a;
    }

    @Override // lp.e0
    public final e0 a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return f(i12);
    }

    @Override // lp.e0
    public final e0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // lp.e0
    public final e0 c(boolean z10, boolean z11) {
        int i10;
        if (z10 == z11) {
            i10 = 0;
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // lp.e0
    public final e0 d(boolean z10, boolean z11) {
        int i10;
        if (z11 == z10) {
            i10 = 0;
        } else if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // lp.e0
    public final int e() {
        return 0;
    }
}
