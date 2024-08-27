package a2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a1 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f29a;

    /* renamed from: b, reason: collision with root package name */
    public int f30b;

    /* renamed from: c, reason: collision with root package name */
    public long f31c = hl.f.k(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public long f32d = b1.f37a;

    /* renamed from: e, reason: collision with root package name */
    public long f33e;

    public a1() {
        int i10 = w2.h.f38792c;
        this.f33e = w2.h.f38791b;
    }

    public int b0() {
        return (int) (this.f31c & 4294967295L);
    }

    public int d0() {
        return (int) (this.f31c >> 32);
    }

    public final void g0() {
        this.f29a = kotlin.ranges.d.f((int) (this.f31c >> 32), w2.a.j(this.f32d), w2.a.h(this.f32d));
        int f10 = kotlin.ranges.d.f((int) (this.f31c & 4294967295L), w2.a.i(this.f32d), w2.a.g(this.f32d));
        this.f30b = f10;
        int i10 = this.f29a;
        long j10 = this.f31c;
        this.f33e = hl.f.j((i10 - ((int) (j10 >> 32))) / 2, (f10 - ((int) (j10 & 4294967295L))) / 2);
    }

    public abstract void j0(long j10, float f10, Function1 function1);

    public final void l0(long j10) {
        if (!w2.j.a(this.f31c, j10)) {
            this.f31c = j10;
            g0();
        }
    }

    public final void q0(long j10) {
        if (!w2.a.b(this.f32d, j10)) {
            this.f32d = j10;
            g0();
        }
    }
}
