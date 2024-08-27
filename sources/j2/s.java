package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f20755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20756b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20757c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.p f20758d;

    /* renamed from: e, reason: collision with root package name */
    public final v f20759e;

    /* renamed from: f, reason: collision with root package name */
    public final u2.g f20760f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20761g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20762h;

    /* renamed from: i, reason: collision with root package name */
    public final u2.q f20763i;

    public s(int i10, int i11, long j10, u2.p pVar, v vVar, u2.g gVar, int i12, int i13, u2.q qVar) {
        this.f20755a = i10;
        this.f20756b = i11;
        this.f20757c = j10;
        this.f20758d = pVar;
        this.f20759e = vVar;
        this.f20760f = gVar;
        this.f20761g = i12;
        this.f20762h = i13;
        this.f20763i = qVar;
        if (!w2.m.a(j10, w2.m.f38804c) && w2.m.c(j10) < s0.g.f34069a) {
            throw new IllegalStateException(("lineHeight can't be negative (" + w2.m.c(j10) + ')').toString());
        }
    }

    public final s a(s sVar) {
        if (sVar == null) {
            return this;
        }
        return t.a(this, sVar.f20755a, sVar.f20756b, sVar.f20757c, sVar.f20758d, sVar.f20759e, sVar.f20760f, sVar.f20761g, sVar.f20762h, sVar.f20763i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (u2.i.b(this.f20755a, sVar.f20755a) && u2.k.a(this.f20756b, sVar.f20756b) && w2.m.a(this.f20757c, sVar.f20757c) && Intrinsics.a(this.f20758d, sVar.f20758d) && Intrinsics.a(this.f20759e, sVar.f20759e) && Intrinsics.a(this.f20760f, sVar.f20760f) && this.f20761g == sVar.f20761g && u2.d.a(this.f20762h, sVar.f20762h) && Intrinsics.a(this.f20763i, sVar.f20763i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f10 = da.e.f(this.f20756b, Integer.hashCode(this.f20755a) * 31, 31);
        w2.n[] nVarArr = w2.m.f38803b;
        int c10 = v.e.c(this.f20757c, f10, 31);
        int i13 = 0;
        u2.p pVar = this.f20758d;
        if (pVar != null) {
            i10 = pVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (c10 + i10) * 31;
        v vVar = this.f20759e;
        if (vVar != null) {
            i11 = vVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        u2.g gVar = this.f20760f;
        if (gVar != null) {
            i12 = gVar.hashCode();
        } else {
            i12 = 0;
        }
        int f11 = da.e.f(this.f20762h, da.e.f(this.f20761g, (i15 + i12) * 31, 31), 31);
        u2.q qVar = this.f20763i;
        if (qVar != null) {
            i13 = qVar.hashCode();
        }
        return f11 + i13;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) u2.i.c(this.f20755a)) + ", textDirection=" + ((Object) u2.k.b(this.f20756b)) + ", lineHeight=" + ((Object) w2.m.d(this.f20757c)) + ", textIndent=" + this.f20758d + ", platformStyle=" + this.f20759e + ", lineHeightStyle=" + this.f20760f + ", lineBreak=" + ((Object) u2.e.a(this.f20761g)) + ", hyphens=" + ((Object) u2.d.b(this.f20762h)) + ", textMotion=" + this.f20763i + ')';
    }
}
