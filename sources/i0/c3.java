package i0;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c3 implements a2.y {

    /* renamed from: b, reason: collision with root package name */
    public final q2 f18815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18816c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.j0 f18817d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f18818e;

    public c3(q2 q2Var, int i10, p2.j0 j0Var, Function0 function0) {
        this.f18815b = q2Var;
        this.f18816c = i10;
        this.f18817d = j0Var;
        this.f18818e = function0;
    }

    @Override // a2.y
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.a1 E = l0Var.E(w2.a.a(j10, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 7));
        int min = Math.min(E.f30b, w2.a.g(j10));
        n0 = o0Var.n0(E.f29a, min, vt.p0.d(), new d1(o0Var, this, E, min, 1));
        return n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return Intrinsics.a(this.f18815b, c3Var.f18815b) && this.f18816c == c3Var.f18816c && Intrinsics.a(this.f18817d, c3Var.f18817d) && Intrinsics.a(this.f18818e, c3Var.f18818e);
    }

    public final int hashCode() {
        return this.f18818e.hashCode() + ((this.f18817d.hashCode() + da.e.f(this.f18816c, this.f18815b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f18815b + ", cursorOffset=" + this.f18816c + ", transformedText=" + this.f18817d + ", textLayoutResultProvider=" + this.f18818e + ')';
    }
}
