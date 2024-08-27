package i5;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r5.w f19618a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19619b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19620c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19621d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19622e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19623f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19624g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19625h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19626i;

    public q0(r5.w wVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        yk.j.E0(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        yk.j.E0(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        yk.j.E0(z16);
        this.f19618a = wVar;
        this.f19619b = j10;
        this.f19620c = j11;
        this.f19621d = j12;
        this.f19622e = j13;
        this.f19623f = z10;
        this.f19624g = z11;
        this.f19625h = z12;
        this.f19626i = z13;
    }

    public final q0 a(long j10) {
        if (j10 == this.f19620c) {
            return this;
        }
        return new q0(this.f19618a, this.f19619b, j10, this.f19621d, this.f19622e, this.f19623f, this.f19624g, this.f19625h, this.f19626i);
    }

    public final q0 b(long j10) {
        if (j10 == this.f19619b) {
            return this;
        }
        return new q0(this.f19618a, j10, this.f19620c, this.f19621d, this.f19622e, this.f19623f, this.f19624g, this.f19625h, this.f19626i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f19619b == q0Var.f19619b && this.f19620c == q0Var.f19620c && this.f19621d == q0Var.f19621d && this.f19622e == q0Var.f19622e && this.f19623f == q0Var.f19623f && this.f19624g == q0Var.f19624g && this.f19625h == q0Var.f19625h && this.f19626i == q0Var.f19626i && e5.x.a(this.f19618a, q0Var.f19618a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f19618a.hashCode() + 527) * 31) + ((int) this.f19619b)) * 31) + ((int) this.f19620c)) * 31) + ((int) this.f19621d)) * 31) + ((int) this.f19622e)) * 31) + (this.f19623f ? 1 : 0)) * 31) + (this.f19624g ? 1 : 0)) * 31) + (this.f19625h ? 1 : 0)) * 31) + (this.f19626i ? 1 : 0);
    }
}
