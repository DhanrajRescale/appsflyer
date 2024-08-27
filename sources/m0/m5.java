package m0;

import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26492a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26493b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.i f26494c;

    public m5() {
        long j10 = n1.t.f28177i;
        this.f26492a = true;
        this.f26493b = j10;
        this.f26494c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (this.f26492a == m5Var.f26492a && n1.t.d(this.f26493b, m5Var.f26493b) && Intrinsics.a(this.f26494c, m5Var.f26494c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Boolean.hashCode(this.f26492a) * 31;
        int i11 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        int c10 = v.e.c(this.f26493b, hashCode, 31);
        q0.i iVar = this.f26494c;
        if (iVar != null) {
            i10 = iVar.hashCode();
        } else {
            i10 = 0;
        }
        return c10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(enabled=");
        sb2.append(this.f26492a);
        sb2.append(", color=");
        v.e.t(this.f26493b, sb2, ", rippleAlpha=");
        sb2.append(this.f26494c);
        sb2.append(')');
        return sb2.toString();
    }
}
