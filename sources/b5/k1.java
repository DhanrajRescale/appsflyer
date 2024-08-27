package b5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k1 implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3395c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3396d;

    /* renamed from: a, reason: collision with root package name */
    public final j1 f3397a;

    /* renamed from: b, reason: collision with root package name */
    public final lp.o0 f3398b;

    static {
        int i10 = e5.x.f15050a;
        f3395c = Integer.toString(0, 36);
        f3396d = Integer.toString(1, 36);
    }

    public k1(j1 j1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= j1Var.f3376a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3397a = j1Var;
        this.f3398b = lp.o0.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f3397a.equals(k1Var.f3397a) && this.f3398b.equals(k1Var.f3398b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3398b.hashCode() * 31) + this.f3397a.hashCode();
    }
}
