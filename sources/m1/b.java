package m1;

import t0.t;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f27229a;

    /* renamed from: b, reason: collision with root package name */
    public float f27230b;

    /* renamed from: c, reason: collision with root package name */
    public float f27231c;

    /* renamed from: d, reason: collision with root package name */
    public float f27232d;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f27229a = Math.max(f10, this.f27229a);
        this.f27230b = Math.max(f11, this.f27230b);
        this.f27231c = Math.min(f12, this.f27231c);
        this.f27232d = Math.min(f13, this.f27232d);
    }

    public final boolean b() {
        return this.f27229a >= this.f27231c || this.f27230b >= this.f27232d;
    }

    public final String toString() {
        return "MutableRect(" + t.G0(this.f27229a) + ", " + t.G0(this.f27230b) + ", " + t.G0(this.f27231c) + ", " + t.G0(this.f27232d) + ')';
    }
}
