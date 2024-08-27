package b5;

/* loaded from: classes.dex */
public final class e0 implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f3259f = new e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: g, reason: collision with root package name */
    public static final String f3260g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3261h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3262i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3263j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3264k;

    /* renamed from: l, reason: collision with root package name */
    public static final i5.w f3265l;

    /* renamed from: a, reason: collision with root package name */
    public final long f3266a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3267b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3268c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3269d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3270e;

    static {
        int i10 = e5.x.f15050a;
        f3260g = Integer.toString(0, 36);
        f3261h = Integer.toString(1, 36);
        f3262i = Integer.toString(2, 36);
        f3263j = Integer.toString(3, 36);
        f3264k = Integer.toString(4, 36);
        f3265l = new i5.w(24);
    }

    public e0(long j10, long j11, long j12, float f10, float f11) {
        this.f3266a = j10;
        this.f3267b = j11;
        this.f3268c = j12;
        this.f3269d = f10;
        this.f3270e = f11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b5.d0] */
    public final d0 a() {
        ?? obj = new Object();
        obj.f3248a = this.f3266a;
        obj.f3249b = this.f3267b;
        obj.f3250c = this.f3268c;
        obj.f3251d = this.f3269d;
        obj.f3252e = this.f3270e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f3266a == e0Var.f3266a && this.f3267b == e0Var.f3267b && this.f3268c == e0Var.f3268c && this.f3269d == e0Var.f3269d && this.f3270e == e0Var.f3270e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f3266a;
        long j11 = this.f3267b;
        int i11 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f3268c;
        int i12 = (i11 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f3269d;
        int i13 = 0;
        if (f10 != s0.g.f34069a) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        float f11 = this.f3270e;
        if (f11 != s0.g.f34069a) {
            i13 = Float.floatToIntBits(f11);
        }
        return i14 + i13;
    }
}
