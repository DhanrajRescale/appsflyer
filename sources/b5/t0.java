package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 extends b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3587d;

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f3588e;

    /* renamed from: c, reason: collision with root package name */
    public final float f3589c;

    static {
        int i10 = e5.x.f15050a;
        f3587d = Integer.toString(1, 36);
        f3588e = new s0(0);
    }

    public t0() {
        this.f3589c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        if (this.f3589c != ((t0) obj).f3589c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3589c)});
    }

    public t0(float f10) {
        yk.j.F0(f10 >= s0.g.f34069a && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f3589c = f10;
    }
}
