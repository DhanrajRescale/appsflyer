package l0;

import ut.t;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23717a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23718b;

    public b1(long j10, long j11) {
        this.f23717a = j10;
        this.f23718b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (n1.t.d(this.f23717a, b1Var.f23717a) && n1.t.d(this.f23718b, b1Var.f23718b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f23718b) + (Long.hashCode(this.f23717a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        v.e.t(this.f23717a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) n1.t.j(this.f23718b));
        sb2.append(')');
        return sb2.toString();
    }
}
