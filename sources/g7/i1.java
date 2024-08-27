package g7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i1 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f16828a;

    public i1(vt.i0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f16828a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            return Intrinsics.a(this.f16828a, ((i1) obj).f16828a) && Intrinsics.a(null, null) && Intrinsics.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16828a.hashCode() * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageEvent.StaticList with ");
        List list = this.f16828a;
        sb2.append(list.size());
        sb2.append(" items (\n                    |   first item: ");
        sb2.append(vt.g0.w(list));
        sb2.append("\n                    |   last item: ");
        sb2.append(vt.g0.D(list));
        sb2.append("\n                    |   sourceLoadStates: null\n                    ");
        return kotlin.text.l.c(sb2.toString() + "|)");
    }
}
