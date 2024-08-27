package ra;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yk.g;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final List f33554b;

    public d(ArrayList insightList) {
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        this.f33554b = insightList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.a(this.f33554b, ((d) obj).f33554b);
    }

    public final int hashCode() {
        return this.f33554b.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(insightList="), this.f33554b, ")");
    }
}
