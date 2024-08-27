package sb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final List f34519d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34520e;

    /* renamed from: f, reason: collision with root package name */
    public final List f34521f;

    public n(List feedElements, boolean z10, List list) {
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        this.f34519d = feedElements;
        this.f34520e = z10;
        this.f34521f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f34519d, nVar.f34519d) && this.f34520e == nVar.f34520e && Intrinsics.a(this.f34521f, nVar.f34521f);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f34520e, this.f34519d.hashCode() * 31, 31);
        List list = this.f34521f;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        return "Data(feedElements=" + this.f34519d + ", isRefreshCall=" + this.f34520e + ", filters=" + this.f34521f + ")";
    }
}
