package zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f42485a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42486b;

    public h(ArrayList headers, ArrayList content) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f42485a = headers;
        this.f42486b = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.a(this.f42485a, hVar.f42485a) && Intrinsics.a(this.f42486b, hVar.f42486b);
    }

    public final int hashCode() {
        return this.f42486b.hashCode() + (this.f42485a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketTabularData(headers=" + this.f42485a + ", content=" + this.f42486b + ")";
    }
}
