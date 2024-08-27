package e0;

import d0.r0;
import kotlin.jvm.internal.Intrinsics;
import t0.x1;
import w.p0;

/* loaded from: classes.dex */
public final class w implements d0.u {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14795a;

    /* renamed from: b, reason: collision with root package name */
    public final bl.j f14796b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.w f14797c;

    public w(j0 j0Var, u uVar, r0 r0Var) {
        this.f14795a = j0Var;
        this.f14796b = uVar;
        this.f14797c = r0Var;
    }

    @Override // d0.u
    public final Object a(int i10) {
        Object a10 = this.f14797c.a(i10);
        if (a10 == null) {
            return this.f14796b.F(i10);
        }
        return a10;
    }

    @Override // d0.u
    public final int b(Object obj) {
        return this.f14797c.b(obj);
    }

    @Override // d0.u
    public final int c() {
        return this.f14796b.E().f13199b;
    }

    @Override // d0.u
    public final void e(int i10, Object obj, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1201380429);
        int i16 = 4;
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
            dp.b.G(obj, i10, this.f14795a.A, b1.d.b(rVar, 1142237095, new p0(i10, i16, this)), rVar, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c0.o(this, i10, obj, i11, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return Intrinsics.a(this.f14796b, ((w) obj).f14796b);
    }

    public final int hashCode() {
        return this.f14796b.hashCode();
    }
}
