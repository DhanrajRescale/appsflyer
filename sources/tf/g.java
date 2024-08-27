package tf;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f36017a;

    /* renamed from: b, reason: collision with root package name */
    public final p f36018b;

    public g(p amountError, p phoneNumberError) {
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        Intrinsics.checkNotNullParameter(phoneNumberError, "phoneNumberError");
        this.f36017a = amountError;
        this.f36018b = phoneNumberError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f36017a, gVar.f36017a) && Intrinsics.a(this.f36018b, gVar.f36018b);
    }

    public final int hashCode() {
        return this.f36018b.hashCode() + (this.f36017a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletValidationResults(amountError=" + this.f36017a + ", phoneNumberError=" + this.f36018b + ")";
    }
}
