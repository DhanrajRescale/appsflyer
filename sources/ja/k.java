package ja;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends pp.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f21276a;

    public k(List optionList) {
        Intrinsics.checkNotNullParameter(optionList, "optionList");
        this.f21276a = optionList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f21276a, ((k) obj).f21276a);
    }

    public final int hashCode() {
        return this.f21276a.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(optionList="), this.f21276a, ")");
    }
}
