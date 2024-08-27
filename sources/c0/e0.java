package c0;

import t0.l1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f7488a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f7489b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7490c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7491d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.b0 f7492e;

    public e0(int i10, int i11) {
        this.f7488a = al.d.D0(i10);
        this.f7489b = al.d.D0(i11);
        this.f7492e = new d0.b0(i10);
    }

    public final void a(int i10, int i11) {
        if (i10 >= s0.g.f34069a) {
            this.f7488a.j(i10);
            this.f7492e.b(i10);
            this.f7489b.j(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }
}
