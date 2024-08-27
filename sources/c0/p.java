package c0;

import d0.r0;
import kotlin.jvm.internal.Intrinsics;
import t0.x1;

/* loaded from: classes.dex */
public final class p implements d0.u {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f7559a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7560b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7561c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.w f7562d;

    public p(m0 m0Var, j jVar, d dVar, r0 r0Var) {
        this.f7559a = m0Var;
        this.f7560b = jVar;
        this.f7561c = dVar;
        this.f7562d = r0Var;
    }

    @Override // d0.u
    public final Object a(int i10) {
        Object a10 = this.f7562d.a(i10);
        if (a10 == null) {
            return this.f7560b.F(i10);
        }
        return a10;
    }

    @Override // d0.u
    public final int b(Object obj) {
        return this.f7562d.b(obj);
    }

    @Override // d0.u
    public final int c() {
        return this.f7560b.E().f13199b;
    }

    @Override // d0.u
    public final Object d(int i10) {
        d0.f c10 = this.f7560b.f7512b.c(i10);
        return ((d0.q) c10.f13159c).a().invoke(Integer.valueOf(i10 - c10.f13157a));
    }

    @Override // d0.u
    public final void e(int i10, Object obj, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-462424778);
        int i16 = 2;
        if ((i11 & 6) == 0) {
            if (rVar.f(i10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.j(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (rVar.h(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            dp.b.G(obj, i10, this.f7559a.f7546q, b1.d.b(rVar, -824725566, new w.p0(i10, i16, this)), rVar, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new o(this, i10, obj, i11, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return Intrinsics.a(this.f7560b, ((p) obj).f7560b);
    }

    public final int hashCode() {
        return this.f7560b.hashCode();
    }
}
