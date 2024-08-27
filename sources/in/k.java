package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    public final List f20425a;

    public k(ArrayList arrayList) {
        this.f20425a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return this.f20425a.equals(((k) ((q) obj)).f20425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20425a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20425a + UrlTreeKt.componentParamSuffix;
    }
}
