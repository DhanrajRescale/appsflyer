package ta;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends al.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f35658b;

    public j(List stockList) {
        Intrinsics.checkNotNullParameter(stockList, "stockList");
        this.f35658b = stockList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f35658b, ((j) obj).f35658b);
    }

    public final int hashCode() {
        return this.f35658b.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(stockList="), this.f35658b, ")");
    }
}
