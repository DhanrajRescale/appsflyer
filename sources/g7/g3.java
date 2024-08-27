package g7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g3 extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f16794e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16795f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16796g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16797h;

    public g3(int i10, int i11, int i12, ArrayList inserted) {
        Intrinsics.checkNotNullParameter(inserted, "inserted");
        this.f16794e = i10;
        this.f16795f = inserted;
        this.f16796g = i11;
        this.f16797h = i12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g3) {
            g3 g3Var = (g3) obj;
            if (this.f16794e == g3Var.f16794e && Intrinsics.a(this.f16795f, g3Var.f16795f) && this.f16796g == g3Var.f16796g && this.f16797h == g3Var.f16797h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16797h) + Integer.hashCode(this.f16796g) + this.f16795f.hashCode() + Integer.hashCode(this.f16794e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.Append loaded ");
        List list = this.f16795f;
        sb2.append(list.size());
        sb2.append(" items (\n                    |   startIndex: ");
        sb2.append(this.f16794e);
        sb2.append("\n                    |   first item: ");
        sb2.append(vt.g0.w(list));
        sb2.append("\n                    |   last item: ");
        sb2.append(vt.g0.D(list));
        sb2.append("\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f16796g);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f16797h);
        sb2.append("\n                    |)\n                    |");
        return kotlin.text.l.c(sb2.toString());
    }
}
