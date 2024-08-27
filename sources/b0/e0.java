package b0;

import d2.g2;
import kotlin.jvm.internal.Intrinsics;
import t0.o3;

/* loaded from: classes.dex */
public final class e0 extends g2 implements a2.y, b2.d {

    /* renamed from: c, reason: collision with root package name */
    public final x1 f2857c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f2858d;

    public e0(v1 v1Var) {
        super(d2.s.f13613k);
        this.f2857c = v1Var;
        this.f2858d = t0.t.n0(v1Var, o3.f35116a);
    }

    @Override // a2.y
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.n0 n02;
        int intValue = ((Number) k.f2905s.invoke((x1) this.f2858d.getValue(), o0Var)).intValue();
        if (intValue == 0) {
            n02 = o0Var.n0(0, 0, vt.p0.d(), q.f2976d);
            return n02;
        }
        a2.a1 E = l0Var.E(w2.a.a(j10, 0, 0, intValue, intValue, 3));
        n0 = o0Var.n0(E.f29a, intValue, vt.p0.d(), new v.f(5, E));
        return n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        if (Intrinsics.a(this.f2857c, ((e0) obj).f2857c)) {
            k kVar = k.f2905s;
            if (Intrinsics.a(kVar, kVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // b2.d
    public final void f(b2.h hVar) {
        this.f2858d.setValue(new f0(this.f2857c, (x1) hVar.c(a2.f2821a)));
    }

    public final int hashCode() {
        return k.f2905s.hashCode() + (this.f2857c.hashCode() * 31);
    }
}
