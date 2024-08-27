package e6;

import z5.b0;
import z5.r;
import z5.y;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f15081a;

    /* renamed from: b, reason: collision with root package name */
    public final r f15082b;

    public e(long j10, r rVar) {
        this.f15081a = j10;
        this.f15082b = rVar;
    }

    @Override // z5.r
    public final void c() {
        this.f15082b.c();
    }

    @Override // z5.r
    public final void d(y yVar) {
        this.f15082b.d(new d(this, yVar));
    }

    @Override // z5.r
    public final b0 f(int i10, int i11) {
        return this.f15082b.f(i10, i11);
    }
}
