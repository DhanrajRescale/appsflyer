package g7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j3 extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final List f16850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16851f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16852g;

    public j3(int i10, int i11, ArrayList inserted) {
        Intrinsics.checkNotNullParameter(inserted, "inserted");
        this.f16850e = inserted;
        this.f16851f = i10;
        this.f16852g = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            if (Intrinsics.a(this.f16850e, j3Var.f16850e) && this.f16851f == j3Var.f16851f && this.f16852g == j3Var.f16852g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16852g) + Integer.hashCode(this.f16851f) + this.f16850e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.Prepend loaded ");
        List list = this.f16850e;
        sb2.append(list.size());
        sb2.append(" items (\n                    |   first item: ");
        sb2.append(vt.g0.w(list));
        sb2.append("\n                    |   last item: ");
        sb2.append(vt.g0.D(list));
        sb2.append("\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f16851f);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f16852g);
        sb2.append("\n                    |)\n                    |");
        return kotlin.text.l.c(sb2.toString());
    }
}
