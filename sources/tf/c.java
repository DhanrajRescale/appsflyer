package tf;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p f36010a;

    public c(p amountError) {
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        this.f36010a = amountError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f36010a, ((c) obj).f36010a);
    }

    public final int hashCode() {
        return this.f36010a.hashCode();
    }

    public final String toString() {
        return "AmountValidationResult(amountError=" + this.f36010a + ")";
    }
}
