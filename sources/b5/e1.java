package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3271e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3272f;

    /* renamed from: g, reason: collision with root package name */
    public static final s0 f3273g;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3275d;

    static {
        int i10 = e5.x.f15050a;
        f3271e = Integer.toString(1, 36);
        f3272f = Integer.toString(2, 36);
        f3273g = new s0(7);
    }

    public e1() {
        this.f3274c = false;
        this.f3275d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f3275d != e1Var.f3275d || this.f3274c != e1Var.f3274c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3274c), Boolean.valueOf(this.f3275d)});
    }

    public e1(boolean z10) {
        this.f3274c = true;
        this.f3275d = z10;
    }
}
