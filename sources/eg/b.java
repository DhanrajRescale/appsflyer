package eg;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15424a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15425b;

    public b(Boolean bool, a aVar) {
        this.f15424a = bool;
        this.f15425b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f15424a, bVar.f15424a) && this.f15425b == bVar.f15425b;
    }

    public final int hashCode() {
        Object obj = this.f15424a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        a aVar = this.f15425b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "TransactionListResultData(data=" + this.f15424a + ", transactionListErrorType=" + this.f15425b + ")";
    }
}
