package tf;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f36015a;

    /* renamed from: b, reason: collision with root package name */
    public final p f36016b;

    public f(p amountError, p vpaError) {
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        Intrinsics.checkNotNullParameter(vpaError, "vpaError");
        this.f36015a = amountError;
        this.f36016b = vpaError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f36015a, fVar.f36015a) && Intrinsics.a(this.f36016b, fVar.f36016b);
    }

    public final int hashCode() {
        return this.f36016b.hashCode() + (this.f36015a.hashCode() * 31);
    }

    public final String toString() {
        return "UPIValidationResults(amountError=" + this.f36015a + ", vpaError=" + this.f36016b + ")";
    }
}
