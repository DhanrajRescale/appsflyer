package p2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final o f30595f = new o(0, 1, 1, false, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30596a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30598c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30599d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30600e;

    public o(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f30596a = z10;
        this.f30597b = i10;
        this.f30598c = z11;
        this.f30599d = i11;
        this.f30600e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f30596a != oVar.f30596a || !pp.b.v(this.f30597b, oVar.f30597b) || this.f30598c != oVar.f30598c || !qu.i0.q(this.f30599d, oVar.f30599d) || !n.a(this.f30600e, oVar.f30600e)) {
            return false;
        }
        oVar.getClass();
        if (Intrinsics.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return da.e.f(this.f30600e, da.e.f(this.f30599d, v.e.d(this.f30598c, da.e.f(this.f30597b, Boolean.hashCode(this.f30596a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f30596a + ", capitalization=" + ((Object) pp.b.D(this.f30597b)) + ", autoCorrect=" + this.f30598c + ", keyboardType=" + ((Object) qu.i0.N(this.f30599d)) + ", imeAction=" + ((Object) n.b(this.f30600e)) + ", platformImeOptions=null)";
    }
}
