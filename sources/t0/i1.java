package t0;

/* loaded from: classes.dex */
public final class i1 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f35053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35054b;

    /* renamed from: c, reason: collision with root package name */
    public int f35055c;

    public i1(f fVar, int i10) {
        this.f35053a = fVar;
        this.f35054b = i10;
    }

    @Override // t0.f
    public final void a(int i10, Object obj) {
        int i11;
        if (this.f35055c == 0) {
            i11 = this.f35054b;
        } else {
            i11 = 0;
        }
        this.f35053a.a(i10 + i11, obj);
    }

    @Override // t0.f
    public final void b(Object obj) {
        this.f35055c++;
        this.f35053a.b(obj);
    }

    @Override // t0.f
    public final void c(int i10, int i11, int i12) {
        int i13;
        if (this.f35055c == 0) {
            i13 = this.f35054b;
        } else {
            i13 = 0;
        }
        this.f35053a.c(i10 + i13, i11 + i13, i12);
    }

    @Override // t0.f
    public final void clear() {
        t.F("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // t0.f
    public final void d(int i10, int i11) {
        int i12;
        if (this.f35055c == 0) {
            i12 = this.f35054b;
        } else {
            i12 = 0;
        }
        this.f35053a.d(i10 + i12, i11);
    }

    @Override // t0.f
    public final void e() {
        boolean z10;
        int i10 = this.f35055c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f35055c = i10 - 1;
            this.f35053a.e();
        } else {
            t.F("OffsetApplier up called with no corresponding down");
            throw null;
        }
    }

    @Override // t0.f
    public final void f(int i10, Object obj) {
        int i11;
        if (this.f35055c == 0) {
            i11 = this.f35054b;
        } else {
            i11 = 0;
        }
        this.f35053a.f(i10 + i11, obj);
    }

    @Override // t0.f
    public final Object h() {
        return this.f35053a.h();
    }
}
