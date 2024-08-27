package r5;

/* loaded from: classes.dex */
public final class e0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f33143a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33144b;

    public e0(v0 v0Var, long j10) {
        this.f33143a = v0Var;
        this.f33144b = j10;
    }

    @Override // r5.v0
    public final void c() {
        this.f33143a.c();
    }

    @Override // r5.v0
    public final boolean d() {
        return this.f33143a.d();
    }

    @Override // r5.v0
    public final int e(long j10) {
        return this.f33143a.e(j10 - this.f33144b);
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        int f10 = this.f33143a.f(eVar, fVar, i10);
        if (f10 == -4) {
            fVar.f18004f = Math.max(0L, fVar.f18004f + this.f33144b);
        }
        return f10;
    }
}
