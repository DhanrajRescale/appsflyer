package i0;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 implements a2.y {

    /* renamed from: b, reason: collision with root package name */
    public final q2 f18847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18848c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.j0 f18849d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f18850e;

    public e1(q2 q2Var, int i10, p2.j0 j0Var, Function0 function0) {
        this.f18847b = q2Var;
        this.f18848c = i10;
        this.f18849d = j0Var;
        this.f18850e = function0;
    }

    @Override // a2.y
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        long a10;
        a2.n0 n0;
        if (l0Var.D(w2.a.g(j10)) < w2.a.h(j10)) {
            a10 = j10;
        } else {
            a10 = w2.a.a(j10, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, 13);
        }
        a2.a1 E = l0Var.E(a10);
        int min = Math.min(E.f29a, w2.a.h(j10));
        n0 = o0Var.n0(min, E.f30b, vt.p0.d(), new d1(o0Var, this, E, min, 0));
        return n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.a(this.f18847b, e1Var.f18847b) && this.f18848c == e1Var.f18848c && Intrinsics.a(this.f18849d, e1Var.f18849d) && Intrinsics.a(this.f18850e, e1Var.f18850e);
    }

    public final int hashCode() {
        return this.f18850e.hashCode() + ((this.f18849d.hashCode() + da.e.f(this.f18848c, this.f18847b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f18847b + ", cursorOffset=" + this.f18848c + ", transformedText=" + this.f18849d + ", textLayoutResultProvider=" + this.f18850e + ')';
    }
}
