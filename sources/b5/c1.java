package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3243e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3244f;

    /* renamed from: g, reason: collision with root package name */
    public static final s0 f3245g;

    /* renamed from: c, reason: collision with root package name */
    public final int f3246c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3247d;

    static {
        int i10 = e5.x.f15050a;
        f3243e = Integer.toString(1, 36);
        f3244f = Integer.toString(2, 36);
        f3245g = new s0(6);
    }

    public c1(int i10) {
        yk.j.F0(i10 > 0, "maxStars must be a positive integer");
        this.f3246c = i10;
        this.f3247d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (this.f3246c != c1Var.f3246c || this.f3247d != c1Var.f3247d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3246c), Float.valueOf(this.f3247d)});
    }

    public c1(int i10, float f10) {
        yk.j.F0(i10 > 0, "maxStars must be a positive integer");
        yk.j.F0(f10 >= s0.g.f34069a && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f3246c = i10;
        this.f3247d = f10;
    }
}
