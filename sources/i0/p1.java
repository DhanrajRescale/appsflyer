package i0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f, reason: collision with root package name */
    public static final p1 f19102f = new p1(0, 0, 63);

    /* renamed from: a, reason: collision with root package name */
    public final int f19103a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19104b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19105c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19106d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19107e;

    public p1(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f19103a = i10;
        this.f19104b = z10;
        this.f19105c = i11;
        this.f19106d = i12;
        this.f19107e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (!pp.b.v(this.f19103a, p1Var.f19103a) || this.f19104b != p1Var.f19104b || !qu.i0.q(this.f19105c, p1Var.f19105c) || !p2.n.a(this.f19106d, p1Var.f19106d)) {
            return false;
        }
        p1Var.getClass();
        if (Intrinsics.a(null, null) && this.f19107e == p1Var.f19107e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19107e) + da.e.f(this.f19106d, da.e.f(this.f19105c, v.e.d(this.f19104b, Integer.hashCode(this.f19103a) * 31, 31), 31), 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyboardOptions(capitalization=");
        sb2.append((Object) pp.b.D(this.f19103a));
        sb2.append(", autoCorrect=");
        sb2.append(this.f19104b);
        sb2.append(", keyboardType=");
        sb2.append((Object) qu.i0.N(this.f19105c));
        sb2.append(", imeAction=");
        sb2.append((Object) p2.n.b(this.f19106d));
        sb2.append(", platformImeOptions=null, showKeyboardOnFocus=");
        return v.e.k(sb2, this.f19107e, ')');
    }

    public p1(int i10, int i11, int i12) {
        this(0, (i12 & 4) != 0 ? 1 : i10, (i12 & 8) != 0 ? 1 : i11, (i12 & 2) != 0, (i12 & 32) != 0);
    }
}
