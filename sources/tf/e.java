package tf;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p f36014a;

    public e(p amountError) {
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        this.f36014a = amountError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f36014a, ((e) obj).f36014a);
    }

    public final int hashCode() {
        return this.f36014a.hashCode();
    }

    public final String toString() {
        return "PaymentOrderValidationResults(amountError=" + this.f36014a + ")";
    }
}
