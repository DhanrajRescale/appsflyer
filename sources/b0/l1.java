package b0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l1 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2919a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2920b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2921c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2922d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2923e;

    public l1(int i10, h hVar, j jVar, float f10, e eVar) {
        this.f2919a = i10;
        this.f2920b = hVar;
        this.f2921c = jVar;
        this.f2922d = f10;
        this.f2923e = eVar;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        a2.n0 n0;
        m1 m1Var = new m1(this.f2919a, this.f2920b, this.f2921c, this.f2922d, this.f2923e, list, new a2.a1[list.size()]);
        k1 b10 = m1Var.b(o0Var, j10, 0, list.size());
        int i10 = this.f2919a;
        int i11 = b10.f2910a;
        int i12 = b10.f2911b;
        if (i10 == 1) {
            i12 = i11;
            i11 = i12;
        }
        n0 = o0Var.n0(i11, i12, vt.p0.d(), new c.g(8, m1Var, b10, o0Var));
        return n0;
    }

    @Override // a2.m0
    public final int b(c2.i1 i1Var, List list, int i10) {
        n0 n0Var;
        if (this.f2919a == 1) {
            n0Var = n0.f2945e;
        } else {
            n0Var = n0.f2949i;
        }
        return ((Number) n0Var.b(list, Integer.valueOf(i10), Integer.valueOf(i1Var.m0(this.f2922d)))).intValue();
    }

    @Override // a2.m0
    public final int c(c2.i1 i1Var, List list, int i10) {
        n0 n0Var;
        if (this.f2919a == 1) {
            n0Var = n0.f2948h;
        } else {
            n0Var = n0.f2952l;
        }
        return ((Number) n0Var.b(list, Integer.valueOf(i10), Integer.valueOf(i1Var.m0(this.f2922d)))).intValue();
    }

    @Override // a2.m0
    public final int d(c2.i1 i1Var, List list, int i10) {
        n0 n0Var;
        if (this.f2919a == 1) {
            n0Var = n0.f2946f;
        } else {
            n0Var = n0.f2950j;
        }
        return ((Number) n0Var.b(list, Integer.valueOf(i10), Integer.valueOf(i1Var.m0(this.f2922d)))).intValue();
    }

    @Override // a2.m0
    public final int e(c2.i1 i1Var, List list, int i10) {
        n0 n0Var;
        if (this.f2919a == 1) {
            n0Var = n0.f2947g;
        } else {
            n0Var = n0.f2951k;
        }
        return ((Number) n0Var.b(list, Integer.valueOf(i10), Integer.valueOf(i1Var.m0(this.f2922d)))).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f2919a == l1Var.f2919a && Intrinsics.a(this.f2920b, l1Var.f2920b) && Intrinsics.a(this.f2921c, l1Var.f2921c) && w2.e.a(this.f2922d, l1Var.f2922d) && Intrinsics.a(this.f2923e, l1Var.f2923e);
    }

    public final int hashCode() {
        int hashCode;
        int e10 = w.k.e(this.f2919a) * 31;
        int i10 = 0;
        h hVar = this.f2920b;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int i11 = (e10 + hashCode) * 31;
        j jVar = this.f2921c;
        if (jVar != null) {
            i10 = jVar.hashCode();
        }
        return this.f2923e.hashCode() + ((w.k.e(1) + v.e.a(this.f2922d, (i11 + i10) * 31, 31)) * 31);
    }

    public final String toString() {
        return "RowColumnMeasurePolicy(orientation=" + a3.a.B(this.f2919a) + ", horizontalArrangement=" + this.f2920b + ", verticalArrangement=" + this.f2921c + ", arrangementSpacing=" + ((Object) w2.e.b(this.f2922d)) + ", crossAxisSize=" + a3.a.C(1) + ", crossAxisAlignment=" + this.f2923e + ')';
    }
}
