package b5;

import java.util.Locale;

/* loaded from: classes.dex */
public final class u0 implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final u0 f3616d = new u0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3617a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3619c;

    static {
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public u0(float f10, float f11) {
        boolean z10;
        if (f10 > s0.g.f34069a) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        yk.j.E0(f11 > s0.g.f34069a);
        this.f3617a = f10;
        this.f3618b = f11;
        this.f3619c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f3617a == u0Var.f3617a && this.f3618b == u0Var.f3618b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3618b) + ((Float.floatToRawIntBits(this.f3617a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3617a), Float.valueOf(this.f3618b)};
        int i10 = e5.x.f15050a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
