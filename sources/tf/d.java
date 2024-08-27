package tf;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p f36011a;

    /* renamed from: b, reason: collision with root package name */
    public final p f36012b;

    /* renamed from: c, reason: collision with root package name */
    public final p f36013c;

    public d(p amountError, p accountNumberError, p bankIFSCError) {
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        Intrinsics.checkNotNullParameter(accountNumberError, "accountNumberError");
        Intrinsics.checkNotNullParameter(bankIFSCError, "bankIFSCError");
        this.f36011a = amountError;
        this.f36012b = accountNumberError;
        this.f36013c = bankIFSCError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f36011a, dVar.f36011a) && Intrinsics.a(this.f36012b, dVar.f36012b) && Intrinsics.a(this.f36013c, dVar.f36013c);
    }

    public final int hashCode() {
        return this.f36013c.hashCode() + ((this.f36012b.hashCode() + (this.f36011a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BankValidationResults(amountError=" + this.f36011a + ", accountNumberError=" + this.f36012b + ", bankIFSCError=" + this.f36013c + ")";
    }
}
